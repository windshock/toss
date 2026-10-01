package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.sendMsgToIDEOpt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class sendMsgToIDEOpt {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 72 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return IAuthTabCallback(quirksExternalSyntheticBackport0, str, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(quirksExternalSyntheticBackport0, str, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1090580654);
        int i8 = i2 & 1;
        if (i8 != 0) {
            int i9 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i9 % 128;
            i3 = i9 % 2 == 0 ? i | 93 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i10 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i10 % 128;
                i4 = i10 % 2 == 0 ? 77 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jLongValue = j;
                int i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 256 : 128;
                i3 |= i11;
            } else {
                jLongValue = j;
            }
            i3 |= i11;
        } else {
            jLongValue = j;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i12 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i8 != 0) {
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    int i14 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if ((i2 & 4) != 0) {
                    int i16 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 127)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                        i3 &= 12340;
                    } else {
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                        i3 &= -897;
                    }
                }
                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 4) != 0) {
                    int i17 = onExtraCallbackWithResult;
                    int i18 = i17 + 77;
                    onNavigationEvent = i18 % 128;
                    i3 = i18 % 2 == 0 ? i3 & 7371 : i3 & (-897);
                    int i19 = i17 + 91;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                }
                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
            }
            int i21 = i3;
            long j3 = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1090580654, i21, -1, "im.toss.feature.credit.ui.main.home.component.ScoreText (ScoreText.kt:17)");
            }
            int iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
            int i22 = i21 << 3;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport06, null, Long.valueOf(j3), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i21 >> 3) & 14) | 805330944 | (i22 & 112) | (i22 & 7168)), 196608, 97508}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            j2 = j3;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            j2 = jLongValue;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.ScoreTextKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i23 = 2 % 2;
                    int i24 = onNavigationEvent + 49;
                    onExtraCallbackWithResult = i24 % 128;
                    if (i24 % 2 == 0) {
                        return sendMsgToIDEOpt.onNavigationEvent(quirksExternalSyntheticBackport03, str, j2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    sendMsgToIDEOpt.onNavigationEvent(quirksExternalSyntheticBackport03, str, j2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
        }
    }
}
