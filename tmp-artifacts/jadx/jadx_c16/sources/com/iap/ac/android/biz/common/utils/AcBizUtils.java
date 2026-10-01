package com.iap.ac.android.biz.common.utils;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AcBizUtils {
    public static final String AC_CHANNEL_B15 = "B15";
    public static final String AC_DEFAULT_SOURCE_SITE = "GNETW7CN";
    private static final String FUNC_NAME_IS_AC_BIZ = "isAcBizMiniProgram";
    public static final String JS_API_PARAM_KEY_THE_JSAPI_EXECONFIG = "theJSAPIExeConfig";
    public static final String JS_KEY_CHANNEL = "channel";

    public static String getChannel(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sb = new StringBuilder("getChannel jsApi is ");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        ACLog.d("IAPConnect", sb.toString());
        if (jSONObject != null && jSONObject.has(JS_API_PARAM_KEY_THE_JSAPI_EXECONFIG)) {
            try {
                String string = jSONObject.getString(JS_API_PARAM_KEY_THE_JSAPI_EXECONFIG);
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject2 = new JSONObject(string);
                    if (jSONObject2.has(JS_KEY_CHANNEL)) {
                        return jSONObject2.getString(JS_KEY_CHANNEL);
                    }
                }
            } catch (JSONException e) {
                ACLog.e("IAPConnect", "getChannel", e);
            }
        }
        return "";
    }

    @Deprecated
    public static boolean isAcBizMiniProgram(String str, String str2) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            ACLog.e("IAPConnect", "isAcBizMiniProgram, appId is null");
            return false;
        }
        ConfigCenter configCenter = ConfigCenter.INSTANCE;
        List regionMiniAppList = configCenter.getRegionMiniAppList();
        if (regionMiniAppList != null && regionMiniAppList.contains(str)) {
            return true;
        }
        List acsAppIdList = configCenter.getAcsAppIdList();
        if (acsAppIdList != null && acsAppIdList.contains(str)) {
            z = true;
        }
        if (z || str2 == null || !TextUtils.equals(str2, AC_DEFAULT_SOURCE_SITE)) {
            return z;
        }
        return true;
    }

    public static boolean isAcBizPay(String str, String str2, String str3) {
        if (!ConfigCenter.INSTANCE.isToggleNewSourceSite() || TextUtils.isEmpty(str3)) {
            return isAcBizMiniProgram(str, str2);
        }
        if (!TextUtils.isEmpty(str)) {
            return AC_DEFAULT_SOURCE_SITE.equals(str3);
        }
        ACLog.e("IAPConnect", "AcBizUtils#isAcBizPay, appId is null");
        return false;
    }

    public static boolean isAcBizMiniProgram(String str, String str2, String str3) {
        ConfigCenter configCenter = ConfigCenter.INSTANCE;
        if (configCenter.isToggleNewSourceSite() && !TextUtils.isEmpty(str3)) {
            boolean z = false;
            if (TextUtils.isEmpty(str)) {
                ACLog.e("IAPConnect", "isAcBizMiniProgram, appId is null");
                return false;
            }
            List regionMiniAppList = configCenter.getRegionMiniAppList();
            if (regionMiniAppList != null && regionMiniAppList.contains(str)) {
                return true;
            }
            List acsAppIdList = configCenter.getAcsAppIdList();
            if (acsAppIdList != null && acsAppIdList.contains(str)) {
                z = true;
            }
            if (z || str3 == null || !TextUtils.equals(str3, AC_DEFAULT_SOURCE_SITE)) {
                return z;
            }
            return true;
        }
        return isAcBizMiniProgram(str, str2);
    }
}
