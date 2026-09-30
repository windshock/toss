package com.iap.ac.android.biz.common.configcenter;

import android.text.TextUtils;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ConfigUtils {
    private static final String TAG = "ConfigUtils";

    public static boolean canUseTopWhiteList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            try {
                if (!jSONObject.optBoolean("enable", z)) {
                    return false;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("blackList");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        if (str.startsWith(String.valueOf(jSONArrayOptJSONArray.get(i)))) {
                            return false;
                        }
                    }
                }
                if (jSONObject.optBoolean("disableWhiteList", z)) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("whiteList");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        if (str.startsWith(jSONArrayOptJSONArray2.getString(i2))) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                ACLog.w(TAG, "just print" + th);
            }
        }
        return z;
    }
}
