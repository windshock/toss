package com.alibaba.griver.core.keepalive;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class KeepAliveConfig {
    public boolean a;
    public long b;
    public JSONArray c;
    public boolean d;
    public JSONArray e;

    public KeepAliveConfig(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                if (GriverEnv.getDefaultConfig().mini_app_keep_alive) {
                    this.a = true;
                    this.d = true;
                } else {
                    this.a = false;
                    this.d = false;
                }
                this.b = 300000L;
                this.c = new JSONArray();
                this.e = new JSONArray();
                return;
            }
            JSONObject object = JSON.parseObject(str);
            this.a = JSONUtils.getBoolean(object, "enable", false);
            long j = JSONUtils.getLong(object, "alive_time", 300000L);
            this.b = j;
            if (j <= 0) {
                this.b = 300000L;
            }
            this.c = JSONUtils.getJSONArray(object, "white_list", new JSONArray());
            JSONArray jSONArray = JSONUtils.getJSONArray(object, "high_alive_white_list", new JSONArray());
            this.e = new JSONArray();
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.size() && i2 < 3; i2++) {
                    if (!TextUtils.isEmpty(jSONArray.getString(i2))) {
                        this.e.add(jSONArray.get(i2));
                    }
                }
            }
        } catch (Exception e) {
            GriverLogger.e("KeepAliveConfig", "KeepAliveConfig", e);
        }
    }

    public long getAliveTime() {
        return this.b;
    }

    public boolean isEnable() {
        return this.a;
    }

    public boolean isInHighALiveWhiteList(String str) {
        return this.e.contains(str);
    }

    public boolean isInWhiteList(String str) {
        if (this.d) {
            return true;
        }
        return this.c.contains(str);
    }

    public boolean needSupportKeepAlive(String str) {
        if (!this.a) {
            return false;
        }
        if (isInHighALiveWhiteList(str)) {
            return true;
        }
        return isInWhiteList(str);
    }
}
