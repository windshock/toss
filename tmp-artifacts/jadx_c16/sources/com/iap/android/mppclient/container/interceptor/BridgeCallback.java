package com.iap.android.mppclient.container.interceptor;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface BridgeCallback {
    void sendBridgeResponse(BridgeResponse bridgeResponse);

    void sendJSONResponse(JSONObject jSONObject);

    void sendJSONResponse(JSONObject jSONObject, boolean z);
}
