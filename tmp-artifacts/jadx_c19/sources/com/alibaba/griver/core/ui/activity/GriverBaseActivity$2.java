package com.alibaba.griver.core.ui.activity;

import com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor;
import com.alibaba.griver.ui.splash.LoadingView;
import com.alibaba.griver.ui.splash.SplashFragment;
import com.alibaba.griver.ui.splash.SplashLoadingView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverBaseActivity$2 implements SplashFragment.OnLoadingViewInitListener {
    final /* synthetic */ GriverBaseActivity this$0;
    final /* synthetic */ GriverFullLinkStageMonitor val$monitor;

    public GriverBaseActivity$2(GriverBaseActivity griverBaseActivity, GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
        this.this$0 = griverBaseActivity;
        this.val$monitor = griverFullLinkStageMonitor;
    }

    @Override // com.alibaba.griver.ui.splash.SplashFragment.OnLoadingViewInitListener
    public void onInited(LoadingView loadingView) {
        if (loadingView == null || !(loadingView instanceof SplashLoadingView)) {
            return;
        }
        ((SplashLoadingView) loadingView).setOnCancelListener(new LoadingView.OnCancelListener() { // from class: com.alibaba.griver.core.ui.activity.GriverBaseActivity$2.1
            @Override // com.alibaba.griver.ui.splash.LoadingView.OnCancelListener
            public void onCancel() {
                GriverFullLinkStageMonitor griverFullLinkStageMonitor = GriverBaseActivity$2.this.val$monitor;
                if (griverFullLinkStageMonitor != null) {
                    griverFullLinkStageMonitor.addParam("appCloseType", "appCloseByBackButton");
                }
            }
        });
    }
}
