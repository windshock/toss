package com.alibaba.ariver.app.api.ui.fragment;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.EmbedViewProvider;
import com.alibaba.ariver.engine.api.embedview.IEmbedPerformance;
import com.alibaba.ariver.engine.api.embedview.IEmbedPerformanceReporter;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DefaultEmbedViewManager implements IEmbedViewManager {
    private static final int MESSAGE_QUEUE_MAX_SIZE = 20;
    private static final String TAG = "AriverApp:DefaultEmbedViewManager";
    private Page mPage;
    private final Map<String, IEmbedView> mViewMap = new ConcurrentHashMap();
    private final List<IEmbedView> mViewList = new ArrayList();
    private final List<String> mBaseViewIds = new ArrayList();
    final Map<String, Queue<Render>> mRenderQueueMap = new ConcurrentHashMap();
    final Map<String, Queue<Message>> mMessageQueueMap = new ConcurrentHashMap();

    public DefaultEmbedViewManager(Page page) {
        this.mPage = page;
    }

    public List<IEmbedView> findAllEmbedView() {
        return this.mViewList;
    }

    public IEmbedView findViewById(String str) {
        return this.mViewMap.get(str);
    }

    public void destroyView(String str) {
        try {
            RVLogger.d(TAG, "destroyView viewId: " + str);
            IEmbedView iEmbedViewRemove = this.mViewMap.remove(str);
            this.mViewList.remove(iEmbedViewRemove);
            if (iEmbedViewRemove != null) {
                iEmbedViewRemove.onDestroy();
            }
        } catch (Throwable th) {
            RVLogger.e(TAG, "destroyView occurs error!" + th.getMessage());
        }
    }

    public IEmbedView createView(String str, String str2) {
        IEmbedView iEmbedViewCreateEmbedView;
        synchronized (this) {
            RVLogger.d(TAG, "createView for viewId: " + str + " type: " + str2);
            iEmbedViewCreateEmbedView = this.mViewMap.get(str);
            if (iEmbedViewCreateEmbedView == null) {
                iEmbedViewCreateEmbedView = ((EmbedViewProvider) RVProxy.get(EmbedViewProvider.class)).createEmbedView(str2);
                if (iEmbedViewCreateEmbedView instanceof IEmbedPerformance) {
                    setPerformanceReporter(str2, (IEmbedPerformance) iEmbedViewCreateEmbedView);
                }
                if (TextUtils.equals(str2, "newembedbase")) {
                    clearBaseView();
                    this.mBaseViewIds.add(str);
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(this.mPage.getParentNode().getNodeId());
                map.put("ariverAppInstanceId", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.mPage.getNodeId());
                map.put("ariverPageInstanceId", sb2.toString());
                map.put("ariverEmbedViewId", str);
                map.put("ariverAppInfoScene", BundleUtils.getString(this.mPage.getStartParams(), "nbsource"));
                if (TextUtils.equals(str2, "web-view-stub")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(BundleUtils.getLong(this.mPage.getStartParams(), "shell_id"));
                    map.put("ariverShellPageId", sb3.toString());
                }
                try {
                    iEmbedViewCreateEmbedView.onCreate(map);
                    synchronized (this.mViewMap) {
                        this.mViewMap.put(str, iEmbedViewCreateEmbedView);
                        this.mViewList.add(iEmbedViewCreateEmbedView);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("elementid", str);
                    EngineUtils.sendToRender(this.mPage.getRender(), "nbcomponent.canrender", jSONObject, (SendToRenderCallback) null);
                } catch (Exception e) {
                    RVLogger.w(TAG, "embedVew create failed ", e);
                    return null;
                }
            }
        }
        return iEmbedViewCreateEmbedView;
    }

    public void dispatchMsgAfterGetView(String str) {
        IEmbedView iEmbedView = this.mViewMap.get(str);
        if (iEmbedView == null) {
            RVLogger.d(TAG, "dispatchMsgAfterGetView embedView is null. viewId = " + str);
            return;
        }
        Queue<Render> queueRemove = this.mRenderQueueMap.remove(str);
        if (queueRemove != null) {
            for (Render render : queueRemove) {
                dispatchOnReceivedRender(iEmbedView, render.data, render.callback);
            }
            queueRemove.clear();
        }
        Queue<Message> queueRemove2 = this.mMessageQueueMap.remove(str);
        if (queueRemove2 != null) {
            for (Message message : queueRemove2) {
                dispatchOnReceivedMessage(iEmbedView, message.actionType, message.data, message.bridgeCallback);
            }
            queueRemove2.clear();
        }
    }

    public void dispatchRender(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        synchronized (this.mViewMap) {
            IEmbedView iEmbedViewFindViewById = findViewById(str);
            if (iEmbedViewFindViewById == null) {
                Queue<Render> arrayBlockingQueue = this.mRenderQueueMap.get(str);
                if (arrayBlockingQueue == null) {
                    arrayBlockingQueue = new ArrayBlockingQueue<>(MESSAGE_QUEUE_MAX_SIZE);
                    this.mRenderQueueMap.put(str, arrayBlockingQueue);
                }
                arrayBlockingQueue.add(new Render(jSONObject, bridgeCallback, (AnonymousClass1) null));
                RVLogger.d(TAG, "findViewById " + str + " null, just add to render queueMap!");
                return;
            }
            dispatchOnReceivedRender(iEmbedViewFindViewById, jSONObject, bridgeCallback);
        }
    }

    private void dispatchOnReceivedRender(final IEmbedView iEmbedView, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.api.ui.fragment.DefaultEmbedViewManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iEmbedView.onReceivedRender(jSONObject, bridgeCallback);
                } catch (Throwable th) {
                    RVLogger.e(DefaultEmbedViewManager.TAG, "EmbedView dispatchOnReceivedRender exception: ", th);
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedRender exception: " + th));
                }
            }
        });
    }

    public void dispatchSendMessage(String str, String str2, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        synchronized (this.mViewMap) {
            IEmbedView iEmbedViewFindViewById = findViewById(str);
            if (iEmbedViewFindViewById == null) {
                Queue<Message> arrayBlockingQueue = this.mMessageQueueMap.get(str);
                if (arrayBlockingQueue == null) {
                    arrayBlockingQueue = new ArrayBlockingQueue<>(MESSAGE_QUEUE_MAX_SIZE);
                    this.mMessageQueueMap.put(str, arrayBlockingQueue);
                }
                arrayBlockingQueue.add(new Message(str2, jSONObject, bridgeCallback, (AnonymousClass1) null));
                RVLogger.d(TAG, "findViewById " + str + " null, just add to message queueMap!");
                return;
            }
            dispatchOnReceivedMessage(iEmbedViewFindViewById, str2, jSONObject, bridgeCallback);
        }
    }

    private void dispatchOnReceivedMessage(final IEmbedView iEmbedView, final String str, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.api.ui.fragment.DefaultEmbedViewManager.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    iEmbedView.onReceivedMessage(str, jSONObject, bridgeCallback);
                } catch (Throwable th) {
                    RVLogger.e(DefaultEmbedViewManager.TAG, "EmbedView dispatchOnReceivedMessage exception: ", th);
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(5, "EmbedView onReceivedMessage exception: " + th));
                }
            }
        });
    }

    private void setPerformanceReporter(final String str, IEmbedPerformance iEmbedPerformance) {
        final WeakReference weakReference = new WeakReference(this.mPage);
        final int iHashCode = iEmbedPerformance.hashCode();
        iEmbedPerformance.setPerformanceReporter(new IEmbedPerformanceReporter() { // from class: com.alibaba.ariver.app.api.ui.fragment.DefaultEmbedViewManager.3
            @Override // com.alibaba.ariver.engine.api.embedview.IEmbedPerformanceReporter
            public void onRenderFinished(long j) {
                try {
                    RVLogger.d(DefaultEmbedViewManager.TAG, "on render finished type=" + str + ", obj=" + iHashCode + ",elapsedRealtime" + j);
                    Page page = (Page) weakReference.get();
                    if (page == null || page.isExited() || page.isDestroyed()) {
                        return;
                    }
                    ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, "embed_view_" + str + "_" + iHashCode, j);
                } catch (Throwable th) {
                    RVLogger.e(DefaultEmbedViewManager.TAG, " embed view render finished callback error!", th);
                }
            }
        });
    }

    public void clearBaseView() {
        if (this.mViewMap.isEmpty() || this.mBaseViewIds.isEmpty()) {
            return;
        }
        for (String str : this.mBaseViewIds) {
            if (!TextUtils.isEmpty(str)) {
                IEmbedView iEmbedView = this.mViewMap.get(str);
                this.mViewMap.remove(str);
                this.mViewList.remove(iEmbedView);
            }
        }
        this.mBaseViewIds.clear();
    }

    public void onRequestPermissionResult(int i2, String[] strArr, int[] iArr) {
        Iterator<IEmbedView> it = this.mViewMap.values().iterator();
        while (it.hasNext()) {
            it.next().onRequestPermissionResult(i2, strArr, iArr);
        }
    }

    public void releaseViews() {
        boolean zIsDebug;
        Iterator<IEmbedView> it = this.mViewMap.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().onDestroy();
            } finally {
                if (!zIsDebug) {
                }
            }
        }
        this.mViewList.clear();
        this.mViewMap.clear();
        this.mRenderQueueMap.clear();
        this.mMessageQueueMap.clear();
    }

    public void triggerPreSnapshot() {
        try {
            Map<String, IEmbedView> map = this.mViewMap;
            if (map == null || map.isEmpty()) {
                return;
            }
            Iterator<IEmbedView> it = this.mViewMap.values().iterator();
            while (it.hasNext()) {
                it.next().triggerPreSnapshot();
            }
        } catch (Throwable th) {
            RVLogger.e(TAG, "triggerPreSnapshot catch throwable ", th);
        }
    }
}
