package com.bytedance.sdk.openadsdk.core.jc;

import com.bytedance.sdk.component.jw.ycx.zb;
import com.bytedance.sdk.component.jw.zb.ycx;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.dj.sya;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ry$4 implements zb {
    ry$4() {
    }

    public void ycx(String str, String str2, JSONObject jSONObject) {
        sya.sya(com.bytedance.sdk.openadsdk.utils.zb.ul(), str, str2, jSONObject);
    }

    public void ycx(ycx ycxVar, String str, String str2, JSONObject jSONObject, long j) {
        tn tnVar = new tn();
        tnVar.rmf(ycxVar.zb());
        tnVar.tru(ycxVar.sya());
        tnVar.dv(ycxVar.dj());
        tnVar.oty(ycxVar.lud());
        tnVar.htf(ycxVar.ycx());
        sya.zb(tnVar, str, str2, jSONObject, j);
    }

    public void ycx(ycx ycxVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (ycxVar != null) {
            tn tnVar = new tn();
            tnVar.rmf(ycxVar.zb());
            tnVar.tru(ycxVar.sya());
            tnVar.dv(ycxVar.dj());
            tnVar.oty(ycxVar.lud());
            sya.ycx(System.currentTimeMillis(), tnVar, str, str2, new com.bytedance.sdk.openadsdk.dy.zb.ycx() { // from class: com.bytedance.sdk.openadsdk.core.jc.ry$4.1
                public JSONObject sya() {
                    return jSONObject2;
                }

                public JSONObject ycx() {
                    return jSONObject;
                }
            });
        }
    }
}
