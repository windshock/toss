package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getDelegateokhttp;
import o.getSwitchMinWidth;
import o.getThumbPosition;
import o.noStore;
import o.pin;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.readFully;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import o.x2ExternalSyntheticLambda19;
import o.x2ExternalSyntheticLambda21;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda21 {
    private final x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback onExtraCallbackWithResult;
    private final float onWarmupCompleted;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char[] onExtraCallback = {41024, 63551, 4277, 43295, 49544};
    private static long IAuthTabCallback = 9145919830057792934L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4;
        int i5 = 4 - (b2 * 2);
        byte[] bArr = $$a;
        int i6 = 97 - (i * 4);
        int i7 = (b * 4) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i3 = i5;
            i4 = 0;
            i5 += i8;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i5 += i8;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i2 = 0;
            i5 = i6;
            i3 = i5;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public /* synthetic */ x2ExternalSyntheticLambda21(x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(iAuthTabCallback, f);
    }

    public static /* synthetic */ float IAuthTabCallback(pin pinVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(pinVar);
        int i4 = IAuthTabCallbackDefault + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fOnWarmupCompleted;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        getThumbPosition getthumbpositionOnExtraCallback;
        int i7 = (~((~i4) | i2)) | i6;
        int i8 = ~i6;
        int i9 = (~(i8 | i2)) | (~(i8 | i4)) | (~(i2 | i4));
        int i10 = (~(i4 | (~i2))) | i8;
        int i11 = i6 + i2 + i3 + ((-2137991558) * i5) + (111092868 * i);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i6) - 566755328) + (427185167 * i2) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i3) + ((-1247805440) * i5) + ((-1807745024) * i) + ((-591921152) * i12);
        int i14 = (i6 * (-1469267343)) + 1003592187 + (i2 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i3 * (-1469268067)) + (i5 * 1951436498) + (i * (-746069772)) + (i12 * (-1529348096));
        switch (i13 + (i14 * i14 * 1762131968)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(onextracallback, "");
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1234125768);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1234125768, iIntValue, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:234)");
                }
                if (!(!onextracallback.onExtraCallbackWithResult(Boolean.FALSE, Boolean.TRUE))) {
                    getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
                    int i16 = IAuthTabCallbackDefault + 67;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = IAuthTabCallbackDefault + 73;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return getthumbpositionOnExtraCallback;
            case 6:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function0 function0 = (Function0) objArr[2];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue), function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(zBooleanValue2), x2externalsyntheticlambda21, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        if (i3 == 0) {
            return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 662853353, iIAuthTabCallback2, iIAuthTabCallback, objArr2, iIAuthTabCallback3, -662853347);
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 25;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda21.onNavigationEvent(z, camera2CapturePipelineTorchTaskExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 37;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(x2externalsyntheticlambda21, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, boolean z, boolean z2, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(x2externalsyntheticlambda21, j, graphicDeviceInfo, j2, graphicDeviceInfo2, z, z2, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(x2externalsyntheticlambda21, j, graphicDeviceInfo, j2, graphicDeviceInfo2, z, z2, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 85;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 29;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(x2externalsyntheticlambda21, str, z, function0, quirksExternalSyntheticBackport0, z2, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallbackDefault + 77;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[1];
        MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0 = (MeteringRepeatingSessionExternalSyntheticLambda0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, x2externalsyntheticlambda21, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 77;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(x2externalsyntheticlambda21, z, function0, quirksExternalSyntheticBackport0, z2, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, getbacktracenote, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onWarmupCompleted(x2externalsyntheticlambda21, z, function0, quirksExternalSyntheticBackport0, z2, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, getbacktracenote, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, long j, long j2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, j, j2, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setorientationdegrees);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(x2externalsyntheticlambda21, zBooleanValue, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallbackWithResult(x2externalsyntheticlambda21, zBooleanValue, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 83;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            x2externalsyntheticlambda21.IAuthTabCallback(str, z, function0, quirksExternalSyntheticBackport0, z2, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            x2externalsyntheticlambda21.IAuthTabCallback(str, z, function0, quirksExternalSyntheticBackport0, z2, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(x2externalsyntheticlambda21, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ getThumbPosition onNavigationEvent(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        getThumbPosition getthumbpositionIAuthTabCallback = IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getthumbpositionIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(pin pinVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return 1.2f;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, boolean z, boolean z2, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        x2externalsyntheticlambda21.onNavigationEvent(j, graphicDeviceInfo, j2, graphicDeviceInfo2, z, z2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 29;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {x2externalsyntheticlambda21, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2)), Integer.valueOf(i3)};
        IAuthTabCallback(R.drawable.IAuthTabCallback(), -1629163799, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), 1629163803);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 15;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Context context, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {Boolean.valueOf(z), context, function0};
            throw null;
        }
        Object[] objArr2 = {Boolean.valueOf(z), context, function0};
        Unit unit = (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 513699585, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), -513699582);
        int i3 = onNavigationEvent + 25;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        updateFocusedState updatefocusedstate;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            updatefocusedstate = (updateFocusedState) IAuthTabCallback(R.drawable.IAuthTabCallback(), -638158569, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), 638158574);
            int i4 = 67 / 0;
        } else {
            Object[] objArr2 = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            updatefocusedstate = (updateFocusedState) IAuthTabCallback(R.drawable.IAuthTabCallback(), -638158569, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), 638158574);
        }
        int i5 = IAuthTabCallbackDefault + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstate;
    }

    private x2ExternalSyntheticLambda21(x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback, float f) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onWarmupCompleted = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        IAuthTabCallbackDefault = i3 % 128;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 5, i & 1))) {
            int i4 = onNavigationEvent + 125;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1562714614, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:78)");
                }
                x2externalsyntheticlambda21.onNavigationEvent(!z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                x2externalsyntheticlambda21.onNavigationEvent(!z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59697), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46134), TextUtils.lastIndexOf("", '0') + 32, 20220 - (ViewConfiguration.getLongPressTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 49124), ((byte) KeyEvent.getModifierMetaStateMask()) + 45, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 17;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 51;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), View.getDefaultSize(0, 0) + 44, (ViewConfiguration.getTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 69 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49123), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, 1494 - KeyEvent.getDeadChar(0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        Context context = (Context) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (!zBooleanValue) {
            int i4 = i3 + 81;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = {noStore.Companion};
                int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                minFresh.onNavigationEvent(context, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr2, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
                function0.invoke();
            } else {
                Object[] objArr3 = {noStore.Companion};
                int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                minFresh.onNavigationEvent(context, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr3, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2));
                function0.invoke();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent;
        final Context context;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = (QuirksExternalSyntheticBackport0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final Function0 function0 = (Function0) objArr[2];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 2) {
            z = false;
        } else {
            int i4 = i3 + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1319248357, iIntValue, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:98)");
            }
            Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = QuirkSettingsLoader.Companion.onTransact();
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelOnNavigationEvent = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent();
            if (zBooleanValue) {
                iAuthTabCallback_Parcel = iAuthTabCallback_ParcelOnNavigationEvent;
                onnavigationevent = onnavigationeventOnTransact;
                context = context2;
            } else {
                iAuthTabCallback_Parcel = iAuthTabCallback_ParcelOnNavigationEvent;
                onnavigationevent = onnavigationeventOnTransact;
                context = context2;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(addAdapter.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, x2ExternalSyntheticLambda22.onNavigationEvent(), null, 4, null));
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i5 = IAuthTabCallbackDefault + 65;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda9
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                Unit unitOnWarmupCompleted;
                                int i7 = 2 % 2;
                                int i8 = IAuthTabCallback + 59;
                                onWarmupCompleted = i8 % 128;
                                if (i8 % 2 != 0) {
                                    unitOnWarmupCompleted = x2ExternalSyntheticLambda21.onWarmupCompleted(zBooleanValue, context, function0);
                                    int i9 = 20 / 0;
                                } else {
                                    unitOnWarmupCompleted = x2ExternalSyntheticLambda21.onWarmupCompleted(zBooleanValue, context, function0);
                                }
                                int i10 = onWarmupCompleted + 79;
                                IAuthTabCallback = i10 % 128;
                                if (i10 % 2 == 0) {
                                    int i11 = 73 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                        obj = function02;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getCameraIdentifier.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, zBooleanValue, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, zBooleanValue2, Role.IAuthTabCallback(Role.Companion.asBinder()), (Function0) obj), x2externalsyntheticlambda21.onWarmupCompleted, 0.0f, 2, (Object) null), x2externalsyntheticlambda21.onExtraCallbackWithResult.onWarmupCompleted()), 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_Parcel, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, 54);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i7 = IAuthTabCallbackDefault + 3;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getCameraIdentifier.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, zBooleanValue, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, zBooleanValue2, Role.IAuthTabCallback(Role.Companion.asBinder()), (Function0) obj), x2externalsyntheticlambda21.onWarmupCompleted, 0.0f, 2, (Object) null), x2externalsyntheticlambda21.onExtraCallbackWithResult.onWarmupCompleted()), 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_Parcel, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, 54);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback22);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        int i;
        getBacktraceNote getbacktracenote;
        Function0 function0;
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        boolean z2;
        int i3;
        int i4;
        long jOnTransact;
        int i5;
        int i6;
        GraphicDeviceInfo graphicDeviceInfo;
        int i7;
        int i8;
        int i9;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i10;
        Function2 function2;
        int i11;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        int i12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i13;
        boolean z3;
        final long j;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final boolean z4;
        Function2 function2OnExtraCallback;
        int i14;
        int i15;
        final x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function0 function02 = (Function0) objArr[2];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        long jLongValue = ((Number) objArr[5]).longValue();
        GraphicDeviceInfo graphicDeviceInfo3 = (GraphicDeviceInfo) objArr[6];
        long jLongValue2 = ((Number) objArr[7]).longValue();
        GraphicDeviceInfo graphicDeviceInfo4 = (GraphicDeviceInfo) objArr[8];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[9];
        Function2 function22 = (Function2) objArr[10];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[11];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        final int iIntValue2 = ((Number) objArr[14]).intValue();
        final int iIntValue3 = ((Number) objArr[15]).intValue();
        int i16 = 2 % 2;
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1497433248);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                int i17 = onNavigationEvent + 107;
                z = zBooleanValue;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                i15 = 4;
            } else {
                z = zBooleanValue;
                i15 = 2;
            }
            i = i15 | iIntValue;
        } else {
            z = zBooleanValue;
            i = iIntValue;
        }
        Object obj = null;
        if ((iIntValue & 48) == 0) {
            int i19 = onNavigationEvent + 47;
            getbacktracenote = getbacktracenote2;
            IAuthTabCallbackDefault = i19 % 128;
            if (i19 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 32 : 16;
        } else {
            getbacktracenote = getbacktracenote2;
        }
        int i20 = iIntValue3 & 4;
        if (i20 != 0) {
            int i21 = onNavigationEvent + 45;
            function0 = function02;
            IAuthTabCallbackDefault = i21 % 128;
            int i22 = i21 % 2;
            i |= 384;
        } else {
            function0 = function02;
            if ((iIntValue & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                    i2 = 256;
                } else {
                    int i23 = onNavigationEvent + 107;
                    IAuthTabCallbackDefault = i23 % 128;
                    int i24 = i23 % 2;
                    i2 = 128;
                }
                i |= i2;
            }
        }
        int i25 = iIntValue3 & 8;
        if (i25 != 0) {
            i |= 3072;
        } else if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 2048 : 1024;
        }
        int i26 = iIntValue3 & 16;
        if (i26 == 0) {
            onextracallback = onextracallback2;
            if ((iIntValue & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                    int i27 = IAuthTabCallbackDefault + 45;
                    z2 = zBooleanValue2;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    i3 = 16384;
                } else {
                    z2 = zBooleanValue2;
                    i3 = 8192;
                }
                i |= i3;
            }
            i4 = iIntValue3 & 32;
            if (i4 != 0) {
                if ((196608 & iIntValue) == 0) {
                    jOnTransact = jLongValue;
                    i |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo3) ? 65536 : 131072;
                }
                i5 = iIntValue3 & 64;
                if (i5 != 0) {
                    int i29 = onNavigationEvent + 71;
                    IAuthTabCallbackDefault = i29 % 128;
                    int i30 = i29 % 2;
                    i |= 1572864;
                } else if ((iIntValue & 1572864) == 0) {
                    i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2) ? 1048576 : 524288;
                }
                i6 = iIntValue3 & 128;
                if (i6 == 0) {
                    if ((12582912 & iIntValue) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo4)) {
                            int i31 = IAuthTabCallbackDefault + 121;
                            graphicDeviceInfo = graphicDeviceInfo3;
                            onNavigationEvent = i31 % 128;
                            if (i31 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            i7 = 8388608;
                        } else {
                            graphicDeviceInfo = graphicDeviceInfo3;
                            i7 = 4194304;
                        }
                        i8 = i7 | i;
                    }
                    i9 = iIntValue3 & 256;
                    if (i9 != 0) {
                        graphicDeviceInfo2 = graphicDeviceInfo4;
                        i14 = (100663296 & iIntValue) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda23) ? 67108864 : 33554432 : 100663296;
                        i10 = iIntValue3 & 512;
                        if (i10 == 0) {
                            if ((805306368 & iIntValue) == 0) {
                                function2 = function22;
                                i11 = iIntValue;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                i8 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 268435456 : 536870912) | i8;
                            }
                            final getBacktraceNote getbacktracenote3 = getbacktracenote;
                            if ((iIntValue2 & 6) != 0) {
                                i12 = iIntValue2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 4 : 2);
                            } else {
                                i12 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i12 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(x2externalsyntheticlambda21) ? 32 : 16;
                            }
                            Function2 function23 = function2;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                i13 = i11;
                                z3 = z;
                                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                                j = jLongValue2;
                            } else {
                                if (i20 != 0) {
                                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                }
                                if (i25 != 0) {
                                    z2 = true;
                                }
                                if (i26 != 0) {
                                    int i32 = IAuthTabCallbackDefault + 59;
                                    onNavigationEvent = i32 % 128;
                                    int i33 = i32 % 2;
                                    jOnTransact = setByteOrder.Companion.onTransact();
                                }
                                if (i4 != 0) {
                                    graphicDeviceInfo = null;
                                }
                                if (i5 != 0) {
                                    jLongValue2 = setByteOrder.Companion.onTransact();
                                }
                                long j2 = jLongValue2;
                                if (i6 != 0) {
                                    int i34 = onNavigationEvent + 103;
                                    IAuthTabCallbackDefault = i34 % 128;
                                    if (i34 % 2 == 0) {
                                        int i35 = 80 / 0;
                                    }
                                    graphicDeviceInfo2 = null;
                                }
                                if (i9 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    Object obj2 = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Object objOnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
                                        obj2 = objOnWarmupCompleted;
                                    }
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj2;
                                } else {
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                }
                                if (i10 != 0) {
                                    z4 = z;
                                    function2OnExtraCallback = ForwardingCameraControl.onExtraCallback(1562714614, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda3
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj3, Object obj4) {
                                            int i36 = 2 % 2;
                                            int i37 = onWarmupCompleted + 11;
                                            onNavigationEvent = i37 % 128;
                                            int i38 = i37 % 2;
                                            x2ExternalSyntheticLambda21 x2externalsyntheticlambda212 = this.f$0;
                                            boolean z5 = z4;
                                            int iIntValue4 = ((Integer) obj4).intValue();
                                            Object[] objArr2 = {x2externalsyntheticlambda212, Boolean.valueOf(z5), camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue4)};
                                            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                                            Unit unit = (Unit) x2ExternalSyntheticLambda21.IAuthTabCallback(R.drawable.IAuthTabCallback(), 904792979, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr2, R.drawable.IAuthTabCallback(), -904792978);
                                            int i39 = onWarmupCompleted + 123;
                                            onNavigationEvent = i39 % 128;
                                            int i40 = i39 % 2;
                                            return unit;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                } else {
                                    z4 = z;
                                    function2OnExtraCallback = function23;
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1497433248, i8, i12, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item (ItemPreset.kt:84)");
                                }
                                function2OnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i8 >> 27) & 14));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(219338908);
                                long jLongValue3 = jOnTransact != 16 ? jOnTransact : ((Long) x2ExternalSyntheticLambda17.onWarmupCompleted(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{x2ExternalSyntheticLambda17.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, -635540070, 635540072)).longValue();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = graphicDeviceInfo == null ? isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub() : graphicDeviceInfo;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(219344862);
                                long jOnTransact2 = j2 != 16 ? j2 : x2ExternalSyntheticLambda17.IAuthTabCallback.onTransact(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                i13 = i11;
                                final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback;
                                final boolean z5 = z4;
                                final Function0 function03 = function0;
                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                int i36 = i8;
                                final boolean z6 = z2;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                function23 = function2OnExtraCallback;
                                z3 = z4;
                                x2externalsyntheticlambda21.onNavigationEvent(jLongValue3, graphicDeviceInfoIAuthTabCallbackStub, jOnTransact2, graphicDeviceInfo2 == null ? isRepeatingEnabled.onExtraCallback.onTransact() : graphicDeviceInfo2, z4, z2, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1319248357, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i37 = 2 % 2;
                                        int i38 = IAuthTabCallback + 99;
                                        onExtraCallbackWithResult = i38 % 128;
                                        int i39 = i38 % 2;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = onextracallback3;
                                        boolean z7 = z5;
                                        Function0 function04 = function03;
                                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                        boolean z8 = z6;
                                        int iIntValue4 = ((Integer) obj4).intValue();
                                        Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(z7), function04, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, Boolean.valueOf(z8), x2externalsyntheticlambda21, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue4)};
                                        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                                        Unit unit = (Unit) x2ExternalSyntheticLambda21.IAuthTabCallback(R.drawable.IAuthTabCallback(), 1283296846, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr2, R.drawable.IAuthTabCallback(), -1283296846);
                                        int i40 = IAuthTabCallback + 41;
                                        onExtraCallbackWithResult = i40 % 128;
                                        int i41 = i40 % 2;
                                        return unit;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i36 << 12) & 57344) | 1572864 | (458752 & (i36 << 6)) | ((i12 << 18) & 29360128));
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                j = j2;
                            }
                            final Function2 function24 = function23;
                            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback;
                            final boolean z7 = z2;
                            final long j3 = jOnTransact;
                            final GraphicDeviceInfo graphicDeviceInfo5 = graphicDeviceInfo;
                            final GraphicDeviceInfo graphicDeviceInfo6 = graphicDeviceInfo2;
                            final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                final boolean z8 = z3;
                                final Function0 function04 = function0;
                                final int i37 = i13;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda5
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i38 = 2 % 2;
                                        int i39 = onNavigationEvent + 83;
                                        onExtraCallback = i39 % 128;
                                        int i40 = i39 % 2;
                                        Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda21.onExtraCallbackWithResult(this.f$0, z8, function04, onextracallback4, z7, j3, graphicDeviceInfo5, j, graphicDeviceInfo6, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, function24, getbacktracenote3, i37, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                        int i41 = onExtraCallback + 115;
                                        onNavigationEvent = i41 % 128;
                                        int i42 = i41 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                });
                            }
                            return null;
                        }
                        i8 |= 805306368;
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                        function2 = function22;
                        i11 = iIntValue;
                        final getBacktraceNote getbacktracenote32 = getbacktracenote;
                        if ((iIntValue2 & 6) != 0) {
                        }
                        if ((iIntValue2 & 48) == 0) {
                        }
                        Function2 function232 = function2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
                        }
                        final Function2 function242 = function232;
                        final QuirksExternalSyntheticBackport0 onextracallback42 = onextracallback;
                        final boolean z72 = z2;
                        final long j32 = jOnTransact;
                        final GraphicDeviceInfo graphicDeviceInfo52 = graphicDeviceInfo;
                        final GraphicDeviceInfo graphicDeviceInfo62 = graphicDeviceInfo2;
                        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda252 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                        return null;
                    }
                    int i38 = onNavigationEvent + 21;
                    graphicDeviceInfo2 = graphicDeviceInfo4;
                    IAuthTabCallbackDefault = i38 % 128;
                    if (i38 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i8 |= i14;
                    i10 = iIntValue3 & 512;
                    if (i10 == 0) {
                    }
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                    function2 = function22;
                    i11 = iIntValue;
                    final getBacktraceNote getbacktracenote322 = getbacktracenote;
                    if ((iIntValue2 & 6) != 0) {
                    }
                    if ((iIntValue2 & 48) == 0) {
                    }
                    Function2 function2322 = function2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
                    }
                    final Function2 function2422 = function2322;
                    final QuirksExternalSyntheticBackport0 onextracallback422 = onextracallback;
                    final boolean z722 = z2;
                    final long j322 = jOnTransact;
                    final GraphicDeviceInfo graphicDeviceInfo522 = graphicDeviceInfo;
                    final GraphicDeviceInfo graphicDeviceInfo622 = graphicDeviceInfo2;
                    final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2522 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    return null;
                }
                i |= 12582912;
                graphicDeviceInfo = graphicDeviceInfo3;
                i8 = i;
                i9 = iIntValue3 & 256;
                if (i9 != 0) {
                }
                i8 |= i14;
                i10 = iIntValue3 & 512;
                if (i10 == 0) {
                }
                camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                function2 = function22;
                i11 = iIntValue;
                final getBacktraceNote getbacktracenote3222 = getbacktracenote;
                if ((iIntValue2 & 6) != 0) {
                }
                if ((iIntValue2 & 48) == 0) {
                }
                Function2 function23222 = function2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
                }
                final Function2 function24222 = function23222;
                final QuirksExternalSyntheticBackport0 onextracallback4222 = onextracallback;
                final boolean z7222 = z2;
                final long j3222 = jOnTransact;
                final GraphicDeviceInfo graphicDeviceInfo5222 = graphicDeviceInfo;
                final GraphicDeviceInfo graphicDeviceInfo6222 = graphicDeviceInfo2;
                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25222 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            }
            i |= 196608;
            jOnTransact = jLongValue;
            i5 = iIntValue3 & 64;
            if (i5 != 0) {
            }
            i6 = iIntValue3 & 128;
            if (i6 == 0) {
            }
            graphicDeviceInfo = graphicDeviceInfo3;
            i8 = i;
            i9 = iIntValue3 & 256;
            if (i9 != 0) {
            }
            i8 |= i14;
            i10 = iIntValue3 & 512;
            if (i10 == 0) {
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
            function2 = function22;
            i11 = iIntValue;
            final getBacktraceNote getbacktracenote32222 = getbacktracenote;
            if ((iIntValue2 & 6) != 0) {
            }
            if ((iIntValue2 & 48) == 0) {
            }
            Function2 function232222 = function2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
            }
            final Function2 function242222 = function232222;
            final QuirksExternalSyntheticBackport0 onextracallback42222 = onextracallback;
            final boolean z72222 = z2;
            final long j32222 = jOnTransact;
            final GraphicDeviceInfo graphicDeviceInfo52222 = graphicDeviceInfo;
            final GraphicDeviceInfo graphicDeviceInfo62222 = graphicDeviceInfo2;
            final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda252222 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        i |= 24576;
        onextracallback = onextracallback2;
        z2 = zBooleanValue2;
        i4 = iIntValue3 & 32;
        if (i4 != 0) {
        }
        jOnTransact = jLongValue;
        i5 = iIntValue3 & 64;
        if (i5 != 0) {
        }
        i6 = iIntValue3 & 128;
        if (i6 == 0) {
        }
        graphicDeviceInfo = graphicDeviceInfo3;
        i8 = i;
        i9 = iIntValue3 & 256;
        if (i9 != 0) {
        }
        i8 |= i14;
        i10 = iIntValue3 & 512;
        if (i10 == 0) {
        }
        camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        function2 = function22;
        i11 = iIntValue;
        final getBacktraceNote getbacktracenote322222 = getbacktracenote;
        if ((iIntValue2 & 6) != 0) {
        }
        if ((iIntValue2 & 48) == 0) {
        }
        Function2 function2322222 = function2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 306783379) == 306783378 || (i12 & 19) != 18, i8 & 1)) {
        }
        final Function2 function2422222 = function2322222;
        final QuirksExternalSyntheticBackport0 onextracallback422222 = onextracallback;
        final boolean z722222 = z2;
        final long j322222 = jOnTransact;
        final GraphicDeviceInfo graphicDeviceInfo522222 = graphicDeviceInfo;
        final GraphicDeviceInfo graphicDeviceInfo622222 = graphicDeviceInfo2;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2522222 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static final Unit onNavigationEvent(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 21;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(956842493, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:145)");
            }
            x2externalsyntheticlambda21.onNavigationEvent(!z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackDefault + 107;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            z = true;
            int i6 = i4 + 1;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = IAuthTabCallbackDefault + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = onNavigationEvent + 95;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(512070906, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:163)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, x2externalsyntheticlambda21.onExtraCallbackWithResult.IAuthTabCallback(), 0L, 0L, 0L, ConnectionPool.onWarmupCompleted.onWarmupCompleted(), null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 130746}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onNavigationEvent + 97;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final String str, final boolean z, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z4;
        final long j3;
        final GraphicDeviceInfo graphicDeviceInfo3;
        final long j4;
        final GraphicDeviceInfo graphicDeviceInfo4;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z5;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2118167789);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        int i16 = i3 & 8;
        Object obj = null;
        if (i16 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            int i17 = onNavigationEvent + 121;
            IAuthTabCallbackDefault = i17 % 128;
            if (i17 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
        }
        int i18 = i3 & 16;
        if (i18 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i19 = onNavigationEvent + 1;
                    IAuthTabCallbackDefault = i19 % 128;
                    int i20 = i19 % 2;
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i5 | i4;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i6 |= 196608;
            } else if ((196608 & i) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 131072 : 65536;
            }
            i8 = i3 & 64;
            if (i8 == 0) {
                i6 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 1048576 : 524288;
            }
            i9 = i3 & 128;
            if (i9 == 0) {
                int i21 = IAuthTabCallbackDefault + 83;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                i6 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                    i10 = 4194304;
                } else {
                    int i23 = IAuthTabCallbackDefault + 17;
                    onNavigationEvent = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                    i10 = 8388608;
                }
                i6 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((100663296 & i) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 67108864 : 33554432;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    int i24 = onNavigationEvent + 95;
                    IAuthTabCallbackDefault = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    i6 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 536870912 : 268435456;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    int i25 = onNavigationEvent + 21;
                    IAuthTabCallbackDefault = i25 % 128;
                    int i26 = i25 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                        int i27 = onNavigationEvent + 51;
                        IAuthTabCallbackDefault = i27 % 128;
                        int i28 = i27 % 2 == 0 ? 2 : 4;
                        i14 = i2 | i28;
                    }
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 32 : 16;
                }
                int i29 = i14;
                if ((306783379 & i6) == 306783378) {
                    int i30 = onNavigationEvent + 55;
                    IAuthTabCallbackDefault = i30 % 128;
                    int i31 = i30 % 2;
                    z3 = (i29 & 19) != 18;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i16 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    if (i18 != 0) {
                        int i32 = IAuthTabCallbackDefault + 63;
                        onNavigationEvent = i32 % 128;
                        int i33 = i32 % 2;
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    long jOnTransact = i7 != 0 ? setByteOrder.Companion.onTransact() : j;
                    GraphicDeviceInfo graphicDeviceInfo5 = i8 != 0 ? null : graphicDeviceInfo;
                    long jOnTransact2 = i9 != 0 ? setByteOrder.Companion.onTransact() : j2;
                    GraphicDeviceInfo graphicDeviceInfo6 = i11 != 0 ? null : graphicDeviceInfo2;
                    if (i12 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                    } else {
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    }
                    Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2OnExtraCallback = i13 != 0 ? ForwardingCameraControl.onExtraCallback(956842493, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) throws Throwable {
                            int i34 = 2 % 2;
                            int i35 = onWarmupCompleted + 3;
                            IAuthTabCallback = i35 % 128;
                            int i36 = i35 % 2;
                            x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = this.f$0;
                            if (i36 == 0) {
                                return x2ExternalSyntheticLambda21.IAuthTabCallback(x2externalsyntheticlambda21, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            x2ExternalSyntheticLambda21.IAuthTabCallback(x2externalsyntheticlambda21, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54) : function2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2118167789, i6, i29, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.Item (ItemPreset.kt:150)");
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                    IAuthTabCallback(R.drawable.IAuthTabCallback(), -1629163799, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport03, Boolean.valueOf(z5), Long.valueOf(jOnTransact), graphicDeviceInfo5, Long.valueOf(jOnTransact2), graphicDeviceInfo6, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, function2OnExtraCallback, ForwardingCameraControl.onExtraCallback(512070906, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i34 = 2 % 2;
                            int i35 = onExtraCallbackWithResult + 41;
                            onNavigationEvent = i35 % 128;
                            if (i35 % 2 != 0) {
                                Object[] objArr = {str, this, (MeteringRepeatingSessionExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                            Object[] objArr2 = {str, this, (MeteringRepeatingSessionExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                            Unit unit = (Unit) x2ExternalSyntheticLambda21.IAuthTabCallback(R.drawable.IAuthTabCallback(), 1129845362, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback(), -1129845360);
                            int i36 = onExtraCallbackWithResult + 15;
                            onNavigationEvent = i36 % 128;
                            int i37 = i36 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i6 >> 3) & 268435454) | ((i29 << 27) & 1879048192)), Integer.valueOf((i29 & 112) | 6), 0}, R.drawable.IAuthTabCallback(), 1629163803);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    graphicDeviceInfo4 = graphicDeviceInfo6;
                    graphicDeviceInfo3 = graphicDeviceInfo5;
                    function22 = function2OnExtraCallback;
                    z4 = z5;
                    j3 = jOnTransact;
                    j4 = jOnTransact2;
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    z4 = z2;
                    j3 = j;
                    graphicDeviceInfo3 = graphicDeviceInfo;
                    j4 = j2;
                    graphicDeviceInfo4 = graphicDeviceInfo2;
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    function22 = function2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i34 = 2 % 2;
                            int i35 = onExtraCallback + 5;
                            IAuthTabCallback = i35 % 128;
                            int i36 = i35 % 2;
                            Unit unitOnExtraCallback = x2ExternalSyntheticLambda21.onExtraCallback(this.f$0, str, z, function0, quirksExternalSyntheticBackport02, z4, j3, graphicDeviceInfo3, j4, graphicDeviceInfo4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, function22, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i37 = onExtraCallback + 5;
                            IAuthTabCallback = i37 % 128;
                            if (i37 % 2 == 0) {
                                int i38 = 82 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            int i34 = onNavigationEvent + 7;
            IAuthTabCallbackDefault = i34 % 128;
            int i35 = i34 % 2;
            i6 |= 100663296;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i292 = i14;
            if ((306783379 & i6) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i4;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2922 = i14;
        if ((306783379 & i6) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final getThumbPosition IAuthTabCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getThumbPosition getthumbpositionOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 65;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(904485072);
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(904485072);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackDefault + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(904485072, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous>.<anonymous> (ItemPreset.kt:182)");
                int i5 = 73 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(904485072, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous>.<anonymous> (ItemPreset.kt:182)");
            }
        }
        if (onextracallback.onExtraCallbackWithResult(Boolean.FALSE, Boolean.TRUE)) {
            int i6 = IAuthTabCallbackDefault + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
        } else {
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onNavigationEvent + 101;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    private static final Unit onExtraCallback(boolean z, long j, long j2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        if (!(!z)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) * RangesKt.coerceIn(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6), 0.0f, 1.1f);
            if (fIntBitsToFloat > 0.0f) {
                int i3 = IAuthTabCallbackDefault + 81;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(j2)}), 0L, fIntBitsToFloat, 0, 10, (Object) null), fIntBitsToFloat, 0L, RangesKt.coerceIn(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62), 0.0f, 0.6f), (hasMoreElements) null, (seek) null, 0, 116, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final boolean z, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objIAuthTabCallback;
        float f;
        int i3;
        Object objIAuthTabCallback2;
        Function1 function1IAuthTabCallbackStub;
        float f2;
        Function1 function1IAuthTabCallbackStub2;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(578227387);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Function1 function1 = null;
        if ((i & 48) == 0) {
            int i6 = onNavigationEvent + 85;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda1);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda1)) {
                int i7 = IAuthTabCallbackDefault + 21;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146) {
            int i9 = onNavigationEvent + 59;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(578227387, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication (ItemPreset.kt:177)");
            }
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 3) & 14))), "indication", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        getThumbPosition getthumbpositionOnNavigationEvent;
                        int i11 = 2 % 2;
                        int i12 = onExtraCallback + 77;
                        onExtraCallbackWithResult = i12 % 128;
                        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                        if (i12 % 2 != 0) {
                            getthumbpositionOnNavigationEvent = x2ExternalSyntheticLambda21.onNavigationEvent(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj3).intValue());
                            int i13 = 34 / 0;
                        } else {
                            getthumbpositionOnNavigationEvent = x2ExternalSyntheticLambda21.onNavigationEvent(onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj3).intValue());
                        }
                        int i14 = onExtraCallbackWithResult + 65;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return getthumbpositionOnNavigationEvent;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized;
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
            if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(!zOnNavigationEvent) || objIAuthTabCallback == onwarmupcompleted.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                    if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null) {
                        int i11 = onNavigationEvent + 9;
                        IAuthTabCallbackDefault = i11 % 128;
                        if (i11 % 2 == 0) {
                            function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                            int i12 = 31 / 0;
                        } else {
                            function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                        }
                    } else {
                        function1IAuthTabCallbackStub2 = null;
                    }
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                    try {
                        Object objIAuthTabCallback3 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                        iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback3);
                        objIAuthTabCallback = objIAuthTabCallback3;
                    } catch (Throwable th) {
                        iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub2);
                        throw th;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            boolean zBooleanValue = ((Boolean) objIAuthTabCallback).booleanValue();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1254603561);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1254603561, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous> (ItemPreset.kt:192)");
            }
            if (zBooleanValue) {
                int i13 = onNavigationEvent + 21;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidthOnWarmupCompleted));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            boolean zBooleanValue2 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult()).booleanValue();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1254603561);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1254603561, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous> (ItemPreset.kt:192)");
            }
            float f3 = zBooleanValue2 ? 1.0f : 0.0f;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent3) {
                int i15 = IAuthTabCallbackDefault + 13;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    onwarmupcompleted.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, Float.valueOf(f), Float.valueOf(f3), (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48), getthumbtintlistIAuthTabCallback, "scale", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                getThumbTintList getthumbtintlistIAuthTabCallback2 = getThumbTextPadding.IAuthTabCallback(floatCompanionObject);
                if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                    i3 = 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent4 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback2.IAuthTabCallback();
                        if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null) {
                            int i16 = IAuthTabCallbackDefault + 69;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 != 0) {
                                function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub();
                                i3 = 0;
                                int i17 = 55 / 0;
                            } else {
                                i3 = 0;
                                function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub();
                            }
                            function1 = function1IAuthTabCallbackStub;
                        } else {
                            i3 = 0;
                        }
                        Function1 function12 = function1;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                        try {
                            Object objIAuthTabCallback4 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function12);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback4);
                            objIAuthTabCallback2 = objIAuthTabCallback4;
                        } catch (Throwable th2) {
                            iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function12);
                            throw th2;
                        }
                    } else {
                        objIAuthTabCallback2 = objOnMinimized4;
                        i3 = 0;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                boolean zBooleanValue3 = ((Boolean) objIAuthTabCallback2).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1732159467);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732159467, i3, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous> (ItemPreset.kt:197)");
                }
                if (zBooleanValue3) {
                    int i18 = onNavigationEvent + 61;
                    IAuthTabCallbackDefault = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 64 / i3;
                    }
                    f2 = 0.5f;
                } else {
                    f2 = 0.0f;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i20 = IAuthTabCallbackDefault + 11;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent5 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                boolean zBooleanValue4 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5).onExtraCallbackWithResult()).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1732159467);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i22 = IAuthTabCallbackDefault + 99;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732159467, i3, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous> (ItemPreset.kt:197)");
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1732159467, i3, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.GradientIndication.<anonymous> (ItemPreset.kt:197)");
                    }
                }
                float f4 = !(zBooleanValue4 ^ true) ? 0.5f : 0.0f;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent6 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onWarmupCompleted(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                updateFocusedState updatefocusedstate = (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized6).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                Float fValueOf = Float.valueOf(f2);
                Float fValueOf2 = Float.valueOf(f4);
                Object[] objArr = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4 - TextUtils.lastIndexOf("", '0', i3, i3), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19956), objArr);
                String strIntern = ((String) objArr[i3]).intern();
                int i23 = i3;
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, fValueOf, fValueOf2, updatefocusedstate, getthumbtintlistIAuthTabCallback2, strIntern, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                final long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientStart, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                final long jOnWarmupCompleted2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientEnd, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion);
                int i24 = (i2 & 14) != 4 ? i23 : 1;
                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnWarmupCompleted);
                boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnWarmupCompleted2);
                boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((zOnNavigationEvent7 ? 1 : 0) | i24 | (zOnWarmupCompleted ? 1 : 0) | (zOnWarmupCompleted2 ? 1 : 0) | (zOnNavigationEvent8 ? 1 : 0)) != 0 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i25 = 2 % 2;
                            int i26 = IAuthTabCallback + 35;
                            onWarmupCompleted = i26 % 128;
                            int i27 = i26 % 2;
                            Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda21.onExtraCallbackWithResult(z, jOnWarmupCompleted, jOnWarmupCompleted2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, (setOrientationDegrees) obj);
                            int i28 = IAuthTabCallback + 79;
                            onWarmupCompleted = i28 % 128;
                            int i29 = i28 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda12
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i25 = 2 % 2;
                    int i26 = onWarmupCompleted + 23;
                    onExtraCallbackWithResult = i26 % 128;
                    if (i26 % 2 == 0) {
                        x2ExternalSyntheticLambda21.onNavigationEvent(this.f$0, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnNavigationEvent = x2ExternalSyntheticLambda21.onNavigationEvent(this.f$0, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i27 = onWarmupCompleted + 59;
                    onExtraCallbackWithResult = i27 % 128;
                    int i28 = i27 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(final long j, final GraphicDeviceInfo graphicDeviceInfo, final long j2, final GraphicDeviceInfo graphicDeviceInfo2, final boolean z, final boolean z2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        Object objIAuthTabCallback;
        int i3;
        Object objIAuthTabCallback2;
        float f;
        float f2;
        GraphicDeviceInfo graphicDeviceInfo3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1327404111);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo)) {
                int i8 = IAuthTabCallbackDefault + 67;
                onNavigationEvent = i8 % 128;
                i6 = i8 % 2 != 0 ? 52 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i9 = onNavigationEvent + 39;
            IAuthTabCallbackDefault = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2);
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ^ true ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2)) {
                int i10 = IAuthTabCallbackDefault + 23;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            int i12 = IAuthTabCallbackDefault + 73;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 26 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i2 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i2) != 599186, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1327404111, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition (ItemPreset.kt:229)");
            }
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(z), "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 >> 12) & 14) | 48, 0);
            int i14 = i2 >> 15;
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted2 = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(z2), "itemAlpha", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 14) | 48, 0);
            getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda6
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 13;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    updateFocusedState updatefocusedstateOnWarmupCompleted = x2ExternalSyntheticLambda21.onWarmupCompleted((getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i18 = onNavigationEvent + 67;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 != 0) {
                        return updatefocusedstateOnWarmupCompleted;
                    }
                    throw null;
                }
            };
            boolean zBooleanValue = ((Boolean) getswitchminwidthOnWarmupCompleted.access000()).booleanValue();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(236678324);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236678324, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:242)");
            }
            long j3 = zBooleanValue ? j : j2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = IAuthTabCallbackDefault + 39;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i16 = 27 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(j3);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getattributeOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getThumbTintList getthumbtintlist = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getthumbtintlist);
                    obj2 = getthumbtintlist;
                }
                getThumbTintList getthumbtintlist2 = (getThumbTintList) obj2;
                if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent2 || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback3 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback3);
                            objIAuthTabCallback = objIAuthTabCallback3;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                boolean zBooleanValue2 = ((Boolean) objIAuthTabCallback).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(236678324);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236678324, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:242)");
                }
                long j4 = zBooleanValue2 ? j : j2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j4);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                boolean zBooleanValue3 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult()).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(236678324);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    i3 = -1;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236678324, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:242)");
                } else {
                    i3 = -1;
                }
                long j5 = zBooleanValue3 ? j : j2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(j5);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent4 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                updateFocusedState updatefocusedstate = (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int i17 = i3;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, updatefocusedstate, getthumbtintlist2, "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                asBinder asbinder = asBinder.onExtraCallbackWithResult;
                getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
                if (getswitchminwidthOnWarmupCompleted2.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted2.IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted2);
                    objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent5 || objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback2.IAuthTabCallback();
                        Function1 function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub() : null;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                        try {
                            Object objIAuthTabCallback4 = getswitchminwidthOnWarmupCompleted2.IAuthTabCallback();
                            iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback4);
                            objIAuthTabCallback2 = objIAuthTabCallback4;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                boolean zBooleanValue4 = ((Boolean) objIAuthTabCallback2).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1162209567);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1162209567, 0, i17, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:246)");
                }
                if (zBooleanValue4) {
                    int i18 = onNavigationEvent + 15;
                    IAuthTabCallbackDefault = i18 % 128;
                    int i19 = i18 % 2;
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i20 = IAuthTabCallbackDefault + 43;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted2);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onTransact(getswitchminwidthOnWarmupCompleted2));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                boolean zBooleanValue5 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult()).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1162209567);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1162209567, 0, i17, "im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:246)");
                }
                if (zBooleanValue5) {
                    int i21 = IAuthTabCallbackDefault + 95;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted2);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent7 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidthOnWarmupCompleted2));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                float fCoerceIn = RangesKt.coerceIn(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted2, Float.valueOf(f), Float.valueOf(f2), (updateFocusedState) asbinder.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistIAuthTabCallback, "itemAlpha", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608)), 0.5f, 1.0f);
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)));
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback2 = copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(setByteOrder.onWarmupCompleted(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback)) * fCoerceIn));
                accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                long jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), fCoerceIn);
                if (z) {
                    int i23 = onNavigationEvent + 109;
                    IAuthTabCallbackDefault = i23 % 128;
                    if (i23 % 2 == 0) {
                        throw null;
                    }
                    graphicDeviceInfo3 = graphicDeviceInfo;
                } else {
                    graphicDeviceInfo3 = graphicDeviceInfo2;
                }
                accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback3 = accessismonitoringpOnWarmupCompleted.onExtraCallback(gethumanreadablename.onWarmupCompleted(new getHumanReadableName(jOnExtraCallbackWithResult, 0L, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null)));
                accessisMonitoringp<dispatchPostbackAsync> accessismonitoringpOnWarmupCompleted2 = dispatchPostbackRequest.onWarmupCompleted();
                dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj3) {
                            int i24 = 2 % 2;
                            int i25 = onExtraCallbackWithResult + 67;
                            onExtraCallback = i25 % 128;
                            int i26 = i25 % 2;
                            Float fValueOf = Float.valueOf(x2ExternalSyntheticLambda21.IAuthTabCallback((pin) obj3));
                            int i27 = onExtraCallbackWithResult + 73;
                            onExtraCallback = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i28 = 37 / 0;
                            }
                            return fValueOf;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                Function1 function1 = (Function1) objOnMinimized6;
                getDelegateokhttp.onExtraCallback onextracallback = getDelegateokhttp.Companion;
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessgetcamerafactorypOnExtraCallback, accessgetcamerafactorypOnExtraCallback2, accessgetcamerafactorypOnExtraCallback3, accessismonitoringpOnWarmupCompleted2.onExtraCallback(dispatchPostbackAsync.onWarmupCompleted(dispatchpostbackasync, 0.0f, 0, 0, null, onPostbackFailure.onExtraCallback(function1, 0.0f, onextracallback.onExtraCallbackWithResult(), onextracallback.onWarmupCompleted(), 2, null), 15, null))}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 112) | accessgetCameraFactoryp.onNavigationEvent);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i24 = IAuthTabCallbackDefault + 57;
            onNavigationEvent = i24 % 128;
            int i25 = i24 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.v1.ItemPreset$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj3, Object obj4) {
                    int i26 = 2 % 2;
                    int i27 = onNavigationEvent + 1;
                    IAuthTabCallback = i27 % 128;
                    int i28 = i27 % 2;
                    Unit unitOnExtraCallback = x2ExternalSyntheticLambda21.onExtraCallback(this.f$0, j, graphicDeviceInfo, j2, graphicDeviceInfo2, z, z2, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i29 = onNavigationEvent + 79;
                    IAuthTabCallback = i29 % 128;
                    int i30 = i29 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            return quirksExternalSyntheticBackport0.onExtraCallback(ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback()));
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        int i3 = 72 / 0;
        return quirksExternalSyntheticBackport0.onExtraCallback(ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback()));
    }

    private static final boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackDefault + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.floatValue();
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = IAuthTabCallbackDefault + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onNavigationEvent + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final long onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = IAuthTabCallbackDefault + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onNavigationEvent + 91;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z2), x2externalsyntheticlambda21, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 1283296846, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), -1283296846);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, x2externalsyntheticlambda21, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 1129845362, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), -1129845360);
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, boolean z, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {x2externalsyntheticlambda21, Boolean.valueOf(z), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 904792979, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), -904792978);
    }

    private static final updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (updateFocusedState) IAuthTabCallback(R.drawable.IAuthTabCallback(), -638158569, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), 638158574);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z2), x2externalsyntheticlambda21, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 662853353, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), -662853347);
    }

    private static final Unit onExtraCallback(boolean z, Context context, Function0 function0) {
        Object[] objArr = {Boolean.valueOf(z), context, function0};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) IAuthTabCallback(R.drawable.IAuthTabCallback(), 513699585, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), -513699582);
    }

    public final void onExtraCallbackWithResult(boolean z, @NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @NotNull getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {this, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        IAuthTabCallback(R.drawable.IAuthTabCallback(), -1629163799, R.drawable.IAuthTabCallback(), iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback(), 1629163803);
    }

    public static final class onExtraCallback implements Function0<Boolean> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onExtraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onExtraCallbackWithResult.access000();
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Access000;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Boolean invoke() {
            Boolean boolAccess000;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
                boolAccess000 = this.onExtraCallbackWithResult.access000();
            } else {
                boolAccess000 = this.onExtraCallbackWithResult.access000();
            }
            int i4 = IAuthTabCallback + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return boolAccess000;
        }
    }

    public static final class onNavigationEvent implements Function0<Boolean> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.access000();
                throw null;
            }
            ?? Access000 = this.onWarmupCompleted.access000();
            int i3 = onExtraCallbackWithResult + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return Access000;
        }
    }

    public static final class onTransact implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onTransact(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onNavigationEvent.access000();
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return Access000;
        }
    }

    public static final class IAuthTabCallback implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public IAuthTabCallback(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnExtraCallbackWithResult;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public IAuthTabCallbackDefault(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnWarmupCompleted;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public IAuthTabCallbackStub(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                IAuthTabCallback();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallback = IAuthTabCallback();
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onWarmupCompleted(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return onextracallbackOnExtraCallbackWithResult;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onExtraCallbackWithResult() {
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
                int i3 = 91 / 0;
            } else {
                onextracallbackIAuthTabCallbackDefault = this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            }
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements getBacktraceNote<getSwitchMinWidth.onExtraCallback<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, getCompoundPaddingRight<Float>> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final asBinder onExtraCallbackWithResult = new asBinder();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 105;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 14 / 0;
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getCompoundPaddingRight<Float> getcompoundpaddingrightIAuthTabCallback = IAuthTabCallback((getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getcompoundpaddingrightIAuthTabCallback;
        }

        public final getCompoundPaddingRight<Float> IAuthTabCallback(getSwitchMinWidth.onExtraCallback<Boolean> onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-985243360);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = IAuthTabCallback + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-985243360, i, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1947)");
            }
            getCompoundPaddingRight<Float> getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 0.0f, (Object) null, 7, (Object) null);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 87;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    int i9 = 28 / 0;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i10 = onNavigationEvent + 109;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return getcompoundpaddingrightOnExtraCallback;
        }
    }
}
