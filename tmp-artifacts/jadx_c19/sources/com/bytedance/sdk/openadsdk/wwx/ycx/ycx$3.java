package com.bytedance.sdk.openadsdk.wwx.ycx;

import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.common.sya;
import com.bytedance.sdk.openadsdk.wwx.dj;
import com.bytedance.sdk.openadsdk.wwx.ycx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ycx$3 extends ycx {
    final /* synthetic */ ycx ycx;

    ycx$3(ycx ycxVar) {
        this.ycx = ycxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dj ycx() {
        char c;
        String strFby = sya.fby();
        int iHashCode = strFby.hashCode();
        if (iHashCode != 1653) {
            if (iHashCode != 1684) {
                if (iHashCode != 1715) {
                    if (iHashCode != 1746) {
                        c = (iHashCode == 3649301 && strFby.equals("wifi")) ? (char) 4 : (char) 65535;
                    } else if (strFby.equals("5g")) {
                        c = 3;
                    }
                } else if (strFby.equals("4g")) {
                    c = 2;
                }
            } else if (strFby.equals("3g")) {
                c = 1;
            }
        } else if (strFby.equals("2g")) {
            c = 0;
        }
        if (c == 0) {
            return dj.ycx;
        }
        if (c == 1) {
            return dj.zb;
        }
        if (c == 2) {
            return dj.sya;
        }
        if (c == 3) {
            return dj.dj;
        }
        if (c == 4) {
            return dj.lud;
        }
        return dj.ul;
    }

    public void zb() {
        ycx.ycx(this.ycx).lt(true);
        if (ycx.zb(this.ycx) != null) {
            ycx.zb(this.ycx).ycx();
        }
    }

    public void sya() {
        if (ycx.ycx(this.ycx).dy() != null) {
            ycx.ycx(this.ycx).dy().ycx(true);
        }
    }

    public void ycx(final JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.bytedance.sdk.openadsdk.dj.sya.ycx(System.currentTimeMillis(), ycx.sya(this.ycx), ycx.dj(this.ycx), "playable_track", new com.bytedance.sdk.openadsdk.dy.zb.ycx() { // from class: com.bytedance.sdk.openadsdk.wwx.ycx.ycx$3.1
            public JSONObject sya() {
                return jSONObject;
            }

            public JSONObject ycx() throws JSONException {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_new_playable", 1);
                    if (ycx.sya(ycx$3.this.ycx).fh()) {
                        jSONObject2.put("is_pre_render", 1);
                    }
                    return jSONObject2;
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQTbFoyYFN0k8=", "a+IsjAK+ZcKtS9lcixSybAiqfA==", "XOs5pQK7Q9SPRPNcmBA=", 305);
                    htf.sya("PlayableManager", e.getMessage());
                    return null;
                }
            }
        });
    }

    public void ycx(int i2, String str) {
        ycx.ycx(this.ycx, false);
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            this.ycx.ycx(2, i2);
        } else if (i2 == 5) {
            this.ycx.ycx(3, i2);
        } else {
            this.ycx.ycx(1, 0);
        }
    }
}
