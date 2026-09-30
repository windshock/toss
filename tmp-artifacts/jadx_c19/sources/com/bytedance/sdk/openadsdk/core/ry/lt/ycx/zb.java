package com.bytedance.sdk.openadsdk.core.ry.lt.ycx;

import com.bytedance.sdk.openadsdk.core.model.tn;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zb {
    protected tn ycx;

    public abstract String ycx();

    public void ycx(JSONObject jSONObject) {
    }

    public abstract JSONObject zb();

    public zb(tn tnVar) {
        this.ycx = tnVar;
    }

    public static class ycx {
        public static zb ycx(tn tnVar, com.bytedance.sdk.openadsdk.core.ry.lt.ycx ycxVar) {
            if (tnVar == null) {
                return null;
            }
            int iTz = tnVar.tz();
            if (iTz == 1) {
                return new com.bytedance.sdk.openadsdk.core.ry.lt.ycx.ycx(tnVar, ycxVar);
            }
            if (iTz == 3) {
                return new dj(tnVar, ycxVar);
            }
            if (iTz == 7 || iTz == 8) {
                return new lud(tnVar, ycxVar);
            }
            return null;
        }
    }
}
