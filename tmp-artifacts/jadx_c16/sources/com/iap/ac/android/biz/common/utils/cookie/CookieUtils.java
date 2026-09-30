package com.iap.ac.android.biz.common.utils.cookie;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CookieUtils {
    private CookieUtils() {
    }

    public static void clearCookies(Context context, String str, String str2) {
        if (shouldUseCookieSyncManager()) {
            CookieSyncManager.createInstance(context);
        }
        String[] cookieParts = getCookieParts(str);
        if (TextUtils.isEmpty(str2) || cookieParts == null || cookieParts.length <= 0) {
            ACLog.e("IAPConnect", "clearCookie error, key: " + str2 + ", cookie: " + cookieParts);
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
            ACLog.e("IAPConnect", "clearCookie exception: " + e);
        }
    }

    public static String getCookie(String str, String str2) {
        String[] cookieParts;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && (cookieParts = getCookieParts(str)) != null && cookieParts.length > 0) {
            int length = cookieParts.length;
            for (int i = 0; i < length; i++) {
                String str3 = cookieParts[i];
                String[] strArrSplit = str3 == null ? null : str3.split("=");
                if (strArrSplit != null && strArrSplit.length == 2 && TextUtils.equals(strArrSplit[0].trim(), str2.trim())) {
                    return strArrSplit[1];
                }
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
            ACLog.e("IAPConnect", "CookieUtils#getCookieParts, domaim=" + str + "error=" + th);
            return strArr;
        }
    }

    public static boolean shouldUseCookieSyncManager() {
        return false;
    }
}
