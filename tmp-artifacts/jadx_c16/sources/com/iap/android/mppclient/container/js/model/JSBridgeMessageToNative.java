package com.iap.android.mppclient.container.js.model;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class JSBridgeMessageToNative {
    public String clientId;
    public String func;
    public String msgType;
    public JSONObject param;

    public String toString() {
        return "JSBridgeMessageToNative{func='" + this.func + "', param=" + this.param + ", msgType='" + this.msgType + "', clientId='" + this.clientId + "'}";
    }
}
