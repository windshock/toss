package o;

import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zziea;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.oExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u3 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final onExtraCallback onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        oExternalSyntheticLambda0.onExtraCallback onextracallback = (oExternalSyntheticLambda0.onExtraCallback) objArr[1];
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (oExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[2];
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = (oExternalSyntheticLambda0.IAuthTabCallback) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        u3 u3Var = (u3) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(str, onextracallback, onextracallbackwithresult, iAuthTabCallback, function0, zBooleanValue, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, onextracallback, onextracallbackwithresult, iAuthTabCallback, function0, zBooleanValue, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j, Function0 function0, boolean z, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(str, onextracallbackwithresult, iAuthTabCallback, j, function0, z, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, onextracallbackwithresult, iAuthTabCallback, j, function0, z, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~(i5 | i3);
        int i10 = ~i5;
        int i11 = ~i3;
        int i12 = i8 | i9 | (~(i10 | i11 | i2));
        int i13 = i8 | (~(i7 | i5)) | i9;
        int i14 = (~(i3 | i2)) | (~(i10 | i3)) | (~(i7 | i11 | i5));
        int i15 = i2 + i5 + i6 + (1880080305 * i) + (458392769 * i4);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i2) - 2147483648) + (1582236324 * i5) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i6) + (1711276032 * i) + ((-973078528) * i4) + (68288512 * i16);
        int i18 = ((i2 * 319678698) - 2002258816) + (i5 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i6 * 319678491) + (i * (-161570901)) + (i4 * (-1160779685)) + (i16 * (-1109000192));
        return i17 + ((i18 * i18) * (-1432485888)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public u3(@NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onNavigationEvent = onextracallback;
    }

    public final void onExtraCallback(@NotNull final String str, @NotNull final oExternalSyntheticLambda0.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, boolean z, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        final oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if ((i2 & 4) != 0) {
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            int i4 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
                throw null;
            }
            iAuthTabCallbackOnExtraCallback = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
        } else {
            iAuthTabCallbackOnExtraCallback = iAuthTabCallback;
        }
        if ((i2 & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            onextracallbackwithresultOnWarmupCompleted = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onWarmupCompleted();
        } else {
            onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
        }
        final boolean z2 = (i2 & 32) != 0 ? true : z;
        final Function0<Unit> function02 = (i2 & 64) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2004167153, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.TextButton (AccessoryPreset.kt:61)");
        }
        onWarmupCompleted(getMaxSize.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, "tds_bottom_cta_v1_accessory_text_button"), ForwardingCameraControl.onExtraCallback(422188433, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                String str2 = str;
                oExternalSyntheticLambda0.onExtraCallback onextracallback2 = onextracallback;
                oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
                oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackOnExtraCallback;
                Function0 function03 = function02;
                boolean z3 = z2;
                int iIntValue = ((Integer) obj3).intValue();
                Unit unit = (Unit) u3.onNavigationEvent(new Object[]{str2, onextracallback2, onextracallbackwithresult2, iAuthTabCallback2, function03, Boolean.valueOf(z3), (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, zziea.IAuthTabCallback(), -861906459, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 861906460, zziea.IAuthTabCallback());
                int i12 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 15) & 896) | 48, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, oExternalSyntheticLambda0.onExtraCallback onextracallback, oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, Function0 function0, boolean z, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            z2 = (i & 9) != 8;
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 17) != 16) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(422188433, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.TextButton.<anonymous> (AccessoryPreset.kt:66)");
            }
            oExternalSyntheticLambda1.onExtraCallback(str, onextracallback, onextracallbackwithresult, null, iAuthTabCallback, 0L, null, null, null, function0, null, null, z, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3560);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, long j, boolean z, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        long jOnNavigationEvent;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                iAuthTabCallbackOnExtraCallback = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
                int i6 = 50 / 0;
            } else {
                iAuthTabCallbackOnExtraCallback = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
            }
        } else {
            iAuthTabCallbackOnExtraCallback = iAuthTabCallback;
        }
        if ((i2 & 8) != 0) {
            int i7 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            onextracallbackwithresultOnWarmupCompleted = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onWarmupCompleted();
        } else {
            onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
        }
        if ((i2 & 16) != 0) {
            int i9 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                function0.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j;
        }
        final boolean z2 = (i2 & 32) != 0 ? true : z;
        function0 = (i2 & 64) == 0 ? function0 : null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-649246627, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.TextButton (AccessoryPreset.kt:87)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getMaxSize.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, "tds_bottom_cta_v1_accessory_text_button");
        final oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
        final long j2 = jOnNavigationEvent;
        onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(2036556797, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i10 = 2 % 2;
                int i11 = IAuthTabCallback + 75;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    u3.onExtraCallbackWithResult(str, onextracallbackwithresult2, iAuthTabCallbackOnExtraCallback, j2, function0, z2, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = u3.onExtraCallbackWithResult(str, onextracallbackwithresult2, iAuthTabCallbackOnExtraCallback, j2, function0, z2, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i12 = IAuthTabCallback + 25;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 15) & 896) | 48, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j, Function0 function0, boolean z, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2036556797, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.TextButton.<anonymous> (AccessoryPreset.kt:92)");
                }
                oExternalSyntheticLambda1.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, onextracallbackwithresult, iAuthTabCallback, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, j, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) function0, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, z, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 114534);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                oExternalSyntheticLambda1.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, onextracallbackwithresult, iAuthTabCallback, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, j, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) function0, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, z, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 114534);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    public final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
            i = 1;
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, onExtraCallback(this, 0.0f, i, null)));
    }

    public static /* synthetic */ DeviceQuirksExternalSyntheticLambda0 onExtraCallback(u3 u3Var, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) onNavigationEvent(new Object[]{u3Var, Float.valueOf(f)}, zziea.IAuthTabCallback(), 2129893053, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -2129893053, zziea.IAuthTabCallback());
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return deviceQuirksExternalSyntheticLambda0;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float fIAuthTabCallback;
        u3 u3Var = (u3) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        t7b t7bVar = t7b.onExtraCallback;
        float fOnNavigationEvent = t7bVar.onNavigationEvent();
        if (u3Var.onNavigationEvent != onExtraCallback.Bottom) {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 3;
            }
        } else if (Float.isNaN(fFloatValue)) {
            fIAuthTabCallback = t7bVar.IAuthTabCallback();
        } else {
            int i4 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fIAuthTabCallback = fFloatValue;
        }
        float fOnNavigationEvent2 = t7bVar.onNavigationEvent();
        if (u3Var.onNavigationEvent == onExtraCallback.Top) {
            int i5 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (Float.isNaN(fFloatValue)) {
                fFloatValue = t7bVar.IAuthTabCallback();
            }
        } else {
            fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(fOnNavigationEvent, fIAuthTabCallback, fOnNavigationEvent2, fFloatValue);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallback Top = new onExtraCallback("Top", 0);
        public static final onExtraCallback Bottom = new onExtraCallback("Bottom", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {Top, Bottom};
            int i5 = i3 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            EnumEntries<onExtraCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                enumEntries = $ENTRIES;
                int i4 = 82 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 123;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 77;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3) || this.onNavigationEvent != ((u3) obj).onNavigationEvent) {
            return false;
        }
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.hashCode();
            throw null;
        }
        int iHashCode = this.onNavigationEvent.hashCode();
        int i3 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j3;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            int i4 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i2 & 8) != 0) {
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i8 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            j3 = jOnNavigationEvent;
        } else {
            j3 = j2;
        }
        Object obj = null;
        if ((i2 & 16) != 0) {
            int i10 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1929435066, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.Text (AccessoryPreset.kt:35)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getMaxSize.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, (DeviceQuirksExternalSyntheticLambda0) onNavigationEvent(new Object[]{this, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f))}, zziea.IAuthTabCallback(), 2129893053, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -2129893053, zziea.IAuthTabCallback())), "tds_bottom_cta_v1_accessory_text");
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i12 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                getAwbState.onExtraCallback();
                throw null;
            }
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i13 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
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
        int i15 = i << 3;
        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(jOnTransact), Long.valueOf(j3), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | (i15 & 7168) | (57344 & i15)), Integer.valueOf(458752 & i15), 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i17 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((i2 & 1) != 0) {
            quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1797952490, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.AccessoryPreset.AccessoryContainer (AccessoryPreset.kt:112)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0);
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i6 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            int i7 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
        getbacktracenote.invoke(this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 6) & 14) | (i & 112)));
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, oExternalSyntheticLambda0.onExtraCallback onextracallback, oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, Function0 function0, boolean z, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(new Object[]{str, onextracallback, onextracallbackwithresult, iAuthTabCallback, function0, Boolean.valueOf(z), u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zziea.IAuthTabCallback(), -861906459, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 861906460, zziea.IAuthTabCallback());
    }

    public final DeviceQuirksExternalSyntheticLambda0 onExtraCallback(float f) {
        return (DeviceQuirksExternalSyntheticLambda0) onNavigationEvent(new Object[]{this, Float.valueOf(f)}, zziea.IAuthTabCallback(), 2129893053, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -2129893053, zziea.IAuthTabCallback());
    }
}
