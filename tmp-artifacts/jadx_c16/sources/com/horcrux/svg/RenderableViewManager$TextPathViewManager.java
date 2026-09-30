package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$TextPathViewManager extends RenderableViewManager$TextViewManagerAbstract<TextPathView> implements RNSVGTextPathManagerInterface<TextPathView> {
    public static final String REACT_CLASS = "RNSVGTextPath";

    public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, @Nullable String str) {
        super.setAlignmentBaseline((RenderableViewManager$TextPathViewManager) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "baselineShift")
    public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
        super.setBaselineShift((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "clipPath")
    public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setClipPath((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "clipRule")
    public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
        super/*com.horcrux.svg.VirtualViewManager*/.setClipRule((VirtualView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "color", onWarmupCompleted = "Color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        super.setColor((RenderableView) view, num);
    }

    @ReactProp(IAuthTabCallbackStub = "display")
    public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setDisplay((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "dx")
    public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
        super.setDx((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "dy")
    public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
        super.setDy((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fill")
    public /* bridge */ /* synthetic */ void setFill(View view, @Nullable Dynamic dynamic) {
        super.setFill((RenderableView) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fillOpacity", onNavigationEvent = 1.0f)
    public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
        super.setFillOpacity((RenderableView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "fillRule", onExtraCallback = 1)
    public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
        super.setFillRule((RenderableView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "filter")
    public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
        super.setFilter((RenderableView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "font")
    public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
        super.setFont((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fontSize")
    public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
        super.setFontSize((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fontWeight")
    public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
        super.setFontWeight((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "inlineSize")
    public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
        super.setInlineSize((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "lengthAdjust")
    public /* bridge */ /* synthetic */ void setLengthAdjust(View view, @Nullable String str) {
        super.setLengthAdjust((RenderableViewManager$TextPathViewManager) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerEnd")
    public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setMarkerEnd((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerMid")
    public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setMarkerMid((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerStart")
    public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setMarkerStart((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "mask")
    public /* bridge */ /* synthetic */ void setMask(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setMask((VirtualView) view, str);
    }

    public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
        super/*com.horcrux.svg.VirtualViewManager*/.setMatrix((VirtualView) view, readableArray);
    }

    @ReactProp(IAuthTabCallbackStub = "name")
    public /* bridge */ /* synthetic */ void setName(View view, String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setName((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "opacity", onNavigationEvent = 1.0f)
    public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
        super/*com.horcrux.svg.VirtualViewManager*/.setOpacity((VirtualView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "pointerEvents")
    public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
        super/*com.horcrux.svg.VirtualViewManager*/.setPointerEvents((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "propList")
    public /* bridge */ /* synthetic */ void setPropList(View view, @Nullable ReadableArray readableArray) {
        super.setPropList((RenderableView) view, readableArray);
    }

    @ReactProp(IAuthTabCallbackStub = "responsible")
    public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
        super/*com.horcrux.svg.VirtualViewManager*/.setResponsible((VirtualView) view, z);
    }

    @ReactProp(IAuthTabCallbackStub = "rotate")
    public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
        super.setRotate((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "stroke")
    public /* bridge */ /* synthetic */ void setStroke(View view, @Nullable Dynamic dynamic) {
        super.setStroke((RenderableView) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeDasharray")
    public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
        super.setStrokeDasharray((RenderableView) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeDashoffset")
    public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
        super.setStrokeDashoffset((RenderableView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeLinecap", onExtraCallback = 1)
    public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
        super.setStrokeLinecap((RenderableView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeLinejoin", onExtraCallback = 1)
    public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
        super.setStrokeLinejoin((RenderableView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeMiterlimit", onNavigationEvent = 4.0f)
    public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
        super.setStrokeMiterlimit((RenderableView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeOpacity", onNavigationEvent = 1.0f)
    public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
        super.setStrokeOpacity((RenderableView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "strokeWidth")
    public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
        super.setStrokeWidth((RenderableView) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "textLength")
    public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
        super.setTextLength((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "vectorEffect")
    public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
        super.setVectorEffect((RenderableView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "verticalAlign")
    public /* bridge */ /* synthetic */ void setVerticalAlign(View view, @Nullable Dynamic dynamic) {
        super.setVerticalAlign((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$TextPathViewManager) view, dynamic);
    }

    RenderableViewManager$TextPathViewManager() {
        super(VirtualViewManager.SVGClass.RNSVGTextPath);
        ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
    }

    RenderableViewManager$TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
        ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "href")
    public void setHref(TextPathView textPathView, String str) {
        textPathView.setHref(str);
    }

    @ReactProp(IAuthTabCallbackStub = "startOffset")
    public void setStartOffset(TextPathView textPathView, Dynamic dynamic) {
        textPathView.setStartOffset(dynamic);
    }

    @Override // com.horcrux.svg.RenderableViewManager$TextViewManagerAbstract
    @ReactProp(IAuthTabCallbackStub = "method")
    public void setMethod(TextPathView textPathView, @Nullable String str) {
        textPathView.setMethod(str);
    }

    public void setMidLine(TextPathView textPathView, @Nullable String str) {
        textPathView.setSharp(str);
    }

    @ReactProp(IAuthTabCallbackStub = "spacing")
    public void setSpacing(TextPathView textPathView, @Nullable String str) {
        textPathView.setSpacing(str);
    }

    @ReactProp(IAuthTabCallbackStub = "side")
    public void setSide(TextPathView textPathView, @Nullable String str) {
        textPathView.setSide(str);
    }

    @ReactProp(IAuthTabCallbackStub = "midLine")
    public void setSharp(TextPathView textPathView, @Nullable String str) {
        textPathView.setSharp(str);
    }
}
