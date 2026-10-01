package com.bytedance.sdk.openadsdk.oem;

import android.content.Intent;
import com.bytedance.sdk.component.fby.zb.sya;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.dy.zb.ycx;
import com.bytedance.sdk.openadsdk.utils.oby;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class IPBroadcastReceiver$2 extends sya {
    final /* synthetic */ Intent ycx;
    final /* synthetic */ IPBroadcastReceiver zb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IPBroadcastReceiver$2(IPBroadcastReceiver iPBroadcastReceiver, String str, Intent intent) {
        super(str);
        this.zb = iPBroadcastReceiver;
        this.ycx = intent;
    }

    public void run() {
        try {
            int intExtra = this.ycx.getIntExtra("event_type", 0);
            final String stringExtra = this.ycx.getStringExtra("event_track");
            if (intExtra == 7 || intExtra == 9 || stringExtra == null) {
                return;
            }
            final String stringExtra2 = this.ycx.getStringExtra("event_id");
            final String stringExtra3 = this.ycx.getStringExtra("app_package_name");
            final String stringExtra4 = this.ycx.getStringExtra("market_version");
            final String stringExtra5 = this.ycx.getStringExtra("caller");
            final int iYcx = zb.ycx(intExtra);
            final int iZb = zb.zb(intExtra);
            Integer.valueOf(intExtra);
            Integer.valueOf(iYcx);
            Integer.valueOf(iZb);
            ycx ycxVarYcx = IPBroadcastReceiver.ycx(this.zb);
            if (iYcx > 0 && ycxVarYcx != null) {
                ycxVarYcx.ycx(stringExtra3, iYcx);
            }
            final tn tnVarYcx = this.zb.ycx(stringExtra3);
            if (tnVarYcx != null) {
                com.bytedance.sdk.openadsdk.dj.sya.ycx(System.currentTimeMillis(), tnVarYcx, oby.ycx(tnVarYcx), "ip_listener_log", new ycx() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver$2.1
                    public JSONObject ycx() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ip_error_code", iYcx);
                            jSONObject.put("ip_market_version", stringExtra4);
                            jSONObject.put("ip_app_pkg", stringExtra3);
                            jSONObject.put("ip_caller_pkg", stringExtra5);
                            jSONObject.put("ip_event_id", stringExtra2);
                            jSONObject.put("ip_event_track", stringExtra);
                            jSONObject.put("ip_status", iZb);
                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.zb(IPBroadcastReceiver$2.this.zb));
                            tn tnVar = tnVarYcx;
                            if (tnVar != null) {
                                jSONObject.put("ip_is_w2a", tnVar.uh());
                                if (tnVarYcx.oi() != null) {
                                    jSONObject.put("ip_oem_type", tnVarYcx.oi().lt());
                                }
                            }
                            return jSONObject;
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MUrQ==", "ct4Phwy9bcSBWcNviRKlIU3rP9FR+Dg=", "XOs5pQK7Q9SPRPNcmBA=", 244);
                            htf.ycx("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                            return null;
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4MUrQ==", "ct4Phwy9bcSBWcNviRKlIU3rP9FR", "Sfsj", 251);
            htf.ycx("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
            IPBroadcastReceiver.ycx(this.zb, 2);
        }
    }
}
