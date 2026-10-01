package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLoginResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface MobilePaymentLoginRpcFacade {
    @ACRpcRequest
    @OperationType("ac.mobilepayment.auth.authlogin")
    @SignCheck
    MobilePaymentLoginResult login(MobilePaymentLoginRequest mobilePaymentLoginRequest);

    @ACRpcRequest
    @OperationType("ap.alipayplusrewards.auth.authlogin")
    @SignCheck
    MobilePaymentLoginResult rewardsLogin(MobilePaymentLoginRequest mobilePaymentLoginRequest);
}
