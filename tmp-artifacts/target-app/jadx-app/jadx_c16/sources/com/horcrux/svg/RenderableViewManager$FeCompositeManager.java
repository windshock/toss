package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeCompositeManager extends RenderableViewManager$FilterPrimitiveManager<FeCompositeView> implements RNSVGFeCompositeManagerInterface<FeCompositeView> {
    public static final String REACT_CLASS = "RNSVGFeComposite";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeCompositeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeCompositeManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeCompositeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeCompositeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeCompositeManager) view, dynamic);
    }

    RenderableViewManager$FeCompositeManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeComposite);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeCompositeManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "in1")
    public void setIn1(FeCompositeView feCompositeView, String str) {
        feCompositeView.setIn1(str);
    }

    @ReactProp(IAuthTabCallbackStub = "in2")
    public void setIn2(FeCompositeView feCompositeView, String str) {
        feCompositeView.setIn2(str);
    }

    @ReactProp(IAuthTabCallbackStub = "operator1")
    public void setOperator1(FeCompositeView feCompositeView, String str) {
        feCompositeView.setOperator(str);
    }

    @ReactProp(IAuthTabCallbackStub = "k1")
    public void setK1(FeCompositeView feCompositeView, float f) {
        feCompositeView.setK1(Float.valueOf(f));
    }

    @ReactProp(IAuthTabCallbackStub = "k2")
    public void setK2(FeCompositeView feCompositeView, float f) {
        feCompositeView.setK2(Float.valueOf(f));
    }

    @ReactProp(IAuthTabCallbackStub = "k3")
    public void setK3(FeCompositeView feCompositeView, float f) {
        feCompositeView.setK3(Float.valueOf(f));
    }

    @ReactProp(IAuthTabCallbackStub = "k4")
    public void setK4(FeCompositeView feCompositeView, float f) {
        feCompositeView.setK4(Float.valueOf(f));
    }
}
