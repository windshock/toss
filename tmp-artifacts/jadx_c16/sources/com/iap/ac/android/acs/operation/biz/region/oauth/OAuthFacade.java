package com.iap.ac.android.acs.operation.biz.region.oauth;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.operation.biz.region.bean.LogoutRequest;
import com.iap.ac.android.acs.operation.biz.region.bean.LogoutResult;
import com.iap.ac.android.acs.operation.biz.region.bean.TrustLoginRequest;
import com.iap.ac.android.acs.operation.biz.region.bean.TrustLoginResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface OAuthFacade {
    @OperationType("eco.region.client.login.logout")
    @SignCheck
    LogoutResult logout(LogoutRequest logoutRequest);

    @OperationType("eco.region.client.login.trust")
    @SignCheck
    TrustLoginResult trustLogin(TrustLoginRequest trustLoginRequest);
}
