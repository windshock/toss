package com.iap.ac.android.acs.plugin.utils;

import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CallbackUtil {
    private static final String ERROR_CODE_INTERNAL_ERROR = "40004";
    private static final String ERROR_CODE_INVALID_PARAM = "40002";
    private static final String ERROR_CODE_NOT_AUTHORIZED = "40003";
    private static final String ERROR_MESSAGE_INTERNAL_ERROR = "Internal error";
    private static final String ERROR_MESSAGE_INVALID_PARAM = "Invalid parameter";

    private CallbackUtil() {
    }

    public static JSONObject getAuthorizedError(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", ERROR_CODE_NOT_AUTHORIZED);
            jSONObject2.put("msg", "Insufficient Conditions");
            jSONObject2.put("subCode", "isv.invalid-auth-relations");
            jSONObject2.put("subMsg", "not authorized");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("response", jSONObject2);
            jSONObject.put("response", jSONObject3);
            MonitorUtil.monitorError(str, ERROR_CODE_NOT_AUTHORIZED, jSONObject.toString());
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getAuthorizedError JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }

    public static JSONObject getError(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, str2);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str3);
            MonitorUtil.monitorError(str, str2, str3);
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getError JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }

    public static JSONObject getInternalError(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, ERROR_CODE_INTERNAL_ERROR);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str2);
            MonitorUtil.monitorError(str, ERROR_CODE_INTERNAL_ERROR, "Internal error, " + str2);
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getInternalErrorError JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }

    public static JSONObject getInvalidParamError(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", false);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, ERROR_CODE_INVALID_PARAM);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, ERROR_MESSAGE_INVALID_PARAM);
            MonitorUtil.monitorError(str, ERROR_CODE_INVALID_PARAM, "Invalid parameter, " + str2);
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getInvalidParamError JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }

    public static JSONObject getSuccess(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", true);
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getSuccess JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }

    public static JSONObject getError(String str, String str2, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, str2);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str3);
            jSONObject.put("showAuthPageFired", z);
            MonitorUtil.monitorError(str, str2, str3);
            return jSONObject;
        } catch (JSONException e) {
            ACLog.e("IAPConnectPlugin", "CallbackUtil#getError JSONException");
            MonitorUtil.monitorJSONError(str, e);
            return jSONObject;
        }
    }
}
