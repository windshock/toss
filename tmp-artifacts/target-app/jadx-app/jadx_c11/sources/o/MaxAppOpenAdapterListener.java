package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.tds.compose.R;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.text.MessageFormat;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.InterfaceC0083handshake;
import o.MaxAppOpenAdapterListener;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.initSDK;
import o.setIso;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAppOpenAdapterListener implements RowScope {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final RowScope IAuthTabCallback;

    /* JADX WARN: Removed duplicated region for block: B:48:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        int i8;
        int i9 = ~i2;
        int i10 = ~i4;
        int i11 = i9 | i10;
        int i12 = ~(i11 | i6);
        int i13 = ~i6;
        int i14 = (~(i9 | i4)) | (~(i10 | i13)) | (~(i10 | i2));
        int i15 = ~(i13 | i11);
        int i16 = i2 + i4 + i3 + (1938118820 * i) + ((-1869228383) * i5);
        int i17 = i16 * i16;
        int i18 = ((i2 * 647972376) - 1941852458) + (i4 * 647972376) + (i12 * 1702) + (i14 * 851) + (i15 * 851) + (647973227 * i3) + ((-1260466036) * i) + (1557372491 * i5) + (i17 * 1239351296);
        int i19 = (i2 * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i12) + (i14 * (-1345052743)) + ((-1345052743) * i15) + (1903427584 * i3) + ((-1907359744) * i) + (1374945280 * i5) + (1516044288 * i17) + (i18 * i18 * 490405888);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        final String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) objArr[4];
        final String str2 = (String) objArr[5];
        final initSDK initsdk = (initSDK) objArr[6];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport03, "");
        if ((iIntValue & 6) == 0) {
            i7 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2) | iIntValue;
        } else {
            i7 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i21 = onExtraCallbackWithResult + 117;
            onExtraCallback = i21 % 128;
            int i22 = i21 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                int i23 = onExtraCallbackWithResult + 5;
                onExtraCallback = i23 % 128;
                i8 = i23 % 2 == 0 ? 73 : 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            int i24 = onExtraCallbackWithResult + 25;
            onExtraCallback = i24 % 128;
            int i25 = i24 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i7 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-755576163, i7, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.TextButton.<anonymous> (ActionPreset.kt:66)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport03.onExtraCallback(quirksExternalSyntheticBackport02);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            getTitleMarginEnd gettitlemarginendOnExtraCallback = getSharedInstance.onExtraCallback(false, false, 0L, new AppLovinAdClickListener(AppLovinAdSize.onWarmupCompleted.onExtraCallbackWithResult(), null), null, null, configureReward.onExtraCallback(0.9f, 1.0f), null, 183, null);
            Role roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onWarmupCompleted());
            boolean z2 = (i7 & 14) == 4;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(z2 | zOnNavigationEvent)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i26 = 2 % 2;
                            int i27 = onNavigationEvent + 65;
                            IAuthTabCallback = i27 % 128;
                            int i28 = i27 % 2;
                            Unit unitOnWarmupCompleted = MaxAppOpenAdapterListener.onWarmupCompleted(initsdk, function0);
                            int i29 = onNavigationEvent + 63;
                            IAuthTabCallback = i29 % 128;
                            if (i29 % 2 != 0) {
                                int i30 = 3 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(showRewardedAd.onWarmupCompleted(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, gettitlemarginendOnExtraCallback, false, (String) null, roleIAuthTabCallback, (Function0) obj, 12, (Object) null), (String) null, str, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 5), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                if (zBooleanValue) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(555039603);
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnNavigationEvent2;
                    quirksExternalSyntheticBackport0OnNavigationEvent = maxAppOpenAdapterListener.onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, MaxAdapterListener.onExtraCallbackWithResult.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)) << 32) | (Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) & 4294967295L)));
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnNavigationEvent2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-259182459);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport0OnNavigationEvent = QuirksExternalSyntheticBackport0.Companion;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i26 = onExtraCallbackWithResult + 79;
                    onExtraCallback = i26 % 128;
                    int i27 = i26 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!(zOnNavigationEvent2 | zOnNavigationEvent3)) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            Unit unitOnExtraCallback;
                            int i28 = 2 % 2;
                            int i29 = onNavigationEvent + 101;
                            onWarmupCompleted = i29 % 128;
                            if (i29 % 2 != 0) {
                                unitOnExtraCallback = MaxAppOpenAdapterListener.onExtraCallback(str2, str, (useAndConfigureProgramWithTexture) obj2);
                                int i30 = 6 / 0;
                            } else {
                                unitOnExtraCallback = MaxAppOpenAdapterListener.onExtraCallback(str2, str, (useAndConfigureProgramWithTexture) obj2);
                            }
                            int i31 = onWarmupCompleted + 39;
                            onNavigationEvent = i31 % 128;
                            int i32 = i31 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    int i28 = onExtraCallbackWithResult + 123;
                    onExtraCallback = i28 % 128;
                    int i29 = i28 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized3, 1, (Object) null), null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131068}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i30 = onExtraCallback + 73;
                    onExtraCallbackWithResult = i30 % 128;
                    int i31 = i30 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, long j2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(j, j2, setiso);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(j, j2, setiso);
        int i3 = onExtraCallbackWithResult + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(str, str2, useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, useandconfigureprogramwithtexture);
        int i3 = onExtraCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(maxAppOpenAdapterListener, str, function0, quirksExternalSyntheticBackport0, z, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 9;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(maxAppOpenAdapterListener, deprecated_followredirects, function0, str, quirksExternalSyntheticBackport0, j, z, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 13 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str, boolean z, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str2, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, function0, str, Boolean.valueOf(z), maxAppOpenAdapterListener, str2, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1893561406, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1893561404, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
        int i5 = onExtraCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) objArr[0];
        deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        String str = (String) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        String str2 = (String) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int iIntValue3 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirects, function0, str, iIntValue, quirksExternalSyntheticBackport0, jLongValue, str2, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), iIntValue3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, quirksExternalSyntheticBackport0, z, maxAppOpenAdapterListener, deprecated_followredirects, function0, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 89;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1918595159, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1918595159, new Object[]{maxAppOpenAdapterListener, deprecated_followredirects, function0, str, Integer.valueOf(i), quirksExternalSyntheticBackport0, Long.valueOf(j), str2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        throw null;
    }

    private static final Unit onNavigationEvent(MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        maxAppOpenAdapterListener.onExtraCallbackWithResult(deprecated_followredirects, (Function0<Unit>) function0, str, quirksExternalSyntheticBackport0, j, z, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 15;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -913803022, iOnExtraCallback2, 913803023, new Object[]{useandconfigureprogramwithtexture}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
        Boolean boolValueOf = Boolean.valueOf(z);
        Integer numValueOf = Integer.valueOf(iOnExtraCallbackWithResult);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i6 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, iOnExtraCallback2, -207608398, new Object[]{maxAppOpenAdapterListener, str, function0, quirksExternalSyntheticBackport0, boolValueOf, str2, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
        } else {
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, iOnExtraCallback4, -207608398, new Object[]{maxAppOpenAdapterListener, str, function0, quirksExternalSyntheticBackport0, boolValueOf, str2, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(initsdk, function0);
        }
        IAuthTabCallback(initsdk, function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaxAppOpenAdapterListener)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, ((MaxAppOpenAdapterListener) obj).IAuthTabCallback)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.IAuthTabCallback.hashCode();
            int i3 = 8 / 0;
        } else {
            iHashCode = this.IAuthTabCallback.hashCode();
        }
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.IAuthTabCallback.onExtraCallback(quirksExternalSyntheticBackport0);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.IAuthTabCallback.onExtraCallback(quirksExternalSyntheticBackport0, onwarmupcompleted);
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        RowScope rowScope = this.IAuthTabCallback;
        if (i3 != 0) {
            return rowScope.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        }
        rowScope.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ActionPreset(scope=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public MaxAppOpenAdapterListener(@NotNull RowScope rowScope) {
        Intrinsics.checkNotNullParameter(rowScope, "");
        this.IAuthTabCallback = rowScope;
    }

    private static final Unit IAuthTabCallback(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (str != null) {
            str2 = str2 + ", " + str;
        }
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final boolean z;
        final String str;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        final MaxAppOpenAdapterListener maxAppOpenAdapterListener = (MaxAppOpenAdapterListener) objArr[0];
        final String str2 = (String) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str3 = (String) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        final int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1420698168);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ^ true) ? 32 : 16;
        }
        int i7 = iIntValue2 & 4;
        if (i7 != 0) {
            int i8 = onExtraCallback + 13;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i10 = onExtraCallbackWithResult + 9;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i2 = 256;
            } else {
                i2 = 128;
            }
            i |= i2;
        }
        int i12 = iIntValue2 & 8;
        if (i12 == 0) {
            if ((iIntValue & 3072) == 0) {
                int i13 = onExtraCallbackWithResult + 43;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 2048 : 1024) | i;
            }
            if ((iIntValue & 24576) == 0) {
                int i15 = onExtraCallbackWithResult + 7;
                onExtraCallback = i15 % 128;
                if (i15 % 2 != 0 ? (iIntValue2 & 16) != 0 : (iIntValue2 & 110) != 0) {
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                        i5 = 16384;
                    }
                    i3 |= i5;
                }
            }
            Object obj = null;
            if ((196608 & iIntValue) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(maxAppOpenAdapterListener)) {
                    int i16 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                int i17 = onExtraCallbackWithResult + 89;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                z = zBooleanValue;
                str = str3;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) != 0) {
                    int i19 = onExtraCallbackWithResult + 81;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        if (i7 != 0) {
                            int i20 = onExtraCallback + 99;
                            onExtraCallbackWithResult = i20 % 128;
                            if (i20 % 2 != 0) {
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                throw null;
                            }
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if (i12 != 0) {
                            int i21 = onExtraCallback + 65;
                            onExtraCallbackWithResult = i21 % 128;
                            zBooleanValue = i21 % 2 != 0;
                        }
                        if ((iIntValue2 & 16) != 0) {
                            if (zBooleanValue) {
                                int i22 = onExtraCallback + 29;
                                onExtraCallbackWithResult = i22 % 128;
                                int i23 = i22 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(508666945);
                                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_navigation_red_dot, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                str3 = strOnExtraCallback;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1411133035);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                str3 = null;
                            }
                            i3 &= -57345;
                        }
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        final boolean z2 = zBooleanValue;
                        final String str4 = str3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        setThreadList.IAuthTabCallback(onCrash.NavigationButton, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-755576163, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i24 = 2 % 2;
                                int i25 = onNavigationEvent + 37;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnExtraCallbackWithResult = MaxAppOpenAdapterListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, function0, str2, z2, maxAppOpenAdapterListener, str4, (initSDK) obj3, (QuirksExternalSyntheticBackport0) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i27 = onExtraCallbackWithResult + 75;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 != 0) {
                                    int i28 = 22 / 0;
                                }
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                        z = z2;
                        str = str4;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((iIntValue2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport032 = quirksExternalSyntheticBackport02;
                        final boolean z22 = zBooleanValue;
                        final String str42 = str3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1420698168, i3, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.TextButton (ActionPreset.kt:64)");
                        }
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        setThreadList.IAuthTabCallback(onCrash.NavigationButton, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-755576163, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i24 = 2 % 2;
                                int i25 = onNavigationEvent + 37;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnExtraCallbackWithResult = MaxAppOpenAdapterListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport032, function0, str2, z22, maxAppOpenAdapterListener, str42, (initSDK) obj3, (QuirksExternalSyntheticBackport0) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i27 = onExtraCallbackWithResult + 75;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 != 0) {
                                    int i28 = 22 / 0;
                                }
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport032;
                        z = z22;
                        str = str42;
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda9
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i24 = 2 % 2;
                    int i25 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                    Unit unitOnExtraCallback = MaxAppOpenAdapterListener.onExtraCallback(this.f$0, str2, function0, quirksExternalSyntheticBackport0, z, str, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i27 = onExtraCallback + 55;
                    onExtraCallbackWithResult = i27 % 128;
                    if (i27 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            });
            return null;
        }
        i |= 3072;
        i3 = i;
        if ((iIntValue & 24576) == 0) {
        }
        Object obj3 = null;
        if ((196608 & iIntValue) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        String str3;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallbackOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        onExtraCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2066282317, i, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.IconButton.<anonymous> (ActionPreset.kt:118)");
            }
            if (str != null) {
                str3 = str2 + ", " + str;
            } else {
                str3 = str2;
            }
            MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
            setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = maxAdapterListener.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = addAttachUserData.onWarmupCompleted(quirksExternalSyntheticBackport0, onCrash.NavigationButton);
            if (!z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1422382853);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                onextracallbackOnNavigationEvent = QuirksExternalSyntheticBackport0.Companion;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1144682181);
                onextracallbackOnNavigationEvent = maxAppOpenAdapterListener.onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, maxAdapterListener.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-maxAdapterListener.onExtraCallbackWithResult().onExtraCallback())) << 32) | (Float.floatToRawIntBits(maxAdapterListener.onExtraCallbackWithResult().onExtraCallback()) & 4294967295L)));
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            AppLovinNativeAdImpla.onExtraCallback(deprecated_followredirects, function0, str3, quirksExternalSyntheticBackport0OnWarmupCompleted.onExtraCallback(onextracallbackOnNavigationEvent), onwarmupcompletedOnExtraCallbackWithResult, null, j, cameraCaptureResultEmptyCameraCaptureResult, 0, 32);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 17;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 69 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final deprecated_followRedirects deprecated_followredirects, @NotNull final Function0<Unit> function0, @NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, boolean z, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        long j2;
        int i5;
        final String str3;
        final long j3;
        final boolean z2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        long jOnTransact;
        boolean z3;
        String str4;
        boolean z4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j4;
        String strOnExtraCallback;
        int i7;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(211981429);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onExtraCallback + 123;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true ? 128 : 256;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((i & 196608) == 0) {
                        int i12 = onExtraCallbackWithResult + 123;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        int i14 = onExtraCallbackWithResult + 35;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 != 0 ? (i2 & 64) == 0 : (i2 & 39) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                                int i15 = onExtraCallback + 65;
                                onExtraCallbackWithResult = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i16 = 3 % 3;
                                }
                                i8 = 1048576;
                            }
                            i3 |= i8;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    }
                    if ((12582912 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                            int i17 = onExtraCallback + 111;
                            onExtraCallbackWithResult = i17 % 128;
                            if (i17 % 2 != 0) {
                                throw null;
                            }
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        str3 = str2;
                        j3 = j2;
                        z2 = z;
                    } else {
                        int i18 = onExtraCallback + 93;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            if (i11 != 0) {
                                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if (i4 != 0) {
                                jOnTransact = setByteOrder.Companion.onTransact();
                                int i20 = onExtraCallback + 39;
                                onExtraCallbackWithResult = i20 % 128;
                                i6 = 2;
                                int i21 = i20 % 2;
                            } else {
                                i6 = 2;
                                jOnTransact = j2;
                            }
                            if (i5 != 0) {
                                int i22 = onExtraCallback + 75;
                                onExtraCallbackWithResult = i22 % 128;
                                int i23 = i22 % i6;
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if ((i2 & 64) != 0) {
                                if (z3) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1850699598);
                                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_navigation_red_dot, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1537173544);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    strOnExtraCallback = null;
                                }
                                i3 &= -3670017;
                                str4 = strOnExtraCallback;
                            } else {
                                str4 = str2;
                            }
                            z4 = z3;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            j4 = jOnTransact;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            z4 = z;
                            str4 = str2;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            j4 = j2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(211981429, i3, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.IconButton (ActionPreset.kt:113)");
                            int i24 = onExtraCallbackWithResult + 41;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1850703410);
                        final long jOnExtraCallback = j4 != 16 ? j4 : MaxAdapterListener.onExtraCallbackWithResult.onExtraCallback(deprecated_followredirects, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 48);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        final String str5 = str4;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        final boolean z5 = z4;
                        configureReward.IAuthTabCallback(((Long) MaxAdapterListener.onExtraCallback(-2074101946, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{MaxAdapterListener.onExtraCallbackWithResult}, JsParamKeys.onExtraCallbackWithResult(), 2074101947, JsParamKeys.onExtraCallbackWithResult())).longValue(), false, ForwardingCameraControl.onExtraCallback(-2066282317, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda4
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                int i26 = 2 % 2;
                                int i27 = onExtraCallback + 47;
                                IAuthTabCallback = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitOnNavigationEvent = MaxAppOpenAdapterListener.onNavigationEvent(str5, str, quirksExternalSyntheticBackport04, z5, this, deprecated_followredirects, function0, jOnExtraCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i29 = onExtraCallback + 117;
                                IAuthTabCallback = i29 % 128;
                                if (i29 % 2 != 0) {
                                    return unitOnNavigationEvent;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 2);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        j3 = j4;
                        z2 = z4;
                        str3 = str4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i26 = 2 % 2;
                                int i27 = IAuthTabCallback + 5;
                                onExtraCallbackWithResult = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitOnExtraCallbackWithResult = MaxAppOpenAdapterListener.onExtraCallbackWithResult(this.f$0, deprecated_followredirects, function0, str, quirksExternalSyntheticBackport02, j3, z2, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i29 = onExtraCallbackWithResult + 23;
                                IAuthTabCallback = i29 % 128;
                                int i30 = i29 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            j2 = j;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        j2 = j;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = onExtraCallbackWithResult + 73;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 107;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1214926249, i2, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.IconButton.<anonymous>.<anonymous> (ActionPreset.kt:166)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1214926249, i2, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.IconButton.<anonymous>.<anonymous> (ActionPreset.kt:166)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(onextracallback, maxAdapterListener.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.getInterfaceDescriptor());
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            String strValueOf = i >= 10 ? "+9" : String.valueOf(i);
            long jIAuthTabCallbackDefault = maxAdapterListener.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, 6);
            GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
            InterfaceC0083handshake.onNavigationEvent onnavigationeventOnWarmupCompleted = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted(), 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, "tnum", 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777151, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 115;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnNavigationEvent = MaxAppOpenAdapterListener.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                        int i12 = onExtraCallback + 51;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 39 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i9 = onExtraCallbackWithResult + 31;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 2;
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strValueOf, getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized), gethumanreadablenameOnNavigationEvent, Long.valueOf(jIAuthTabCallbackDefault), 0L, 0L, onnavigationeventOnWarmupCompleted, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98224}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final deprecated_followRedirects deprecated_followredirects, @NotNull final Function0<Unit> function0, @NotNull final String str, final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        long j2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final String str3;
        final long j3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long j4;
        String str5;
        String str6;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1365696908);
        if ((i2 & 6) != 0) {
            i4 = i2;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects)) {
            int i8 = onExtraCallbackWithResult + 63;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2 == 0 ? 2 : 4;
            i4 = i9 | i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            int i10 = onExtraCallback + 99;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i4 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    j2 = j;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 131072 : 65536;
                }
                if ((1572864 & i2) == 0) {
                    i4 |= ((i3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) ? 1048576 : 524288;
                }
                if ((12582912 & i2) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                        int i12 = onExtraCallbackWithResult + 39;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            throw null;
                        }
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i4) != 4793490, i4 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i2 & 1) != 0) {
                        int i13 = onExtraCallback + 29;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            long jOnTransact = i5 != 0 ? setByteOrder.Companion.onTransact() : j2;
                            if ((i3 & 64) != 0) {
                                int i14 = onExtraCallback + 17;
                                onExtraCallbackWithResult = i14 % 128;
                                if (i14 % 2 != 0) {
                                    throw null;
                                }
                                if (i > 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1825273735);
                                    str5 = MessageFormat.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_navigation_badge_count, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), Integer.valueOf(i));
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(749027529);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    str5 = null;
                                }
                                i4 &= -3670017;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                str4 = str5;
                            } else {
                                str4 = str2;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            }
                            j4 = jOnTransact;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            str4 = str2;
                            j4 = j2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1365696908, i4, -1, "im.toss.tds.compose.component.util.navigation.v1.ActionPreset.IconButton (ActionPreset.kt:154)");
                        }
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i15 = onExtraCallbackWithResult + 81;
                            onExtraCallback = i15 % 128;
                            int i16 = i15 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        final HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        if (str4 != null) {
                            str6 = str + ", " + str4;
                        } else {
                            str6 = str;
                        }
                        int i17 = i4 >> 3;
                        String str7 = str4;
                        onExtraCallbackWithResult(deprecated_followredirects, function0, str6, quirksExternalSyntheticBackport03, j4, false, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i17 & 57344) | (i4 & 126) | (i17 & 7168) | (i4 & 29360128), 96);
                        if (i > 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1595560401);
                            lExternalSyntheticLambda4.onExtraCallback(1.0f, ForwardingCameraControl.onExtraCallback(-1214926249, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                    int i18 = 2 % 2;
                                    int i19 = onWarmupCompleted + 85;
                                    onExtraCallbackWithResult = i19 % 128;
                                    int i20 = i19 % 2;
                                    Unit unitIAuthTabCallback = MaxAppOpenAdapterListener.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i21 = onExtraCallbackWithResult + 45;
                                    onWarmupCompleted = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1596701108);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            int i18 = onExtraCallbackWithResult + 7;
                            onExtraCallback = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        str3 = str7;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        j3 = j4;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    str3 = str2;
                    j3 = j2;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i20 = 2 % 2;
                            int i21 = onWarmupCompleted + 1;
                            IAuthTabCallback = i21 % 128;
                            int i22 = i21 % 2;
                            Unit unitOnNavigationEvent = MaxAppOpenAdapterListener.onNavigationEvent(this.f$0, deprecated_followredirects, function0, str, i, quirksExternalSyntheticBackport02, j3, str3, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i23 = IAuthTabCallback + 13;
                            onWarmupCompleted = i23 % 128;
                            if (i23 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            int i20 = onExtraCallbackWithResult + 27;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            i4 |= 196608;
            j2 = j;
            if ((1572864 & i2) == 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i4) != 4793490, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        j2 = j;
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i4) != 4793490, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, final long j2) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.util.navigation.v1.ActionPreset$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = MaxAppOpenAdapterListener.onExtraCallback(j, j2, (setIso) obj);
                int i5 = onNavigationEvent + 87;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }));
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit onWarmupCompleted(long j, long j2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        float fOnExtraCallback = setiso.onExtraCallback(((Float) MaxAdapterListener.onExtraCallback(2139912409, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{MaxAdapterListener.onExtraCallbackWithResult}, JsParamKeys.onExtraCallbackWithResult(), -2139912407, JsParamKeys.onExtraCallbackWithResult())).floatValue()) / 2.0f;
        setiso.onWarmupCompleted();
        setOrientationDegrees.IAuthTabCallback(setiso, j, fOnExtraCallback, setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setiso.onTransact() >> 32)) + fOnExtraCallback) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), setIconUri.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) setiso, j2)), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -913803022, iOnExtraCallback2, 913803023, new Object[]{useandconfigureprogramwithtexture}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onWarmupCompleted(MaxAppOpenAdapterListener maxAppOpenAdapterListener, deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {maxAppOpenAdapterListener, deprecated_followredirects, function0, str, Integer.valueOf(i), quirksExternalSyntheticBackport0, Long.valueOf(j), str2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1918595159, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1918595159, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, String str, boolean z, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str2, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, function0, str, Boolean.valueOf(z), maxAppOpenAdapterListener, str2, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1893561406, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1893561404, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, str, function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z), str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        IAuthTabCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 207608401, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -207608398, objArr, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback);
    }
}
