package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.hasMasks;
import o.isFeatureFlagEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class hasMasks {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;
    private final isFeatureFlagEnabled onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(hasMasks hasmasks, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(hasmasks, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(hasmasks, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(hasMasks hasmasks, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        hasmasks.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 38 / 0;
        }
        return unit;
    }

    public hasMasks(@NotNull isFeatureFlagEnabled isfeatureflagenabled, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(isfeatureflagenabled, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = isfeatureflagenabled;
        this.onNavigationEvent = function0;
        this.onExtraCallbackWithResult = isfeatureflagenabled.onExtraCallback();
    }

    public final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-16724036);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = onExtraCallback + 23;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-16724036, i2, -1, "im.toss.compose.v0.SecureKeyItem.Binder (SecureKeyboard.kt:191)");
                int i8 = onExtraCallback + 3;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            isFeatureFlagEnabled isfeatureflagenabled = this.onWarmupCompleted;
            if (isfeatureflagenabled instanceof isFeatureFlagEnabled.onWarmupCompleted) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1108073081);
                getSpeed.onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 181220135, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{(isFeatureFlagEnabled.onWarmupCompleted) this.onWarmupCompleted, this.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -181220133);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else if (isfeatureflagenabled instanceof isFeatureFlagEnabled.IAuthTabCallback) {
                int i10 = onExtraCallback + 53;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1108075161);
                getSpeed.onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1065747955, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{(isFeatureFlagEnabled.IAuthTabCallback) this.onWarmupCompleted, this.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1065747951);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                if (!(isfeatureflagenabled instanceof isFeatureFlagEnabled.onExtraCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1108071521);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = IAuthTabCallback + 35;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1108077184);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.SecureKeyItem$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = onWarmupCompleted + 89;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitOnExtraCallback = hasMasks.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i17 = onWarmupCompleted + 101;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            });
        }
    }
}
