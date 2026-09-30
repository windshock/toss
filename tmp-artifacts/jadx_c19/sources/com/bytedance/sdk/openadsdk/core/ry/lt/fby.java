package com.bytedance.sdk.openadsdk.core.ry.lt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.htf;
import com.bytedance.sdk.openadsdk.core.model.tn;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    public void ycx(String str, tn tnVar, String str2, Map<String, Object> map) {
        Object obj;
        Object value;
        Object value2;
        if (map != null) {
            try {
                if (map.isEmpty() || (obj = map.get("label")) == null) {
                    return;
                }
                String strValueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(strValueOf)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String strPks = tnVar.pks();
                if ("sendLogExtra".equals(str) && !TextUtils.isEmpty(strPks)) {
                    JSONObject jSONObject2 = new JSONObject(strPks);
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey()) && (value2 = entry.getValue()) != null) {
                            jSONObject2.put(entry.getKey(), String.valueOf(value2));
                        }
                    }
                    jSONObject.put("log_extra", jSONObject2.toString());
                } else {
                    jSONObject.put("log_extra", strPks);
                }
                JSONObject jSONObject3 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey()) && (value = entry2.getValue()) != null) {
                            jSONObject3.put(entry2.getKey(), String.valueOf(value));
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject3.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(tnVar.row()));
                com.bytedance.sdk.openadsdk.dj.sya.ycx(tnVar, "app_union", str2, strValueOf, Long.parseLong(tnVar.if()), 0L, jSONObject, htf.fby(tnVar));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzXvWsKOTvtSiw==", "SOsjkTXvRciH", 65);
            }
        }
    }
}
