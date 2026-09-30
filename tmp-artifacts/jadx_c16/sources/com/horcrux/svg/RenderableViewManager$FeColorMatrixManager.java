package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeColorMatrixManager extends RenderableViewManager$FilterPrimitiveManager<FeColorMatrixView> implements RNSVGFeColorMatrixManagerInterface<FeColorMatrixView> {
    public static final String REACT_CLASS = "RNSVGFeColorMatrix";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeColorMatrixManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeColorMatrixManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeColorMatrixManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeColorMatrixManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeColorMatrixManager) view, dynamic);
    }

    RenderableViewManager$FeColorMatrixManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeColorMatrixManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "in1")
    public void setIn1(FeColorMatrixView feColorMatrixView, String str) {
        feColorMatrixView.setIn1(str);
    }

    @ReactProp(IAuthTabCallbackStub = "type")
    public void setType(FeColorMatrixView feColorMatrixView, String str) {
        feColorMatrixView.setType(str);
    }

    @ReactProp(IAuthTabCallbackStub = "values")
    public void setValues(FeColorMatrixView feColorMatrixView, @Nullable ReadableArray readableArray) {
        feColorMatrixView.setValues(readableArray);
    }
}
