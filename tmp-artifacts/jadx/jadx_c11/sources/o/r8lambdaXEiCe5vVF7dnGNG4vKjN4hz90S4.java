package o;

import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getSurfaceSize;
import o.hasProvider;
import o.r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4 {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    public static final r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4 IAuthTabCallback = new r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(918221429, false, new Function2() { // from class: im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt$$ExternalSyntheticLambda2
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-131955714, false, new Function2() { // from class: im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt$$ExternalSyntheticLambda3
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1602608540, false, new Function2() { // from class: im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt$$ExternalSyntheticLambda4
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallback = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                return r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            Unit unitOnWarmupCompleted = r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            int i3 = 63 / 0;
            return unitOnWarmupCompleted;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 29;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 99;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, j, setorientationdegrees);
        }
        IAuthTabCallback(surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, j, setorientationdegrees);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(j);
        if (i3 == 0) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(2045343569, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, lValueOf, setorientationdegrees}, -2045343568, iOnWarmupCompleted2, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i4 = asInterface + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i5);
        int i12 = (~(i5 | i4)) | (~(i7 | i9)) | i8;
        int i13 = i4 + i + i2 + ((-1422066268) * i3) + ((-2108786386) * i6);
        int i14 = i13 * i13;
        int i15 = (i4 * 793895740) + 1353643607 + (i * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (793896001 * i2) + (692483748 * i3) + ((-1016611666) * i6) + (i14 * 166461440);
        if (((-1583913924) * i4) + 967573504 + (322476998 * i) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i2) + ((-1298137088) * i3) + (1722810368 * i6) + (518782976 * i14) + (i15 * i15 * 1997799424) != 1) {
            return IAuthTabCallback(objArr);
        }
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1 = (SurfaceProcessorWithExecutorExternalSyntheticLambda1) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[3];
        int i16 = 2 % 2;
        int i17 = asInterface + 121;
        onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        getProcessor.onExtraCallbackWithResult(setorientationdegrees, SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, "동해물과 백두산이", gethumanreadablename, 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null), jLongValue, 0L, 0.0f, (ExifSpeedConverter) null, (bindChildren) null, (hasMoreElements) null, 0, 252, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i19 = asInterface + 45;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 25 / 0;
        }
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        int i5 = i3 + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        char c = 2;
        int i2 = 2 % 2;
        int i3 = 1;
        int i4 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(918221429, i, -1, "im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt.lambda$918221429.<anonymous> (TdsText.kt:914)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i5 = asInterface + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
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
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(426106873);
            Iterator it = accessgetTlsVersionsAsStringp.getEntries().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) it.next();
                hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(i4, i3, (DefaultConstructorMarker) null);
                iAuthTabCallback.IAuthTabCallback("동해물과 백두산이");
                AppLovinCmpErrorCode.onNavigationEvent(iAuthTabCallback, "뱃지", null, null, null, 14, null);
                hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, null, AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048575, null), 0L, 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262138);
                int i7 = asInterface + 95;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i4 = i4;
                i3 = i3;
                c = c;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = asInterface + 47;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 2 % 2;
        int i3 = asInterface + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 1;
        int i6 = 0;
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-131955714, i, -1, "im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt.lambda$-131955714.<anonymous> (TdsText.kt:932)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i7 = onExtraCallback + 121;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1661695638);
            for (accessgetTlsVersionsAsStringp accessgettlsversionsasstringp : accessgetTlsVersionsAsStringp.getEntries()) {
                hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(i6, i5, (DefaultConstructorMarker) null);
                iAuthTabCallback.IAuthTabCallback("동해물과 백두산이");
                AppLovinCmpErrorCode.onNavigationEvent(iAuthTabCallback, "뱃지", null, null, null, 14, null);
                hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, null, AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048575, null), 0L, 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262138);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i6 = i6;
                i5 = i5;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, long j, setOrientationDegrees setorientationdegrees) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult;
        long j2;
        float f;
        ExifSpeedConverter exifSpeedConverter;
        bindChildren bindchildren;
        hasMoreElements hasmoreelements;
        int i;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = asInterface + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            surfaceProcessorNodeOutOnExtraCallbackWithResult = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, "동해물과 백두산이", gethumanreadablename, 0, true, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, true, 30006, (Object) null);
            j2 = 1;
            f = 1.0f;
            exifSpeedConverter = null;
            bindchildren = null;
            hasmoreelements = null;
            i = 0;
            i2 = 5687;
            obj = null;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            surfaceProcessorNodeOutOnExtraCallbackWithResult = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, "동해물과 백두산이", gethumanreadablename, 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null);
            j2 = 0;
            f = 0.0f;
            exifSpeedConverter = null;
            bindchildren = null;
            hasmoreelements = null;
            i = 0;
            i2 = 252;
            obj = null;
        }
        getProcessor.onExtraCallbackWithResult(setorientationdegrees, surfaceProcessorNodeOutOnExtraCallbackWithResult, j, j2, f, exifSpeedConverter, bindchildren, hasmoreelements, i, i2, obj);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 113;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        long jLongValue;
        long jIEngagementSignalsCallbackStub;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = asInterface + 101;
        onExtraCallback = i4 % 128;
        int i5 = 1;
        ?? r13 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(i4 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 57;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1602608540, i, -1, "im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt.lambda$1602608540.<anonymous> (TdsText.kt:950)");
                    int i7 = 81 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1602608540, i, -1, "im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt.lambda$1602608540.<anonymous> (TdsText.kt:950)");
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onExtraCallback + 1;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                int i10 = onExtraCallback + 85;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
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
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1306537520);
            Iterator it = accessgetTlsVersionsAsStringp.getEntries().iterator();
            while (true) {
                String str = "동해물과 백두산이";
                Object obj = null;
                if (it.hasNext()) {
                    accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) it.next();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), (boolean) r13);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, (int) r13));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        int i12 = asInterface + 9;
                        onExtraCallback = i12 % 128;
                        if (i12 % i2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            obj.hashCode();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    final getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048575, null);
                    hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback((int) r13, i5, (DefaultConstructorMarker) null);
                    iAuthTabCallback.IAuthTabCallback("동해물과 백두산이");
                    hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-191309364);
                        jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-191308436);
                        jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IEngagementSignalsCallbackStub();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i13 = i2;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, null, gethumanreadablenameOnExtraCallback, getMaxAdCount.onNavigationEvent(jIEngagementSignalsCallbackStub, 0.5f), 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262130);
                    final SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                    final long jOnNavigationEvent = getMaxAdCount.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0.5f);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablenameOnExtraCallback);
                    boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnNavigationEvent);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnWarmupCompleted) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj2) {
                                int i14 = 2 % 2;
                                int i15 = onExtraCallback + 121;
                                IAuthTabCallback = i15 % 128;
                                if (i15 % 2 != 0) {
                                    r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, gethumanreadablenameOnExtraCallback, jOnNavigationEvent, (setOrientationDegrees) obj2);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, gethumanreadablenameOnExtraCallback, jOnNavigationEvent, (setOrientationDegrees) obj2);
                                int i16 = onExtraCallback + 99;
                                IAuthTabCallback = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i17 = 46 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    r13 = 0;
                    i5 = 1;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    i2 = i13;
                } else {
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    Throwable th = null;
                    ?? r0 = r13;
                    float f = 0.5f;
                    int i14 = 6;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1306564797);
                    Iterator it2 = accessgetTlsVersionsAsStringp.getEntries().iterator();
                    for (int i15 = i5; it2.hasNext() == i15; i15 = 1) {
                        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = (accessgetTlsVersionsAsStringp) it2.next();
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), (boolean) r0);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, (int) r0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback3);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            int i16 = onExtraCallback + 65;
                            asInterface = i16 % 128;
                            if (i16 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
                                th.hashCode();
                                throw th;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                            int i17 = onExtraCallback + 43;
                            asInterface = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        final getHumanReadableName gethumanreadablenameOnExtraCallback2 = AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048575, null);
                        hasProvider.IAuthTabCallback iAuthTabCallback2 = new hasProvider.IAuthTabCallback((int) r0, i15, th);
                        iAuthTabCallback2.IAuthTabCallback(str);
                        hasProvider hasproviderOnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult();
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(i14)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue() != i15) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-382400587);
                            jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, i14).IEngagementSignalsCallbackStub();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-382401515);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, i14)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        String str2 = str;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult2, null, gethumanreadablenameOnExtraCallback2, getMaxAdCount.onNavigationEvent(jLongValue, f), 0L, 0L, null, null, null, fIAuthTabCallback, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 805306368, 0, 261618);
                        final SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback2 = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                        final long jOnNavigationEvent2 = getMaxAdCount.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0.5f);
                        th = null;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback3, 0.0f, 1, (Object) null);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback2);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablenameOnExtraCallback2);
                        boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnNavigationEvent2);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnNavigationEvent3 | zOnNavigationEvent4 | zOnWarmupCompleted2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.ComposableSingletons$TdsTextKt$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2) {
                                    int i19 = 2 % 2;
                                    int i20 = IAuthTabCallback + 13;
                                    onWarmupCompleted = i20 % 128;
                                    int i21 = i20 % 2;
                                    Unit unitOnExtraCallback = r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onExtraCallback(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback2, gethumanreadablenameOnExtraCallback2, jOnNavigationEvent2, (setOrientationDegrees) obj2);
                                    int i22 = IAuthTabCallback + 7;
                                    onWarmupCompleted = i22 % 128;
                                    if (i22 % 2 == 0) {
                                        return unitOnExtraCallback;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 6);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
                        r0 = 0;
                        f = 0.5f;
                        i14 = 6;
                        str = str2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, getHumanReadableName gethumanreadablename, long j, setOrientationDegrees setorientationdegrees) {
        return (Unit) onWarmupCompleted(2045343569, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{surfaceProcessorWithExecutorExternalSyntheticLambda1, gethumanreadablename, Long.valueOf(j), setorientationdegrees}, -2045343568, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Function2) onWarmupCompleted(-1821412738, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this}, 1821412738, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }
}
