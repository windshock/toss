package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class ClipPathView extends GroupView {
    void draw(Canvas canvas, Paint paint, float f) {
    }

    int hitTest(float[] fArr) {
        return -1;
    }

    boolean isResponsible() {
        return false;
    }

    void mergeProperties(RenderableView renderableView) {
    }

    void resetProperties() {
    }

    public ClipPathView(ReactContext reactContext) {
        super(reactContext);
    }

    void saveDefinition() {
        getSvgView().defineClipPath(this, ((VirtualView) this).mName);
    }
}
