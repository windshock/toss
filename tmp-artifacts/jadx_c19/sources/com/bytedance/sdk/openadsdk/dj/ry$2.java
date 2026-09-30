package com.bytedance.sdk.openadsdk.dj;

import android.text.TextUtils;
import com.bytedance.sdk.component.fby.zb.sya;
import com.bytedance.sdk.component.ul.ycx.ycx;
import com.bytedance.sdk.component.ul.zb.zb;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.settings.lt;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ry$2 extends sya {
    final /* synthetic */ ry sya;
    final /* synthetic */ String ycx;
    final /* synthetic */ int zb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ry$2(ry ryVar, String str, String str2, int i2) {
        super(str);
        this.sya = ryVar;
        this.ycx = str2;
        this.zb = i2;
    }

    public void run() {
        try {
            lt ltVarXz = pmi.dj().xz();
            boolean zYcx = ry.ycx(this.sya, ltVarXz, this.ycx);
            if (zYcx) {
                if (!TextUtils.isEmpty(lt.zb)) {
                    ry.ycx(this.sya, this.zb, this.ycx);
                    return;
                }
                if (TextUtils.isEmpty(ltVarXz.sya) || !zYcx) {
                    return;
                }
                String str = ltVarXz.sya;
                zb zbVarSya = com.bytedance.sdk.openadsdk.htf.zb.zb().sya().sya();
                zbVarSya.sya(str);
                HashMap map = new HashMap();
                map.put("content-type", "application/json; charset=utf-8");
                zbVarSya.dj(map);
                zbVarSya.ycx(9);
                zbVarSya.zb("sendPrefLog");
                zbVarSya.zb(new ycx() { // from class: com.bytedance.sdk.openadsdk.dj.ry$2.1
                    public void ycx(com.bytedance.sdk.component.ul.zb.sya syaVar, IOException iOException) {
                    }

                    public void ycx(com.bytedance.sdk.component.ul.zb.sya syaVar, com.bytedance.sdk.component.ul.zb zbVar) {
                        try {
                            lt.zb = zbVar.dj();
                            ry$2 ry_2 = ry$2.this;
                            ry.ycx(ry_2.sya, ry_2.zb, ry_2.ycx);
                        } catch (Exception e) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkeh+/", "VOAfkBCsZsmTTw==", 868);
                            htf.ycx("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkeg==", "Sfsj", 878);
            htf.sya(th.getMessage(), new Object[0]);
        }
    }
}
