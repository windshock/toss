package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby dj;
    private int lud;
    private boolean sya;
    private float ycx;
    private float zb;

    public lud(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar, int i2) {
        this.dj = fbyVar;
        this.lud = i2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycx = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.zb = y;
                if (Math.abs(y - this.ycx) > 10.0f) {
                    this.sya = true;
                }
            }
        } else {
            if (!this.sya) {
                return false;
            }
            int iZb = com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs(this.zb - this.ycx));
            if (this.zb - this.ycx < 0.0f && iZb > this.lud && (fbyVar = this.dj) != null) {
                fbyVar.ycx();
                this.ycx = 0.0f;
                this.zb = 0.0f;
                this.sya = false;
            }
        }
        return true;
    }
}
