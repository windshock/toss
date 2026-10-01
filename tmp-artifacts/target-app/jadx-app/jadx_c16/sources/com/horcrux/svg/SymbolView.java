package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class SymbolView extends GroupView {
    private int IAuthTabCallback;
    private String onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float onTransact;
    private float onWarmupCompleted;

    public SymbolView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setMinX(float f) {
        this.onExtraCallbackWithResult = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.onWarmupCompleted = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.onTransact = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.onNavigationEvent = f;
        invalidate();
    }

    public void setAlign(String str) {
        this.onExtraCallback = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.IAuthTabCallback = i;
        invalidate();
    }

    void draw(Canvas canvas, Paint paint, float f) {
        saveDefinition();
    }

    void onWarmupCompleted(Canvas canvas, Paint paint, float f, float f2, float f3) {
        if (this.onExtraCallback != null) {
            float f4 = this.onExtraCallbackWithResult;
            float f5 = ((VirtualView) this).mScale;
            float f6 = this.onWarmupCompleted;
            canvas.concat(ExoPlayerImplComponentListenerExternalSyntheticLambda8.onExtraCallback(new RectF(f4 * f5, f6 * f5, (f4 + this.onTransact) * f5, (f6 + this.onNavigationEvent) * f5), new RectF(0.0f, 0.0f, f2, f3), this.onExtraCallback, this.IAuthTabCallback));
            super.draw(canvas, paint, f);
        }
    }
}
