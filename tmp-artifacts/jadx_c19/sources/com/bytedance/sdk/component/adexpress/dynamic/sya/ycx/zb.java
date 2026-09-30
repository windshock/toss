package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.sya.jw;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb implements View.OnTouchListener {
    private boolean dj;
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby lt;
    private jw lud;
    private long sya;
    private float ycx;
    private float zb;

    public zb(jw jwVar, com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar) {
        this.lud = jwVar;
        this.lt = fbyVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sya = System.currentTimeMillis();
            this.ycx = motionEvent.getX();
            this.zb = motionEvent.getY();
            this.lud.lud();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ycx) >= com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), 10.0f) || Math.abs(y - this.zb) >= com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), 10.0f)) {
                    this.dj = true;
                    this.lud.lt();
                }
            }
        } else {
            if (this.dj) {
                return false;
            }
            if (System.currentTimeMillis() - this.sya >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar = this.lt;
                if (fbyVar != null) {
                    fbyVar.ycx();
                }
            } else {
                this.lud.lt();
            }
        }
        return true;
    }
}
