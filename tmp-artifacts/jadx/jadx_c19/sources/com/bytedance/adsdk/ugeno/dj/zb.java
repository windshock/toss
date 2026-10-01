package com.bytedance.adsdk.ugeno.dj;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dj.ycx;
import com.bytedance.adsdk.ugeno.lt;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public static String ycx(String str, JSONObject jSONObject) {
        ycx ycxVarSya;
        ycx.InterfaceC0004ycx interfaceC0004ycxYcx;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (ycxVarSya = lt.ycx().sya()) != null && (interfaceC0004ycxYcx = ycxVarSya.ycx(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0004ycxYcx.ycx(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static Object ycx(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return null;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        return (strValueOf.startsWith("${") && strValueOf.endsWith("}")) ? ycx(strValueOf, jSONObject) : obj;
    }
}
