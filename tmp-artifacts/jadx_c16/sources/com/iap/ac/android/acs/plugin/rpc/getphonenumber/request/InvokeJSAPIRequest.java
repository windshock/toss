package com.iap.ac.android.acs.plugin.rpc.getphonenumber.request;

import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class InvokeJSAPIRequest extends BaseRpcRequest {
    public String appId;
    public String authCode;
    public String method;
    public Map<String, String> protocolParams;
}
