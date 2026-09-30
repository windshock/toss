package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeMergeManager extends RenderableViewManager$FilterPrimitiveManager<FeMergeView> implements RNSVGFeMergeManagerInterface<FeMergeView> {
    public static final String REACT_CLASS = "RNSVGFeMerge";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeMergeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeMergeManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeMergeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeMergeManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeMergeManager) view, dynamic);
    }

    RenderableViewManager$FeMergeManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeMerge);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeMergeManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "nodes")
    public void setNodes(FeMergeView feMergeView, ReadableArray readableArray) {
        feMergeView.setNodes(readableArray);
    }
}
