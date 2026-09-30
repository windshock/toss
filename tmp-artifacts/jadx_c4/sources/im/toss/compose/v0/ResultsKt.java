package im.toss.compose.v0;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ACPayResult;
import o.AppLovinNativeAdImplc;
import o.AppLovinPostbackService;
import o.AppLovinStarRatingView;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.IOOMCallback;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda2;
import o.addFixedPosition;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.createCameraCaptureCallback;
import o.getAwbState;
import o.getHumanReadableName;
import o.immediateFailedFuture;
import o.initMiniApp;
import o.initSDK;
import o.isRepeatingEnabled;
import o.removeAllLottieOnCompositionLoadedListener;
import o.resolveQuirkNames;
import o.setAdvertiser;
import o.setCallToAction;
import o.setTaggedAddrCtrl;
import o.setThreadList;
import o.toPreviewOnlyRange;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResultsKt {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback, long j, String str3, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, iAuthTabCallback, j, str3, onwarmupcompleted, onextracallback, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 99;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 14 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0);
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback, long j, String str, String str2, String str3, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, iAuthTabCallback, j, str, str2, str3, onwarmupcompleted, onextracallback, function0, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback, long j, String str3, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, iAuthTabCallback, j, str3, onwarmupcompleted, onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 39;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        if (function0 != null) {
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback, long j, String str, String str2, String str3, setCallToAction.onWarmupCompleted onwarmupcompleted, setCallToAction.onExtraCallback onextracallback, final Function0 function0, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        ?? r26;
        float f;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
            if ((i & 23) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
            if ((i & 48) == 0) {
            }
        }
        if ((i2 & 145) != 144) {
            int i6 = IAuthTabCallback + 107;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = IAuthTabCallback + 19;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 63;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(612085491, i2, -1, "im.toss.compose.v0.TdsResultV0.<anonymous> (Results.kt:62)");
                    int i10 = 9 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(612085491, i2, -1, "im.toss.compose.v0.TdsResultV0.<anonymous> (Results.kt:62)");
                }
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0), 0.0f, 1, (Object) null), fIAuthTabCallback, 0.0f, fIAuthTabCallback, 0.0f, 10, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (iAuthTabCallback instanceof removeAllLottieOnCompositionLoadedListener.IAuthTabCallback.onWarmupCompleted) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1267491112);
                r26 = 0;
                AppLovinStarRatingView.IAuthTabCallback(((removeAllLottieOnCompositionLoadedListener.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback).IAuthTabCallback(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, j), false, false, 0, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 8188);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            } else if (iAuthTabCallback instanceof removeAllLottieOnCompositionLoadedListener.IAuthTabCallback.C0030IAuthTabCallback) {
                int i11 = onNavigationEvent + 51;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1267699277);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((removeAllLottieOnCompositionLoadedListener.IAuthTabCallback.C0030IAuthTabCallback) iAuthTabCallback).onWarmupCompleted(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, j), null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                r26 = false;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1267871730);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                r26 = false;
            }
            if (str == null) {
                int i13 = onNavigationEvent + 111;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1267938968);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i14 = 51 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1267938968);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                i3 = 1;
                f = 0.0f;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1267938969);
                f = 0.0f;
                i3 = 1;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(iAuthTabCallback != null ? 10.0f : 0.0f), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r26), Boolean.valueOf((boolean) r26), isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((int) r26), 196608, 98032}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (str2 == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1268416368);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1268416369);
                float f2 = f;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 13, (Object) null), f2, i3, (Object) null), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService()), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(f2), null, null, 0L, Integer.valueOf((int) r26), Boolean.valueOf((boolean) r26), null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, Integer.valueOf((int) r26), 130800}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (str3 == null) {
                int i15 = onNavigationEvent + 5;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1268811804);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1268811805);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                setCallToAction.IAuthTabCallback IAuthTabCallback2 = setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback();
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent != i3) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.compose.v0.ResultsKt$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i17 = 2 % 2;
                                int i18 = onExtraCallbackWithResult + 59;
                                onWarmupCompleted = i18 % 128;
                                int i19 = i18 % 2;
                                Unit unitOnExtraCallbackWithResult = ResultsKt.onExtraCallbackWithResult(function0);
                                int i20 = onExtraCallbackWithResult + 117;
                                onWarmupCompleted = i20 % 128;
                                int i21 = i20 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function02);
                        obj = function02;
                    }
                    setAdvertiser.onExtraCallbackWithResult(str3, (QuirksExternalSyntheticBackport0) null, IAuthTabCallback2, onwarmupcompleted, onextracallback, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj, false, false, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 1762);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = IAuthTabCallback + 91;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i18 = 69 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable String str2, @Nullable removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback, long j, @Nullable String str3, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        String str4;
        int i5;
        removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback2;
        int i6;
        long jOnNavigationEvent;
        int i7;
        int i8;
        int i9;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str5;
        final String str6;
        final setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        String str7;
        int i10;
        int i11;
        int iOrdinal;
        int i12 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1447938846);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str4 = str2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        iAuthTabCallback2 = iAuthTabCallback;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2)) {
                            int i15 = IAuthTabCallback + 59;
                            onNavigationEvent = i15 % 128;
                            i6 = i15 % 2 != 0 ? 29199 : 2048;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    if ((i & 24576) != 0) {
                        int i16 = IAuthTabCallback + 37;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        if ((i2 & 16) == 0) {
                            jOnNavigationEvent = j;
                            int i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent) ? 16384 : 8192;
                            i3 |= i18;
                        } else {
                            jOnNavigationEvent = j;
                        }
                        i3 |= i18;
                    } else {
                        jOnNavigationEvent = j;
                    }
                    i7 = i2 & 32;
                    Function0<Unit> function02 = null;
                    if (i7 == 0) {
                        int i19 = onNavigationEvent + 109;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 == 0) {
                            function02.hashCode();
                            throw null;
                        }
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                            int i20 = IAuthTabCallback + 119;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) != 0) {
                            i11 = 524288;
                            i3 |= i11;
                        } else {
                            if (onwarmupcompleted == null) {
                                int i22 = IAuthTabCallback + 49;
                                onNavigationEvent = i22 % 128;
                                int i23 = i22 % 2;
                                iOrdinal = -1;
                            } else {
                                iOrdinal = onwarmupcompleted.ordinal();
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal)) {
                                int i24 = onNavigationEvent + 71;
                                IAuthTabCallback = i24 % 128;
                                int i25 = i24 % 2;
                                i11 = 1048576;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((12582912 & i) == 0) {
                        int i26 = onNavigationEvent + 69;
                        IAuthTabCallback = i26 % 128;
                        if (i26 % 2 != 0 ? (i2 & 128) != 0 : (i2 & 10391) != 0) {
                            i10 = 4194304;
                            i3 |= i10;
                        } else {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback == null ? -1 : onextracallback.ordinal())) {
                                i10 = 8388608;
                            }
                            i3 |= i10;
                        }
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                        if ((100663296 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 67108864 : 33554432;
                        }
                        if ((i3 & 38347923) != 38347922) {
                            int i27 = onNavigationEvent + 63;
                            IAuthTabCallback = i27 % 128;
                            z = i27 % 2 != 0;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                str5 = i14 != 0 ? null : str;
                                if (i4 != 0) {
                                    str4 = null;
                                }
                                if (i5 != 0) {
                                    iAuthTabCallback2 = null;
                                }
                                if ((i2 & 16) != 0) {
                                    jOnNavigationEvent = iAuthTabCallback2 instanceof removeAllLottieOnCompositionLoadedListener.IAuthTabCallback.onWarmupCompleted ? VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f)) : VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                                    i3 &= -57345;
                                }
                                if (i7 != 0) {
                                    str7 = null;
                                } else {
                                    int i28 = onNavigationEvent + 1;
                                    IAuthTabCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    str7 = str3;
                                }
                                if ((i2 & 64) != 0) {
                                    onwarmupcompletedIAuthTabCallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setAdvertiser.onExtraCallback())).IAuthTabCallback();
                                    i3 &= -3670017;
                                } else {
                                    onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                                }
                                if ((i2 & 128) != 0) {
                                    onextracallbackOnWarmupCompleted = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setAdvertiser.onExtraCallback())).onWarmupCompleted();
                                    i3 = (-29360129) & i3;
                                } else {
                                    onextracallbackOnWarmupCompleted = onextracallback;
                                }
                                if (i9 == 0) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1447938846, i3, -1, "im.toss.compose.v0.TdsResultV0 (Results.kt:60)");
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
                                final long j2 = jOnNavigationEvent;
                                final String str8 = str5;
                                final String str9 = str4;
                                final String str10 = str7;
                                final setCallToAction.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedIAuthTabCallback;
                                final setCallToAction.onExtraCallback onextracallback2 = onextracallbackOnWarmupCompleted;
                                final Function0<Unit> function03 = function02;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                setThreadList.IAuthTabCallback(IOOMCallback.Result, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(612085491, true, new setTaggedAddrCtrl() { // from class: im.toss.compose.v0.ResultsKt$$ExternalSyntheticLambda0
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        int i30 = 2 % 2;
                                        int i31 = onExtraCallback + 53;
                                        onExtraCallbackWithResult = i31 % 128;
                                        int i32 = i31 % 2;
                                        Unit unitOnExtraCallbackWithResult = ResultsKt.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, iAuthTabCallback3, j2, str8, str9, str10, onwarmupcompleted2, onextracallback2, function03, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                        int i33 = onExtraCallbackWithResult + 87;
                                        onExtraCallback = i33 % 128;
                                        int i34 = i33 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 30);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                str6 = str7;
                            } else {
                                int i30 = onNavigationEvent + 101;
                                IAuthTabCallback = i30 % 128;
                                if (i30 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 75) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    str5 = str;
                                    str7 = str3;
                                    onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                                    onextracallbackOnWarmupCompleted = onextracallback;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 16) != 0) {
                                    }
                                    if ((i2 & 64) != 0) {
                                    }
                                    if ((i2 & 128) != 0) {
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    str5 = str;
                                    str7 = str3;
                                    onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                                    onextracallbackOnWarmupCompleted = onextracallback;
                                }
                            }
                            function02 = function0;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport03;
                            final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback32 = iAuthTabCallback2;
                            final long j22 = jOnNavigationEvent;
                            final String str82 = str5;
                            final String str92 = str4;
                            final String str102 = str7;
                            final setCallToAction.onWarmupCompleted onwarmupcompleted22 = onwarmupcompletedIAuthTabCallback;
                            final setCallToAction.onExtraCallback onextracallback22 = onextracallbackOnWarmupCompleted;
                            final Function0 function032 = function02;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport03;
                            setThreadList.IAuthTabCallback(IOOMCallback.Result, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(612085491, true, new setTaggedAddrCtrl() { // from class: im.toss.compose.v0.ResultsKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int i302 = 2 % 2;
                                    int i31 = onExtraCallback + 53;
                                    onExtraCallbackWithResult = i31 % 128;
                                    int i32 = i31 % 2;
                                    Unit unitOnExtraCallbackWithResult = ResultsKt.onExtraCallbackWithResult(quirksExternalSyntheticBackport042, iAuthTabCallback32, j22, str82, str92, str102, onwarmupcompleted22, onextracallback22, function032, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i33 = onExtraCallbackWithResult + 87;
                                    onExtraCallback = i33 % 128;
                                    int i34 = i33 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 30);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport052;
                            str6 = str7;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            str5 = str;
                            str6 = str3;
                            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
                            onextracallbackOnWarmupCompleted = onextracallback;
                            function02 = function0;
                        }
                        final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
                        final long j3 = jOnNavigationEvent;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final String str11 = str5;
                            final String str12 = str4;
                            final setCallToAction.onExtraCallback onextracallback3 = onextracallbackOnWarmupCompleted;
                            final Function0<Unit> function04 = function02;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.ResultsKt$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i31 = 2 % 2;
                                    int i32 = onExtraCallback + 45;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    Unit unitOnExtraCallback = ResultsKt.onExtraCallback(quirksExternalSyntheticBackport02, str11, str12, iAuthTabCallback4, j3, str6, onwarmupcompletedIAuthTabCallback, onextracallback3, function04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i34 = IAuthTabCallback + 15;
                                    onExtraCallback = i34 % 128;
                                    if (i34 % 2 == 0) {
                                        int i35 = 65 / 0;
                                    }
                                    return unitOnExtraCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    }
                    final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback42 = iAuthTabCallback2;
                    final long j32 = jOnNavigationEvent;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                iAuthTabCallback2 = iAuthTabCallback;
                if ((i & 24576) != 0) {
                }
                i7 = i2 & 32;
                Function0<Unit> function022 = null;
                if (i7 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((12582912 & i) == 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                if ((i3 & 38347923) != 38347922) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                }
                final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback422 = iAuthTabCallback2;
                final long j322 = jOnNavigationEvent;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            iAuthTabCallback2 = iAuthTabCallback;
            if ((i & 24576) != 0) {
            }
            i7 = i2 & 32;
            Function0<Unit> function0222 = null;
            if (i7 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback4222 = iAuthTabCallback2;
            final long j3222 = jOnNavigationEvent;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        iAuthTabCallback2 = iAuthTabCallback;
        if ((i & 24576) != 0) {
        }
        i7 = i2 & 32;
        Function0<Unit> function02222 = null;
        if (i7 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        final removeAllLottieOnCompositionLoadedListener.IAuthTabCallback iAuthTabCallback42222 = iAuthTabCallback2;
        final long j32222 = jOnNavigationEvent;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
