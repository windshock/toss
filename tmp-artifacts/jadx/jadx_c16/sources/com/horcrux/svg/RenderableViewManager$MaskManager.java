package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$MaskManager extends RenderableViewManager$GroupViewManagerAbstract<MaskView> implements RNSVGMaskManagerInterface<MaskView> {
    public static final String REACT_CLASS = "RNSVGMask";

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
        super.setFont((RenderableViewManager$MaskManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fontSize")
    public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
        super.setFontSize((RenderableViewManager$MaskManager) view, dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fontWeight")
    public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
        super.setFontWeight((RenderableViewManager$MaskManager) view, dynamic);
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

    @ReactProp(IAuthTabCallbackStub = "vectorEffect")
    public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
        super.setVectorEffect((RenderableView) view, i);
    }

    RenderableViewManager$MaskManager() {
        super(VirtualViewManager.SVGClass.RNSVGMask);
        ((VirtualViewManager) this).mDelegate = new RNSVGMaskManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "x")
    public void setX(MaskView maskView, Dynamic dynamic) {
        maskView.setX(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "y")
    public void setY(MaskView maskView, Dynamic dynamic) {
        maskView.setY(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "width")
    public void setWidth(MaskView maskView, Dynamic dynamic) {
        maskView.setWidth(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "height")
    public void setHeight(MaskView maskView, Dynamic dynamic) {
        maskView.setHeight(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "maskUnits")
    public void setMaskUnits(MaskView maskView, int i) {
        maskView.setMaskUnits(i);
    }

    @ReactProp(IAuthTabCallbackStub = "maskContentUnits")
    public void setMaskContentUnits(MaskView maskView, int i) {
        maskView.setMaskContentUnits(i);
    }

    @ReactProp(IAuthTabCallbackStub = "maskType")
    public void setMaskType(MaskView maskView, int i) {
        maskView.setMaskType(i);
    }
}
