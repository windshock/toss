package com.iap.ac.android.acs.plugin.rpc.geo;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.rpc.geo.request.GeoServiceReverseRequest;
import com.iap.ac.android.acs.plugin.rpc.geo.result.GeoServiceReverseResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface GeoServiceFacade {
    public static final String OPERATION_TYPE_GEO_SERVICE_REVERSE = "ac.mobilepayment.jsapi.invoke";

    @ACRpcRequest
    @OperationType("ac.mobilepayment.jsapi.invoke")
    @SignCheck
    GeoServiceReverseResult geoServiceReverse(GeoServiceReverseRequest geoServiceReverseRequest);
}
