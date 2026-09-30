package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeBlendManager extends RenderableViewManager$FilterPrimitiveManager<FeBlendView> implements RNSVGFeBlendManagerInterface<FeBlendView> {
    public static final String REACT_CLASS = "RNSVGFeBlend";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeBlendManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeBlendManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeBlendManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeBlendManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeBlendManager) view, dynamic);
    }

    RenderableViewManager$FeBlendManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeBlend);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeBlendManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "in1")
    public void setIn1(FeBlendView feBlendView, String str) {
        feBlendView.setIn1(str);
    }

    @ReactProp(IAuthTabCallbackStub = "in2")
    public void setIn2(FeBlendView feBlendView, String str) {
        feBlendView.setIn2(str);
    }

    @ReactProp(IAuthTabCallbackStub = "mode")
    public void setMode(FeBlendView feBlendView, String str) {
        feBlendView.setMode(str);
    }
}
