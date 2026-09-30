package com.alibaba.ariver.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.BaseAppContext$;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.AppUIContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.FontBar;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.fragment.IFragmentManager;
import com.alibaba.ariver.app.api.ui.fragment.RVFragment;
import com.alibaba.ariver.app.api.ui.loading.SplashUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.api.ui.navigation.NavigationBarPolicy;
import com.alibaba.ariver.app.api.ui.tabbar.TabBar;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.app.ipc.IpcClientUtils;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.content.ResourceUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Stack;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BaseAppContext implements AppUIContext {
    private static final String TAG = "AriverInt:BaseAppContext";
    private boolean hasShowTab;
    private boolean isDestroyed = false;
    private FragmentActivity mActivity;
    public App mApp;
    private int mFragmentContainerId;
    protected IFragmentManager mFragmentManager;
    private TabBar mTabBar;
    private int mTabContainerId;
    private ViewSpecProvider mViewSpecProvider;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 478308939;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, short s) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i2 * 4;
        int i6 = (i3 * 4) + 105;
        int i7 = 3 - (s * 4);
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            i6 = i8;
            int i9 = i7;
            int i10 = 0;
            i6 += -i7;
            i7 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            int i11 = i7 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i9 = i11;
            i7 = bArr[i11];
            i6 += -i7;
            i7 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i6;
            int i112 = i7 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            int i1122 = i7 + 1;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    protected abstract IFragmentManager createFragmentManager(int i2);

    public FontBar getFontBar() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 125;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    protected abstract ViewGroup getTabBarContainer(int i2);

    public void hideBottomAuthTips() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean moveToBackground() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
        return false;
    }

    public void showBottomAuthTips(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ int access$000(BaseAppContext baseAppContext) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = baseAppContext.mTabContainerId;
        int i7 = i4 + 49;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    static /* synthetic */ TabBar access$100(BaseAppContext baseAppContext) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TabBar tabBar = baseAppContext.mTabBar;
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        return tabBar;
    }

    static /* synthetic */ void access$300(BaseAppContext baseAppContext, Page page, TabBarModel tabBarModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        baseAppContext.showTabBar(page, tabBarModel);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseAppContext(App app, FragmentActivity fragmentActivity, int i2, int i3) throws Throwable {
        boolean z;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_constructor);
        this.mFragmentContainerId = i2;
        this.mTabContainerId = i3;
        this.mApp = app;
        this.mActivity = fragmentActivity;
        this.mFragmentManager = createFragmentManager(i2);
        this.mViewSpecProvider = new DefaultViewSpecProvider(fragmentActivity);
        if (app != null) {
            if (app.getStartParams() != null) {
                int i4 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (!app.getStartParams().getBoolean("halfScreen", false)) {
                    z = false;
                } else {
                    int i6 = onNavigationEvent + 3;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    z = true;
                }
                app.putBooleanValue("navigation_bar_operator_reused", NavigationBarPolicy.navigationBarOperatorReusedForAppId(app.getAppId(), z));
                app.putBooleanValue("app_adjusted_4_reused_operator", NavigationBarPolicy.appIdAdjusted4ReusedOperator(app.getAppId()));
                int i9 = 2 % 2;
            }
        }
        Bundle bundle = new Bundle();
        Object[] objArr = new Object[1];
        d(5 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 4, new char[]{14, 65511, 2, 65535, 14}, false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 196, objArr);
        bundle.putString(((String) objArr[0]).intern(), app.getAppId());
        bundle.putString("activityClz", fragmentActivity.getClass().getName());
        bundle.putBundle("startParams", app.getStartParams());
        IpcClientUtils.sendMsgToServerByApp(app, 1, bundle);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_constructor);
        int i10 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 80 / 0;
        }
    }

    public IFragmentManager getFragmentManager() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        IFragmentManager iFragmentManager = this.mFragmentManager;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iFragmentManager;
    }

    public FragmentActivity getActivity() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        FragmentActivity fragmentActivity = this.mActivity;
        int i6 = i4 + 9;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return fragmentActivity;
        }
        throw null;
    }

    public App getApp() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        App app = this.mApp;
        int i6 = i3 + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return app;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $10 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35125), TextUtils.lastIndexOf("", '0') + 24, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 12843), 55 - KeyEvent.getDeadChar(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i10 = $11 + 33;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i12 = $10 + 15;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 << simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >>> 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 55 - (ViewConfiguration.getTapTimeout() >> 16), (-16775049) - Color.rgb(0, 0, 0), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showTabBar(final Page page, final TabBarModel tabBarModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
            if (!this.mActivity.isFinishing()) {
                if (!this.hasShowTab) {
                    this.hasShowTab = true;
                    ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.BaseAppContext.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BaseAppContext baseAppContext = BaseAppContext.this;
                            ViewGroup tabBarContainer = baseAppContext.getTabBarContainer(BaseAppContext.access$000(baseAppContext));
                            if (tabBarContainer == null) {
                                RVLogger.d(BaseAppContext.TAG, "showTabBar" + page + " == null");
                                return;
                            }
                            tabBarContainer.setVisibility(0);
                            BaseAppContext.access$100(BaseAppContext.this).init(tabBarModel);
                            if (BaseAppContext.access$100(BaseAppContext.this).isTabPage(page)) {
                                page.getStartParams().putString("fragmentType", "subtab");
                                BaseAppContext.access$100(BaseAppContext.this).create(page);
                                BaseAppContext.access$100(BaseAppContext.this).show(page, (Animation) null);
                            } else {
                                BaseAppContext.access$100(BaseAppContext.this).hide((Animation) null);
                                RVLogger.d(BaseAppContext.TAG, "init with " + page + " not tabPage!");
                            }
                        }
                    });
                    int i5 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 67 / 0;
                        return;
                    }
                    return;
                }
            }
        } else if (!this.mActivity.isFinishing()) {
        }
        int i7 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public Context getContext() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        FragmentActivity fragmentActivity = this.mActivity;
        int i6 = i4 + 63;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return fragmentActivity;
    }

    public Intent getActivityStartIntent() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intent intent = this.mActivity.getIntent();
        int i5 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    public ViewSpecProvider getViewSpecProvider() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        ViewSpecProvider viewSpecProvider = this.mViewSpecProvider;
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return viewSpecProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (com.alibaba.ariver.kernel.common.utils.ExecutorUtils.isMainThread() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void start(Page page) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_start);
                int i4 = 63 / 0;
                if (ExecutorUtils.isMainThread()) {
                    RVLogger.d(TAG, "startPage with page: " + page);
                    Bundle bundle = new Bundle();
                    bundle.putLong("nodeId", getApp().getNodeId());
                    IpcClientUtils.sendMsgToServerByApp(getApp(), 3, bundle);
                    initTabInfo(page);
                    RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_pushPage);
                    pushPage(page);
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_pushPage);
                    ExecutorUtils.postMain(new Runnable() { // from class: com.alibaba.ariver.app.BaseAppContext.2
                        @Override // java.lang.Runnable
                        public void run() {
                            App app = BaseAppContext.this.mApp;
                            if (app == null || app.isExited() || BaseAppContext.this.mApp.isDestroyed()) {
                                RVLogger.d(BaseAppContext.TAG, "when splashView exit,mapp has destroy");
                                return;
                            }
                            boolean zUseSuperSplash = SplashUtils.useSuperSplash(BaseAppContext.this.mApp.getStartParams());
                            SplashView splashView = BaseAppContext.this.mApp.getAppContext() == null ? null : BaseAppContext.this.mApp.getAppContext().getSplashView();
                            StringBuilder sb = new StringBuilder();
                            sb.append("splashView exit. delaySplashHide= ");
                            sb.append(zUseSuperSplash);
                            sb.append(", splashView_is_null=");
                            sb.append(splashView == null);
                            RVLogger.d(BaseAppContext.TAG, sb.toString());
                            if (zUseSuperSplash || splashView == null) {
                                return;
                            }
                            splashView.exit((SplashView.ExitListener) null);
                        }
                    });
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_start);
                    int i5 = onNavigationEvent + 83;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                throw new IllegalStateException("pushPage can only invoked in main thread!");
            }
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_AppContext_start);
        } catch (Throwable th) {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_AppContext_start);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initTabInfo(Page page) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
            if (!TextUtils.equals(RVParams.DEFAULT_LONG_PRESSO_LOGIN, BundleUtils.getString(this.mApp.getStartParams(), RVParams.ENABLE_TABBAR))) {
                int i5 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    ResourceUtils.enableTabBarByAppId(this.mApp.getAppId());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!ResourceUtils.enableTabBarByAppId(this.mApp.getAppId())) {
                    int i6 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            }
        } else if (!TextUtils.equals(RVParams.DEFAULT_LONG_PRESSO_LOGIN, BundleUtils.getString(this.mApp.getStartParams(), RVParams.ENABLE_TABBAR))) {
        }
        createTabBar(page);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r7 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r6.mTabBar = ((com.alibaba.ariver.app.api.ui.RVViewFactory) com.alibaba.ariver.kernel.common.RVProxy.get(com.alibaba.ariver.app.api.ui.RVViewFactory.class)).createTabBar(r6.mActivity, r6.mApp, r6.mFragmentManager, r1);
        com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(com.alibaba.ariver.app.api.point.view.TabBarInfoQueryPoint.class).node(r6.mApp).create().queryTabBarInfo(new com.alibaba.ariver.app.BaseAppContext.InitTabBarListener(r6, r7, (com.alibaba.ariver.app.BaseAppContext.AnonymousClass1) null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        com.alibaba.ariver.kernel.common.utils.RVLogger.d(com.alibaba.ariver.app.BaseAppContext.TAG, "createTabBar == null");
        r7 = com.alibaba.ariver.app.BaseAppContext.onNavigationEvent + 11;
        com.alibaba.ariver.app.BaseAppContext.onExtraCallbackWithResult = r7 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void createTabBar(Page page) {
        ViewGroup tabBarContainer;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            tabBarContainer = getTabBarContainer(this.mTabContainerId);
            int i4 = 53 / 0;
        } else {
            tabBarContainer = getTabBarContainer(this.mTabContainerId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean pushPage(Page page) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (!ExecutorUtils.isMainThread()) {
            throw new IllegalStateException("pushPage can only invoked in main thread!");
        }
        RVLogger.d(TAG, "pushPage with page: " + page + " with stack: " + Log.getStackTraceString(new Throwable("Just Print")));
        if (this.mFragmentManager != null) {
            int i5 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                page.isExited();
                throw null;
            }
            if (!page.isExited()) {
                RVFragment readyFragment = this.mFragmentManager.getReadyFragment();
                if (!readyFragment.isAdded()) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("ariverAppInstanceId", this.mApp.getNodeId());
                    bundle.putLong("ariverPageInstanceId", page.getNodeId());
                    readyFragment.setArguments(bundle);
                } else if (readyFragment.getPage() != null) {
                    RVLogger.d(TAG, "isPagePreRender:" + readyFragment.getPage().getBooleanValue("isPrerender"));
                } else {
                    readyFragment.setPage(page);
                }
                Bundle startParams = page.getStartParams();
                Object[] objArr = new Object[1];
                d(Color.red(0) + 8, 1 - (Process.myPid() >> 22), new char[]{65531, 65532, '\b', 5, 3, 65514, 15, 6}, false, 204 - Color.alpha(0), objArr);
                boolean zEquals = "pushWindow".equals(BundleUtils.getString(startParams, ((String) objArr[0]).intern(), ""));
                boolean z = BundleUtils.getBoolean(startParams, "fromRelaunch", false);
                boolean z2 = BundleUtils.getBoolean(startParams, RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, true);
                RVLogger.d(TAG, "pushPage useTranslateAnim : " + z2 + " fromRelaunch: " + z + " fromPushWindow: " + zEquals);
                if (!z) {
                    int i6 = onExtraCallbackWithResult + 65;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    if (i6 % 2 == 0) {
                        int i8 = 43 / 0;
                        if (!(!z2)) {
                            if (!zEquals) {
                                this.mFragmentManager.pushPage(page, readyFragment, false);
                            } else {
                                int i9 = i7 + 57;
                                onExtraCallbackWithResult = i9 % 128;
                                int i10 = i9 % 2;
                                if (!((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableEnter) {
                                    int i11 = onNavigationEvent + 87;
                                    onExtraCallbackWithResult = i11 % 128;
                                    int i12 = i11 % 2;
                                    this.mFragmentManager.pushPage(page, readyFragment, true);
                                }
                            }
                        }
                    } else if (!(!z2)) {
                    }
                }
                TabBar tabBar = this.mTabBar;
                if (tabBar != null && !tabBar.isCreated() && this.mTabBar.isTabPage(page)) {
                    this.mTabBar.create(page);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("nodeId", page.getNodeId());
                IpcClientUtils.sendMsgToServerByApp(getApp(), 4, bundle2);
                return true;
            }
        }
        RVLogger.w(TAG, "pushPage but is exited!");
        return false;
    }

    public void exitPage(Page page, boolean z) {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "exitPage " + page);
        IFragmentManager iFragmentManager = this.mFragmentManager;
        if (iFragmentManager == null) {
            RVLogger.d(TAG, "exitPage but already exited");
            return;
        }
        if (iFragmentManager.findFragmentForPage(page) == null) {
            RVLogger.d(TAG, "exitPage but fragment already exited!");
            int i3 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i5 % 128;
            boolean z2 = false;
            if (i5 % 2 != 0 ? BundleUtils.getBoolean(page.getStartParams(), RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, true) : BundleUtils.getBoolean(page.getStartParams(), RVParams.LONG_PUSHWINDOW_WITH_TRANS_ANIM, false)) {
                if (!this.mApp.isExited() && !((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableExit) {
                    z2 = true;
                }
            }
            this.mFragmentManager.exitPage(page, z2, z);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("nodeId", page.getNodeId());
        IpcClientUtils.sendMsgToServerByApp(getApp(), 5, bundle);
    }

    public void destroy() {
        synchronized (this) {
            if (this.isDestroyed) {
                return;
            }
            this.isDestroyed = true;
            onDestroy();
        }
    }

    private boolean onlyOneActivityInTask(Activity activity) {
        int i2 = 2 % 2;
        ActivityManager activityManager = (ActivityManager) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext().getSystemService("activity");
        if (activityManager == null) {
            int i3 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i5 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ActivityManager.RunningTaskInfo next = it.next();
            if (BaseAppContext$.ExternalSyntheticApiModelOutline0.m(next) != null && TextUtils.equals(activity.getClass().getName(), BaseAppContext$.ExternalSyntheticApiModelOutline0.m(next).getClassName())) {
                RVLogger.d(TAG, "canRemoveTask found RunningTaskInfo: " + next);
                if (BaseAppContext$.ExternalSyntheticApiModelOutline1.m(next) > 1) {
                    RVLogger.d(TAG, "canRemoveTask remove task because have another activity!");
                    int i7 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
            }
        }
        return true;
    }

    private boolean onlyOneAppInTask() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Stack appStack = ((AppManager) RVProxy.get(AppManager.class)).getAppStack();
        if (appStack == null || appStack.size() == 0) {
            RVLogger.d(TAG, "onlyOneAppInTask return true because stack empty!");
            return true;
        }
        if (appStack.size() == 1) {
            int i5 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                appStack.peek();
                throw null;
            }
            Object objPeek = appStack.peek();
            App app = this.mApp;
            if (objPeek == app) {
                int i6 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (app.getBooleanValue("KEY_RESTARTING_APP")) {
                    RVLogger.d(TAG, "onlyOneAppInTask return false because app is restarting: " + this.mApp);
                    return false;
                }
                RVLogger.d(TAG, "onlyOneAppInTask return true because stack contain self: " + this.mApp);
                return true;
            }
        }
        return false;
    }

    public void onDestroy() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            try {
                RVLogger.w(TAG, "mActivity finish by BaseAppContext.onDestroy()");
                if (this.mActivity.isTaskRoot()) {
                    int i4 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        onlyOneActivityInTask(this.mActivity);
                        obj.hashCode();
                        throw null;
                    }
                    if (onlyOneActivityInTask(this.mActivity) && onlyOneAppInTask()) {
                        RVLogger.w(TAG, "mActivity finishAndRemoveTask by Activity API");
                        this.mActivity.finishAndRemoveTask();
                    } else {
                        RVLogger.w(TAG, "mActivity finish by Activity API");
                        this.mActivity.finish();
                    }
                } else {
                    this.mActivity.finish();
                    int i5 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                this.mActivity = null;
            } catch (Throwable th) {
                this.mActivity.finish();
                this.mActivity = null;
                RVLogger.e(TAG, "onDestroy error" + th.getMessage());
            }
        }
        IFragmentManager iFragmentManager = this.mFragmentManager;
        if (iFragmentManager != null) {
            iFragmentManager.release();
            this.mFragmentManager = null;
            int i7 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        Bundle bundle = new Bundle();
        Object[] objArr = new Object[1];
        d(TextUtils.indexOf("", "") + 5, 3 - KeyEvent.normalizeMetaState(0), new char[]{14, 65511, 2, 65535, 14}, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 196, objArr);
        bundle.putString(((String) objArr[0]).intern(), getApp().getAppId());
        bundle.putLong("nodeId", getApp().getNodeId());
        long startToken = this.mApp.getStartToken();
        sendMsgWhenDestroy(bundle);
        ClientMsgReceiver.getInstance().unRegisterAppHandler(startToken);
    }

    private void sendMsgWhenDestroy(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IpcClientUtils.sendMsgToServerByApp(getApp(), 2, bundle);
        this.mApp = null;
        int i5 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
    }

    public TabBar getTabBar() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TabBar tabBar = this.mTabBar;
        int i5 = i4 + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return tabBar;
    }

    public boolean isTaskRoot() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity fragmentActivity = this.mActivity;
        if (i4 == 0) {
            return fragmentActivity.isTaskRoot();
        }
        fragmentActivity.isTaskRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
