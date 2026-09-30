package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$RadialGradientManager extends VirtualViewManager<RadialGradientView> implements RNSVGRadialGradientManagerInterface<RadialGradientView> {
    public static final String REACT_CLASS = "RNSVGRadialGradient";

    @ReactProp(IAuthTabCallbackStub = "clipPath")
    public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
        super.setClipPath((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "clipRule")
    public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
        super.setClipRule((VirtualView) view, i);
    }

    @ReactProp(IAuthTabCallbackStub = "display")
    public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
        super.setDisplay((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerEnd")
    public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
        super.setMarkerEnd((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerMid")
    public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
        super.setMarkerMid((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "markerStart")
    public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
        super.setMarkerStart((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "mask")
    public /* bridge */ /* synthetic */ void setMask(View view, String str) {
        super.setMask((VirtualView) view, str);
    }

    public /* bridge */ /* synthetic */ void setMatrix(View view, @Nullable ReadableArray readableArray) {
        super.setMatrix((VirtualView) view, readableArray);
    }

    @ReactProp(IAuthTabCallbackStub = "name")
    public /* bridge */ /* synthetic */ void setName(View view, String str) {
        super.setName((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "opacity", onNavigationEvent = 1.0f)
    public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
        super.setOpacity((VirtualView) view, f);
    }

    @ReactProp(IAuthTabCallbackStub = "pointerEvents")
    public /* bridge */ /* synthetic */ void setPointerEvents(View view, @Nullable String str) {
        super.setPointerEvents((VirtualView) view, str);
    }

    @ReactProp(IAuthTabCallbackStub = "responsible")
    public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
        super.setResponsible((VirtualView) view, z);
    }

    RenderableViewManager$RadialGradientManager() {
        super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
        ((VirtualViewManager) this).mDelegate = new RNSVGRadialGradientManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "fx")
    public void setFx(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setFx(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fy")
    public void setFy(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setFy(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "rx")
    public void setRx(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setRx(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "ry")
    public void setRy(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setRy(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "cx")
    public void setCx(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setCx(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "cy")
    public void setCy(RadialGradientView radialGradientView, Dynamic dynamic) {
        radialGradientView.setCy(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "gradient")
    public void setGradient(RadialGradientView radialGradientView, ReadableArray readableArray) {
        radialGradientView.setGradient(readableArray);
    }

    @ReactProp(IAuthTabCallbackStub = "gradientUnits")
    public void setGradientUnits(RadialGradientView radialGradientView, int i) {
        radialGradientView.setGradientUnits(i);
    }

    @ReactProp(IAuthTabCallbackStub = "gradientTransform")
    public void setGradientTransform(RadialGradientView radialGradientView, @Nullable ReadableArray readableArray) {
        radialGradientView.setGradientTransform(readableArray);
    }
}
