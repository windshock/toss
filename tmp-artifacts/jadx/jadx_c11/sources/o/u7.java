package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.u7;
import o.useAndConfigureProgramWithTexture;
import o.wa;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u7 {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    public static final u7 IAuthTabCallback = new u7();
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
    private static final wa.IAuthTabCallback onNavigationEvent = wa.IAuthTabCallback.onExtraCallbackWithResult(wa.IAuthTabCallback.Companion.onWarmupCompleted(), null, null, accessgetTlsVersionsAsStringp.Typography6, null, null, null, 59, null);

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 97;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(f, f2, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(f, f2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i6 | i2));
        int i12 = i8 | i6;
        int i13 = (~(i | i6)) | (~i12);
        int i14 = i12 | i10;
        int i15 = i6 + i2 + i4 + ((-1468046718) * i5) + (327422179 * i3);
        int i16 = i15 * i15;
        int i17 = (677926197 * i6) + 1810235392 + (1154460365 * i2) + (i11 * (-238267084)) + ((-238267084) * i13) + (238267084 * i14) + (916193280 * i4) + (1933049856 * i5) + (743702528 * i3) + (286654464 * i16);
        int i18 = (i6 * (-645773371)) + 280972133 + (i2 * (-645772067)) + (i11 * (-652)) + (i13 * (-652)) + (i14 * 652) + (i4 * (-645772719)) + (i5 * 1523302178) + (i3 * 1475409363) + (i16 * (-1007288320));
        return i17 + ((i18 * i18) * (-492175360)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        u7 u7Var = (u7) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[4];
        long jLongValue = ((Number) objArr[5]).longValue();
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onExtraCallbackWithResult = i2 % 128;
        u7Var.onWarmupCompleted(quirksExternalSyntheticBackport0, fFloatValue, fFloatValue2, tometerspersecond, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(u7 u7Var, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, toMetersPerSecond tometerspersecond, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 87;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {u7Var, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), tometerspersecond, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 2101547369, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -2101547369, objArr);
        }
        Object[] objArr2 = {u7Var, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), tometerspersecond, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(str, useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, useandconfigureprogramwithtexture);
        int i3 = onExtraCallbackWithResult + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    private u7() {
    }

    public final long onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = asInterface + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2019276530, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults.<get-scrimColor> (TdsBottomSheetV2Defaults.kt:31)");
            if (i4 != 0) {
                throw null;
            }
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BackgroundDim, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onExtraCallbackWithResult + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return jOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741002450, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults.<get-containerColor> (TdsBottomSheetV2Defaults.kt:34)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BackgroundFloated100, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = asInterface + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i4 != 0) {
                throw null;
            }
        }
        return Long.valueOf(jOnExtraCallback);
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1158896356, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults.<get-handleColor> (TdsBottomSheetV2Defaults.kt:37)");
            int i4 = asInterface + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.BottomSheetHandleFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = asInterface + 97;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        return jOnWarmupCompleted;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        float f = onExtraCallback;
        int i5 = i3 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float f = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return f;
    }

    public final wa.IAuthTabCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        wa.IAuthTabCallback iAuthTabCallback = onNavigationEvent;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return iAuthTabCallback;
    }

    private static final Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(float f, float f2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2134400601, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults.DragHandle.<anonymous> (TdsBottomSheetV2Defaults.kt:71)");
                int i4 = onExtraCallbackWithResult + 99;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 5;
                }
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, f, f2), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, @Nullable toMetersPerSecond tometerspersecond, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        final float fOnWarmupCompleted;
        int i4;
        float fOnExtraCallbackWithResult;
        int i5;
        int i6;
        toMetersPerSecond appLovinAdClickListener;
        int i7;
        long jIAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float f3;
        final toMetersPerSecond tometerspersecond2;
        long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i8;
        final String strOnExtraCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        int i9;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1087788181);
        int i11 = i2 & 1;
        if (i11 != 0) {
            int i12 = onExtraCallbackWithResult + 7;
            asInterface = i12 % 128;
            i3 = i12 % 2 == 0 ? i | 4 : i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            int i14 = onExtraCallbackWithResult + 81;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                fOnWarmupCompleted = f;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    fOnExtraCallbackWithResult = f2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallbackWithResult)) {
                        int i16 = onExtraCallbackWithResult + 101;
                        int i17 = i16 % 128;
                        asInterface = i17;
                        int i18 = i16 % 2;
                        int i19 = i17 + 31;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i20 = 5 % 5;
                        }
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        appLovinAdClickListener = tometerspersecond;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appLovinAdClickListener)) {
                            int i21 = asInterface + 35;
                            onExtraCallbackWithResult = i21 % 128;
                            i7 = i21 % 2 != 0 ? 32545 : 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            int i22 = onExtraCallbackWithResult + 9;
                            asInterface = i22 % 128;
                            int i23 = i22 % 2;
                            jIAuthTabCallback = j;
                            int i24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jIAuthTabCallback) ? 16384 : 8192;
                            i3 |= i24;
                        } else {
                            jIAuthTabCallback = j;
                        }
                        i3 |= i24;
                    } else {
                        jIAuthTabCallback = j;
                    }
                    if ((i & 196608) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 131072 : 65536;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        f3 = fOnExtraCallbackWithResult;
                        tometerspersecond2 = appLovinAdClickListener;
                        j2 = jIAuthTabCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            quirksExternalSyntheticBackport03 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if (i13 != 0) {
                                fOnWarmupCompleted = u6.onWarmupCompleted();
                            }
                            if (i4 != 0) {
                                fOnExtraCallbackWithResult = u6.onExtraCallbackWithResult();
                            }
                            if (i6 != 0) {
                                appLovinAdClickListener = new AppLovinAdClickListener(u6.onExtraCallback(), null);
                            }
                            if ((i2 & 16) != 0) {
                                jIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 15) & 14);
                                i8 = i3 & (-57345);
                            }
                            final float f4 = fOnExtraCallbackWithResult;
                            tometerspersecond2 = appLovinAdClickListener;
                            j2 = jIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1087788181, i8, -1, "im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults.DragHandle (TdsBottomSheetV2Defaults.kt:62)");
                            }
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_drag_handle, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, u6.IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults$$ExternalSyntheticLambda0
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj) {
                                        int i25 = 2 % 2;
                                        int i26 = onExtraCallback + 35;
                                        onNavigationEvent = i26 % 128;
                                        Object obj2 = null;
                                        if (i26 % 2 != 0) {
                                            u7.onWarmupCompleted(strOnExtraCallback, (useAndConfigureProgramWithTexture) obj);
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        Unit unitOnWarmupCompleted = u7.onWarmupCompleted(strOnExtraCallback, (useAndConfigureProgramWithTexture) obj);
                                        int i27 = onExtraCallback + 101;
                                        onNavigationEvent = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        obj2.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            int i25 = i8 >> 6;
                            r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized, 1, (Object) null), tometerspersecond2, j2, 0L, (getCurrentMenuItems) null, 0.0f, ForwardingCameraControl.onExtraCallback(-2134400601, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i26 = 2 % 2;
                                    int i27 = onWarmupCompleted + 7;
                                    IAuthTabCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitOnExtraCallbackWithResult = u7.onExtraCallbackWithResult(fOnWarmupCompleted, f4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i29 = onWarmupCompleted + 35;
                                    IAuthTabCallback = i29 % 128;
                                    int i30 = i29 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i25 & 112) | 1572864 | (i25 & 896), 56);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            f3 = f4;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 16) != 0) {
                                int i26 = asInterface + 25;
                                onExtraCallbackWithResult = i26 % 128;
                                i9 = 2;
                                int i27 = i26 % 2;
                                i3 &= -57345;
                            } else {
                                i9 = 2;
                            }
                            int i28 = onExtraCallbackWithResult + 107;
                            asInterface = i28 % 128;
                            int i29 = i28 % i9;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        }
                        i8 = i3;
                        final float f42 = fOnExtraCallbackWithResult;
                        tometerspersecond2 = appLovinAdClickListener;
                        j2 = jIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_drag_handle, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, u6.IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent) {
                            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj) {
                                    int i252 = 2 % 2;
                                    int i262 = onExtraCallback + 35;
                                    onNavigationEvent = i262 % 128;
                                    Object obj2 = null;
                                    if (i262 % 2 != 0) {
                                        u7.onWarmupCompleted(strOnExtraCallback, (useAndConfigureProgramWithTexture) obj);
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = u7.onWarmupCompleted(strOnExtraCallback, (useAndConfigureProgramWithTexture) obj);
                                    int i272 = onExtraCallback + 101;
                                    onNavigationEvent = i272 % 128;
                                    if (i272 % 2 == 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    obj2.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            int i252 = i8 >> 6;
                            r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, false, (Function1) objOnMinimized, 1, (Object) null), tometerspersecond2, j2, 0L, (getCurrentMenuItems) null, 0.0f, ForwardingCameraControl.onExtraCallback(-2134400601, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i262 = 2 % 2;
                                    int i272 = onWarmupCompleted + 7;
                                    IAuthTabCallback = i272 % 128;
                                    int i282 = i272 % 2;
                                    Unit unitOnExtraCallbackWithResult = u7.onExtraCallbackWithResult(fOnWarmupCompleted, f42, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i292 = onWarmupCompleted + 35;
                                    IAuthTabCallback = i292 % 128;
                                    int i30 = i292 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i252 & 112) | 1572864 | (i252 & 896), 56);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            f3 = f42;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        final float f5 = fOnWarmupCompleted;
                        final long j3 = j2;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.TdsBottomSheetV2Defaults$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2) {
                                int i30 = 2 % 2;
                                int i31 = onNavigationEvent + 99;
                                onExtraCallbackWithResult = i31 % 128;
                                if (i31 % 2 != 0) {
                                    return u7.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport04, f5, f3, tometerspersecond2, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                }
                                Unit unitOnNavigationEvent = u7.onNavigationEvent(this.f$0, quirksExternalSyntheticBackport04, f5, f3, tometerspersecond2, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i32 = 43 / 0;
                                return unitOnNavigationEvent;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                appLovinAdClickListener = tometerspersecond;
                if ((i & 24576) != 0) {
                }
                if ((i & 196608) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            fOnExtraCallbackWithResult = f2;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            appLovinAdClickListener = tometerspersecond;
            if ((i & 24576) != 0) {
            }
            if ((i & 196608) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        fOnWarmupCompleted = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        fOnExtraCallbackWithResult = f2;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        appLovinAdClickListener = tometerspersecond;
        if ((i & 24576) != 0) {
        }
        if ((i & 196608) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static {
        int i = IAuthTabCallbackStub + 93;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(u7 u7Var, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, toMetersPerSecond tometerspersecond, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {u7Var, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), tometerspersecond, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 2101547369, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -2101547369, objArr);
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return ((Long) onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 585339600, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -585339599, objArr)).longValue();
    }
}
