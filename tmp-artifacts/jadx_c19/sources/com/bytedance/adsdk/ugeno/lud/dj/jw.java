package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.view.MotionEvent;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends sya {
    private float ea;
    private float ok;
    private boolean ry;
    private com.bytedance.adsdk.ugeno.lud.xkz xkz;

    public jw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    public boolean ycx(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        com.bytedance.adsdk.ugeno.lud.xkz xkzVar = this.xkz;
        if (xkzVar != null) {
            return xkzVar.ycx(this.zb, motionEvent, this.ycx, this);
        }
        return ycx(this.zb, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ea = motionEvent.getRawX();
            this.ok = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.ry) {
                this.ry = false;
                this.ea = 0.0f;
                this.ok = 0.0f;
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.ea) >= 15.0f || Math.abs(rawY - this.ok) >= 15.0f) {
                this.ry = false;
                return false;
            }
            com.bytedance.adsdk.ugeno.lud.ea eaVar = this.ycx;
            if (eaVar != null) {
                eaVar.ycx(syaVar, this.lt, this.sya.zb(), this.sya);
                this.ea = 0.0f;
                this.ok = 0.0f;
                return true;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.ea) >= 15.0f || Math.abs(rawY2 - this.ok) >= 15.0f) {
                this.ry = true;
            }
        } else if (action == 3) {
            this.ry = false;
            float rawX3 = motionEvent.getRawX();
            if (motionEvent.getRawY() != 0.0f || rawX3 != 0.0f) {
            }
        }
        return true;
    }

    public void ycx(com.bytedance.adsdk.ugeno.lud.xkz xkzVar) {
        this.xkz = xkzVar;
    }
}
