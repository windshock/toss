package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeFromMissionScreenKt$;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.mExternalSyntheticApiModelOutline1;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AbstractGradeJudgement {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 12207;
    private static int asInterface = 1;
    private static char onExtraCallback = 25065;
    private static char onExtraCallbackWithResult = 52401;
    private static int onNavigationEvent = 0;
    private static char onWarmupCompleted = 65226;

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = asInterface + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 21;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i4 = onNavigationEvent + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, Function0 function0, Function0 function02, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return onWarmupCompleted(i, function0, function02, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(i, function0, function02, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, Function0 function0, Function0 function02, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(i, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 87;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 27 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 71;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 103;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> $routeToLoanNeedBanner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function0<Unit> function0, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$routeToLoanNeedBanner = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$routeToLoanNeedBanner, access13800Var);
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1800L, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 23;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onWarmupCompleted + 49;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            this.$routeToLoanNeedBanner.invoke();
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 23;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallback(int i, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onNavigationEvent + 5;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1))) {
            int i7 = asInterface + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 85;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1873556930, i3, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeFromMissionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditScoreRaiseCoolTimeFromMissionScreen.kt:50)");
                    int i10 = 56 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1873556930, i3, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeFromMissionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditScoreRaiseCoolTimeFromMissionScreen.kt:50)");
                }
            }
            String str = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.score_raise_cooldown_from_financial_mission_title, cameraCaptureResultEmptyCameraCaptureResult, 0), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            mcVar.onExtraCallbackWithResult(str, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, 0, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 0, ((i3 << 15) & 458752) | 3072, 24572);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = asInterface + 41;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = asInterface + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(93060000, i2, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeFromMissionScreen.<anonymous> (CreditScoreRaiseCoolTimeFromMissionScreen.kt:35)");
            }
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallbackWithResult(function0, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = asInterface + 29;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = asInterface + 69;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    int i9 = 48 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(1873556930, true, new CreditScoreRaiseCoolTimeFromMissionScreenKt$.ExternalSyntheticLambda3(i), cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 16382);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 0.3f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(112.0f)), onextracallbackwithresult.onTransact());
            Object[] objArr = new Object[1];
            a(new char[]{22446, 4542, 43922, 44131, 38293, 6339, 53467, 37822, 16487, 5065, 31753, 60383, 19654, 56431, 14756, 49812, 58093, 48381, 53620, 5746, 26075, 28042, 6462, 19726, 34016, 43949, 57497, 53561, 63796, 9481, 36345, 31859, 50111, 3651, 11404, 57260, 29729, 42795, 7357, 54533, 60819, 54307, 12185, 24914, 38140, 27229, 10649, 29803, 43893, 58269, 14583, 42389, 65110, 28408, 50493, 23440}, 55 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnExtraCallback2, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 508);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 0.7f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(int i, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1708142458);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i8 = asInterface + 11;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = asInterface + 93;
                onNavigationEvent = i10 % 128;
                i5 = i10 % 2 != 0 ? 71 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i11 = asInterface + 57;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1708142458, i3, -1, "im.toss.feature.credit.ui.main.home.raise_edge_case.CreditScoreRaiseCoolTimeFromMissionScreen (CreditScoreRaiseCoolTimeFromMissionScreen.kt:33)");
            }
            boolean z = (i3 & 896) == 256;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditScoreRaiseCoolTimeFromMissionScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CreditScoreRaiseCoolTimeFromMissionScreenKt$.ExternalSyntheticLambda0(function02);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                PromptPoint.onExtraCallback((QuirksExternalSyntheticBackport0) null, 0L, (Function0) obj, ForwardingCameraControl.onExtraCallback(93060000, true, new CreditScoreRaiseCoolTimeFromMissionScreenKt$.ExternalSyntheticLambda1(function0, i), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 3);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = asInterface + 63;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreRaiseCoolTimeFromMissionScreenKt$.ExternalSyntheticLambda2(i, function0, function02, i2));
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 17;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                        int iGreen = 12434 - Color.green(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, doubleTapTimeout, iGreen, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 11, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 19901 - (ViewConfiguration.getScrollBarSize() >> 8), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $10 + 69;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 4;
            }
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
