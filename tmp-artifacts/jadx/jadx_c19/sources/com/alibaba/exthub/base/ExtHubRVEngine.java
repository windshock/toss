package com.alibaba.exthub.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.EngineSetupCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.kernel.api.node.Node;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubRVEngine implements RVEngine {
    public Render createRender(Activity activity, Node node, CreateParams createParams) {
        return null;
    }

    public Worker createWorker(Context context, Node node, String str, String str2) throws Throwable {
        return null;
    }

    public void destroy() {
    }

    public String getAppId() {
        return null;
    }

    public Context getApplication() {
        return null;
    }

    public NativeBridge getBridge() {
        return null;
    }

    public String getEngineType() {
        return null;
    }

    public String getInstanceId() {
        return null;
    }

    public Node getNode() {
        return null;
    }

    public Bundle getStartParams() {
        return null;
    }

    public Render getTopRender() {
        return null;
    }

    public void init(InitParams initParams, EngineInitCallback engineInitCallback) {
    }

    public boolean isDestroyed() {
        return false;
    }

    public boolean isReady() {
        return false;
    }

    public void setup(Bundle bundle, Bundle bundle2, EngineSetupCallback engineSetupCallback) {
    }

    public EngineRouter getEngineRouter() {
        return new ExtHubEngineRouter();
    }
}
