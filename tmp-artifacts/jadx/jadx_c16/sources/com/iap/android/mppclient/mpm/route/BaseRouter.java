package com.iap.android.mppclient.mpm.route;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.android.mppclient.basic.callback.Callback;
import com.iap.android.mppclient.basic.log.ACLogEvent;
import com.iap.android.mppclient.container.IContainerPresenter;
import com.iap.android.mppclient.container.js.ContainerBridgeContext;
import com.iap.android.mppclient.mpm.model.ActionResumeParams;
import com.iap.android.mppclient.mpm.model.LaunchResult;
import com.iap.android.mppclient.mpm.model.RouterParams;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.response.BaseResponse;
import com.iap.android.mppclient.mpm.response.DecodeResponse;
import com.iap.android.mppclient.mpm.utils.ActionParamsModel;
import com.iap.android.mppclient.mpm.utils.TradePayResultUtils;
import com.lguplus.usimlib.TsmResponse;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class BaseRouter {
    protected ContainerBridgeContext bridgeContext;
    public Callback callback;
    protected IContainerPresenter containerPresenter;

    public void onResume(BaseRequest baseRequest, ActionResumeParams actionResumeParams, Callback callback) {
        this.callback = callback;
        this.bridgeContext = actionResumeParams.bridgeContext;
        this.containerPresenter = actionResumeParams.containerPresenter;
    }

    public void onRouteFinish(BaseResponse baseResponse) throws Throwable {
        String bizProcessorKey = RouterManager.getInstance().getBizProcessorKey(this.containerPresenter);
        RouterParams router = RouterManager.getInstance().getRouter(bizProcessorKey);
        if (router == null) {
            router = new RouterParams();
        }
        router.routerEnd = true;
        RouterManager.getInstance().addRouter(bizProcessorKey, router);
        IContainerPresenter iContainerPresenter = this.containerPresenter;
        if (iContainerPresenter != null) {
            iContainerPresenter.closeWebview();
        }
        if (this.bridgeContext != null) {
            final JSONObject tradePayResultJsonObject = TradePayResultUtils.getTradePayResultJsonObject(baseResponse == null ? "2001" : baseResponse.resultCode);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.iap.android.mppclient.mpm.route.BaseRouter.1
                @Override // java.lang.Runnable
                public void run() {
                    BaseRouter.this.bridgeContext.sendBridgeResult(tradePayResultJsonObject);
                }
            });
        }
        onRouterLog(baseResponse);
        onRouterCallback(baseResponse);
    }

    protected boolean redirect(BaseResponse baseResponse) {
        IContainerPresenter iContainerPresenter;
        if (!(baseResponse instanceof DecodeResponse)) {
            return false;
        }
        DecodeResponse decodeResponse = (DecodeResponse) baseResponse;
        if (TextUtils.isEmpty(decodeResponse.sdkActionPayload)) {
            return false;
        }
        ACLogEvent.newLogger("mpp_mpm_handle_action_start").event();
        ActionParamsModel paramsModel = ActionParamsModel.parseParamsModel(decodeResponse.sdkActionPayload);
        if (paramsModel != null && "OPEN_URL".equals(paramsModel.sdkActionType) && !TextUtils.isEmpty(paramsModel.redirectUrl) && (iContainerPresenter = this.containerPresenter) != null) {
            iContainerPresenter.loadUrl(paramsModel.redirectUrl);
            return true;
        }
        ACLogEvent.newLogger("mpp_mpm_handle_action_fail").event();
        return false;
    }

    private void onRouterLog(BaseResponse baseResponse) {
        ACLogEvent aCLogEventNewLogger = ACLogEvent.newLogger("mpp_mpm_launch_end");
        if (baseResponse != null && !baseResponse.isSuccess) {
            String str = baseResponse.resultCode;
            String str2 = baseResponse.resultMessage;
            aCLogEventNewLogger.addParams(TsmResponse.errorCode, str);
            aCLogEventNewLogger.addParams(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str2);
        }
        aCLogEventNewLogger.event();
    }

    public void onRouterCallback(BaseResponse baseResponse) {
        if (this.callback == null) {
            return;
        }
        if (baseResponse == null) {
            onFailure("1003", "SYSTEM_ERROR");
        } else if (!baseResponse.isSuccess) {
            onFailure(TextUtils.isEmpty(baseResponse.resultCode) ? "" : baseResponse.resultCode, TextUtils.isEmpty(baseResponse.resultMessage) ? "" : baseResponse.resultMessage);
        } else {
            onSuccess();
        }
    }

    private void onFailure(final String str, final String str2) {
        if (this.callback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.iap.android.mppclient.mpm.route.BaseRouter.2
                @Override // java.lang.Runnable
                public void run() {
                    BaseRouter.this.callback.onFailure(str, str2);
                }
            });
        }
    }

    private void onSuccess() {
        if (this.callback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.iap.android.mppclient.mpm.route.BaseRouter.3
                @Override // java.lang.Runnable
                public void run() {
                    BaseRouter.this.callback.onSuccess(new LaunchResult());
                }
            });
        }
    }
}
