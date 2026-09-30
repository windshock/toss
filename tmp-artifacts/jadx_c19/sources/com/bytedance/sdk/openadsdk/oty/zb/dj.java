package com.bytedance.sdk.openadsdk.oty.zb;

import com.bytedance.sdk.component.fby.zb.sya;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.xkz.zb.sya;
import com.bytedance.sdk.openadsdk.oty.zb.lud;
import com.bytedance.sdk.openadsdk.utils.oby;
import com.bytedance.sdk.openadsdk.utils.yzp;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    public static void ycx(final tn tnVar, final ycx ycxVar, final lud.ycx ycxVar2) {
        tnVar.yfd();
        yzp.zb(new sya("mrc_report") { // from class: com.bytedance.sdk.openadsdk.oty.zb.dj.1
            public void run() {
                if (tnVar.eel()) {
                    if (tnVar.uhs()) {
                        com.bytedance.sdk.openadsdk.core.xkz.zb.sya.ycx(tnVar.skm(), new sya.zb("show_urls", tnVar));
                    } else {
                        com.bytedance.sdk.openadsdk.dj.sya.ycx(tnVar);
                    }
                }
                String strYcx = oby.ycx(tnVar);
                final JSONObject jSONObject = new JSONObject();
                ycx ycxVar3 = ycxVar;
                final JSONObject jSONObjectYcx = null;
                if (ycxVar3 != null) {
                    try {
                        jSONObject.put("root_view", ycx.ycx(ycxVar3));
                        lud.ycx ycxVar4 = ycxVar2;
                        if (ycxVar4 != null) {
                            int i2 = ycxVar4.ycx;
                            if (i2 != -1) {
                                jSONObject.put("dynamic_show_type", i2);
                            }
                            int i3 = ycxVar2.zb;
                            if (i3 != -1) {
                                jSONObjectYcx = com.bytedance.sdk.openadsdk.dj.sya.ycx(i3 + 1);
                            }
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5gDoStQoCCHAA==", "a88KuDGfTNGFRMNwjR+hL178acQ=", "Sfsj", 45);
                    }
                }
                com.bytedance.sdk.openadsdk.dj.sya.ycx(System.currentTimeMillis(), tnVar, strYcx, "mrc_show", new com.bytedance.sdk.openadsdk.dy.zb.ycx() { // from class: com.bytedance.sdk.openadsdk.oty.zb.dj.1.1
                    public JSONObject sya() {
                        return jSONObject;
                    }

                    public JSONObject ycx() {
                        return jSONObjectYcx;
                    }
                });
            }
        });
    }
}
