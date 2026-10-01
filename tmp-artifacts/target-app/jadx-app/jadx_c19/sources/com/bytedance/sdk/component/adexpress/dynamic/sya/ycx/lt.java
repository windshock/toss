package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt implements View.OnTouchListener {
    private static int sya = 10;
    private boolean dj;
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby lud;
    private float ycx;
    private float zb;

    public lt(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar) {
        this.lud = fbyVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycx = motionEvent.getX();
            this.zb = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ycx) >= sya || Math.abs(y - this.zb) >= sya) {
                    this.dj = true;
                }
            } else if (action == 3) {
                this.dj = false;
            }
        } else {
            if (this.dj) {
                this.dj = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.ycx) >= sya || Math.abs(y2 - this.zb) >= sya) {
                this.dj = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar = this.lud;
                if (fbyVar != null) {
                    fbyVar.ycx();
                }
            }
        }
        return true;
    }
}
