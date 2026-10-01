package com.iap.ac.android.acs.plugin.downgrade.router;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.ActionExecutor;
import com.iap.ac.android.acs.plugin.downgrade.amcs.NavigateSceneConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.utils.AclAPIContextUtils;
import com.iap.ac.android.biz.common.callback.OpenBizSceneCallback;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class BizSceneNavigateManager {
    public static final String KEY_ALL = "all";
    public static final String KEY_DEFAULT = "default";
    private static final String LOGGER_KEY_FAILED = "failed";
    private static final String LOGGER_KEY_FROM_ALL = "fromAll";
    private static final String LOGGER_KEY_FROM_APPID = "fromAppId";
    private static final String LOGGER_KEY_FROM_COMMON = "fromCommon";
    private static final String LOGGER_KEY_FROM_DEFAULT = "fromDefault";
    private static final String LOGGER_KEY_FROM_REMOTE = "fromRemote";
    private static final String LOGGER_KEY_FROM_SPI = "fromSPI";
    private static final String LOGGER_KEY_FROM_WALLET = "fromWallet";
    private static BizSceneNavigateManager sInstance;
    private static final String TAG = ApiDowngradeUtils.logTag("BizSceneNavigateManager");
    private static final String SCENE_SCHEME_PRESET_PATH_IN_WALLET = ApiDowngradeUtils.dirInAssets() + "scene_scheme_map.json";
    private static final String SCENE_SCHEME_PRESET_PATH_IN_COMMON = ApiDowngradeUtils.dirInAssets() + "scene_scheme_map_in_common.json";
    private String JSON_KEY_PARAM = "param";
    private String JSON_KEY_DOWNGRADED = "downgraded";

    private BizSceneNavigateManager() {
    }

    private void callbackWithError(@NonNull IActionHandlerCallback iActionHandlerCallback, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, 40002);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str);
        } catch (JSONException e) {
            ACLog.e(TAG, "callbackWithError() error: " + e);
        }
        iActionHandlerCallback.onHandleFailure(jSONObject);
    }

    public static BizSceneNavigateManager getInstance() {
        if (sInstance == null) {
            synchronized (BizSceneNavigateManager.class) {
                if (sInstance == null) {
                    sInstance = new BizSceneNavigateManager();
                }
            }
        }
        return sInstance;
    }

    private boolean handleBeforeAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @Nullable JSONObject jSONObject, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        String str2;
        JSONObject jSONObjectOptJSONObject2;
        String str3 = TAG;
        ACLog.d(str3, "handleBeforeNavigate() start beforeActionConfig: " + jSONObject);
        if (jSONObject == null) {
            ACLog.d(str3, "handleBeforeNavigate() canceled for the beforeActionConfig is null");
            return false;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_APPID;
        } else {
            jSONObjectOptJSONObject = null;
            str2 = null;
        }
        if (jSONObjectOptJSONObject == null && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject(KEY_DEFAULT)) != null) {
            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_DEFAULT;
        }
        if (jSONObjectOptJSONObject != null) {
            onHandleActionSuccess(iAPConnectPluginContext, jSONObjectOptJSONObject, iActionHandlerCallback);
            ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_DOWNGRADE_BEFORE, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str2).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, iAPConnectPluginContext.jsParameters).event();
            ACLog.d(str3, "handleBeforeNavigate() success, returns true to consume the action.");
            return true;
        }
        ACLog.d(str3, "handleBeforeNavigate() canceled for the beforeActionConfig in sceneCode: " + str + " is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailureAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        String str2;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject failureAction = NavigateSceneConfigManager.getInstance().getFailureAction();
        String str3 = TAG;
        ACLog.d(str3, "handleFailureNavigate() start, failure config: " + failureAction);
        String str4 = LOGGER_KEY_FAILED;
        if (failureAction != null) {
            JSONObject jSONObjectOptJSONObject3 = failureAction.optJSONObject(iAPConnectPluginContext.miniProgramAppID);
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str);
                str2 = LOGGER_KEY_FROM_APPID;
            } else {
                jSONObjectOptJSONObject = null;
                str2 = null;
            }
            if (jSONObjectOptJSONObject == null && (jSONObjectOptJSONObject2 = failureAction.optJSONObject(KEY_DEFAULT)) != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(str);
                str2 = LOGGER_KEY_FROM_DEFAULT;
            }
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = failureAction.optJSONObject(KEY_ALL);
                if (jSONObjectOptJSONObject != null) {
                    str4 = LOGGER_KEY_FROM_ALL;
                }
            } else {
                str4 = str2;
            }
            if (jSONObjectOptJSONObject != null) {
                onHandleActionSuccess(iAPConnectPluginContext, jSONObjectOptJSONObject, iActionHandlerCallback);
            } else {
                onHandleActionFailed(iActionHandlerCallback, "failure action is null in sceneCode:" + str);
            }
        } else {
            callbackWithError(iActionHandlerCallback, "handleFailureNavigate() the failureActionConfig is null");
            ACLog.e(str3, "handleFailureNavigate() the failureActionConfig is null");
        }
        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_DOWNGRADE_AFTER, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_DOWNGRADE_TYPE, str4).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, iAPConnectPluginContext.jsParameters).event();
    }

    private void handleSceneNavigateAndFailure(@NonNull final IAPConnectPluginContext iAPConnectPluginContext, @Nullable JSONObject jSONObject, @NonNull final String str, @NonNull final IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        String str2;
        JSONObject jSONFromAssets;
        JSONObject jSONFromAssets2;
        String str3 = TAG;
        ACLog.d(str3, "handleSceneNavigateAndFailure() start sceneAction: " + jSONObject);
        if (jSONObject != null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_REMOTE;
        } else {
            jSONObjectOptJSONObject = null;
            str2 = null;
        }
        if (jSONObjectOptJSONObject == null && (jSONFromAssets2 = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), SCENE_SCHEME_PRESET_PATH_IN_WALLET)) != null) {
            jSONObjectOptJSONObject = jSONFromAssets2.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_WALLET;
        }
        if (jSONObjectOptJSONObject == null && (jSONFromAssets = ApiDowngradeUtils.readJSONFromAssets(iAPConnectPluginContext.getContext(), SCENE_SCHEME_PRESET_PATH_IN_COMMON)) != null) {
            jSONObjectOptJSONObject = jSONFromAssets.optJSONObject(str);
            str2 = LOGGER_KEY_FROM_COMMON;
        }
        final String str4 = str2;
        if (jSONObjectOptJSONObject != null) {
            ACLog.d(str3, "handleSceneNavigateAndFailure() start handleAction by ActionExecutor#handleAction(), sceneCode: " + str + ", sceneAction: " + jSONObjectOptJSONObject);
            ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObjectOptJSONObject, new IActionHandlerCallback() { // from class: com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager.2
                @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
                public void onHandleFailure(@NonNull JSONObject jSONObject2) {
                    ACLog.d(BizSceneNavigateManager.TAG, "handleSceneNavigateAndFailure() handleAction by ActionExecutor#handleAction(), onHandleFailure() response: " + jSONObject2);
                    ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_FAILURE, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, str4).event();
                    iActionHandlerCallback.onHandleFailure(jSONObject2);
                }

                @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
                public void onHandleSuccess(@NonNull JSONObject jSONObject2) {
                    ACLog.d(BizSceneNavigateManager.TAG, "handleSceneNavigateAndFailure() handleAction by ActionExecutor#handleAction(), onHandleSuccess() response: " + jSONObject2);
                    ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, str4).event();
                    iActionHandlerCallback.onHandleSuccess(jSONObject2);
                }
            });
            return;
        }
        Map jSONParamsToMap = ApiDowngradeUtils.parseJSONParamsToMap(iAPConnectPluginContext.jsParameters.optJSONObject(this.JSON_KEY_PARAM));
        AclAPIContext aclAPIContextCreateAclAPIContext = AclAPIContextUtils.createAclAPIContext(iAPConnectPluginContext);
        try {
            ACLog.d(str3, String.format("before SPIManager#openBizScene, sceneCode: %s, jsParameters: %s", str, iAPConnectPluginContext.jsParameters));
            SPIManager.getInstance().openBizScene(str, jSONParamsToMap, aclAPIContextCreateAclAPIContext, new OpenBizSceneCallback() { // from class: com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager.3
                @Override // com.iap.ac.android.biz.common.callback.OpenBizSceneCallback
                public void sendJSONResponse(@NonNull JSONObject jSONObject2) throws Throwable {
                    ACLog.d(BizSceneNavigateManager.TAG, String.format("after SPIManager#openBizScene, sceneCode: %s, result: %s", str, jSONObject2));
                    if (jSONObject2.optBoolean("success", false)) {
                        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_NAVIGATE_TYPE, BizSceneNavigateManager.LOGGER_KEY_FROM_SPI).event();
                        iActionHandlerCallback.onHandleSuccess(jSONObject2);
                    } else {
                        ACLog.e(BizSceneNavigateManager.TAG, "handle scene navigate failed, start handle by failure action.");
                        ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_FAILURE, iAPConnectPluginContext.miniProgramAppID, str).addParams(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, 40002).addParams(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, "handle scene navigate failed, start handle by failure action.").event();
                        BizSceneNavigateManager.this.handleFailureAction(iAPConnectPluginContext, str, iActionHandlerCallback);
                    }
                }
            });
        } catch (Exception e) {
            handleFailureAction(iAPConnectPluginContext, str, iActionHandlerCallback);
            ACLog.e(TAG, "handleSceneNavigateAndFailure() failed with exception :" + e);
        }
    }

    public void navigate(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull String str, @NonNull IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        String str2 = iAPConnectPluginContext.miniProgramAppID;
        JSONObject jSONObject = iAPConnectPluginContext.jsParameters;
        String str3 = TAG;
        ACLog.d(str3, "navigate() appId: " + str2 + ", sceneCode: " + str + ", params: " + jSONObject);
        if (!TextUtils.isEmpty(str2)) {
            if (handleBeforeAction(iAPConnectPluginContext, NavigateSceneConfigManager.getInstance().getBeforeAction(), str, iActionHandlerCallback)) {
                return;
            }
            ApiDowngradeLogger.newLoggerInScene(ApiDowngradeLogger.BL_ACS_NAVIGATE_SCENE_MAP_START, str2, str).addParams(ApiDowngradeLogger.EXT_KEY_EXT_PARAMS, jSONObject).event();
            handleSceneNavigateAndFailure(iAPConnectPluginContext, NavigateSceneConfigManager.getInstance().getSceneSchemeMap(), str, iActionHandlerCallback);
            return;
        }
        String str4 = "the appId is empty when navigate to sceneCode: " + str;
        onHandleActionFailed(iActionHandlerCallback, str4);
        ACLog.e(str3, str4);
        ApiDowngradeLogger.logException(ApiDowngradeLogger.EVENT_JSAPI_DOWNGRADE_APPID_IS_NULL, str4);
    }

    public void onHandleActionFailed(@NonNull IActionHandlerCallback iActionHandlerCallback, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(this.JSON_KEY_DOWNGRADED, false);
            jSONObject.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str);
        } catch (JSONException e) {
            ACLog.e(TAG, "handleBeforeNavigate() onHandleFailure() put value error: " + e);
        }
        iActionHandlerCallback.onHandleFailure(jSONObject);
    }

    public void onHandleActionSuccess(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull final IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        ActionExecutor.getInstance().handleAction(iAPConnectPluginContext, jSONObject, new IActionHandlerCallback() { // from class: com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager.1
            @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
            public void onHandleFailure(@NonNull JSONObject jSONObject2) throws JSONException {
                ACLog.d(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleFailure() response: " + jSONObject2);
                try {
                    jSONObject2.put(BizSceneNavigateManager.this.JSON_KEY_DOWNGRADED, true);
                } catch (JSONException e) {
                    ACLog.w(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleFailure() put value error: " + e);
                }
                iActionHandlerCallback.onHandleSuccess(jSONObject2);
            }

            @Override // com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback
            public void onHandleSuccess(@NonNull JSONObject jSONObject2) throws JSONException {
                ACLog.d(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleSuccess() response: " + jSONObject2);
                try {
                    jSONObject2.put(BizSceneNavigateManager.this.JSON_KEY_DOWNGRADED, true);
                } catch (JSONException e) {
                    ACLog.w(BizSceneNavigateManager.TAG, "onHandleActionSuccess() on ActionExecutor#handleAction onHandleSuccess() put value error: " + e);
                }
                iActionHandlerCallback.onHandleSuccess(jSONObject2);
            }
        });
    }
}
