package def.dom;

import jsweet.util.StringTypes;
import jsweet.util.StringTypes.*;

@jsweet.lang.Extends({GlobalEventHandlers.class,ElementTraversal.class,NodeSelector.class,ChildNode.class})
public class Element extends Node {
    public DOMTokenList classList;
    public double clientHeight;
    public double clientLeft;
    public double clientTop;
    public double clientWidth;
    public double msContentZoomFactor;
    public java.lang.String msRegionOverflow;
    public java.util.function.Function<AriaRequestEvent,java.lang.Object> onariarequest;
    public java.util.function.Function<CommandEvent,java.lang.Object> oncommand;
    public java.util.function.Function<PointerEvent,java.lang.Object> ongotpointercapture;
    public java.util.function.Function<PointerEvent,java.lang.Object> onlostpointercapture;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgesturechange;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgesturedoubletap;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgestureend;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgesturehold;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgesturestart;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsgesturetap;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmsgotpointercapture;
    public java.util.function.Function<MSGestureEvent,java.lang.Object> onmsinertiastart;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmslostpointercapture;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointercancel;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerdown;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerenter;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerleave;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointermove;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerout;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerover;
    public java.util.function.Function<MSPointerEvent,java.lang.Object> onmspointerup;
    public java.util.function.Function<TouchEvent,java.lang.Object> ontouchcancel;
    public java.util.function.Function<TouchEvent,java.lang.Object> ontouchend;
    public java.util.function.Function<TouchEvent,java.lang.Object> ontouchmove;
    public java.util.function.Function<TouchEvent,java.lang.Object> ontouchstart;
    public java.util.function.Function<Event,java.lang.Object> onwebkitfullscreenchange;
    public java.util.function.Function<Event,java.lang.Object> onwebkitfullscreenerror;
    public double scrollHeight;
    public double scrollLeft;
    public double scrollTop;
    public double scrollWidth;
    public java.lang.String tagName;
    native public java.lang.String getAttribute(java.lang.String name);
    native public java.lang.String getAttributeNS(java.lang.String namespaceURI, java.lang.String localName);
    native public Attr getAttributeNode(java.lang.String name);
    native public Attr getAttributeNodeNS(java.lang.String namespaceURI, java.lang.String localName);
    native public ClientRect getBoundingClientRect();
    native public ClientRectList getClientRects();
    native public NodeListOf<HTMLAnchorElement> getElementsByTagName(jsweet.util.StringTypes.a name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.abbr name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.acronym name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.address name);
    native public NodeListOf<HTMLAppletElement> getElementsByTagName(jsweet.util.StringTypes.applet name);
    native public NodeListOf<HTMLAreaElement> getElementsByTagName(jsweet.util.StringTypes.area name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.article name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.aside name);
    native public NodeListOf<HTMLAudioElement> getElementsByTagName(jsweet.util.StringTypes.audio name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.b name);
    native public NodeListOf<HTMLBaseElement> getElementsByTagName(jsweet.util.StringTypes.base name);
    native public NodeListOf<HTMLBaseFontElement> getElementsByTagName(jsweet.util.StringTypes.basefont name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.bdo name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.big name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.blockquote name);
    native public NodeListOf<HTMLBodyElement> getElementsByTagName(jsweet.util.StringTypes.body name);
    native public NodeListOf<HTMLBRElement> getElementsByTagName(jsweet.util.StringTypes.br name);
    native public NodeListOf<HTMLButtonElement> getElementsByTagName(jsweet.util.StringTypes.button name);
    native public NodeListOf<HTMLCanvasElement> getElementsByTagName(jsweet.util.StringTypes.canvas name);
    native public NodeListOf<HTMLTableCaptionElement> getElementsByTagName(jsweet.util.StringTypes.caption name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.center name);
    native public NodeListOf<SVGCircleElement> getElementsByTagName(jsweet.util.StringTypes.circle name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.cite name);
    native public NodeListOf<SVGClipPathElement> getElementsByTagName(jsweet.util.StringTypes.clippath name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.code name);
    native public NodeListOf<HTMLTableColElement> getElementsByTagName(jsweet.util.StringTypes.col name);
    native public NodeListOf<HTMLTableColElement> getElementsByTagName(jsweet.util.StringTypes.colgroup name);
    native public NodeListOf<HTMLDataListElement> getElementsByTagName(jsweet.util.StringTypes.datalist name);
    native public NodeListOf<HTMLDDElement> getElementsByTagName(jsweet.util.StringTypes.dd name);
    native public NodeListOf<SVGDefsElement> getElementsByTagName(jsweet.util.StringTypes.defs name);
    native public NodeListOf<HTMLModElement> getElementsByTagName(jsweet.util.StringTypes.del name);
    native public NodeListOf<SVGDescElement> getElementsByTagName(jsweet.util.StringTypes.desc name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.dfn name);
    native public NodeListOf<HTMLDirectoryElement> getElementsByTagName(jsweet.util.StringTypes.dir name);
    native public NodeListOf<HTMLDivElement> getElementsByTagName(jsweet.util.StringTypes.div name);
    native public NodeListOf<HTMLDListElement> getElementsByTagName(jsweet.util.StringTypes.dl name);
    native public NodeListOf<HTMLDTElement> getElementsByTagName(jsweet.util.StringTypes.dt name);
    native public NodeListOf<SVGEllipseElement> getElementsByTagName(jsweet.util.StringTypes.ellipse name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.em name);
    native public NodeListOf<HTMLEmbedElement> getElementsByTagName(jsweet.util.StringTypes.embed name);
    native public NodeListOf<SVGFEBlendElement> getElementsByTagName(jsweet.util.StringTypes.feblend name);
    native public NodeListOf<SVGFEColorMatrixElement> getElementsByTagName(jsweet.util.StringTypes.fecolormatrix name);
    native public NodeListOf<SVGFEComponentTransferElement> getElementsByTagName(jsweet.util.StringTypes.fecomponenttransfer name);
    native public NodeListOf<SVGFECompositeElement> getElementsByTagName(jsweet.util.StringTypes.fecomposite name);
    native public NodeListOf<SVGFEConvolveMatrixElement> getElementsByTagName(jsweet.util.StringTypes.feconvolvematrix name);
    native public NodeListOf<SVGFEDiffuseLightingElement> getElementsByTagName(jsweet.util.StringTypes.fediffuselighting name);
    native public NodeListOf<SVGFEDisplacementMapElement> getElementsByTagName(jsweet.util.StringTypes.fedisplacementmap name);
    native public NodeListOf<SVGFEDistantLightElement> getElementsByTagName(jsweet.util.StringTypes.fedistantlight name);
    native public NodeListOf<SVGFEFloodElement> getElementsByTagName(jsweet.util.StringTypes.feflood name);
    native public NodeListOf<SVGFEFuncAElement> getElementsByTagName(jsweet.util.StringTypes.fefunca name);
    native public NodeListOf<SVGFEFuncBElement> getElementsByTagName(jsweet.util.StringTypes.fefuncb name);
    native public NodeListOf<SVGFEFuncGElement> getElementsByTagName(jsweet.util.StringTypes.fefuncg name);
    native public NodeListOf<SVGFEFuncRElement> getElementsByTagName(jsweet.util.StringTypes.fefuncr name);
    native public NodeListOf<SVGFEGaussianBlurElement> getElementsByTagName(jsweet.util.StringTypes.fegaussianblur name);
    native public NodeListOf<SVGFEImageElement> getElementsByTagName(jsweet.util.StringTypes.feimage name);
    native public NodeListOf<SVGFEMergeElement> getElementsByTagName(jsweet.util.StringTypes.femerge name);
    native public NodeListOf<SVGFEMergeNodeElement> getElementsByTagName(jsweet.util.StringTypes.femergenode name);
    native public NodeListOf<SVGFEMorphologyElement> getElementsByTagName(jsweet.util.StringTypes.femorphology name);
    native public NodeListOf<SVGFEOffsetElement> getElementsByTagName(jsweet.util.StringTypes.feoffset name);
    native public NodeListOf<SVGFEPointLightElement> getElementsByTagName(jsweet.util.StringTypes.fepointlight name);
    native public NodeListOf<SVGFESpecularLightingElement> getElementsByTagName(jsweet.util.StringTypes.fespecularlighting name);
    native public NodeListOf<SVGFESpotLightElement> getElementsByTagName(jsweet.util.StringTypes.fespotlight name);
    native public NodeListOf<SVGFETileElement> getElementsByTagName(jsweet.util.StringTypes.fetile name);
    native public NodeListOf<SVGFETurbulenceElement> getElementsByTagName(jsweet.util.StringTypes.feturbulence name);
    native public NodeListOf<HTMLFieldSetElement> getElementsByTagName(jsweet.util.StringTypes.fieldset name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.figcaption name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.figure name);
    native public NodeListOf<SVGFilterElement> getElementsByTagName(jsweet.util.StringTypes.filter name);
    native public NodeListOf<HTMLFontElement> getElementsByTagName(jsweet.util.StringTypes.font name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.footer name);
    native public NodeListOf<SVGForeignObjectElement> getElementsByTagName(jsweet.util.StringTypes.foreignobject name);
    native public NodeListOf<HTMLFormElement> getElementsByTagName(jsweet.util.StringTypes.form name);
    native public NodeListOf<HTMLFrameElement> getElementsByTagName(jsweet.util.StringTypes.frame name);
    native public NodeListOf<HTMLFrameSetElement> getElementsByTagName(jsweet.util.StringTypes.frameset name);
    native public NodeListOf<SVGGElement> getElementsByTagName(jsweet.util.StringTypes.g name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h1 name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h2 name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h3 name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h4 name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h5 name);
    native public NodeListOf<HTMLHeadingElement> getElementsByTagName(jsweet.util.StringTypes.h6 name);
    native public NodeListOf<HTMLHeadElement> getElementsByTagName(jsweet.util.StringTypes.head name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.header name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.hgroup name);
    native public NodeListOf<HTMLHRElement> getElementsByTagName(jsweet.util.StringTypes.hr name);
    native public NodeListOf<HTMLHtmlElement> getElementsByTagName(jsweet.util.StringTypes.html name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.i name);
    native public NodeListOf<HTMLIFrameElement> getElementsByTagName(jsweet.util.StringTypes.iframe name);
    native public NodeListOf<SVGImageElement> getElementsByTagName(jsweet.util.StringTypes.image name);
    native public NodeListOf<HTMLImageElement> getElementsByTagName(jsweet.util.StringTypes.img name);
    native public NodeListOf<HTMLInputElement> getElementsByTagName(jsweet.util.StringTypes.input name);
    native public NodeListOf<HTMLModElement> getElementsByTagName(jsweet.util.StringTypes.ins name);
    native public NodeListOf<HTMLIsIndexElement> getElementsByTagName(jsweet.util.StringTypes.isindex name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.kbd name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.keygen name);
    native public NodeListOf<HTMLLabelElement> getElementsByTagName(jsweet.util.StringTypes.label name);
    native public NodeListOf<HTMLLegendElement> getElementsByTagName(jsweet.util.StringTypes.legend name);
    native public NodeListOf<HTMLLIElement> getElementsByTagName(jsweet.util.StringTypes.li name);
    native public NodeListOf<SVGLineElement> getElementsByTagName(jsweet.util.StringTypes.line name);
    native public NodeListOf<SVGLinearGradientElement> getElementsByTagName(jsweet.util.StringTypes.lineargradient name);
    native public NodeListOf<HTMLLinkElement> getElementsByTagName(jsweet.util.StringTypes.link name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.listing name);
    native public NodeListOf<HTMLMapElement> getElementsByTagName(jsweet.util.StringTypes.map name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.mark name);
    native public NodeListOf<SVGMarkerElement> getElementsByTagName(jsweet.util.StringTypes.marker name);
    native public NodeListOf<HTMLMarqueeElement> getElementsByTagName(jsweet.util.StringTypes.marquee name);
    native public NodeListOf<SVGMaskElement> getElementsByTagName(jsweet.util.StringTypes.mask name);
    native public NodeListOf<HTMLMenuElement> getElementsByTagName(jsweet.util.StringTypes.menu name);
    native public NodeListOf<HTMLMetaElement> getElementsByTagName(jsweet.util.StringTypes.meta name);
    native public NodeListOf<SVGMetadataElement> getElementsByTagName(jsweet.util.StringTypes.metadata name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.nav name);
    native public NodeListOf<HTMLNextIdElement> getElementsByTagName(jsweet.util.StringTypes.nextid name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.nobr name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.noframes name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.noscript name);
    native public NodeListOf<HTMLObjectElement> getElementsByTagName(jsweet.util.StringTypes.object name);
    native public NodeListOf<HTMLOListElement> getElementsByTagName(jsweet.util.StringTypes.ol name);
    native public NodeListOf<HTMLOptGroupElement> getElementsByTagName(jsweet.util.StringTypes.optgroup name);
    native public NodeListOf<HTMLOptionElement> getElementsByTagName(jsweet.util.StringTypes.option name);
    native public NodeListOf<HTMLParagraphElement> getElementsByTagName(jsweet.util.StringTypes.p name);
    native public NodeListOf<HTMLParamElement> getElementsByTagName(jsweet.util.StringTypes.param name);
    native public NodeListOf<SVGPathElement> getElementsByTagName(jsweet.util.StringTypes.path name);
    native public NodeListOf<SVGPatternElement> getElementsByTagName(jsweet.util.StringTypes.pattern name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.plaintext name);
    native public NodeListOf<SVGPolygonElement> getElementsByTagName(jsweet.util.StringTypes.polygon name);
    native public NodeListOf<SVGPolylineElement> getElementsByTagName(jsweet.util.StringTypes.polyline name);
    native public NodeListOf<HTMLPreElement> getElementsByTagName(jsweet.util.StringTypes.pre name);
    native public NodeListOf<HTMLProgressElement> getElementsByTagName(jsweet.util.StringTypes.progress name);
    native public NodeListOf<HTMLQuoteElement> getElementsByTagName(jsweet.util.StringTypes.q name);
    native public NodeListOf<SVGRadialGradientElement> getElementsByTagName(jsweet.util.StringTypes.radialgradient name);
    native public NodeListOf<SVGRectElement> getElementsByTagName(jsweet.util.StringTypes.rect name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.rt name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.ruby name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.s name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.samp name);
    native public NodeListOf<HTMLScriptElement> getElementsByTagName(jsweet.util.StringTypes.script name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.section name);
    native public NodeListOf<HTMLSelectElement> getElementsByTagName(jsweet.util.StringTypes.select name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.small name);
    native public NodeListOf<HTMLSourceElement> getElementsByTagName(jsweet.util.StringTypes.source name);
    native public NodeListOf<HTMLSpanElement> getElementsByTagName(jsweet.util.StringTypes.span name);
    native public NodeListOf<SVGStopElement> getElementsByTagName(jsweet.util.StringTypes.stop name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.strike name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.strong name);
    native public NodeListOf<HTMLStyleElement> getElementsByTagName(jsweet.util.StringTypes.style name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.sub name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.sup name);
    native public NodeListOf<SVGSVGElement> getElementsByTagName(jsweet.util.StringTypes.svg name);
    native public NodeListOf<SVGSwitchElement> getElementsByTagName(jsweet.util.StringTypes.Switch name);
    native public NodeListOf<SVGSymbolElement> getElementsByTagName(jsweet.util.StringTypes.symbol name);
    native public NodeListOf<HTMLTableElement> getElementsByTagName(jsweet.util.StringTypes.table name);
    native public NodeListOf<HTMLTableSectionElement> getElementsByTagName(jsweet.util.StringTypes.tbody name);
    native public NodeListOf<HTMLTableDataCellElement> getElementsByTagName(jsweet.util.StringTypes.td name);
    native public NodeListOf<SVGTextElement> getElementsByTagName(jsweet.util.StringTypes.text name);
    native public NodeListOf<SVGTextPathElement> getElementsByTagName(jsweet.util.StringTypes.textpath name);
    native public NodeListOf<HTMLTextAreaElement> getElementsByTagName(jsweet.util.StringTypes.textarea name);
    native public NodeListOf<HTMLTableSectionElement> getElementsByTagName(jsweet.util.StringTypes.tfoot name);
    native public NodeListOf<HTMLTableHeaderCellElement> getElementsByTagName(jsweet.util.StringTypes.th name);
    native public NodeListOf<HTMLTableSectionElement> getElementsByTagName(jsweet.util.StringTypes.thead name);
    native public NodeListOf<HTMLTitleElement> getElementsByTagName(jsweet.util.StringTypes.title name);
    native public NodeListOf<HTMLTableRowElement> getElementsByTagName(jsweet.util.StringTypes.tr name);
    native public NodeListOf<HTMLTrackElement> getElementsByTagName(jsweet.util.StringTypes.track name);
    native public NodeListOf<SVGTSpanElement> getElementsByTagName(jsweet.util.StringTypes.tspan name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.tt name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.u name);
    native public NodeListOf<HTMLUListElement> getElementsByTagName(jsweet.util.StringTypes.ul name);
    native public NodeListOf<SVGUseElement> getElementsByTagName(jsweet.util.StringTypes.use name);
    native public NodeListOf<HTMLPhraseElement> getElementsByTagName(jsweet.util.StringTypes.Var name);
    native public NodeListOf<HTMLVideoElement> getElementsByTagName(jsweet.util.StringTypes.video name);
    native public NodeListOf<SVGViewElement> getElementsByTagName(jsweet.util.StringTypes.view name);
    native public NodeListOf<HTMLElement> getElementsByTagName(jsweet.util.StringTypes.wbr name);
    native public NodeListOf<MSHTMLWebViewElement> getElementsByTagName(jsweet.util.StringTypes.x_ms_webview name);
    native public NodeListOf<HTMLBlockElement> getElementsByTagName(jsweet.util.StringTypes.xmp name);
    native public NodeList getElementsByTagName(java.lang.String name);
    native public NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName);
    native public java.lang.Boolean hasAttribute(java.lang.String name);
    native public java.lang.Boolean hasAttributeNS(java.lang.String namespaceURI, java.lang.String localName);
    native public MSRangeCollection msGetRegionContent();
    native public ClientRect msGetUntransformedBounds();
    native public java.lang.Boolean msMatchesSelector(java.lang.String selectors);
    native public void msReleasePointerCapture(double pointerId);
    native public void msSetPointerCapture(double pointerId);
    native public void msZoomTo(MsZoomToOptions args);
    native public void releasePointerCapture(double pointerId);
    native public void removeAttribute(java.lang.String name);
    native public void removeAttributeNS(java.lang.String namespaceURI, java.lang.String localName);
    native public Attr removeAttributeNode(Attr oldAttr);
    native public void requestFullscreen();
    native public void requestPointerLock();
    native public void setAttribute(java.lang.String name, java.lang.String value);
    native public void setAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName, java.lang.String value);
    native public Attr setAttributeNode(Attr newAttr);
    native public Attr setAttributeNodeNS(Attr newAttr);
    native public void setPointerCapture(double pointerId);
    native public java.lang.Boolean webkitMatchesSelector(java.lang.String selectors);
    native public void webkitRequestFullScreen();
    native public void webkitRequestFullscreen();
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    public static Element prototype;
    public Element(){}
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointercancel;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerdown;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerenter;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerleave;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointermove;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerout;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerover;
    public java.util.function.Function<PointerEvent,java.lang.Object> onpointerup;
    public java.util.function.Function<WheelEvent,java.lang.Object> onwheel;
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public double childElementCount;
    public Element firstElementChild;
    public Element lastElementChild;
    public Element nextElementSibling;
    public Element previousElementSibling;
    native public Element querySelector(java.lang.String selectors);
    native public NodeList querySelectorAll(java.lang.String selectors);
    native public void remove();
    native public java.lang.String getAttribute();
    native public void removeAttribute();
    native public void setAttribute(java.lang.String name);
    native public void setAttribute();
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener);
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}

