package com.alibaba.griver.base.performance;

import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.performance.jsapi.PerformanceJSAPIMonitor;
import com.alibaba.griver.base.performance.pdstrackers.PdsTrackersMonitor;
import com.alibaba.griver.base.performance.setdata.PerformanceSetDataMonitor;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PerformanceMonitorFactory {
    public static final ConcurrentHashMap<String, ConcurrentHashMap<PerformanceType, PerformanceMonitor>> a = new ConcurrentHashMap<>();

    public enum PerformanceType {
        JSAPI,
        SET_DATA,
        PDS_TRACKERS
    }

    public static JSONObject getPerformance(String str) {
        JSONObject data;
        JSONObject jSONObject = new JSONObject();
        ConcurrentHashMap<PerformanceType, PerformanceMonitor> concurrentHashMap = a.get(str);
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<PerformanceType, PerformanceMonitor>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                PerformanceMonitor value = it.next().getValue();
                if (value != null && (data = value.getData()) != null) {
                    jSONObject.putAll(data);
                }
            }
        }
        return jSONObject;
    }

    public static <T extends PerformanceMonitor> T getPerformanceMonitor(String str, PerformanceType performanceType) {
        ConcurrentHashMap<PerformanceType, PerformanceMonitor> concurrentHashMap = a.get(str);
        T t = concurrentHashMap != null ? (T) concurrentHashMap.get(performanceType) : null;
        if (t != null) {
            return t;
        }
        return null;
    }

    public static void register(String str) {
        unRegister(str);
        ConcurrentHashMap<PerformanceType, PerformanceMonitor> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(PerformanceType.JSAPI, new PerformanceJSAPIMonitor());
        concurrentHashMap.put(PerformanceType.SET_DATA, new PerformanceSetDataMonitor());
        concurrentHashMap.put(PerformanceType.PDS_TRACKERS, new PdsTrackersMonitor());
        a.put(str, concurrentHashMap);
    }

    public static void unRegister(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<PerformanceType, PerformanceMonitor>> concurrentHashMap = a;
        ConcurrentHashMap<PerformanceType, PerformanceMonitor> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        concurrentHashMap.remove(str);
    }

    public static void upload(App app) {
        ConcurrentHashMap<PerformanceType, PerformanceMonitor> concurrentHashMap = a.get(app.getAppId());
        if (concurrentHashMap != null) {
            Iterator<PerformanceMonitor> it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                it.next().upload(app);
            }
        }
    }
}
