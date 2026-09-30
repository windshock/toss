package com.alibaba.exthub.lifecycler;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.exthub.base.ExtHubPage;
import com.alibaba.exthub.base.ExtHubPageContext;
import com.alibaba.exthub.common.ExtHubLogger;
import com.alibaba.exthub.proxy.ProcessLifecycleProxy;
import com.alibaba.exthub.proxy.TaskControlManagerProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LifecycleManager {
    public static final String TYPE_NOTIFY_ACTIVITY_DESTROY = "notifyOnActivityDestroy";
    public static final String TYPE_NOTIFY_ACTIVITY_PAUSE = "notifyOnActivityPause";
    public static final String TYPE_NOTIFY_ACTIVITY_RESUME = "notifyOnActivityResume";
    private static LifecycleManager a;
    private Map<String, Page> b = new ConcurrentHashMap();
    private Map<String, List<String>> c = new ConcurrentHashMap();
    private List<String> d = new ArrayList();
    private boolean e = false;
    private JSONArray f;

    public static LifecycleManager getInstance() {
        if (a == null) {
            synchronized (LifecycleManager.class) {
                if (a == null) {
                    a = new LifecycleManager();
                }
            }
        }
        return a;
    }

    public LifecycleManager() {
        a();
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_exthub_nativeApi_activityLifecycle_blackList", (String) null, new RVConfigService.OnConfigChangeListener() { // from class: com.alibaba.exthub.lifecycler.LifecycleManager.1
            public void onChange(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    LifecycleManager.this.f = JSON.parseArray(str);
                } catch (Exception e) {
                    ExtHubLogger.e("LifecycleManager", "config error", e);
                }
            }
        });
        if (TextUtils.isEmpty(config)) {
            return;
        }
        try {
            this.f = JSON.parseArray(config);
        } catch (Exception e) {
            ExtHubLogger.e("LifecycleManager", "config error", e);
        }
    }

    public Page bindViewNode(String str, Activity activity) {
        if (activity == null) {
            activity = getTopActivity();
        }
        a(activity);
        String strB = b(activity);
        Page page = this.b.get(strB);
        if (page != null) {
            return page;
        }
        Page extHubPage = new ExtHubPage(str);
        extHubPage.bindContext(new ExtHubPageContext(activity));
        this.b.put(strB, extHubPage);
        return extHubPage;
    }

    private void a(Activity activity) {
        try {
        } catch (Exception e) {
            ExtHubLogger.e("LifecycleManager", "initActivityLifecycleCallbacks error", e);
        }
        if (this.e || activity == null) {
            return;
        }
        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.alibaba.exthub.lifecycler.LifecycleManager.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity2) {
                Page page;
                if (LifecycleManager.this.c(activity2) || (page = (Page) LifecycleManager.this.b.get(LifecycleManager.this.b(activity2))) == null) {
                    return;
                }
                LifecycleManager.this.a(page, activity2, LifecycleManager.TYPE_NOTIFY_ACTIVITY_RESUME);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity2) {
                Page page;
                if (LifecycleManager.this.c(activity2) || (page = (Page) LifecycleManager.this.b.get(LifecycleManager.this.b(activity2))) == null) {
                    return;
                }
                LifecycleManager.this.a(page, activity2, LifecycleManager.TYPE_NOTIFY_ACTIVITY_PAUSE);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity2) {
                String strB = LifecycleManager.this.b(activity2);
                Page page = (Page) LifecycleManager.this.b.get(strB);
                if (page != null) {
                    if (!LifecycleManager.this.c(activity2)) {
                        LifecycleManager.this.a(page, activity2, LifecycleManager.TYPE_NOTIFY_ACTIVITY_DESTROY);
                    }
                    page.destroy();
                    App app = page.getApp();
                    if (app != null) {
                        app.exit();
                    }
                    LifecycleManager.this.b.remove(strB);
                }
            }
        });
        this.e = true;
    }

    public void bindExtHubLifecycle(Page page, Class<? extends Scope> cls, Extension extension) {
        if (page == null || page.getPageContext() == null || page.getPageContext().getActivity() == null) {
            return;
        }
        String strB = b(page.getPageContext().getActivity());
        if (extension instanceof ActivityLifecycleExtension) {
            List<String> arrayList = this.c.get(strB);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            String name = extension.getClass().getName();
            if (!arrayList.contains(name)) {
                arrayList.add(name);
            }
            this.c.put(strB, arrayList);
        }
        if (!(extension instanceof ProcessLifecycleExtension) || cls == Page.class) {
            return;
        }
        String name2 = extension.getClass().getName();
        if (this.d.contains(name2)) {
            return;
        }
        this.d.add(name2);
    }

    public Activity getTopActivity() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService == null) {
            ExtHubLogger.e("LifecycleManager", "RVEnvironmentService is null");
            return null;
        }
        if (rVEnvironmentService.getTopActivity() != null) {
            return (Activity) rVEnvironmentService.getTopActivity().get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Activity activity) {
        if (activity == null && (activity = getTopActivity()) == null) {
            return "";
        }
        return activity.getClass().getSimpleName() + "@" + activity.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Page page, final Activity activity, final String str) {
        TaskControlManagerProxy taskControlManagerProxy = (TaskControlManagerProxy) RVProxy.get(TaskControlManagerProxy.class);
        if (taskControlManagerProxy != null) {
            taskControlManagerProxy.start();
        }
        ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() { // from class: com.alibaba.exthub.lifecycler.LifecycleManager.3
            @Override // java.lang.Runnable
            public void run() {
                List list = (List) LifecycleManager.this.c.get(LifecycleManager.this.b(activity));
                if (list == null || list.size() == 0) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Extension extensionFindExtension = BridgeDispatcher.getInstance().getNativeExtensionManager().findExtension(page, (String) it.next());
                    if (extensionFindExtension != null) {
                        LifecycleManager.this.a(activity, str, extensionFindExtension);
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Extension extensionFindExtension2 = BridgeDispatcher.getInstance().getNativeExtensionManager().findExtension((String) it2.next());
                    if (extensionFindExtension2 != null) {
                        LifecycleManager.this.a(activity, str, extensionFindExtension2);
                    }
                }
            }
        });
        if (taskControlManagerProxy != null) {
            taskControlManagerProxy.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, String str, Extension extension) {
        if (extension instanceof ActivityLifecycleExtension) {
            try {
                if (TYPE_NOTIFY_ACTIVITY_RESUME.equals(str)) {
                    ((ActivityLifecycleExtension) extension).onActivityResume(activity);
                } else if (TYPE_NOTIFY_ACTIVITY_PAUSE.equals(str)) {
                    ((ActivityLifecycleExtension) extension).onActivityPause(activity);
                } else if (TYPE_NOTIFY_ACTIVITY_DESTROY.equals(str)) {
                    ((ActivityLifecycleExtension) extension).onActivityDestroy(activity);
                }
            } catch (Exception e) {
                ExtHubLogger.e("LifecycleManager", "notifyActivityLifecycle error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            String name = activity.getClass().getName();
            JSONArray jSONArray = this.f;
            if (jSONArray != null && jSONArray.size() > 0) {
                if (this.f.contains(TtmlNode.COMBINE_ALL)) {
                    return true;
                }
                if (this.f.contains(name)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private void a() {
        ProcessLifecycleProxy processLifecycleProxy = (ProcessLifecycleProxy) RVProxy.get(ProcessLifecycleProxy.class);
        if (processLifecycleProxy == null) {
            ExtHubLogger.d("LifecycleManager", "processLifecycleProxy is null");
        } else {
            ExtHubLogger.d("LifecycleManager", "registerProcessLifecycleListener");
            processLifecycleProxy.registerProcessLifecycle(new ProcessLifecycleExtension() { // from class: com.alibaba.exthub.lifecycler.LifecycleManager.4
                @Override // com.alibaba.exthub.lifecycler.ProcessLifecycleExtension
                public void onProcessResume() {
                    LifecycleManager.this.a("notifyOnProcessResume");
                }

                @Override // com.alibaba.exthub.lifecycler.ProcessLifecycleExtension
                public void onProcessPause() {
                    LifecycleManager.this.a("notifyOnProcessPause");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        TaskControlManagerProxy taskControlManagerProxy = (TaskControlManagerProxy) RVProxy.get(TaskControlManagerProxy.class);
        if (taskControlManagerProxy != null) {
            taskControlManagerProxy.start();
        }
        ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() { // from class: com.alibaba.exthub.lifecycler.LifecycleManager.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = LifecycleManager.this.d.iterator();
                while (it.hasNext()) {
                    try {
                        ProcessLifecycleExtension processLifecycleExtensionFindExtension = BridgeDispatcher.getInstance().getNativeExtensionManager().findExtension((String) it.next());
                        if (processLifecycleExtensionFindExtension instanceof ProcessLifecycleExtension) {
                            if ("notifyOnProcessResume".equals(str)) {
                                processLifecycleExtensionFindExtension.onProcessResume();
                            } else if ("notifyOnProcessPause".equals(str)) {
                                processLifecycleExtensionFindExtension.onProcessPause();
                            }
                        }
                    } catch (Exception e) {
                        ExtHubLogger.e("LifecycleManager", "notifyProcessLifecycle error", e);
                    }
                }
            }
        });
        if (taskControlManagerProxy != null) {
            taskControlManagerProxy.end();
        }
    }
}
