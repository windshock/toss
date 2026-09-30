package o;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.QuirksExternalSyntheticBackport0;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.readFully;
import o.setOrientationDegrees;
import o.x4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4ExternalSyntheticLambda2 {
    public static final x4ExternalSyntheticLambda2 IAuthTabCallback = new x4ExternalSyntheticLambda2();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 85;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(toMetersPerSecond tometerspersecond, long j, long j2, long j3, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnWarmupCompleted = onWarmupCompleted(tometerspersecond, j, j2, j3, f, sessionProcessorCaptureCallback);
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, long j, long j2, long j3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {x4externalsyntheticlambda2, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            onNavigationEvent(-667994130, 667994130, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        } else {
            Object[] objArr2 = {x4externalsyntheticlambda2, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onNavigationEvent(-667994130, 667994130, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, long j, long j2, long j3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x4externalsyntheticlambda2, quirksExternalSyntheticBackport0, f, f2, j, j2, j3, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 61;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, toMetersPerSecond tometerspersecond, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {x4externalsyntheticlambda2, quirksExternalSyntheticBackport0, Float.valueOf(f), tometerspersecond, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onNavigationEvent(1709985335, -1709985332, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 35;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jOnExtraCallbackWithResult;
        toMetersPerSecond tometerspersecondOnExtraCallbackWithResult;
        int i12 = ~i;
        int i13 = ~i2;
        int i14 = ~(i12 | i13);
        int i15 = ~i4;
        int i16 = i14 | (~(i13 | i15));
        int i17 = ~(i4 | i | i2);
        int i18 = i16 | i17;
        int i19 = i15 | i;
        int i20 = i + i2 + i3 + (112060874 * i5) + ((-1891258303) * i6);
        int i21 = i20 * i20;
        int i22 = ((i * (-1669307009)) - 1771304782) + (i2 * (-1669307009)) + (i18 * 564) + (i17 * (-1128)) + (i19 * 564) + ((-1669306445) * i3) + ((-1582645698) * i5) + ((-198941581) * i6) + (i21 * (-203030528));
        int i23 = (i * 1286644997) + 1783103488 + (1286644997 * i2) + (i18 * (-1821943044)) + ((-651081208) * i17) + ((-1821943044) * i19) + ((-535298048) * i3) + ((-1427111936) * i5) + (1712848896 * i6) + (159514624 * i21) + (i22 * i22 * (-2008154112));
        if (i23 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i23 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i23 != 3) {
            return IAuthTabCallback(objArr);
        }
        final x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = (x4ExternalSyntheticLambda2) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        final int iIntValue = ((Number) objArr[6]).intValue();
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        int i24 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(922195941);
        int i25 = iIntValue2 & 1;
        if (i25 != 0) {
            i7 = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2) | iIntValue;
        } else {
            i7 = iIntValue;
        }
        int i26 = iIntValue2 & 2;
        if (i26 != 0) {
            i7 |= 48;
        } else {
            if ((iIntValue & 48) == 0) {
                int i27 = onWarmupCompleted + 5;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                i8 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 32 : 16) | i7;
            }
            i9 = iIntValue2 & 4;
            if (i9 == 0) {
                int i29 = onWarmupCompleted + 107;
                onNavigationEvent = i29 % 128;
                i8 = i29 % 2 == 0 ? i8 | 13871 : i8 | 384;
            } else if ((iIntValue & 384) == 0) {
                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond) ? 256 : 128;
            }
            i10 = iIntValue2 & 8;
            if (i10 != 0) {
                if ((iIntValue & 3072) == 0) {
                    i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 2048 : 1024) | i8;
                    int i30 = onNavigationEvent + 85;
                    onWarmupCompleted = i30 % 128;
                    int i31 = i30 % 2;
                }
                if ((i11 & 1171) != 1170) {
                    int i32 = onWarmupCompleted + 19;
                    onNavigationEvent = i32 % 128;
                    int i33 = i32 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
                    int i34 = onNavigationEvent + 23;
                    int i35 = i34 % 128;
                    onWarmupCompleted = i35;
                    int i36 = i34 % 2;
                    if (i25 != 0) {
                        int i37 = i35 + 125;
                        onNavigationEvent = i37 % 128;
                        int i38 = i37 % 2;
                        onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (i26 != 0) {
                        fFloatValue = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                    }
                    if (i9 != 0) {
                        tometerspersecond = null;
                    }
                    if (i10 != 0) {
                        jLongValue = setByteOrder.Companion.onTransact();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(922195941, i11, -1, "im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset.Underline (IndicatorPreset.kt:65)");
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), !Float.isNaN(fFloatValue) ? fFloatValue : r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1467048020);
                    if (jLongValue != 16) {
                        int i39 = onWarmupCompleted + 99;
                        onNavigationEvent = i39 % 128;
                        int i40 = i39 % 2;
                        onextracallback = onextracallback2;
                        jOnExtraCallbackWithResult = jLongValue;
                    } else {
                        onextracallback = onextracallback2;
                        jOnExtraCallbackWithResult = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (tometerspersecond == null) {
                        int i41 = onWarmupCompleted + 39;
                        onNavigationEvent = i41 % 128;
                        int i42 = i41 % 2;
                        tometerspersecondOnExtraCallbackWithResult = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onExtraCallbackWithResult();
                    } else {
                        tometerspersecondOnExtraCallbackWithResult = tometerspersecond;
                    }
                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, jOnExtraCallbackWithResult, tometerspersecondOnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    onextracallback = onextracallback2;
                }
                final long j = jLongValue;
                final toMetersPerSecond tometerspersecond2 = tometerspersecond;
                final float f = fFloatValue;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return null;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i43 = 2 % 2;
                        int i44 = onNavigationEvent + 21;
                        onWarmupCompleted = i44 % 128;
                        int i45 = i44 % 2;
                        Unit unitOnNavigationEvent = x4ExternalSyntheticLambda2.onNavigationEvent(this.f$0, onextracallback, f, tometerspersecond2, j, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i46 = onWarmupCompleted + 87;
                        onNavigationEvent = i46 % 128;
                        if (i46 % 2 != 0) {
                            int i47 = 67 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                });
                return null;
            }
            int i43 = onWarmupCompleted + 33;
            onNavigationEvent = i43 % 128;
            int i44 = i43 % 2;
            i8 |= 3072;
            i11 = i8;
            if ((i11 & 1171) != 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
            }
            final long j2 = jLongValue;
            final toMetersPerSecond tometerspersecond22 = tometerspersecond;
            final float f2 = fFloatValue;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i8 = i7;
        i9 = iIntValue2 & 4;
        if (i9 == 0) {
        }
        i10 = iIntValue2 & 8;
        if (i10 != 0) {
        }
        i11 = i8;
        if ((i11 & 1171) != 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
        }
        final long j22 = jLongValue;
        final toMetersPerSecond tometerspersecond222 = tometerspersecond;
        final float f22 = fFloatValue;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(removeTimestamp removetimestamp, long j, long j2, float f, readFully readfully, float f2, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(-1454749470, 1454749472, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{removetimestamp, Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f), readfully, Float.valueOf(f2), setorientationdegrees}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(x4ExternalSyntheticLambda2 x4externalsyntheticlambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, toMetersPerSecond tometerspersecond, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(x4externalsyntheticlambda2, quirksExternalSyntheticBackport0, f, tometerspersecond, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 33;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i3 = onNavigationEvent + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return extensionsInfoExternalSyntheticLambda0OnExtraCallbackWithResult;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader quirkSettingsLoader, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, quirkSettingsLoader, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, quirkSettingsLoader, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private x4ExternalSyntheticLambda2() {
    }

    public static final class onWarmupCompleted extends Lambda implements Function1<createBitmapFromImageProxy, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE $currentItemPosition$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me) {
            super(1);
            this.$currentItemPosition$inlined = r8lambdaeefvmne8k6v5fl9rzzhexzkg1me;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((createBitmapFromImageProxy) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 69 / 0;
            }
            int i5 = onExtraCallbackWithResult + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 44 / 0;
            }
            return unit;
        }

        public final void onExtraCallbackWithResult(createBitmapFromImageProxy createbitmapfromimageproxy) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                createbitmapfromimageproxy.onNavigationEvent("tabFocusBoxOffset");
                createbitmapfromimageproxy.onNavigationEvent(this.$currentItemPosition$inlined);
                int i3 = 68 / 0;
            } else {
                createbitmapfromimageproxy.onNavigationEvent("tabFocusBoxOffset");
                createbitmapfromimageproxy.onNavigationEvent(this.$currentItemPosition$inlined);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        float f;
        int i7;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long jLongValue;
        final x4ExternalSyntheticLambda2 x4externalsyntheticlambda2 = (x4ExternalSyntheticLambda2) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        final long jLongValue3 = ((Number) objArr[5]).longValue();
        long jLongValue4 = ((Number) objArr[6]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(192765647);
        int i9 = iIntValue2 & 1;
        if (i9 != 0) {
            int i10 = onWarmupCompleted + 49;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                int i12 = onWarmupCompleted + 37;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue2) ? 256 : 128;
        }
        int i14 = iIntValue2 & 8;
        if (i14 == 0) {
            if ((iIntValue & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2)) {
                    int i15 = onWarmupCompleted + 29;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                    onNavigationEvent = i15 % 128;
                    i3 = i15 % 2 == 0 ? 32509 : 2048;
                } else {
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                    i3 = 1024;
                }
                i |= i3;
            }
            i4 = iIntValue2 & 16;
            if (i4 != 0) {
                if ((iIntValue & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue3)) {
                        int i16 = onWarmupCompleted + 121;
                        j = jLongValue2;
                        onNavigationEvent = i16 % 128;
                        i5 = i16 % 2 == 0 ? 114 : 16384;
                    } else {
                        j = jLongValue2;
                        i5 = 8192;
                    }
                    i |= i5;
                }
                i6 = iIntValue2 & 32;
                if (i6 != 0) {
                    i |= 196608;
                    int i17 = onWarmupCompleted + 85;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                } else if ((196608 & iIntValue) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue4) ? 131072 : 65536;
                }
                if ((1572864 & iIntValue) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x4externalsyntheticlambda2) ? 1048576 : 524288;
                }
                if ((599187 & i) != 599186) {
                    int i19 = onWarmupCompleted + 99;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
                    int i21 = onWarmupCompleted + 3;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    long jOnTransact = i14 != 0 ? setByteOrder.Companion.onTransact() : j;
                    if (i4 != 0) {
                        jLongValue3 = setByteOrder.Companion.onTransact();
                    }
                    long j3 = jLongValue3;
                    if (i6 != 0) {
                        int i23 = onWarmupCompleted + 23;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 == 0) {
                            setByteOrder.Companion.onTransact();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        jLongValue4 = setByteOrder.Companion.onTransact();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(192765647, i, -1, "im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset.Square (IndicatorPreset.kt:85)");
                    }
                    RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(fFloatValue);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getAdaptiveAdViewWidth.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, fFloatValue2, 1, (Object) null), 0.0f, 1, (Object) null), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, false, 2, null);
                    r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = addAdapter.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(), null, 4, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(564219272);
                    long jOnNavigationEvent = j3 != 16 ? j3 : r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    long jOnTransact2 = setByteOrder.Companion.onTransact();
                    float f2 = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? 0.4f : 0.55f;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(564227043);
                    if (jOnTransact != 16) {
                        int i24 = onNavigationEvent + 67;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        jLongValue = jOnTransact;
                    } else {
                        jLongValue = ((Long) r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onExtraCallback(new Object[]{r8lambdawgmlot4gzpqjk3abw8ehrhrqxu, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, matches.onExtraCallback(), -375657294, matches.onExtraCallback(), matches.onExtraCallback(), 375657294, matches.onExtraCallback())).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    obj = null;
                    i7 = iIntValue;
                    f = fFloatValue2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = (QuirksExternalSyntheticBackport0) onNavigationEvent(-324824949, 324824950, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{x4externalsyntheticlambda2, quirksExternalSyntheticBackport0OnExtraCallback, roundedCornerShapeOnNavigationEvent, Long.valueOf(jOnNavigationEvent), Long.valueOf(jOnTransact2), Float.valueOf(f2), Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i & 3670016) | 3072)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    float fOnNavigationEvent = AppLovinAdLoadListener.onExtraCallbackWithResult.onNavigationEvent();
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(564233222);
                    long jIAuthTabCallback = jLongValue4 != 16 ? jLongValue4 : r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport05, fOnNavigationEvent, jIAuthTabCallback, roundedCornerShapeOnNavigationEvent), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    j2 = jOnTransact;
                    jLongValue3 = j3;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    f = fFloatValue2;
                    i7 = iIntValue;
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    j2 = j;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport02;
                    final float f3 = f;
                    final long j4 = jLongValue4;
                    final int i26 = i7;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i27 = 2 % 2;
                            int i28 = onNavigationEvent + 49;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda2.onExtraCallbackWithResult(this.f$0, quirksExternalSyntheticBackport06, fFloatValue, f3, j2, jLongValue3, j4, i26, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i30 = onExtraCallbackWithResult + 23;
                            onNavigationEvent = i30 % 128;
                            if (i30 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    });
                }
                return obj;
            }
            i |= 24576;
            j = jLongValue2;
            i6 = iIntValue2 & 32;
            if (i6 != 0) {
            }
            if ((1572864 & iIntValue) == 0) {
            }
            if ((599187 & i) != 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return obj;
        }
        i |= 3072;
        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
        i4 = iIntValue2 & 16;
        if (i4 != 0) {
        }
        j = jLongValue2;
        i6 = iIntValue2 & 32;
        if (i6 != 0) {
        }
        if ((1572864 & iIntValue) == 0) {
        }
        if ((599187 & i) != 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, "");
            return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader.Companion.onNavigationEvent());
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, "");
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader.Companion.onNavigationEvent());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, "");
            return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader.Companion.asInterface());
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, "");
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader.Companion.asInterface());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, @NotNull final QuirkSettingsLoader quirkSettingsLoader) {
        Function1 function1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, "");
        Intrinsics.checkNotNullParameter(quirkSettingsLoader, "");
        if (ArrayRingBuffer.onExtraCallbackWithResult()) {
            function1OnWarmupCompleted = new onWarmupCompleted(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me);
        } else {
            function1OnWarmupCompleted = ArrayRingBuffer.onWarmupCompleted();
            int i4 = onNavigationEvent + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return resolveQuirkNames.onWarmupCompleted(quirksExternalSyntheticBackport0, function1OnWarmupCompleted, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 51;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = x4ExternalSyntheticLambda2.onWarmupCompleted(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, quirkSettingsLoader, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i9 = onWarmupCompleted + 77;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return quirksExternalSyntheticBackport0OnWarmupCompleted;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallback(r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me, QuirkSettingsLoader quirkSettingsLoader, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1071341390);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1071341390, i, -1, "im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset.tabIndicatorOffset.<anonymous> (IndicatorPreset.kt:128)");
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = isSubmitButtonEnabled.onExtraCallbackWithResult(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onExtraCallbackWithResult(), getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null), "currentItemWidth", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2 = isSubmitButtonEnabled.onExtraCallbackWithResult(r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onWarmupCompleted(), getSplitTrack.onExtraCallback((getStarRatingContentViewGroup) r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onExtraCallback(new Object[]{r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted}, matches.onExtraCallback(), 1918711918, matches.onExtraCallback(), matches.onExtraCallback(), -1918711917, matches.onExtraCallback()), 0, 2, (Object) null), "activeLineOffset", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 432, 8);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), quirkSettingsLoader, false, 2, (Object) null);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i5 = onWarmupCompleted + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset$$ExternalSyntheticLambda3
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 33;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2;
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj;
                            if (i9 == 0) {
                                return x4ExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                            }
                            x4ExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(CaptureNoResponseQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized), IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0AsBinder;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x0109: INVOKE (r4v15 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:215)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 ??, still in use, count: 1, list:
          (r0v6 ?? I:java.lang.Object) from 0x0109: INVOKE (r4v15 ?? I:o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 ?? I:java.lang.Object) INTERFACE call: o.CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(java.lang.Object):void (LINE:215)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    private static final removeObserverLocked onWarmupCompleted(toMetersPerSecond tometerspersecond, long j, long j2, final long j3, final float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        long jOnWarmupCompleted = sessionProcessorCaptureCallback.onWarmupCompleted();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jOnWarmupCompleted >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jOnWarmupCompleted);
        rotate rotateVarIAuthTabCallback = tometerspersecond.IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback);
        final removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
        setDescription.onWarmupCompleted(removetimestampOnWarmupCompleted, rotateVarIAuthTabCallback);
        float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f));
        float fOnExtraCallback2 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f));
        float fOnExtraCallback3 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
        float fOnExtraCallback4 = sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f));
        final long jOnWarmupCompleted2 = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits((fIntBitsToFloat + fOnExtraCallback) + fOnExtraCallback3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 + fOnExtraCallback2 + fOnExtraCallback4) & 4294967295L));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits((((fOnExtraCallback3 + fOnExtraCallback) / 2.0f) - fOnExtraCallback) / 2.0f) << 32) | (Float.floatToRawIntBits((((fOnExtraCallback4 + fOnExtraCallback2) / 2.0f) - fOnExtraCallback2) / 2.0f) & 4294967295L));
        final float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) / 2.0f;
        final readFully readfullyOnWarmupCompleted = readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(j2)}), setUseCaseAttached.onNavigationEvent(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(sessionProcessorCaptureCallback.onWarmupCompleted()), jIAuthTabCallback), fMin, 0, 8, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.tab.v1.IndicatorPreset$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 81;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = x4ExternalSyntheticLambda2.onNavigationEvent(removetimestampOnWarmupCompleted, j3, jOnWarmupCompleted2, fMin, readfullyOnWarmupCompleted, f, (setOrientationDegrees) obj);
                int i5 = IAuthTabCallback + 121;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            jOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6)) >> 62;
        } else {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            jOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6)) << 32;
        }
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent(jOnExtraCallbackWithResult));
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        long j;
        setFlashState setflashstate;
        setFlashState setflashstate2;
        long j2;
        removeTimestamp removetimestamp = (removeTimestamp) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        readFully readfully = (readFully) objArr[4];
        float fFloatValue2 = ((Number) objArr[5]).floatValue();
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[6];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        try {
            ExifDataBuilder1.onNavigationEvent(setflashstateOnExtraCallback.onTransact(), removetimestamp, 0, 2, (Object) null);
            setFlashState setflashstateOnExtraCallback2 = setorientationdegrees.onExtraCallback();
            try {
                long jOnExtraCallback2 = setflashstateOnExtraCallback2.onExtraCallback();
                setflashstateOnExtraCallback2.onNavigationEvent().onNavigationEvent();
                try {
                    float f = fFloatValue * 2.0f;
                    ExifDataBuilder1.onExtraCallbackWithResult(setflashstateOnExtraCallback2.onTransact(), Float.intBitsToFloat((int) (jLongValue2 >> 32)) / f, Float.intBitsToFloat((int) jLongValue2) / f, 0L, 4, (Object) null);
                    setflashstate2 = setflashstateOnExtraCallback2;
                    Object obj = null;
                    setflashstate = setflashstateOnExtraCallback;
                    try {
                        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, fFloatValue2, (hasMoreElements) null, (seek) null, 0, 118, (Object) null);
                        try {
                            setflashstate2.onNavigationEvent().IAuthTabCallback();
                            setflashstate2.onExtraCallbackWithResult(jOnExtraCallback2);
                            setOrientationDegrees.onWarmupCompleted(setorientationdegrees, removetimestamp, jLongValue, 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
                            setflashstate.onNavigationEvent().IAuthTabCallback();
                            setflashstate.onExtraCallbackWithResult(jOnExtraCallback);
                            Unit unit = Unit.INSTANCE;
                            int i4 = onWarmupCompleted + 17;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                return unit;
                            }
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            j = jOnExtraCallback;
                            setflashstate.onNavigationEvent().IAuthTabCallback();
                            setflashstate.onExtraCallbackWithResult(j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = jOnExtraCallback;
                        j2 = jOnExtraCallback2;
                        try {
                            setflashstate2.onNavigationEvent().IAuthTabCallback();
                            setflashstate2.onExtraCallbackWithResult(j2);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            setflashstate.onNavigationEvent().IAuthTabCallback();
                            setflashstate.onExtraCallbackWithResult(j);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    setflashstate = setflashstateOnExtraCallback;
                    setflashstate2 = setflashstateOnExtraCallback2;
                    j = jOnExtraCallback;
                    j2 = jOnExtraCallback2;
                }
            } catch (Throwable th5) {
                th = th5;
                setflashstate = setflashstateOnExtraCallback;
                j = jOnExtraCallback;
            }
        } catch (Throwable th6) {
            th = th6;
            j = jOnExtraCallback;
            setflashstate = setflashstateOnExtraCallback;
        }
    }

    private final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, toMetersPerSecond tometerspersecond, long j, long j2, float f, long j3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, tometerspersecond, Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f), Long.valueOf(j3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (QuirksExternalSyntheticBackport0) onNavigationEvent(-324824949, 324824950, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(removeTimestamp removetimestamp, long j, long j2, float f, readFully readfully, float f2, setOrientationDegrees setorientationdegrees) {
        Object[] objArr = {removetimestamp, Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f), readfully, Float.valueOf(f2), setorientationdegrees};
        return (Unit) onNavigationEvent(-1454749470, 1454749472, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, long j, long j2, long j3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(-667994130, 667994130, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable toMetersPerSecond tometerspersecond, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, Float.valueOf(f), tometerspersecond, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(1709985335, -1709985332, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
