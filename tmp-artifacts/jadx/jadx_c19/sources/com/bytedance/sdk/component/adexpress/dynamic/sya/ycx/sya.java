package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya implements View.OnTouchListener {
    private float dj;
    private boolean fby;
    private boolean jw;
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby lt;
    private boolean lud;
    private float sya;
    private int ul;
    private float ycx;
    private float zb;

    public sya(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar) {
        this(fbyVar, 5);
    }

    public sya(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar, int i2) {
        this.ul = 5;
        this.fby = true;
        this.lt = fbyVar;
        if (i2 > 0) {
            this.ul = i2;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar2;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar3;
        if (this.jw) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycx = motionEvent.getX();
            this.zb = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.dj = motionEvent.getX();
                this.sya = motionEvent.getY();
                if (Math.abs(this.dj - this.ycx) > 10.0f) {
                    this.lud = true;
                }
                if (Math.abs(this.dj - this.ycx) > 8.0f || Math.abs(this.sya - this.zb) > 8.0f) {
                    this.fby = false;
                }
                int iZb = com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs(this.dj - this.ycx));
                if (this.dj > this.ycx && iZb > this.ul && (fbyVar3 = this.lt) != null) {
                    fbyVar3.ycx();
                    this.jw = true;
                }
            }
        } else {
            if (!this.lud && !this.fby) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iZb2 = com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs(this.dj - this.ycx));
            if (this.dj > this.ycx && iZb2 > this.ul && (fbyVar2 = this.lt) != null) {
                fbyVar2.ycx();
                this.jw = true;
            }
            float fAbs = Math.abs(x - this.ycx);
            float fAbs2 = Math.abs(y - this.zb);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (fbyVar = this.lt) != null) {
                fbyVar.zb();
                this.jw = true;
            }
        }
        return true;
    }
}
