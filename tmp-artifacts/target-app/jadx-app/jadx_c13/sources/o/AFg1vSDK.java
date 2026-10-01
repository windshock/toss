package o;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1vSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getPrivacyDestinationUri;
import o.setUpNativeAdViewComponents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1vSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 119;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 65;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setUpNativeAdViewComponents setupnativeadviewcomponents, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(setupnativeadviewcomponents, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(setupnativeadviewcomponents, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 113;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(setUpNativeAdViewComponents setupnativeadviewcomponents, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(setupnativeadviewcomponents, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172 A[PHI: r18 r19
      0x0172: PHI (r18v3 o.QuirksExternalSyntheticBackport0) = (r18v1 o.QuirksExternalSyntheticBackport0), (r18v4 o.QuirksExternalSyntheticBackport0) binds: [B:42:0x0170, B:39:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r19v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r19v3 o.CameraCaptureResultEmptyCameraCaptureResult), (r19v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:42:0x0170, B:39:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jIEngagementSignalsCallbackStub;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 51;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1394435642);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i9 = IAuthTabCallback + 17;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i11 = IAuthTabCallback + 93;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
            int i13 = IAuthTabCallback + 123;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 / 2;
            }
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            int i15 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i17 = IAuthTabCallback + 105;
            onExtraCallback = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 14 / 0;
                quirksExternalSyntheticBackport03 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            } else if (i8 != 0) {
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1394435642, i3, -1, "im.toss.tosssecurities.uikit.extension.NoticeIcon (NoticeIcon.kt:20)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
            RoundedCornerShape roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), roundedCornerShapeOnWarmupCompleted), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
            deprecated_followRedirects deprecated_followredirectsOnWarmupCompleted = isDotDot.onWarmupCompleted(OkHttp.onExtraCallback);
            immediateFailedFuture immediatefailedfutureOnWarmupCompleted = immediateFailedFuture.Companion.onWarmupCompleted();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(22868288);
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(22869216);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
            }
            long j = jIEngagementSignalsCallbackStub;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i19 = onExtraCallback + 47;
            IAuthTabCallback = i19 % 128;
            if (i19 % 2 != 0) {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirectsOnWarmupCompleted, quirksExternalSyntheticBackport0OnWarmupCompleted, j, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureOnWarmupCompleted, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 32439);
                if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirectsOnWarmupCompleted, quirksExternalSyntheticBackport0OnWarmupCompleted, j, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureOnWarmupCompleted, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 12582912, 376);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.extension.NoticeIconKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 51;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnExtraCallbackWithResult = AFg1vSDK.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i23 = onWarmupCompleted + 49;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    public static final void onExtraCallback(@NotNull final setUpNativeAdViewComponents setupnativeadviewcomponents, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(setupnativeadviewcomponents, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1626745357);
        if ((i & 6) == 0) {
            int i7 = IAuthTabCallback + 51;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setupnativeadviewcomponents)) {
                i3 = 4;
            } else {
                int i9 = onExtraCallback + 25;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i11 = onExtraCallback + 3;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1626745357, i2, -1, "im.toss.tosssecurities.uikit.extension.NoticeAcc (NoticeIcon.kt:33)");
            }
            setupnativeadviewcomponents.IAuthTabCallback((getPrivacyDestinationUri.IAuthTabCallback) null, AFg1pSDK.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.extension.NoticeIconKt$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 61;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    setUpNativeAdViewComponents setupnativeadviewcomponents2 = setupnativeadviewcomponents;
                    if (i15 == 0) {
                        return AFg1vSDK.onExtraCallbackWithResult(setupnativeadviewcomponents2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = AFg1vSDK.onExtraCallbackWithResult(setupnativeadviewcomponents2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i16 = 59 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }
}
