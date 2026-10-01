package com.bytedance.sdk.component.ycx;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oty.sya;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class uh {
    private static boolean ycx;

    static String ycx(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i2 = th instanceof dy ? ((dy) th).ycx : 0;
        try {
            jSONObject.put("code", i2);
            jSONObject.put("__code", i2);
            jSONObject.put("__msg", (th == null || th.getMessage() == null) ? "" : th.getMessage());
            return jSONObject.toString();
        } catch (JSONException e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "aOs/nAKwYN2FYtJRnBSy", "XOs5sBGuZtWyT8RNgx+zLQ==", 27);
            return "{\"code\":" + i2 + ",\"__code\":" + i2 + ",\"__msg\":\"unknown json error\"}";
        }
    }

    static String ycx(String str, boolean z) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1,\"__code\":1,\"__msg\":\"Success\"}";
        }
        if (ycx && !z) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__code\":1,\"__msg\":\"Success\",\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return strConcat + "}";
    }

    static String ycx() {
        return "";
    }

    static void ycx(boolean z) {
        ycx = z;
    }
}
