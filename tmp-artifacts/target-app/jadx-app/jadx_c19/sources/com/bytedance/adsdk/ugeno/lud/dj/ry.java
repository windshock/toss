package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.fby.jw;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ry extends sya implements jw.ycx {
    private int ea;
    private boolean ok;
    private Handler ry;

    public ry(Context context) {
        super(context);
        this.ea = 500;
        this.ry = new com.bytedance.adsdk.ugeno.fby.jw(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.lud.dj.sya
    public boolean ycx(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        Object obj = this.lud.get("delay");
        if (obj == null) {
            this.ea = 500;
        } else {
            this.ea = com.bytedance.adsdk.ugeno.fby.sya.ycx(String.valueOf(obj), 500);
        }
        return ycx(this.zb, motionEvent);
    }

    private boolean ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.lud.ea eaVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ry.sendEmptyMessageDelayed(1102, this.ea);
        } else {
            if (action == 1) {
                if (this.ok && (eaVar = this.ycx) != null) {
                    eaVar.ycx(this.zb, this.lt, this.sya.zb(), this.sya);
                    this.ok = false;
                    Handler handler = this.ry;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.ry;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.ok = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.ry;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.ok = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.fby.jw.ycx
    public void ycx(Message message) {
        if (message.what == 1102) {
            this.ok = true;
            Handler handler = this.ry;
            if (handler != null) {
                handler.removeMessages(1102);
            }
        }
    }
}
