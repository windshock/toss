package com.bytedance.adsdk.ugeno.core.zb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.core.syc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private Context dj;
    private final int lt;
    private boolean lud;
    private ry sya;
    private float ycx;
    private float zb;

    public sya(Context context, ry ryVar) {
        this.dj = context;
        this.sya = ryVar;
        this.lt = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean ycx(syc sycVar, com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ycx = motionEvent.getX();
            this.zb = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ycx) >= this.lt || Math.abs(y - this.zb) >= this.lt) {
                    this.lud = true;
                }
            } else if (action == 3) {
                this.lud = false;
            }
        } else {
            if (this.lud) {
                this.lud = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.ycx) >= this.lt || Math.abs(y2 - this.zb) >= this.lt) {
                this.lud = false;
            } else if (sycVar != null) {
                sycVar.ycx(this.sya, syaVar, syaVar);
                return true;
            }
        }
        return true;
    }
}
