package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.main.home.loan_needs.ScoreRaiseLoanNeedsActivity;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity$;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity$onCreate$1$1$4$1$1$;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AbstractGradeJudgement;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.addEnvironmentStateChangeListener;
import o.component5;
import o.findResAndMsg;
import o.getAwbState;
import o.getHostnameVerifierokhttp;
import o.getWrite;
import o.h5ScreenShotObserverOnChangeOpt;
import o.isColdStartup;
import o.isFistLaunch;
import o.isUcInitOpt;
import o.maybeUpdateAnimatable;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setHeaders;
import o.setRandomHost;
import o.toPreviewOnlyRange;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditScoreRaiseCoolTimeActivity extends Hilt_CreditScoreRaiseCoolTimeActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static char[] access000 = null;
    private static int access100 = 0;
    public static final int asInterface;
    private static int getInterfaceDescriptor = 0;
    private static int readTypedObject = 1;
    private boolean IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditScoreRaiseCoolTimeViewModel.class), new IAuthTabCallback(this), new onNavigationEvent(this), new onExtraCallback(null, this));
    private final Lazy asBinder;
    private final Lazy onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        asInterface = 8;
        int i = getInterfaceDescriptor + 117;
        readTypedObject = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsSkeletonV1View IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        TdsSkeletonV1View tdsSkeletonV1ViewOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i4 = access100 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return tdsSkeletonV1ViewOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        isColdStartup iscoldstartup = (isColdStartup) objArr[0];
        CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity = (CreditScoreRaiseCoolTimeActivity) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            return (Unit) onExtraCallback(-493778588, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 493778588, new Object[]{iscoldstartup, creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        }
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(-493778588, iOnWarmupCompleted3, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted4, 493778588, new Object[]{iscoldstartup, creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i3 = 30 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(creditScoreRaiseCoolTimeActivity);
        }
        asBinder(creditScoreRaiseCoolTimeActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 5;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(creditScoreRaiseCoolTimeActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback_Parcel + 75;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, isColdStartup iscoldstartup) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(creditScoreRaiseCoolTimeActivity, iscoldstartup);
        }
        onNavigationEvent(creditScoreRaiseCoolTimeActivity, iscoldstartup);
        throw null;
    }

    public static /* synthetic */ int onExtraCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditScoreRaiseCoolTimeActivity);
        int i4 = access100 + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return iIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~(i7 | i | i2);
        int i9 = (~((~i2) | i)) | (~(i | i5));
        int i10 = i + i5 + i4 + (32217706 * i3) + (238734613 * i6);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i) - 528416768) + (677943110 * i5) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i3) + ((-131989504) * i6) + ((-1876361216) * i11);
        int i13 = ((i * 1127137324) - 440746823) + (i5 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i3 * 976419026) + (i6 * 1106960329) + (i11 * 279773184);
        int i14 = i12 + (i13 * i13 * (-1943076864));
        if (i14 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 2) {
            return onExtraCallback(objArr);
        }
        if (i14 != 3) {
            return i14 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity = (CreditScoreRaiseCoolTimeActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = IAuthTabCallback_Parcel + 63;
        access100 = i16 % 128;
        int i17 = i16 % 2;
        Unit unitOnTransact = onTransact(creditScoreRaiseCoolTimeActivity);
        int i18 = access100 + 35;
        IAuthTabCallback_Parcel = i18 % 128;
        int i19 = i18 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(creditScoreRaiseCoolTimeActivity, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 105;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ String onWarmupCompleted(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(creditScoreRaiseCoolTimeActivity);
            throw null;
        }
        String strAsInterface = asInterface(creditScoreRaiseCoolTimeActivity);
        int i3 = access100 + 51;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return strAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 17;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditScoreRaiseCoolTimeActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback_Parcel + 97;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 71;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return 1273701L;
        }
        throw null;
    }

    public CreditScoreRaiseCoolTimeActivity() {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        this.asBinder = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnWarmupCompleted = CreditScoreRaiseCoolTimeActivity.onWarmupCompleted(this.f$0);
                int i4 = onWarmupCompleted + 111;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return strOnWarmupCompleted;
            }
        });
        this.onTransact = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Integer numValueOf = Integer.valueOf(CreditScoreRaiseCoolTimeActivity.onExtraCallback(this.f$0));
                int i4 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return numValueOf;
            }
        });
    }

    public static final /* synthetic */ String onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        String str = (String) onExtraCallback(-1768213730, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 1768213732, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
        int i4 = access100 + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, boolean z) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 101;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        creditScoreRaiseCoolTimeActivity.IAuthTabCallbackDefault = z;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i2 + 59;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 65;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    private final CreditScoreRaiseCoolTimeViewModel updateVisuals() {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CreditScoreRaiseCoolTimeViewModel creditScoreRaiseCoolTimeViewModel = (CreditScoreRaiseCoolTimeViewModel) this.IAuthTabCallbackStub.getValue();
        int i4 = access100 + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return creditScoreRaiseCoolTimeViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asInterface(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        h5ScreenShotObserverOnChangeOpt.onExtraCallback onextracallback = h5ScreenShotObserverOnChangeOpt.Companion;
        Intent intent = creditScoreRaiseCoolTimeActivity.getIntent();
        if (i3 != 0) {
            return onextracallback.onNavigationEvent(intent);
        }
        onextracallback.onNavigationEvent(intent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity = (CreditScoreRaiseCoolTimeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) creditScoreRaiseCoolTimeActivity.asBinder.getValue();
        int i4 = IAuthTabCallback_Parcel + 41;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int IAuthTabCallbackDefault(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = creditScoreRaiseCoolTimeActivity.getIntent().getIntExtra("leftDays", 0);
        int i4 = access100 + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return intExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity = (CreditScoreRaiseCoolTimeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) creditScoreRaiseCoolTimeActivity.onTransact.getValue();
        if (i3 != 0) {
            number.intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = number.intValue();
        int i4 = access100 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iIntValue);
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{4, 6, 1, 6, 13855, 13855, 6, 4}, (byte) (55 - TextUtils.getCapsMode("", 0, 0)), 8 - Color.alpha(0), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), (String) onExtraCallback(-1768213730, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1768213732, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted())), getWrite.IAuthTabCallback("left_days", Integer.valueOf(((Integer) onExtraCallback(-460359002, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 460359006, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted())).intValue()))});
        int i4 = IAuthTabCallback_Parcel + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        updateVisuals().onWarmupCompleted();
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(677704463, true, new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda8(this))), 1, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 7;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final TdsSkeletonV1View onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsSkeletonV1View tdsSkeletonV1View = new TdsSkeletonV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsSkeletonV1View.setSkeletonType(TdsSkeletonV1View.IAuthTabCallback.onWarmupCompleted.onWarmupCompleted);
        TdsSkeletonV1View.IAuthTabCallback.onNavigationEvent.onExtraCallback.onExtraCallback(-1);
        int i2 = access100 + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return tdsSkeletonV1View;
    }

    public static final class onNavigationEvent implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i3 = 33 / 0;
            } else {
                onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            int i4 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
            }
            int i3 = 2 / 0;
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    public static final class IAuthTabCallback implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ComponentActivity onExtraCallback;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onExtraCallback.getViewModelStore();
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class onExtraCallback implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallback(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallbackWithResult() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.onExtraCallback;
            if (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) {
                return this.onWarmupCompleted.getDefaultViewModelCreationExtras();
            }
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity, java.lang.Object] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Float fValueOf;
        isColdStartup iscoldstartup = (isColdStartup) objArr[0];
        ?? r12 = (CreditScoreRaiseCoolTimeActivity) objArr[1];
        int i = 2 % 2;
        isColdStartup.onExtraCallbackWithResult onextracallbackwithresult = (isColdStartup.onExtraCallbackWithResult) iscoldstartup;
        String strOnExtraCallback = onextracallbackwithresult.onExtraCallback();
        if (strOnExtraCallback != null) {
            SessionTrackerb.IAuthTabCallback(r12.IAuthTabCallback(), (Activity) r12, strOnExtraCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            ((CreditScoreRaiseCoolTimeActivity) r12).IAuthTabCallbackDefault = true;
        } else {
            ScoreRaiseLoanNeedsActivity.onWarmupCompleted onwarmupcompleted = ScoreRaiseLoanNeedsActivity.Companion;
            String str = (String) onExtraCallback(-1768213730, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1768213732, new Object[]{r12}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
            int iIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            float fIAuthTabCallback = onextracallbackwithresult.onWarmupCompleted().IAuthTabCallback();
            Integer numOnNavigationEvent = onextracallbackwithresult.onWarmupCompleted().onNavigationEvent();
            String strOnExtraCallback2 = onextracallbackwithresult.onWarmupCompleted().onExtraCallback();
            setHeaders.onExtraCallback onextracallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted().onWarmupCompleted();
            Object obj = null;
            if (onextracallbackOnWarmupCompleted != null) {
                int i2 = IAuthTabCallback_Parcel + 43;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    Float.valueOf(onextracallbackOnWarmupCompleted.IAuthTabCallback());
                    obj.hashCode();
                    throw null;
                }
                fValueOf = Float.valueOf(onextracallbackOnWarmupCompleted.IAuthTabCallback());
            } else {
                int i3 = access100 + 53;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                fValueOf = null;
            }
            setHeaders.onExtraCallback onextracallbackOnWarmupCompleted2 = onextracallbackwithresult.onWarmupCompleted().onWarmupCompleted();
            r12.startActivity(onwarmupcompleted.onWarmupCompleted(r12, str, iIAuthTabCallback, isFistLaunch.COOLTIME, fIAuthTabCallback, numOnNavigationEvent, strOnExtraCallback2, fValueOf, onextracallbackOnWarmupCompleted2 != null ? onextracallbackOnWarmupCompleted2.onExtraCallback() : null));
            r12.finish();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            creditScoreRaiseCoolTimeActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = access100 + 105;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 0;
            }
            return unit;
        }
        creditScoreRaiseCoolTimeActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{4, 6, 1, 6, 13855, 13855, 6, 4}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 55), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        setDetectableSize.onExtraCallback(strIntern, (String) onExtraCallback(-1768213730, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 1768213732, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted()));
        Object[] objArr2 = new Object[1];
        a(new char[]{'\t', 14, 13855, 13855, 2, 7, '\b', 4, 0, 4, '\t', 7}, (byte) (50 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditScoreRaiseCoolTimeActivity.getString(R.string.close));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(final CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1273703L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 45;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    CreditScoreRaiseCoolTimeActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnNavigationEvent = CreditScoreRaiseCoolTimeActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
                int i4 = onExtraCallback + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnNavigationEvent;
            }
        }, 14, null);
        creditScoreRaiseCoolTimeActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ isColdStartup $state;
        int label;
        final /* synthetic */ CreditScoreRaiseCoolTimeActivity this$0;
        private static final byte[] $$a = {35, -11, -97, -73};
        private static final int $$b = 108;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int IAuthTabCallback = -1776194565;
        private static char onExtraCallback = 37892;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, byte b) {
            int i3;
            int i4;
            int i5 = 4 - (b * 4);
            int i6 = i2 + 109;
            int i7 = (i * 3) + 1;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i7];
            if (bArr == null) {
                int i8 = i5;
                int i9 = 0;
                i6 += -i5;
                i5 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                i4 = i3 + 1;
                if (i4 == i7) {
                    return new String(bArr2, 0);
                }
                i8 = i5;
                i5 = bArr[i5];
                i9 = i4;
                i6 += -i5;
                i5 = i8 + 1;
                i3 = i9;
                bArr2[i3] = (byte) i6;
                i4 = i3 + 1;
                if (i4 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i6;
                i4 = i3 + 1;
                if (i4 == i7) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isColdStartup iscoldstartup, CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = iscoldstartup;
            this.this$0 = creditScoreRaiseCoolTimeActivity;
        }

        public static /* synthetic */ Unit IAuthTabCallback(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(creditScoreRaiseCoolTimeActivity, setDetectableSize);
            if (i3 != 0) {
                int i4 = 65 / 0;
            }
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.this$0, access13800Var);
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertByteArrayToFloatArray.onExtraCallback(1273703L, false, null, null, new CreditScoreRaiseCoolTimeActivity$onCreate$1$1$4$1$1$.ExternalSyntheticLambda0(this.this$0), 14, null);
            String strOnNavigationEvent = this.$state.onNavigationEvent();
            SessionTrackerb sessionTrackerbIAuthTabCallback = this.this$0.IAuthTabCallback();
            getHostnameVerifierokhttp gethostnameverifierokhttp = this.this$0;
            if (strOnNavigationEvent == null) {
                Object[] objArr = new Object[1];
                a((char) (23205 - Color.red(0)), ViewConfiguration.getTapTimeout() >> 16, new char[]{57918, 52164, 49993, 22920, 51954, 45557, 528, 47538, 56049, 59777, 28148, 16652, 11130, 12073, 56564, 57800, 63741, 28661, 62664, 56817, 57657, 8455, 25395, 59509, 30558, 49106, 41789, 42195}, new char[]{0, 0, 0, 0}, new char[]{8778, 51283, 42364, 57690}, objArr);
                strOnWarmupCompleted = isUcInitOpt.onWarmupCompleted(((String) objArr[0]).intern(), "credit_improve_cool_time");
            } else {
                strOnWarmupCompleted = strOnNavigationEvent;
            }
            SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, gethostnameverifierokhttp, strOnWarmupCompleted, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            if (strOnNavigationEvent != null) {
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CreditScoreRaiseCoolTimeActivity.onNavigationEvent(this.this$0, true);
            } else {
                this.this$0.finish();
                int i6 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 4;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((char) View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{64641, 34793, 41838, 35038, 32482, 30781, 54271, 22740}, new char[]{0, 0, 0, 0}, new char[]{27125, 7225, 38849, 56145}, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), CreditScoreRaiseCoolTimeActivity.onNavigationEvent(creditScoreRaiseCoolTimeActivity));
            Object[] objArr2 = new Object[1];
            a((char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{16489, 4811, 46617, 5002, 62279, 55709, 43955, 54957, 58860, 47911, 57742, 62663}, new char[]{0, 0, 0, 0}, new char[]{4965, 5043, 55937, 30963}, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditScoreRaiseCoolTimeActivity.getString(im.toss.feature.credit.ui.main.R.string.score_raise_cooldown_cta));
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 61;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 43 - TextUtils.getTrimmedLength(""), KeyEvent.getDeadChar(0, 0) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.indexOf("", "", 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 50, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 45848), KeyEvent.keyCodeFromString("") + 29, 12577 - TextUtils.getOffsetAfter("", 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i6 = $11 + 67;
                                $10 = i6 % 128;
                                int i7 = i6 % 2;
                                i2 = 2;
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
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }
    }

    private static final Unit onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, isColdStartup iscoldstartup) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(creditScoreRaiseCoolTimeActivity), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(iscoldstartup, creditScoreRaiseCoolTimeActivity, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 83;
        access100 = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
            int i4 = access100 + 35;
            IAuthTabCallback_Parcel = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1851857079, i, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity.onCreate.<anonymous>.<anonymous> (CreditScoreRaiseCoolTimeActivity.kt:60)");
            }
            isColdStartup iscoldstartupOnNavigationEvent = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends isColdStartup>) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditScoreRaiseCoolTimeActivity.updateVisuals().onExtraCallbackWithResult(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7));
            if (iscoldstartupOnNavigationEvent instanceof isColdStartup.onWarmupCompleted) {
                int i5 = IAuthTabCallback_Parcel + 51;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-180482538);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda1();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback((Function1) objOnMinimized, (QuirksExternalSyntheticBackport0) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 6);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (!(!(iscoldstartupOnNavigationEvent instanceof isColdStartup.onExtraCallbackWithResult))) {
                int i7 = IAuthTabCallback_Parcel + 79;
                access100 = i7 % 128;
                if (i7 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-179791052);
                    ((Integer) onExtraCallback(-460359002, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 460359006, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted())).intValue();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iscoldstartupOnNavigationEvent);
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-179791052);
                int iIntValue = ((Integer) onExtraCallback(-460359002, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 460359006, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted())).intValue();
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iscoldstartupOnNavigationEvent);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda2(iscoldstartupOnNavigationEvent, creditScoreRaiseCoolTimeActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                Function0 function0 = (Function0) objOnMinimized2;
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback4 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda3(creditScoreRaiseCoolTimeActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                AbstractGradeJudgement.onExtraCallback(iIntValue, function0, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (!(iscoldstartupOnNavigationEvent instanceof isColdStartup.onNavigationEvent)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1518199974);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-177790901);
                int iIntValue2 = ((Integer) onExtraCallback(-460359002, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 460359006, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted())).intValue();
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iscoldstartupOnNavigationEvent);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback5 || zOnExtraCallback6) {
                    objOnMinimized4 = new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda4(creditScoreRaiseCoolTimeActivity, iscoldstartupOnNavigationEvent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    Function0 function02 = (Function0) objOnMinimized4;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                        Object obj2 = objOnMinimized5;
                        if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda5(creditScoreRaiseCoolTimeActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                            obj2 = externalSyntheticLambda5;
                        }
                        addEnvironmentStateChangeListener.onNavigationEvent(iIntValue2, function02, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    int i8 = IAuthTabCallback_Parcel + 35;
                    access100 = i8 % 128;
                    if (i8 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    Function0 function022 = (Function0) objOnMinimized4;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditScoreRaiseCoolTimeActivity);
                    Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback_Parcel + 39;
        access100 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 76 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access100 + 113;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback_Parcel + 121;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(677704463, i, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeActivity.onCreate.<anonymous> (CreditScoreRaiseCoolTimeActivity.kt:59)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1851857079, true, new CreditScoreRaiseCoolTimeActivity$.ExternalSyntheticLambda9(creditScoreRaiseCoolTimeActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = false;
            finish();
            int i4 = access100 + 105;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private static char[] onWarmupCompleted = {64961, 64982, 64981, 64960};
        private static char onExtraCallbackWithResult = 51243;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, int i) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) CreditScoreRaiseCoolTimeActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{1, 0, 3, 0, 13829, 13829, 0, 1}, (byte) (30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("leftDays", i);
            int i3 = IAuthTabCallback + 53;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return intent;
            }
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onWarmupCompleted;
            Object obj2 = null;
            if (cArr3 != null) {
                int i4 = $11 + 13;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $10 + 119;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), View.resolveSize(0, 0) + 26, 23139 - View.combineMeasuredStates(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i5 %= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), 23138 - ((byte) KeyEvent.getModifierMetaStateMask()), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j = 0;
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 26 - Color.red(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i7 = $10 + 31;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionGroup(j) + 74, TextUtils.lastIndexOf("", '0') + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i9 = $11 + 125;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            try {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, 19488 - KeyEvent.normalizeMetaState(0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i16 = $10 + 3;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    obj2 = obj;
                    j = 0;
                }
            }
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    private static final isColdStartup onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends isColdStartup> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        isColdStartup iscoldstartup = (isColdStartup) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = access100 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iscoldstartup;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = access000;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10;
            int i5 = i4 + 81;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = i4 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 26, (ViewConfiguration.getEdgeSlop() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), MotionEvent.axisFromString("") + 27, (ViewConfiguration.getTouchSlop() >> 8) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i9 = $11 + 43;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i11 = $11 + 47;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i12 = $11 + 69;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback + b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent - 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 24825), 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 8088 - TextUtils.getOffsetBefore("", 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19487, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                } else {
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i16];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i17];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(-781787842, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 781787845, new Object[]{creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(isColdStartup iscoldstartup, CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(1381443731, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, -1381443730, new Object[]{iscoldstartup, creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final int setEngagementSignalsCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return ((Integer) onExtraCallback(-460359002, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 460359006, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted())).intValue();
    }

    private final String ICustomTabsServiceStub() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onExtraCallback(-1768213730, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 1768213732, new Object[]{this}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(isColdStartup iscoldstartup, CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onExtraCallback(-493778588, iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2, 493778588, new Object[]{iscoldstartup, creditScoreRaiseCoolTimeActivity}, GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 83;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.home.raise_edge_case.Hilt_CreditScoreRaiseCoolTimeActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        access000 = new char[]{64967, 64990, 64981, 64988, 65004, 64982, 64989, 64961, 64984, 64985, 64977, 64991, 64986, 64966, 64987, 64976};
        IAuthTabCallbackStubProxy = (char) 51245;
    }
}
