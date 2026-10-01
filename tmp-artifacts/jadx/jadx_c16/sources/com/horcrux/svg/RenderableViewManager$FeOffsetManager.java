package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeOffsetManager extends RenderableViewManager$FilterPrimitiveManager<FeOffsetView> implements RNSVGFeOffsetManagerInterface<FeOffsetView> {
    public static final String REACT_CLASS = "RNSVGFeOffset";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeOffsetManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeOffsetManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeOffsetManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeOffsetManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeOffsetManager) view, dynamic);
    }

    RenderableViewManager$FeOffsetManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeOffset);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeOffsetManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "in1")
    public void setIn1(FeOffsetView feOffsetView, String str) {
        feOffsetView.setIn1(str);
    }

    @ReactProp(IAuthTabCallbackStub = "dx")
    public void setDx(FeOffsetView feOffsetView, Dynamic dynamic) {
        feOffsetView.setDx(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "dy")
    public void setDy(FeOffsetView feOffsetView, Dynamic dynamic) {
        feOffsetView.setDy(dynamic);
    }
}
