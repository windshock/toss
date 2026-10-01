package com.alibaba.griver.ui.splash;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.GVSplashView;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.stagemonitor.GriverStageMonitorManager;
import com.alibaba.griver.base.stagemonitor.impl.GriverFullLinkStageMonitor;
import com.alibaba.griver.uimode.GriverThemeManager;
import com.alibaba.griver.uimode.api.UiMode;
import com.alibaba.griver.uimode.callback.ConfigurationCallback;
import java.util.Map;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GriverSplashView extends BaseSplashView implements ConfigurationCallback {
    public int b;
    public FlowMeasureLazyPolicyExternalSyntheticLambda3 c;
    public GriverSplashFragmentExtension.AbstractSplashFragment d;
    public SplashView.Status e;
    public App f;
    public AppModel g;

    /* renamed from: com.alibaba.griver.ui.splash.GriverSplashView$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status;

        static {
            int[] iArr = new int[SplashView.Status.values().length];
            $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status = iArr;
            try {
                iArr[SplashView.Status.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status[SplashView.Status.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status[SplashView.Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status[SplashView.Status.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public GriverSplashView(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, App app, AppModel appModel) {
        super(app);
        this.c = flowMeasureLazyPolicyExternalSyntheticLambda3;
        this.f = app;
        this.b = R.id.splash_container;
        this.e = SplashView.Status.WAITING;
        this.g = appModel == null ? new AppModel() : appModel;
    }

    public final SplashEntryInfo a(EntryInfo entryInfo) {
        SplashEntryInfo splashEntryInfo = new SplashEntryInfo();
        App app = this.f;
        if (app != null) {
            splashEntryInfo.appId = app.getAppId();
        }
        if (entryInfo != null) {
            splashEntryInfo.appName = entryInfo.title;
            splashEntryInfo.slogan = entryInfo.slogan;
            splashEntryInfo.desc = entryInfo.desc;
            splashEntryInfo.iconUrl = entryInfo.iconUrl;
            JSONObject jSONObject = entryInfo.extraInfo;
            if (jSONObject != null) {
                splashEntryInfo.progress = jSONObject.getInteger("progress").intValue();
                splashEntryInfo.needRefresh = entryInfo.extraInfo.getBoolean(SplashEntryInfo.NEED_REFRESH).booleanValue();
            }
        }
        return splashEntryInfo;
    }

    public boolean backPressed() {
        SplashView.Status status = this.e;
        if (status != SplashView.Status.LOADING && status != SplashView.Status.ERROR) {
            return false;
        }
        this.f.exit();
        return true;
    }

    @Override // com.alibaba.griver.ui.splash.BaseSplashView
    public void exit(SplashView.ExitListener exitListener) {
        super.exit(exitListener);
        GriverThemeManager.getThemeManager().removeConfigurationCallback(this);
        int i2 = AnonymousClass5.$SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status[this.e.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (exitListener != null) {
                exitListener.onExit();
            }
        } else if (i2 == 3 || i2 == 4) {
            Fragment fragmentFindFragmentByTag = this.c.findFragmentByTag(SplashFragment.FRAGMENT_TAG);
            RVLogger.d("SplashView", "exitLoading with loadingFragment: " + fragmentFindFragmentByTag);
            if (fragmentFindFragmentByTag instanceof GriverSplashFragmentExtension.AbstractSplashFragment) {
                ((GriverSplashFragmentExtension.AbstractSplashFragment) fragmentFindFragmentByTag).exit();
                this.c.onExtraCallbackWithResult().onNavigationEvent(fragmentFindFragmentByTag).onExtraCallbackWithResult();
            }
            if (exitListener != null) {
                exitListener.onExit();
            }
        }
        this.e = SplashView.Status.EXIT;
    }

    public GriverSplashFragmentExtension.AbstractSplashFragment getSplashFragment() {
        return this.d;
    }

    public SplashView.Status getStatus() {
        return this.e;
    }

    public void onConfigurationChanged(Configuration configuration, UiMode uiMode) {
        GriverSplashFragmentExtension.AbstractSplashFragment abstractSplashFragment = this.d;
        if (abstractSplashFragment == null || !abstractSplashFragment.isAdded()) {
            return;
        }
        this.d.onConfigurationChanged(configuration, uiMode);
    }

    public void showError(final String str, final String str2, @Nullable Map<String, String> map) {
        this.e = SplashView.Status.ERROR;
        RVLogger.d("SplashView", "showError with loadingFragment: " + this.c.findFragmentByTag(SplashFragment.FRAGMENT_TAG));
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.griver.ui.splash.GriverSplashView.3
            @Override // java.lang.Runnable
            public void run() {
                GriverSplashView.this.a();
                if (GriverSplashView.this.d != null) {
                    Bundle bundle = GriverSplashView.this.d.getArguments() == null ? new Bundle() : GriverSplashView.this.d.getArguments();
                    if (GriverSplashView.this.d.isAdded() || GriverSplashView.this.d.isStateSaved()) {
                        GriverSplashView.this.d.showError(str, str2);
                        return;
                    }
                    bundle.putBoolean("showError", true);
                    bundle.putString("errorCode", str);
                    bundle.putString("errorMessage", str2);
                    GriverSplashView.this.d.setArguments(bundle);
                }
            }
        });
    }

    @Override // com.alibaba.griver.ui.splash.BaseSplashView
    public void showLoading(final EntryInfo entryInfo) {
        if (entryInfo == null) {
            return;
        }
        super.showLoading(entryInfo);
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.griver.ui.splash.GriverSplashView.1
            @Override // java.lang.Runnable
            public void run() {
                if (GriverSplashView.this.f == null || GriverSplashView.this.f.isDestroyed()) {
                    RVLogger.w("SplashView", "app has been destroyed");
                    return;
                }
                if (GriverSplashView.this.e != SplashView.Status.ERROR) {
                    SplashView.Status status = GriverSplashView.this.e;
                    SplashView.Status status2 = SplashView.Status.LOADING;
                    if (status != status2) {
                        GriverSplashView.this.e = status2;
                        GriverSplashView.this.a();
                        SplashEntryInfo splashEntryInfoA = GriverSplashView.this.a(entryInfo);
                        RVLogger.d("SplashView", "showLoading with loadingFragment added " + GriverSplashView.this.d.isAdded() + " and loadingInfo:" + splashEntryInfoA);
                        try {
                            Bundle bundle = GriverSplashView.this.d.getArguments() == null ? new Bundle() : GriverSplashView.this.d.getArguments();
                            if (GriverSplashView.this.d.isAdded()) {
                                if (splashEntryInfoA.needRefresh) {
                                    GriverSplashView.this.d.updateLoadingInfo(splashEntryInfoA);
                                }
                                GriverSplashView.this.d.updateProgress(splashEntryInfoA);
                                return;
                            } else {
                                bundle.putString("usePresetPopmenu", BundleUtils.getString(GriverSplashView.this.f.getSceneParams(), "usePresetPopmenu"));
                                bundle.putParcelable("entryInfo", splashEntryInfoA);
                                bundle.putParcelable("appInfo", GriverSplashView.this.g);
                                GriverSplashView.this.d.setArguments(bundle);
                                return;
                            }
                        } catch (Throwable th) {
                            RVLogger.e("SplashView", "showLoading with loadingFragment exception", th);
                            return;
                        }
                    }
                }
                RVLogger.w("SplashView", "showLoading not work on " + GriverSplashView.this.e + " Status");
            }
        });
    }

    public void update(final EntryInfo entryInfo) {
        if (this.e != SplashView.Status.LOADING) {
            RVLogger.w("SplashView", "updateLoading before showLoading would not working!");
        } else {
            final SplashEntryInfo splashEntryInfoA = a(entryInfo);
            ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.griver.ui.splash.GriverSplashView.2
                @Override // java.lang.Runnable
                public void run() {
                    if (GriverSplashView.this.d != null) {
                        RVLogger.d("SplashView", "updateLoading with loadingFragment isAdded: " + GriverSplashView.this.d.isAdded() + " and loadingInfo:" + entryInfo);
                        Bundle bundle = GriverSplashView.this.d.getArguments() == null ? new Bundle() : GriverSplashView.this.d.getArguments();
                        if (!GriverSplashView.this.d.isAdded()) {
                            bundle.putParcelable("entryInfo", splashEntryInfoA);
                            GriverSplashView.this.d.setArguments(bundle);
                        } else {
                            if (splashEntryInfoA.needRefresh) {
                                GriverSplashView.this.d.updateLoadingInfo(splashEntryInfoA);
                            }
                            GriverSplashView.this.d.updateProgress(splashEntryInfoA);
                        }
                    }
                }
            });
        }
    }

    public void updateLoadingProgress(int i2) {
    }

    public final void a() {
        if (this.d == null) {
            GriverSplashFragmentExtension.AbstractSplashFragment abstractSplashFragmentCreateSplashFragment = ((GriverSplashFragmentExtension) RVProxy.get(GriverSplashFragmentExtension.class)).createSplashFragment();
            this.d = abstractSplashFragmentCreateSplashFragment;
            if (abstractSplashFragmentCreateSplashFragment == null) {
                GriverLogger.e("SplashView", "splash fragment is null, can not show loading");
                return;
            }
            this.c.onExtraCallbackWithResult().IAuthTabCallback(this.b, this.d, SplashFragment.FRAGMENT_TAG).onExtraCallbackWithResult();
            GriverThemeManager.getThemeManager().addConfigurationCallback(this);
            this.d.setReloadListener(new GVSplashView.OnReloadListener() { // from class: com.alibaba.griver.ui.splash.GriverSplashView.4
                @Override // com.alibaba.griver.api.ui.GVSplashView.OnReloadListener
                public void onReload() {
                    GriverSplashView.this.e = SplashView.Status.WAITING;
                    GriverSplashView.this.reload();
                }
            });
            String str = "full_link" + this.f.getAppId() + this.f.getStartToken();
            GriverFullLinkStageMonitor stageMonitor = GriverStageMonitorManager.getInstance().getStageMonitor(str);
            if (stageMonitor == null) {
                stageMonitor = new GriverFullLinkStageMonitor();
                GriverStageMonitorManager.getInstance().registerStageMonitor(str, stageMonitor);
            }
            if (this.f.isTinyApp()) {
                if (this.d instanceof SplashFragment) {
                    stageMonitor.addParam("splashLoadingStyle", 1);
                    return;
                } else {
                    stageMonitor.addParam("splashLoadingStyle", 2);
                    return;
                }
            }
            stageMonitor.addParam("splashLoadingStyle", -1);
        }
    }
}
