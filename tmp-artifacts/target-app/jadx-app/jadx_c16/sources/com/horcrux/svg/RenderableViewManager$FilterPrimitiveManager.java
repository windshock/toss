package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.FilterPrimitiveView;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FilterPrimitiveManager<T extends FilterPrimitiveView> extends VirtualViewManager<T> {
    protected RenderableViewManager$FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @ReactProp(IAuthTabCallbackStub = "x")
    public void setX(T t, Dynamic dynamic) {
        t.setX(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "y")
    public void setY(T t, Dynamic dynamic) {
        t.setY(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "width")
    public void setWidth(T t, Dynamic dynamic) {
        t.setWidth(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "height")
    public void setHeight(T t, Dynamic dynamic) {
        t.setHeight(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "result")
    public void setResult(T t, String str) {
        t.setResult(str);
    }
}
