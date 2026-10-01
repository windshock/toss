package com.bytedance.adsdk.ugeno.lud.dj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.fby.jw;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xkz extends sya implements jw.ycx {
    private int ea;
    private Handler ok;

    public xkz(Context context) {
        super(context);
        this.ea = 500;
        this.ok = new com.bytedance.adsdk.ugeno.fby.jw(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ok.sendEmptyMessageDelayed(1101, this.ea);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.ok.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fby.jw.ycx
    public void ycx(Message message) {
        if (message.what == 1101) {
            com.bytedance.adsdk.ugeno.lud.ea eaVar = this.ycx;
            if (eaVar != null) {
                eaVar.ycx(this.zb, this.lt, this.sya.zb(), this.sya);
            }
            Handler handler = this.ok;
            if (handler != null) {
                handler.removeMessages(1101);
            }
        }
    }
}
