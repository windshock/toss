package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import im.toss.tosssecurities.uikit.compound.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1rSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getPrivacyDestinationUri;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1rSDK {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 109;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable String str2, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        String str3;
        String str4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final String str5;
        final String str6;
        String strOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        String str7;
        int i4;
        String strOnExtraCallback2;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-625363772);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = IAuthTabCallback + 67;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onExtraCallback + 79;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            if ((i2 & 2) == 0) {
                str3 = str;
                int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 32 : 16;
                i3 |= i12;
                int i13 = onExtraCallback + 49;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            } else {
                str3 = str;
            }
            i3 |= i12;
            int i132 = onExtraCallback + 49;
            IAuthTabCallback = i132 % 128;
            int i142 = i132 % 2;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            int i15 = IAuthTabCallback + 111;
            onExtraCallback = i15 % 128;
            if (i15 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
                str4 = str2;
            } else {
                str4 = str2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4)) {
                    int i16 = IAuthTabCallback + 87;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i5 = 256;
                }
                i3 |= i5;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if ((i2 & 2) != 0) {
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_sec_uikit_compound_network_error_default_message, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    i3 &= -113;
                } else {
                    strOnExtraCallback = str3;
                }
                if ((i2 & 4) != 0) {
                    int i18 = IAuthTabCallback + 11;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                    str7 = strOnExtraCallback;
                    i4 = i3 & (-897);
                    strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.toss_sec_uikit_compound_network_error_default_button_text, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i20 = IAuthTabCallback + 79;
                        onExtraCallback = i20 % 128;
                        if (i20 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-625363772, i4, -1, "im.toss.tosssecurities.uikit.compound.error.NetworkError (NetworkError.kt:18)");
                            int i21 = 31 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-625363772, i4, -1, "im.toss.tosssecurities.uikit.compound.error.NetworkError (NetworkError.kt:18)");
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport04, 0L, 0.0f, new getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null), 0L, str7, deprecated_followSslRedirects.onWarmupCompleted(R.drawable.icon_wifi_slash_grey), (String) null, function0, strOnExtraCallback2, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResult2, (i4 & 14) | 3072 | ((i4 << 12) & 458752) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), 0, 3222);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    str5 = str7;
                    str6 = strOnExtraCallback2;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                    str7 = strOnExtraCallback;
                    i4 = i3;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                i4 = i3;
                str7 = str3;
            }
            strOnExtraCallback2 = str4;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport04, 0L, 0.0f, new getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), RectangleShapeKt.onExtraCallback(), (DefaultConstructorMarker) null), 0L, str7, deprecated_followSslRedirects.onWarmupCompleted(R.drawable.icon_wifi_slash_grey), (String) null, function0, strOnExtraCallback2, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResult2, (i4 & 14) | 3072 | ((i4 << 12) & 458752) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192), 0, 3222);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            str5 = str7;
            str6 = strOnExtraCallback2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            str5 = str3;
            str6 = str4;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.error.NetworkErrorKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 45;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    Unit unitOnExtraCallback = AFf1rSDK.onExtraCallback(quirksExternalSyntheticBackport03, str5, str6, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i25 = onWarmupCompleted + 101;
                    IAuthTabCallback = i25 % 128;
                    int i26 = i25 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }
}
