package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class WebViewUtils {
    public static void setWindowSoftInputMode(Activity activity, Bundle bundle, boolean z) {
        String string = BundleUtils.getString(bundle, "adjustResize");
        if ("yes".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("h5_enableNewAdjustInput", "")) || !"yes".equalsIgnoreCase(string)) {
            return;
        }
        GriverLogger.d("WebViewUtils", "useResize " + string);
        GriverLogger.d("WebViewUtils", " AndroidBug5497Workaround ");
        AndroidBug5497Workaround.assistActivity(activity, z);
    }

    public static boolean useSW(Bundle bundle) {
        return BundleUtils.getBoolean(bundle, RVParams.isTinyApp, false) || "yes".equalsIgnoreCase(BundleUtils.getString(bundle, "useSW"));
    }
}
