package o;

import androidx.compose.runtime.saveable.RememberSaveableKt;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.InternalCameraPresenceListener;
import o.t7ExternalSyntheticLambda0;
import o.t7a;
import o.u2;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t7a {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ u2 IAuthTabCallback(boolean z, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        u2 u2VarOnWarmupCompleted = onWarmupCompleted(z, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z2);
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return u2VarOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InternalCameraPresenceListener internalCameraPresenceListener = (InternalCameraPresenceListener) objArr[0];
        u2 u2Var = (u2) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
            return (Float) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1748059259, iOnNavigationEvent2, iOnNavigationEvent, 1748059260, new Object[]{internalCameraPresenceListener, u2Var}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        }
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent4 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ u2 onExtraCallbackWithResult(findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z, float f2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z, f2);
        }
        onWarmupCompleted(findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z, f2);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i5 | i2 | (~i4);
        int i8 = (~((~i5) | i2)) | (~(i5 | i4));
        int i9 = (~(i4 | (~i2))) | i5;
        int i10 = i5 + i2 + i3 + ((-1069702238) * i) + (1645725337 * i6);
        int i11 = i10 * i10;
        int i12 = ((i5 * 2084108943) - 1824784384) + (2084108943 * i2) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i3) + ((-1977090048) * i) + (448004096 * i6) + (1807155200 * i11);
        int i13 = (i5 * (-999696423)) + 1136243370 + (i2 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i3 * (-999695593)) + (i * 636963214) + (i6 * (-1077364033)) + (i11 * 980484096);
        return i12 + ((i13 * i13) * 1287192576) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(u2 u2Var, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(u2Var, f, onextracallback);
        }
        IAuthTabCallback(u2Var, f, onextracallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Float fValueOf;
        InternalCameraPresenceListener internalCameraPresenceListener = (InternalCameraPresenceListener) objArr[0];
        u2 u2Var = (u2) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(u2Var, "");
            fValueOf = Float.valueOf(u2Var.asBinder());
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(internalCameraPresenceListener, "");
            Intrinsics.checkNotNullParameter(u2Var, "");
            fValueOf = Float.valueOf(u2Var.asBinder());
        }
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return fValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final u2 onWarmupCompleted(findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z, float f2) {
        boolean z2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (f2 >= 1.0f) {
            z2 = true;
        } else {
            int i5 = i3 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        u2 u2Var = new u2(z2, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z, null);
        u2Var.onWarmupCompleted(f2, onextracallback);
        return u2Var;
    }

    private static final u2 onWarmupCompleted(boolean z, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2) {
        int i = 2 % 2;
        u2 u2Var = new u2(z, findresandmsg, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, onextracallback, z2, null);
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return u2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0224 A[PHI: r13
      0x0224: PHI (r13v7 o.t7ExternalSyntheticLambda0$onExtraCallback) = (r13v4 o.t7ExternalSyntheticLambda0$onExtraCallback), (r13v10 o.t7ExternalSyntheticLambda0$onExtraCallback) binds: [B:111:0x0222, B:105:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0246 A[PHI: r4 r25
      0x0246: PHI (r4v33 boolean) = (r4v16 boolean), (r4v34 boolean) binds: [B:120:0x0244, B:116:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r25v7 o.CameraPresenceProviderExternalSyntheticLambda6) = (r25v2 o.CameraPresenceProviderExternalSyntheticLambda6), (r25v8 o.CameraPresenceProviderExternalSyntheticLambda6) binds: [B:120:0x0244, B:116:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b5 A[PHI: r7
      0x02b5: PHI (r7v7 float) = (r7v5 float), (r7v8 float) binds: [B:141:0x02b3, B:135:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139 A[PHI: r29
      0x0139: PHI (r29v7 o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) = 
      (r29v2 o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4)
      (r29v8 o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4)
      (r29v8 o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4)
     binds: [B:61:0x0137, B:57:0x012e, B:54:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167 A[PHI: r33
      0x0167: PHI (r33v4 int) = (r33v2 int), (r33v5 int) binds: [B:72:0x0165, B:69:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8 A[PHI: r8
      0x01c8: PHI (r8v24 boolean) = (r8v19 boolean), (r8v25 boolean) binds: [B:89:0x01c6, B:85:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u2 onWarmupCompleted(boolean z, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, float f, @Nullable t7ExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z3;
        Function0<Unit> function03;
        Function0<Unit> function04;
        float fOnExtraCallback;
        boolean z4;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        boolean z5;
        int i3;
        int i4;
        boolean z6;
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42;
        int i5;
        findResAndMsg findresandmsg;
        final boolean z7;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback2;
        Object obj;
        boolean z8;
        boolean z9;
        boolean zOnExtraCallback;
        int i6;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback3;
        int i7;
        int i8;
        boolean z10;
        boolean z11;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        boolean z12;
        Object objOnMinimized;
        int i9;
        final float f2;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback4;
        boolean zOnNavigationEvent;
        final float f3;
        int i10;
        int i11;
        boolean z13;
        boolean z14;
        int i12 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i13 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 2) != 0) {
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallback + 17;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitOnWarmupCompleted = t7a.onWarmupCompleted();
                        int i18 = onExtraCallback + 11;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            function03 = (Function0) objOnMinimized2;
        } else {
            function03 = function0;
        }
        if ((i2 & 4) != 0) {
            int i15 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i17 = 2 % 2;
                        int i18 = onNavigationEvent + 7;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 == 0) {
                            t7a.IAuthTabCallback();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = t7a.IAuthTabCallback();
                        int i19 = onNavigationEvent + 23;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 92 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                int i17 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
            }
            function04 = (Function0) objOnMinimized3;
        } else {
            function04 = function02;
        }
        if ((i2 & 8) != 0) {
            int i19 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            fOnExtraCallback = f;
        }
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback5 = (i2 & 16) != 0 ? t7ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback.onWarmupCompleted : onextracallback;
        boolean z15 = (i2 & 32) != 0 ? true : z2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-17627255, i, -1, "im.toss.tds.compose.component.compound.bottomcta.rememberTdsBottomCtaV1State (TdsBottomCtaV1State.kt:34)");
        }
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized4 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        final findResAndMsg findresandmsg2 = (findResAndMsg) objOnMinimized4;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function03, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function04, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky43 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(findresandmsg2);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky43);
        int i21 = (i & 7168) ^ 3072;
        boolean z16 = z3;
        if ((i21 <= 2048 || !cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback)) && (i & 3072) != 2048) {
            z4 = false;
        } else {
            int i22 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 3 % 4;
            }
            z4 = true;
        }
        int i24 = (57344 & i) ^ 24576;
        if (i24 > 16384) {
            int i25 = onExtraCallbackWithResult + 27;
            r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky43;
            onNavigationEvent = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 6 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback5)) {
                    z5 = true;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback5)) {
            }
            i3 = (458752 & i) ^ 196608;
            if (i3 <= 131072) {
                int i27 = onNavigationEvent + 31;
                i4 = i3;
                onExtraCallbackWithResult = i27 % 128;
                int i28 = i27 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z15)) {
                }
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (((z4 | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | z5) || z6) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                    i5 = i24;
                    findresandmsg = findresandmsg2;
                    final float f4 = fOnExtraCallback;
                    z7 = z15;
                    final t7ExternalSyntheticLambda0.onExtraCallback onextracallback6 = onextracallback5;
                    onextracallback2 = onextracallback5;
                    getCaptureIds getcaptureidsOnWarmupCompleted = ImmediateSurface.onWarmupCompleted(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallback + 89;
                            onNavigationEvent = i30 % 128;
                            int i31 = i30 % 2;
                            int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                            int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                            Float f5 = (Float) t7a.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1859616209, iOnNavigationEvent2, iOnNavigationEvent, -1859616209, new Object[]{(InternalCameraPresenceListener) obj2, (u2) obj3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                            int i32 = onNavigationEvent + 109;
                            onExtraCallback = i32 % 128;
                            int i33 = i32 % 2;
                            return f5;
                        }
                    }, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i29 = 2 % 2;
                            int i30 = IAuthTabCallback + 41;
                            onExtraCallbackWithResult = i30 % 128;
                            int i31 = i30 % 2;
                            u2 u2VarOnExtraCallbackWithResult = t7a.onExtraCallbackWithResult(findresandmsg2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, r8lambdanm9dm2eewl4vrptnjmesfjqky42, f4, onextracallback6, z7, ((Float) obj2).floatValue());
                            int i32 = IAuthTabCallback + 65;
                            onExtraCallbackWithResult = i32 % 128;
                            if (i32 % 2 == 0) {
                                int i33 = 17 / 0;
                            }
                            return u2VarOnExtraCallbackWithResult;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getcaptureidsOnWarmupCompleted);
                    obj = getcaptureidsOnWarmupCompleted;
                } else {
                    r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                    i5 = i24;
                    findresandmsg = findresandmsg2;
                    z7 = z15;
                    onextracallback2 = onextracallback5;
                    obj = objOnMinimized5;
                }
                getCaptureIds getcaptureids = (getCaptureIds) obj;
                Object[] objArr = new Object[0];
                if (((i & 14) ^ 6) > 4) {
                    z8 = z16;
                    if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z8)) {
                        z9 = true;
                    }
                    final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky44 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                    zOnExtraCallback = z9 | cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky44) | ((i21 <= 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback)) || (i & 3072) == 2048);
                    Object obj2 = null;
                    i6 = i5;
                    if (i6 <= 16384) {
                        int i29 = onNavigationEvent + 15;
                        onExtraCallbackWithResult = i29 % 128;
                        onextracallback3 = onextracallback2;
                        if (i29 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback3);
                            obj2.hashCode();
                            throw null;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback3)) {
                            i7 = i4;
                            i8 = 131072;
                            z10 = true;
                        }
                        if (i7 > i8) {
                            z11 = z7;
                            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2;
                            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z11)) {
                                z12 = true;
                            }
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if ((!z12 && !(zOnExtraCallback | z10)) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                                final findResAndMsg findresandmsg3 = findresandmsg;
                                i9 = i6;
                                final boolean z17 = z8;
                                f2 = fOnExtraCallback;
                                final t7ExternalSyntheticLambda0.onExtraCallback onextracallback7 = onextracallback3;
                                onextracallback4 = onextracallback3;
                                final boolean z18 = z11;
                                Function0 function05 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda4
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke() {
                                        int i30 = 2 % 2;
                                        int i31 = onWarmupCompleted + 3;
                                        onNavigationEvent = i31 % 128;
                                        Object obj3 = null;
                                        if (i31 % 2 == 0) {
                                            t7a.IAuthTabCallback(z17, findresandmsg3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky44, f2, onextracallback7, z18);
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        u2 u2VarIAuthTabCallback = t7a.IAuthTabCallback(z17, findresandmsg3, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky44, f2, onextracallback7, z18);
                                        int i32 = onWarmupCompleted + 65;
                                        onNavigationEvent = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            return u2VarIAuthTabCallback;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function05);
                                objOnMinimized = function05;
                            } else {
                                f2 = fOnExtraCallback;
                                i9 = i6;
                                onextracallback4 = onextracallback3;
                            }
                            final u2 u2Var = (u2) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureids, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var);
                            if (i21 <= 2048) {
                                int i30 = onNavigationEvent + 17;
                                onExtraCallbackWithResult = i30 % 128;
                                f3 = f2;
                                if (i30 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f3);
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f3)) {
                                    i10 = i9;
                                    i11 = 16384;
                                    z13 = true;
                                }
                                final t7ExternalSyntheticLambda0.onExtraCallback onextracallback8 = onextracallback4;
                                z14 = (i10 > i11 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback8)) || (i & 24576) == i11;
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(zOnNavigationEvent | z13 | z14)) {
                                    int i31 = onExtraCallbackWithResult + 5;
                                    onNavigationEvent = i31 % 128;
                                    int i32 = i31 % 2;
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized6 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda5
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallback;

                                            public final Object invoke() {
                                                int i33 = 2 % 2;
                                                int i34 = onExtraCallback + 63;
                                                IAuthTabCallback = i34 % 128;
                                                int i35 = i34 % 2;
                                                u2 u2Var2 = u2Var;
                                                if (i35 != 0) {
                                                    return t7a.onNavigationEvent(u2Var2, f3, onextracallback8);
                                                }
                                                t7a.onNavigationEvent(u2Var2, f3, onextracallback8);
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                                    }
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                return u2Var;
                            }
                            f3 = f2;
                            if ((i & 3072) == 2048) {
                                i10 = i9;
                                i11 = 16384;
                                z13 = false;
                            }
                            final t7ExternalSyntheticLambda0.onExtraCallback onextracallback82 = onextracallback4;
                            if (i10 > i11) {
                            }
                            Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!(zOnNavigationEvent | z13 | z14)) {
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized62, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            return u2Var;
                        }
                        z11 = z7;
                        cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2;
                        if ((i & 196608) != i8) {
                            z12 = false;
                        }
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(z12 | zOnExtraCallback | z10)) {
                            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda622 = cameraPresenceProviderExternalSyntheticLambda6;
                            final findResAndMsg findresandmsg32 = findresandmsg;
                            i9 = i6;
                            final boolean z172 = z8;
                            f2 = fOnExtraCallback;
                            final t7ExternalSyntheticLambda0.onExtraCallback onextracallback72 = onextracallback3;
                            onextracallback4 = onextracallback3;
                            final boolean z182 = z11;
                            Function0 function052 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda4
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i302 = 2 % 2;
                                    int i312 = onWarmupCompleted + 3;
                                    onNavigationEvent = i312 % 128;
                                    Object obj3 = null;
                                    if (i312 % 2 == 0) {
                                        t7a.IAuthTabCallback(z172, findresandmsg32, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda622, r8lambdanm9dm2eewl4vrptnjmesfjqky44, f2, onextracallback72, z182);
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    u2 u2VarIAuthTabCallback = t7a.IAuthTabCallback(z172, findresandmsg32, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda622, r8lambdanm9dm2eewl4vrptnjmesfjqky44, f2, onextracallback72, z182);
                                    int i322 = onWarmupCompleted + 65;
                                    onNavigationEvent = i322 % 128;
                                    if (i322 % 2 != 0) {
                                        return u2VarIAuthTabCallback;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function052);
                            objOnMinimized = function052;
                        }
                        final u2 u2Var2 = (u2) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureids, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var2);
                        if (i21 <= 2048) {
                        }
                        if ((i & 3072) == 2048) {
                        }
                        final t7ExternalSyntheticLambda0.onExtraCallback onextracallback822 = onextracallback4;
                        if (i10 > i11) {
                        }
                        Object objOnMinimized622 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent | z13 | z14)) {
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized622, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        return u2Var2;
                    }
                    onextracallback3 = onextracallback2;
                    if ((i & 24576) == 16384) {
                        i7 = i4;
                        i8 = 131072;
                        z10 = false;
                    }
                    if (i7 > i8) {
                    }
                    if ((i & 196608) != i8) {
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(z12 | zOnExtraCallback | z10)) {
                    }
                    final u2 u2Var22 = (u2) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureids, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var22);
                    if (i21 <= 2048) {
                    }
                    if ((i & 3072) == 2048) {
                    }
                    final t7ExternalSyntheticLambda0.onExtraCallback onextracallback8222 = onextracallback4;
                    if (i10 > i11) {
                    }
                    Object objOnMinimized6222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent | z13 | z14)) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized6222, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    return u2Var22;
                }
                z8 = z16;
                if ((i & 6) != 4) {
                    z9 = false;
                }
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky442 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                zOnExtraCallback = z9 | cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky442) | ((i21 <= 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback)) || (i & 3072) == 2048);
                Object obj22 = null;
                i6 = i5;
                if (i6 <= 16384) {
                }
                if ((i & 24576) == 16384) {
                }
                if (i7 > i8) {
                }
                if ((i & 196608) != i8) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(z12 | zOnExtraCallback | z10)) {
                }
                final u2 u2Var222 = (u2) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureids, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var222);
                if (i21 <= 2048) {
                }
                if ((i & 3072) == 2048) {
                }
                final t7ExternalSyntheticLambda0.onExtraCallback onextracallback82222 = onextracallback4;
                if (i10 > i11) {
                }
                Object objOnMinimized62222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | z13 | z14)) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized62222, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                return u2Var222;
            }
            i4 = i3;
            z6 = (i & 196608) != 131072;
            Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z4 | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | z5 | z6) {
                r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                i5 = i24;
                findresandmsg = findresandmsg2;
                final float f42 = fOnExtraCallback;
                z7 = z15;
                final t7ExternalSyntheticLambda0.onExtraCallback onextracallback62 = onextracallback5;
                onextracallback2 = onextracallback5;
                getCaptureIds getcaptureidsOnWarmupCompleted2 = ImmediateSurface.onWarmupCompleted(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj23, Object obj3) {
                        int i292 = 2 % 2;
                        int i302 = onExtraCallback + 89;
                        onNavigationEvent = i302 % 128;
                        int i312 = i302 % 2;
                        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
                        Float f5 = (Float) t7a.onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1859616209, iOnNavigationEvent2, iOnNavigationEvent, -1859616209, new Object[]{(InternalCameraPresenceListener) obj23, (u2) obj3}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                        int i322 = onNavigationEvent + 109;
                        onExtraCallback = i322 % 128;
                        int i33 = i322 % 2;
                        return f5;
                    }
                }, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj23) {
                        int i292 = 2 % 2;
                        int i302 = IAuthTabCallback + 41;
                        onExtraCallbackWithResult = i302 % 128;
                        int i312 = i302 % 2;
                        u2 u2VarOnExtraCallbackWithResult = t7a.onExtraCallbackWithResult(findresandmsg2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, r8lambdanm9dm2eewl4vrptnjmesfjqky42, f42, onextracallback62, z7, ((Float) obj23).floatValue());
                        int i322 = IAuthTabCallback + 65;
                        onExtraCallbackWithResult = i322 % 128;
                        if (i322 % 2 == 0) {
                            int i33 = 17 / 0;
                        }
                        return u2VarOnExtraCallbackWithResult;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getcaptureidsOnWarmupCompleted2);
                obj = getcaptureidsOnWarmupCompleted2;
            }
            getCaptureIds getcaptureids2 = (getCaptureIds) obj;
            Object[] objArr2 = new Object[0];
            if (((i & 14) ^ 6) > 4) {
            }
            if ((i & 6) != 4) {
            }
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4422 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
            zOnExtraCallback = z9 | cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4422) | ((i21 <= 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback)) || (i & 3072) == 2048);
            Object obj222 = null;
            i6 = i5;
            if (i6 <= 16384) {
            }
            if ((i & 24576) == 16384) {
            }
            if (i7 > i8) {
            }
            if ((i & 196608) != i8) {
            }
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(z12 | zOnExtraCallback | z10)) {
            }
            final u2 u2Var2222 = (u2) RememberSaveableKt.onWarmupCompleted(objArr2, getcaptureids2, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var2222);
            if (i21 <= 2048) {
            }
            if ((i & 3072) == 2048) {
            }
            final t7ExternalSyntheticLambda0.onExtraCallback onextracallback822222 = onextracallback4;
            if (i10 > i11) {
            }
            Object objOnMinimized622222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | z13 | z14)) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized622222, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return u2Var2222;
        }
        r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky43;
        if ((i & 24576) != 16384) {
            z5 = false;
        }
        i3 = (458752 & i) ^ 196608;
        if (i3 <= 131072) {
        }
        if ((i & 196608) != 131072) {
        }
        Object objOnMinimized522 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z4 | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | z5 | z6) {
        }
        getCaptureIds getcaptureids22 = (getCaptureIds) obj;
        Object[] objArr22 = new Object[0];
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
        }
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky44222 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
        zOnExtraCallback = z9 | cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2) | cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky44222) | ((i21 <= 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fOnExtraCallback)) || (i & 3072) == 2048);
        Object obj2222 = null;
        i6 = i5;
        if (i6 <= 16384) {
        }
        if ((i & 24576) == 16384) {
        }
        if (i7 > i8) {
        }
        if ((i & 196608) != i8) {
        }
        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z12 | zOnExtraCallback | z10)) {
        }
        final u2 u2Var22222 = (u2) RememberSaveableKt.onWarmupCompleted(objArr22, getcaptureids22, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var22222);
        if (i21 <= 2048) {
        }
        if ((i & 3072) == 2048) {
        }
        final t7ExternalSyntheticLambda0.onExtraCallback onextracallback8222222 = onextracallback4;
        if (i10 > i11) {
        }
        Object objOnMinimized6222222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z13 | z14)) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized6222222, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return u2Var22222;
    }

    private static final Unit IAuthTabCallback(u2 u2Var, float f, t7ExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            u2Var.onWarmupCompleted(f);
            u2Var.IAuthTabCallback(onextracallback);
            int i3 = 23 / 0;
            return Unit.INSTANCE;
        }
        u2Var.onWarmupCompleted(f);
        u2Var.IAuthTabCallback(onextracallback);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Float onExtraCallbackWithResult(InternalCameraPresenceListener internalCameraPresenceListener, u2 u2Var) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Float) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 1859616209, iOnNavigationEvent2, iOnNavigationEvent, -1859616209, new Object[]{internalCameraPresenceListener, u2Var}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }

    private static final Float onWarmupCompleted(InternalCameraPresenceListener internalCameraPresenceListener, u2 u2Var) {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (Float) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), -1748059259, iOnNavigationEvent2, iOnNavigationEvent, 1748059260, new Object[]{internalCameraPresenceListener, u2Var}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
    }
}
