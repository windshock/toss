package o;

import androidx.compose.ui.graphics.painter.Painter;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.getPrivacyDestinationUri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda1 implements HighSpeedResolverExternalSyntheticLambda2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final HighSpeedResolverExternalSyntheticLambda2 IAuthTabCallback;
    private final immediateFailedFuture onExtraCallback;
    private final getPrivacyDestinationUri.onExtraCallbackWithResult onNavigationEvent;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i2;
        int i10 = ~i3;
        int i11 = i8 | (~(i9 | i10 | i5));
        int i12 = (~(i3 | i9 | i5)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i2 + i5 + i + (762713021 * i4) + (1579510587 * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-1364308824)) - 1074288667) + (i5 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i) + ((-893132913) * i4) + (986770329 * i6) + (i15 * (-1162149888));
        if (((i2 * (-1846875272)) - 1480523776) + ((-1846875272) * i5) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i) + ((-750387200) * i4) + ((-523632640) * i6) + ((-1971257344) * i15) + (i16 * i16 * (-1529413632)) == 1) {
            return onNavigationEvent(objArr);
        }
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        setByteOrder setbyteorder = (setByteOrder) objArr[3];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[4];
        String str = (String) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if ((iIntValue2 & 2) != 0) {
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue2 & 4) != 0) {
            setbyteorder = null;
        }
        immediateFailedFuture immediatefailedfuture2 = (iIntValue2 & 8) != 0 ? appLovinNativeAdImplExternalSyntheticLambda1.onExtraCallback : immediatefailedfuture;
        String str2 = (iIntValue2 & 16) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i18 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1555358697, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.LegacyImage (ContentPreset.kt:140)");
            int i20 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = iIntValue << 12;
        AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, onextracallback, setbyteorder != null ? setbyteorder.access100() : setByteOrder.Companion.onTransact(), null, null, null, null, immediatefailedfuture2, str2, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 126) | (29360128 & i22) | (i22 & 234881024), 120);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (i3 == 0) {
            this.IAuthTabCallback.onExtraCallbackWithResult(quirksExternalSyntheticBackport0);
            obj.hashCode();
            throw null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(quirksExternalSyntheticBackport0);
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        }
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader quirkSettingsLoader) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(quirkSettingsLoader, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(quirksExternalSyntheticBackport0, quirkSettingsLoader);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AppLovinNativeAdImplExternalSyntheticLambda1(@NotNull getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @NotNull immediateFailedFuture immediatefailedfuture, @NotNull HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(immediatefailedfuture, "");
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        this.onNavigationEvent = onextracallbackwithresult;
        this.onExtraCallback = immediatefailedfuture;
        this.IAuthTabCallback = highSpeedResolverExternalSyntheticLambda2;
    }

    public final getPrivacyDestinationUri.onExtraCallbackWithResult onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final immediateFailedFuture IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        immediateFailedFuture immediatefailedfuture = this.onExtraCallback;
        int i4 = i2 + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return immediatefailedfuture;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i6 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 8) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        immediateFailedFuture immediatefailedfuture2 = (i2 & 16) != 0 ? this.onExtraCallback : immediatefailedfuture;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1005256062, i, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.Image (ContentPreset.kt:42)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport02);
        int i8 = i << 12;
        AppLovinNativeAdImplc.onExtraCallback(str, jOnTransact, quirksExternalSyntheticBackport0OnExtraCallback, str3, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, quirkSettingsLoaderOnExtraCallback, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 7168) | (i & 14) | ((i >> 3) & 112) | (29360128 & i8) | (i8 & 234881024), 624);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        immediateFailedFuture immediatefailedfuture;
        AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = (QuirkSettingsLoader) objArr[4];
        immediateFailedFuture immediatefailedfuture2 = (immediateFailedFuture) objArr[5];
        String str = (String) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            if ((iIntValue2 & 3) != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            if ((iIntValue2 & 2) != 0) {
            }
        }
        if ((iIntValue2 & 4) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue2 & 8) != 0) {
            int i3 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                quirkSettingsLoaderOnExtraCallback2 = QuirkSettingsLoader.Companion.onExtraCallback();
                int i4 = 68 / 0;
                quirkSettingsLoaderOnExtraCallback = quirkSettingsLoaderOnExtraCallback2;
            } else {
                quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            }
        } else {
            quirkSettingsLoaderOnExtraCallback = quirkSettingsLoaderOnExtraCallback2;
        }
        if ((iIntValue2 & 16) != 0) {
            int i5 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            immediatefailedfuture = appLovinNativeAdImplExternalSyntheticLambda1.onExtraCallback;
        } else {
            immediatefailedfuture = immediatefailedfuture2;
        }
        String str2 = (iIntValue2 & 32) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-117403529, iIntValue, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.Image (ContentPreset.kt:62)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = appLovinNativeAdImplExternalSyntheticLambda1.onExtraCallback(quirksExternalSyntheticBackport0);
        int i7 = iIntValue << 9;
        AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, quirksExternalSyntheticBackport0OnExtraCallback, jLongValue, null, null, null, quirkSettingsLoaderOnExtraCallback, immediatefailedfuture, str2, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 910) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024), 56);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onWarmupCompleted(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        int i4 = 2 % 2;
        Object obj = null;
        if ((i3 & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            long jOnTransact = setByteOrder.Companion.onTransact();
            int i6 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            j2 = jOnTransact;
        } else {
            j2 = j;
        }
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i3 & 8) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        immediateFailedFuture immediatefailedfuture2 = (i3 & 16) != 0 ? this.onExtraCallback : immediatefailedfuture;
        String str2 = (i3 & 32) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1159846858, i2, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.Image (ContentPreset.kt:82)");
        }
        int i8 = i2 << 12;
        AppLovinNativeAdImplc.onExtraCallback(Integer.valueOf(i), j2, onExtraCallback(quirksExternalSyntheticBackport02), str2, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, quirkSettingsLoaderOnExtraCallback, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 6) & 7168) | (i2 & 14) | ((i2 >> 3) & 112) | (29360128 & i8) | (i8 & 234881024), 624);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setByteOrder setbyteorder, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setByteOrder setbyteorder2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 3) != 0) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i7 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 24 / 0;
            }
            setbyteorder2 = null;
        } else {
            setbyteorder2 = setbyteorder;
        }
        immediateFailedFuture immediatefailedfuture2 = (i2 & 8) != 0 ? this.onExtraCallback : immediatefailedfuture;
        String str3 = (i2 & 16) != 0 ? null : str2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-269693150, i, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.LegacyImage (ContentPreset.kt:102)");
            int i9 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        AppLovinNativeAdImplc.onExtraCallback(str, setbyteorder2 != null ? setbyteorder2.access100() : setByteOrder.Companion.onTransact(), quirksExternalSyntheticBackport02, str3, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i << 3) & 896) | ((i >> 3) & 7168) | ((i << 15) & 234881024), 752);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i11 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i12 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onExtraCallback(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setByteOrder setbyteorder, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str2;
        long jOnTransact;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i6 = 86 / 0;
            } else {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        setByteOrder setbyteorder2 = (i3 & 4) != 0 ? null : setbyteorder;
        immediateFailedFuture immediatefailedfuture2 = (i3 & 8) != 0 ? this.onExtraCallback : immediatefailedfuture;
        if ((i3 & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1352751176, i2, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.LegacyImage (ContentPreset.kt:121)");
        }
        if (setbyteorder2 != null) {
            int i10 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            jOnTransact = setbyteorder2.access100();
        } else {
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        AppLovinNativeAdImplc.onExtraCallback(Integer.valueOf(i), jOnTransact, quirksExternalSyntheticBackport02, str2, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 15) & 234881024) | (i2 & 14) | ((i2 << 3) & 896) | ((i2 >> 3) & 7168), 752);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirkSettingsLoader quirkSettingsLoader2;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        int i5 = (i3 & 4) != 0 ? 1 : i;
        float f2 = (i3 & 8) != 0 ? 1.0f : f;
        if ((i3 & 16) != 0) {
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            int i6 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
            quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
        } else {
            quirkSettingsLoader2 = quirkSettingsLoader;
        }
        Object obj = null;
        if ((i3 & 32) != 0) {
            int i8 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                immediateFailedFuture.Companion.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        String str3 = (i3 & 64) != 0 ? null : str2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(592801350, i2, -1, "im.toss.tds.compose.component.atom.asset.v1.ContentPreset.Lottie (ContentPreset.kt:160)");
        }
        int i9 = i2 << 6;
        AppLovinStarRatingView.IAuthTabCallback(str, quirksExternalSyntheticBackport02, false, false, i5, f2, false, this.onNavigationEvent.IAuthTabCallback(), this.onNavigationEvent.onExtraCallbackWithResult(), quirkSettingsLoader2, immediatefailedfutureIAuthTabCallback, false, str3, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 126) | (i9 & 57344) | (i9 & 458752) | ((i2 << 15) & 1879048192), ((i2 >> 15) & 14) | ((i2 >> 12) & 896), 2124);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, this.onNavigationEvent.IAuthTabCallback(), this.onNavigationEvent.onExtraCallbackWithResult()));
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, this.onNavigationEvent.IAuthTabCallback(), this.onNavigationEvent.onExtraCallbackWithResult()));
        }
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof AppLovinNativeAdImplExternalSyntheticLambda1)) {
                return false;
            }
            AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1 = (AppLovinNativeAdImplExternalSyntheticLambda1) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent)) {
                int i2 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(this.onExtraCallback, appLovinNativeAdImplExternalSyntheticLambda1.onExtraCallback);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, appLovinNativeAdImplExternalSyntheticLambda1.onExtraCallback) && this.IAuthTabCallback == appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback) {
                    int i3 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            return false;
        }
        int i5 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + System.identityHashCode(this.IAuthTabCallback);
        int i4 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final void onNavigationEvent(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, deprecated_followredirects, quirksExternalSyntheticBackport0, Long.valueOf(j), quirkSettingsLoader, immediatefailedfuture, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 285911272, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -285911271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public final void onNavigationEvent(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setByteOrder setbyteorder, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, deprecated_followredirects, quirksExternalSyntheticBackport0, setbyteorder, immediatefailedfuture, str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -502133600, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 502133600, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }
}
