package com.iap.ac.android.container.adapter.griver;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.interceptor.BridgeCallback;
import com.iap.ac.android.common.container.interceptor.BridgeResponse;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class IAPBridgeCallbackAdapter implements BridgeCallback {
    public final com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback a;

    public IAPBridgeCallbackAdapter(@NonNull com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback bridgeCallback) {
        this.a = bridgeCallback;
    }

    public static IAPBridgeCallbackAdapter from(@NonNull com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback bridgeCallback) {
        return new IAPBridgeCallbackAdapter(bridgeCallback);
    }

    @Override // com.iap.ac.android.common.container.interceptor.BridgeCallback
    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        this.a.sendBridgeResponse(new com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse(Utils.jsonObjectToFastJson(bridgeResponse.get())));
    }

    @Override // com.iap.ac.android.common.container.interceptor.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        this.a.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject), z);
    }

    @Override // com.iap.ac.android.common.container.interceptor.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject) {
        this.a.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject));
    }
}
