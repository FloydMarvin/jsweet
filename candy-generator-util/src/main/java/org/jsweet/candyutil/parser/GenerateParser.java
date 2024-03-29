/*
 * jsweet-candy-generator-util
 * Copyright 2023 Christian Kohlschütter
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsweet.candyutil.parser;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Generate parsers and remove the date from the generated files so we can add them to source
 * control.
 * 
 * @author Christian Kohlschütter
 */
public class GenerateParser {
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      throw new IllegalArgumentException("Syntax: <path/to/src/main/java>");
    }
    File sourceDir = new File(args[0]);

    generateJavaCupParser(sourceDir);
    generateTSDefAPILexer(sourceDir);
  }

  private static void generateJavaCupParser(File sourceDir) throws Exception {
    Path parserOutFile = Path.of("TypescriptDefParser.java");
    Path symOutFile = Path.of("sym.java");
    if (Files.exists(parserOutFile)) {
      System.err.println("WARNING: Overwriting " + parserOutFile);
      Files.delete(parserOutFile);
    }
    if (Files.exists(symOutFile)) {
      System.err.println("WARNING: Overwriting " + symOutFile);
      Files.delete(symOutFile);
    }
    File parserPackageDir = new File(sourceDir, "org/jsweet/input/typescriptdef/parser/");

    java_cup.Main.main(new String[] {
        "-expect", "0", //
        "-package", "org.jsweet.input.typescriptdef.parser", //
        "-parser", "TypescriptDefParser", //
        new File(parserPackageDir, "typescriptdef.cup").toString(), //
        //
    });

    if (!Files.exists(parserOutFile)) {
      throw new IllegalStateException("Expected output file not created: " + parserOutFile);
    }
    if (!Files.exists(symOutFile)) {
      throw new IllegalStateException("Expected output file not created: " + symOutFile);
    }

    // Remove date from the line after "The following code was generated ..."
    Function<String, String> transformer = new PreviousLineAwareTransformer((p, c) -> {
      if (c.startsWith("// ") && p.startsWith("// The following code was generated by ")) {
        return null;
      } else if (c.startsWith("  * @version ") && p.startsWith("/** CUP ")) {
        return null;
      }
      return c;
    });
    moveFileAndModify(parserOutFile.toFile(), new File(parserPackageDir, parserOutFile.getName(
        parserOutFile.getNameCount() - 1).toString()), transformer);
    moveFileAndModify(symOutFile.toFile(), new File(parserPackageDir, symOutFile.getName(
        parserOutFile.getNameCount() - 1).toString()), transformer);
  }

  private static void generateTSDefAPILexer(File sourceDir) throws IOException {
    File typescriptDefLex = new File(sourceDir,
        "org/jsweet/input/typescriptdef/parser/typescriptdef.lex");

    File typescriptDefScanner = new File(sourceDir,
        "org/jsweet/input/typescriptdef/parser/TypescriptDefScanner.java");

    File typescriptDefScannerBackup = new File(typescriptDefScanner.toString() + "~");

    jflex.Main.main(new String[] {typescriptDefLex.toString()});
    Files.deleteIfExists(typescriptDefScannerBackup.toPath());

    // Remove date from "The following code was generated ..."
    // We cannot modify in place, so let's temporarily move it around.
    Files.move(typescriptDefScanner.toPath(), typescriptDefScannerBackup.toPath());
    moveFileAndModify(typescriptDefScannerBackup, typescriptDefScanner, (l) -> {
      if (l.startsWith("/* The following code was generated ")) {
        int i = l.indexOf(" on ");
        if (i != -1) {
          l = l.substring(0, i) + " */";
        }
        return l;
      } else if (l.startsWith(" * on ") && l.endsWith(" from the specification file")) {
        return null;
      } else {
        return l;
      }
    });
  }

  private static void moveFileAndModify(File from, File to,
      Function<String, String> lineTransformer) throws IOException {
    try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(from),
        StandardCharsets.UTF_8));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(to),
            StandardCharsets.UTF_8))) {
      String l;
      while ((l = in.readLine()) != null) {
        if ((l = lineTransformer.apply(l)) != null) {
          out.println(l);
        }
      }
    }
    Files.delete(from.toPath());
    if (lineTransformer instanceof Closeable) {
      ((Closeable) lineTransformer).close();
    }
  }

  private static final class PreviousLineAwareTransformer implements Function<String, String>,
      Closeable {
    private final BiFunction<String, String, String> transformer;
    private String previous = null;

    public PreviousLineAwareTransformer(BiFunction<String, String, String> transformer) {
      this.transformer = transformer;
    }

    @Override
    public final String apply(String t) {
      String current = transformer.apply(previous, t);
      this.previous = current;
      return current;
    }

    @Override
    public void close() throws IOException {
      this.previous = null;
    }
  }
}
