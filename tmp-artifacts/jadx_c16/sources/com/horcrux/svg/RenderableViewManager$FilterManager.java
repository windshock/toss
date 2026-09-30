package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGFilterManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$FilterManager extends VirtualViewManager<FilterView> implements RNSVGFilterManagerInterface<FilterView> {
    public static final String REACT_CLASS = "RNSVGFilter";

    @ReactProp(IAuthTabCallbackStub = "name")
    public /* bridge */ /* synthetic */ void setName(View view, String str) {
        super.setName((VirtualView) view, str);
    }

    RenderableViewManager$FilterManager() {
        super(VirtualViewManager.SVGClass.RNSVGFilter);
        ((VirtualViewManager) this).mDelegate = new RNSVGFilterManagerDelegate(this);
    }

    @ReactProp(IAuthTabCallbackStub = "x")
    public void setX(FilterView filterView, Dynamic dynamic) {
        filterView.setX(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "y")
    public void setY(FilterView filterView, Dynamic dynamic) {
        filterView.setY(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "width")
    public void setWidth(FilterView filterView, Dynamic dynamic) {
        filterView.setWidth(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "height")
    public void setHeight(FilterView filterView, Dynamic dynamic) {
        filterView.setHeight(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "filterUnits")
    public void setFilterUnits(FilterView filterView, String str) {
        filterView.setFilterUnits(str);
    }

    @ReactProp(IAuthTabCallbackStub = "primitiveUnits")
    public void setPrimitiveUnits(FilterView filterView, String str) {
        filterView.setPrimitiveUnits(str);
    }
}
