package com.alibaba.ariver.engine;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.EngineStack;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.EngineInitCallback;
import com.alibaba.ariver.engine.api.bridge.model.InitParams;
import com.alibaba.ariver.engine.common.bridge.DefaultNativeBridge;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseEngineImpl implements RVEngine {
    protected InitParams initParams;
    private String mAppId;
    private EngineRouter mEngineRouter;
    private Node mNode;
    private boolean mDestroyed = false;
    private Context mContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    private NativeBridge mEngineBridge = createNativeBridge();

    public BaseEngineImpl(String str, Node node) {
        this.mNode = node;
        this.mAppId = str;
        EngineRouter engineRouterCreateEngineRouter = createEngineRouter();
        this.mEngineRouter = engineRouterCreateEngineRouter;
        this.mEngineBridge.bindEngineRouter(engineRouterCreateEngineRouter);
    }

    public String getEngineType() {
        return "WEB";
    }

    protected NativeBridge createNativeBridge() {
        return new DefaultNativeBridge();
    }

    public void setNativeBridge(@NonNull NativeBridge nativeBridge) {
        this.mEngineBridge = nativeBridge;
    }

    protected EngineRouter createEngineRouter() {
        return new DefaultEngineRouter();
    }

    public void init(InitParams initParams, EngineInitCallback engineInitCallback) {
        this.initParams = initParams;
        EngineStack.getInstance().pushEnginePorxy(this);
    }

    public Render getTopRender() {
        return this.mEngineRouter.getRenderById((String) null);
    }

    public String getAppId() {
        return this.mAppId;
    }

    public Bundle getStartParams() {
        InitParams initParams = this.initParams;
        if (initParams == null) {
            return null;
        }
        return initParams.startParams;
    }

    public EngineRouter getEngineRouter() {
        return this.mEngineRouter;
    }

    public NativeBridge getBridge() {
        return this.mEngineBridge;
    }

    public Node getNode() {
        return this.mNode;
    }

    public Context getApplication() {
        return this.mContext;
    }

    public final void destroy() {
        synchronized (this) {
            if (this.mDestroyed) {
                return;
            }
            this.mDestroyed = true;
            onDestroy();
            this.mEngineBridge.release();
            EngineStack.getInstance().removeProxy(this);
        }
    }

    protected void onDestroy() {
        EngineRouter engineRouter = this.mEngineRouter;
        if (engineRouter != null) {
            engineRouter.destroy();
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }
}
