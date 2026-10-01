package com.iap.ac.android.common.container.js.model;

import com.iap.ac.android.common.a.a;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class JSBridgeMessageToNative {
    public String clientId;
    public String func;
    public String msgType;
    public JSONObject param;

    public String toString() {
        StringBuilder sbA = a.a("JSBridgeMessageToNative{func='");
        sbA.append(this.func);
        sbA.append('\'');
        sbA.append(", param=");
        sbA.append(this.param);
        sbA.append(", msgType='");
        sbA.append(this.msgType);
        sbA.append('\'');
        sbA.append(", clientId='");
        sbA.append(this.clientId);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
