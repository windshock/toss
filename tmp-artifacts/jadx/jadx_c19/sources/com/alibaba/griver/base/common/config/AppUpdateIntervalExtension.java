package com.alibaba.griver.base.common.config;

import com.alibaba.griver.api.common.GriverExtension;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface AppUpdateIntervalExtension extends GriverExtension {
    default long asyncUpdateIntervalForApp() {
        return 3600L;
    }

    default long syncUpdateIntervalForApp() {
        return 864000L;
    }
}
