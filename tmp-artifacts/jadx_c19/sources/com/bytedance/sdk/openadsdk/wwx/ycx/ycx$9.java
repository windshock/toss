package com.bytedance.sdk.openadsdk.wwx.ycx;

import com.bytedance.sdk.openadsdk.dj.sya;
import com.bytedance.sdk.openadsdk.dy.zb.ycx;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ycx$9 implements Runnable {
    final /* synthetic */ ycx sya;
    final /* synthetic */ int ycx;
    final /* synthetic */ int zb;

    ycx$9(ycx ycxVar, int i2, int i3) {
        this.sya = ycxVar;
        this.ycx = i2;
        this.zb = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ycx.jc(this.sya)) {
            ycx.ea(this.sya).setVisibility(0);
            if (ycx.ok(this.sya) != null) {
                ycx.ok(this.sya).ycx(this.ycx);
            }
            this.sya.ycx(true);
        }
        ycx.lud(this.sya).ul(ycx.jc(this.sya));
        ycx.ul(this.sya).sya();
        if (ycx.ry(this.sya).get()) {
            sya.ycx(System.currentTimeMillis(), ycx.sya(this.sya), ycx.dj(this.sya), "playable_track", new ycx() { // from class: com.bytedance.sdk.openadsdk.wwx.ycx.ycx$9.1
                public JSONObject sya() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "remove_loading_page");
                        return jSONObject;
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQTbFoyYFN0k8=", "a+IsjAK+ZcKtS9lcixSybAKqfA==", "XOs5tAeZcdOSS/NcmBA=", 680);
                        return jSONObject;
                    }
                }

                public JSONObject ycx() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("remove_loading_page_type", ycx$9.this.ycx);
                        jSONObject.put("remove_loading_page_reason", ycx$9.this.zb);
                        jSONObject.put("playable_url", ycx.xkz(ycx$9.this.sya));
                        jSONObject.put("duration", ycx.ul(ycx$9.this.sya).getDisplayDuration());
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQTbFoyYFN0k8=", "a+IsjAK+ZcKtS9lcixSybAKqfA==", "XOs5pQK7Q9SPRPNcmBA=", 698);
                        return null;
                    }
                }
            });
        }
    }
}
