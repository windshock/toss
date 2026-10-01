package com.alibaba.griver.api.ui;

import com.alibaba.ariver.app.api.ui.loading.SplashView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface GVSplashView extends SplashView {

    public interface OnExitListener {
        void onExit();
    }

    public interface OnReloadListener {
        void onReload();
    }

    void reload();

    void setOnExitListener(OnExitListener onExitListener);

    void setReloadListener(OnReloadListener onReloadListener);
}
