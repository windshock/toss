package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.ul.ycx.ycx;
import com.bytedance.sdk.component.ul.zb;
import com.bytedance.sdk.component.ul.zb.sya;
import com.bytedance.sdk.openadsdk.dy.ycx.lud;
import com.bytedance.sdk.openadsdk.pmi.dj;
import com.bytedance.sdk.openadsdk.utils.tn;
import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class dv$5 extends ycx {
    final /* synthetic */ dv sya;
    final /* synthetic */ String ycx;
    final /* synthetic */ List zb;

    dv$5(dv dvVar, String str, List list) {
        this.sya = dvVar;
        this.ycx = str;
        this.zb = list;
    }

    public void ycx(sya syaVar, zb zbVar) {
        boolean zYcx = com.bytedance.sdk.openadsdk.utils.zb.ycx();
        if (zbVar != null) {
            if (zbVar.lt()) {
                if (zYcx) {
                    return;
                }
                com.bytedance.sdk.openadsdk.pmi.sya.zb(new dj() { // from class: com.bytedance.sdk.openadsdk.core.dv$5.1
                    public com.bytedance.sdk.openadsdk.pmi.zb.ycx ycx() {
                        com.bytedance.sdk.openadsdk.pmi.zb.ycx ycxVar = new com.bytedance.sdk.openadsdk.pmi.zb.ycx();
                        ycxVar.zb("dislike");
                        return ycxVar;
                    }
                });
                return;
            } else {
                if (!zYcx) {
                    com.bytedance.sdk.openadsdk.pmi.sya.sya(new dj() { // from class: com.bytedance.sdk.openadsdk.core.dv$5.2
                        public com.bytedance.sdk.openadsdk.pmi.zb.ycx ycx() {
                            com.bytedance.sdk.openadsdk.pmi.zb.ycx ycxVar = new com.bytedance.sdk.openadsdk.pmi.zb.ycx();
                            ycxVar.zb("dislike");
                            return ycxVar;
                        }
                    });
                }
                lud.ycx("dislike", this.ycx, zbVar.ycx(), zbVar.zb(), syaVar.sya(), this.zb);
                return;
            }
        }
        lud.ycx("dislike", this.ycx, -1, "response is null", syaVar.sya(), this.zb);
        if (zYcx) {
            return;
        }
        com.bytedance.sdk.openadsdk.pmi.sya.sya(new dj() { // from class: com.bytedance.sdk.openadsdk.core.dv$5.3
            public com.bytedance.sdk.openadsdk.pmi.zb.ycx ycx() {
                com.bytedance.sdk.openadsdk.pmi.zb.ycx ycxVar = new com.bytedance.sdk.openadsdk.pmi.zb.ycx();
                ycxVar.zb("dislike");
                return ycxVar;
            }
        });
    }

    public void ycx(sya syaVar, IOException iOException) {
        lud.ycx("dislike", this.ycx, -1, iOException != null ? iOException.getMessage() : "null", syaVar.sya(), this.zb);
        tn.ycx(syaVar.lt());
        if (com.bytedance.sdk.openadsdk.utils.zb.ycx()) {
            return;
        }
        com.bytedance.sdk.openadsdk.pmi.sya.sya(new dj() { // from class: com.bytedance.sdk.openadsdk.core.dv$5.4
            public com.bytedance.sdk.openadsdk.pmi.zb.ycx ycx() {
                com.bytedance.sdk.openadsdk.pmi.zb.ycx ycxVar = new com.bytedance.sdk.openadsdk.pmi.zb.ycx();
                ycxVar.zb("dislike");
                return ycxVar;
            }
        });
    }
}
