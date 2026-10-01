package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.foreigner.home.ui.discovery.ForeignerHomeDiscoverySectionKt$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.InventoryAdDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isSticky {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(InventoryAdDto inventoryAdDto, InventoryAdManager inventoryAdManager, booleanDefault booleandefault, getSourceProcess getsourceprocess, boolean z, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 47;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(inventoryAdDto, inventoryAdManager, booleandefault, getsourceprocess, z, function1, function12, function0, function02, function03, quirksExternalSyntheticBackport0, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallback + 25;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(InventoryAdDto inventoryAdDto, InventoryAdManager inventoryAdManager, booleanDefault booleandefault, getSourceProcess getsourceprocess, boolean z, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 89;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(inventoryAdDto, inventoryAdManager, booleandefault, getsourceprocess, z, function1, function12, function0, function02, function03, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 45;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@Nullable InventoryAdDto inventoryAdDto, @NotNull InventoryAdManager inventoryAdManager, @NotNull booleanDefault booleandefault, @Nullable getSourceProcess getsourceprocess, boolean z, @NotNull Function1<? super BindingNode, Unit> function1, @NotNull Function1<? super getSourceProcess, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Object obj;
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12;
        int i7;
        boolean zOnExtraCallback;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(inventoryAdManager, "");
        Intrinsics.checkNotNullParameter(booleandefault, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1212358383);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i9 = IAuthTabCallback + 25;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdDto);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdDto);
            }
            i4 = (zOnExtraCallback ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = onNavigationEvent + 57;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(booleandefault);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(booleandefault) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsourceprocess) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            int i12 = onNavigationEvent + 33;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i13 = onNavigationEvent + 99;
                IAuthTabCallback = i13 % 128;
                i7 = 67108864;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 0;
                }
            } else {
                i7 = 33554432;
            }
            i4 |= i7;
        }
        if ((805306368 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 536870912 : 268435456;
        }
        int i15 = i4;
        int i16 = i3 & 1024;
        if (i16 != 0) {
            int i17 = IAuthTabCallback + 1;
            int i18 = i17 % 128;
            onNavigationEvent = i18;
            i5 = i17 % 2 == 0 ? i2 | 122 : i2 | 6;
            int i19 = i18 + 117;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
        } else if ((i2 & 6) == 0) {
            int i21 = IAuthTabCallback + 9;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            i5 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i15) == 306783378 && (i5 & 3) == 2) ? false : true, i15 & 1)) {
            if (i16 != 0) {
                int i23 = onNavigationEvent + 17;
                IAuthTabCallback = i23 % 128;
                int i24 = i23 % 2;
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i25 = IAuthTabCallback + 77;
                onNavigationEvent = i25 % 128;
                if (i25 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1212358383, i15, i5, "im.toss.features.foreigner.home.ui.discovery.ForeignerHomeDiscoverySection (ForeignerHomeDiscoverySection.kt:35)");
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1212358383, i15, i5, "im.toss.features.foreigner.home.ui.discovery.ForeignerHomeDiscoverySection (ForeignerHomeDiscoverySection.kt:35)");
                obj = null;
            } else {
                obj = null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, obj);
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (getsourceprocess != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-884747966);
                i6 = i15;
                getInternalView.onExtraCallbackWithResult(getsourceprocess, function12, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i15 >> 9) & 14) | ((i15 >> 15) & 112), 4);
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            } else {
                i6 = i15;
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-884556727);
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            }
            if (inventoryAdDto == null || (inventoryAdDto instanceof InventoryAdDto.None)) {
                focusMeteringControlExternalSyntheticLambda12 = focusMeteringControlExternalSyntheticLambda122;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-884296823);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-884491906);
                focusMeteringControlExternalSyntheticLambda12 = focusMeteringControlExternalSyntheticLambda122;
                BindingCallUrl.onExtraCallback(inventoryAdDto, inventoryAdManager, (setContentInsetsRelative) null, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult3, InventoryAdDto.$stable | (i6 & 14) | (InventoryAdManager.onExtraCallbackWithResult << 3) | (i6 & 112), 12);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            BindingExecutor.onExtraCallback(booleandefault.onWarmupCompleted(), function1, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, ((i6 >> 12) & 112) | 384, 0);
            ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult2, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda3.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda1.Min), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 6);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            BindingApiContext.onExtraCallbackWithResult(function0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, (i6 >> 21) & 14, 0);
            BindingApiContext.IAuthTabCallback(function02, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, (i6 >> 24) & 14, 0);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (z) {
                int i26 = IAuthTabCallback + 35;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-883316448);
                BindingCallback.onExtraCallbackWithResult(function03, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 8, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, (i6 >> 27) & 14, 0);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-883144119);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeDiscoverySectionKt$.ExternalSyntheticLambda0(inventoryAdDto, inventoryAdManager, booleandefault, getsourceprocess, z, function1, function12, function0, function02, function03, quirksExternalSyntheticBackport02, i, i2, i3));
        }
    }
}
