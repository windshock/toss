package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeGaussianBlurManager extends RenderableViewManager$FilterPrimitiveManager<FeGaussianBlurView> implements RNSVGFeGaussianBlurManagerInterface<FeGaussianBlurView> {
    public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeGaussianBlurManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeGaussianBlurManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeGaussianBlurManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeGaussianBlurManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeGaussianBlurManager) view, dynamic);
    }

    RenderableViewManager$FeGaussianBlurManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeGaussianBlurManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "in1")
    public void setIn1(FeGaussianBlurView feGaussianBlurView, String str) {
        feGaussianBlurView.setIn1(str);
    }

    @ReactProp(IAuthTabCallbackStub = "stdDeviationX")
    public void setStdDeviationX(FeGaussianBlurView feGaussianBlurView, float f) {
        feGaussianBlurView.setStdDeviationX(f);
    }

    @ReactProp(IAuthTabCallbackStub = "stdDeviationY")
    public void setStdDeviationY(FeGaussianBlurView feGaussianBlurView, float f) {
        feGaussianBlurView.setStdDeviationY(f);
    }

    @ReactProp(IAuthTabCallbackStub = "values")
    public void setEdgeMode(FeGaussianBlurView feGaussianBlurView, String str) {
        feGaussianBlurView.setEdgeMode(str);
    }
}
