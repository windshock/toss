package com.alibaba.griver.api.common.config;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.config.AppUpdateIntervalExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverAppInfoConfig {
    public long a;
    public long b;
    public int c;
    public int d;

    public GriverAppInfoConfig(JSONObject jSONObject) {
        this.a = 864000L;
        this.b = 3600L;
        this.c = 5;
        this.d = 30;
        if (jSONObject != null) {
            try {
                this.a = JSONUtils.getLong(jSONObject, "preReqRate", 864000L);
                this.b = JSONUtils.getLong(jSONObject, "updateReqRate", 3600L);
                this.c = JSONUtils.getInt(jSONObject, "app_async_update_delay", 5);
                this.d = JSONUtils.getInt(jSONObject, "expireTime", 30);
            } catch (Throwable th) {
                GriverLogger.w("GriverAppInfoConfig", "get app info config error" + th);
            }
        }
        AppUpdateIntervalExtension appUpdateIntervalExtension = (AppUpdateIntervalExtension) RVProxy.get(AppUpdateIntervalExtension.class, true);
        if (appUpdateIntervalExtension != null) {
            long jAsyncUpdateIntervalForApp = appUpdateIntervalExtension.asyncUpdateIntervalForApp();
            long jSyncUpdateIntervalForApp = appUpdateIntervalExtension.syncUpdateIntervalForApp();
            GriverLogger.d("GriverAppInfoConfig", "get app info Extension asyncUpdateTime" + jAsyncUpdateIntervalForApp + " syncUpdateTime " + jSyncUpdateIntervalForApp);
            this.a = jSyncUpdateIntervalForApp;
            this.b = jAsyncUpdateIntervalForApp;
        }
    }

    public int getAppAsyncUpdateDelay() {
        return this.c;
    }

    public int getExpireTime() {
        return this.d;
    }

    public long getPreReqRate() {
        return this.a;
    }

    public long getUpdateReqRate() {
        return this.b;
    }
}
