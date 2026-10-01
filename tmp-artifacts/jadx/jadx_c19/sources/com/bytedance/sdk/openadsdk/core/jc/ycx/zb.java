package com.bytedance.sdk.openadsdk.core.jc.ycx;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.adexpress.zb.ea;
import com.bytedance.sdk.component.jw.fby;
import com.bytedance.sdk.openadsdk.core.kgy;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.widget.ycx.lud;
import com.bytedance.sdk.openadsdk.ry.jw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.oby;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb implements jw {
    private String dj;
    private Activity ea;
    private lud fby;
    private int jc = -1;
    private com.bytedance.sdk.openadsdk.core.syc.dj.zb jw;
    private JSONObject lt;
    private ea lud;
    private final tn sya;
    private com.bytedance.sdk.openadsdk.dj.dj.lud ul;
    private final kgy ycx;
    private final fby zb;

    public zb(kgy kgyVar, fby fbyVar, tn tnVar) {
        this.ycx = kgyVar;
        this.zb = fbyVar;
        this.sya = tnVar;
    }

    public zb ycx(ea eaVar) {
        this.lud = eaVar;
        return this;
    }

    public zb ycx(com.bytedance.sdk.openadsdk.dj.dj.lud ludVar) {
        this.ul = ludVar;
        return this;
    }

    public zb ycx(com.bytedance.sdk.openadsdk.core.syc.dj.zb zbVar) {
        this.jw = zbVar;
        return this;
    }

    public zb ycx(String str) {
        this.dj = str;
        return this;
    }

    public zb ycx(JSONObject jSONObject) {
        this.lt = jSONObject;
        return this;
    }

    public zb ycx(lud ludVar) {
        this.fby = ludVar;
        return this;
    }

    public zb ycx(Activity activity) {
        this.ea = activity;
        return this;
    }

    public void ycx() {
        kgy kgyVar;
        fby fbyVar = this.zb;
        if (fbyVar == null || fbyVar.getWebView() == null || (kgyVar = this.ycx) == null) {
            return;
        }
        kgyVar.zb(this.zb).ycx(true).ycx(this.sya).sya(this.sya.if()).dj(this.sya.pks()).zb(oby.ycx(this.dj)).lud(this.sya.wbt()).ycx(new sya(this.zb)).ycx(this.lud).ycx(this.lt).zb(this.dj).ycx(this.sya.row()).ycx(this.ea).ycx(this.zb).ycx(this.ul);
        this.ycx.ycx(new dj(this.zb));
    }

    public void zb() {
        this.zb.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.jc.ycx.zb.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (zb.this.zb == null || zb.this.zb.getViewTreeObserver() == null) {
                    return;
                }
                zb.this.zb.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredWidth = zb.this.zb.getMeasuredWidth();
                int measuredHeight = zb.this.zb.getMeasuredHeight();
                if (zb.this.zb.getVisibility() == 0) {
                    zb.this.ycx.ycx(measuredWidth, measuredHeight);
                }
            }
        });
    }

    public void sya() {
        DeviceUtils.AudioInfoReceiver.zb(this);
        this.jc = DeviceUtils.ul();
    }

    public void dj() {
        DeviceUtils.AudioInfoReceiver.ycx(this);
    }

    public void sya(int i2) {
        kgy kgyVar = this.ycx;
        if (kgyVar == null) {
            return;
        }
        int i3 = this.jc;
        if (i3 <= 0 && i2 > 0) {
            kgyVar.jc(false);
        } else if (i3 > 0 && i2 == 0) {
            kgyVar.jc(true);
        }
        this.jc = i2;
    }

    public void lud() {
        kgy kgyVar = this.ycx;
        if (kgyVar == null) {
            return;
        }
        kgyVar.ea(false);
    }

    public void lt() {
        fby fbyVar;
        if (this.ycx == null || (fbyVar = this.zb) == null || fbyVar.getWebView() == null) {
            return;
        }
        this.ycx.ea(this.zb.getVisibility() == 0);
    }
}
