package com.bytedance.adsdk.ugeno.core.zb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.core.syc;
import com.bytedance.adsdk.ugeno.fby.jw;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt implements jw.ycx {
    private Context dj;
    private com.bytedance.adsdk.ugeno.zb.sya lt;
    private ry lud;
    private syc sya;
    private Handler ul = new jw(Looper.getMainLooper(), this);
    private boolean ycx;
    private int zb;

    public lt(Context context, ry ryVar, com.bytedance.adsdk.ugeno.zb.sya syaVar) {
        this.dj = context;
        this.lud = ryVar;
        this.lt = syaVar;
    }

    public void ycx(syc sycVar) {
        this.sya = sycVar;
    }

    public void ycx() {
        ry ryVar = this.lud;
        if (ryVar != null) {
            JSONObject jSONObjectSya = ryVar.sya();
            try {
                this.zb = Integer.parseInt(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObjectSya.optString("interval", "8000"), this.lt.ok()));
                this.ycx = jSONObjectSya.optBoolean("repeat");
                this.ul.sendEmptyMessageDelayed(1001, this.zb);
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fby.jw.ycx
    public void ycx(Message message) {
        if (message.what != 1001) {
            return;
        }
        syc sycVar = this.sya;
        if (sycVar != null) {
            ry ryVar = this.lud;
            com.bytedance.adsdk.ugeno.zb.sya syaVar = this.lt;
            sycVar.ycx(ryVar, syaVar, syaVar);
        }
        if (this.ycx) {
            this.ul.sendEmptyMessageDelayed(1001, this.zb);
        } else {
            this.ul.removeMessages(1001);
        }
    }
}
