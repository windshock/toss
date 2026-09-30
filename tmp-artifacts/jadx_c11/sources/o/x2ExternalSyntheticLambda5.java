package o;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final x2ExternalSyntheticLambda5 onWarmupCompleted = new x2ExternalSyntheticLambda5();

    static {
        int i = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private x2ExternalSyntheticLambda5() {
    }

    public final x2ExternalSyntheticLambda33 onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1334142474, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Defaults.colors (TdsSliderV1.kt:51)");
        }
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33OnNavigationEvent = onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return x2externalsyntheticlambda33OnNavigationEvent;
        }
        throw null;
    }

    public final x2ExternalSyntheticLambda33 onExtraCallback(long j, long j2, long j3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            j = setByteOrder.Companion.onTransact();
            int i4 = onNavigationEvent + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i2 & 2) != 0) {
            j2 = setByteOrder.Companion.onTransact();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 121;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            j3 = setByteOrder.Companion.onTransact();
        }
        long j5 = j3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-925207577, i, -1, "im.toss.tds.compose.component.compound.slider.TdsSliderV1Defaults.colors (TdsSliderV1.kt:59)");
        }
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33IAuthTabCallback = onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)).IAuthTabCallback(j, j4, j5);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return x2externalsyntheticlambda33IAuthTabCallback;
    }

    public final x2ExternalSyntheticLambda33 onNavigationEvent(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33ICustomTabsCallback_Parcel = y2Var.ICustomTabsCallback_Parcel();
        if (x2externalsyntheticlambda33ICustomTabsCallback_Parcel != null) {
            int i4 = onExtraCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return x2externalsyntheticlambda33ICustomTabsCallback_Parcel;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.SliderHandleFill);
        Object[] objArr = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        x2ExternalSyntheticLambda33 x2externalsyntheticlambda33 = new x2ExternalSyntheticLambda33(jOnExtraCallback, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.SliderTrackFill), null);
        y2Var.onNavigationEvent(x2externalsyntheticlambda33);
        return x2externalsyntheticlambda33;
    }
}
