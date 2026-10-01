package o;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.foundation.TdsIndicationKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getSharedInstance {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 61;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{context}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, -1721100451, 1721100452);
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(context);
        }
        IAuthTabCallbackStub(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i6 | i4);
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i5 + i6 + i3 + (105149790 * i2) + ((-719480883) * i);
        int i15 = i14 * i14;
        int i16 = (i5 * (-424837635)) + 281018368 + ((-424837635) * i6) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i3) + ((-654311424) * i2) + (1702887424 * i) + ((-155189248) * i15);
        int i17 = (i5 * 910058005) + 1460508013 + (i6 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i3 * 910058489) + (i2 * (-759332242)) + (i * (-1121784475)) + (i15 * 1086324736);
        return i16 + ((i17 * i17) * (-1925185536)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(context);
        }
        IAuthTabCallbackDefault(context);
        throw null;
    }

    public static /* synthetic */ getTitleMarginEnd onExtraCallback(boolean z, boolean z2, long j, toMetersPerSecond tometerspersecond, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            j = setByteOrder.Companion.onTransact();
        }
        if ((i & 8) != 0) {
            int i4 = onExtraCallback + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            tometerspersecond = null;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 31;
            onNavigationEvent = i6 % 128;
            deviceQuirksExternalSyntheticLambda0 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(i6 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
        }
        if ((i & 32) != 0) {
            deviceQuirksExternalSyntheticLambda02 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
        }
        if ((i & 64) != 0) {
            int i7 = onExtraCallback + 85;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            getconfiguration = null;
        }
        if ((i & 128) != 0) {
            getcachingexecutorservice = null;
        }
        return onExtraCallbackWithResult(z, z2, j, tometerspersecond, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, getconfiguration, getcachingexecutorservice);
    }

    public static final getTitleMarginEnd onExtraCallbackWithResult(boolean z, boolean z2, long j, @Nullable toMetersPerSecond tometerspersecond, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02, @Nullable getConfiguration<Float> getconfiguration, @Nullable getCachingExecutorService getcachingexecutorservice) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda02, "");
        getListenerWrappers getlistenerwrappers = new getListenerWrappers(z, z2, tometerspersecond, null, j, deviceQuirksExternalSyntheticLambda0, deviceQuirksExternalSyntheticLambda02, getconfiguration, getcachingexecutorservice, null);
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getlistenerwrappers;
    }

    private static final void onExtraCallbackWithResult(Context context, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(context, str, 0).show();
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(context, "Clicked!");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = onExtraCallback + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(context, "Clicked!");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(context, "Clicked!");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(context, "Clicked!");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jIEngagementSignalsCallbackDefault;
        long jMediaBrowserCompatMediaItem;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i2;
        long jMediaBrowserCompatMediaItem2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
        int i3;
        long jMediaBrowserCompatMediaItem3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5;
        long jMediaDescriptionCompat;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-827974799);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827974799, i, -1, "im.toss.tds.compose.foundation.TdsIndicationPreview (TdsIndication.kt:202)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1114825513);
                jIEngagementSignalsCallbackDefault = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onSessionEnded();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1114824585);
                jIEngagementSignalsCallbackDefault = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i7 = onExtraCallback + 63;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, jIEngagementSignalsCallbackDefault, (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
                int i9 = onExtraCallback + 93;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
            getTitleMarginEnd gettitlemarginendOnExtraCallback = onExtraCallback(false, false, 0L, null, null, null, null, null, 255, null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnExtraCallback) {
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    TdsIndicationKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new TdsIndicationKt$.ExternalSyntheticLambda0(context);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                    obj2 = externalSyntheticLambda0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, gettitlemarginendOnExtraCallback, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1155479478);
                    jMediaBrowserCompatMediaItem = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaDescriptionCompat();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1155480502);
                    jMediaBrowserCompatMediaItem = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaBrowserCompatMediaItem();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, jMediaBrowserCompatMediaItem, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted3);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i11 = onNavigationEvent + 29;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("TDS Indication (ripple + scale)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 131070);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback3 = onextracallbackwithresult.onExtraCallback();
                getTitleMarginEnd gettitlemarginendOnExtraCallback2 = onExtraCallback(false, false, 0L, null, null, null, null, null, 253, null);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(context);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj3 = objOnMinimized4;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        TdsIndicationKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new TdsIndicationKt$.ExternalSyntheticLambda1(context);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda1);
                        obj3 = externalSyntheticLambda1;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, gettitlemarginendOnExtraCallback2, false, (String) null, (Role) null, (Function0) obj3, 28, (Object) null);
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult3, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1155500758);
                        i2 = 6;
                        jMediaBrowserCompatMediaItem2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).MediaDescriptionCompat();
                    } else {
                        i2 = 6;
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1155501782);
                        jMediaBrowserCompatMediaItem2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).MediaBrowserCompatMediaItem();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, jMediaBrowserCompatMediaItem2, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                    component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback3, false);
                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5);
                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback4);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted3, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                    int i12 = i2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = cameraCaptureResultEmptyCameraCaptureResult3;
                    PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("TDS Indication (ripple)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult6, 6, 0, 131070);
                    cameraCaptureResultEmptyCameraCaptureResult6.asInterface();
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback4 = onextracallbackwithresult.onExtraCallback();
                    getTitleMarginEnd gettitlemarginendOnExtraCallback3 = onExtraCallback(false, false, 0L, null, null, null, null, null, 254, null);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult6.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult6;
                        cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized5);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult6;
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized5;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallback(context);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                    if (!zOnExtraCallback3) {
                        int i13 = onExtraCallback + 65;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 != 0) {
                            onwarmupcompleted.onExtraCallback();
                            obj.hashCode();
                            throw null;
                        }
                        Object obj4 = objOnMinimized6;
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            TdsIndicationKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new TdsIndicationKt$.ExternalSyntheticLambda2(context);
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(externalSyntheticLambda2);
                            obj4 = externalSyntheticLambda2;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, gettitlemarginendOnExtraCallback3, false, (String) null, (Role) null, (Function0) obj4, 28, (Object) null);
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult4, Integer.valueOf(i12)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1155521814);
                            i3 = i12;
                            jMediaBrowserCompatMediaItem3 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, i3).MediaDescriptionCompat();
                        } else {
                            i3 = i12;
                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1155522838);
                            jMediaBrowserCompatMediaItem3 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, i3).MediaBrowserCompatMediaItem();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback3, jMediaBrowserCompatMediaItem3, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                        component5 component5VarOnWarmupCompleted4 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback4, false);
                        int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult4.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult4, quirksExternalSyntheticBackport0OnWarmupCompleted7);
                        Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult4.access100() == null) {
                            int i14 = onNavigationEvent + 115;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult4.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult4.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(function0IAuthTabCallback5);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted4, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted8, onextracallbackwithresult2.onTransact());
                        int i16 = i3;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult7 = cameraCaptureResultEmptyCameraCaptureResult4;
                        PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("TDS Indication (scale)", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult7, 6, 0, 131070);
                        cameraCaptureResultEmptyCameraCaptureResult7.asInterface();
                        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback5 = onextracallbackwithresult.onExtraCallback();
                        getTitleMarginEnd gettitlemarginendOnExtraCallback4 = onExtraCallback(false, false, 0L, null, null, null, null, null, 252, null);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult7.onMinimized();
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            int i17 = onExtraCallback + 97;
                            onNavigationEvent = i17 % 128;
                            if (i17 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResult7.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                                throw null;
                            }
                            objOnMinimized7 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult7;
                            cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(objOnMinimized7);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult7;
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized7;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult5.onExtraCallback(context);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult5.onMinimized();
                        if (!zOnExtraCallback4) {
                            Object obj5 = objOnMinimized8;
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                TdsIndicationKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new TdsIndicationKt$.ExternalSyntheticLambda3(context);
                                cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(externalSyntheticLambda3);
                                obj5 = externalSyntheticLambda3;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, gettitlemarginendOnExtraCallback4, false, (String) null, (Role) null, (Function0) obj5, 28, (Object) null);
                            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult5, Integer.valueOf(i16)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult5.onExtraCallbackWithResult(1155545238);
                                jMediaDescriptionCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult5, i16).MediaBrowserCompatMediaItem();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult5.onExtraCallbackWithResult(1155544214);
                                jMediaDescriptionCompat = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult5, i16).MediaDescriptionCompat();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult5.IAuthTabCallbackDefault();
                            int i18 = onExtraCallback + 101;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback4, jMediaDescriptionCompat, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                            component5 component5VarOnWarmupCompleted5 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback5, false);
                            int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult5, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult5.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted10 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult5, quirksExternalSyntheticBackport0OnWarmupCompleted9);
                            Function0 function0IAuthTabCallback6 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult5.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult5.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult5.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(function0IAuthTabCallback6);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult5);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnWarmupCompleted5, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted10, onextracallbackwithresult2.onTransact());
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult5;
                            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("TDS Indication", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 0, 131070);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsIndicationKt$.ExternalSyntheticLambda4(i));
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Context context) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onWarmupCompleted(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{context}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, -685995229, 685995229);
    }

    private static final Unit asBinder(Context context) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onWarmupCompleted(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), new Object[]{context}, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, -1721100451, 1721100452);
    }
}
