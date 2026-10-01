package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLogoutRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLogoutResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface MobilePaymentLogoutRpcFacade {
    @ACRpcRequest
    @OperationType("ac.mobilepayment.auth.logout")
    @SignCheck
    MobilePaymentLogoutResult logout(MobilePaymentLogoutRequest mobilePaymentLogoutRequest);
}
