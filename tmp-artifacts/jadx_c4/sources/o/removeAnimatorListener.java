package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.compose.v0.TdsTopV1Scope$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.removeAnimatorListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeAnimatorListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final removeAnimatorListener onWarmupCompleted = new removeAnimatorListener();

    static {
        int i = onNavigationEvent + 39;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        removeAnimatorListener removeanimatorlistener = (removeAnimatorListener) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(removeanimatorlistener, str, quirksExternalSyntheticBackport0, jLongValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(removeanimatorlistener, str, quirksExternalSyntheticBackport0, jLongValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return interfaceDescriptor;
    }

    private static final Unit IAuthTabCallbackDefault(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        removeanimatorlistener.onExtraCallback(str, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        removeanimatorlistener.onNavigationEvent(str, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit access100(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(1401108000, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1401107999, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{removeanimatorlistener, str, quirksExternalSyntheticBackport0, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        } else {
            onWarmupCompleted(1401108000, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1401107999, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{removeanimatorlistener, str, quirksExternalSyntheticBackport0, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asBinder(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i5 % 128;
        removeanimatorlistener.onWarmupCompleted(str, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asInterface(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        removeanimatorlistener.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        removeanimatorlistener.IAuthTabCallback(str, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallbackDefault(removeanimatorlistener, str, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallbackDefault(removeanimatorlistener, str, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        removeAnimatorListener removeanimatorlistener = (removeAnimatorListener) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(removeanimatorlistener, str, quirksExternalSyntheticBackport0, jLongValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onNavigationEvent(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsBinder = asBinder(removeanimatorlistener, str, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 96 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onTransact(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsInterface = asInterface(removeanimatorlistener, str, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = (~i2) | i7;
        int i12 = i10 | (~(i11 | i3));
        int i13 = (~(i2 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i));
        int i15 = i + i3 + i5 + (783392123 * i6) + ((-786872706) * i4);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i) + 1729888256 + (218870266 * i3) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i5) + ((-1731985408) * i6) + ((-471334912) * i4) + ((-600899584) * i16);
        int i18 = (i * 375823119) + 1642083618 + (i3 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i5 * 375824245) + (i6 * (-117547465)) + (i4 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        return i19 != 1 ? i19 != 2 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(removeanimatorlistener, str, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 26 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    private removeAnimatorListener() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long jLongValue;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long j3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2000558590);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
                int i7 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                i3 |= i9;
            } else {
                j2 = j;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                j3 = j2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i6 != 0) {
                        int i10 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    }
                    if ((i2 & 4) != 0) {
                        int i12 = onExtraCallbackWithResult + 119;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        i3 &= -897;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        jLongValue = j2;
                    }
                    i4 = i3;
                } else {
                    int i14 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    jLongValue = j2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2000558590, i4, -1, "im.toss.compose.v0.TdsTopV1Scope.Top1 (TdsTopV1.kt:43)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackDefault(), Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i4 & 14) | ((i4 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                j3 = jLongValue;
                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport06;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV1Scope$.ExternalSyntheticLambda0(this, str, quirksExternalSyntheticBackport05, j3, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long jLongValue;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-644271907);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                int i6 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i8 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0 ? (i2 & 4) != 0 : i5 != 0) {
                    j2 = j;
                } else {
                    j2 = j;
                    int i9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
                    i3 |= i9;
                }
                i3 |= i9;
            } else {
                j2 = j;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                j3 = j2;
            } else {
                int i10 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i11 = IAuthTabCallback + 59;
                                    onExtraCallbackWithResult = i11 % 128;
                                    int i12 = i11 % 2;
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-644271907, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top2 (TdsTopV1.kt:58)");
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.onTransact(), Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                j3 = jLongValue;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                            } else {
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        }
                        jLongValue = j2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.onTransact(), Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        j3 = jLongValue;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport062;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV1Scope$.ExternalSyntheticLambda3(this, str, quirksExternalSyntheticBackport03, j3, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        long j2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j3;
        long jLongValue;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j4;
        int i5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1005864892);
        if ((i & 6) == 0) {
            i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i8 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 45 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport04) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport04)) {
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                    int i10 = onExtraCallbackWithResult + 5;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    i5 = 256;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j2 = j;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i12 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i7 != 0) {
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((i2 & 4) != 0) {
                    int i14 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 == 0) {
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 68)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                        i3 &= 14729;
                    } else {
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                        i3 &= -897;
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    j4 = jLongValue;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1005864892, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top3 (TdsTopV1.kt:73)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(j4), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i15 = IAuthTabCallback + 89;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 5 / 3;
                    }
                }
                j3 = j4;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
            } else {
                int i17 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            j4 = j2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(j4), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            j3 = j4;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport052;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            j3 = j2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.TdsTopV1Scope$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onNavigationEvent + 1;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 != 0) {
                        return removeAnimatorListener.onTransact(this.f$0, str, quirksExternalSyntheticBackport02, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    removeAnimatorListener.onTransact(this.f$0, str, quirksExternalSyntheticBackport02, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        long jLongValue;
        long j4;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1638965605);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                i4 = 4;
            } else {
                int i6 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) != 0 || (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ^ true)) ? 128 : 256;
            } else {
                j2 = j;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 147) != 146), i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                j3 = j2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i8 != 0) {
                        int i9 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    if ((i2 & 4) != 0) {
                        int i11 = IAuthTabCallback + 115;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 47)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                            i3 &= 30813;
                        } else {
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                            i3 &= -897;
                        }
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        j4 = jLongValue;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1638965605, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top4 (TdsTopV1.kt:88)");
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.access100(), Long.valueOf(j4), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        j3 = j4;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                    } else {
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 4) != 0) {
                        int i12 = IAuthTabCallback + 9;
                        onExtraCallbackWithResult = i12 % 128;
                        i3 = i12 % 2 == 0 ? i3 & 25033 : i3 & (-897);
                    }
                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                }
                j4 = j2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport05;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.access100(), Long.valueOf(j4), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                j3 = j4;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport062;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV1Scope$.ExternalSyntheticLambda1(this, str, quirksExternalSyntheticBackport03, j3, i, i2));
                return;
            }
            return;
        }
        int i13 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i13 % 128;
        int i14 = i13 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i15 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i15 % 128;
        int i16 = i15 % 2;
        if ((i & 384) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 147) != 146), i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        long j2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long jICustomTabsService;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(11171194);
        if ((i & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 25 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    int i9 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    i4 = 16;
                } else {
                    int i12 = onExtraCallbackWithResult;
                    int i13 = i12 + 43;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 + 49;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 32;
                }
                i3 |= i4;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    int i17 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    j2 = j;
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
                    i3 |= i19;
                } else {
                    j2 = j;
                }
                i3 |= i19;
            } else {
                j2 = j;
            }
            if ((i3 & 147) == 146) {
                int i20 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                j3 = j2;
            } else {
                int i22 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i22 % 128;
                if (i22 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(11171194, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top5 (TdsTopV1.kt:103)");
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(jICustomTabsService), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                j3 = jICustomTabsService;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                            } else {
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        }
                        jICustomTabsService = j2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(jICustomTabsService), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 7168)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        j3 = jICustomTabsService;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport062;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.TdsTopV1Scope$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i23 = 2 % 2;
                        int i24 = onExtraCallbackWithResult + 29;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        removeAnimatorListener removeanimatorlistener = this.f$0;
                        String str2 = str;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
                        long j4 = j3;
                        int i26 = i;
                        int i27 = i2;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr = {removeanimatorlistener, str2, quirksExternalSyntheticBackport07, Long.valueOf(j4), Integer.valueOf(i26), Integer.valueOf(i27), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        Unit unit = (Unit) removeAnimatorListener.onWarmupCompleted(-2072521945, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2072521945, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                        int i28 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i28 % 128;
                        int i29 = i28 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        int i23 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i23 % 128;
        int i24 = i23 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[PHI: r10
      0x0064: PHI (r10v7 o.CameraCaptureResultEmptyCameraCaptureResult) = (r10v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r10v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0057, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059 A[PHI: r10
      0x0059: PHI (r10v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r10v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r10v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0057, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        int i3;
        Object obj;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final long j;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        final removeAnimatorListener removeanimatorlistener = (removeAnimatorListener) objArr[0];
        final String str = (String) objArr[1];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(1661307993);
            if ((iIntValue & 116) == 0) {
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i = iIntValue;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(1661307993);
            if ((iIntValue & 6) == 0) {
            }
        }
        int i8 = iIntValue2 & 2;
        if (i8 == 0) {
            if ((iIntValue & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i9 = onExtraCallbackWithResult + 91;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 32;
                } else {
                    i2 = 16;
                }
                i3 = i2 | i;
            }
            if ((iIntValue & 384) == 0) {
                int i11 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0 ? (iIntValue2 & 4) != 0 : (iIntValue2 & 5) != 0) {
                    i5 = 128;
                    i3 |= i5;
                } else {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue)) {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
            }
            Object obj2 = null;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                obj = null;
                i4 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                j = jLongValue;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStub();
                if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult.onPostMessage()) {
                    if (i8 != 0) {
                        quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if ((iIntValue2 & 4) != 0) {
                        jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                    }
                    long j2 = jLongValue;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i12 = onExtraCallbackWithResult + 35;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1661307993, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top6 (TdsTopV1.kt:118)");
                            obj2.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1661307993, i3, -1, "im.toss.compose.v0.TdsTopV1Scope.Top6 (TdsTopV1.kt:118)");
                    }
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    i4 = iIntValue;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(j2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i3 << 3) & 7168) | (i3 & 14)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    j = j2;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 4) != 0) {
                        int i13 = IAuthTabCallback + 113;
                        onExtraCallbackWithResult = i13 % 128;
                        i3 = i13 % 2 == 0 ? i3 & 13085 : i3 & (-897);
                    }
                    long j22 = jLongValue;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport022 = quirksExternalSyntheticBackport0;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    i4 = iIntValue;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport022, 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(j22), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i3 << 3) & 7168) | (i3 & 14)), 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    j = j22;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport022;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final int i14 = i4;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.TdsTopV1Scope$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 61;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        removeAnimatorListener removeanimatorlistener2 = this.f$0;
                        String str2 = str;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        long j3 = j;
                        int i18 = i14;
                        int i19 = iIntValue2;
                        int iIntValue3 = ((Integer) obj4).intValue();
                        Object[] objArr2 = {removeanimatorlistener2, str2, quirksExternalSyntheticBackport03, Long.valueOf(j3), Integer.valueOf(i18), Integer.valueOf(i19), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue3)};
                        Unit unit = (Unit) removeAnimatorListener.onWarmupCompleted(699299224, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -699299222, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                        int i20 = onNavigationEvent + 61;
                        IAuthTabCallback = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 97 / 0;
                        }
                        return unit;
                    }
                });
            }
            return obj;
        }
        i |= 48;
        i3 = i;
        if ((iIntValue & 384) == 0) {
        }
        Object obj22 = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    public static /* synthetic */ Unit IAuthTabCallback(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {removeanimatorlistener, str, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(-2072521945, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2072521945, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {removeanimatorlistener, str, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(699299224, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -699299222, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void IAuthTabCallbackDefault(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(1401108000, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1401107999, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
