package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj implements View.OnTouchListener {
    private float dj;
    private boolean ea;
    private boolean fby;
    private int jc;
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby jw;
    private float lt;
    private boolean lud = true;
    private float sya;
    private float ul;
    private float ycx;
    private float zb;

    public dj(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar, int i2, boolean z) {
        this.jw = fbyVar;
        this.jc = i2;
        this.ea = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar2;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycx = motionEvent.getX();
            this.zb = motionEvent.getY();
            this.lt = motionEvent.getY();
            this.lud = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.ul = y;
                if (Math.abs(y - this.lt) > 10.0f) {
                    this.fby = true;
                }
                this.dj = motionEvent.getX();
                this.sya = motionEvent.getY();
                if (Math.abs(this.dj - this.ycx) > 8.0f || Math.abs(this.sya - this.zb) > 8.0f) {
                    this.lud = false;
                }
            }
        } else {
            if (!this.fby && !this.lud) {
                return false;
            }
            if (!this.ea && (fbyVar3 = this.jw) != null) {
                fbyVar3.ycx();
            } else {
                int iZb = com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs(this.ul - this.lt));
                if (this.ul - this.lt < 0.0f && iZb > this.jc && (fbyVar2 = this.jw) != null) {
                    fbyVar2.ycx();
                } else if (this.lud && (fbyVar = this.jw) != null) {
                    fbyVar.ycx();
                }
            }
        }
        return true;
    }
}
