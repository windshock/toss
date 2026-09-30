package com.alibaba.ariver.app.activity;

import android.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.AppNode;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.AppUIContext;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.activity.ActivityAnimBean;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.app.api.performance.RuntimeEnvironment;
import com.alibaba.ariver.app.api.performance.RuntimeEnvironmentType;
import com.alibaba.ariver.app.api.performance.runtime.GradeStrategy;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.app.api.point.activity.ActivityHelperOnCreateFinishedPoint;
import com.alibaba.ariver.app.api.point.activity.ActivityOnNewIntentPoint;
import com.alibaba.ariver.app.api.point.activity.ActivityOnPausePoint;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.app.api.point.app.BackKeyDownPoint;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.ipc.ClientMsgReceiver;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessage;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ActivityHelper {
    private static short[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static final String LOG_TAG = "AriverApp:ActivityHelper";
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static AtomicBoolean sConfigFetched;
    private static AtomicBoolean sLandscapeFixed;
    private Method isLowPerformanceDeviceMethod;
    private FragmentActivity mActivity;
    private ActivityAnimBean mActivityAnimBean;
    private boolean mAlreadyDoDestroyed = false;
    protected AppNode mApp;
    protected AppUIContext mAppContext;
    private boolean mCloseAllAnim;
    private boolean mOnCreateWithIllegalState;
    private StartClientBundle mStartClientBundle;
    private long mStartToken;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, short s, byte b) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 115 - (b * 3);
        int i5 = (i2 * 4) + 4;
        int i6 = s * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = i5 + (-i7);
            int i11 = i9 + 1;
            i3 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i12 = i4;
            i9 = i5;
            i5 = i12;
            int i102 = i5 + (-i7);
            int i112 = i9 + 1;
            i3 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    protected abstract AppContext createAppContext(App app, FragmentActivity fragmentActivity);

    public boolean handleStartClientBundleNull() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 61;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    static /* synthetic */ boolean access$000(ActivityHelper activityHelper) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        boolean z = activityHelper.mAlreadyDoDestroyed;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 23;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ FragmentActivity access$100(ActivityHelper activityHelper) {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity fragmentActivity = activityHelper.mActivity;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        return fragmentActivity;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onExtraCallback();
        sConfigFetched = new AtomicBoolean(false);
        sLandscapeFixed = new AtomicBoolean(false);
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityHelper(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    /* renamed from: com.alibaba.ariver.app.activity.ActivityHelper$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction;

        static {
            int[] iArr = new int[StartAction.values().length];
            $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction = iArr;
            try {
                iArr[StartAction.SHOW_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction[StartAction.SHOW_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$app$api$activity$StartAction[StartAction.DIRECT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void onCreate() throws Throwable {
        int i2 = 2 % 2;
        if (this.mStartClientBundle == null) {
            RVLogger.w(LOG_TAG, "onCreate but mStartClientBundle == null! do nothing!");
            int i3 = asInterface + 55;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ActivityHelper_onCreate);
        AppNode appNodeFindAppByToken = ((AppManager) RVProxy.get(AppManager.class)).findAppByToken(this.mStartToken);
        if (appNodeFindAppByToken instanceof AppNode) {
            this.mApp = appNodeFindAppByToken;
        }
        AppNode appNode = this.mApp;
        if (appNode == null || !appNode.isInited()) {
            if (this.mStartClientBundle.sceneParams == null) {
                RVLogger.d(LOG_TAG, "onCreate but sceneParams == null");
                int i5 = onTransact + 71;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 2;
                }
            }
            Bundle bundle = this.mStartClientBundle.sceneParams;
            if (bundle != null && !bundle.containsKey("startToken")) {
                RVLogger.d(LOG_TAG, "onCreate but startToken == null");
            }
            AppManager appManager = (AppManager) RVProxy.get(AppManager.class);
            StartClientBundle startClientBundle = this.mStartClientBundle;
            AppNode appNodeStartApp = appManager.startApp(startClientBundle.appId, startClientBundle.startParams, startClientBundle.sceneParams);
            AppNode appNode2 = appNodeStartApp instanceof AppNode ? appNodeStartApp : null;
            this.mApp = appNode2;
            if (appNode2 == null) {
                return;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreate find quickStarted app! ");
            sb.append(this.mApp);
            sb.append(" appId from Param: ");
            Bundle startParams = this.mApp.getStartParams();
            Object[] objArr = new Object[1];
            a((short) ((-42) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((-36) - TextUtils.indexOf((CharSequence) "", '0')), (KeyEvent.getMaxKeyCode() >> 16) - 561115322, (-963015916) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (Process.myPid() >> 22) - 107, objArr);
            sb.append(BundleUtils.getString(startParams, ((String) objArr[0]).intern()));
            RVLogger.d(LOG_TAG, sb.toString());
        }
        this.mAppContext = createAppContext(this.mApp, this.mActivity);
        ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).init("RV_APP_STARTUP", this.mApp.getAppId(), Long.valueOf(this.mStartToken), this.mApp.getStartUrl());
        this.mApp.bindContext(this.mAppContext);
        EntryInfo entryInfo = (EntryInfo) BundleUtils.getParcelable(this.mApp.getSceneParams(), "entryInfo");
        AppUIContext appUIContext = this.mAppContext;
        SplashView splashView = appUIContext != null ? appUIContext.getSplashView() : null;
        int i7 = AnonymousClass2.$SwitchMap$com$alibaba$ariver$app$api$activity$StartAction[this.mStartClientBundle.startAction.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                int i8 = onTransact + 113;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                if (i7 == 3) {
                    if (SplashUtils.useSuperSplash(this.mStartClientBundle.startParams)) {
                        int i10 = onTransact + 5;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                        RVLogger.d(LOG_TAG, " showLoading by superSplash!");
                        if (splashView != null) {
                            splashView.showLoading(entryInfo);
                        }
                    }
                    this.mApp.start();
                }
            } else {
                String string = BundleUtils.getString(this.mApp.getSceneParams(), "prepareExceptionCode");
                String string2 = BundleUtils.getString(this.mApp.getSceneParams(), "prepareExceptionMessage");
                if (splashView != null) {
                    splashView.showError(string, string2, (Map) null);
                }
            }
        } else if (splashView != null) {
            splashView.showLoading(entryInfo);
        }
        if (ProcessUtils.isMainProcess()) {
            IpcChannelManager.getInstance().registerClientChannel(getApp().getStartToken(), new IIpcChannel.Stub() { // from class: com.alibaba.ariver.app.activity.ActivityHelper.1
                public void sendMessage(final IpcMessage ipcMessage) throws RemoteException {
                    ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.activity.ActivityHelper.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ClientMsgReceiver.getInstance().handleMessage(ipcMessage);
                        }
                    });
                }

                public boolean isFinishing() throws RemoteException {
                    AppNode appNode3;
                    return ActivityHelper.access$000(ActivityHelper.this) || (appNode3 = ActivityHelper.this.mApp) == null || appNode3.isExited() || ActivityHelper.access$100(ActivityHelper.this).isFinishing();
                }
            });
        }
        ExtensionPoint.as(ActivityHelperOnCreateFinishedPoint.class).node(this.mApp).create().onActivityHelperOnCreateFinished(this.mApp, this.mActivity, this.mStartClientBundle);
        RVTraceUtils.traceEndSection(RVTraceKey.RV_ActivityHelper_onCreate);
        int i12 = asInterface + 31;
        onTransact = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 42 / 0;
        }
    }

    public void setupParams(Intent intent) {
        int i2 = 2 % 2;
        int i3 = asInterface + 27;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_ActivityHelper_setupParams);
            obj.hashCode();
            throw null;
        }
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_ActivityHelper_setupParams);
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    int i4 = asInterface + 15;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    intent.getExtras().setClassLoader(ActivityHelper.class.getClassLoader());
                    this.mStartClientBundle = BundleUtils.getParcelable(intent.getExtras(), "ariverStartBundle");
                    this.mOnCreateWithIllegalState = (intent.getFlags() & 1048576) != 0;
                    RVLogger.d(LOG_TAG, "onCreate " + this.mActivity.getClass().getName() + " with " + this.mStartClientBundle);
                    StartClientBundle startClientBundle = this.mStartClientBundle;
                    if (startClientBundle == null) {
                        int i6 = onTransact + 93;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        if (!handleStartClientBundleNull()) {
                            throw new IllegalStateException("onCreate start bundle null!!");
                        }
                        RVLogger.d(LOG_TAG, "onCreate mStartClientBundle == null, handle by handleStartClientBundleNull!");
                        return;
                    }
                    if ("yes".equals(BundleUtils.getString(startClientBundle.startParams, "CompletePreload", ""))) {
                        int i8 = onTransact + 75;
                        asInterface = i8 % 128;
                        if (i8 % 2 == 0) {
                            RVLogger.d(LOG_TAG, "setupParams is CompletePreload return, not do StatusBarUtils");
                            return;
                        } else {
                            RVLogger.d(LOG_TAG, "setupParams is CompletePreload return, not do StatusBarUtils");
                            throw null;
                        }
                    }
                    if (StatusBarUtils.isSupport()) {
                        int i9 = asInterface + 115;
                        onTransact = i9 % 128;
                        int i10 = i9 % 2;
                        if (!(!StatusBarUtils.isConfigSupport())) {
                            StatusBarUtils.setTransparentColor(this.mActivity, 855638016);
                        }
                    }
                    handleStartParams();
                    this.mStartToken = this.mStartClientBundle.startToken;
                    return;
                }
            } finally {
                RVTraceUtils.traceEndSection(RVTraceKey.RV_ActivityHelper_setupParams);
            }
        }
        throw new IllegalStateException("onCreate intent null!!");
    }

    public StartClientBundle getStartClientBundle() {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        StartClientBundle startClientBundle = this.mStartClientBundle;
        int i6 = i3 + 1;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return startClientBundle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        int i5;
        boolean z2;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), Process.getGidForName("") + 43, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                z = i7 % 2 != 0;
            }
            if (z) {
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char pressedStateDuration = (char) (12843 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 55;
                            int i9 = 2166 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, offsetAfter, i9, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        j = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i10 = $11 + 73;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, 22439 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i2 + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i12 = $11 + 71;
                int i13 = i12 % 128;
                $10 = i13;
                int i14 = i12 % 2;
                int i15 = ((i2 + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                if (z) {
                    int i16 = i13 + 41;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i15 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 86 - View.resolveSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallbackWithResult;
                if (bArr5 != null) {
                    int i18 = $11 + 71;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i19 = 0; i19 < length; i19++) {
                        int i20 = $11 + 55;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        bArr[i19] = (byte) (bArr5[i19] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i22 = $11 + 7;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i24 = $10 + 29;
                    $11 = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void handleStartParams() {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        onTransact = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                RVLogger.d(LOG_TAG, "NebulaActivity.onCreate handleStartParams start");
                this.mActivity.requestWindowFeature(0);
            } else {
                RVLogger.d(LOG_TAG, "NebulaActivity.onCreate handleStartParams start");
                this.mActivity.requestWindowFeature(1);
            }
        } catch (Throwable th) {
            RVLogger.w(LOG_TAG, "requestWindowFeature error: ", th);
        }
        String string = BundleUtils.getString(this.mStartClientBundle.startParams, "snapshot");
        if ("NO".equalsIgnoreCase(string)) {
            RVLogger.d(LOG_TAG, "not allowed to task snapshot " + string);
            this.mActivity.getWindow().addFlags(8192);
            int i4 = asInterface + 87;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        if (BundleUtils.getBoolean(this.mStartClientBundle.startParams, "fullscreen", false)) {
            int i6 = onTransact + 17;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                this.mActivity.getWindow().setFlags(24441, 4613);
            } else {
                this.mActivity.getWindow().setFlags(1024, 1024);
            }
        }
        String string2 = BundleUtils.getString(this.mStartClientBundle.startParams, RVParams.LONG_LANDSCAPE);
        if (string2.equals(RVParams.LONG_LANDSCAPE)) {
            RVLogger.d(LOG_TAG, "handleStartParams(): mStartClientBundle.startParams[\"landscape\"] = landscape");
            setCutoutModeShortEdges(this.mActivity.getWindow());
            if (this.mActivity.getRequestedOrientation() != 0) {
                this.mActivity.setRequestedOrientation(0);
            }
        } else if (string2.equals(TtmlNode.TEXT_EMPHASIS_AUTO)) {
            int i7 = asInterface + 81;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (this.mActivity.getRequestedOrientation() != -1) {
                int i9 = asInterface + 37;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    this.mActivity.setRequestedOrientation(-1);
                    int i10 = 31 / 0;
                } else {
                    this.mActivity.setRequestedOrientation(-1);
                }
            }
        }
        boolean z = BundleUtils.getBoolean(this.mStartClientBundle.startParams, "isRestart", false);
        this.mCloseAllAnim = BundleUtils.getBoolean(this.mStartClientBundle.startParams, "closeAllActivityAnimation", false);
        this.mActivityAnimBean = (ActivityAnimBean) BundleUtils.getParcelable(this.mStartClientBundle.sceneParams, "ariverActivityAnimBean");
        RVLogger.d(LOG_TAG, "onCreate with animBean: " + this.mActivityAnimBean);
        if (z) {
            RVLogger.d(LOG_TAG, "onCreate disable animBean fromRestart.");
            ActivityAnimBean activityAnimBean = this.mActivityAnimBean;
            if (activityAnimBean != null) {
                activityAnimBean.enter = 0;
            } else {
                overridePendingTransitionOpt(0, 0);
            }
        }
        if (this.mCloseAllAnim || !(!this.mOnCreateWithIllegalState)) {
            overridePendingTransitionOpt(0, 0);
        } else {
            ActivityAnimBean activityAnimBean2 = this.mActivityAnimBean;
            if (activityAnimBean2 != null) {
                int i11 = onTransact + 21;
                asInterface = i11 % 128;
                if (i11 % 2 != 0) {
                    overridePendingTransitionOpt(activityAnimBean2.enter, activityAnimBean2.exit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                overridePendingTransitionOpt(activityAnimBean2.enter, activityAnimBean2.exit);
            }
        }
        RVLogger.d(LOG_TAG, "onCreate handleStartParams done.");
        int i12 = asInterface + 103;
        onTransact = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 72 / 0;
        }
    }

    public void onNewIntent(Intent intent) {
        int i2 = 2 % 2;
        RVLogger.d(LOG_TAG, "onNewIntent with intent: " + intent);
        if (this.mApp != null) {
            int i3 = onTransact + 17;
            asInterface = i3 % 128;
            if (i3 % 2 == 0 ? !(!intent.getBooleanExtra("needStartAnim", true)) : intent.getBooleanExtra("needStartAnim", false)) {
                ActivityAnimBean activityAnimBean = this.mActivityAnimBean;
                if (activityAnimBean != null && activityAnimBean.needRestartAnim) {
                    int i4 = onTransact + 113;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    overridePendingTransitionOpt(activityAnimBean.enterFast, activityAnimBean.exitFast);
                    int i6 = asInterface + 1;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            ((ActivityOnNewIntentPoint) ExtensionPoint.as(ActivityOnNewIntentPoint.class).node(this.mApp).create()).onNewIntent(this.mApp, this.mActivity, intent);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i8 = onTransact + 9;
                asInterface = i8 % 128;
                if (i8 % 2 == 0 ? !intent.getBooleanExtra("IS_LITE_MOVE_TASK", false) : !intent.getBooleanExtra("IS_LITE_MOVE_TASK", false)) {
                    Bundle bundle = (Bundle) BundleUtils.getParcelable(extras, "startParams");
                    Bundle bundle2 = (Bundle) BundleUtils.getParcelable(extras, "sceneParams");
                    if (bundle != null) {
                        this.mApp.restart(bundle, bundle2);
                    }
                }
            }
        }
        int i9 = onTransact + 45;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
    }

    public void onResume() {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            RVLogger.d(LOG_TAG, "onResume");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RVLogger.d(LOG_TAG, "onResume");
        AppNode appNode = this.mApp;
        if (appNode != null) {
            int i4 = asInterface + 79;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                appNode.resume();
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mApp, "nbx_activityResume");
            } else {
                appNode.resume();
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.mApp, "nbx_activityResume");
                int i5 = 47 / 0;
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = onTransact + 25;
        int i6 = i5 % 128;
        asInterface = i6;
        if (i5 % 2 == 0) {
            Page activePage = this.mApp;
            if (activePage != null) {
                if (activePage.getActivePage() != null) {
                    activePage = this.mApp.getActivePage();
                }
                ((ActivityResultPoint) ExtensionPoint.as(ActivityResultPoint.class).node(activePage).create()).onActivityResult(i2, i3, intent);
                return;
            } else {
                int i7 = i6 + 117;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                RVLogger.d(LOG_TAG, "onActivityResult but mApp == null!");
                return;
            }
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onRequestPermissionResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 2 % 2;
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        AppNode appNode = this.mApp;
        if (appNode != null && !appNode.isDestroyed()) {
            int childCount = this.mApp.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                Page pageByIndex = this.mApp.getPageByIndex(i6);
                if (pageByIndex.getPageContext() != null) {
                    int i7 = onTransact + 49;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        pageByIndex.getPageContext().getEmbedViewManager().onRequestPermissionResult(i2, strArr, iArr);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    pageByIndex.getPageContext().getEmbedViewManager().onRequestPermissionResult(i2, strArr, iArr);
                }
            }
        }
        ((RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class)).onRequestPermissionResult(i2, strArr, iArr);
    }

    public void moveTaskToBack() {
        int i2 = 2 % 2;
        if (this.mCloseAllAnim) {
            int i3 = asInterface + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            overridePendingTransitionOpt(0, 0);
            return;
        }
        ActivityAnimBean activityAnimBean = this.mActivityAnimBean;
        if (activityAnimBean != null) {
            int i5 = asInterface + 9;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (activityAnimBean.needPopAnim) {
                overridePendingTransitionOpt(activityAnimBean.popEnter, activityAnimBean.popExit);
            }
        }
    }

    public void finishAndRemoveTask() {
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        doCommonDestroy();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void finish() {
        int i2 = 2 % 2;
        int i3 = asInterface + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        doCommonDestroy();
        if (i4 == 0) {
            throw null;
        }
    }

    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = asInterface + 25;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        doCommonDestroy();
        int i5 = onTransact + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onStop() {
        int i2 = 2 % 2;
        int i3 = onTransact + 9;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        RVLogger.d(LOG_TAG, "onStop");
        AppNode appNode = this.mApp;
        if (appNode != null) {
            int i5 = asInterface + 33;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            appNode.pause();
            int i7 = onTransact + 117;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public void onPause() {
        int i2 = 2 % 2;
        int i3 = onTransact + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        RVLogger.d(LOG_TAG, "onPause");
        Page activePage = this.mApp;
        if (activePage != null) {
            int i5 = asInterface + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (activePage.getActivePage() != null) {
                activePage = this.mApp.getActivePage();
            }
        }
        ((ActivityOnPausePoint) ExtensionPoint.as(ActivityOnPausePoint.class).node(activePage).create()).onPause();
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i2 = 2 % 2;
        RVLogger.d(LOG_TAG, "onConfigurationChanged: " + configuration);
        AppNode appNode = this.mApp;
        if (appNode != null) {
            int i3 = asInterface + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            appNode.onConfigurationChanged(configuration);
            int i5 = asInterface + 11;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void onUserInteraction() {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.onUserInteraction();
        }
        int i4 = asInterface + 15;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onUserLeaveHint() {
        int i2 = 2 % 2;
        int i3 = asInterface + 7;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        AppNode appNode = this.mApp;
        if (appNode != null) {
            appNode.onUserLeaveHint();
            int i5 = asInterface + 23;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        int i3 = 2 % 2;
        RVLogger.d(LOG_TAG, "onKeyDown " + i2);
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        if (this.mApp != null) {
            Boolean boolIntercept = ExtensionPoint.as(BackKeyDownPoint.class).node(this.mApp).defaultValue(Boolean.FALSE).resolve(ResultResolver.POSITIVE_RESOLVER).create().intercept(this.mApp);
            if (boolIntercept == null || !boolIntercept.booleanValue()) {
                return this.mApp.backPressed();
            }
            int i4 = asInterface + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            return false;
        }
        int i6 = onTransact + 67;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        fragmentActivity.finish();
        return true;
    }

    public void doCommonDestroy() {
        synchronized (this) {
            if (this.mAlreadyDoDestroyed) {
                return;
            }
            this.mAlreadyDoDestroyed = true;
            AppNode appNode = this.mApp;
            if (appNode == null) {
                RVLogger.w(LOG_TAG, "doCommonDestroy but mApp == null!");
                return;
            }
            if (BundleUtils.getBoolean(appNode.getSceneParams(), "closeActivityWithCustomAnimation", false)) {
                overridePendingTransitionOpt(0, R.anim.fade_out);
            } else if (this.mCloseAllAnim) {
                overridePendingTransitionOpt(0, 0);
            } else {
                ActivityAnimBean activityAnimBean = this.mActivityAnimBean;
                if (activityAnimBean != null && activityAnimBean.needPopAnim) {
                    overridePendingTransitionOpt(activityAnimBean.popEnter, activityAnimBean.popExit);
                }
            }
            IpcChannelManager.getInstance().unRegisterClientChannel(this.mStartToken);
            AppNode appNode2 = this.mApp;
            if (appNode2 != null && !appNode2.isDestroyed()) {
                int childCount = this.mApp.getChildCount();
                RVLogger.w(LOG_TAG, "doCommonDestroy force mApp.destroy with count: " + childCount);
                if (childCount == 0) {
                    this.mApp.exit();
                }
            } else {
                this.mAppContext.destroy();
            }
        }
    }

    public App getApp() {
        AppNode appNode;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 87;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            appNode = this.mApp;
            int i5 = 21 / 0;
        } else {
            appNode = this.mApp;
        }
        int i6 = i3 + 27;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return appNode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void overridePendingTransitionOpt(int i2, int i3) {
        boolean zBooleanValue;
        int i4 = 2 % 2;
        if (this.mActivity == null) {
            return;
        }
        try {
            if (this.isLowPerformanceDeviceMethod == null) {
                Method method = Class.forName("com.alipay.mobile.liteprocess.Util").getMethod("isLowPerformanceDevice", null);
                this.isLowPerformanceDeviceMethod = method;
                zBooleanValue = ((Boolean) method.invoke(null, null)).booleanValue();
                int i5 = asInterface + 91;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = onTransact + 9;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                zBooleanValue = false;
            }
            RVLogger.d(LOG_TAG, "isLowPerformanceDevice:" + zBooleanValue);
            if (zBooleanValue || RuntimeEnvironment.getInstance().getRuntimeEnvironmentState(GradeStrategy.DEVICE) == RuntimeEnvironmentType.LOW) {
                RVLogger.d(LOG_TAG, "isLowDevice");
                return;
            }
        } catch (Throwable th) {
            RVLogger.e(LOG_TAG, "overridePendingTransitionOpt", th);
            int i9 = asInterface + 29;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        }
        this.mActivity.overridePendingTransition(i2, i3);
    }

    private static void fetchConfigLazy() {
        int i2 = 2 % 2;
        int i3 = asInterface + 91;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            if (!sConfigFetched.get()) {
                sConfigFetched.set(true);
                RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class, true);
                if (rVConfigService == null) {
                    RVLogger.e(LOG_TAG, "fetchConfigLazy(): configService is null");
                    return;
                }
                sLandscapeFixed.set("yes".equalsIgnoreCase(rVConfigService.getConfig("h5_landscapeFixed", "no")));
                int i4 = asInterface + 71;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i5 = onTransact + 17;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        sConfigFetched.get();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        o.extraCallbackWithResult.onExtraCallbackWithResult(r1, 1);
        r4.setAttributes(r1);
        com.alibaba.ariver.kernel.common.utils.RVLogger.d(com.alibaba.ariver.app.activity.ActivityHelper.LOG_TAG, "setCutoutModeShortEdges(): window layout params cutout mode set to shortEdges");
        r4 = com.alibaba.ariver.app.activity.ActivityHelper.onTransact + 23;
        com.alibaba.ariver.app.activity.ActivityHelper.asInterface = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        com.alibaba.ariver.kernel.common.utils.RVLogger.e(com.alibaba.ariver.app.activity.ActivityHelper.LOG_TAG, "setCutoutModeShortEdges(): window layout params is null, cannot set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void setCutoutModeShortEdges(Window window) {
        WindowManager.LayoutParams attributes;
        int i2 = 2 % 2;
        RVLogger.d(LOG_TAG, "setCutoutModeShortEdges(): window = " + window);
        fetchConfigLazy();
        if (!sLandscapeFixed.get()) {
            RVLogger.d(LOG_TAG, "setCutoutModeShortEdges(): config not enabled, skip");
            return;
        }
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            RVLogger.d(LOG_TAG, "setCutoutModeShortEdges(): API level lower than 28, cannot set");
            return;
        }
        int i3 = asInterface + 89;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            attributes = window.getAttributes();
            int i4 = 32 / 0;
        } else {
            attributes = window.getAttributes();
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = -2060048206;
        onNavigationEvent = -1538795422;
        onExtraCallback = -1658737338;
        onExtraCallbackWithResult = new byte[]{-109, -25, 37, 14, -13};
    }
}
