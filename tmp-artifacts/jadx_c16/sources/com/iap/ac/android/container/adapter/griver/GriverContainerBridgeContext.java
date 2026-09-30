package com.iap.ac.android.container.adapter.griver;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.iap.ac.android.common.container.js.ContainerBridgeContext;
import com.iap.ac.android.common.container.utils.ContainerUtils;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class GriverContainerBridgeContext extends ContainerBridgeContext {
    public final BridgeCallback a;
    public final Page b;

    public GriverContainerBridgeContext(Page page, BridgeCallback bridgeCallback) {
        this.a = bridgeCallback;
        this.b = page;
    }

    @Override // com.iap.ac.android.common.container.js.ContainerBridgeContext
    public boolean sendBridgeResult(JSONObject jSONObject) {
        if (this.b == null || this.a == null) {
            return false;
        }
        ACLog.d("GriverContainerBridgeCo", "jsonObject  = " + jSONObject + ", page = " + this.b + ", bridgeCallback = " + this.a + ", page.getPageContext" + this.b.getPageContext());
        if (this.b.getPageContext() != null && this.b.getPageContext().getActivity() != null && !ContainerUtils.isActivityRunning(this.b.getPageContext().getActivity())) {
            return false;
        }
        this.a.sendJSONResponse(Utils.jsonObjectToFastJson(jSONObject));
        return true;
    }

    @Override // com.iap.ac.android.common.container.js.ContainerBridgeContext
    public boolean sendBridgeResult(String str, Object obj) {
        if (this.b == null || this.a == null) {
            return false;
        }
        ACLog.d("GriverContainerBridgeCo", "key  = " + str + ", value = " + obj + ", page = " + this.b + ", bridgeCallback = " + this.a + ", page.getPageContext" + this.b.getPageContext());
        if (this.b.getPageContext() != null && !ContainerUtils.isActivityRunning(this.b.getPageContext().getActivity())) {
            return false;
        }
        this.a.sendBridgeResponse(BridgeResponse.newValue(str, obj));
        return true;
    }
}
