package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby implements View.OnTouchListener {
    private float dj;
    private float lt;
    private float lud;
    private final int sya = 10;
    private float ul;
    private final com.bytedance.sdk.component.adexpress.dynamic.sya.fby ycx;
    private final boolean zb;

    public fby(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar, boolean z) {
        this.ycx = fbyVar;
        this.zb = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dj = motionEvent.getX();
            this.lud = motionEvent.getY();
        } else if (action == 1) {
            this.lt = motionEvent.getX();
            this.ul = motionEvent.getY();
            float f = this.ul;
            if (!this.zb && (fbyVar2 = this.ycx) != null) {
                fbyVar2.ycx();
            } else {
                float f2 = this.lt - this.dj;
                float f3 = f - this.lud;
                if (com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs((float) Math.sqrt((f2 * f2) + (f3 * f3)))) > 10.0f && (fbyVar = this.ycx) != null) {
                    fbyVar.ycx();
                }
            }
        }
        return true;
    }
}
