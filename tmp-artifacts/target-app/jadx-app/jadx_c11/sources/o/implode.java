package o;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.getTimebase;
import o.implode;
import o.readFully;
import o.setByteOrder;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class implode extends putLongIfValid {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent(f);
        int i4 = IAuthTabCallback + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return virtualCameraControlExternalSyntheticLambda1OnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getTimebase gettimebase, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(gettimebase, surfaceProcessorNodeOut);
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(implode implodeVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(implodeVar, str, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(implodeVar, str, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        implode implodeVar = (implode) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        Function0<Unit> function0 = (Function0) objArr[7];
        Function0<Unit> function02 = (Function0) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        implodeVar.onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, zBooleanValue, zBooleanValue2, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(gettimebase);
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i3)) | (~(i8 | i3));
        int i10 = ~(i6 | i7);
        int i11 = i3 | i10 | (~(i8 | i4));
        int i12 = i3 + i4 + i2 + (1997535707 * i5) + (1930545336 * i);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i3) + 1468203008 + ((-417352845) * i4) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i2) + ((-1408630784) * i5) + ((-2070937600) * i) + (392888320 * i13);
        int i15 = (i3 * (-2054695253)) + 138751921 + (i4 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i2 * (-2054694363)) + (i5 * 1502648999) + (i * 931574424) + (i13 * (-2139684864));
        int i16 = i14 + (i15 * i15 * (-174260224));
        return i16 != 1 ? i16 != 2 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    private static final Unit onNavigationEvent(implode implodeVar, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 95;
        onNavigationEvent = i5 % 128;
        implodeVar.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 113;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, String str, String str2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, getTimebase gettimebase, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(z, str, str2, cameraPresenceProviderExternalSyntheticLambda6, gettimebase, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(z, str, str2, cameraPresenceProviderExternalSyntheticLambda6, gettimebase, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        implode implodeVar = (implode) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        Function0 function0 = (Function0) objArr[7];
        Function0 function02 = (Function0) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue3 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue2);
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        Integer numValueOf3 = Integer.valueOf(iIntValue3);
        if (i3 == 0) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            return (Unit) onNavigationEvent(new Object[]{implodeVar, quirksExternalSyntheticBackport0, str, str2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolValueOf, boolValueOf2, function0, function02, numValueOf, numValueOf2, cameraCaptureResultEmptyCameraCaptureResult, numValueOf3}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1558584084, 1558584084, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
        }
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        Function0<Unit> function03;
        int i10;
        int i11;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final Function0<Unit> function04;
        final boolean z5;
        final boolean z6;
        final Function0<Unit> function05;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        boolean z7;
        int i12;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(165775792);
        if ((i & 6) == 0) {
            int i14 = IAuthTabCallback + 59;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i16 = onNavigationEvent + 71;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2)) {
                        int i19 = onNavigationEvent + 93;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z3 = z;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                            int i21 = IAuthTabCallback + 123;
                            onNavigationEvent = i21 % 128;
                            i7 = i21 % 2 != 0 ? 11170 : 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            z4 = z2;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 16384 : 8192;
                        }
                        i9 = i2 & 32;
                        if (i9 == 0) {
                            if ((196608 & i) == 0) {
                                function03 = function0;
                                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 131072 : 65536;
                            }
                            i10 = i2 & 64;
                            if (i10 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                                    int i22 = onNavigationEvent + 45;
                                    IAuthTabCallback = i22 % 128;
                                    i11 = 1048576;
                                    if (i22 % 2 == 0) {
                                        int i23 = 44 / 0;
                                    }
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            if ((12582912 & i) == 0) {
                                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 8388608 : 4194304;
                            }
                            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                                int i24 = IAuthTabCallback + 5;
                                onNavigationEvent = i24 % 128;
                                Object obj = null;
                                if (i24 % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                if (i4 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        int i25 = IAuthTabCallback + 103;
                                        onNavigationEvent = i25 % 128;
                                        int i26 = i25 % 2;
                                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                } else {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                }
                                if (i6 != 0) {
                                    int i27 = onNavigationEvent + 71;
                                    IAuthTabCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    z7 = true;
                                } else {
                                    z7 = z3;
                                }
                                boolean z8 = i8 != 0 ? false : z4;
                                Function0<Unit> function06 = i9 != 0 ? null : function03;
                                Function0<Unit> function07 = i10 != 0 ? null : function02;
                                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(165775792, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset.Cta (TdsAgreementV4CtaPresets.kt:60)");
                                }
                                int i29 = i3 << 12;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                super.onNavigationEvent(str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, setCallToAction.onNavigationEvent.Block, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, z7, z8, function06, function07, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 224640 | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), (i3 >> 18) & 126);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i30 = IAuthTabCallback + 43;
                                    onNavigationEvent = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                        int i31 = 83 / 0;
                                    } else {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                }
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                z5 = z7;
                                z6 = z8;
                                function05 = function06;
                                function04 = function07;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                function04 = function02;
                                z5 = z3;
                                z6 = z4;
                                function05 = function03;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda0
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                        int i32 = 2 % 2;
                                        int i33 = onExtraCallbackWithResult + 31;
                                        onNavigationEvent = i33 % 128;
                                        int i34 = i33 % 2;
                                        Unit unitOnExtraCallback = implode.onExtraCallback(this.f$0, str, quirksExternalSyntheticBackport02, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, z5, z6, function05, function04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i35 = onExtraCallbackWithResult + 65;
                                        onNavigationEvent = i35 % 128;
                                        int i36 = i35 % 2;
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        function03 = function0;
                        i10 = i2 & 64;
                        if (i10 == 0) {
                        }
                        if ((12582912 & i) == 0) {
                        }
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    z4 = z2;
                    i9 = i2 & 32;
                    if (i9 == 0) {
                    }
                    function03 = function0;
                    i10 = i2 & 64;
                    if (i10 == 0) {
                    }
                    if ((12582912 & i) == 0) {
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                z3 = z;
                i8 = i2 & 16;
                if (i8 == 0) {
                }
                z4 = z2;
                i9 = i2 & 32;
                if (i9 == 0) {
                }
                function03 = function0;
                i10 = i2 & 64;
                if (i10 == 0) {
                }
                if ((12582912 & i) == 0) {
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            z3 = z;
            i8 = i2 & 16;
            if (i8 == 0) {
            }
            z4 = z2;
            i9 = i2 & 32;
            if (i9 == 0) {
            }
            function03 = function0;
            i10 = i2 & 64;
            if (i10 == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        z3 = z;
        i8 = i2 & 16;
        if (i8 == 0) {
        }
        z4 = z2;
        i9 = i2 & 32;
        if (i9 == 0) {
        }
        function03 = function0;
        i10 = i2 & 64;
        if (i10 == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) == 4793490, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final boolean IAuthTabCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(gettimebase);
        if (i3 == 0) {
            if (iOnNavigationEvent < 3) {
                return false;
            }
        } else if (iOnNavigationEvent < 2) {
            return false;
        }
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final Unit IAuthTabCallback(getTimebase gettimebase, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            IAuthTabCallback(gettimebase, surfaceProcessorNodeOut.IAuthTabCallbackDefault());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        IAuthTabCallback(gettimebase, surfaceProcessorNodeOut.IAuthTabCallbackDefault());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    private static final Unit onWarmupCompleted(boolean z, String str, String str2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final getTimebase gettimebase, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z2;
        Throwable th;
        float f;
        ?? r0;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1026420631, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset.Payment.<anonymous> (TdsAgreementV4CtaPresets.kt:119)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 54);
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
                int i7 = onNavigationEvent + 21;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i8 = IAuthTabCallback + 19;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(165861478);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader.onNavigationEvent) null, false, 3, (Object) null), ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 9781581, -9781580, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).floatValue());
                if (str == null) {
                    int i10 = onNavigationEvent + 115;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    str3 = "";
                } else {
                    str3 = str;
                }
                th = null;
                AppLovinNativeAdImplc.onExtraCallbackWithResult(str3, quirksExternalSyntheticBackport0IAuthTabCallback, 0L, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                f = 0.0f;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 9781581, -9781580, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).floatValue());
                readFully.onExtraCallback onextracallback2 = readFully.Companion;
                setByteOrder.onExtraCallbackWithResult onextracallbackwithresult2 = setByteOrder.Companion;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault()));
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                Pair[] pairArr = {pairIAuthTabCallback, getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), getWrite.IAuthTabCallback(Float.valueOf(0.75f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault()))};
                r0 = 0;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, readFully.onExtraCallback.onExtraCallbackWithResult(onextracallback2, pairArr, 0L, 0L, 0, 14, (Object) null), (toMetersPerSecond) null, 0.0f, 6, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                th = null;
                f = 0.0f;
                r0 = 0;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(167007951);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
            long jIPostMessageService_Parcel = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel();
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallback + 93;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        getTimebase gettimebase2 = gettimebase;
                        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) obj2;
                        if (i13 == 0) {
                            return implode.onExtraCallback(gettimebase2, surfaceProcessorNodeOut);
                        }
                        implode.onExtraCallback(gettimebase2, surfaceProcessorNodeOut);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Throwable th2 = th;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, interfaceDescriptor, Long.valueOf(jIPostMessageService_Parcel), 0L, 0L, null, null, null, Float.valueOf(f), null, null, 0L, Integer.valueOf((int) r0), Boolean.valueOf((boolean) r0), graphicDeviceInfoOnExtraCallbackWithResult, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 384, 1769472, 32754}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 43;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw th2;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @Nullable String str2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        int i5;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z4;
        final Function0<Unit> function03;
        Function0<Unit> function04;
        final boolean z5;
        final String str4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z6;
        Function0<Unit> function05 = function02;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(347396555);
        int i14 = i2 & 1;
        Object obj = null;
        if (i14 != 0) {
            int i15 = IAuthTabCallback + 107;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i17 = IAuthTabCallback + 65;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        int i18 = i2 & 4;
        if (i18 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str3 = str2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                    int i19 = onNavigationEvent + 37;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                int i21 = IAuthTabCallback + 75;
                onNavigationEvent = i21 % 128;
                i3 = i21 % 2 != 0 ? i3 | 11810 : i3 | 3072;
            } else {
                if ((i & 3072) == 0) {
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda22) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z3 = z;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            int i22 = IAuthTabCallback + 125;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 64;
                    if (i9 == 0) {
                        int i24 = IAuthTabCallback + 23;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1048576 : 524288;
                        }
                        i10 = i2 & 128;
                        if (i10 == 0) {
                            if ((i & 12582912) == 0) {
                                int i26 = IAuthTabCallback + 1;
                                onNavigationEvent = i26 % 128;
                                if (i26 % 2 != 0) {
                                    int i27 = 28 / 0;
                                    i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 8388608 : 4194304;
                                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05)) {
                                }
                                i12 = i11 | i3;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                z4 = z2;
                                function03 = function0;
                                function04 = function05;
                                z5 = z3;
                                str4 = str3;
                            } else {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                String str5 = i18 != 0 ? null : str3;
                                if (i5 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        int i28 = IAuthTabCallback + 15;
                                        onNavigationEvent = i28 % 128;
                                        int i29 = i28 % 2;
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                }
                                boolean z7 = i6 != 0 ? true : z3;
                                z4 = i7 != 0 ? false : z2;
                                Function0<Unit> function06 = i9 != 0 ? null : function0;
                                if (i10 != 0) {
                                    function05 = null;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(347396555, i12, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset.Payment (TdsAgreementV4CtaPresets.kt:86)");
                                }
                                final float f = ((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).fontScale;
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized2 = notifyPublicListeners.onWarmupCompleted(0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                final getTimebase gettimebase = (getTimebase) objOnMinimized2;
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onNavigationEvent(gettimebase));
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnExtraCallback) {
                                    int i30 = onNavigationEvent + 19;
                                    IAuthTabCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda1
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke() {
                                                int i32 = 2 % 2;
                                                int i33 = onWarmupCompleted + 9;
                                                onExtraCallbackWithResult = i33 % 128;
                                                int i34 = i33 % 2;
                                                Boolean boolValueOf = Boolean.valueOf(implode.onExtraCallbackWithResult(gettimebase));
                                                int i35 = onExtraCallbackWithResult + 65;
                                                onWarmupCompleted = i35 % 128;
                                                if (i35 % 2 == 0) {
                                                    return boolValueOf;
                                                }
                                                Object obj2 = null;
                                                obj2.hashCode();
                                                throw null;
                                            }
                                        });
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                    }
                                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3;
                                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6));
                                    if ((i12 & 896) == 256) {
                                        int i32 = onNavigationEvent + 105;
                                        IAuthTabCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(!(zOnExtraCallback2 | z6)) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized4 = Boolean.valueOf((onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6) || str5 == null) ? false : true);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                    }
                                    final boolean zBooleanValue = ((Boolean) objOnMinimized4).booleanValue();
                                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda2
                                            private static int onExtraCallback = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke() {
                                                int i34 = 2 % 2;
                                                int i35 = onExtraCallback + 63;
                                                onWarmupCompleted = i35 % 128;
                                                int i36 = i35 % 2;
                                                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1IAuthTabCallback = implode.IAuthTabCallback(f);
                                                int i37 = onWarmupCompleted + 21;
                                                onExtraCallback = i37 % 128;
                                                int i38 = i37 % 2;
                                                return virtualCameraControlExternalSyntheticLambda1IAuthTabCallback;
                                            }
                                        });
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                    }
                                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                                    final String str6 = str5;
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1026420631, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda3
                                        private static int onExtraCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
                                            int i34 = 2 % 2;
                                            int i35 = onNavigationEvent + 9;
                                            onExtraCallback = i35 % 128;
                                            int i36 = i35 % 2;
                                            Unit unitOnNavigationEvent = implode.onNavigationEvent(zBooleanValue, str6, str, cameraPresenceProviderExternalSyntheticLambda62, gettimebase, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                            int i37 = onExtraCallback + 13;
                                            onNavigationEvent = i37 % 128;
                                            int i38 = i37 % 2;
                                            return unitOnNavigationEvent;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                    int i34 = i12 >> 6;
                                    int i35 = i12 << 9;
                                    setAdvertiser.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted, null, null, null, function06, function05, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, z7, z4, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i34 & 57344) | 805306368 | (458752 & i34) | (3670016 & i35) | (29360128 & i35) | (i35 & 234881024), 14);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    function04 = function05;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    str4 = str5;
                                    z5 = z7;
                                    function03 = function06;
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                final boolean z8 = z4;
                                final Function0<Unit> function07 = function04;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.MainPreset$$ExternalSyntheticLambda4
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i36 = 2 % 2;
                                        int i37 = onExtraCallback + 63;
                                        onExtraCallbackWithResult = i37 % 128;
                                        int i38 = i37 % 2;
                                        implode implodeVar = this.f$0;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                        String str7 = str;
                                        String str8 = str4;
                                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        boolean z9 = z5;
                                        boolean z10 = z8;
                                        Function0 function08 = function03;
                                        Function0 function09 = function07;
                                        int i39 = i;
                                        int i40 = i2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        Object[] objArr = {implodeVar, quirksExternalSyntheticBackport04, str7, str8, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, Boolean.valueOf(z9), Boolean.valueOf(z10), function08, function09, Integer.valueOf(i39), Integer.valueOf(i40), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
                                        Unit unit = (Unit) implode.onNavigationEvent(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2099638768, 2099638770, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
                                        int i41 = onExtraCallbackWithResult + 117;
                                        onExtraCallback = i41 % 128;
                                        int i42 = i41 % 2;
                                        return unit;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i12 = i3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i10 = i2 & 128;
                    if (i10 == 0) {
                    }
                    i12 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i9 = i2 & 64;
                if (i9 == 0) {
                }
                i10 = i2 & 128;
                if (i10 == 0) {
                }
                i12 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i9 = i2 & 64;
            if (i9 == 0) {
            }
            i10 = i2 & 128;
            if (i10 == 0) {
            }
            i12 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        str3 = str2;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i9 = i2 & 64;
        if (i9 == 0) {
        }
        i10 = i2 & 128;
        if (i10 == 0) {
        }
        i12 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i12) == 4793490, i12 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final VirtualCameraControlExternalSyntheticLambda1 onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.min(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(RangesKt.coerceAtLeast(f * 20.0f, 20.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f))));
        int i4 = IAuthTabCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return virtualCameraControlExternalSyntheticLambda1OnNavigationEvent;
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        int i5 = onNavigationEvent + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOnWarmupCompleted;
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = onNavigationEvent + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fIAuthTabCallback);
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(implode implodeVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {implodeVar, quirksExternalSyntheticBackport0, str, str2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z), Boolean.valueOf(z2), function0, function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2099638768, 2099638770, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(implode implodeVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {implodeVar, quirksExternalSyntheticBackport0, str, str2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z), Boolean.valueOf(z2), function0, function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1558584084, 1558584084, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return ((Float) onNavigationEvent(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 9781581, -9781580, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback)).floatValue();
    }
}
