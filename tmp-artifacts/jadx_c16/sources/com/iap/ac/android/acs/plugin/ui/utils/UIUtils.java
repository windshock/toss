package com.iap.ac.android.acs.plugin.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class UIUtils {
    private UIUtils() {
    }

    public static int dp2px(@NonNull Context context, int i) {
        return (int) ((i * getMetrics(context).density) + 0.5d);
    }

    public static String encryptPhoneNumber(@Nullable String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 7) ? str : str.replaceAll("(?<=\\d{3})\\d(?=\\d{4})", "*");
    }

    public static String getLocale(@NonNull Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            ACLog.e("IAPConnectPlugin", "UIUtils#getLocale, resources is null");
            return "";
        }
        Configuration configuration = resources.getConfiguration();
        if (configuration == null) {
            ACLog.e("IAPConnectPlugin", "UIUtils#getLocale, configuration is null");
            return "";
        }
        Locale locale = !configuration.getLocales().isEmpty() ? configuration.getLocales().get(0) : null;
        if (locale == null) {
            ACLog.e("IAPConnectPlugin", "UIUtils#getLocale, locale is null");
            return "";
        }
        ACLog.d("IAPConnectPlugin", "UIUtils#getLocale, locale: " + locale);
        return locale.toString();
    }

    private static DisplayMetrics getMetrics(@NonNull Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static int getScreenHeight(@NonNull Context context) {
        return getMetrics(context).heightPixels;
    }

    public static int getScreenWidth(@NonNull Context context) {
        return getMetrics(context).widthPixels;
    }

    public static void hideSoftInput(@NonNull Context context, @NonNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            } catch (Throwable th) {
                ACLog.e("IAPConnectPlugin", "hide soft input error", th);
            }
        }
    }

    public static boolean isActivityDisabled(@Nullable Activity activity) {
        if (activity == null) {
            ACLog.e("IAPConnectPlugin", "UIUtils#isActivityDisabled, activity is null");
            return true;
        }
        if (activity.isFinishing()) {
            ACLog.e("IAPConnectPlugin", "UIUtils#isActivityDisabled, activity is finishing");
            return true;
        }
        if (!activity.isDestroyed()) {
            return false;
        }
        ACLog.e("IAPConnectPlugin", "UIUtils#isActivityDisabled, activity is destroyed");
        return true;
    }

    public static boolean isNumeric(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static int px2dp(@NonNull Context context, int i) {
        return (int) ((i / getMetrics(context).density) + 0.5d);
    }

    public static void showSoftInput(@NonNull final Context context, @NonNull final View view) {
        view.postDelayed(new Runnable() { // from class: com.iap.ac.android.acs.plugin.ui.utils.UIUtils.1
            @Override // java.lang.Runnable
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null) {
                    try {
                        inputMethodManager.showSoftInput(view, 0);
                    } catch (Throwable th) {
                        ACLog.e("IAPConnectPlugin", "show soft input error", th);
                    }
                }
            }
        }, 300L);
    }
}
