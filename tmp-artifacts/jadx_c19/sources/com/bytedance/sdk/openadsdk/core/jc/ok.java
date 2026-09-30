package com.bytedance.sdk.openadsdk.core.jc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.jw;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.oty.sya;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok {
    public static void ycx(String str, int i2, String str2, String str3, String str4, tn tnVar) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            str2 = jw.ycx(i2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            tn.ycx ycxVarJp = tnVar.jp();
            if (ycxVarJp != null) {
                jSONObject.put("tpl_id", ycxVarJp.dj());
                if ("Web".equals(str)) {
                    if (ycxVarJp.ok()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (tnVar.nc() != null) {
                jSONObject.put("tpl_id", tnVar.nc().ycx());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "fvY9hwaveuKWT9lJoRCuKVzrPw==", "VOAfkA24bNWmS95R", 46);
        }
        com.bytedance.sdk.openadsdk.dy.dj.ycx().ycx(com.bytedance.sdk.openadsdk.dy.ycx.dj.zb().ycx(ycx(str3)).sya(str4).lud(tnVar != null ? tnVar.ac() : "").zb(i2).zb(jSONObject.toString()).lt(str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int ycx(String str) {
        char c;
        switch (str.hashCode()) {
            case -1695837674:
                if (!str.equals("banner_ad")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 7;
        }
        if (c == 2) {
            return 3;
        }
        if (c != 3) {
            return c != 4 ? 5 : 2;
        }
        return 8;
    }
}
