package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.home.core.ui.compose.ButtonPreset$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ByteArrayPools {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean IAuthTabCallback;

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i3 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ByteArrayPools byteArrayPools, Function0 function0, Function0 function02, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(byteArrayPools, function0, function02, str, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(ByteArrayPools byteArrayPools, Function0 function0, Function0 function02, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        byteArrayPools.onExtraCallback(function0, function02, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
        return unit;
    }

    public ByteArrayPools(boolean z) {
        this.IAuthTabCallback = z;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 92 / 0;
        } else {
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull String str, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1544538866);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i7 % 128;
                i5 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                int i11 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                str3 = str2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                int i13 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    int i15 = onNavigationEvent + 73;
                    onExtraCallbackWithResult = i15 % 128;
                    i4 = i15 % 2 != 0 ? 25203 : 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                String str4 = i10 != 0 ? null : str3;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i16 = onNavigationEvent + 83;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1544538866, i3, -1, "im.toss.features.home.core.ui.compose.ButtonPreset.Button (AssetDetailFixedBottomContent.kt:80)");
                }
                if (this.IAuthTabCallback) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1372906137);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = desc.onExtraCallback((QuirksExternalSyntheticBackport0) onextracallback).onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f)));
                    boolean z = (i3 & 14) == 4;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ButtonPreset$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new ButtonPreset$.ExternalSyntheticLambda0(function0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                            obj = externalSyntheticLambda0;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, (Object) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 3);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2, getSharedInstance.onExtraCallback(false, false, 0L, desc.IAuthTabCallback(), (DeviceQuirksExternalSyntheticLambda0) null, (DeviceQuirksExternalSyntheticLambda0) null, (getConfiguration) null, (getCachingExecutorService) null, 247, (Object) null), false, (String) null, (Role) null, function02, 28, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i18 = onExtraCallbackWithResult + 25;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        desc.onNavigationEvent(null, str4, str, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 112) | (i3 & 896), 1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1373691832);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    boolean z2 = !((i3 & 14) != 4);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z2) {
                        Object obj3 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            ButtonPreset$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new ButtonPreset$.ExternalSyntheticLambda1(function0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda1);
                            obj3 = externalSyntheticLambda1;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, 0.0f, (Object) null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 3), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(37.0f), 1, (Object) null);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            int i19 = onNavigationEvent + 5;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                                throw null;
                            }
                            objOnMinimized4 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        desc.onNavigationEvent(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized4, getSharedInstance.onExtraCallback(false, false, 0L, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f)), (DeviceQuirksExternalSyntheticLambda0) null, (DeviceQuirksExternalSyntheticLambda0) null, (getConfiguration) null, (getCachingExecutorService) null, 247, (Object) null), false, (String) null, (Role) null, function02, 28, (Object) null), str4, str, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 112) | (i3 & 896), 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                str3 = str4;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ButtonPreset$.ExternalSyntheticLambda2(this, function0, function02, str, str3, i, i2));
                return;
            }
            return;
        }
        i3 |= 3072;
        str3 = str2;
        if ((i & 24576) == 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
