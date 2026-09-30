package com.iap.android.mppclient.autodebit;

import com.iap.android.mppclient.autodebit.model.SignContractOAuthServiceParams;
import com.iap.android.mppclient.autodebit.model.SignContractOAuthServiceResult;
import com.iap.android.mppclient.basic.callback.Callback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface AutoDebitService {
    void showAuthPage(SignContractOAuthServiceParams signContractOAuthServiceParams, Callback<SignContractOAuthServiceResult> callback);
}
