package com.alibaba.exthub.base;

import android.content.Context;
import android.content.Intent;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubAppContext implements AppContext {
    public void createTabBar(Page page) {
    }

    public void destroy() {
    }

    public void exitPage(Page page, boolean z) {
    }

    public Intent getActivityStartIntent() {
        return null;
    }

    public boolean isTaskRoot() {
        return false;
    }

    public boolean moveToBackground() {
        return false;
    }

    public boolean pushPage(Page page) {
        return false;
    }

    public void start(Page page) {
    }

    public Context getContext() {
        if (RVProxy.get(RVEnvironmentService.class) == null || ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity() == null) {
            return null;
        }
        return (Context) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity().get();
    }
}
