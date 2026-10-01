package com.alibaba.griver.base.stagemonitor.impl;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.common.config.GriverAppConfig;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitor;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverKeepAliveFullLinkStageMonitor extends GriverFullLinkStageMonitor {
    public static final String MONITOR_TOKEN = "full_link_keep_alive";

    public static String getMonitorToken(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return MONITOR_TOKEN;
        }
        return MONITOR_TOKEN + str + str2;
    }

    public void initData(GriverStageMonitor griverStageMonitor) {
        Map paramsMap;
        transitToNext("jumpAppStart");
        transitToNext("jumpAppStartUnix", System.currentTimeMillis());
        transitToNext("frameworkAppStart");
        transitToNext("setupStart");
        transitToNext("setupEnd");
        transitToNext("startActivity");
        transitToNext("attachContext");
        transitToNext("activityCreated");
        transitToNext("fragmentCreateViewed");
        transitToNext("fragmentCreated");
        transitToNext("viewCreate");
        transitToNext("viewCreated");
        transitToNext("appStart");
        transitToNext("engineInit");
        transitToNext("pageInit");
        transitToNext("pageStart");
        transitToNext("loadUrl");
        transitToNext("appxWorkerFrameworkLoaded");
        transitToNext("appxLoaded");
        if (griverStageMonitor != null && (paramsMap = griverStageMonitor.getParamsMap()) != null) {
            ((GriverStageMonitor) this).paramMap.putAll(paramsMap);
        }
        ((GriverStageMonitor) this).paramMap.put("keep_alive", 1);
    }

    public void restart() {
        transitToNext("appxPageLoaded");
        transitToNext("firstScreen");
        if (GriverAppConfig.getInstance().isKeepAliveT2()) {
            transitToNext("jst2_start");
            transitToNext("jst2_fp");
            transitToNext("jst2_fcp");
            transitToNext("jst2_lcp");
            transitToNext("jst2_t2_render");
        }
    }

    public static String getMonitorToken(App app) {
        if (app == null) {
            return MONITOR_TOKEN;
        }
        return MONITOR_TOKEN + app.getAppId() + app.getStartToken();
    }
}
