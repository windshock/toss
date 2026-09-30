package im.toss.features.loan.refinancing.biz.account;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda4;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.PageRenderReadyListener;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ReadonlySnapshot;
import o.RippleNode;
import o.SnapshotKtExternalSyntheticLambda0;
import o.SnapshotStateListExternalSyntheticLambda0;
import o.SnapshotStateObserverExternalSyntheticLambda0;
import o.TraceDebugManager1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.WebSocketFactory;
import o.ZslRingBuffer;
import o.addAllCommandLine;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.enableLoopMonitor;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDeviceInfo;
import o.immediateFailedFuture;
import o.initSDK;
import o.oExternalSyntheticLambda0;
import o.preFillDefault;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setPositionProvider;
import o.setThreadList;
import o.showAndRender;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u3;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BizRefinancingNoAccountFragment extends Hilt_BizRefinancingNoAccountFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int asBinder = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static char onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private int IAuthTabCallback = R.layout.fragment_biz_refinancing_account_loading;
    private final PageRenderReadyListener onExtraCallback = preFillDefault.IAuthTabCallback(this, IAuthTabCallback.onNavigationEvent);

    static {
        onExtraCallback();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(BizRefinancingNoAccountFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentBizRefinancingAccountLoadingBinding;", 0)};
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 23;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(bizRefinancingNoAccountFragment, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = asBinder + 25;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bizRefinancingNoAccountFragment, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        int i6 = asBinder + 69;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(bizRefinancingNoAccountFragment, onnavigationevent);
        int i4 = asBinder + 115;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment = (BizRefinancingNoAccountFragment) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(bizRefinancingNoAccountFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onNavigationEvent(bizRefinancingNoAccountFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-1991187490, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{bizRefinancingNoAccountFragment}, 1991187493, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 39;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        bizRefinancingNoAccountFragment.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackDefault + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 39;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(bizRefinancingNoAccountFragment, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = i5 | i3 | i7;
        int i10 = i3 + i + i4 + (1159740906 * i6) + ((-617157175) * i2);
        int i11 = i10 * i10;
        int i12 = ((i3 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i4) + (1488977920 * i6) + (2111832064 * i2) + (2070937600 * i11);
        int i13 = (i3 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i4 * (-824977973)) + (i6 * (-135083378)) + (i2 * 1125239651) + (i11 * 298844160);
        int i14 = i12 + (i13 * i13 * 2098200576);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment = (BizRefinancingNoAccountFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(bizRefinancingNoAccountFragment);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(bizRefinancingNoAccountFragment);
        int i3 = asBinder + 29;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = asBinder + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {bizRefinancingNoAccountFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i4 == 0) {
            unit = (Unit) onNavigationEvent(-2026344377, iIAuthTabCallback4, objArr, 2026344377, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
            int i5 = 75 / 0;
        } else {
            unit = (Unit) onNavigationEvent(-2026344377, iIAuthTabCallback4, objArr, 2026344377, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
        }
        int i6 = asBinder + 19;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 5;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, TraceDebugManager1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 31;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        IAuthTabCallback() {
            super(1, TraceDebugManager1.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentBizRefinancingAccountLoadingBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 == 0) {
                return onExtraCallback(view);
            }
            onExtraCallback(view);
            throw null;
        }

        public final TraceDebugManager1 onExtraCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                TraceDebugManager1.onExtraCallbackWithResult(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            TraceDebugManager1 traceDebugManager1OnExtraCallbackWithResult = TraceDebugManager1.onExtraCallbackWithResult(view);
            int i3 = onExtraCallbackWithResult + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return traceDebugManager1OnExtraCallbackWithResult;
        }
    }

    private final TraceDebugManager1 onTransact() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugManager1 traceDebugManager1OnNavigationEvent = this.onExtraCallback.onNavigationEvent(this, onWarmupCompleted[0]);
        int i4 = asBinder + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return traceDebugManager1OnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            asInterface();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        asInterface();
        int i3 = IAuthTabCallbackDefault + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugManager1 traceDebugManager1OnTransact = onTransact();
        if (traceDebugManager1OnTransact != null) {
            int i4 = asBinder + 93;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                ComposeView composeView = traceDebugManager1OnTransact.onWarmupCompleted;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ComposeView composeView2 = traceDebugManager1OnTransact.onWarmupCompleted;
            if (composeView2 != null) {
                composeView2.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-236468974, true, new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda3(this))));
                int i5 = asBinder + 67;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private static final Unit onWarmupCompleted(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        String strIntern;
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = asBinder + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Object[] objArr = new Object[1];
            a(new char[]{23, 18, 18, 14, 13821, 13821, 18, 23}, (byte) (15 / Process.getGidForName("")), 76 >> View.MeasureSpec.getSize(1), objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = {bizRefinancingNoAccountFragment.access100()};
            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent2, objArr2);
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Object[] objArr3 = new Object[1];
            a(new char[]{23, 18, 18, 14, 13821, 13821, 18, 23}, (byte) (Process.getGidForName("") + 22), 8 - View.MeasureSpec.getSize(0), objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = {bizRefinancingNoAccountFragment.access100()};
            int iOnNavigationEvent3 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            int iOnNavigationEvent4 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
            objOnExtraCallback = LoanRefinancingViewModel.onExtraCallback(iOnNavigationEvent3, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 974733256, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -974733251, iOnNavigationEvent4, objArr4);
        }
        onnavigationevent.onExtraCallback(strIntern, (String) objOnExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = IAuthTabCallbackDefault + 85;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-825622683, i, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.initView.<anonymous>.<anonymous>.<anonymous> (BizRefinancingNoAccountFragment.kt:58)");
                }
                bizRefinancingNoAccountFragment.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = IAuthTabCallbackDefault + 83;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                bizRefinancingNoAccountFragment.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z = false;
        BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment = (BizRefinancingNoAccountFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i2 = IAuthTabCallbackDefault + 29;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asBinder + 25;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-236468974, iIntValue, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.initView.<anonymous>.<anonymous> (BizRefinancingNoAccountFragment.kt:52)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-236468974, iIntValue, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.initView.<anonymous>.<anonymous> (BizRefinancingNoAccountFragment.kt:52)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(bizRefinancingNoAccountFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    BizRefinancingNoAccountFragment$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda4(bizRefinancingNoAccountFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                    obj2 = externalSyntheticLambda4;
                }
                setThreadList.onWarmupCompleted(1971284L, (String) null, (Function1) obj2, ForwardingCameraControl.onExtraCallback(-825622683, true, new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda5(bizRefinancingNoAccountFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = IAuthTabCallbackDefault + 71;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        bizRefinancingNoAccountFragment.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = asBinder + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 100) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = asBinder + 77;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = asBinder + 71;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1958083767, i2, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.NoAccountScreen.<anonymous>.<anonymous> (BizRefinancingNoAccountFragment.kt:92)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_biz_refinancing_no_account_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(bizRefinancingNoAccountFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i9 = IAuthTabCallbackDefault + 119;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    BizRefinancingNoAccountFragment$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda7(bizRefinancingNoAccountFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                    obj = externalSyntheticLambda7;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = IAuthTabCallbackDefault + 91;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment = (BizRefinancingNoAccountFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        bizRefinancingNoAccountFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 83;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 120) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-839540336, i2, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.NoAccountScreen.<anonymous>.<anonymous> (BizRefinancingNoAccountFragment.kt:98)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.uikit.R.string.uikit_content_desc_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(bizRefinancingNoAccountFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i5 = IAuthTabCallbackDefault + 47;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    BizRefinancingNoAccountFragment$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda6(bizRefinancingNoAccountFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj = externalSyntheticLambda6;
                }
                u3Var.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, onextracallbackwithresultOnNavigationEvent, 0L, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 3072, 54);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = IAuthTabCallbackDefault + 55;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2013290810);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i5 = IAuthTabCallbackDefault + 23;
                asBinder = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = asBinder + 39;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2013290810, i2, -1, "im.toss.features.loan.refinancing.biz.account.BizRefinancingNoAccountFragment.NoAccountScreen (BizRefinancingNoAccountFragment.kt:65)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i8 = asBinder + 57;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                int i10 = asBinder + 43;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getDeviceInfo.onNavigationEvent.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Object[] objArr = new Object[1];
            a(new char[]{'\r', 21, 24, '\r', 22, 1, 13856, 13856, 22, 24, 18, 21, 2, '\r', 18, 22, 6, 23, 22, 16, 1, '\b', 6, 0, '\r', 3, 3, '\b', 11, 23, 2, '\n', '\t', 7, 7, '\t', 20, '\n', 11, '\b', '\r', 24, 0, 5, 24, 11, '\r', 3, 19, 22, 23, 6, 13919}, (byte) (107 - View.combineMeasuredStates(0, 0)), 53 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted = RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(((String) objArr[0]).intern())), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 62).onWarmupCompleted();
            ReadonlySnapshot.IAuthTabCallback(composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted, setAdVideoPlaybackListener.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f)), "LottieAnimation", (Object) null, showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted)), false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, 1, false, false, false, false, (RenderMode) null, false, false, (SnapshotStateObserverExternalSyntheticLambda0) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, false, (Map) null, false, (ComposableLambdaImplExternalSyntheticLambda4) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572864, 0, 0, 4194236);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-1958083767, true, new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda0(this), cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(-839540336, true, new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda1(this), cameraCaptureResultEmptyCameraCaptureResult2, 54), 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 12583296, 0, 3963);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BizRefinancingNoAccountFragment$.ExternalSyntheticLambda2(this, i));
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted2, -1113360422, 1113360436, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted3, new Object[]{this, "refinancing_business_unable"});
            return;
        }
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted5 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted6 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(iOnWarmupCompleted5, -1113360422, 1113360436, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted6, new Object[]{this, "refinancing_business_unable"});
        int i3 = 22 / 0;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        RippleNode.onNavigationEvent(this).onWarmupCompleted(R.id.loanRefinancingIntroWebFragment, (Bundle) null, setPositionProvider.IAuthTabCallback.onNavigationEvent(new setPositionProvider.IAuthTabCallback(), R.id.nav_loan_refinancing, true, false, 4, (Object) null).onExtraCallbackWithResult());
        int i2 = IAuthTabCallbackDefault + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 21;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), KeyEvent.getDeadChar(0, 0) + 26, 23139 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 23139 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i6 = $10 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onTransact)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 26 - TextUtils.getTrimmedLength(""), 23187 - AndroidCharacter.getMirror('0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 89;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 121;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 117;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - ExpandableListView.getPackedPositionChild(0L)), 74 - View.resolveSize(0, 0), 8088 - View.resolveSizeAndState(0, 0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i11 = $10 + 47;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 30 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.red(0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        } else {
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            int i19 = $10 + 69;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onExtraCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bizRefinancingNoAccountFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(1276834718, WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, -1276834717, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(1580324456, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{bizRefinancingNoAccountFragment}, -1580324454, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
    }

    private static final Unit onExtraCallbackWithResult(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1991187490, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{bizRefinancingNoAccountFragment}, 1991187493, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallback(BizRefinancingNoAccountFragment bizRefinancingNoAccountFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bizRefinancingNoAccountFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Unit) onNavigationEvent(-2026344377, WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, 2026344377, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{64926, 64991, 64905, 64986, 64912, 64924, 64990, 64915, 64988, 64914, 64917, 64987, 64976, 64982, 64963, 64989, 64978, 64925, 64961, 64981, 64970, 64960, 64913, 64967, 64985};
        onTransact = (char) 51244;
    }
}
