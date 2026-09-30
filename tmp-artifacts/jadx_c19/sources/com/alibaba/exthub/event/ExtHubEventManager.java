package com.alibaba.exthub.event;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.exthub.common.ExtHubLogger;
import com.alibaba.exthub.event.listener.ExtHubEventListener;
import com.alibaba.exthub.event.listener.ExtHubEventWithBizTypeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubEventManager {
    private static volatile ExtHubEventManager a;
    private Map<String, Map<String, List<ExtHubEventListener>>> b = new ConcurrentHashMap();
    private Map<String, Map<String, List<ExtHubEventWithBizTypeListener>>> c = new ConcurrentHashMap();

    public static ExtHubEventManager getInstance() {
        if (a == null) {
            synchronized (ExtHubEventManager.class) {
                if (a == null) {
                    a = new ExtHubEventManager();
                }
            }
        }
        return a;
    }

    public void onEvent(String str, ExtHubEventListener extHubEventListener) {
        if (TextUtils.isEmpty(str)) {
            ExtHubLogger.d("ExtHubEventManager", "onEventWithEventName eventName is null or empty");
            return;
        }
        if (extHubEventListener == null) {
            ExtHubLogger.d("ExtHubEventManager", "onEventWithEventName listener is null");
            return;
        }
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        Activity activity = null;
        if (rVEnvironmentService != null && rVEnvironmentService.getTopActivity() != null) {
            activity = (Activity) rVEnvironmentService.getTopActivity().get();
        }
        if (activity == null) {
            ExtHubLogger.d("ExtHubEventManager", "onEventWithEventName activity is null");
        } else {
            a(a(activity), str, extHubEventListener);
        }
    }

    public void onEvent(String str, String str2, ExtHubEventWithBizTypeListener extHubEventWithBizTypeListener) {
        if (TextUtils.isEmpty(str)) {
            ExtHubLogger.d("ExtHubEventManager", "onCustomEventWithBizType bizType is null or empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            ExtHubLogger.d("ExtHubEventManager", "onCustomEventWithBizType eventName is null or empty");
        } else if (extHubEventWithBizTypeListener == null) {
            ExtHubLogger.d("ExtHubEventManager", "onCustomEventWithBizType listener is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(str, str2, extHubEventWithBizTypeListener);
        }
    }

    private void a(String str, String str2, ExtHubEventListener extHubEventListener) {
        if (this.b.containsKey(str)) {
            Map<String, List<ExtHubEventListener>> map = this.b.get(str);
            if (map != null) {
                List<ExtHubEventListener> arrayList = map.containsKey(str2) ? map.get(str2) : null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(extHubEventListener);
                map.put(str2, arrayList);
                return;
            }
            return;
        }
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(extHubEventListener);
        map2.put(str2, arrayList2);
        this.b.put(str, map2);
    }

    private void a(String str, String str2, ExtHubEventWithBizTypeListener extHubEventWithBizTypeListener) {
        if (this.c.containsKey(str)) {
            Map<String, List<ExtHubEventWithBizTypeListener>> map = this.c.get(str);
            if (map != null) {
                List<ExtHubEventWithBizTypeListener> arrayList = map.containsKey(str2) ? map.get(str2) : null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(extHubEventWithBizTypeListener);
                map.put(str2, arrayList);
                return;
            }
            return;
        }
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(extHubEventWithBizTypeListener);
        map2.put(str2, arrayList2);
        this.c.put(str, map2);
    }

    public Map<String, Map<String, List<ExtHubEventListener>>> getActivityEventMap() {
        return this.b;
    }

    public Map<String, Map<String, List<ExtHubEventWithBizTypeListener>>> getBizTypeEventMap() {
        return this.c;
    }

    public void offEvent(Activity activity) {
        String strA = a(activity);
        if (TextUtils.isEmpty(strA)) {
            ExtHubLogger.d("ExtHubEventManager", "removeEventWithActivity activity is null");
        } else {
            this.b.remove(strA);
        }
    }

    public void offGlobalEventWithBizType(String str) {
        if (TextUtils.isEmpty(str)) {
            ExtHubLogger.d("ExtHubEventManager", "offCustomEventWithBizType bizType is null");
        } else {
            this.c.remove(str);
        }
    }

    public void offGlobalEventWithBizType(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ExtHubLogger.d("ExtHubEventManager", "offCustomEventWithBizType bizType is null or empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            ExtHubLogger.d("ExtHubEventManager", "offCustomEventWithBizType eventName is null or empty");
            return;
        }
        Map<String, List<ExtHubEventWithBizTypeListener>> map = this.c.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    private String a(Activity activity) {
        if (activity == null) {
            return "";
        }
        return activity.getClass().getSimpleName() + "@" + activity.hashCode();
    }
}
