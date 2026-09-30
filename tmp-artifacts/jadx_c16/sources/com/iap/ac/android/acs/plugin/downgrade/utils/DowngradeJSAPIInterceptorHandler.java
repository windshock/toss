package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginCallback;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.amcs.JSAPICompatibilityConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DowngradeJSAPIInterceptorHandler {
    private static final String TAG = ApiDowngradeUtils.logTag("DowngradeJSAPIInterceptorHandler");

    public static boolean handleJSAPI(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @Nullable String str, @Nullable JSONObject jSONObject, @NonNull String str2, @NonNull String str3, @NonNull final IAPConnectPluginCallback iAPConnectPluginCallback) {
        JSONObject jSONFromAssets;
        JSONObject jSONObjectOptJSONObject;
        String str4 = TAG;
        ACLog.d(str4, String.format("handleJSAPI start, downgradeType = %s, jsapi = %s, appId = %s, params = %s", str, str2, iAPConnectPluginContext.miniProgramAppID, iAPConnectPluginContext.jsParameters));
        ACLog.d(str4, "get config from server: " + jSONObject);
        if (!JSAPICompatibilityConfigManager.getInstance().isJSAPICompatibilityEnabled()) {
            ACLog.d(str4, "handle() handle cancelled, for apidowngrade is not enabled");
            return false;
        }
        if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
            ACLog.e(str4, "handle error, activity is null or disabled");
            return false;
        }
        String str5 = iAPConnectPluginContext.miniProgramAppID;
        if (TextUtils.isEmpty(str5)) {
            ACLog.e(str4, "handle error, appId is empty ,it may be a H5 page.");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            ACLog.e(str4, "handle error, jsapiName is empty");
            ApiDowngradeLogger.newExceptionLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_INVALID, str5).addParams(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, "handle error, jsapiName is empty").addParams(ApiDowngradeLogger.EXT_KEY_JSAPI_NAME, str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).event();
            return false;
        }
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
            jSONObjectOptJSONObject = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONObject(str2) : null;
            if (jSONObjectOptJSONObject == null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(BizSceneNavigateManager.KEY_DEFAULT)) != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject(str2);
            }
        }
        if (jSONObjectOptJSONObject == null && (jSONFromAssets = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), str3)) != null) {
            jSONObjectOptJSONObject = jSONFromAssets.optJSONObject(str2);
        }
        if (jSONObjectOptJSONObject == null) {
            return false;
        }
        String strOptString = jSONObjectOptJSONObject.optString(ApiDowngradeLogger.EXT_KEY_ACTION_TYPE);
        ApiDowngradeLogger.newBehaviorLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED, str5).addParams(ApiDowngradeLogger.EXT_KEY_ACTION_TYPE, strOptString).addParams(ApiDowngradeLogger.EXT_KEY_JSAPI_NAME, str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).event();
        if (ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObjectOptJSONObject, new IActionHandlerCallback() { // from class: com.iap.ac.android.acs.plugin.downgrade.utils.DowngradeJSAPIInterceptorHandler.1
            @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
            public void onHandleFailure(@NonNull JSONObject jSONObject2) {
                iAPConnectPluginCallback.onResult(jSONObject2);
            }

            @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
            public void onHandleSuccess(@NonNull JSONObject jSONObject2) {
                iAPConnectPluginCallback.onResult(jSONObject2);
            }
        })) {
            return true;
        }
        ApiDowngradeLogger.newBehaviorLogger(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED_FAIL, str5).addParams(ApiDowngradeLogger.EXT_KEY_ACTION_TYPE, strOptString).addParams(ApiDowngradeLogger.EXT_KEY_JSAPI_NAME, str2).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str).addParams(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, "ActionExecutor#handleAction returns false.").event();
        return true;
    }
}
