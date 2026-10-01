package com.iap.android.mppclient.mpm.action;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.iap.android.mppclient.basic.async.AsyncTask;
import com.iap.android.mppclient.mpm.callback.IActionCallback;
import com.iap.android.mppclient.mpm.model.PrepareAuthResult;
import com.iap.android.mppclient.mpm.processor.PrepareAuthProcessor;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.PrepareAuthRequest;
import com.iap.android.mppclient.mpm.response.BaseResponse;
import com.iap.android.mppclient.mpm.response.PrepareAuthResponse;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareAuthAction extends BaseAction<PrepareAuthRequest, PrepareAuthResponse> {
    public /* bridge */ /* synthetic */ void handleAction(BaseRequest baseRequest, IActionCallback iActionCallback) {
        handleAction((PrepareAuthRequest) baseRequest, (IActionCallback<PrepareAuthResponse>) iActionCallback);
    }

    public void handleAction(final PrepareAuthRequest prepareAuthRequest, final IActionCallback<PrepareAuthResponse> iActionCallback) {
        SystemClock.elapsedRealtime();
        final PrepareAuthProcessor prepareAuthProcessor = new PrepareAuthProcessor();
        AsyncTask.asyncTask(new Runnable() { // from class: com.iap.android.mppclient.mpm.action.PrepareAuthAction.1
            @Override // java.lang.Runnable
            public void run() {
                PrepareAuthResponse prepareAuthResponse = new PrepareAuthResponse();
                try {
                    PrepareAuthResult prepareAuthResult = (PrepareAuthResult) prepareAuthProcessor.execute(prepareAuthRequest, PrepareAuthResult.class);
                    if (prepareAuthResult == null) {
                        ((BaseResponse) prepareAuthResponse).resultCode = "1002";
                        ((BaseResponse) prepareAuthResponse).resultMessage = "INVALID_NETWORK";
                        PrepareAuthAction.this.handleCallback(prepareAuthResponse, iActionCallback);
                    } else {
                        if (prepareAuthResult.isSuccess()) {
                            ((BaseResponse) prepareAuthResponse).isSuccess = true;
                            ((BaseResponse) prepareAuthResponse).resultCode = prepareAuthResult.getResultCode();
                            ((BaseResponse) prepareAuthResponse).resultMessage = prepareAuthResult.getResultMessage();
                            prepareAuthResponse.prepareAuthResult = prepareAuthResult;
                            PrepareAuthAction.this.handleCallback(prepareAuthResponse, iActionCallback);
                            return;
                        }
                        ((BaseResponse) prepareAuthResponse).resultCode = "1003";
                        ((BaseResponse) prepareAuthResponse).resultMessage = "SYSTEM_ERROR：request-biz-error-" + prepareAuthResult.getResultMessage();
                        PrepareAuthAction.this.handleCallback(prepareAuthResponse, iActionCallback);
                    }
                } catch (Throwable unused) {
                    ((BaseResponse) prepareAuthResponse).resultCode = "1003";
                    ((BaseResponse) prepareAuthResponse).resultMessage = "SYSTEM_ERROR";
                    PrepareAuthAction.this.handleCallback(prepareAuthResponse, iActionCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCallback(final PrepareAuthResponse prepareAuthResponse, final IActionCallback<PrepareAuthResponse> iActionCallback) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.iap.android.mppclient.mpm.action.PrepareAuthAction.2
            @Override // java.lang.Runnable
            public void run() {
                iActionCallback.onResult(prepareAuthResponse);
            }
        });
    }
}
