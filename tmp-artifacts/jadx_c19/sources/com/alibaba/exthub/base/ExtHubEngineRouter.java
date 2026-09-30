package com.alibaba.exthub.base;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.EngineRouter$RenderInitListener;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubEngineRouter implements EngineRouter {
    public void destroy() {
    }

    public List<Render> getRegisteredRender() {
        return null;
    }

    public Render getRenderById(String str) {
        return null;
    }

    public Worker getWorkerById(@Nullable String str) {
        return null;
    }

    public void registerRender(String str, Render render) {
    }

    public void registerRenderInitListener(String str, EngineRouter$RenderInitListener engineRouter$RenderInitListener) {
    }

    public void registerWorker(String str, Worker worker) {
    }

    public void resetRenderToTop(Render render) {
    }

    public void unRegisterRender(String str) {
    }

    public void unRegisterWorker(String str) {
    }
}
