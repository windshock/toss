package com.iap.ac.android.container.adapter.griver;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class Utils {
    public static JSONObject fastJsonToJson(@Nullable com.alibaba.fastjson.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e("Utils", "fastJsonToJson error: ", e);
            return null;
        }
    }

    public static boolean isGriverContainerInit() {
        return true;
    }

    public static com.alibaba.fastjson.JSONObject jsonObjectToFastJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e("Utils", "jsonObjectToFastJson error: ", e);
            return null;
        }
    }
}
