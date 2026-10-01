package com.alibaba.ariver.app.api.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.AppUIContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.R;
import com.alibaba.ariver.app.api.activity.AnimUtils;
import com.alibaba.ariver.app.api.performance.runtime.utils.RuntimeUtils;
import com.alibaba.ariver.app.api.point.fragment.FragmentPausePoint;
import com.alibaba.ariver.app.api.point.fragment.FragmentResumePoint;
import com.alibaba.ariver.app.api.point.view.CollectPerformanceCallback;
import com.alibaba.ariver.app.api.point.view.CollectPerformancePoint;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.RVViewFactory;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.ViewUtils;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.loading.SplashUtils;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.app.api.ui.navigation.NavigationBar;
import com.alibaba.ariver.app.api.ui.navigation.NavigationBarPolicy;
import com.alibaba.ariver.app.api.ui.navigation.OnNavigationBarVisibilityChangeListener;
import com.alibaba.ariver.app.api.ui.navigation.Visibility;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.ipc.RemoteCallClient;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.track.EventTrackStore;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.log.NavigationBarLog;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RVFragment extends Fragment implements PageContext {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final String TAG = "AriverApp:RVFragment";
    public static final String TRANSLATE_IN_LEFT_ID = "ariver_fragment_translate_in_left";
    public static final String TRANSLATE_IN_RIGHT_ID = "ariver_fragment_translate_in_right";
    public static final String TRANSLATE_OUT_LEFT_ID = "ariver_fragment_translate_out_left";
    public static final String TRANSLATE_OUT_RIGHT_ID = "ariver_fragment_translate_out_right";
    private static int onExtraCallback = 1;
    private static long onWarmupCompleted = -3541508260303503646L;
    private IEmbedViewManager mEmbedViewManager;
    private ErrorView mErrorView;
    private LoadingView mLoadingView;
    private NavigationBar mNavigationBar;
    private View.OnLayoutChangeListener mNavigationBarOnLayoutChangeListener;
    private Page mPage;
    private PageContainer mPageContainer;
    private RelativeLayout mRootView;
    private TitleBar mTitleBar;
    private ViewSpecProvider mViewSpecProvider;
    protected Page mPendingSetPage = null;
    private final List<FragmentLifecycleListener> mListeners = new ArrayList();
    private boolean mIsFragmentStarted = false;
    private boolean mIsBetweenStartPause = false;
    private boolean mAlreadyScheduleAdded = false;
    private long mOnViewCreatedTime = 0;
    private boolean mTitleTransparent = false;
    private boolean mNavigationBarVisibilitySet = false;
    private boolean mClearDisappearingChildrenFix = true;
    private boolean mInExitPageWithAnimSchedule = false;
    private boolean mNavReusedOperatorResumeFixed = true;
    private boolean mShouldResumeWebView = false;

    public static class FragmentLifecycleListener {
        public void onAttach(Context context, @NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }

        public void onCreate(@Nullable Bundle bundle, @NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }

        public void onCreateView(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }

        public void onDestroy(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }

        public void onDestroyView(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }

        public void onDetach(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, @NonNull Fragment fragment) {
        }
    }

    private static void e(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 49;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Process.getGidForName("") + 25, 19627 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), Color.rgb(0, 0, 0) + 16777275, 6383 - (Process.myTid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $10 + 77;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static /* synthetic */ RelativeLayout access$000(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        RelativeLayout relativeLayout = rVFragment.mRootView;
        int i6 = i3 + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return relativeLayout;
        }
        throw null;
    }

    static /* synthetic */ boolean access$100(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = rVFragment.mClearDisappearingChildrenFix;
        if (i4 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ ViewSpecProvider access$1000(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        ViewSpecProvider viewSpecProvider = rVFragment.mViewSpecProvider;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 15;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return viewSpecProvider;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$1100(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = rVFragment.mShouldResumeWebView;
        int i6 = i3 + 67;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$1102(RVFragment rVFragment, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        rVFragment.mShouldResumeWebView = z;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 79;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ boolean access$200(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        boolean z = rVFragment.mInExitPageWithAnimSchedule;
        int i6 = i4 + 93;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ boolean access$202(RVFragment rVFragment, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        rVFragment.mInExitPageWithAnimSchedule = z;
        int i6 = i3 + 81;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return z;
    }

    static /* synthetic */ NavigationBar access$300(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NavigationBar navigationBar = rVFragment.mNavigationBar;
        if (i4 != 0) {
            return navigationBar;
        }
        throw null;
    }

    static /* synthetic */ Page access$400(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        Page page = rVFragment.mPage;
        if (i5 == 0) {
            int i6 = 43 / 0;
        }
        int i7 = i4 + 115;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return page;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$500(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        boolean z = rVFragment.mTitleTransparent;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 3;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    static /* synthetic */ void access$600(RVFragment rVFragment, boolean z, Visibility visibility) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        rVFragment.applyTransparentTitleInner(z, visibility);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$700(RVFragment rVFragment, Page page) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        rVFragment.setPageOnMain(page);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$800(RVFragment rVFragment, Page page) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        rVFragment.setPageAfterRenderReady(page);
        int i5 = onExtraCallback + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ PageContainer access$900(RVFragment rVFragment) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        PageContainer pageContainer = rVFragment.mPageContainer;
        int i6 = i4 + 103;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return pageContainer;
    }

    public /* bridge */ /* synthetic */ Activity getActivity() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity activity = super.getActivity();
        int i5 = IAuthTabCallback + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return activity;
    }

    public boolean isAlreadyScheduleAdded() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.mAlreadyScheduleAdded;
        int i6 = i3 + 41;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void setAlreadyScheduleAdded(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.mAlreadyScheduleAdded = z;
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
    }

    public Page getPage() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Page page = this.mPage;
        int i6 = i3 + 33;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return page;
    }

    public void addLifeCycleListener(FragmentLifecycleListener fragmentLifecycleListener) {
        synchronized (this.mListeners) {
            this.mListeners.add(fragmentLifecycleListener);
        }
    }

    public void removeLifeCycleListener(FragmentLifecycleListener fragmentLifecycleListener) {
        synchronized (this.mListeners) {
            this.mListeners.remove(fragmentLifecycleListener);
        }
    }

    private boolean hasOpenedHalfScreenApp() {
        int i2 = 2 % 2;
        Page page = getPage();
        if (page == null) {
            return false;
        }
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        App app = page.getApp();
        if (app == null) {
            return false;
        }
        int i5 = onExtraCallback + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        boolean z = !TextUtils.isEmpty(app.getStringValue("currentHalfScreenChildId"));
        int i7 = IAuthTabCallback + 69;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RVLogger.d(TAG, "onCreate " + this);
        synchronized (this.mListeners) {
            Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                it.next().onCreate(bundle, getFragmentManager(), this);
            }
        }
        this.mClearDisappearingChildrenFix = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_fix_detach_on_resume", true);
        this.mNavReusedOperatorResumeFixed = "yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_navReusedOperatorResumeFixed", "yes"));
    }

    public void setInExitPageWithAnimSchedule() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.mInExitPageWithAnimSchedule = true;
        int i6 = i3 + 69;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context != null && !ProcessUtils.isMainProcess()) {
            RemoteCallClient.bindContext(context);
        }
        synchronized (this.mListeners) {
            Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                it.next().onAttach(context, getFragmentManager(), this);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        RVLogger.d(TAG, "onDetach " + this);
        synchronized (this.mListeners) {
            Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                it.next().onDetach(getFragmentManager(), this);
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        RVLogger.d(TAG, "onDestroyView " + this);
        synchronized (this.mListeners) {
            Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                it.next().onDestroyView(getFragmentManager(), this);
            }
        }
    }

    public RelativeLayout getRootView() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        RelativeLayout relativeLayout = this.mRootView;
        int i5 = i4 + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return relativeLayout;
    }

    private void notifyFragmentLifecycleCreateView() {
        int i2 = 2 % 2;
        Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            it.next().onCreateView(getFragmentManager(), this);
            int i5 = onExtraCallback + 59;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) throws Throwable {
        App appFindApp;
        String strIntern;
        NavigationBar navigationBar;
        int i2 = 2 % 2;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onCreateView);
        try {
            RVLogger.d(TAG, "onCreateView " + this);
            Page page = this.mPage;
            if (page != null && page.isExited()) {
                return null;
            }
            RelativeLayout relativeLayout = this.mRootView;
            if (relativeLayout != null) {
                int i3 = IAuthTabCallback + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                ViewParent parent = relativeLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).endViewTransition(this.mRootView);
                    ((ViewGroup) parent).removeAllViews();
                }
                notifyFragmentLifecycleCreateView();
                return this.mRootView;
            }
            long j = BundleUtils.getLong(getArguments(), "ariverAppInstanceId", 0L);
            RVLogger.d(TAG, "onCreateView with appInstanceId: " + j);
            if (j != 0) {
                appFindApp = ((AppManager) RVProxy.get(AppManager.class)).findApp(j);
                RVLogger.d(TAG, "findApp: " + appFindApp);
            } else {
                appFindApp = null;
            }
            if (appFindApp != null && appFindApp.getAppContext() != null) {
                RelativeLayout relativeLayout2 = new RelativeLayout(getActivity()) { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.1
                    private boolean mHasDetached = false;

                    @Override // android.view.ViewGroup, android.view.View
                    protected void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        if (RVFragment.access$000(RVFragment.this) != null && RVFragment.access$100(RVFragment.this) && RVFragment.access$200(RVFragment.this) && !this.mHasDetached) {
                            ViewParent parent2 = RVFragment.access$000(RVFragment.this).getParent();
                            RVLogger.w(RVFragment.TAG, "onAttachedToWindow mRootView " + RVFragment.this + " clearDisappearingChildren " + parent2);
                            if (parent2 instanceof ViewGroup) {
                                ((ViewGroup) parent2).clearDisappearingChildren();
                            }
                        }
                        RVFragment.access$202(RVFragment.this, false);
                        this.mHasDetached = false;
                    }

                    @Override // android.view.ViewGroup, android.view.View
                    protected void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        this.mHasDetached = true;
                    }
                };
                this.mRootView = relativeLayout2;
                relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.mRootView.setBackgroundColor(0);
                Bundle startParams = appFindApp.getStartParams();
                Object[] objArr = new Object[1];
                e(new char[]{64417, 1096, 1130, 1142, 1050, 1038, 1070, 1070, 1224, 1244, 1271}, ((Process.getThreadPriority(0) + 20) >> 6) + 65519, objArr);
                if (!BundleUtils.getBoolean(startParams, ((String) objArr[0]).intern(), false)) {
                    this.mRootView.setBackgroundColor(-1);
                }
                this.mViewSpecProvider = appFindApp.getAppContext().getViewSpecProvider();
                PageContainer pageContainerCreatePageContainer = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createPageContainer(getActivity(), appFindApp, viewGroup);
                this.mPageContainer = pageContainerCreatePageContainer;
                pageContainerCreatePageContainer.getView().setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.specToLayoutParam(this.mViewSpecProvider.getHeightSpec())));
                long j2 = BundleUtils.getLong(getArguments(), "ariverPageInstanceId", -1L);
                RVLogger.d(TAG, "onCreateView(): pageId = " + j2);
                boolean zNavigationBarOperatorReusedForApp = NavigationBarPolicy.navigationBarOperatorReusedForApp(appFindApp);
                boolean zAppAdjusted4ReusedOperator = NavigationBarPolicy.appAdjusted4ReusedOperator(appFindApp);
                NavigationBarLog.Builder navigationBarClassName = ((NavigationBarLog.Builder) ((NavigationBarLog.Builder) new NavigationBarLog.Builder().setParentId("RVFragment@" + System.identityHashCode(this))).setState(NavigationBarLog.ACTION_CREATE)).setNavigationBarClassName("MYNavigationBar");
                Page page2 = this.mPage;
                if (page2 != null) {
                    int i5 = IAuthTabCallback + 9;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (page2.getApp() != null) {
                        strIntern = this.mPage.getApp().getAppId();
                    } else {
                        Object[] objArr2 = new Object[1];
                        e(new char[]{64416, 31820, 62544, 27742, 58470, 23665, 54385}, 34806 - TextUtils.lastIndexOf("", '0'), objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                }
                AppLogger.log(navigationBarClassName.setAppId(strIntern).build());
                RVLogger.d(TAG, "onCreateView(): NavigationBar enabled, createNavigationBar");
                if (j2 > 0) {
                    int i7 = onExtraCallback + 55;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        this.mNavigationBar = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createNavigationBar(getActivity(), getPage(appFindApp, j2), appFindApp);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.mNavigationBar = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createNavigationBar(getActivity(), getPage(appFindApp, j2), appFindApp);
                } else {
                    this.mNavigationBar = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createNavigationBar(getActivity(), null, appFindApp);
                }
                if (this.mNavigationBar == null) {
                    this.mTitleBar = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createTitleBar(getActivity(), appFindApp);
                }
                NavigationBar navigationBar2 = this.mNavigationBar;
                if (navigationBar2 != null && zNavigationBarOperatorReusedForApp && !zAppAdjusted4ReusedOperator) {
                    navigationBar2.setOnVisibilityChangeListener(new OnNavigationBarVisibilityChangeListener() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.2
                        @Override // com.alibaba.ariver.app.api.ui.navigation.OnNavigationBarVisibilityChangeListener
                        public void onVisibilityChange(NavigationBar navigationBar3, Visibility visibility) {
                            if (RVFragment.access$300(RVFragment.this) == null) {
                                RVLogger.e(RVFragment.TAG, "onCreateView(): OnNavigationBarVisibilityChangeListener.onVisibilityChange(): mNavigationBar is null, skip");
                            } else if (RVFragment.access$400(RVFragment.this) == null) {
                                RVLogger.e(RVFragment.TAG, "onCreateView(): OnNavigationBarVisibilityChangeListener.onVisibilityChange(): mPage is null, skip");
                            } else {
                                RVFragment rVFragment = RVFragment.this;
                                RVFragment.access$600(rVFragment, RVFragment.access$500(rVFragment), visibility);
                            }
                        }
                    });
                }
                if (!zNavigationBarOperatorReusedForApp && (navigationBar = this.mNavigationBar) != null) {
                    int i8 = onExtraCallback + 25;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        View view = navigationBar.getView();
                        int i9 = 56 / 0;
                        if (view != null) {
                            RVLogger.d(TAG, "onCreateView(): add NavigationBar into the layout");
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(10);
                            this.mRootView.addView(this.mNavigationBar.getView(), 0, layoutParams);
                        }
                    } else if (navigationBar.getView() != null) {
                        RVLogger.d(TAG, "onCreateView(): add NavigationBar into the layout");
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams2.addRule(10);
                        this.mRootView.addView(this.mNavigationBar.getView(), 0, layoutParams2);
                    }
                }
                TitleBar titleBar = this.mTitleBar;
                if (titleBar != null && titleBar.getContent() != null) {
                    RVLogger.d(TAG, "add nav bar");
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams3.addRule(10);
                    this.mRootView.addView(this.mTitleBar.getContent(), 0, layoutParams3);
                }
                if (j2 > 0) {
                    Page page3 = getPage(appFindApp, j2);
                    RVLogger.d(TAG, "setPage in fragment onCreateView: " + page3 + ", " + this);
                    if (page3 == null || page3.isExited()) {
                        RVLogger.w(TAG, "mPage already existed!");
                    } else {
                        setPage(page3);
                    }
                }
                notifyFragmentLifecycleCreateView();
                return this.mRootView;
            }
            notifyFragmentLifecycleCreateView();
            return new FrameLayout(getActivity());
        } finally {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onCreateView);
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        int i2 = 2 % 2;
        super.onViewCreated(view, bundle);
        this.mOnViewCreatedTime = SystemClock.elapsedRealtime();
        Page page = this.mPendingSetPage;
        if (page != null) {
            int i3 = IAuthTabCallback + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            setPage(page);
            this.mPendingSetPage = null;
        }
        int i5 = onExtraCallback + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
    }

    public PageContainer getPageContainer() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        PageContainer pageContainer = this.mPageContainer;
        int i6 = i4 + 87;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return pageContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Page getPage(App app, long j) {
        int i2 = 2 % 2;
        Page pageByNodeId = app.getPageByNodeId(j);
        if (pageByNodeId != null) {
            int i3 = IAuthTabCallback + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return pageByNodeId;
        }
        int i5 = IAuthTabCallback + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public void setPage(final Page page) {
        int i2 = 2 % 2;
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.3
            @Override // java.lang.Runnable
            public void run() {
                if (RVFragment.access$000(RVFragment.this) != null) {
                    RVFragment.access$700(RVFragment.this, page);
                } else {
                    RVFragment.this.mPendingSetPage = page;
                }
            }
        });
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private void setPageOnMain(final Page page) {
        int i2 = 2 % 2;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_bindContext);
        Integer numUpdateMainThreadPriority = RuntimeUtils.updateMainThreadPriority(-20);
        RVLogger.d(TAG, "priority-1:" + numUpdateMainThreadPriority);
        try {
            if (this.mPage != null) {
                int i3 = IAuthTabCallback + 111;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    RVLogger.e(TAG, "cannot attachPage twice in NebulaFragment!");
                    return;
                } else {
                    RVLogger.e(TAG, "cannot attachPage twice in NebulaFragment!");
                    throw null;
                }
            }
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, "FragmentOnViewCreated", this.mOnViewCreatedTime);
            this.mPage = page;
            this.mLoadingView = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createLoadingView(getActivity(), page);
            page.bindContext(this);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_bindContext);
            if (page.getRender() != null) {
                int i4 = onExtraCallback + 37;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    setPageAfterRenderReady(page);
                    throw null;
                }
                setPageAfterRenderReady(page);
            } else {
                page.addRenderReadyListener(new Page.RenderReadyListener() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.4
                    public void onRenderReady() {
                        RVFragment.access$800(RVFragment.this, page);
                    }
                });
            }
            RVLogger.d(TAG, "priority-2:" + RuntimeUtils.updateMainThreadPriority(numUpdateMainThreadPriority));
        } finally {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_bindContext);
        }
    }

    private void setPageAfterRenderReady(Page page) {
        boolean zIsTransparentTitle;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_UICreate);
            this.mPageContainer.attachPage(page);
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, "PageShow");
            ((EventTrackStore) page.getData(EventTrackStore.class, true)).whiteScreenAttrMap.put("PageShow", Long.valueOf(SystemClock.elapsedRealtime()));
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_applyTransparentTitle);
            Bundle startParams = page.getStartParams();
            Object[] objArr = new Object[1];
            e(new char[]{64417, 1096, 1130, 1142, 1050, 1038, 1070, 1070, 1224, 1244, 1271}, 65518 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            if (!BundleUtils.getBoolean(startParams, ((String) objArr[0]).intern(), false)) {
                if (page.getStartParams() == null || !page.getStartParams().containsKey(RVParams.LONG_TRANSPARENT_TITLE)) {
                    int i5 = onExtraCallback + 53;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    zIsTransparentTitle = false;
                } else {
                    zIsTransparentTitle = ViewUtils.isTransparentTitle(page.getStartParams(), BundleUtils.getString(page.getStartParams(), RVParams.LONG_TRANSPARENT_TITLE));
                }
                applyTransparentTitle(zIsTransparentTitle);
            }
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_applyTransparentTitle);
            adjustNavigationBar();
            ViewGroup view = this.mPageContainer.getView();
            this.mPageContainer.addRenderView(page.getRender().getView());
            this.mRootView.addView(view, 0);
            if (this.mNavigationBar != null) {
                int i7 = IAuthTabCallback + 23;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
                this.mNavigationBar.attachPage(page);
                if (isStartWithPrepareErrorPage(page)) {
                    this.mNavigationBar.showOptionMenu(false);
                }
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
            }
            if (this.mTitleBar != null) {
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
                this.mTitleBar.attachPage(page);
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
            }
            Page page2 = this.mPage;
            if (page2 != null) {
                int i9 = IAuthTabCallback + 95;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    ParamUtils.processTransparent(page2.getStartParams());
                    throw null;
                }
                ParamUtils.processTransparent(page2.getStartParams());
            }
            RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_pageEnter);
            page.enter();
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_pageEnter);
        } finally {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_UICreate);
        }
    }

    private boolean isStartWithPrepareErrorPage(Page page) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return BundleUtils.getBoolean(page.getStartParams(), "startWithDegradeUrl", false);
    }

    public void applyTransparentTitle(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        applyTransparentTitleInner(z, null);
        int i5 = IAuthTabCallback + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyTransparentTitleInner(boolean z, Visibility visibility) {
        boolean z2;
        int statusBarHeight;
        int i2 = 2 % 2;
        RVLogger.d(TAG, "applyTransparentTitleInner(): transparentTitle = " + z);
        this.mTitleTransparent = z;
        ViewGroup view = this.mPageContainer.getView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.specToLayoutParam(-1), ViewUtils.specToLayoutParam(this.mViewSpecProvider.getPageHeightSpec(z)));
        Page page = this.mPage;
        if (page == null || !NavigationBarPolicy.navigationBarOperatorReusedForApp(page.getApp())) {
            z2 = false;
        } else {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        Page page2 = this.mPage;
        boolean z3 = page2 != null && NavigationBarPolicy.appAdjusted4ReusedOperator(page2.getApp());
        if (z2 && z3) {
            int i5 = IAuthTabCallback + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            layoutParams.addRule(6);
            layoutParams.height = ViewUtils.specToLayoutParam(this.mViewSpecProvider.getHeightSpec());
            appContextApplyTransparentTitle();
        }
        if (z) {
            int i7 = IAuthTabCallback + 53;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                layoutParams.addRule(32);
                layoutParams.height = ViewUtils.specToLayoutParam(this.mViewSpecProvider.getHeightSpec());
                if (z2) {
                    if (!z3) {
                        layoutParams.setMargins(0, 0, 0, 0);
                    }
                }
            } else {
                layoutParams.addRule(6);
                layoutParams.height = ViewUtils.specToLayoutParam(this.mViewSpecProvider.getHeightSpec());
                if (z2) {
                }
            }
        } else if (!z2) {
            NavigationBar navigationBar = this.mNavigationBar;
            if (navigationBar != null && navigationBar.getView() != null) {
                layoutParams.addRule(3, this.mNavigationBar.getView().getId());
            }
            TitleBar titleBar = this.mTitleBar;
            if (titleBar != null) {
                int i8 = onExtraCallback + 91;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    titleBar.getContent();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (titleBar.getContent() != null) {
                    layoutParams.addRule(3, this.mTitleBar.getContent().getId());
                }
            }
        } else if (!z3) {
            layoutParams.addRule(6);
            NavigationBar navigationBar2 = this.mNavigationBar;
            if (navigationBar2 != null) {
                int i9 = onExtraCallback + 117;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                if (navigationBar2.getView() != null) {
                    if (Visibility.HIDDEN == visibility) {
                        statusBarHeight = 0;
                    } else {
                        statusBarHeight = StatusBarUtils.getStatusBarHeight(getActivity()) + this.mViewSpecProvider.getTitleBarRawHeight();
                        registerNavigationBarOnLayoutChangeListener();
                    }
                    layoutParams.setMargins(0, statusBarHeight, 0, 0);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void registerNavigationBarOnLayoutChangeListener() {
        NavigationBar navigationBar;
        int i2 = 2 % 2;
        NavigationBar navigationBar2 = this.mNavigationBar;
        if (navigationBar2 != null && this.mPageContainer != null) {
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this.mViewSpecProvider != null) {
                View view = navigationBar2.getView();
                if (view == null) {
                    RVLogger.e(TAG, "registerNavigationBarOnLayoutChangeListener(): mNavigationBar.getView() is null, skip");
                    return;
                }
                if (this.mNavigationBarOnLayoutChangeListener != null && (navigationBar = this.mNavigationBar) != null) {
                    int i4 = IAuthTabCallback + 45;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (navigationBar.getView() != null) {
                        int i6 = onExtraCallback + 13;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            this.mNavigationBar.getView().removeOnLayoutChangeListener(this.mNavigationBarOnLayoutChangeListener);
                            int i7 = 54 / 0;
                        } else {
                            this.mNavigationBar.getView().removeOnLayoutChangeListener(this.mNavigationBarOnLayoutChangeListener);
                        }
                    }
                }
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.5
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                        if (RVFragment.access$900(RVFragment.this) == null || RVFragment.access$1000(RVFragment.this) == null || view2 == null || RVFragment.access$500(RVFragment.this)) {
                            return;
                        }
                        ViewGroup view3 = RVFragment.access$900(RVFragment.this).getView();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.specToLayoutParam(-1), ViewUtils.specToLayoutParam(RVFragment.access$1000(RVFragment.this).getPageHeightSpec(RVFragment.access$500(RVFragment.this))));
                        layoutParams.addRule(6);
                        layoutParams.setMargins(0, view2.getHeight(), 0, 0);
                        view3.setLayoutParams(layoutParams);
                    }
                };
                this.mNavigationBarOnLayoutChangeListener = onLayoutChangeListener;
                view.addOnLayoutChangeListener(onLayoutChangeListener);
                int i8 = onExtraCallback + 93;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
        }
        RVLogger.e(TAG, "registerNavigationBarOnLayoutChangeListener(): mNavigationBar or mPageContainer or mViewSpecProvider is null, skip");
    }

    private void appContextApplyTransparentTitle() {
        int i2 = 2 % 2;
        Page page = this.mPage;
        if (page != null) {
            int i3 = IAuthTabCallback + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            App app = page.getApp();
            if (!NavigationBarPolicy.appAdjusted4ReusedOperator(app)) {
                RVLogger.d(TAG, "appContextApplyTransparentTitle(): not adjust app layout by navigation bar policy");
                return;
            }
            if (app != null) {
                int i5 = onExtraCallback + 41;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                AppUIContext appContext = app.getAppContext();
                if (appContext instanceof AppUIContext) {
                    int i7 = onExtraCallback + 31;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    appContext.applyTransparentTitle(this.mTitleTransparent);
                    if (i8 != 0) {
                        throw null;
                    }
                }
            }
        }
    }

    public void setShouldResumeWebView(boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        this.mShouldResumeWebView = z;
        int i6 = i3 + 75;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    public void pauseRender() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Page page = this.mPage;
        if (page != null) {
            int i6 = i3 + 17;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (page.getRender() != null) {
                int i8 = IAuthTabCallback + 17;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    this.mPage.getRender().onPause();
                    int i9 = 67 / 0;
                } else {
                    this.mPage.getRender().onPause();
                }
            }
        }
        int i10 = onExtraCallback + 45;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) throws Resources.NotFoundException {
        int i4 = 2 % 2;
        int animResId = AnimUtils.getAnimResId(getActivity(), TRANSLATE_IN_RIGHT_ID);
        if (animResId == 0) {
            int i5 = onExtraCallback + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            animResId = R.anim.ariver_fragment_translate_in_right_default;
        }
        if (animResId != i3) {
            return super.onCreateAnimation(i2, z, i3);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), i3);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.6
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                RVLogger.d(RVFragment.TAG, "onAnimationEnd");
                if (RVFragment.access$400(RVFragment.this) == null || !RVFragment.access$1100(RVFragment.this) || RVFragment.access$400(RVFragment.this).getRender() == null) {
                    return;
                }
                RVFragment.access$1102(RVFragment.this, false);
                RVFragment.access$400(RVFragment.this).getRender().onResume();
            }
        });
        int i7 = onExtraCallback + 61;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return animationLoadAnimation;
        }
        throw null;
    }

    public IEmbedViewManager getEmbedViewManager() {
        IEmbedViewManager iEmbedViewManager;
        synchronized (this) {
            if (this.mEmbedViewManager == null) {
                this.mEmbedViewManager = new DefaultEmbedViewManager(this.mPage);
            }
            iEmbedViewManager = this.mEmbedViewManager;
        }
        return iEmbedViewManager;
    }

    public void onStart() {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "onStart " + this);
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onStart);
        super.onStart();
        this.mIsBetweenStartPause = true;
        if (this.mIsFragmentStarted) {
            Page page = this.mPage;
            if (page != null) {
                int i3 = IAuthTabCallback + 31;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!page.isExited() && !hasOpenedHalfScreenApp()) {
                    NavigationBar navigationBar = this.mNavigationBar;
                    if (navigationBar != null) {
                        navigationBar.onPageResume();
                    }
                    this.mPage.resume();
                }
            }
        } else {
            int i5 = IAuthTabCallback + 115;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                this.mIsFragmentStarted = false;
            } else {
                this.mIsFragmentStarted = true;
            }
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onStart);
    }

    public void onPause() {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "pause " + this);
        super.onPause();
        ((FragmentPausePoint) ExtensionPoint.as(FragmentPausePoint.class).node(this.mPage).create()).onPause(this.mPage, this);
        if ("yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("h5_collectT2PerformanceOnPause", "yes"))) {
            ExtensionPoint.as(CollectPerformancePoint.class).node(this.mPage).create().onCollectWhenDestroy(this.mPage, false, new CollectPerformanceCallback() { // from class: com.alibaba.ariver.app.api.ui.fragment.RVFragment.7
                public void afterProcess() {
                    RVLogger.d(RVFragment.TAG, "on Pause collect performance callback");
                }
            });
            int i3 = onExtraCallback + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Page page = this.mPage;
        if (page != null && !page.isExited()) {
            int i5 = IAuthTabCallback + 41;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (hasOpenedHalfScreenApp()) {
                this.mPage.pause();
            }
        }
        this.mIsBetweenStartPause = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        boolean z;
        NavigationBar navigationBar;
        int i2 = 2 % 2;
        RVLogger.d(TAG, "onResume(): this = " + this);
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onResume);
        ((FragmentResumePoint) ExtensionPoint.as(FragmentResumePoint.class).node(this.mPage).create()).onResume(this.mPage, this);
        super.onResume();
        adjustNavigationBar();
        Page page = this.mPage;
        if (page != null) {
            int i3 = IAuthTabCallback + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = NavigationBarPolicy.navigationBarOperatorReusedForApp(page.getApp());
        }
        Page page2 = this.mPage;
        if (page2 != null && !page2.isExited()) {
            int i5 = onExtraCallback + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (hasOpenedHalfScreenApp()) {
                if (this.mNavReusedOperatorResumeFixed) {
                    int i7 = onExtraCallback + 35;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (!(!z) && (navigationBar = this.mNavigationBar) != null) {
                        navigationBar.onPageResume();
                    }
                }
                this.mPage.resume();
            } else if (BundleUtils.getBoolean(this.mPage.getStartParams(), "fullscreen", false) && (!this.mIsBetweenStartPause)) {
                NavigationBar navigationBar2 = this.mNavigationBar;
                if (navigationBar2 != null) {
                    int i9 = IAuthTabCallback + 69;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        navigationBar2.onPageResume();
                        int i10 = 70 / 0;
                    } else {
                        navigationBar2.onPageResume();
                    }
                }
                this.mPage.resume();
            }
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onResume);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r7 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void adjustNavigationBar() {
        SplashView splashView;
        int i2 = 2 % 2;
        Page page = this.mPage;
        if (page == null || page.getApp() == null) {
            RVLogger.e(TAG, "adjustNavigationBar(): mPage is null or mPage.getApp() is null, skip");
            return;
        }
        boolean zNavigationBarOperatorReusedForApp = NavigationBarPolicy.navigationBarOperatorReusedForApp(this.mPage.getApp());
        boolean zUseSuperSplash = SplashUtils.useSuperSplash(this.mPage.getStartParams());
        AppUIContext appContext = this.mPage.getApp().getAppContext();
        boolean z = false;
        if ((appContext instanceof AppUIContext) && (splashView = appContext.getSplashView()) != null && SplashView.Status.LOADING == splashView.getStatus()) {
            int i3 = onExtraCallback + 9;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 49;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        if (zNavigationBarOperatorReusedForApp) {
            if (zUseSuperSplash) {
                int i8 = onExtraCallback + 65;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            RVLogger.d(TAG, "adjustNavigationBar(): navigation bar enabled, operator reused, and not (superSplash && splashViewLoading), show navigation bar, and notify AppContext transparentTitle");
            NavigationBar navigationBar = this.mNavigationBar;
            if (navigationBar != null && !this.mNavigationBarVisibilitySet) {
                this.mNavigationBarVisibilitySet = true;
                navigationBar.setVisibility(Visibility.VISIBLE);
            }
            appContextApplyTransparentTitle();
            int i9 = IAuthTabCallback + 17;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        RVLogger.d(TAG, "adjustNavigationBar(): do not show for now");
    }

    public void onStop() {
        int i2 = 2 % 2;
        RVLogger.d(TAG, "onStop " + this);
        super.onStop();
        Page page = this.mPage;
        if (page == null || page.isExited()) {
            return;
        }
        int i3 = IAuthTabCallback + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (hasOpenedHalfScreenApp()) {
            return;
        }
        this.mPage.pause();
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onDestroy() {
        RVLogger.d(TAG, "onDestroy " + this);
        super.onDestroy();
        synchronized (this.mListeners) {
            Iterator<FragmentLifecycleListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                it.next().onDestroy(getFragmentManager(), this);
            }
            this.mListeners.clear();
        }
        if (this.mIsFragmentStarted) {
            this.mIsFragmentStarted = false;
            Page page = this.mPage;
            if (page != null && !page.isExited()) {
                this.mPage.exit(true);
            }
            NavigationBar navigationBar = this.mNavigationBar;
            if (navigationBar != null) {
                navigationBar.onPageDestroy();
            }
            TitleBar titleBar = this.mTitleBar;
            if (titleBar != null) {
                titleBar.onDestroy();
            }
        }
    }

    public ViewGroup getContentView() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 13;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        PageContainer pageContainer = this.mPageContainer;
        if (pageContainer != null) {
            ViewGroup view = pageContainer.getView();
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return view;
        }
        int i7 = i3 + 115;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public TitleBar getTitleBar() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        TitleBar titleBar = this.mTitleBar;
        int i5 = i4 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return titleBar;
        }
        obj.hashCode();
        throw null;
    }

    public NavigationBar getNavigationBar() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        NavigationBar navigationBar = this.mNavigationBar;
        int i6 = i3 + 33;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return navigationBar;
        }
        throw null;
    }

    public LoadingView getLoadingView() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LoadingView loadingView = this.mLoadingView;
        int i5 = i4 + 63;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return loadingView;
    }

    public ErrorView getErrorView() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.mErrorView == null) {
            RVViewFactory rVViewFactory = (RVViewFactory) RVProxy.get(RVViewFactory.class);
            if (rVViewFactory == null) {
                int i4 = IAuthTabCallback + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            this.mErrorView = rVViewFactory.createErrorView(getActivity());
            int i6 = IAuthTabCallback + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.mErrorView;
    }

    public void destroy() {
        int i2 = 2 % 2;
        IEmbedViewManager embedViewManager = getEmbedViewManager();
        if (embedViewManager != null) {
            int i3 = IAuthTabCallback + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            embedViewManager.releaseViews();
            if (i4 == 0) {
                int i5 = 14 / 0;
            }
            int i6 = onExtraCallback + 41;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i2 = 2 % 2;
        super.onConfigurationChanged(configuration);
        DimensionUtil.resetDimensions();
        RVLogger.d(TAG, "window resize onConfigurationChanged " + configuration);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = IAuthTabCallback + 7;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                if (this.mPage == null || configuration == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("windowWidth", Integer.valueOf(DimensionUtil.dip2px(activity, configuration.screenWidthDp)));
                jSONObject.put("windowHeight", Integer.valueOf(DimensionUtil.dip2px(activity, configuration.screenHeightDp)));
                EngineUtils.sendToRender(this.mPage.getRender(), "windowResize", jSONObject, (SendToRenderCallback) null);
                int i4 = onExtraCallback + 21;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            obj.hashCode();
            throw null;
        }
    }
}
