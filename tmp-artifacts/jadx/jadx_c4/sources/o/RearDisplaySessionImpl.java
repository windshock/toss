package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.RearDisplaySessionImpl;
import o.handleNativeAdClick;
import o.w3b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RearDisplaySessionImpl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback.values().length];
            try {
                iArr[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback.SQUIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback.SQUARE.ordinal()] = 2;
                int i = onNavigationEvent + 123;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 3 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, appLovinNativeAdImplExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(w3b w3bVar, String str, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(w3bVar, str, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 29;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w3b w3bVar, String str, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(w3bVar, str, iAuthTabCallback, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 3 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(String str, AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda0)) {
                int i7 = onExtraCallback + 73;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onExtraCallback + 7;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = onExtraCallback + 83;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(929781034, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsListAsset.<anonymous> (NativeAdsBpsListAsset.kt:36)");
            }
            appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(str, StringsKt.endsWith(str, ".json", true) ? deprecated_eventListenerFactory.Lottie : deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 234881024 & (i2 << 24), 252);
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onTransact(), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 3;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void onNavigationEvent(@NotNull final w3b w3bVar, @NotNull final String str, @NotNull final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        handleNativeAdClick.onExtraCallback.asBinder asbinderOnExtraCallback;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-961836143);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(w3bVar)) {
                int i6 = onNavigationEvent + 59;
                onExtraCallback = i6 % 128;
                i4 = 4;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 3;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                i3 = 117;
                int i8 = onNavigationEvent + 117;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    i3 = 32;
                }
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback.ordinal()) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            int i9 = onNavigationEvent + 39;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-961836143, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsListAsset (NativeAdsBpsListAsset.kt:26)");
            }
            int i11 = onExtraCallbackWithResult.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
            if (i11 == 1) {
                asbinderOnExtraCallback = handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                asbinderOnExtraCallback = handleNativeAdClick.onExtraCallback.asBinder.Companion.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            setMainImageUri.onExtraCallbackWithResult(w3bVar.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion), asbinderOnExtraCallback, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, ForwardingCameraControl.onExtraCallback(929781034, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsListAssetKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnNavigationEvent = RearDisplaySessionImpl.onNavigationEvent(str, (AppLovinNativeAdImplExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 124);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsListAssetKt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 3;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    w3b w3bVar2 = w3bVar;
                    String str2 = str;
                    if (i14 != 0) {
                        RearDisplaySessionImpl.onWarmupCompleted(w3bVar2, str2, iAuthTabCallback, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = RearDisplaySessionImpl.onWarmupCompleted(w3bVar2, str2, iAuthTabCallback, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = onNavigationEvent + 41;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            });
            int i12 = onExtraCallback + 119;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
    }
}
