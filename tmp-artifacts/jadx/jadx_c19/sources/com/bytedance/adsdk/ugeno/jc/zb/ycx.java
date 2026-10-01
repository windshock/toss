package com.bytedance.adsdk.ugeno.jc.zb;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.lud;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends FrameLayout {
    private lud ycx;
    private Map<Integer, ry> zb;

    public ycx(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, ry> map) {
        this.zb = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        lud ludVar = this.ycx;
        if (ludVar != null) {
            int[] iArrYcx = ludVar.ycx(i2, i3);
            super.onMeasure(iArrYcx[0], iArrYcx[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        lud ludVar2 = this.ycx;
        if (ludVar2 != null) {
            ludVar2.lud();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        lud ludVar = this.ycx;
        if (ludVar != null) {
            ludVar.lt();
        }
        super.onLayout(z, i2, i3, i4, i5);
        lud ludVar2 = this.ycx;
        if (ludVar2 != null) {
            ludVar2.ycx(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, ry> map = this.zb;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void ycx(lud ludVar) {
        this.ycx = ludVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lud ludVar = this.ycx;
        if (ludVar != null) {
            ludVar.ul();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lud ludVar = this.ycx;
        if (ludVar != null) {
            ludVar.fby();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lud ludVar = this.ycx;
        if (ludVar != null) {
            ludVar.ycx(z);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        lud ludVar = this.ycx;
        if (ludVar != null) {
            ludVar.zb(i2, i3, i4, i5);
        }
    }
}
