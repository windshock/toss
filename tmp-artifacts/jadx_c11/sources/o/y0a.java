package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import im.toss.tds.compose.component.compound.toast.v1.LeftPreset$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.y0a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y0a {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        y0a y0aVar = (y0a) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[6];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[7];
        String str2 = (String) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        y0aVar.onExtraCallbackWithResult(str, jLongValue, quirksExternalSyntheticBackport0, iIntValue, fFloatValue, quirkSettingsLoader, immediatefailedfuture, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue2), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(y0a y0aVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        y0aVar.onExtraCallback(str, quirksExternalSyntheticBackport0, j, quirkSettingsLoader, immediatefailedfuture, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 71;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y0a y0aVar, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(y0aVar, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 75 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(y0a y0aVar, String str, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 59;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {y0aVar, str, Long.valueOf(j), quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f), quirkSettingsLoader, immediatefailedfuture, str2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1285243122, 1285243123, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i8 = onExtraCallback + 47;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i3);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i3));
        int i13 = i3 + i2 + i + (325770565 * i6) + ((-1284996642) * i5);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i2) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i) + ((-667418624) * i6) + ((-145752064) * i5) + (1116340224 * i14);
        int i16 = (i3 * (-1991011123)) + 595473426 + (i2 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i * (-1991010217)) + (i6 * (-1223611789)) + (i5 * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y0a y0aVar, int i, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, float f, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 69;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y0aVar, i, j, quirksExternalSyntheticBackport0, i2, f, quirkSettingsLoader, immediatefailedfuture, str, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        if (i8 != 0) {
            int i9 = 89 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y0a y0aVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(y0aVar, str, quirksExternalSyntheticBackport0, j, quirkSettingsLoader, immediatefailedfuture, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 45 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(y0a y0aVar, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        y0aVar.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        y0a y0aVar = (y0a) objArr[0];
        Object obj = objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[4];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[5];
        String str = (String) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {y0aVar, obj, quirksExternalSyntheticBackport0, Long.valueOf(jLongValue), quirkSettingsLoader, immediatefailedfuture, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)};
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 654749166, -654749164, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(y0a y0aVar, int i, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, float f, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 93;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        y0aVar.onExtraCallback(i, j, quirksExternalSyntheticBackport0, i2, f, quirkSettingsLoader, immediatefailedfuture, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), i4);
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 69;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 95 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y0a y0aVar, Object obj, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {y0aVar, obj, quirksExternalSyntheticBackport0, Long.valueOf(j), quirkSettingsLoader, immediatefailedfuture, str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -79419669, 79419669, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        int i7 = onExtraCallback + 107;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final String str, final long j, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        immediateFailedFuture immediatefailedfuture2;
        int i12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirkSettingsLoader quirkSettingsLoader2;
        final String str3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final int i13;
        final immediateFailedFuture immediatefailedfuture3;
        final float f2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float f3;
        QuirkSettingsLoader quirkSettingsLoader3;
        int i14;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1535204107);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i16 = onWarmupCompleted + 101;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                i14 = 4;
            } else {
                i14 = 2;
            }
            i4 = i14 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            int i19 = onWarmupCompleted + 57;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                int i21 = onWarmupCompleted + 31;
                onExtraCallback = i21 % 128;
                i4 = i21 % 2 != 0 ? i4 | 18678 : i4 | 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i6 = i;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i6) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                            i8 = 8192;
                        } else {
                            int i22 = onWarmupCompleted + 99;
                            onExtraCallback = i22 % 128;
                            i8 = i22 % 2 != 0 ? 20721 : 16384;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        int i23 = onExtraCallback + 51;
                        onWarmupCompleted = i23 % 128;
                        if (i23 % 2 == 0) {
                            str.hashCode();
                            throw null;
                        }
                        i4 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            i10 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader) ^ true) ? 131072 : 65536) | i4;
                        }
                        i11 = i3 & 64;
                        if (i11 != 0) {
                            i10 |= 1572864;
                        } else {
                            if ((1572864 & i2) == 0) {
                                immediatefailedfuture2 = immediatefailedfuture;
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture2) ? 1048576 : 524288;
                            }
                            i12 = i3 & 128;
                            if (i12 != 0) {
                                if ((i2 & 12582912) == 0) {
                                    int i24 = onWarmupCompleted + 33;
                                    onExtraCallback = i24 % 128;
                                    int i25 = i24 % 2;
                                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 8388608 : 4194304;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                    int i26 = i5 == 0 ? i6 : 1;
                                    if (i7 != 0) {
                                        int i27 = onExtraCallback + 21;
                                        int i28 = i27 % 128;
                                        onWarmupCompleted = i28;
                                        float f4 = i27 % 2 == 0 ? 0.0f : 1.0f;
                                        int i29 = i28 + 19;
                                        onExtraCallback = i29 % 128;
                                        if (i29 % 2 != 0) {
                                            int i30 = 5 % 4;
                                        }
                                        f3 = f4;
                                    } else {
                                        f3 = f;
                                    }
                                    if (i9 != 0) {
                                        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                                        int i31 = onExtraCallback + 23;
                                        onWarmupCompleted = i31 % 128;
                                        int i32 = i31 % 2;
                                        quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                                    } else {
                                        quirkSettingsLoader3 = quirkSettingsLoader;
                                    }
                                    immediateFailedFuture immediatefailedfutureIAuthTabCallback = i11 != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture2;
                                    str = i12 == 0 ? str2 : null;
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i33 = onWarmupCompleted + 1;
                                        onExtraCallback = i33 % 128;
                                        if (i33 % 2 != 0) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1535204107, i10, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Lottie (TdsToastV1Presets.kt:51)");
                                            int i34 = 20 / 0;
                                        } else {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1535204107, i10, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Lottie (TdsToastV1Presets.kt:51)");
                                        }
                                    }
                                    int i35 = i10 << 3;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    AppLovinStarRatingView.IAuthTabCallback(str, quirksExternalSyntheticBackport04, false, false, i26, f3, false, VirtualCameraInfo.onExtraCallbackWithResult(j), VirtualCameraInfo.onWarmupCompleted(j), quirkSettingsLoader3, immediatefailedfutureIAuthTabCallback, false, str, cameraCaptureResultEmptyCameraCaptureResult2, (i35 & 458752) | (i10 & 14) | ((i10 >> 3) & 112) | (57344 & i35) | ((i10 << 12) & 1879048192), ((i10 >> 18) & 14) | ((i10 >> 15) & 896), 2124);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    str3 = str;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    i13 = i26;
                                    f2 = f3;
                                    quirkSettingsLoader2 = quirkSettingsLoader3;
                                    immediatefailedfuture3 = immediatefailedfutureIAuthTabCallback;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                    quirkSettingsLoader2 = quirkSettingsLoader;
                                    str3 = str2;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    i13 = i6;
                                    immediatefailedfuture3 = immediatefailedfuture2;
                                    f2 = f;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.LeftPreset$$ExternalSyntheticLambda4
                                        private static int IAuthTabCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i36 = 2 % 2;
                                            int i37 = IAuthTabCallback + 111;
                                            onNavigationEvent = i37 % 128;
                                            int i38 = i37 % 2;
                                            Unit unitOnExtraCallback = y0a.onExtraCallback(this.f$0, str, j, quirksExternalSyntheticBackport03, i13, f2, quirkSettingsLoader2, immediatefailedfuture3, str3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i39 = onNavigationEvent + 29;
                                            IAuthTabCallback = i39 % 128;
                                            if (i39 % 2 != 0) {
                                                int i40 = 27 / 0;
                                            }
                                            return unitOnExtraCallback;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 |= 12582912;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        immediatefailedfuture2 = immediatefailedfuture;
                        i12 = i3 & 128;
                        if (i12 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i4;
                    i11 = i3 & 64;
                    if (i11 != 0) {
                    }
                    immediatefailedfuture2 = immediatefailedfuture;
                    i12 = i3 & 128;
                    if (i12 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i4;
                i11 = i3 & 64;
                if (i11 != 0) {
                }
                immediatefailedfuture2 = immediatefailedfuture;
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i4;
            i11 = i3 & 64;
            if (i11 != 0) {
            }
            immediatefailedfuture2 = immediatefailedfuture;
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i4;
        i11 = i3 & 64;
        if (i11 != 0) {
        }
        immediatefailedfuture2 = immediatefailedfuture;
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i10) != 4793490, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[PHI: r1
      0x0037: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
      0x002a: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(int i, long j, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, float f, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        QuirkSettingsLoader quirkSettingsLoader2;
        int i11;
        int i12;
        int i13;
        String str2;
        float f2;
        String str3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i14;
        QuirkSettingsLoader quirkSettingsLoader3;
        immediateFailedFuture immediatefailedfuture2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i15;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        int i16 = 2 % 2;
        int i17 = onExtraCallback + 61;
        onWarmupCompleted = i17 % 128;
        if (i17 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-480656643);
            if ((i3 & 78) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-480656643);
            if ((i3 & 6) == 0) {
            }
        }
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i18 = onExtraCallback + 97;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                int i21 = onExtraCallback + 25;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i7 = i2;
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i7) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        i9 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ^ true) ? 16384 : 8192) | i5;
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i9 |= 196608;
                    } else {
                        if ((i3 & 196608) == 0) {
                            quirkSettingsLoader2 = quirkSettingsLoader;
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader2) ? 131072 : 65536;
                        }
                        i11 = i4 & 64;
                        Object obj = null;
                        if (i11 != 0) {
                            int i23 = onWarmupCompleted + 51;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            i9 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            int i25 = onExtraCallback + 77;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfutureIAuthTabCallback);
                                throw null;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfutureIAuthTabCallback)) {
                                int i26 = onExtraCallback + 39;
                                onWarmupCompleted = i26 % 128;
                                if (i26 % 2 == 0) {
                                    throw null;
                                }
                                i12 = 1048576;
                            } else {
                                int i27 = onExtraCallback + 75;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                                i12 = 524288;
                            }
                            i9 |= i12;
                        }
                        i13 = i4 & 128;
                        if (i13 == 0) {
                            if ((12582912 & i3) == 0) {
                                str2 = str;
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 8388608 : 4194304;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                f2 = f;
                                str3 = str2;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                i14 = i7;
                                quirkSettingsLoader3 = quirkSettingsLoader2;
                                immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                            } else {
                                int i29 = onExtraCallback + 107;
                                onWarmupCompleted = i29 % 128;
                                if (i29 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i20 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                int i30 = i6 != 0 ? 1 : i7;
                                float f3 = i8 != 0 ? 1.0f : f;
                                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = i10 != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader2;
                                if (i11 != 0) {
                                    immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                                }
                                if (i13 != 0) {
                                    int i31 = onWarmupCompleted + 43;
                                    onExtraCallback = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    str2 = null;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-480656643, i9, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Lottie (TdsToastV1Presets.kt:75)");
                                }
                                int i32 = i9 << 3;
                                AppLovinStarRatingView.onWarmupCompleted(i, quirksExternalSyntheticBackport04, false, false, i30, f3, false, VirtualCameraInfo.onExtraCallbackWithResult(j), VirtualCameraInfo.onWarmupCompleted(j), quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, false, str2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i32 & 458752) | (i9 & 14) | ((i9 >> 3) & 112) | (57344 & i32) | ((i9 << 12) & 1879048192), ((i9 >> 18) & 14) | ((i9 >> 15) & 896), 2124);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                                str3 = str2;
                                float f4 = f3;
                                quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                i14 = i30;
                                f2 = f4;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeftPreset$.ExternalSyntheticLambda2(this, i, j, quirksExternalSyntheticBackport03, i14, f2, quirkSettingsLoader3, immediatefailedfuture2, str3, i3, i4));
                                return;
                            }
                            return;
                        }
                        i9 |= 12582912;
                        str2 = str;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    quirkSettingsLoader2 = quirkSettingsLoader;
                    i11 = i4 & 64;
                    Object obj2 = null;
                    if (i11 != 0) {
                    }
                    i13 = i4 & 128;
                    if (i13 == 0) {
                    }
                    str2 = str;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i9 = i5;
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                quirkSettingsLoader2 = quirkSettingsLoader;
                i11 = i4 & 64;
                Object obj22 = null;
                if (i11 != 0) {
                }
                i13 = i4 & 128;
                if (i13 == 0) {
                }
                str2 = str;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i2;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i5;
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            quirkSettingsLoader2 = quirkSettingsLoader;
            i11 = i4 & 64;
            Object obj222 = null;
            if (i11 != 0) {
            }
            i13 = i4 & 128;
            if (i13 == 0) {
            }
            str2 = str;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i33 = onWarmupCompleted + 49;
        onExtraCallback = i33 % 128;
        int i34 = i33 % 2;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i2;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i5;
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        quirkSettingsLoader2 = quirkSettingsLoader;
        i11 = i4 & 64;
        Object obj2222 = null;
        if (i11 != 0) {
        }
        i13 = i4 & 128;
        if (i13 == 0) {
        }
        str2 = str;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i9) == 4793490, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        long j2;
        int i4;
        QuirkSettingsLoader quirkSettingsLoader2;
        int i5;
        int i6;
        int i7;
        immediateFailedFuture immediatefailedfuture2;
        int i8;
        int i9;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str3;
        long j3;
        immediateFailedFuture immediatefailedfuture3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnTransact;
        String str4;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(104163060);
        if ((i & 6) == 0) {
            int i11 = onWarmupCompleted + 83;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i14 = onExtraCallback + 89;
            onWarmupCompleted = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true ? 16 : 32;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                j2 = j;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    int i16 = onWarmupCompleted + 99;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    quirkSettingsLoader2 = quirkSettingsLoader;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader2)) {
                        int i18 = onWarmupCompleted + 97;
                        onExtraCallback = i18 % 128;
                        i5 = i18 % 2 != 0 ? 25692 : 2048;
                    } else {
                        i5 = 1024;
                    }
                    i6 = i5 | i3;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        immediatefailedfuture2 = immediatefailedfuture;
                        i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture2) ? 16384 : 8192;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((i & 196608) == 0) {
                            int i19 = onExtraCallback + 7;
                            onWarmupCompleted = i19 % 128;
                            if (i19 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                                throw null;
                            }
                            i9 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 131072 : 65536) | i6;
                        }
                        if ((74899 & i9) != 74898) {
                            int i20 = onExtraCallback + 61;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
                            if (i13 != 0) {
                                int i22 = onExtraCallback + 109;
                                onWarmupCompleted = i22 % 128;
                                if (i22 % 2 == 0) {
                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                    throw null;
                                }
                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            }
                            if (i15 != 0) {
                                int i23 = onWarmupCompleted + 33;
                                onExtraCallback = i23 % 128;
                                if (i23 % 2 != 0) {
                                    setByteOrder.Companion.onTransact();
                                    throw null;
                                }
                                jOnTransact = setByteOrder.Companion.onTransact();
                            } else {
                                jOnTransact = j2;
                            }
                            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = i4 != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader2;
                            immediateFailedFuture immediatefailedfutureIAuthTabCallback = i7 != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture2;
                            if (i8 != 0) {
                                int i24 = onWarmupCompleted + 19;
                                onExtraCallback = i24 % 128;
                                if (i24 % 2 != 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(104163060, i9, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Icon (TdsToastV1Presets.kt:97)");
                            }
                            int i25 = i9 << 9;
                            AppLovinNativeAdImplc.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport03, jOnTransact, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i9 & 1022) | (3670016 & i25) | (29360128 & i25) | (i25 & 234881024), 56);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
                            str3 = str4;
                            j3 = jOnTransact;
                            immediatefailedfuture3 = immediatefailedfutureIAuthTabCallback;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            str3 = str2;
                            j3 = j2;
                            immediatefailedfuture3 = immediatefailedfuture2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeftPreset$.ExternalSyntheticLambda3(this, str, quirksExternalSyntheticBackport02, j3, quirkSettingsLoader2, immediatefailedfuture3, str3, i, i2));
                            return;
                        }
                        return;
                    }
                    int i26 = onExtraCallback + 43;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    i6 |= 196608;
                    i9 = i6;
                    if ((74899 & i9) != 74898) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                immediatefailedfuture2 = immediatefailedfuture;
                i8 = i2 & 32;
                if (i8 != 0) {
                }
                i9 = i6;
                if ((74899 & i9) != 74898) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            quirkSettingsLoader2 = quirkSettingsLoader;
            i6 = i3;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            immediatefailedfuture2 = immediatefailedfuture;
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            i9 = i6;
            if ((74899 & i9) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        j2 = j;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        quirkSettingsLoader2 = quirkSettingsLoader;
        i6 = i3;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        immediatefailedfuture2 = immediatefailedfuture;
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        i9 = i6;
        if ((74899 & i9) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i5;
        int i6;
        long jOnTransact;
        int i7;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i8;
        final QuirkSettingsLoader quirkSettingsLoader;
        final immediateFailedFuture immediatefailedfuture;
        final String str;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        final long j;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        final y0a y0aVar = (y0a) objArr[0];
        final Object obj = objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (QuirkSettingsLoader) objArr[4];
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (immediateFailedFuture) objArr[5];
        String str2 = (String) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(781537051);
        if ((iIntValue & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj))) {
                int i11 = onWarmupCompleted + 119;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i = i9 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i13 = iIntValue2 & 2;
        if (i13 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 32 : 16;
        }
        int i14 = iIntValue2 & 4;
        if (i14 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 256 : 128;
        }
        int i15 = iIntValue2 & 8;
        if (i15 == 0) {
            if ((iIntValue & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoaderOnExtraCallback)) {
                    int i16 = onExtraCallback + 125;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    i2 = 2048;
                } else {
                    i2 = 1024;
                }
                i3 = i2 | i;
            }
            i4 = iIntValue2 & 16;
            if (i4 != 0) {
                if ((iIntValue & 24576) == 0) {
                    int i18 = onWarmupCompleted + 85;
                    onextracallback = onextracallback3;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfutureIAuthTabCallback)) {
                        int i20 = onWarmupCompleted + 11;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = iIntValue2 & 32;
                if (i6 == 0) {
                    if ((196608 & iIntValue) == 0) {
                        int i22 = onExtraCallback + 73;
                        jOnTransact = jLongValue;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 == 0) {
                            int i23 = 91 / 0;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                                int i24 = onExtraCallback + 89;
                                onWarmupCompleted = i24 % 128;
                                if (i24 % 2 == 0) {
                                    throw null;
                                }
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) == 74898) {
                        int i25 = onWarmupCompleted + 3;
                        onExtraCallback = i25 % 128;
                        int i26 = i25 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        i8 = iIntValue;
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                        quirkSettingsLoader = quirkSettingsLoaderOnExtraCallback;
                        immediatefailedfuture = immediatefailedfutureIAuthTabCallback;
                        str = str2;
                        onextracallback2 = onextracallback;
                        j = jOnTransact;
                    } else {
                        int i27 = onWarmupCompleted + 21;
                        onExtraCallback = i27 % 128;
                        int i28 = i27 % 2;
                        if (i13 != 0) {
                            onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if (i14 != 0) {
                            jOnTransact = setByteOrder.Companion.onTransact();
                        }
                        if (i15 != 0) {
                            int i29 = onExtraCallback + 91;
                            onWarmupCompleted = i29 % 128;
                            if (i29 % 2 == 0) {
                                QuirkSettingsLoader.Companion.onExtraCallback();
                                throw null;
                            }
                            quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                        }
                        QuirkSettingsLoader quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
                        if (i4 != 0) {
                            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                        }
                        immediateFailedFuture immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                        String str3 = i6 != 0 ? null : str2;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i30 = onWarmupCompleted + 125;
                            onExtraCallback = i30 % 128;
                            if (i30 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(781537051, i3, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Icon (TdsToastV1Presets.kt:116)");
                                int i31 = 9 / 0;
                            } else {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(781537051, i3, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Icon (TdsToastV1Presets.kt:116)");
                            }
                        }
                        int i32 = i3 << 12;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        i8 = iIntValue;
                        AppLovinNativeAdImplc.onExtraCallback(obj, jOnTransact, (QuirksExternalSyntheticBackport0) onextracallback, str3, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, quirkSettingsLoader2, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 >> 6) & 7168) | (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (29360128 & i32) | (i32 & 234881024), 624);
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        immediatefailedfuture = immediatefailedfuture2;
                        quirkSettingsLoader = quirkSettingsLoader2;
                        onextracallback2 = onextracallback;
                        j = jOnTransact;
                        str = str3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final int i33 = i8;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.LeftPreset$$ExternalSyntheticLambda0
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i34 = 2 % 2;
                                int i35 = onExtraCallbackWithResult + 109;
                                onNavigationEvent = i35 % 128;
                                int i36 = i35 % 2;
                                Unit unitOnWarmupCompleted = y0a.onWarmupCompleted(this.f$0, obj, onextracallback2, j, quirkSettingsLoader, immediatefailedfuture, str, i33, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i37 = onNavigationEvent + 63;
                                onExtraCallbackWithResult = i37 % 128;
                                int i38 = i37 % 2;
                                return unitOnWarmupCompleted;
                            }
                        });
                    }
                    return null;
                }
                i3 |= 196608;
                jOnTransact = jLongValue;
                if ((74899 & i3) == 74898) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            }
            i3 |= 24576;
            onextracallback = onextracallback3;
            i6 = iIntValue2 & 32;
            if (i6 == 0) {
            }
            jOnTransact = jLongValue;
            if ((74899 & i3) == 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        i |= 3072;
        i3 = i;
        i4 = iIntValue2 & 16;
        if (i4 != 0) {
        }
        onextracallback = onextracallback3;
        i6 = iIntValue2 & 32;
        if (i6 == 0) {
        }
        jOnTransact = jLongValue;
        if ((74899 & i3) == 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    public final void IAuthTabCallback(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(263796451);
        if ((i & 6) == 0) {
            int i6 = onExtraCallback + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i8 = onExtraCallback + 113;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i10 = onExtraCallback + 43;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(263796451, i2, -1, "im.toss.tds.compose.component.compound.toast.v1.LeftPreset.Content (TdsToastV1Presets.kt:128)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onWarmupCompleted + 35;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LeftPreset$.ExternalSyntheticLambda1(this, function2, i));
        }
    }

    private static final Unit onExtraCallback(y0a y0aVar, Object obj, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {y0aVar, obj, quirksExternalSyntheticBackport0, Long.valueOf(j), quirkSettingsLoader, immediatefailedfuture, str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -79419669, 79419669, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(y0a y0aVar, String str, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {y0aVar, str, Long.valueOf(j), quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f), quirkSettingsLoader, immediatefailedfuture, str2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -1285243122, 1285243123, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@Nullable Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, obj, quirksExternalSyntheticBackport0, Long.valueOf(j), quirkSettingsLoader, immediatefailedfuture, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 654749166, -654749164, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }
}
