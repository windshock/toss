package com.iap.android.mppclient.mpm.route;

import com.iap.android.mppclient.basic.callback.Callback;
import com.iap.android.mppclient.mpm.action.DecodeAction;
import com.iap.android.mppclient.mpm.action.GetAuthCodeAction;
import com.iap.android.mppclient.mpm.action.PrepareAuthAction;
import com.iap.android.mppclient.mpm.callback.IActionCallback;
import com.iap.android.mppclient.mpm.model.ActionResumeParams;
import com.iap.android.mppclient.mpm.model.PrepareAuthResult;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.DecodeRequest;
import com.iap.android.mppclient.mpm.request.GetAuthCodeRequest;
import com.iap.android.mppclient.mpm.request.PrepareAuthRequest;
import com.iap.android.mppclient.mpm.response.BaseResponse;
import com.iap.android.mppclient.mpm.response.DecodeResponse;
import com.iap.android.mppclient.mpm.response.GetAuthCodeResponse;
import com.iap.android.mppclient.mpm.response.PrepareAuthResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CNCollectionRouter extends BaseRouter {
    private static final String AUTH_CODE = "${AC_AUTHCODE}";
    private String authRedirectUrl;

    @Override // com.iap.android.mppclient.mpm.route.BaseRouter
    public void onResume(BaseRequest baseRequest, ActionResumeParams actionResumeParams, Callback callback) {
        super.onResume(baseRequest, actionResumeParams, callback);
        if (baseRequest instanceof PrepareAuthRequest) {
            new PrepareAuthAction().handleAction((PrepareAuthRequest) baseRequest, new IActionCallback<PrepareAuthResponse>() { // from class: com.iap.android.mppclient.mpm.route.CNCollectionRouter.1
                public void onResult(PrepareAuthResponse prepareAuthResponse) throws Throwable {
                    CNCollectionRouter.this.handlePrepareAuthResponse(prepareAuthResponse);
                }
            });
        } else if (baseRequest instanceof DecodeRequest) {
            new DecodeAction().handleAction((DecodeRequest) baseRequest, new IActionCallback<DecodeResponse>() { // from class: com.iap.android.mppclient.mpm.route.CNCollectionRouter.2
                public void onResult(DecodeResponse decodeResponse) throws Throwable {
                    if (CNCollectionRouter.this.redirect(decodeResponse)) {
                        return;
                    }
                    CNCollectionRouter.this.onRouteFinish(decodeResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePrepareAuthResponse(PrepareAuthResponse prepareAuthResponse) throws Throwable {
        PrepareAuthResult prepareAuthResult;
        if (prepareAuthResponse == null || !((BaseResponse) prepareAuthResponse).isSuccess || (prepareAuthResult = prepareAuthResponse.prepareAuthResult) == null) {
            onRouteFinish(prepareAuthResponse);
            return;
        }
        this.authRedirectUrl = prepareAuthResult.authRedirectUrl;
        GetAuthCodeAction getAuthCodeAction = new GetAuthCodeAction();
        GetAuthCodeRequest getAuthCodeRequest = new GetAuthCodeRequest();
        PrepareAuthResult prepareAuthResult2 = prepareAuthResponse.prepareAuthResult;
        getAuthCodeRequest.authClientId = prepareAuthResult2.authClientId;
        getAuthCodeRequest.scopes = prepareAuthResult2.scopes;
        getAuthCodeAction.handleAction(getAuthCodeRequest, new IActionCallback<GetAuthCodeResponse>() { // from class: com.iap.android.mppclient.mpm.route.CNCollectionRouter.3
            public void onResult(GetAuthCodeResponse getAuthCodeResponse) throws Throwable {
                CNCollectionRouter.this.handleGetAuthCodeResponse(getAuthCodeResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGetAuthCodeResponse(GetAuthCodeResponse getAuthCodeResponse) throws Throwable {
        if (getAuthCodeResponse == null || !((BaseResponse) getAuthCodeResponse).isSuccess) {
            onRouteFinish(getAuthCodeResponse);
            return;
        }
        try {
            this.containerPresenter.loadUrl(this.authRedirectUrl.replace(AUTH_CODE, getAuthCodeResponse.authCode));
        } catch (Throwable unused) {
            onRouteFinish(getAuthCodeResponse);
        }
    }
}
