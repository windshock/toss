package com.alibaba.griver.base.t2;

import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AndroidT2Config {
    public static final String TAG = "AndroidT2Config";
    public JSONObject a;
    public JSONArray b = null;
    public JSONArray c = null;
    public JSONArray d = null;
    public JSONArray e = null;
    public String f = null;
    public String g = null;
    public String h = null;

    public AndroidT2Config(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final boolean a(String str) {
        return "yes".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str);
    }

    public JSONArray getT2PreloadUrls() {
        return this.e;
    }

    public JSONArray getT2Urls() {
        return this.d;
    }

    public void initConfig() {
        try {
            this.b = JSONUtils.getJSONArray(this.a, "whitelist", new JSONArray());
            this.c = JSONUtils.getJSONArray(this.a, "blacklist", new JSONArray());
            this.f = JSONUtils.getString(this.a, "tiny", RVParams.DEFAULT_LONG_PRESSO_LOGIN);
            this.g = JSONUtils.getString(this.a, "h5", RVParams.DEFAULT_LONG_PRESSO_LOGIN);
            this.h = JSONUtils.getString(this.a, "switch", RVParams.DEFAULT_LONG_PRESSO_LOGIN);
        } catch (Exception e) {
            GriverLogger.w(TAG, "AndroidT2Config#initConfig", e);
        }
    }

    public boolean isCollectT2(String str, boolean z) {
        JSONArray jSONArray = this.c;
        if (jSONArray != null && jSONArray.contains(str)) {
            return false;
        }
        JSONArray jSONArray2 = this.b;
        if (jSONArray2 != null && jSONArray2.contains(str)) {
            return true;
        }
        if (z && a(this.f)) {
            return "yes".equalsIgnoreCase(this.f);
        }
        if (!z && a(this.g)) {
            return "yes".equalsIgnoreCase(this.g);
        }
        if (a(this.h)) {
            return "yes".equalsIgnoreCase(this.h);
        }
        return false;
    }

    public boolean isEmpty() {
        JSONObject jSONObject = this.a;
        return jSONObject == null || jSONObject.isEmpty();
    }

    public void setT2Urls(JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public void setT2UrlsPreload(JSONArray jSONArray) {
        this.e = jSONArray;
    }
}
