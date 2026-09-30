package com.alibaba.ariver.engine;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.EngineRouter$RenderInitListener;
import com.alibaba.ariver.kernel.common.utils.CollectionUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultEngineRouter implements EngineRouter {
    private static final String TAG = "AriverEngine:" + DefaultEngineRouter.class.getSimpleName();
    private Map<String, List<EngineRouter$RenderInitListener>> mRenderInitListeners;
    private final Object mLock = new Object();
    private final Map<String, Worker> registeredWorker = new ConcurrentHashMap();
    private final Stack<Worker> workerStack = new Stack<>();
    private final Map<String, Render> registerRender = new ConcurrentHashMap();
    private final Stack<Render> renderStack = new Stack<>();

    public void registerWorker(String str, Worker worker) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.workerStack) {
            if (!this.registeredWorker.containsKey(str)) {
                this.registeredWorker.put(str, worker);
                this.workerStack.push(worker);
            } else {
                RVLogger.d(TAG, "DefaultEngineRouter has sample worker " + str);
            }
        }
    }

    public void unRegisterWorker(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.workerStack) {
            RVLogger.d(TAG, "unRegisterWorker: " + str);
            Worker worker = this.registeredWorker.get(str);
            if (worker != null) {
                this.registeredWorker.remove(str);
                this.workerStack.remove(worker);
            }
        }
    }

    public Worker getWorkerById(String str) {
        synchronized (this.workerStack) {
            if (TextUtils.isEmpty(str)) {
                if (this.workerStack.size() <= 0) {
                    return null;
                }
                return this.workerStack.peek();
            }
            return this.registeredWorker.get(str);
        }
    }

    public void resetRenderToTop(Render render) {
        RVLogger.d(TAG, "resetRenderToTop: " + render);
        if (render == null) {
            return;
        }
        synchronized (this.renderStack) {
            if (this.renderStack.remove(render)) {
                this.renderStack.push(render);
            }
        }
    }

    public void registerRender(String str, Render render) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.renderStack) {
            if (!this.registerRender.containsKey(str)) {
                this.registerRender.put(str, render);
                this.renderStack.push(render);
            } else {
                RVLogger.d(TAG, "DefaultEngineRouter has sample worker " + str);
            }
        }
        onRenderInit(render);
    }

    public void unRegisterRender(String str) {
        RVLogger.d(TAG, "unRegisterRender: " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.renderStack) {
            Render render = this.registerRender.get(str);
            if (render != null) {
                this.registerRender.remove(str);
                this.renderStack.remove(render);
            }
        }
    }

    public Render getRenderById(String str) {
        synchronized (this.renderStack) {
            if (TextUtils.isEmpty(str)) {
                if (this.renderStack.size() <= 0) {
                    return null;
                }
                return this.renderStack.peek();
            }
            return this.registerRender.get(str);
        }
    }

    public List<Render> getRegisteredRender() {
        ArrayList arrayList;
        synchronized (this.renderStack) {
            arrayList = new ArrayList(this.renderStack);
        }
        return arrayList;
    }

    public void destroy() {
        Collection<Worker> collectionValues = this.registeredWorker.values();
        Iterator<Worker> it = collectionValues.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.registeredWorker.clear();
        this.registerRender.clear();
        this.renderStack.clear();
        collectionValues.clear();
        synchronized (this.mLock) {
            Map<String, List<EngineRouter$RenderInitListener>> map = this.mRenderInitListeners;
            if (map != null) {
                map.clear();
            }
            this.mRenderInitListeners = null;
        }
    }

    public void registerRenderInitListener(String str, EngineRouter$RenderInitListener engineRouter$RenderInitListener) {
        synchronized (this.mLock) {
            if (this.mRenderInitListeners == null) {
                this.mRenderInitListeners = new HashMap();
            }
            if (!this.mRenderInitListeners.containsKey(str)) {
                this.mRenderInitListeners.put(str, new LinkedList());
            }
            this.mRenderInitListeners.get(str).add(engineRouter$RenderInitListener);
        }
        Render renderById = getRenderById(str);
        if (renderById != null) {
            onRenderInit(renderById);
        }
    }

    private void onRenderInit(Render render) {
        if (render != null) {
            String renderId = render.getRenderId();
            if (TextUtils.isEmpty(renderId)) {
                return;
            }
            synchronized (this.mLock) {
                if (!CollectionUtils.isEmpty(this.mRenderInitListeners)) {
                    List<EngineRouter$RenderInitListener> list = this.mRenderInitListeners.get(renderId);
                    if (!CollectionUtils.isEmpty(list)) {
                        Iterator<EngineRouter$RenderInitListener> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onRenderInit(render);
                        }
                    }
                    this.mRenderInitListeners.remove(renderId);
                }
            }
        }
    }
}
