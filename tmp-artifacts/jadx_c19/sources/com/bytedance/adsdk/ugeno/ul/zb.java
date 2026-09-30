package com.bytedance.adsdk.ugeno.ul;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.lud;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx<com.bytedance.adsdk.ugeno.zb.sya> {
    private lud dj;

    public zb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ul.ycx
    public View ea(int i2) {
        return ((com.bytedance.adsdk.ugeno.zb.sya) this.ycx.get(i2)).ea();
    }

    public void ycx(lud ludVar) {
        this.dj = ludVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        lud ludVar = this.dj;
        if (ludVar != null) {
            int[] iArrYcx = ludVar.ycx(i2, i3);
            super.onMeasure(iArrYcx[0], iArrYcx[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        lud ludVar2 = this.dj;
        if (ludVar2 != null) {
            ludVar2.lud();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        lud ludVar = this.dj;
        if (ludVar != null) {
            ludVar.lt();
        }
        super.onLayout(z, i2, i3, i4, i5);
        lud ludVar2 = this.dj;
        if (ludVar2 != null) {
            ludVar2.ycx(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lud ludVar = this.dj;
        if (ludVar != null) {
            ludVar.ul();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lud ludVar = this.dj;
        if (ludVar != null) {
            ludVar.fby();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        lud ludVar = this.dj;
        if (ludVar != null) {
            ludVar.zb(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lud ludVar = this.dj;
        if (ludVar != null) {
            ludVar.ycx(z);
        }
    }
}
