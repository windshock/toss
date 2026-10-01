package com.alibaba.griver.core.ui;

import android.os.Message;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.BaseAppContext;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.common.page.GriverStartPageFailedExtension;
import com.alibaba.griver.api.ui.GVSplashView;
import com.alibaba.griver.api.ui.GVViewFactory;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverKeepAliveFullLinkStageMonitor;
import com.alibaba.griver.base.t2.T2Utils;
import com.alibaba.griver.core.keepalive.ActivityBackAdvice;
import com.alibaba.griver.core.keepalive.AliveActivityInfo;
import com.alibaba.griver.core.keepalive.KeepAliveAppManager;
import com.alibaba.griver.core.ui.fragment.GRVFragmentManager;
import com.alibaba.griver.ui.splash.SplashViewSpecProvider;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NebulaAppContext extends BaseAppContext {
    public WeakReference<GVSplashView> a;
    public ViewGroup b;
    public ViewSpecProvider c;

    public NebulaAppContext(AppNode appNode, FragmentActivity fragmentActivity, int i2, int i3) {
        super(appNode, fragmentActivity, i2, i3);
        this.c = new SplashViewSpecProvider(fragmentActivity);
        AppModel parcelable = BundleUtils.getParcelable(appNode.getSceneParams(), "appInfo");
        GVSplashView gVSplashViewCreateSplashView = appNode.isTinyApp() ? ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createSplashView(getFragmentManager().getInnerManager(), appNode, parcelable) : ((GVViewFactory) RVProxy.get(GVViewFactory.class)).createSplashH5View(getFragmentManager().getInnerManager(), appNode, parcelable);
        if (gVSplashViewCreateSplashView != null) {
            gVSplashViewCreateSplashView.setReloadListener(new GVSplashView.OnReloadListener() { // from class: com.alibaba.griver.core.ui.NebulaAppContext.1
                @Override // com.alibaba.griver.api.ui.GVSplashView.OnReloadListener
                public void onReload() {
                    if (NebulaAppContext.this.mApp != null) {
                        IpcMessage ipcMessage = new IpcMessage();
                        ipcMessage.biz = NebulaAppContext.this.mApp.getStartToken() + "GriverMsg_App_Controller";
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 0;
                        ipcMessage.bizMsg = messageObtain;
                        ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
                    }
                }
            });
            gVSplashViewCreateSplashView.setOnExitListener(new GVSplashView.OnExitListener() { // from class: com.alibaba.griver.core.ui.NebulaAppContext.2
                @Override // com.alibaba.griver.api.ui.GVSplashView.OnExitListener
                public void onExit() {
                    if (NebulaAppContext.this.mApp != null) {
                        IpcMessage ipcMessage = new IpcMessage();
                        ipcMessage.biz = NebulaAppContext.this.getApp().getStartToken() + "GriverMsg_App_Controller";
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        ipcMessage.bizMsg = messageObtain;
                        ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
                    }
                }
            });
            this.a = new WeakReference<>(gVSplashViewCreateSplashView);
        }
    }

    public final boolean a(App app) {
        AliveActivityInfo aliveActivityInfoFindAliveActivityByAppId = KeepAliveAppManager.getInstance().findAliveActivityByAppId(app.getAppId());
        if (aliveActivityInfoFindAliveActivityByAppId == null) {
            return false;
        }
        return ActivityBackAdvice.moveTaskToBack(getActivity(), aliveActivityInfoFindAliveActivityByAppId.getFromTaskId(), true);
    }

    public void applyTransparentTitle(boolean z) {
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public IFragmentManager createFragmentManager(int i2) {
        return new GRVFragmentManager(getApp(), i2, getActivity());
    }

    public SplashView getSplashView() {
        WeakReference<GVSplashView> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public ViewGroup getTabBarContainer(int i2) {
        if (this.b == null) {
            this.b = (ViewGroup) getActivity().findViewById(i2);
        }
        return this.b;
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public ViewSpecProvider getViewSpecProvider() {
        return this.c;
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public boolean isTaskRoot() {
        return true;
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public boolean moveToBackground() {
        App app = getApp();
        boolean zA = false;
        if (app == null) {
            return false;
        }
        if (KeepAliveAppManager.getInstance().needSupportKeepAlive(app.getAppId(), app.getStartParams()) && RVParams.DEFAULT_LONG_PRESSO_LOGIN.equalsIgnoreCase(BundleUtils.getString(app.getStartParams(), "enableKeepAlive", RVParams.DEFAULT_LONG_PRESSO_LOGIN))) {
            zA = a(app);
            KeepAliveAppManager.getInstance().moveBackTaskAliveActivityByAppId(app.getAppId(), app.getStartToken(), zA);
        }
        GriverKeepAliveFullLinkStageMonitor stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(GriverKeepAliveFullLinkStageMonitor.getMonitorToken(app));
        if (stageMonitor != null) {
            stageMonitor.upload(app);
            GriverStageMonitorManager.getInstance().unRegisterStageMonitor(GriverKeepAliveFullLinkStageMonitor.getMonitorToken(app.getAppId(), String.valueOf(app.getStartToken())));
        }
        T2Utils.performanceJST2(app);
        return zA;
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public void onDestroy() throws Throwable {
        App app = getApp();
        if (app != null) {
            IpcMessage ipcMessage = new IpcMessage();
            ipcMessage.biz = app.getStartToken() + "GriverMsg_App_Controller";
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            ipcMessage.bizMsg = messageObtain;
            ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
        }
        WeakReference<GVSplashView> weakReference = this.a;
        if (weakReference != null) {
            GVSplashView gVSplashView = weakReference.get();
            if (gVSplashView != null) {
                gVSplashView.setReloadListener(null);
            }
            this.a.clear();
        }
        super.onDestroy();
    }

    @Override // com.alibaba.ariver.app.BaseAppContext
    public void start(Page page) {
        try {
            super.start(page);
        } catch (Throwable th) {
            GriverLogger.e("NebulaAppContext", "push page failed", th);
            MonitorMap.Builder builder = new MonitorMap.Builder();
            builder.appId(getApp().getAppId());
            builder.version(getApp());
            builder.url(getApp().getStartUrl());
            builder.exception(th);
            builder.message("Start page failed");
            GriverMonitor.error("mini_start_page_exception", "GriverAppContainer", builder.build());
            ((GriverStartPageFailedExtension) RVProxy.get(GriverStartPageFailedExtension.class)).startFailed(th, GriverEnv.getApplicationContext());
            if (page != null) {
                page.exit(true);
            } else {
                getApp().exit();
            }
        }
    }
}
