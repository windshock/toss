package com.alibaba.ariver.engine.api.common;

import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class CommonExitPerform {
    private String TAG = "AriverEngine:CommonExitPerform";
    private CollectJsApiHandler collectJsApiHandler;
    private Render mRender;

    protected abstract void checkDslErrorAndExit(ExitCallback exitCallback);

    protected abstract void handleCollectedApi(String str, JSONObject jSONObject);

    protected abstract boolean needCheckDslError();

    protected abstract boolean needCollectDestroyJsApi();

    public CommonExitPerform(Render render) {
        this.mRender = render;
    }

    public void runExit(ExitCallback exitCallback) {
        if (needCollectDestroyJsApi()) {
            collectJsApiAndExit(exitCallback);
        } else if (needCheckDslError()) {
            checkDslErrorAndExit(exitCallback);
        } else {
            exitCallback.afterProcess(false);
        }
    }

    private void collectJsApiAndExit(final ExitCallback exitCallback) {
        if (this.collectJsApiHandler != null || this.mRender == null) {
            return;
        }
        CollectJsApiHandler collectJsApiHandler = new CollectJsApiHandler();
        this.collectJsApiHandler = collectJsApiHandler;
        collectJsApiHandler.waiting = true;
        collectJsApiHandler.exitCallback = exitCallback;
        EngineUtils.sendToRender(this.mRender, "collectDestroyJsApi", (JSONObject) null, collectJsApiHandler);
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.engine.api.common.CommonExitPerform.1
            @Override // java.lang.Runnable
            public void run() {
                if (CommonExitPerform.this.collectJsApiHandler == null || !CommonExitPerform.this.collectJsApiHandler.waiting) {
                    return;
                }
                RVLogger.d(CommonExitPerform.this.TAG, "collectJsApiHandler overtime, do exit");
                exitCallback.afterProcess(false);
            }
        }, 1000L);
    }

    class CollectJsApiHandler implements SendToRenderCallback {
        public ExitCallback exitCallback;
        public boolean waiting = false;

        public CollectJsApiHandler() {
        }

        @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
        public void onCallBack(JSONObject jSONObject) {
            this.waiting = false;
            RVLogger.d(CommonExitPerform.this.TAG, "collectJsApi param : " + jSONObject);
            JSONArray jSONArray = JSONUtils.getJSONArray(jSONObject, "syncJsApis", (JSONArray) null);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        CommonExitPerform.this.handleCollectedApi(JSONUtils.getString(jSONObject2, "apiName"), JSONUtils.getJSONObject(jSONObject2, "params", (JSONObject) null));
                    }
                }
            }
            if (CommonExitPerform.this.needCheckDslError()) {
                CommonExitPerform.this.checkDslErrorAndExit(this.exitCallback);
            } else {
                this.exitCallback.afterProcess(false);
            }
        }
    }
}
