package com.alibaba.griver.ui.splash;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.ui.GVSplashView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseSplashView implements GVSplashView {
    public App a;
    public GVSplashView.OnReloadListener listener;
    public GVSplashView.OnExitListener onExitListener;

    public BaseSplashView(App app) {
        this.a = app;
    }

    public void exit(SplashView.ExitListener exitListener) {
        if (getStatus() == SplashView.Status.LOADING) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.a, "LoadingEnd");
        }
        GVSplashView.OnExitListener onExitListener = this.onExitListener;
        if (onExitListener != null) {
            onExitListener.onExit();
        }
    }

    @Override // com.alibaba.griver.api.ui.GVSplashView
    public void reload() {
        GVSplashView.OnReloadListener onReloadListener = this.listener;
        if (onReloadListener != null) {
            onReloadListener.onReload();
        }
    }

    @Override // com.alibaba.griver.api.ui.GVSplashView
    public void setOnExitListener(GVSplashView.OnExitListener onExitListener) {
        this.onExitListener = onExitListener;
    }

    @Override // com.alibaba.griver.api.ui.GVSplashView
    public void setReloadListener(GVSplashView.OnReloadListener onReloadListener) {
        this.listener = onReloadListener;
    }

    public void showLoading(EntryInfo entryInfo) {
        if (getStatus() != SplashView.Status.LOADING) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.a, "LoadingStart");
        }
    }
}
