package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.horcrux.svg.SvgPackage;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.NavigationImplExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.onPageScrollStateChanged;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NavigationImplExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    private static final Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onNavigationEvent;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onpagescrollstatechanged);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onpagescrollstatechanged, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i5 % 128;
        IAuthTabCallback(onpagescrollstatechanged, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return unit;
    }

    public static final /* synthetic */ void onWarmupCompleted(onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(onpagescrollstatechanged, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 == 0) {
            int i6 = 81 / 0;
        }
        int i7 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 53 / 0;
        }
    }

    public static final Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> map = onExtraCallback;
        int i4 = i2 + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    static {
        WebStorageCompatExternalSyntheticLambda0 webStorageCompatExternalSyntheticLambda0 = WebStorageCompatExternalSyntheticLambda0.onWarmupCompleted;
        onExtraCallback = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("nana-list-bat", webStorageCompatExternalSyntheticLambda0.onTransact()), getWrite.IAuthTabCallback("nana-list-sat", webStorageCompatExternalSyntheticLambda0.IAuthTabCallbackDefault()), getWrite.IAuthTabCallback("nana-list-pat", webStorageCompatExternalSyntheticLambda0.onNavigationEvent()), getWrite.IAuthTabCallback("nana-image-pat", (getBacktraceNote) WebStorageCompatExternalSyntheticLambda0.onWarmupCompleted(new Object[]{webStorageCompatExternalSyntheticLambda0}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1367007838, -1367007837, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("nana-image-sat", webStorageCompatExternalSyntheticLambda0.asInterface()), getWrite.IAuthTabCallback("nana-survey-choice-sat", (getBacktraceNote) WebStorageCompatExternalSyntheticLambda0.onWarmupCompleted(new Object[]{webStorageCompatExternalSyntheticLambda0}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1193180773, -1193180771, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("nana-survey-button-sat", webStorageCompatExternalSyntheticLambda0.IAuthTabCallbackStub())});
        onNavigationEvent = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("COMMERCE", webStorageCompatExternalSyntheticLambda0.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("bps-multi-image", webStorageCompatExternalSyntheticLambda0.IAuthTabCallback())});
        int i = onWarmupCompleted + 113;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }

    public static final Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<String, getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> map = onNavigationEvent;
        int i4 = i2 + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onpagescrollstatechanged.onNavigationEvent().invoke((Object) null);
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String strOnNavigationEvent;
        boolean zOnExtraCallback;
        JsonPrimitive jsonPrimitive;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1822559280);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged) ^ true ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 1;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                int i7 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i9 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i6 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1822559280, i3, -1, "im.toss.ads_sdk.ui.compose.NativeAdsBuiltInTemplate (NativeAdsTemplateRegistry.kt:77)");
                }
                JsonObject jsonObject = (JsonObject) onPageScrollStateChanged.onExtraCallbackWithResult(-600051351, ICustomTabsCallbackStubProxy.onExtraCallback(), 600051352, new Object[]{onpagescrollstatechanged}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
                if (jsonObject == null || (jsonPrimitive = (JsonElement) jsonObject.get("headline")) == null) {
                    strOnNavigationEvent = null;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)));
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsTemplateRegistryKt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke() {
                                    int i11 = 2 % 2;
                                    int i12 = IAuthTabCallback + 83;
                                    onExtraCallback = i12 % 128;
                                    int i13 = i12 % 2;
                                    onPageScrollStateChanged onpagescrollstatechanged2 = onpagescrollstatechanged;
                                    if (i13 != 0) {
                                        return NavigationImplExternalSyntheticLambda0.onExtraCallback(onpagescrollstatechanged2);
                                    }
                                    NavigationImplExternalSyntheticLambda0.onExtraCallback(onpagescrollstatechanged2);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                            obj = function0;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11);
                        long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaMetadataCompat(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"AD", lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(onextracallback, onextracallbackwithresult.asBinder()), null, Long.valueOf(jOnExtraCallbackWithResult), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24582, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"NativeAds · SDK Template", null, null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24582, 196608, 98286}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"sdkTemplateId=" + onpagescrollstatechanged.IAuthTabCallback(), null, null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 0, 131054}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        SdkTemplate sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
                        if (sdkTemplateIAuthTabCallbackStub != null) {
                            int i11 = onExtraCallbackWithResult + 29;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                Reflection.getOrCreateKotlinClass(sdkTemplateIAuthTabCallbackStub.getClass()).getSimpleName();
                                throw null;
                            }
                            String simpleName = Reflection.getOrCreateKotlinClass(sdkTemplateIAuthTabCallbackStub.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "-";
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"template=" + simpleName, null, null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 0, 131054}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            if (strOnNavigationEvent != null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1127344762);
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"data.headline=" + strOnNavigationEvent, null, null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 0, 131054}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1127219832);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i12 = onExtraCallbackWithResult + 97;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        }
                    }
                } else {
                    JsonPrimitive jsonPrimitive2 = jsonPrimitive instanceof JsonPrimitive ? jsonPrimitive : null;
                    if (jsonPrimitive2 != null) {
                        strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)));
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, y3externalsyntheticlambda02.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsTemplateRegistryKt$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i14 = 2 % 2;
                        int i15 = onNavigationEvent + 33;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        Unit unitOnExtraCallback = NavigationImplExternalSyntheticLambda0.onExtraCallback(onpagescrollstatechanged, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i17 = onNavigationEvent + 121;
                        onWarmupCompleted = i17 % 128;
                        if (i17 % 2 == 0) {
                            return unitOnExtraCallback;
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
        int i14 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i14 % 128;
        int i15 = i14 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
