package im.toss.tds.compose.component.compound.agreement.v4.cta;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.tds.compose.component.compound.agreement.v4.cta.RequiredPreset$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinStarRatingView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.configureReward;
import o.getAwbState;
import o.getHumanReadableName;
import o.getSubtitle;
import o.isRepeatingEnabled;
import o.oExternalSyntheticLambda0;
import o.oExternalSyntheticLambda1;
import o.putLongIfValid;
import o.resolveQuirkNames;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RequiredPreset extends putLongIfValid {
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int onWarmupCompleted = 1711708951;
    private static char onExtraCallbackWithResult = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b3 + 4;
        int i4 = 110 - b2;
        int i5 = (b * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i = i2;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i3++;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(RequiredPreset requiredPreset, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, getHumanReadableName gethumanreadablename, getSubtitle getsubtitle, String str2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        Unit unitOnNavigationEvent;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            unitOnNavigationEvent = onNavigationEvent(requiredPreset, str, quirksExternalSyntheticBackport0, z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, gethumanreadablename, getsubtitle, str2, function0, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            int i7 = 31 / 0;
        } else {
            unitOnNavigationEvent = onNavigationEvent(requiredPreset, str, quirksExternalSyntheticBackport0, z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, gethumanreadablename, getsubtitle, str2, function0, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        int i8 = onNavigationEvent + 39;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RequiredPreset requiredPreset, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(requiredPreset, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 37;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(RequiredPreset requiredPreset, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        requiredPreset.onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(surfaceProcessorNodeOut);
        }
        onWarmupCompleted(surfaceProcessorNodeOut);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(RequiredPreset requiredPreset, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, getHumanReadableName gethumanreadablename, getSubtitle getsubtitle, String str2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 103;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        requiredPreset.IAuthTabCallback(str, quirksExternalSyntheticBackport0, z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, gethumanreadablename, getsubtitle, str2, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 65;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i6 = $10 + 73;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int capsMode = TextUtils.getCapsMode("", i5, i5) + 43;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i5) + 1452;
                    byte b = (byte) i5;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, capsMode, iIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char touchSlop = (char) (49123 - (ViewConfiguration.getTouchSlop() >> 8));
                    int mode = View.MeasureSpec.getMode(i5) + 44;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1494;
                    byte b3 = (byte) i5;
                    byte b4 = (byte) (b3 + 1);
                    String str$$c2 = $$c(b3, b4, (byte) (-b4));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, mode, packedPositionGroup, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cNormalizeMetaState = (char) (23972 - KeyEvent.normalizeMetaState(i5));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(i5) + 51;
                    int i11 = 22940 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, bitsPerPixel, i11, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i12 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i5] = Integer.valueOf(i12);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char cRgb = (char) (Color.rgb(i5, i5, i5) + 16823064);
                    int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28;
                    int size = View.MeasureSpec.getSize(i5) + 12577;
                    i2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i5] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, i13, size, 1401536470, false, "l", clsArr4);
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i14 = $11 + 47;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable getHumanReadableName gethumanreadablename, @Nullable getSubtitle getsubtitle, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws Throwable {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        getSubtitle getsubtitle2;
        int i8;
        int i9;
        int i10;
        int i11;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z4;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2;
        getHumanReadableName gethumanreadablename2;
        String str3;
        getSubtitle getsubtitle3;
        boolean z5;
        Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback3;
        getHumanReadableName gethumanreadablename3;
        String str4;
        Function0<Unit> function03;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        boolean z7;
        getHumanReadableName gethumanreadablename4;
        int i12;
        int i13;
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(956278864);
        Object obj2 = null;
        if ((i & 6) == 0) {
            int i15 = onNavigationEvent + 15;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj2.hashCode();
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            int i17 = IAuthTabCallback + 33;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 16384 : 8192;
                    }
                    if ((i & 196608) == 0) {
                        if ((i3 & 32) == 0) {
                            int i19 = IAuthTabCallback + 71;
                            onNavigationEvent = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i20 = 15 / 0;
                                i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 131072 : 65536;
                            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) {
                            }
                            i4 |= i13;
                        }
                    }
                    if ((1572864 & i) == 0) {
                        i4 |= ((i3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        getsubtitle2 = getsubtitle;
                    } else {
                        getsubtitle2 = getsubtitle;
                        if ((i & 12582912) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle2) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        int i21 = onNavigationEvent + 123;
                        IAuthTabCallback = i21 % 128;
                        int i22 = i21 % 2;
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i9 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 67108864 : 33554432) | i4;
                        }
                        i10 = i3 & 512;
                        if (i10 == 0) {
                            if ((i & 805306368) == 0) {
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                                    int i23 = onNavigationEvent + 5;
                                    IAuthTabCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                    i12 = 4;
                                } else {
                                    i12 = 2;
                                }
                                i11 = i2 | i12;
                            } else {
                                i11 = i2;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                z4 = z2;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                iAuthTabCallback2 = iAuthTabCallback;
                                gethumanreadablename2 = gethumanreadablename;
                                str3 = str2;
                                getsubtitle3 = getsubtitle2;
                                z5 = z3;
                                function02 = function0;
                            } else {
                                int i25 = IAuthTabCallback + 1;
                                onNavigationEvent = i25 % 128;
                                if (i25 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            if (i16 != 0) {
                                                int i26 = onNavigationEvent + 109;
                                                IAuthTabCallback = i26 % 128;
                                                if (i26 % 2 == 0) {
                                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                                    Object obj3 = null;
                                                    obj3.hashCode();
                                                    throw null;
                                                }
                                                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                            } else {
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                            }
                                            if (i18 != 0) {
                                                z3 = true;
                                            }
                                            boolean z8 = i5 != 0 ? false : z2;
                                            if (i6 != 0) {
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                            } else {
                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            }
                                            if ((i3 & 32) != 0) {
                                                iAuthTabCallbackOnExtraCallback = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
                                                i9 &= -458753;
                                            } else {
                                                iAuthTabCallbackOnExtraCallback = iAuthTabCallback;
                                            }
                                            if ((i3 & 64) != 0) {
                                                z7 = z8;
                                                gethumanreadablename4 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult());
                                                i9 &= -3670017;
                                            } else {
                                                z7 = z8;
                                                gethumanreadablename4 = gethumanreadablename;
                                            }
                                            if (i7 != 0) {
                                                getsubtitle2 = null;
                                            }
                                            z6 = z7;
                                            str4 = i8 != 0 ? null : str2;
                                            function03 = i10 != 0 ? null : function0;
                                            gethumanreadablename3 = gethumanreadablename4;
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                            iAuthTabCallback3 = iAuthTabCallbackOnExtraCallback;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i3 & 32) != 0) {
                                                i9 &= -458753;
                                            }
                                            if ((i3 & 64) != 0) {
                                                i9 &= -3670017;
                                            }
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                            z6 = z2;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            iAuthTabCallback3 = iAuthTabCallback;
                                            gethumanreadablename3 = gethumanreadablename;
                                            str4 = str2;
                                            function03 = function0;
                                        }
                                        getSubtitle getsubtitle4 = getsubtitle2;
                                        boolean z9 = z3;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i27 = IAuthTabCallback + 39;
                                            onNavigationEvent = i27 % 128;
                                            if (i27 % 2 != 0) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(956278864, i9, i11, "im.toss.tds.compose.component.compound.agreement.v4.cta.RequiredPreset.TextButton (TdsAgreementV4CtaPresets.kt:179)");
                                                throw null;
                                            }
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(956278864, i9, i11, "im.toss.tds.compose.component.compound.agreement.v4.cta.RequiredPreset.TextButton (TdsAgreementV4CtaPresets.kt:179)");
                                            obj = null;
                                        } else {
                                            obj = null;
                                        }
                                        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(configureReward.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, obj), null, null, false, z9, false, false, null, null, function03, 247, null), iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallbackDefault(), iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallbackStub(), 0.0f, 0.0f, 12, (Object) null);
                                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
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
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                        if (z6) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1033832276);
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, onextracallbackwithresult.onExtraCallback());
                                            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                                            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                                            Object[] objArr = new Object[1];
                                            a((char) (15198 - TextUtils.indexOf("", "", 0)), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{26471, 21765, 27955, 25745, 22945, 49139, 49869, 26074, 36012, 22055, 9117, 26000, 31973, 40655, 29396, 46124, 2162, 60964, 7857, 28394, 16792, 40628, 35518, 18219, 36643, 55729, 50121, 32539, 5813, 8988, 49056, 25695, 4408, 27042, 53614, 62073, 55398, 4452, 51488, 22550, 8707, 6825, 9879, 44052, 32283, 62345, 65394, 42887, 59591, 17055, 56752, 8756, 52038, 10375, 26951, 62031, 54212, 4571, 36947, 2527, 39698, 10295, 51595, 4481, 58350, 56761, 39283, 11503, 54662, 64569}, new char[]{0, 0, 0, 0}, new char[]{60326, 58742, 24217, 2107}, objArr);
                                            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnWarmupCompleted2, false, false, Integer.MAX_VALUE, 0.0f, false, fIAuthTabCallback, fIAuthTabCallback2, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 113270790, 0, 7788);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1034195007);
                                            oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent();
                                            GraphicDeviceInfo graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
                                            long jLongValue = ((Long) setCallToAction.IAuthTabCallback.IAuthTabCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1079691704, new Object[]{iAuthTabCallbackOnExtraCallbackWithResult}, -1079691703, lt.40.onExtraCallbackWithResult())).longValue();
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            Object obj4 = objOnMinimized2;
                                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                Object externalSyntheticLambda1 = new RequiredPreset$.ExternalSyntheticLambda1();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda1);
                                                obj4 = externalSyntheticLambda1;
                                            }
                                            Function1<? super SurfaceProcessorNodeOut, Unit> function1 = (Function1) obj4;
                                            int i28 = i9 >> 6;
                                            int i29 = i9 << 3;
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            super.IAuthTabCallback(str, quirksExternalSyntheticBackport03, onextracallbackwithresultOnNavigationEvent, iAuthTabCallback3, jLongValue, gethumanreadablename3, graphicDeviceInfoOnTransact, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, getsubtitle4, str4, z9, function1, function03, cameraCaptureResultEmptyCameraCaptureResult2, (i9 & 14) | 1597824 | (i9 & 112) | (i28 & 7168) | ((i9 >> 3) & 458752) | ((i9 << 9) & 29360128) | (234881024 & i29) | (i29 & 1879048192), (i28 & 14) | 48 | ((i9 >> 21) & 896) | ((i11 << 9) & 7168));
                                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i30 = onNavigationEvent + 47;
                                            IAuthTabCallback = i30 % 128;
                                            if (i30 % 2 == 0) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                int i31 = 75 / 0;
                                            } else {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                        }
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        z5 = z9;
                                        z4 = z6;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        iAuthTabCallback2 = iAuthTabCallback3;
                                        gethumanreadablename2 = gethumanreadablename3;
                                        getsubtitle3 = getsubtitle4;
                                        str3 = str4;
                                        function02 = function03;
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new RequiredPreset$.ExternalSyntheticLambda2(this, str, quirksExternalSyntheticBackport02, z5, z4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, iAuthTabCallback2, gethumanreadablename2, getsubtitle3, str3, function02, i, i2, i3));
                                return;
                            }
                            return;
                        }
                        int i32 = IAuthTabCallback + 5;
                        onNavigationEvent = i32 % 128;
                        int i33 = i32 % 2;
                        i9 |= 805306368;
                        if ((i2 & 6) != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i4;
                    i10 = i3 & 512;
                    if (i10 == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                if ((i & 196608) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i4;
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 196608) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i4;
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i4;
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i9) == 306783378 || (i11 & 3) != 2, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1710380301);
        boolean z = false;
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 57;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
                i3 = !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i2 = i3 | i;
        } else {
            int i7 = IAuthTabCallback + 13;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i9 = onNavigationEvent + 125;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i11 = IAuthTabCallback + 51;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1710380301, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.RequiredPreset.Content (TdsAgreementV4CtaPresets.kt:219)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onNavigationEvent + 3;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new RequiredPreset$.ExternalSyntheticLambda0(this, function2, i));
        }
    }
}
