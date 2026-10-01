package com.iap.ac.android.acs.operation.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CookieUtils {
    public static boolean shouldUseCookieSyncManager() {
        return false;
    }

    private CookieUtils() {
    }

    public static void clearCookies(Context context, String str, String str2) {
        if (shouldUseCookieSyncManager()) {
            CookieSyncManager.createInstance(context);
        }
        String[] cookieParts = getCookieParts(str);
        if (TextUtils.isEmpty(str2) || cookieParts == null || cookieParts.length <= 0) {
            RVLogger.e("GriverOperation", "clearCookie error, key: " + str2 + ", cookie: " + cookieParts);
            return;
        }
        int length = cookieParts.length;
        for (int i = 0; i < length; i++) {
            String str3 = cookieParts[i];
            String[] strArrSplit = str3 == null ? null : str3.split("=");
            if (strArrSplit != null && strArrSplit.length > 0 && TextUtils.equals(str2.trim(), strArrSplit[0].trim())) {
                CookieManager.getInstance().setCookie(str, strArrSplit[0].trim() + "=; Expires=Wed, 05 JAN 2000 23:59:59 GMT");
            }
        }
        if (shouldUseCookieSyncManager()) {
            CookieSyncManager.getInstance().sync();
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Exception e) {
            RVLogger.e("GriverOperation", "clearCookie exception: " + e);
        }
    }

    public static String getCookie(String str, String str2) {
        String[] cookieParts;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (cookieParts = getCookieParts(str)) == null) {
            return null;
        }
        int length = cookieParts.length;
        for (int i = 0; i < length; i++) {
            String str3 = cookieParts[i];
            String[] strArrSplit = str3 == null ? null : str3.split("=");
            if (strArrSplit != null && strArrSplit.length == 2 && TextUtils.equals(strArrSplit[0].trim(), str2.trim())) {
                return strArrSplit[1];
            }
        }
        return null;
    }

    public static String[] getCookieParts(@NonNull String str) {
        String cookie;
        String[] strArr = new String[0];
        try {
            if (TextUtils.isEmpty(str) || (cookie = CookieManager.getInstance().getCookie(str)) == null) {
                return null;
            }
            return cookie.split(";");
        } catch (Throwable th) {
            RVLogger.e("GriverOperation", "CookieUtils#getCookieParts, domaim=" + str + "error=" + th);
            return strArr;
        }
    }

    public static void setCookieParts(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            CookieManager.getInstance().setCookie(str, str2 + "=" + str3);
        } catch (Throwable th) {
            RVLogger.e("GriverOperation", "CookieUtils#getCookieParts, domaim=" + str + "error=" + th);
        }
    }
}
