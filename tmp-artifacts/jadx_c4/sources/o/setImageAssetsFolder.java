package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.skt.usp.UCPApiConstants;
import im.toss.compose.widget.TdsRadialGradientKt$;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.createCameraCaptureCallback;
import o.readFully;
import o.setByteOrder;
import o.setImageAssetsFolder;
import o.setIso;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setImageAssetsFolder {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 79 / 0;
        }
        int i7 = IAuthTabCallback + 91;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, long j3, float f, float f2, long j4, boolean z, boolean z2, float f3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(1375990382, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j4), Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1375990379, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i6 = IAuthTabCallback + 101;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setorientationdegrees);
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        float fFloatValue3 = ((Number) objArr[4]).floatValue();
        long jLongValue3 = ((Number) objArr[5]).longValue();
        long jLongValue4 = ((Number) objArr[6]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[8];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(jLongValue, fFloatValue, jLongValue2, fFloatValue2, fFloatValue3, jLongValue3, jLongValue4, zBooleanValue, setorientationdegrees);
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(removeTimestamp removetimestamp, readFully readfully, float f, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(removetimestamp, readfully, f, setiso);
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Pair[] pairArr, float f2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        removeObserverLocked removeobserverlocked = (removeObserverLocked) onWarmupCompleted(128901797, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{Float.valueOf(f), r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, Float.valueOf(f2), sessionProcessorCaptureCallback}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -128901793, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return removeobserverlocked;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = (~(i7 | i10)) | (~(i8 | i | i6));
        int i12 = (~(i6 | i7)) | (~(i8 | i10));
        int i13 = i + i4 + i3 + ((-1255669517) * i5) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + ((-122328029) * i3) + ((-1196579527) * i5) + (656595923 * i2) + (i14 * 138215424);
        int i16 = ((i * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i3) + (760610816 * i5) + ((-1057882112) * i2) + (1344208896 * i14) + (i15 * i15 * (-833028096));
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        float fFloatValue2 = ((Number) objArr[5]).floatValue();
        long jLongValue4 = ((Number) objArr[6]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[8]).booleanValue();
        float fFloatValue3 = ((Number) objArr[9]).floatValue();
        int iIntValue = ((Number) objArr[10]).intValue();
        int iIntValue2 = ((Number) objArr[11]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        ((Number) objArr[13]).intValue();
        int i17 = 2 % 2;
        int i18 = onExtraCallback + 101;
        IAuthTabCallback = i18 % 128;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, jLongValue, jLongValue2, jLongValue3, fFloatValue, fFloatValue2, jLongValue4, zBooleanValue, zBooleanValue2, fFloatValue3, cameraCaptureResultEmptyCameraCaptureResult, i18 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Pair[] pairArr, float f2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(f, r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, f2, setiso);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, f2, setiso);
        int i3 = IAuthTabCallback + 53;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 21;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j, float f, long j2, float f2, float f3, Pair[] pairArr, boolean z, setOrientationDegrees setorientationdegrees) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, f, j2, f2, f3, pairArr, z, setorientationdegrees);
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(toMetersPerSecond tometerspersecond, float f, float f2, float f3, Pair[] pairArr, int i, float f4, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(tometerspersecond, f, f2, f3, pairArr, i, f4, sessionProcessorCaptureCallback);
        int i5 = onExtraCallback + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    public static final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jIEngagementSignalsCallbackStub;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1183658889);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onExtraCallback + 119;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1183658889, i, -1, "im.toss.compose.widget.GradientCanvasPreview (TdsRadialGradient.kt:50)");
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i6 = IAuthTabCallback + 79;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-918788199);
                    jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 32)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-918788199);
                    jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-918787271);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            long j = jIEngagementSignalsCallbackStub;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i7 = IAuthTabCallback + 7;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, 0L, j, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0.5f, 0.5f, 0L, false, true, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100884486, 706);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0L, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(1723446759))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.0f)))}, Float.valueOf(0.0f), Float.valueOf(0.0f), 0L, false, false, Float.valueOf(0.0f), 253, null}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i9 = IAuthTabCallback + 111;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Gradient Ex", HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(50)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.onExtraCallback(), null, cameraCaptureResultEmptyCameraCaptureResult2, 24582, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsRadialGradientKt$.ExternalSyntheticLambda0(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull toMetersPerSecond tometerspersecond, float f, @NotNull Pair<Float, setByteOrder>[] pairArr, float f2, float f3, float f4, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zOnExtraCallback;
        boolean z5;
        boolean z6;
        Object objOnMinimized;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(tometerspersecond, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        int iOnExtraCallback = (i3 & 64) != 0 ? createURational.Companion.onExtraCallback() : i;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1159710029, i2, -1, "im.toss.compose.widget.applyRadialGradientStroke (TdsRadialGradient.kt:102)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        if ((((i2 & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tometerspersecond)) && (i2 & 48) != 32) {
            int i5 = onExtraCallback + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (((57344 & i2) ^ 24576) <= 16384 || !cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) {
            z2 = (i2 & 24576) == 16384;
        }
        if (((458752 & i2) ^ 196608) > 131072) {
            int i7 = IAuthTabCallback + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f3)) {
                z3 = true;
            }
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
                int i9 = onExtraCallback + 93;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f4)) {
                    z4 = true;
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
                if (((i2 & 29360128) ^ 12582912) > 8388608) {
                    int i11 = IAuthTabCallback + 117;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallback)) {
                        z5 = (i2 & 12582912) == 8388608;
                    }
                }
                if (((i2 & 896) ^ 384) > 256) {
                    int i13 = IAuthTabCallback + 15;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                        throw null;
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f)) {
                        z6 = (i2 & 384) == 256;
                    }
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((z6 | z5 | z | z2 | z3 | z4 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    TdsRadialGradientKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new TdsRadialGradientKt$.ExternalSyntheticLambda9(tometerspersecond, f2, f3, f4, pairArr, iOnExtraCallback, f);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                    objOnMinimized = externalSyntheticLambda9;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onExtraCallback + 105;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i15 == 0) {
                        throw null;
                    }
                }
                return quirksExternalSyntheticBackport0OnExtraCallback;
            }
            if ((1572864 & i2) == 1048576) {
                int i16 = IAuthTabCallback + 21;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                z4 = false;
            }
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
            if (((i2 & 29360128) ^ 12582912) > 8388608) {
            }
            if (((i2 & 896) ^ 384) > 256) {
            }
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z6 | z5 | z | z2 | z3 | z4 | zOnExtraCallback) {
                TdsRadialGradientKt$.ExternalSyntheticLambda9 externalSyntheticLambda92 = new TdsRadialGradientKt$.ExternalSyntheticLambda9(tometerspersecond, f2, f3, f4, pairArr, iOnExtraCallback, f);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda92);
                objOnMinimized = externalSyntheticLambda92;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return quirksExternalSyntheticBackport0OnExtraCallback2;
        }
        if ((i2 & 196608) != 131072) {
            z3 = false;
        }
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) == 1048576) {
        }
        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
        if (((i2 & 29360128) ^ 12582912) > 8388608) {
        }
        if (((i2 & 896) ^ 384) > 256) {
        }
        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z6 | z5 | z | z2 | z3 | z4 | zOnExtraCallback) {
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return quirksExternalSyntheticBackport0OnExtraCallback22;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(toMetersPerSecond tometerspersecond, float f, float f2, float f3, Pair[] pairArr, int i, float f4, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        rotate rotateVarIAuthTabCallback = tometerspersecond.IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), ExtensionsManagerExtensionsAvailability.Ltr, sessionProcessorCaptureCallback);
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVarIAuthTabCallback);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new TdsRadialGradientKt$.ExternalSyntheticLambda2(removetimestampOnWarmupCompleted, readFully.Companion.onWarmupCompleted((Pair[]) Arrays.copyOf(pairArr, pairArr.length), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2 * f2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * f) << 32)), Math.min(Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32)), Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted())) * f3, i), f4));
        int i3 = IAuthTabCallback + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(removeTimestamp removetimestamp, readFully readfully, float f, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        setOrientationDegrees.onExtraCallback(setiso, removetimestamp, readfully, 0.0f, new ExifOutputStream(setiso.onExtraCallback(f), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull Pair<Float, setByteOrder>[] pairArr, float f, float f2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new TdsRadialGradientKt$.ExternalSyntheticLambda6(f, r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, f2)));
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final float fFloatValue = ((Number) objArr[0]).floatValue();
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
        final Pair[] pairArr = (Pair[]) objArr[2];
        final float fFloatValue2 = ((Number) objArr[3]).floatValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.compose.widget.TdsRadialGradientKt$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    setImageAssetsFolder.onWarmupCompleted(fFloatValue, r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, fFloatValue2, (setIso) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = setImageAssetsFolder.onWarmupCompleted(fFloatValue, r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, fFloatValue2, (setIso) obj);
                int i4 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Pair[] pairArr, float f2, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        rotate rotateVarIAuthTabCallback = new AppLovinAdClickListener(getZoomState.IAuthTabCallback(f)).IAuthTabCallback(setiso.onTransact(), ExtensionsManagerExtensionsAvailability.Ltr, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        setiso.onWarmupCompleted();
        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVarIAuthTabCallback);
        setOrientationDegrees.onExtraCallback(setiso, removetimestampOnWarmupCompleted, readFully.onExtraCallback.onExtraCallbackWithResult(readFully.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0L, 0L, 0, 14, (Object) null), 0.0f, new ExifOutputStream(setiso.onExtraCallback(f2), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r0 r3 r4 r5
      0x0049: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r3v35 java.lang.Float) = (r3v4 java.lang.Float), (r3v36 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r4v16 java.lang.Float) = (r4v2 java.lang.Float), (r4v17 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r5v28 java.lang.Float) = (r5v1 java.lang.Float), (r5v29 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r0 r3 r4 r5
      0x0047: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r3v5 java.lang.Float) = (r3v4 java.lang.Float), (r3v36 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r4v3 java.lang.Float) = (r4v2 java.lang.Float), (r4v17 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r5v2 java.lang.Float) = (r5v1 java.lang.Float), (r5v29 java.lang.Float) binds: [B:8:0x0045, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        long jIEngagementSignalsCallbackStub;
        long jLongValue;
        long jIEngagementSignalsCallbackStub2;
        long jIEngagementSignalsCallbackStub3;
        int i2;
        long jIEngagementSignalsCallbackStub4;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            fValueOf = Float.valueOf(0.65f);
            fValueOf2 = Float.valueOf(0.5f);
            fValueOf3 = Float.valueOf(0.2f);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1500790661);
            int i5 = 74 / 0;
            z = i != 0;
        } else {
            fValueOf = Float.valueOf(0.65f);
            fValueOf2 = Float.valueOf(0.5f);
            fValueOf3 = Float.valueOf(0.2f);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1500790661);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1500790661, i, -1, "im.toss.compose.widget.GradientCanvasPreview2 (TdsRadialGradient.kt:146)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i6 = onExtraCallback + 37;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult3 = setByteOrder.Companion;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(-0.5f), setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault()));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(fValueOf3, setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i8 = onExtraCallback + 81;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730876375);
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730877303);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(fValueOf2, setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault()));
            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730881783);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730880855);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            Pair[] pairArr = {pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(Float.valueOf(1.5f), setByteOrder.onNavigationEvent(jLongValue))};
            Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault()));
            Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(fValueOf3, setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i10 = onExtraCallback + 59;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730888183);
                jIEngagementSignalsCallbackStub2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1730889111);
                jIEngagementSignalsCallbackStub2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i12 = onExtraCallback + 5;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            Pair[] pairArr2 = {pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback(fValueOf2, setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub2)), getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault()))};
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f))));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1464526299);
                jIEngagementSignalsCallbackStub3 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1464527227);
                jIEngagementSignalsCallbackStub3 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i14 = onExtraCallback + 29;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0L, jIEngagementSignalsCallbackStub3, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 1.1f, 0.5f, 0L, false, false, 0.5f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 906190848, 194);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1464540987);
                i2 = 6;
                jIEngagementSignalsCallbackStub4 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                i2 = 6;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1464541915);
                jIEngagementSignalsCallbackStub4 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            long j = jIEngagementSignalsCallbackStub4;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            long jIAuthTabCallbackDefault = onextracallbackwithresult3.IAuthTabCallbackDefault();
            int i16 = i2;
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, 0L, j, jIAuthTabCallbackDefault, 1.0f, 0.1f, 0L, false, true, 1.1f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 906193926, 194);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(IAuthTabCallback(onNavigationEvent(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f))) << 32) | (Float.floatToRawIntBits(-((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f))) & 4294967295L)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16).onNavigationEvent(), 0.0f, 0.0f, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(600.0f))) & 4294967295L) | (Float.floatToRawIntBits(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(500.0f))) << 32)), false, false, 0.0f, 344, null), r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f))));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback());
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(50);
            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallback = iAuthTabCallback.onExtraCallback();
            long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback2 = createCameraCaptureCallback.Companion;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Gradient Ex", quirksExternalSyntheticBackport0OnWarmupCompleted4, null, Long.valueOf(jLongValue2), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallback, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24582, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = onNavigationEvent(onNavigationEvent(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f))) & 4294967295L) | (Float.floatToRawIntBits(-((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f))) << 32)), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16).onNavigationEvent(), 0.0f, 0.0f, 0L, false, false, 0.78f, UCPApiConstants.ARAM_TIME_OUT, null), new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), pairArr2, 0.0f, 0.0f, 1.3f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1794480, 64);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                int i17 = IAuthTabCallback + 83;
                onExtraCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Gradient Ex", highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(50)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback2.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.onExtraCallback(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24582, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsRadialGradientKt$.ExternalSyntheticLambda1(i));
        }
    }

    private static final Unit IAuthTabCallback(setOrientationDegrees setorientationdegrees) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            unit = Unit.INSTANCE;
            int i3 = 63 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, final long j2, final long j3, float f, float f2, long j4, boolean z, boolean z2, float f3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f4;
        int i16;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jIAuthTabCallback;
        final float f5;
        float f6;
        long jIAuthTabCallback2;
        boolean z3;
        boolean z4;
        float f7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i17;
        int i18 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1653674236);
        int i19 = i2 & 1;
        if (i19 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i20 = onExtraCallback + 35;
                IAuthTabCallback = i20 % 128;
                i4 = i20 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i21 = i2 & 2;
        if (i21 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                    int i22 = IAuthTabCallback + 15;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i3 |= i5;
            }
            if ((i & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                    int i24 = onExtraCallback + 91;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i3 |= i17;
            }
            if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 2048 : 1024;
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 16384 : 8192;
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                    i3 |= 196608;
                    int i26 = IAuthTabCallback + 83;
                    onExtraCallback = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 3 / 3;
                    }
                } else if ((i & 196608) == 0) {
                    if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2))) {
                        int i28 = onExtraCallback + 35;
                        IAuthTabCallback = i28 % 128;
                        int i29 = i28 % 2;
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4)) {
                        int i30 = onExtraCallback + 63;
                        IAuthTabCallback = i30 % 128;
                        int i31 = i30 % 2;
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= 12582912;
                } else {
                    if ((12582912 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                            int i32 = IAuthTabCallback + 67;
                            onExtraCallback = i32 % 128;
                            int i33 = i32 % 2;
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i13 = i12 | i3;
                    }
                    i14 = i2 & 256;
                    if (i14 == 0) {
                        i13 |= 100663296;
                    } else {
                        if ((100663296 & i) == 0) {
                            i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 67108864 : 33554432;
                        }
                        i15 = i2 & 512;
                        if (i15 == 0) {
                            if ((i & 805306368) == 0) {
                                f4 = f3;
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f4)) {
                                    int i34 = IAuthTabCallback + 113;
                                    onExtraCallback = i34 % 128;
                                    if (i34 % 2 != 0) {
                                        throw null;
                                    }
                                    i16 = 536870912;
                                } else {
                                    i16 = 268435456;
                                }
                                i13 |= i16;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                jIAuthTabCallback = j;
                                f5 = f;
                                f6 = f2;
                                jIAuthTabCallback2 = j4;
                                z3 = z;
                                z4 = z2;
                                f7 = f4;
                            } else {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                jIAuthTabCallback = i21 != 0 ? setUseCaseAttached.Companion.IAuthTabCallback() : j;
                                float f8 = 0.5f;
                                float f9 = i6 != 0 ? 0.5f : f;
                                f6 = i7 != 0 ? 0.5f : f2;
                                jIAuthTabCallback2 = i9 != 0 ? setUseCaseDetached.Companion.IAuthTabCallback() : j4;
                                boolean z5 = i11 != 0 ? true : z;
                                boolean z6 = i14 != 0 ? false : z2;
                                if (i15 != 0) {
                                    int i35 = onExtraCallback + 25;
                                    IAuthTabCallback = i35 % 128;
                                    if (i35 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    f8 = f4;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1653674236, i13, -1, "im.toss.compose.widget.GradientCanvas (TdsRadialGradient.kt:274)");
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport03, jIAuthTabCallback, j2, j3, f9, f6, jIAuthTabCallback2, z5, z6, f8);
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new Function1() { // from class: im.toss.compose.widget.TdsRadialGradientKt$$ExternalSyntheticLambda3
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj) {
                                            int i36 = 2 % 2;
                                            int i37 = onWarmupCompleted + 69;
                                            onExtraCallbackWithResult = i37 % 128;
                                            int i38 = i37 % 2;
                                            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                                            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                                            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                                            Unit unit = (Unit) setImageAssetsFolder.onWarmupCompleted(-2140709493, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{(setOrientationDegrees) obj}, iOnWarmupCompleted2, 2140709495, iOnWarmupCompleted3, iOnWarmupCompleted);
                                            int i39 = onWarmupCompleted + 11;
                                            onExtraCallbackWithResult = i39 % 128;
                                            int i40 = i39 % 2;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                z4 = z6;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                f7 = f8;
                                f5 = f9;
                                z3 = z5;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final long j5 = jIAuthTabCallback;
                                final float f10 = f6;
                                final long j6 = jIAuthTabCallback2;
                                final boolean z7 = z3;
                                final boolean z8 = z4;
                                final float f11 = f7;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.TdsRadialGradientKt$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i36 = 2 % 2;
                                        int i37 = IAuthTabCallback + 35;
                                        onWarmupCompleted = i37 % 128;
                                        int i38 = i37 % 2;
                                        Unit unitOnExtraCallback = setImageAssetsFolder.onExtraCallback(quirksExternalSyntheticBackport02, j5, j2, j3, f5, f10, j6, z7, z8, f11, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i39 = IAuthTabCallback + 7;
                                        onWarmupCompleted = i39 % 128;
                                        int i40 = i39 % 2;
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i36 = onExtraCallback + 49;
                        IAuthTabCallback = i36 % 128;
                        int i37 = i36 % 2;
                        i13 |= 805306368;
                        f4 = f3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i15 = i2 & 512;
                    if (i15 == 0) {
                    }
                    f4 = f3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i13 = i3;
                i14 = i2 & 256;
                if (i14 == 0) {
                }
                i15 = i2 & 512;
                if (i15 == 0) {
                }
                f4 = f3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i9 = i2 & 64;
            if (i9 != 0) {
            }
            i11 = i2 & 128;
            if (i11 != 0) {
            }
            i13 = i3;
            i14 = i2 & 256;
            if (i14 == 0) {
            }
            i15 = i2 & 512;
            if (i15 == 0) {
            }
            f4 = f3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i9 = i2 & 64;
        if (i9 != 0) {
        }
        i11 = i2 & 128;
        if (i11 != 0) {
        }
        i13 = i3;
        i14 = i2 & 256;
        if (i14 == 0) {
        }
        i15 = i2 & 512;
        if (i15 == 0) {
        }
        f4 = f3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i13) == 306783378, i13 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, long j3, float f, float f2, long j4, boolean z, boolean z2, float f3, int i, Object obj) {
        float f4;
        long jIAuthTabCallback;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        long jIAuthTabCallback2 = (i & 1) != 0 ? setUseCaseAttached.Companion.IAuthTabCallback() : j;
        float f5 = (i & 8) != 0 ? 0.5f : f;
        if ((i & 16) != 0) {
            int i3 = IAuthTabCallback + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f4 = 0.5f;
        } else {
            f4 = f2;
        }
        if ((i & 32) != 0) {
            int i5 = onExtraCallback + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            jIAuthTabCallback = setUseCaseDetached.Companion.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j4;
        }
        if ((i & 64) != 0) {
            int i7 = IAuthTabCallback + 83;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 128) != 0) {
            int i9 = onExtraCallback + 105;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        return onWarmupCompleted(quirksExternalSyntheticBackport0, jIAuthTabCallback2, j2, j3, f5, f4, jIAuthTabCallback, z3, z4, (i & 256) != 0 ? 0.5f : f3);
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, final long j2, final long j3, final float f, final float f2, final long j4, boolean z, final boolean z2, final float f3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        if (z) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport02);
                int i5 = 39 / 0;
            } else {
                quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport02);
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnExtraCallback;
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02).onExtraCallback(SessionProcessorSurface.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.compose.widget.TdsRadialGradientKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 105;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    long j5 = j4;
                    float f4 = f3;
                    long j6 = j;
                    float f5 = f;
                    float f6 = f2;
                    long j7 = j2;
                    long j8 = j3;
                    boolean z3 = z2;
                    Long lValueOf = Long.valueOf(j5);
                    Float fValueOf = Float.valueOf(f4);
                    Long lValueOf2 = Long.valueOf(j6);
                    Float fValueOf2 = Float.valueOf(f5);
                    Float fValueOf3 = Float.valueOf(f6);
                    Long lValueOf3 = Long.valueOf(j7);
                    Long lValueOf4 = Long.valueOf(j8);
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    return (Unit) setImageAssetsFolder.onWarmupCompleted(-1243312464, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{lValueOf, fValueOf, lValueOf2, fValueOf2, fValueOf3, lValueOf3, lValueOf4, boolValueOf, (setOrientationDegrees) obj}, iOnWarmupCompleted2, 1243312464, iOnWarmupCompleted3, iOnWarmupCompleted);
                }
                long j9 = j4;
                float f7 = f3;
                long j10 = j;
                float f8 = f;
                float f9 = f2;
                long j11 = j2;
                long j12 = j3;
                boolean z4 = z2;
                Long lValueOf5 = Long.valueOf(j9);
                Float fValueOf4 = Float.valueOf(f7);
                Long lValueOf6 = Long.valueOf(j10);
                Float fValueOf5 = Float.valueOf(f8);
                Float fValueOf6 = Float.valueOf(f9);
                Long lValueOf7 = Long.valueOf(j11);
                Long lValueOf8 = Long.valueOf(j12);
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted5 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted6 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
        }));
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean z2 = true;
        long jLongValue = ((Number) objArr[1]).longValue();
        Pair[] pairArr = (Pair[]) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        long jLongValue2 = ((Number) objArr[5]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        float fFloatValue3 = ((Number) objArr[8]).floatValue();
        int iIntValue = ((Number) objArr[9]).intValue();
        Object obj = objArr[10];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            int i2 = onExtraCallback + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                jLongValue = setUseCaseAttached.Companion.IAuthTabCallback();
                int i3 = 69 / 0;
            } else {
                jLongValue = setUseCaseAttached.Companion.IAuthTabCallback();
            }
        }
        if ((iIntValue & 4) != 0) {
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            fFloatValue = 0.5f;
        }
        if ((iIntValue & 8) != 0) {
            fFloatValue2 = 0.5f;
        }
        if ((iIntValue & 16) != 0) {
            jLongValue2 = setUseCaseDetached.Companion.IAuthTabCallback();
        }
        if ((iIntValue & 32) != 0) {
            int i6 = onExtraCallback + 37;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z2 = zBooleanValue;
        }
        if ((iIntValue & 64) != 0) {
            int i8 = IAuthTabCallback + 111;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        } else {
            z = zBooleanValue2;
        }
        return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, jLongValue, (Pair<Float, setByteOrder>[]) pairArr, fFloatValue, fFloatValue2, jLongValue2, z2, z, (iIntValue & 128) != 0 ? 0.5f : fFloatValue3);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, @NotNull final Pair<Float, setByteOrder>[] pairArr, final float f, final float f2, final long j2, boolean z, final boolean z2, final float f3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
        if (z) {
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback).onExtraCallback(SessionProcessorSurface.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.compose.widget.TdsRadialGradientKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                long j3 = j2;
                float f4 = f3;
                long j4 = j;
                float f5 = f;
                float f6 = f2;
                Pair[] pairArr2 = pairArr;
                boolean z3 = z2;
                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) obj2;
                if (i5 != 0) {
                    setImageAssetsFolder.onWarmupCompleted(j3, f4, j4, f5, f6, pairArr2, z3, setorientationdegrees);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = setImageAssetsFolder.onWarmupCompleted(j3, f4, j4, f5, f6, pairArr2, z3, setorientationdegrees);
                int i6 = onExtraCallbackWithResult + 51;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        }));
        int i3 = IAuthTabCallback + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    private static final Unit onExtraCallbackWithResult(long j, float f, long j2, float f2, float f3, long j3, long j4, boolean z, setOrientationDegrees setorientationdegrees) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        long jOnExtraCallback = !setUseCaseDetached.onExtraCallback(j, setUseCaseDetached.Companion.IAuthTabCallback()) ? j : setUseCaseDetached.onExtraCallback(setorientationdegrees.onTransact(), 2.0f * f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j2);
        setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(fIntBitsToFloat, fIntBitsToFloat2);
        int i6 = (int) (jOnExtraCallback >> 32);
        try {
            int i7 = (int) jOnExtraCallback;
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat(i6) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i7) * f3) & 4294967295L));
            float fMax = Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
            float fIntBitsToFloat3 = Float.intBitsToFloat(i6) / fMax;
            float fIntBitsToFloat4 = Float.intBitsToFloat(i7) / fMax;
            float f4 = fMax * f;
            readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j3), setByteOrder.onNavigationEvent(j4)}), jIAuthTabCallback, f4, 0, 8, (Object) null);
            if (z) {
                int i8 = onExtraCallback + 13;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    setOrientationDegrees.onExtraCallback(setorientationdegrees, readfullyOnWarmupCompleted, 0L, jOnExtraCallback, 1.0f, (hasMoreElements) null, (seek) null, 0, 63, (Object) null);
                } else {
                    setOrientationDegrees.onExtraCallback(setorientationdegrees, readfullyOnWarmupCompleted, 0L, jOnExtraCallback, 0.0f, (hasMoreElements) null, (seek) null, 0, 122, (Object) null);
                }
                i = IAuthTabCallback + 119;
                i2 = i % 128;
            } else {
                setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
                long jOnExtraCallback2 = setflashstateOnExtraCallback.onExtraCallback();
                setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
                try {
                    setflashstateOnExtraCallback.onTransact().onExtraCallback(fIntBitsToFloat3, fIntBitsToFloat4, jIAuthTabCallback);
                    setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readfullyOnWarmupCompleted, f4, jIAuthTabCallback, 0.0f, (hasMoreElements) null, (seek) null, 0, UCPApiConstants.ARAM_TIME_OUT, (Object) null);
                    i = IAuthTabCallback + 65;
                    i2 = i % 128;
                } finally {
                    setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                    setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback2);
                }
            }
            onExtraCallback = i2;
            int i9 = i % 2;
            setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(-fIntBitsToFloat, -fIntBitsToFloat2);
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallback + 35;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(-fIntBitsToFloat, -fIntBitsToFloat2);
            throw th;
        }
    }

    private static final Unit onExtraCallback(long j, float f, long j2, float f2, float f3, Pair[] pairArr, boolean z, setOrientationDegrees setorientationdegrees) throws Throwable {
        long jOnExtraCallback;
        float f4;
        long j3;
        float f5 = 2.8E-45f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        if (setUseCaseDetached.onExtraCallback(j, setUseCaseDetached.Companion.IAuthTabCallback())) {
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jOnExtraCallback = setUseCaseDetached.onExtraCallback(setorientationdegrees.onTransact(), 2.0f * f);
        } else {
            jOnExtraCallback = j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j2);
        setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(fIntBitsToFloat, fIntBitsToFloat2);
        int i4 = (int) (jOnExtraCallback >> 32);
        try {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i4);
            int i5 = (int) jOnExtraCallback;
            float fIntBitsToFloat4 = Float.intBitsToFloat(i5);
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat3 * f2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4 * f3) & 4294967295L));
            float fMax = Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
            float fIntBitsToFloat5 = Float.intBitsToFloat(i4) / fMax;
            float fIntBitsToFloat6 = Float.intBitsToFloat(i5) / fMax;
            float f6 = fMax * f;
            readFully readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(readFully.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), jIAuthTabCallback, f6, 0, 8, (Object) null);
            try {
                if (z) {
                    int i6 = onExtraCallback + 109;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    f4 = fIntBitsToFloat;
                    setOrientationDegrees.onExtraCallback(setorientationdegrees, readfullyOnExtraCallback, 0L, jOnExtraCallback, 0.0f, (hasMoreElements) null, (seek) null, 0, 122, (Object) null);
                } else {
                    f4 = fIntBitsToFloat;
                    setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
                    long jOnExtraCallback2 = setflashstateOnExtraCallback.onExtraCallback();
                    setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
                    try {
                        setflashstateOnExtraCallback.onTransact().onExtraCallback(fIntBitsToFloat5, fIntBitsToFloat6, jIAuthTabCallback);
                        try {
                            setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readfullyOnExtraCallback, f6, jIAuthTabCallback, 0.0f, (hasMoreElements) null, (seek) null, 0, UCPApiConstants.ARAM_TIME_OUT, (Object) null);
                            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback2);
                        } catch (Throwable th) {
                            th = th;
                            j3 = jOnExtraCallback2;
                            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
                            setflashstateOnExtraCallback.onExtraCallbackWithResult(j3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j3 = jOnExtraCallback2;
                    }
                }
                setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(-f4, -fIntBitsToFloat2);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                setorientationdegrees.onExtraCallback().onTransact().onWarmupCompleted(-f5, -fIntBitsToFloat2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            f5 = fIntBitsToFloat;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j, float f, long j2, float f2, float f3, long j3, long j4, boolean z, setOrientationDegrees setorientationdegrees) {
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f), Long.valueOf(j2), Float.valueOf(f2), Float.valueOf(f3), Long.valueOf(j3), Long.valueOf(j4), Boolean.valueOf(z), setorientationdegrees};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-1243312464, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1243312464, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOrientationDegrees setorientationdegrees) {
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(-2140709493, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{setorientationdegrees}, iOnWarmupCompleted2, 2140709495, iOnWarmupCompleted3, iOnWarmupCompleted);
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, long j3, float f, float f2, long j4, boolean z, boolean z2, float f3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j4), Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(1375990382, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1375990379, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final removeObserverLocked onWarmupCompleted(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Pair[] pairArr, float f2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {Float.valueOf(f), r8lambdanm9dm2eewl4vrptnjmesfjqky4, pairArr, Float.valueOf(f2), sessionProcessorCaptureCallback};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (removeObserverLocked) onWarmupCompleted(128901797, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -128901793, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Pair[] pairArr, float f, float f2, long j2, boolean z, boolean z2, float f3, int i, Object obj) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Long.valueOf(j), pairArr, Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j2), Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f3), Integer.valueOf(i), obj};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (QuirksExternalSyntheticBackport0) onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }
}
