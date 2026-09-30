package o;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.setCallToAction;
import o.setMatrixArray;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u4;
import o.w3b;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setMatrixArray extends BrickModuleImplExternalSyntheticLambda2 {
    private final Context IAuthTabCallback;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(setMatrixArray setmatrixarray, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        setmatrixarray.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(setMatrixArray setmatrixarray, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        setmatrixarray.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(setMatrixArray setmatrixarray, deprecated_followRedirects deprecated_followredirects, String str, String str2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        setmatrixarray.onNavigationEvent(deprecated_followredirects, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMatrixArray(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        this.IAuthTabCallback = context;
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallbackWithResult = function0;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        onNavigationEvent(ForwardingCameraControl.onExtraCallbackWithResult(-1752445270, true, new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda10
            public final Object invoke(Object obj, Object obj2) {
                return setMatrixArray.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(final setMatrixArray setmatrixarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1752445270, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.onCreate.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:43)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(189959170, true, new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda7
                public final Object invoke(Object obj, Object obj2) {
                    return setMatrixArray.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(setMatrixArray setmatrixarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(189959170, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.onCreate.<anonymous>.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:44)");
            }
            RealImageLoaderKt.onNavigationEvent(4670344L, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
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
            setmatrixarray.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
            OkHttp okHttp = OkHttp.onExtraCallback;
            setmatrixarray.onNavigationEvent(accessgetAfterBoundaryOptionscp.onExtraCallbackWithResult(okHttp), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_name_label, cameraCaptureResultEmptyCameraCaptureResult, 0), setmatrixarray.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setmatrixarray.onNavigationEvent(removeAllQueryParameters.onExtraCallback(okHttp), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_phone_label, cameraCaptureResultEmptyCameraCaptureResult, 0), setPreferredBitmapConfig.onNavigationEvent(setmatrixarray.onWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, 0);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            setmatrixarray.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-851656462);
        int i2 = i & 1;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-851656462, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.Header (GuardianSimpleInfoConfirmBottomSheet.kt:68)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_bottomsheet_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablenameAccess100 = appLovinPostbackService.access100();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, gethumanreadablenameAccess100, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_bottomsheet_subtitle, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(494367535);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(494368495);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback2, null, gethumanreadablename, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoAsBinder, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda11
                public final Object invoke(Object obj, Object obj2) {
                    return setMatrixArray.IAuthTabCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void onNavigationEvent(final deprecated_followRedirects deprecated_followredirects, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2122439194);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2122439194, i2, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.GuardianInfoRow (GuardianSimpleInfoConfirmBottomSheet.kt:102)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1968390051, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onWarmupCompleted(str, str2, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1413061231, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onWarmupCompleted(deprecated_followredirects, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), getViewTypeCount.onExtraCallback.Companion.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, getViewTypeCount.onNavigationEvent.Companion.onNavigationEvent(), getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3462, 432, 124914);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return setMatrixArray.onNavigationEvent(this.f$0, deprecated_followredirects, str, str2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(w3bVar, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1413061231, i2, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.GuardianInfoRow.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:105)");
            }
            handleNativeAdClick.onExtraCallback.asInterface asinterfaceOnWarmupCompleted = handleNativeAdClick.onExtraCallback.asInterface.Companion.onWarmupCompleted();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w3bVar.onNavigationEvent(deprecated_followredirects, deprecated_eventListenerFactory.Icon, asinterfaceOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0, 0.0f, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 1896);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(rowScope, BuildConfig.FLAVOR);
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(439572796, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.GuardianInfoRow.<anonymous>.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:116)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final String str, final String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(w5aVar, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1968390051, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.GuardianInfoRow.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:115)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, ForwardingCameraControl.onExtraCallback(439572796, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onExtraCallbackWithResult(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(924209627, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda9
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onNavigationEvent(str2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1732372494, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1732372479, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(rowScope, BuildConfig.FLAVOR);
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(924209627, i, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.GuardianInfoRow.<anonymous>.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:117)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1803639323);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1803639323, i2, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.BottomButtons (GuardianSimpleInfoConfirmBottomSheet.kt:126)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(326700664, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onNavigationEvent(this.f$0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(799040310, true, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return setMatrixArray.onExtraCallbackWithResult(this.f$0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 24960, 0, 4075);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return setMatrixArray.onExtraCallback(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onNavigationEvent(final setMatrixArray setmatrixarray, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(326700664, i2, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.BottomButtons.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:129)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_bottom_sheet_cta_confirm_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setmatrixarray);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return setMatrixArray.onNavigationEvent(this.f$0);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, RealImageLoader.onWarmupCompleted(0L, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(setMatrixArray setmatrixarray) {
        setmatrixarray.dismiss();
        setmatrixarray.onExtraCallbackWithResult.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(setMatrixArray setmatrixarray, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(799040310, i2, -1, "viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoConfirmBottomSheet.BottomButtons.<anonymous> (GuardianSimpleInfoConfirmBottomSheet.kt:142)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.guardian_simple_info_confirm_bottom_sheet_cta_close_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setmatrixarray);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onNavigationEvent(setmatrixarray);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (access5300) objOnMinimized, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
        onNavigationEvent(Object obj) {
            super(0, obj, setMatrixArray.class, "dismiss", "dismiss()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onExtraCallback();
            return Unit.INSTANCE;
        }

        public final void onExtraCallback() {
            ((setMatrixArray) ((CallableReference) this).receiver).dismiss();
        }
    }
}
