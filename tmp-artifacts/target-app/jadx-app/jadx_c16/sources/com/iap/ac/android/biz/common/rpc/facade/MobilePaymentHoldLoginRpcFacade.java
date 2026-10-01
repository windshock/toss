package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentHoldLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentHoldLoginResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface MobilePaymentHoldLoginRpcFacade {
    @ACRpcRequest
    @OperationType("ac.mobilepayment.auth.holdlogin")
    @SignCheck
    MobilePaymentHoldLoginResult holdLogin(MobilePaymentHoldLoginRequest mobilePaymentHoldLoginRequest);

    @ACRpcRequest
    @OperationType("ap.alipayplusrewards.auth.holdlogin")
    @SignCheck
    MobilePaymentHoldLoginResult rewardsHoldLogin(MobilePaymentHoldLoginRequest mobilePaymentHoldLoginRequest);
}
