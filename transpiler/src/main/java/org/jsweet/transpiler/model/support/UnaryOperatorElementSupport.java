/* 
 * JSweet transpiler - http://www.jsweet.org
 * Copyright (C) 2015 CINCHEO SAS <renaud.pawlak@cincheo.fr>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.jsweet.transpiler.model.support;

import org.jsweet.transpiler.JSweetContext;
import org.jsweet.transpiler.model.ExtendedElement;
import org.jsweet.transpiler.model.UnaryOperatorElement;

import standalone.com.sun.source.tree.UnaryTree;

/**
 * See {@link UnaryOperatorElement}.
 * 
 * @author Renaud Pawlak
 * @author Louis Grignon
 */
public class UnaryOperatorElementSupport extends ExtendedElementSupport<UnaryTree> implements UnaryOperatorElement {

	public UnaryOperatorElementSupport(UnaryTree tree) {
		super(tree);
	}

	@Override
	public String getOperator() {
		return JSweetContext.current.get().util.toOperator(getTree().getKind());
	}

	@Override
	public ExtendedElement getArgument() {
		return createElement( tree.getExpression());
	}

}
