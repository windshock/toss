package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.tds.compose.component.compound.agreement.v4.cta.OptionalPreset$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getSizeSafely extends putLongIfValid {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = -1930618005;
    private static int onExtraCallback = -1538795462;
    private static int onExtraCallbackWithResult = 1570647436;
    private static byte[] IAuthTabCallback = {28, -8, -25, 18, 39, -32, -30, 46, 46, 44, -3, 44, 22, -27, -30, 21, 43, -10, 28, 44, -28, -3, 26, -3, 22, -27, -2, 29, -26, 62, -44, -3, 26, -3, 22, -27, -2, 29, -26, 62, -89, 41, -25, -2, 43, 46, 44, 38, -19, 47, 36, -92, 43, 47, -28, 97, -44, -27, -2, 28, -10, 42, 111, 43, -2, -32, 44, -25, 43, 23};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = (i * 3) + 4;
        int i6 = (i2 * 4) + 115;
        byte[] bArr = $$a;
        int i7 = (s * 2) + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i6 += i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    private static final Unit onExtraCallback(getSizeSafely getsizesafely, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, getHumanReadableName gethumanreadablename, getSubtitle getsubtitle, String str2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = asInterface + 109;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        getsizesafely.onNavigationEvent(str, quirksExternalSyntheticBackport0, z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, gethumanreadablename, getsubtitle, str2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onTransact + 9;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(getSizeSafely getsizesafely, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        getsizesafely.onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 49;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSizeSafely getsizesafely, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsizesafely, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 73;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(surfaceProcessorNodeOut);
        int i4 = onTransact + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSizeSafely getsizesafely, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, getHumanReadableName gethumanreadablename, getSubtitle getsubtitle, String str2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onTransact + 113;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsizesafely, str, quirksExternalSyntheticBackport0, z, z2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, iAuthTabCallback, gethumanreadablename, getsubtitle, str2, function0, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = asInterface + 111;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.keyCodeFromString("")), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), Color.argb(0, 0, 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 57;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 123;
                        $10 = i11 % 128;
                        int i12 = i11 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12844), 55 - (ViewConfiguration.getTapTimeout() >> 16), 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getTrimmedLength("")), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $10 + 21;
                int i14 = i13 % 128;
                $11 = i14;
                int i15 = i13 % 2;
                int i16 = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                if (z) {
                    int i17 = i14 + 113;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 86 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 9567 - ExpandableListView.getPackedPositionGroup(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i19 = 0;
                    while (i19 < length2) {
                        int i20 = $11 + 77;
                        $10 = i20 % 128;
                        if (i20 % 2 != 0) {
                            bArr5[i19] = (byte) (bArr4[i19] & (-4629411779493505016L));
                            i19 /= 0;
                        } else {
                            bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                            i19++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z2)) {
                        int i21 = $11 + 121;
                        $10 = i21 % 128;
                        if (i21 % 2 != 0) {
                            byte[] bArr6 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 0;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback % (((byte) (((byte) (bArr6[r8] / (-4629411779493505016L))) - s)) ^ b);
                        } else {
                            byte[] bArr7 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit onExtraCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 61;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable getHumanReadableName gethumanreadablename, @Nullable getSubtitle getsubtitle, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws Throwable {
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
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z4;
        boolean z5;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2;
        getHumanReadableName gethumanreadablename2;
        getSubtitle getsubtitle2;
        String str3;
        Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        getHumanReadableName gethumanreadablename3;
        String str4;
        Function0<Unit> function03;
        getSubtitle getsubtitle3;
        int i14;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        boolean z7;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback3;
        getHumanReadableName gethumanreadablename4;
        int i15;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        Object obj;
        int i16;
        int i17;
        int i18 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(420425967);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                int i20 = onTransact + 61;
                asInterface = i20 % 128;
                int i21 = i20 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    int i22 = onTransact + 9;
                    asInterface = i22 % 128;
                    int i23 = i22 % 2;
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        int i24 = asInterface + 87;
                        onTransact = i24 % 128;
                        if (i24 % 2 != 0) {
                            int i25 = 50 / 0;
                            i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        }
                        i8 = i7 | i4;
                        int i26 = asInterface + 61;
                        onTransact = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 16384 : 8192;
                        }
                        if ((i & 196608) == 0) {
                            if ((i3 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) {
                                int i28 = onTransact + 117;
                                asInterface = i28 % 128;
                                if (i28 % 2 == 0) {
                                    throw null;
                                }
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i8 |= i17;
                        }
                        if ((1572864 & i) == 0) {
                            i8 |= ((i3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle) ? 8388608 : 4194304;
                            }
                            i11 = i3 & 256;
                            if (i11 == 0) {
                                i8 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 67108864 : 33554432;
                            }
                            i12 = i3 & 512;
                            if (i12 == 0) {
                                i8 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                                    i16 = 2;
                                } else {
                                    int i29 = onTransact + 27;
                                    asInterface = i29 % 128;
                                    int i30 = i29 % 2;
                                    i16 = 4;
                                }
                                i13 = i2 | i16;
                            } else {
                                i13 = i2;
                            }
                            if ((306783379 & i8) != 306783378) {
                                int i31 = onTransact + 61;
                                asInterface = i31 % 128;
                                int i32 = i31 % 2;
                                z3 = (i13 & 3) != 2;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                z4 = z;
                                z5 = z2;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                iAuthTabCallback2 = iAuthTabCallback;
                                gethumanreadablename2 = gethumanreadablename;
                                getsubtitle2 = getsubtitle;
                                str3 = str2;
                                function02 = function0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) == 0 || !(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    boolean z8 = i5 != 0 ? true : z;
                                    boolean z9 = i6 != 0 ? false : z2;
                                    if (i9 != 0) {
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                    } else {
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    }
                                    if ((i3 & 32) != 0) {
                                        iAuthTabCallbackOnExtraCallback = ((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback())).onExtraCallback();
                                        i8 &= -458753;
                                    } else {
                                        iAuthTabCallbackOnExtraCallback = iAuthTabCallback;
                                    }
                                    if ((i3 & 64) != 0) {
                                        gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult());
                                        i8 &= -3670017;
                                    } else {
                                        gethumanreadablename3 = gethumanreadablename;
                                    }
                                    getSubtitle getsubtitle4 = i10 != 0 ? null : getsubtitle;
                                    str4 = i11 != 0 ? null : str2;
                                    function03 = i12 != 0 ? null : function0;
                                    getsubtitle3 = getsubtitle4;
                                    i14 = i8;
                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    z6 = z8;
                                    z7 = z9;
                                    iAuthTabCallback3 = iAuthTabCallbackOnExtraCallback;
                                    gethumanreadablename4 = gethumanreadablename3;
                                } else {
                                    int i33 = asInterface + 5;
                                    onTransact = i33 % 128;
                                    if (i33 % 2 != 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 58) != 0) {
                                            i8 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i8 &= -3670017;
                                        }
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                        z6 = z;
                                        z7 = z2;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        iAuthTabCallback3 = iAuthTabCallback;
                                        gethumanreadablename4 = gethumanreadablename;
                                        getsubtitle3 = getsubtitle;
                                        str4 = str2;
                                        function03 = function0;
                                        i14 = i8;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 32) != 0) {
                                        }
                                        if ((i3 & 64) != 0) {
                                        }
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                        z6 = z;
                                        z7 = z2;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        iAuthTabCallback3 = iAuthTabCallback;
                                        gethumanreadablename4 = gethumanreadablename;
                                        getsubtitle3 = getsubtitle;
                                        str4 = str2;
                                        function03 = function0;
                                        i14 = i8;
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(420425967, i14, i13, "im.toss.tds.compose.component.compound.agreement.v4.cta.OptionalPreset.TextButton (TdsAgreementV4CtaPresets.kt:238)");
                                }
                                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(configureReward.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), null, null, false, z6, false, false, null, null, function03, 247, null), iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallbackDefault(), iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallbackStub(), 0.0f, 0.0f, 12, (Object) null);
                                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    int i34 = onTransact + 3;
                                    i15 = i13;
                                    asInterface = i34 % 128;
                                    int i35 = i34 % 2;
                                    getAwbState.onExtraCallback();
                                } else {
                                    i15 = i13;
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
                                if (z7) {
                                    int i36 = onTransact + 89;
                                    asInterface = i36 % 128;
                                    int i37 = i36 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1833616981);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback());
                                    float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                                    float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f);
                                    Object[] objArr = new Object[1];
                                    a((short) (118 - TextUtils.indexOf("", "")), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 103), (-682279779) - (ViewConfiguration.getPressedStateDuration() >> 16), 103156452 - TextUtils.indexOf("", ""), (-51) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                                    AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnWarmupCompleted2, false, false, Integer.MAX_VALUE, 0.0f, false, fIAuthTabCallback, fIAuthTabCallback2, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 113270790, 0, 7788);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1833965855);
                                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                                    GraphicDeviceInfo graphicDeviceInfoOnTransact = isrepeatingenabled.onTransact();
                                    oExternalSyntheticLambda0.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion;
                                    int i38 = i14 & 14;
                                    int i39 = i15;
                                    int i40 = i14;
                                    boolean z10 = z6;
                                    oExternalSyntheticLambda1.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, onwarmupcompleted.onNavigationEvent(), (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, ((Long) setCallToAction.IAuthTabCallback.IAuthTabCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1079691704, new Object[]{iAuthTabCallbackOnExtraCallbackWithResult}, -1079691703, lt.40.onExtraCallbackWithResult())).longValue(), (getHumanReadableName) null, (createCameraCaptureCallback) null, graphicDeviceInfoOnTransact, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) null, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, z10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i38 | 12585984, ((i14 << 15) & 29360128) | 6, 129910);
                                    GraphicDeviceInfo graphicDeviceInfoOnTransact2 = isrepeatingenabled.onTransact();
                                    oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
                                    long jLongValue = ((Long) setCallToAction.IAuthTabCallback.IAuthTabCallback(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1079691704, new Object[]{iAuthTabCallbackOnExtraCallbackWithResult}, -1079691703, lt.40.onExtraCallbackWithResult())).longValue();
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Object externalSyntheticLambda1 = new OptionalPreset$.ExternalSyntheticLambda1();
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda1);
                                        obj = externalSyntheticLambda1;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        obj = objOnMinimized2;
                                    }
                                    Function1<? super SurfaceProcessorNodeOut, Unit> function1 = (Function1) obj;
                                    int i41 = i40 >> 6;
                                    int i42 = i40 << 3;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                                    super.IAuthTabCallback(str, quirksExternalSyntheticBackport03, onextracallbackwithresultOnNavigationEvent, iAuthTabCallback3, jLongValue, gethumanreadablename4, graphicDeviceInfoOnTransact2, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, getsubtitle3, str4, z6, function1, function03, cameraCaptureResultEmptyCameraCaptureResult3, i38 | 1597824 | (i40 & 112) | (i41 & 7168) | ((i40 >> 3) & 458752) | ((i40 << 9) & 29360128) | (234881024 & i42) | (i42 & 1879048192), (i41 & 14) | 48 | ((i40 >> 21) & 896) | ((i39 << 9) & 7168));
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                z4 = z6;
                                z5 = z7;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                iAuthTabCallback2 = iAuthTabCallback3;
                                gethumanreadablename2 = gethumanreadablename4;
                                getsubtitle2 = getsubtitle3;
                                str3 = str4;
                                function02 = function03;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new OptionalPreset$.ExternalSyntheticLambda2(this, str, quirksExternalSyntheticBackport02, z4, z5, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, iAuthTabCallback2, gethumanreadablename2, getsubtitle2, str3, function02, i, i2, i3));
                                return;
                            }
                            return;
                        }
                        i8 |= 12582912;
                        i11 = i3 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        if ((306783379 & i8) != 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    if ((i & 196608) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    if ((306783379 & i8) != 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i4;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                if ((i & 196608) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((306783379 & i8) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i8 = i4;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            if ((i & 196608) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((306783379 & i8) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i8 = i4;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((306783379 & i8) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i8 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public final void onWarmupCompleted(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2048734098);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = asInterface + 13;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i8 = asInterface + 55;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2048734098, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.OptionalPreset.Content (TdsAgreementV4CtaPresets.kt:287)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new OptionalPreset$.ExternalSyntheticLambda0(this, function2, i));
            int i9 = onTransact + 49;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
    }
}
