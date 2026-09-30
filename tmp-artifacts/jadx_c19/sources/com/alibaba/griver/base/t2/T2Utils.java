package com.alibaba.griver.base.t2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.view.CollectPerformanceCallback;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverAppConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor;
import com.alibaba.griver.core.jsapi.logging.PageT2DataCallback;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class T2Utils {
    public static final ReentrantLock a = new ReentrantLock();
    public static final ReentrantLock b = new ReentrantLock();

    public static long a(String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            long j = Long.parseLong(str) - (jCurrentTimeMillis - jElapsedRealtime);
            if (j < 0) {
                return 0L;
            }
            return j;
        } catch (Throwable th) {
            GriverLogger.d("T2Utils", "T2Utils#parseElapsedRealtime parse error" + th);
            return 0L;
        }
    }

    public static void collectPagePerformanceWhenDestroy(final Page page, final CollectPerformanceCallback collectPerformanceCallback) {
        if (page != null) {
            try {
                if (page.getApp() != null && page.getApp().getPageByIndex(0) != null && page.getApp().getPageByIndex(0) == page) {
                    ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.griver.base.t2.T2Utils.6
                        @Override // java.lang.Runnable
                        public void run() {
                            CollectPerformanceCallback collectPerformanceCallback2 = collectPerformanceCallback;
                            if (collectPerformanceCallback2 != null) {
                                collectPerformanceCallback2.afterProcess();
                            }
                        }
                    }, 1000L);
                    return;
                }
            } catch (Throwable unused) {
                if (collectPerformanceCallback != null) {
                    collectPerformanceCallback.afterProcess();
                    return;
                }
                return;
            }
        }
        final T2PageInfo t2PageInfo = (T2PageInfo) page.getData(T2PageInfo.class, false);
        if (t2PageInfo.mIsRunning.get()) {
            b.lock();
        }
        t2PageInfo.mIsRunning.getAndSet(true);
        if (page.getRender() != null) {
            final Runnable runnable = new Runnable() { // from class: com.alibaba.griver.base.t2.T2Utils.7
                @Override // java.lang.Runnable
                public void run() {
                    if (t2PageInfo.isWaiting()) {
                        t2PageInfo.setWaiting(false);
                        StringBuilder sb = new StringBuilder();
                        sb.append("androidT2 callback delayandroidT2AppId");
                        sb.append(page.getApp().getAppId());
                        sb.append(" ,page=");
                        sb.append(page.getPageURI() == null ? "" : page.getPageURI());
                        GriverLogger.d("T2Utils", sb.toString());
                        CollectPerformanceCallback collectPerformanceCallback2 = collectPerformanceCallback;
                        if (collectPerformanceCallback2 != null) {
                            collectPerformanceCallback2.afterProcess();
                        }
                        t2PageInfo.mIsRunning.getAndSet(false);
                        if (T2Utils.b.isLocked()) {
                            T2Utils.b.unlock();
                        }
                    }
                }
            };
            t2PageInfo.setWaiting(true);
            executeSendToRender(page.getRender(), t2PageInfo, RenderCallContext.newBuilder(page.getRender()).type(RenderCallContext.TYPE_CALL).action("collectPerformanceBeforeDestroy").param(null).build(), new SendToRenderCallback() { // from class: com.alibaba.griver.base.t2.T2Utils.8
                @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                public void onCallBack(JSONObject jSONObject) {
                    if (t2PageInfo.isWaiting()) {
                        t2PageInfo.setWaiting(false);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("eventExtraData");
                        T2Store t2Store = null;
                        if (jSONObject2 != null) {
                            t2Store = new T2Store(JSONUtils.getString(jSONObject2, "enableJsT2"), JSONUtils.getString(jSONObject2, "ucJsT2"), JSONUtils.getString(jSONObject2, "ucJsT2State"), JSONUtils.getJSONObject(jSONObject2, "extraJsT2Map", (JSONObject) null));
                            GriverLogger.d("T2Utils", "androidT2 callback data:" + t2Store + "androidT2AppId" + page.getApp().getAppId());
                        }
                        page.setData(T2Store.class, t2Store);
                        ExecutorUtils.removeOnMain(runnable);
                        CollectPerformanceCallback collectPerformanceCallback2 = collectPerformanceCallback;
                        if (collectPerformanceCallback2 != null) {
                            collectPerformanceCallback2.afterProcess();
                        }
                        t2PageInfo.mIsRunning.getAndSet(false);
                        if (T2Utils.b.isLocked()) {
                            T2Utils.b.unlock();
                        }
                    }
                }
            });
            ExecutorUtils.runOnMain(runnable, 1000L);
            return;
        }
        collectPerformanceCallback.afterProcess();
        t2PageInfo.mIsRunning.getAndSet(false);
        ReentrantLock reentrantLock = b;
        if (reentrantLock.isLocked()) {
            reentrantLock.unlock();
        }
    }

    public static void collectPerformanceWhenDestroy(final Page page, final CollectPerformanceCallback collectPerformanceCallback) {
        try {
            final T2PageInfo t2PageInfo = (T2PageInfo) page.getData(T2PageInfo.class, false);
            if (t2PageInfo.mIsRunning.get()) {
                a.lock();
            }
            t2PageInfo.mIsRunning.getAndSet(true);
            if (page.getRender() != null) {
                final Runnable runnable = new Runnable() { // from class: com.alibaba.griver.base.t2.T2Utils.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (t2PageInfo.isWaiting()) {
                            t2PageInfo.setWaiting(false);
                            RVLogger.d("T2Utils", "androidT2 callback delayandroidT2AppId" + page.getApp().getAppId());
                            CollectPerformanceCallback collectPerformanceCallback2 = collectPerformanceCallback;
                            if (collectPerformanceCallback2 != null) {
                                collectPerformanceCallback2.afterProcess();
                            }
                            t2PageInfo.mIsRunning.getAndSet(false);
                            if (T2Utils.a.isLocked()) {
                                T2Utils.a.unlock();
                            }
                        }
                    }
                };
                t2PageInfo.setWaiting(true);
                executeSendToRender(page.getRender(), t2PageInfo, RenderCallContext.newBuilder(page.getRender()).type(RenderCallContext.TYPE_CALL).action("collectPerformanceBeforeDestroy").param(null).build(), new SendToRenderCallback() { // from class: com.alibaba.griver.base.t2.T2Utils.5
                    @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
                    public void onCallBack(JSONObject jSONObject) {
                        if (t2PageInfo.isWaiting()) {
                            t2PageInfo.setWaiting(false);
                            JSONObject jSONObject2 = jSONObject.getJSONObject("eventExtraData");
                            T2Store t2Store = null;
                            if (jSONObject2 != null) {
                                t2Store = new T2Store(JSONUtils.getString(jSONObject2, "enableJsT2"), JSONUtils.getString(jSONObject2, "ucJsT2"), JSONUtils.getString(jSONObject2, "ucJsT2State"), JSONUtils.getJSONObject(jSONObject2, "extraJsT2Map", (JSONObject) null));
                                RVLogger.d("T2Utils", "androidT2 callback data:" + t2Store + "androidT2AppId" + page.getApp().getAppId());
                            }
                            page.setData(T2Store.class, t2Store);
                            ExecutorUtils.removeOnMain(runnable);
                            CollectPerformanceCallback collectPerformanceCallback2 = collectPerformanceCallback;
                            if (collectPerformanceCallback2 != null) {
                                collectPerformanceCallback2.afterProcess();
                            }
                            t2PageInfo.mIsRunning.getAndSet(false);
                            if (T2Utils.a.isLocked()) {
                                T2Utils.a.unlock();
                            }
                        }
                    }
                });
                ExecutorUtils.runOnMain(runnable, 1000L);
                return;
            }
            t2PageInfo.mIsRunning.getAndSet(false);
            ReentrantLock reentrantLock = a;
            if (reentrantLock.isLocked()) {
                reentrantLock.unlock();
            }
        } catch (Throwable unused) {
            if (collectPerformanceCallback != null) {
                collectPerformanceCallback.afterProcess();
            }
        }
    }

    public static void executeSendToRender(Render render, T2PageInfo t2PageInfo, RenderCallContext renderCallContext, SendToRenderCallback sendToRenderCallback) {
        t2PageInfo.putRenderCallback(renderCallContext.getEventId(), sendToRenderCallback);
        String eventId = renderCallContext.getEventId();
        String action = renderCallContext.getAction();
        JSONObject param = renderCallContext.getParam();
        String type = renderCallContext.getType();
        boolean keep = renderCallContext.getKeep();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(RVParams.CLIENT_ID, eventId);
        jSONObject.put(RVParams.FUNC, action);
        jSONObject.put(RVParams.PARAM, param);
        jSONObject.put(RVParams.MSG_TYPE, type);
        jSONObject.put(RVParams.KEEP_CALLBACK, Boolean.valueOf(keep));
        String str = "AlipayJSBridge._invokeJS(" + JSON.toJSONString(jSONObject.toJSONString()) + ")";
        try {
            render.eveluateJavaScript("javascript:(function(){if(typeof AlipayJSBridge === 'object'){" + str + "}})();");
            StringBuilder sb = new StringBuilder();
            sb.append("androidT2 jsapi rep:");
            sb.append(str);
            RVLogger.d("T2Utils", sb.toString());
        } catch (Exception e) {
            RVLogger.e("T2Utils", "androidT2 loadUrl exception", e);
        }
    }

    public static GriverFullLinkStageMonitor performanceJST2(final App app) {
        final GriverFullLinkStageMonitor stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverFullLinkStageMonitor.getMonitorToken(app));
        if (stageMonitor != null && !stageMonitor.isUploaded()) {
            stageMonitor.setUpload();
            stageMonitor.transitToNext("appFinished");
            final Page pageRemoveT2Page = GriverAppConfig.getInstance().removeT2Page(app);
            if (pageRemoveT2Page != null) {
                collectPerformanceWhenDestroy(pageRemoveT2Page, new CollectPerformanceCallback() { // from class: com.alibaba.griver.base.t2.T2Utils.1
                    public void afterProcess() {
                        JSONObject extraJsT2MapStr;
                        try {
                            T2Store t2Store = (T2Store) pageRemoveT2Page.getData(T2Store.class);
                            if (t2Store != null && (extraJsT2MapStr = t2Store.getExtraJsT2MapStr()) != null) {
                                stageMonitor.transitToNext("jst2_start", T2Utils.a(JSONUtils.getString(extraJsT2MapStr, "N_ST", "")));
                                stageMonitor.transitToNext("jst2_t2_render", T2Utils.a(t2Store.getUcJsT2()));
                                stageMonitor.transitToNext("jst2_fp", T2Utils.a(JSONUtils.getString(extraJsT2MapStr, "P_FP", "")));
                                stageMonitor.transitToNext("jst2_fcp", T2Utils.a(JSONUtils.getString(extraJsT2MapStr, "P_FCP", "")));
                                if (extraJsT2MapStr.containsKey("P_LCP")) {
                                    String[] strArrSplit = extraJsT2MapStr.getString("P_LCP").split(",");
                                    if (strArrSplit.length > 0) {
                                        stageMonitor.transitToNext("jst2_lcp", T2Utils.a(strArrSplit[0]));
                                    }
                                }
                                stageMonitor.addParam("jst2_t2_stop_reason", t2Store.getUcJsT2State());
                                stageMonitor.addParam("jst2_version", extraJsT2MapStr.getString("G_VER"));
                                if (extraJsT2MapStr.containsKey("ERR_WS")) {
                                    String[] strArrSplit2 = extraJsT2MapStr.getString("ERR_WS").split(",");
                                    if (strArrSplit2.length > 4) {
                                        stageMonitor.addParam("jst2_ws_type", strArrSplit2[0]);
                                        stageMonitor.addParam("jst2_ws_time", strArrSplit2[1]);
                                        stageMonitor.addParam("jst2_ws_appx_state", strArrSplit2[2]);
                                        stageMonitor.addParam("jst2_ws_check_time", strArrSplit2[3]);
                                        stageMonitor.addParam("jst2_ws_scan", strArrSplit2[4]);
                                    }
                                }
                                if (extraJsT2MapStr.containsKey("ERR_JSERROR")) {
                                    String[] strArrSplit3 = extraJsT2MapStr.getString("ERR_JSERROR").split(",");
                                    if (strArrSplit3.length > 1) {
                                        stageMonitor.addParam("jst2_jserror_time", strArrSplit3[0]);
                                        stageMonitor.addParam("jst2_jserror_detail", strArrSplit3[1]);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            GriverLogger.e("T2Utils", "RVPerfLogLifeCycleExtension#onAppExit parse t2 error" + th);
                        }
                        stageMonitor.upload(app);
                    }
                });
                return stageMonitor;
            }
            stageMonitor.upload(app);
        }
        return stageMonitor;
    }

    public static void performanceJST2WithPageCallback(final Page page, final PageT2DataCallback pageT2DataCallback) {
        final HashMap map = new HashMap();
        if (page != null) {
            collectPagePerformanceWhenDestroy(page, new CollectPerformanceCallback() { // from class: com.alibaba.griver.base.t2.T2Utils.2
                public void afterProcess() {
                    JSONObject extraJsT2MapStr;
                    try {
                        T2Store t2Store = (T2Store) page.getData(T2Store.class);
                        if (t2Store != null && (extraJsT2MapStr = t2Store.getExtraJsT2MapStr()) != null) {
                            map.put("jst2_t2_render", Long.valueOf(T2Utils.a(t2Store.getUcJsT2())));
                            if (extraJsT2MapStr.containsKey("ERR_WS")) {
                                String[] strArrSplit = extraJsT2MapStr.getString("ERR_WS").split(",");
                                if (strArrSplit.length > 4) {
                                    map.put("jst2_ws_type", strArrSplit[0]);
                                    map.put("jst2_ws_time", strArrSplit[1]);
                                }
                            }
                        }
                        pageT2DataCallback.onPageT2Data(map);
                    } catch (Throwable unused) {
                        pageT2DataCallback.onPageT2Data(map);
                        GriverLogger.e("T2Utils", "performanceJST2WithPageCallback  error");
                    }
                }
            });
        } else {
            pageT2DataCallback.onPageT2Data(map);
        }
    }

    public static void performanceJST2(final Page page) {
        if (page == null || !GriverAppConfig.getInstance().isCollectT2(page, page.getApp().getAppId(), page.getApp().isTinyApp())) {
            return;
        }
        final MonitorMap.Builder builder = new MonitorMap.Builder();
        builder.append("uuid", GriverFullLinkStageMonitor.getMonitorToken(page.getApp())).url(page.getPageURI()).append("isMain", String.valueOf(page.getApp().getPageByIndex(0) == page));
        collectPerformanceWhenDestroy(page, new CollectPerformanceCallback() { // from class: com.alibaba.griver.base.t2.T2Utils.3
            public void afterProcess() {
                try {
                    T2Store t2Store = (T2Store) page.getData(T2Store.class);
                    if (t2Store != null) {
                        builder.needAsynAppType(true);
                        JSONObject extraJsT2MapStr = t2Store.getExtraJsT2MapStr();
                        if (extraJsT2MapStr != null) {
                            if (extraJsT2MapStr.containsKey("ERR_WS")) {
                                String[] strArrSplit = extraJsT2MapStr.getString("ERR_WS").split(",");
                                if (strArrSplit.length > 4) {
                                    builder.append("jst2_ws_type", strArrSplit[0]).append("jst2_ws_time", strArrSplit[1]).append("jst2_ws_appx_state", strArrSplit[2]).append("jst2_ws_check_time", strArrSplit[3]).append("jst2_ws_scan", strArrSplit[4]);
                                }
                            }
                            if (extraJsT2MapStr.containsKey("ERR_JSERROR")) {
                                String[] strArrSplit2 = extraJsT2MapStr.getString("ERR_JSERROR").split(",");
                                if (strArrSplit2.length > 1) {
                                    builder.append("jst2_jserror_time", strArrSplit2[0]).append("jst2_jserror_detail", strArrSplit2[1]);
                                }
                            }
                        }
                        GriverMonitor.event("mini_app_white_screenV3", "GriverAppContainer", builder.build());
                    }
                } catch (Throwable th) {
                    GriverLogger.e("T2Utils", "RVPerfLogLifeCycleExtension#onAppExit parse t2 error" + th);
                }
            }
        });
    }
}
