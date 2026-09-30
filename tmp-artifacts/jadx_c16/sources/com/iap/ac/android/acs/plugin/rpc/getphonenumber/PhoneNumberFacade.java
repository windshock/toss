package com.iap.ac.android.acs.plugin.rpc.getphonenumber;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.InvokeJSAPIRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.result.InvokeJSAPIResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface PhoneNumberFacade {
    public static final String OPERATION_TYPE_JSAPI_INVOKE = "ac.mobilepayment.jsapi.invoke";

    @ACRpcRequest
    @OperationType("ac.mobilepayment.jsapi.invoke")
    @SignCheck
    InvokeJSAPIResult jsapiInvoke(InvokeJSAPIRequest invokeJSAPIRequest);
}
