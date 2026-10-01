package com.alibaba.ariver.app.api.ui.darkmode;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ThemeUtils {
    public static final String COLOR_SCHEME_DARK = "dark";
    public static final String COLOR_SCHEME_LIGHT = "light";
    public static final String KEY_COLOR_SCHEME = "colorSchemes";
    private static String sAppConfigColorScheme = "";

    public static boolean isSupportDarkTheme(App app) {
        JSONArray jSONArray;
        AppConfigModel appConfigModel = (AppConfigModel) app.getData(AppConfigModel.class);
        if (appConfigModel == null || (jSONArray = JSONUtils.getJSONArray(appConfigModel.getAppLaunchParams(), "supportColorScheme", (JSONArray) null)) == null) {
            return false;
        }
        return jSONArray.contains(COLOR_SCHEME_DARK);
    }

    public static String getColorScheme(@NonNull Configuration configuration) {
        if (isDarkMode(configuration)) {
            return COLOR_SCHEME_DARK;
        }
        return COLOR_SCHEME_LIGHT;
    }

    public static void setAppConfigColorScheme(String str) {
        sAppConfigColorScheme = str;
    }

    public static boolean isDarkMode(@NonNull Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return (uiModeManager != null && uiModeManager.getNightMode() == 2) || isDarkMode(context.getResources().getConfiguration()) || isDarkModeByAppConfig();
    }

    public static boolean isDarkMode(@NonNull Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    private static boolean isDarkModeByAppConfig() {
        return TextUtils.equals(sAppConfigColorScheme, COLOR_SCHEME_DARK);
    }
}
