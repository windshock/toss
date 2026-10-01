package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class DefsView extends DefinitionView {
    @Override // com.horcrux.svg.DefinitionView
    void draw(Canvas canvas, Paint paint, float f) {
    }

    public DefsView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            VirtualView childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                childAt.saveDefinition();
            }
        }
    }
}
