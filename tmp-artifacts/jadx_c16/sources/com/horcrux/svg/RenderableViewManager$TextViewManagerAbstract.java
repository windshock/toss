package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.TextView;
import com.horcrux.svg.VirtualViewManager;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RenderableViewManager$TextViewManagerAbstract<K extends TextView> extends RenderableViewManager$GroupViewManagerAbstract<K> {
    RenderableViewManager$TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @ReactProp(IAuthTabCallbackStub = "inlineSize")
    public void setInlineSize(K k, Dynamic dynamic) {
        k.setInlineSize(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "textLength")
    public void setTextLength(K k, Dynamic dynamic) {
        k.setTextLength(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "lengthAdjust")
    public void setLengthAdjust(K k, @Nullable String str) {
        k.setLengthAdjust(str);
    }

    @ReactProp(IAuthTabCallbackStub = "alignmentBaseline")
    public void setMethod(K k, @Nullable String str) {
        k.setMethod(str);
    }

    @ReactProp(IAuthTabCallbackStub = "baselineShift")
    public void setBaselineShift(K k, Dynamic dynamic) {
        k.setBaselineShift(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "verticalAlign")
    public void setVerticalAlign(K k, @Nullable Dynamic dynamic) {
        k.setVerticalAlign(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "rotate")
    public void setRotate(K k, Dynamic dynamic) {
        k.setRotate(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "dx")
    public void setDx(K k, Dynamic dynamic) {
        k.setDeltaX(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "dy")
    public void setDy(K k, Dynamic dynamic) {
        k.setDeltaY(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "x")
    public void setX(K k, Dynamic dynamic) {
        k.setPositionX(dynamic);
    }

    @ReactProp(IAuthTabCallbackStub = "y")
    public void setY(K k, Dynamic dynamic) {
        k.setPositionY(dynamic);
    }

    @Override // com.horcrux.svg.RenderableViewManager$GroupViewManagerAbstract
    @ReactProp(IAuthTabCallbackStub = "font")
    public void setFont(K k, Dynamic dynamic) {
        k.setFont(dynamic);
    }

    public void setAlignmentBaseline(K k, @Nullable String str) {
        k.setMethod(str);
    }
}
