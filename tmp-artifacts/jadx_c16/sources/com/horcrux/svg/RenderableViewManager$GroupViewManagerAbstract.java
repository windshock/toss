package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.VirtualViewManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$GroupViewManagerAbstract<U extends GroupView> extends RenderableViewManager<U> {
    RenderableViewManager$GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @ReactProp(IAuthTabCallbackStub = "font")
    public void setFont(U u, Dynamic dynamic) {
        u.setFont(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "fontSize")
    public void setFontSize(U u, Dynamic dynamic) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = RenderableViewManager.1.onExtraCallback[dynamic.getType().ordinal()];
        if (i == 1) {
            javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
        } else if (i != 2) {
            return;
        } else {
            javaOnlyMap.putString("fontSize", dynamic.asString());
        }
        u.setFont(javaOnlyMap);
    }

    @ReactProp(IAuthTabCallbackStub = "fontWeight")
    public void setFontWeight(U u, Dynamic dynamic) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = RenderableViewManager.1.onExtraCallback[dynamic.getType().ordinal()];
        if (i == 1) {
            javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
        } else if (i != 2) {
            return;
        } else {
            javaOnlyMap.putString("fontWeight", dynamic.asString());
        }
        u.setFont(javaOnlyMap);
    }
}
