package com.iap.android.mppclient.mpm.route;

import com.iap.android.mppclient.basic.callback.Callback;
import com.iap.android.mppclient.mpm.action.DecodeAction;
import com.iap.android.mppclient.mpm.callback.IActionCallback;
import com.iap.android.mppclient.mpm.model.ActionResumeParams;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.DecodeRequest;
import com.iap.android.mppclient.mpm.response.DecodeResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CommonCollectionRouter extends BaseRouter {
    @Override // com.iap.android.mppclient.mpm.route.BaseRouter
    public void onResume(BaseRequest baseRequest, ActionResumeParams actionResumeParams, Callback callback) {
        super.onResume(baseRequest, actionResumeParams, callback);
        if (baseRequest instanceof DecodeRequest) {
            new DecodeAction().handleAction((DecodeRequest) baseRequest, new IActionCallback<DecodeResponse>() { // from class: com.iap.android.mppclient.mpm.route.CommonCollectionRouter.1
                public void onResult(DecodeResponse decodeResponse) throws Throwable {
                    if (CommonCollectionRouter.this.redirect(decodeResponse)) {
                        return;
                    }
                    CommonCollectionRouter.this.onRouteFinish(decodeResponse);
                }
            });
        }
    }
}
