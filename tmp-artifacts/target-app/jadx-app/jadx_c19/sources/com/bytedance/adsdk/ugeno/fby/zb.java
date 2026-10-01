package com.bytedance.adsdk.ugeno.fby;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public static void ycx(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONObject ycx(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONArray ycx(JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONArray(com.bytedance.adsdk.ugeno.dj.zb.ycx(str, jSONObject));
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public static JSONArray ycx(String str, JSONArray jSONArray) {
        return ycx(null, str, jSONArray);
    }

    public static void ycx(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            Object objOpt = jSONArray2.opt(i2);
            if (objOpt != null) {
                jSONArray.put(objOpt);
            }
        }
    }
}
