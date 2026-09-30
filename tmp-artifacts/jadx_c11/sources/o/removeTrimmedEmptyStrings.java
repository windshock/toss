package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.removeTrimmedEmptyStrings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class removeTrimmedEmptyStrings {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(removeTrimmedEmptyStrings removetrimmedemptystrings, String str, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onNavigationEvent(removetrimmedemptystrings, str, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(removetrimmedemptystrings, str, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(removeTrimmedEmptyStrings removetrimmedemptystrings, String str, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        removetrimmedemptystrings.onNavigationEvent(str, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return unit;
    }

    public final void onNavigationEvent(@NotNull final String str, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        long jOnUnminimized;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(37160714);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i7 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            int i9 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(37160714, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.DescriptionPreset.Description (TdsAgreementV4ExpandableAgreementPresets.kt:83)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(37160714, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.DescriptionPreset.Description (TdsAgreementV4ExpandableAgreementPresets.kt:83)");
            }
            hasProvider hasproviderOnNavigationEvent = AppLovinCmpErrorCode.onNavigationEvent(str, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 126, 0);
            getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1351719409);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1351720369);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                int i12 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            }
            long j = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnNavigationEvent, null, gethumanreadablenameIAuthTabCallback_Parcel, j, 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult2, 384, 1572864, 196594);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.DescriptionPreset$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 31;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallback = removeTrimmedEmptyStrings.onExtraCallback(this.f$0, str, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onNavigationEvent + 31;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }
}
