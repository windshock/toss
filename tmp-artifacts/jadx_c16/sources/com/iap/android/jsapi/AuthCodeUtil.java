package com.iap.android.jsapi;

import android.text.TextUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AuthCodeUtil {
    private static final Map<String, String> DEFAULT_SCOPE_CONVERSION_MAP;
    private static final Map<String, String> DEFAULT_SCOPE_RETURN_MAP;
    private static final String PARAM_AUTH_CLIENT_ID = "authClientId";
    private static final String TAG = "AuthCodeUtil";

    static {
        HashMap map = new HashMap(4);
        DEFAULT_SCOPE_CONVERSION_MAP = map;
        HashMap map2 = new HashMap();
        DEFAULT_SCOPE_RETURN_MAP = map2;
        map.put("auth_base", com.iap.ac.android.acs.plugin.utils.AuthCodeUtil.SCOPE_BASE_USER_INFO);
        map.put("auth_user", "USER_INFO");
        map2.put(com.iap.ac.android.acs.plugin.utils.AuthCodeUtil.SCOPE_BASE_USER_INFO, "auth_base");
        map2.put("USER_INFO", "auth_user");
    }

    public static String getAuthClientId(IAPConnectPluginContext iAPConnectPluginContext) {
        JSONObject jSONObject = iAPConnectPluginContext.acParams;
        if (jSONObject == null) {
            ACLog.e(TAG, "AuthCodeUtil#getAuthClientId, acParams is null, return app id");
            return iAPConnectPluginContext.miniProgramAppID;
        }
        String strOptString = jSONObject.optString(PARAM_AUTH_CLIENT_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            return strOptString;
        }
        ACLog.d(TAG, "AuthCodeUtil#getAuthClientId, auth client id in acParams is empty, return app id");
        return iAPConnectPluginContext.miniProgramAppID;
    }

    public static List<String> convertScopes(List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e(TAG, "AuthCodeUtil#convertScopes, scopes is empty, return empty list");
            return new ArrayList();
        }
        Map<String, String> map = DEFAULT_SCOPE_CONVERSION_MAP;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (map.containsKey(str)) {
                arrayList.add(map.get(str));
            } else {
                arrayList.add(str);
            }
        }
        ACLog.d(TAG, "AuthCodeUtil#convertScopes: " + arrayList);
        return arrayList;
    }

    private static boolean isInOriginalList(List<String> list, String str) {
        return list != null && list.contains(str);
    }

    public static List<String> convertSuccessScopes(List<String> list, List<String> list2) {
        if (list == null || list.isEmpty()) {
            ACLog.e(TAG, "AuthCodeUtil#convertSuccessScopes, scopes is empty, return empty list");
            return new ArrayList();
        }
        Map<String, String> map = DEFAULT_SCOPE_RETURN_MAP;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (map.containsKey(str) && !isInOriginalList(list2, str)) {
                arrayList.add(map.get(str));
            } else {
                arrayList.add(str);
            }
        }
        ACLog.d(TAG, "AuthCodeUtil#convertScopes: " + arrayList);
        return arrayList;
    }

    public static Map<String, String> convertGNErrorScopes2Alipay(Map<String, String> map, List<String> list) {
        if (map == null || map.isEmpty()) {
            ACLog.e(TAG, "AuthCodeUtil#convertGNErrorScopes2Alipay, error GN scope map is empty, return empty map");
            return new HashMap();
        }
        Map<String, String> map2 = DEFAULT_SCOPE_RETURN_MAP;
        HashMap map3 = new HashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (map2.containsKey(key) && !isInOriginalList(list, key)) {
                map3.put(map2.get(key), entry.getValue());
            } else {
                map3.put(key, entry.getValue());
            }
        }
        ACLog.d(TAG, "AuthCodeUtil#convertGNErrorScopes2Alipay: " + map3);
        return map3;
    }
}
