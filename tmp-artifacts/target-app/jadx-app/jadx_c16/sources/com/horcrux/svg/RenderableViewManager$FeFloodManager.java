package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FeFloodManager extends RenderableViewManager$FilterPrimitiveManager<FeFloodView> implements RNSVGFeFloodManagerInterface<FeFloodView> {
    public static final String REACT_CLASS = "RNSVGFeFlood";

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "height")
    public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
        super.setHeight((RenderableViewManager$FeFloodManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "result")
    public /* bridge */ /* synthetic */ void setResult(View view, String str) {
        super.setResult((RenderableViewManager$FeFloodManager) view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "width")
    public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
        super.setWidth((RenderableViewManager$FeFloodManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "x")
    public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
        super.setX((RenderableViewManager$FeFloodManager) view, dynamic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactProp(IAuthTabCallbackStub = "y")
    public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
        super.setY((RenderableViewManager$FeFloodManager) view, dynamic);
    }

    RenderableViewManager$FeFloodManager() {
        super(VirtualViewManager.SVGClass.RNSVGFeFlood);
        ((VirtualViewManager) this).mDelegate = new RNSVGFeFloodManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "floodColor")
    public void setFloodColor(FeFloodView feFloodView, @Nullable Dynamic dynamic) throws Throwable {
        feFloodView.setFloodColor(dynamic);
    }

    public void setFloodColor(FeFloodView feFloodView, @Nullable ReadableMap readableMap) throws Throwable {
        feFloodView.setFloodColor(readableMap);
    }

    @ReactProp(IAuthTabCallbackStub = "floodOpacity", onNavigationEvent = 1.0f)
    public void setFloodOpacity(FeFloodView feFloodView, float f) {
        feFloodView.setFloodOpacity(f);
    }
}
