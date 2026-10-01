package com.iap.android.mppclient.mpm.action;

import android.text.TextUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.android.mppclient.basic.AlipayPlusClient;
import com.iap.android.mppclient.basic.callback.Callback;
import com.iap.android.mppclient.basic.log.ACLogEvent;
import com.iap.android.mppclient.basic.model.CommonOAuthServiceParams;
import com.iap.android.mppclient.basic.model.CommonOAuthServiceResult;
import com.iap.android.mppclient.basic.service.CommonOAuthService;
import com.iap.android.mppclient.mpm.callback.IActionCallback;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.GetAuthCodeRequest;
import com.iap.android.mppclient.mpm.response.BaseResponse;
import com.iap.android.mppclient.mpm.response.GetAuthCodeResponse;
import com.lguplus.usimlib.TsmResponse;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class GetAuthCodeAction extends BaseAction<GetAuthCodeRequest, GetAuthCodeResponse> {
    public /* bridge */ /* synthetic */ void handleAction(BaseRequest baseRequest, IActionCallback iActionCallback) {
        handleAction((GetAuthCodeRequest) baseRequest, (IActionCallback<GetAuthCodeResponse>) iActionCallback);
    }

    public void handleAction(GetAuthCodeRequest getAuthCodeRequest, final IActionCallback<GetAuthCodeResponse> iActionCallback) {
        CommonOAuthService commonOAuthService = AlipayPlusClient.getInstance().commonOAuthService;
        if (commonOAuthService != null) {
            handleOAuthEnterLog(getAuthCodeRequest.authClientId, getAuthCodeRequest.scopes);
            CommonOAuthServiceParams commonOAuthServiceParams = new CommonOAuthServiceParams();
            commonOAuthServiceParams.authClientId = getAuthCodeRequest.authClientId;
            commonOAuthServiceParams.scopes = getAuthCodeRequest.scopes;
            commonOAuthService.getAuthCode(commonOAuthServiceParams, new Callback<CommonOAuthServiceResult>() { // from class: com.iap.android.mppclient.mpm.action.GetAuthCodeAction.1
                public void onSuccess(CommonOAuthServiceResult commonOAuthServiceResult) {
                    if (commonOAuthServiceResult == null || TextUtils.isEmpty(commonOAuthServiceResult.authCode)) {
                        GetAuthCodeResponse getAuthCodeResponse = new GetAuthCodeResponse();
                        ((BaseResponse) getAuthCodeResponse).resultCode = "1001";
                        ((BaseResponse) getAuthCodeResponse).resultMessage = "PARAM_ILLEGAL: authCode from is commonOAuthService illegal";
                        iActionCallback.onResult(getAuthCodeResponse);
                        GetAuthCodeAction.this.handleOAuthEndLog(null, ((BaseResponse) getAuthCodeResponse).resultCode, ((BaseResponse) getAuthCodeResponse).resultMessage);
                        return;
                    }
                    GetAuthCodeResponse getAuthCodeResponse2 = new GetAuthCodeResponse();
                    getAuthCodeResponse2.authCode = commonOAuthServiceResult.authCode;
                    ((BaseResponse) getAuthCodeResponse2).isSuccess = true;
                    iActionCallback.onResult(getAuthCodeResponse2);
                    GetAuthCodeAction.this.handleOAuthEndLog(commonOAuthServiceResult.authCode, null, null);
                }

                public void onFailure(String str, String str2) {
                    GetAuthCodeResponse getAuthCodeResponse = new GetAuthCodeResponse();
                    ((BaseResponse) getAuthCodeResponse).resultCode = str;
                    ((BaseResponse) getAuthCodeResponse).resultMessage = str2;
                    iActionCallback.onResult(getAuthCodeResponse);
                    GetAuthCodeAction.this.handleOAuthEndLog(null, ((BaseResponse) getAuthCodeResponse).resultCode, ((BaseResponse) getAuthCodeResponse).resultMessage);
                }
            });
            return;
        }
        GetAuthCodeResponse getAuthCodeResponse = new GetAuthCodeResponse();
        ((BaseResponse) getAuthCodeResponse).resultCode = "1001";
        ((BaseResponse) getAuthCodeResponse).resultMessage = "PARAM_ILLEGAL: commonOAuthService is illegal";
        iActionCallback.onResult(getAuthCodeResponse);
        handleOAuthEndLog(null, ((BaseResponse) getAuthCodeResponse).resultCode, ((BaseResponse) getAuthCodeResponse).resultMessage);
    }

    private void handleOAuthEnterLog(String str, List<String> list) {
        ACLogEvent.newLogger("mpp_common_getauthcode_start").addParams("authClientId", str).addParams("scopes", getScopesStr(list)).event();
        getScopesStr(list);
    }

    private String getScopesStr(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOAuthEndLog(String str, String str2, String str3) {
        ACLogEvent aCLogEventNewLogger = ACLogEvent.newLogger("mpp_common_getauthcode_end");
        if (!TextUtils.isEmpty(str)) {
            aCLogEventNewLogger.addParams("authCode", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aCLogEventNewLogger.addParams(TsmResponse.errorCode, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aCLogEventNewLogger.addParams(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str3);
        }
        aCLogEventNewLogger.event();
    }
}
