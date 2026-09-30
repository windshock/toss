package com.alibaba.griver.core.ui.activity;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.activity.ActivityHelper;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverKeepAliveFullLinkStageMonitor;
import com.alibaba.griver.core.keepalive.KeepAliveAppManager;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverBaseActivity$Back extends GriverBaseActivity {
    public boolean f = false;

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        App app;
        ActivityHelper activityHelper = ((GriverBaseActivity) this).mActivityHelper;
        boolean z = true;
        if (activityHelper != null && (app = activityHelper.getApp()) != null) {
            z = BundleUtils.getBoolean(app.getSceneParams(), "show_finish_anim", true);
        }
        super.finish();
        if (z) {
            overridePendingTransition(R.anim.griver_core_app_close_enter_left_in, R.anim.griver_core_app_close_exit_right_out);
        } else {
            overridePendingTransition(0, 0);
        }
        try {
            finishAndRemoveTask();
        } catch (Throwable unused) {
            GriverLogger.w("GriverBaseActivity", "low android version not support this api: finishAndRemoveTask");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finishAndRemoveTask() {
        App app;
        ActivityHelper activityHelper = ((GriverBaseActivity) this).mActivityHelper;
        boolean z = true;
        if (activityHelper != null && (app = activityHelper.getApp()) != null) {
            z = BundleUtils.getBoolean(app.getSceneParams(), "show_finish_anim", true);
        }
        super.finishAndRemoveTask();
        if (z) {
            overridePendingTransition(R.anim.griver_core_app_close_enter_left_in, R.anim.griver_core_app_close_exit_right_out);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onResume() {
        App app;
        super.onResume();
        ActivityHelper activityHelper = ((GriverBaseActivity) this).mActivityHelper;
        if (activityHelper == null || (app = activityHelper.getApp()) == null) {
            return;
        }
        GriverKeepAliveFullLinkStageMonitor stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverKeepAliveFullLinkStageMonitor.getMonitorToken(app));
        if (stageMonitor != null) {
            stageMonitor.restart();
        }
        if (!this.f) {
            final AppModel appModelQueryAppInfo = GriverAppCenter.queryAppInfo(app.getAppId(), app.getAppVersion());
            if (appModelQueryAppInfo == null || appModelQueryAppInfo.getAppInfoModel() == null) {
                return;
            } else {
                ImageUtils.loadImage(appModelQueryAppInfo.getAppInfoModel().getLogo(), new ImageListener() { // from class: com.alibaba.griver.core.ui.activity.GriverBaseActivity$Back.1
                    @Override // com.alibaba.griver.base.common.adapter.ImageListener
                    public void onImage(final Bitmap bitmap) {
                        GriverBaseActivity$Back.this.runOnUiThread(new Runnable() { // from class: com.alibaba.griver.core.ui.activity.GriverBaseActivity.Back.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                GriverBaseActivity$Back.this.setTaskDescription(new ActivityManager.TaskDescription(appModelQueryAppInfo.getAppInfoModel().getName(), bitmap));
                                GriverBaseActivity$Back.this.f = true;
                            }
                        });
                    }
                });
            }
        }
        KeepAliveAppManager.getInstance().moveFromTaskToFrontAliveActivityByAppId(app.getAppId(), app.getStartToken());
    }

    public void onStart() {
        super.onStart();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
