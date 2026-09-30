package com.iap.android.mppclient.container.js;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ACBridgeContext extends ContainerBridgeContext {
    private static final String TAG = "ACBridgeContext";
    private String bizCode;
    private WebView mWebview;

    public ACBridgeContext(WebView webView, String str) {
        this.mWebview = webView;
        this.bizCode = str;
    }

    public WebView getWebview() {
        return this.mWebview;
    }

    @Override // com.iap.android.mppclient.container.js.ContainerBridgeContext
    public boolean sendBridgeResult(JSONObject jSONObject) {
        try {
            ACJSBridge.getInstance(this.bizCode).sendBack(getToNativeMsg(), this.mWebview, jSONObject);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.iap.android.mppclient.container.js.ContainerBridgeContext
    public boolean sendBridgeResult(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            return sendBridgeResult(jSONObject);
        } catch (Exception unused) {
            return false;
        }
    }
}
