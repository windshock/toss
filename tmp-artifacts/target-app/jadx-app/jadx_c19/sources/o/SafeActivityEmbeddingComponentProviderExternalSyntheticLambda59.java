package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.appsintoss.R;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59;
import o.mExternalSyntheticApiModelOutline1;
import o.mc;
import o.roundUpToNearestHalfInt;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, boolean z, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 17;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onNavigationEvent(quirksExternalSyntheticBackport0, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 55;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppsInTossProduct appsInTossProduct, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appsInTossProduct, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 72 / 0;
        }
        int i7 = onExtraCallbackWithResult + 15;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, boolean z, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 45;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, z, function0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        if (i7 == 0) {
            int i8 = 16 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0);
        int i5 = onExtraCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, boolean z, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(function0, z, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, z, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(AppsInTossProduct appsInTossProduct, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                int i6 = onExtraCallback + 117;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i8 = onExtraCallback + 29;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 99;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1034618675, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationContent.<anonymous>.<anonymous> (InAppPurchasePreparationContent.kt:46)");
            }
            Character chLastOrNull = StringsKt.lastOrNull(appsInTossProduct.IAuthTabCallback());
            FaceDetectCallBack faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
            boolean zOnExtraCallback = FaceDetectCallBack.onExtraCallback(faceDetectCallBack, appsInTossProduct.IAuthTabCallback(), false, 2, (Object) null);
            String strIAuthTabCallback = appsInTossProduct.IAuthTabCallback();
            if (chLastOrNull != null && faceDetectCallBack.IAuthTabCallback(chLastOrNull.charValue())) {
                str = zOnExtraCallback ? "을" : "를";
            }
            mcVar.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_in_app_purchase_title_part, new Object[]{appsInTossProduct.onNavigationEvent(), strIAuthTabCallback + str}, cameraCaptureResultEmptyCameraCaptureResult, 0), mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, 0, (getHumanReadableName) null, 0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(28), 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, ((i3 << 15) & 458752) | 3456, 20412);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(final Function0 function0, boolean z, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 47;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
            if ((i2 & 66) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint) ? 4 : 2);
            } else {
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
            if ((i2 & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i6 = onExtraCallback + 85;
            onExtraCallbackWithResult = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 25;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-68383233, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationContent.<anonymous> (InAppPurchasePreparationContent.kt:70)");
                    int i8 = 39 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-68383233, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationContent.<anonymous> (InAppPurchasePreparationContent.kt:70)");
                }
            }
            int i9 = (i3 << 24) & 234881024;
            roundUpToNearestHalfInt.onNavigationEvent(1709978979, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1709978978, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), new Object[]{rounduptonearesthalfint, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_disclaimer_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, 0L, null, null, 0, Float.valueOf(0.0f), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i9), 254}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted());
            rounduptonearesthalfint.IAuthTabCallbackStub(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_disclaimer_content, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, (handshake) null, 0, 0.0f, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResult, i9, 254);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_cta_purchase, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationContentKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 97;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            Function0 function03 = function0;
                            if (i12 != 0) {
                                return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onWarmupCompleted(function03);
                            }
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onWarmupCompleted(function03);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj2 = function02;
                }
                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, null, null, null, (Function0) obj2, null, false, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, 48, 444}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, boolean z, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z4;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1818728297);
        int i9 = i3 & 1;
        if (i9 != 0) {
            int i10 = onExtraCallbackWithResult + 19;
            onExtraCallback = i10 % 128;
            i4 = i10 % 2 != 0 ? i2 | 122 : i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i11 = onExtraCallback + 19;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i14 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                    int i16 = onExtraCallbackWithResult + 17;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if ((i4 & 1171) == 1170) {
                z3 = true;
            } else {
                int i18 = onExtraCallbackWithResult + 61;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i13 != 0) {
                    int i20 = onExtraCallback + 37;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1818728297, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationContent (InAppPurchasePreparationContent.kt:29)");
                }
                final AppsInTossProduct appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface();
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport04);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i22 = onExtraCallbackWithResult + 79;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                final boolean z5 = z4;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                AppLovinNativeAdImplc.onExtraCallbackWithResult(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallbackStub(), setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), 0.0f, 0.0f, 12, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f))), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 508);
                r8lambda4JCsOS_fRrbU6o4wWMePlfE_iLw.onExtraCallback(ForwardingCameraControl.onExtraCallback(1034618675, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationContentKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i23 = 2 % 2;
                        int i24 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        AppsInTossProduct appsInTossProduct = appsInTossProductAsInterface;
                        mc mcVar = (mc) obj;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (i25 != 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onNavigationEvent(appsInTossProduct, mcVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onNavigationEvent(appsInTossProduct, mcVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{onextracallback, 0L, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), null, ForwardingCameraControl.onExtraCallback(-68383233, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationContentKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i23 = 2 % 2;
                        int i24 = IAuthTabCallback + 43;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onWarmupCompleted(function0, z5, (roundUpToNearestHalfInt) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i26 = onExtraCallbackWithResult + 105;
                        IAuthTabCallback = i26 % 128;
                        if (i26 % 2 != 0) {
                            int i27 = 28 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24966, 10}, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                z2 = z5;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z6 = z2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationContentKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i23 = 2 % 2;
                        int i24 = onExtraCallback + 115;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onNavigationEvent(quirksExternalSyntheticBackport03, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, z6, function0, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i26 = onExtraCallback + 39;
                        onNavigationEvent = i26 % 128;
                        if (i26 % 2 != 0) {
                            int i27 = 53 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
        }
        if ((i4 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
