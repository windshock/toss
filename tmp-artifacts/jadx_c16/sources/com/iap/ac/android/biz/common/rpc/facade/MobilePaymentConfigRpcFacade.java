package com.iap.ac.android.biz.common.rpc.facade;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentFetchConfigsRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface MobilePaymentConfigRpcFacade {
    @ACRpcRequest
    @OperationType("ac.mobilepayment.common.fetch.configs")
    @SignCheck
    MobilePaymentFetchConfigsResult fetchConfigs(MobilePaymentFetchConfigsRequest mobilePaymentFetchConfigsRequest);
}
