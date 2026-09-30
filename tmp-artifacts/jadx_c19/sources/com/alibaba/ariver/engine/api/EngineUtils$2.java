package com.alibaba.ariver.engine.api;

import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class EngineUtils$2 implements SendToRenderCallback {
    final /* synthetic */ SendToRenderCallback val$callback;

    EngineUtils$2(SendToRenderCallback sendToRenderCallback) {
        this.val$callback = sendToRenderCallback;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
    public void onCallBack(final JSONObject jSONObject) {
        if (ExecutorUtils.isMainThread()) {
            this.val$callback.onCallBack(jSONObject);
        } else {
            ExecutorUtils.postMain(new Runnable() { // from class: com.alibaba.ariver.engine.api.EngineUtils$2.1
                @Override // java.lang.Runnable
                public void run() {
                    EngineUtils$2.this.val$callback.onCallBack(jSONObject);
                }
            });
        }
    }
}
