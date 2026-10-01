package com.iap.ac.android.acs.plugin.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.preset.PresetParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class AuthCodeUtil {
    private static final String CONFIG_KEY_GN_SCOPES_MAP = "acs_alipay_gn_scopes_map";
    private static final Map<String, String> DEFAULT_SCOPE_CONVERSION_MAP;
    private static final String PARAM_AUTH_CLIENT_ID = "authClientId";
    public static final String SCOPE_BASE_USER_INFO = "BASE_USER_INFO";
    public static final String SCOPE_PHONE_NUMBER = "phoneNumber";
    public static final String SCOPE_USER_INFO = "userInfo";
    private static final String SP_KEY_PREF = "authentication_";
    private static final String SP_NAME = "IAPConnectPlugin";
    private static final String TAG = "IAPConnectPlugin";
    private static Map<String, String> authCodeMap;

    static {
        HashMap map = new HashMap(4);
        DEFAULT_SCOPE_CONVERSION_MAP = map;
        map.put("auth_base", SCOPE_BASE_USER_INFO);
        map.put("SCOPE_BASE", SCOPE_BASE_USER_INFO);
        map.put("auth_user", "USER_INFO");
        map.put(SCOPE_BASE_USER_INFO, "auth_base");
        map.put("USER_INFO", "auth_user");
        authCodeMap = new HashMap();
    }

    private AuthCodeUtil() {
    }

    public static Map<String, String> convertGNErrorScopes2Alipay(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            ACLog.e("IAPConnectPlugin", "AuthCodeUtil#convertGNErrorScopes2Alipay, error GN scope map is empty, return empty map");
            return new HashMap();
        }
        Map<String, String> scopeConversionMap = getScopeConversionMap();
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (scopeConversionMap.containsKey(key)) {
                map2.put(scopeConversionMap.get(key), entry.getValue());
            } else {
                map2.put(key, entry.getValue());
            }
        }
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#convertGNErrorScopes2Alipay: " + map2);
        return map2;
    }

    public static List<String> convertScopes(List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e("IAPConnectPlugin", "AuthCodeUtil#convertScopes, scopes is empty, return empty list");
            return new ArrayList();
        }
        Map<String, String> scopeConversionMap = getScopeConversionMap();
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (scopeConversionMap.containsKey(str)) {
                arrayList.add(scopeConversionMap.get(str));
            } else {
                arrayList.add(str);
            }
        }
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#convertScopes: " + arrayList);
        return arrayList;
    }

    public static String getAuthClientId(IAPConnectPluginContext iAPConnectPluginContext) {
        JSONObject jSONObject = iAPConnectPluginContext.acParams;
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "AuthCodeUtil#getAuthClientId, acParams is null, return app id");
            return iAPConnectPluginContext.miniProgramAppID;
        }
        String strOptString = jSONObject.optString(PARAM_AUTH_CLIENT_ID);
        if (!TextUtils.isEmpty(strOptString)) {
            return strOptString;
        }
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#getAuthClientId, auth client id in acParams is empty, return app id");
        return iAPConnectPluginContext.miniProgramAppID;
    }

    public static String getAuthCode(String str, String str2) {
        String str3 = str + PresetParser.UNDERLINE + str2 + PresetParser.UNDERLINE + SPIManager.getInstance().getOpenId();
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#getAuthCode, key: " + str3);
        return authCodeMap.get(str3);
    }

    public static boolean getAuthenticationResult(Context context, String str, String str2) {
        String sPKey = getSPKey(str, str2, SPIManager.getInstance().getOpenId());
        boolean z = context.getSharedPreferences("IAPConnectPlugin", 0).getBoolean(sPKey, false);
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#getAuthenticationResult, key: " + sPKey + ", isAuthenticated: " + z);
        return z;
    }

    public static String getClientId() {
        OAuthConfig oAuthConfig = ACManager.getInstance().getOAuthConfig();
        return oAuthConfig == null ? "" : oAuthConfig.clientId;
    }

    private static String getSPKey(String str, String str2, String str3) {
        return SP_KEY_PREF + str + PresetParser.UNDERLINE + str2 + PresetParser.UNDERLINE + str3;
    }

    private static Map<String, String> getScopeConversionMap() {
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY_GN_SCOPES_MAP, new JSONObject());
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#getScopeConversionMap, get remote config: " + jSONObject);
        Map<String, String> mapJson2StringMap = Utils.json2StringMap(jSONObject);
        if (mapJson2StringMap.isEmpty()) {
            mapJson2StringMap = DEFAULT_SCOPE_CONVERSION_MAP;
        }
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#getScopeConversionMap: " + mapJson2StringMap);
        return mapJson2StringMap;
    }

    public static String removeAuthCode(String str, String str2) {
        String str3 = str + PresetParser.UNDERLINE + str2 + PresetParser.UNDERLINE + SPIManager.getInstance().getOpenId();
        String strRemove = authCodeMap.remove(str3);
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#removeAuthCode, key: " + str3 + ", authCode: " + strRemove);
        return strRemove;
    }

    public static void saveAuthCode(String str, String str2, String str3) {
        String str4 = str + PresetParser.UNDERLINE + str2 + PresetParser.UNDERLINE + SPIManager.getInstance().getOpenId();
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#saveAuthCode, key: " + str4 + ", authCode: " + str3);
        authCodeMap.put(str4, str3);
    }

    public static void saveAuthenticationResult(Context context, String str, String str2, boolean z) {
        String sPKey = getSPKey(str, str2, SPIManager.getInstance().getOpenId());
        ACLog.d("IAPConnectPlugin", "AuthCodeUtil#saveAuthenticationResult, key: " + sPKey + ", isAuthenticated: " + z);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("IAPConnectPlugin", 0).edit();
        editorEdit.putBoolean(sPKey, z);
        editorEdit.apply();
    }
}
