package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.alibaba.ariver.app.activity.ActivityHelper;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.griver.api.appinfo.AppType;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.base.ui.widget.MovableFrameLayout;
import com.alibaba.griver.core.Griver;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DiagnosticToolUtils {
    public static final String INSPECTION_FEATURE_CLASS = "com.alipay.plus.android.miniprogram.inspection.core.GRVAppInspectManager";
    private static final String TAG = "DiagnosticToolUtils";

    private static void initDiagnosticTool(Activity activity, final String str) {
        try {
            TextView textView = (TextView) ((MovableFrameLayout) ((ViewStub) activity.findViewById(R.id.view_stub_diagnostic_tool)).inflate()).findViewById(R.id.tv_diagnostic_tool);
            textView.setTypeface(TypefaceCache.getTypeface(activity, "h5iconfont", "h5iconfont" + File.separator + "titlebar.ttf"));
            final Bundle bundle = new Bundle();
            bundle.putInt("titleColor", 16777215);
            bundle.putInt("backButtonColor", 16777215);
            if (GriverEnv.isSupportGDPR()) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("support_gdpr", "true").build().toString();
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.griver.core.utils.DiagnosticToolUtils.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Griver.openUrl(GriverEnv.getApplicationContext(), str, bundle);
                }
            });
        } catch (Throwable th) {
            GriverLogger.e(TAG, "DiagnosticToolUtils#showDiagnosticTool, setDiagnosticToolMenu failed", th);
        }
    }

    public static void showDiagnosticTool(Activity activity, ActivityHelper activityHelper) {
        if (activity == null || activityHelper == null) {
            return;
        }
        if (GriverInnerConfig.getConfigBoolean("inspect_tool_enabled", true)) {
            GriverLogger.d(TAG, "inspect mode amcs enabled");
            if (activityHelper.getStartClientBundle() != null && activityHelper.getStartClientBundle().startParams != null) {
                String string = BundleUtils.getString(activityHelper.getStartClientBundle().startParams, "inspection_id");
                boolean zIsTiny = AppType.parse(activityHelper.getApp().getAppType()).isTiny();
                if (!TextUtils.isEmpty(string) && zIsTiny) {
                    if (ReflectUtils.classExist(INSPECTION_FEATURE_CLASS)) {
                        try {
                            Class.forName(INSPECTION_FEATURE_CLASS).getDeclaredMethod("startInspection", Activity.class, Long.TYPE).invoke(null, activity, Long.valueOf(activityHelper.getApp().getStartToken()));
                            return;
                        } catch (Throwable th) {
                            GriverLogger.e(TAG, "startInspection fail.", th);
                            return;
                        }
                    }
                    GriverLogger.d(TAG, "To use the inspection feature, please integrate the Inspection submodule.");
                }
            }
        }
        if (RVParams.DEFAULT_LONG_PRESSO_LOGIN.equalsIgnoreCase(GriverInnerConfig.getConfig("diag_dev_tool_disabled"))) {
            return;
        }
        String config = GriverInnerConfig.getConfig("diag_dev_tool_url_overwrite");
        if (TextUtils.isEmpty(config) || activityHelper.getStartClientBundle() == null || activityHelper.getStartClientBundle().startParams == null || activityHelper.getStartClientBundle().sceneParams == null) {
            return;
        }
        Bundle bundle = activityHelper.getStartClientBundle().startParams;
        Bundle bundle2 = activityHelper.getStartClientBundle().sceneParams;
        boolean zEquals = TextUtils.equals(GriverEnv.getAlwaysShowDiagnosticTool(), RVParams.DEFAULT_LONG_PRESSO_LOGIN);
        if (TextUtils.equals(BundleUtils.getString(bundle2, RVParams.APP_TYPE), AppType.WEB_H5.name())) {
            return;
        }
        if (zEquals || AppInfoScene.isDevSource(bundle)) {
            initDiagnosticTool(activity, config);
        }
    }
}
