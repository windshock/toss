package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.createByte;
import o.hasMatte;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class hasMatte {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, i, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, i, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        int i8 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        int i9 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, long j, long j2, float f2, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(f, j, j2, f2, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        int i5 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        } else {
            onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), i4);
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 58 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final int i, int i2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i7;
        int i8;
        int i9;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        long jOnRelationshipValidationResult;
        int i10;
        int i11 = 2 % 2;
        int i12 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i12 % 128;
        if (i12 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-979812598);
            i5 = 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-979812598);
            i5 = i4 & 1;
            if (i5 != 0) {
                int i13 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i6 = i3 | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
            if ((i3 & 48) == 0) {
                int i15 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
            }
            i7 = i4 & 4;
            if (i7 != 0) {
                if ((i3 & 384) == 0) {
                    i8 = i2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i8)) {
                        int i17 = IAuthTabCallback + 25;
                        onExtraCallbackWithResult = i17 % 128;
                        i9 = i17 % 2 != 0 ? 17030 : 256;
                    } else {
                        i9 = 128;
                    }
                    i6 |= i9;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    if (i7 != 0) {
                        i8 = 100;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-979812598, i6, -1, "im.toss.compose.v0.HorizontalProgressBar (HorizontalProgressBar.kt:19)");
                    }
                    if (i8 <= 0) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            final int i18 = i8;
                            function2 = new Function2() { // from class: im.toss.compose.v0.HorizontalProgressBarKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i19 = 2 % 2;
                                    int i20 = onWarmupCompleted + 39;
                                    onExtraCallback = i20 % 128;
                                    int i21 = i20 % 2;
                                    Unit unitIAuthTabCallback = hasMatte.IAuthTabCallback(quirksExternalSyntheticBackport05, i, i18, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i22 = onWarmupCompleted + 85;
                                    onExtraCallback = i22 % 128;
                                    int i23 = i22 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                            return;
                        }
                        return;
                    }
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport04);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i19 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                    float fCoerceAtMost = RangesKt.coerceAtMost(i, i8) / i8;
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-783470677);
                        jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                    } else {
                        int i20 = onExtraCallbackWithResult + 61;
                        IAuthTabCallback = i20 % 128;
                        if (i20 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-783471637);
                            jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100).onRelationshipValidationResult();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-783471637);
                            jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                        }
                    }
                    long j = jOnRelationshipValidationResult;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, fCoerceAtMost, jLongValue, j, 0.0f, 8, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                final int i21 = i8;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.compose.v0.HorizontalProgressBarKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = 2 % 2;
                            int i23 = onExtraCallback + 11;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitOnNavigationEvent = hasMatte.onNavigationEvent(quirksExternalSyntheticBackport03, i, i21, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i25 = onNavigationEvent + 41;
                            onExtraCallback = i25 % 128;
                            int i26 = i25 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                return;
            }
            int i22 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i22 % 128;
            i6 = i22 % 2 == 0 ? i6 | 1792 : i6 | 384;
            i8 = i2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
            }
            final int i212 = i8;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i3 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i23 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i23 % 128;
                i10 = i23 % 2 != 0 ? 3 : 4;
            } else {
                i10 = 2;
            }
            i6 = i10 | i3;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
        }
        i7 = i4 & 4;
        if (i7 != 0) {
        }
        i8 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
        }
        final int i2122 = i8;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, long j, long j2, float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 45;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
        }
        return onExtraCallback(quirksExternalSyntheticBackport0, f, j, j2, f2);
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, final long j, final long j2, final float f2) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.compose.v0.HorizontalProgressBarKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = hasMatte.onWarmupCompleted(f2, j2, j, f, (setOrientationDegrees) obj);
                int i5 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(float f, long j, long j2, float f2, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIAuthTabCallback = setorientationdegrees.IAuthTabCallback() * f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - (fIAuthTabCallback / 2.0f);
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        long jIAuthTabCallback2 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        createByte.onExtraCallback onextracallback = createByte.Companion;
        setOrientationDegrees.onExtraCallback(setorientationdegrees, j, jIAuthTabCallback, jIAuthTabCallback2, fIAuthTabCallback, onextracallback.onExtraCallbackWithResult(), (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 480, (Object) null);
        setOrientationDegrees.onExtraCallback(setorientationdegrees, j2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) * f2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), fIAuthTabCallback, onextracallback.onExtraCallbackWithResult(), (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 480, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
