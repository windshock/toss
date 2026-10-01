package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFe1wSDK;
import o.AFf1aSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.flipHorizontally;
import o.getHeaderField;
import o.readBoolean;
import o.rotate;
import o.setByteOrder;
import o.setIso;
import o.toPreviewOnlyRange;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getHeaderField {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        AFf1aSDK.IAuthTabCallback iAuthTabCallback = (AFf1aSDK.IAuthTabCallback) objArr[1];
        AFf1aSDK.onNavigationEvent onnavigationevent = (AFf1aSDK.onNavigationEvent) objArr[2];
        AFf1aSDK.onWarmupCompleted onwarmupcompleted = (AFf1aSDK.onWarmupCompleted) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[6];
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, onwarmupcompleted, jLongValue, fFloatValue, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, long j, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, j, quirkSettingsLoader, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onWarmupCompleted(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, j, quirkSettingsLoader, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AFf1aSDK.onNavigationEvent onnavigationevent, float f, long j, long j2, long j3, float f2, long j4, float f3, removeTimestamp removetimestamp, AFf1aSDK.IAuthTabCallback iAuthTabCallback, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, f, j, j2, j3, f2, j4, f3, removetimestamp, iAuthTabCallback, setiso);
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, AFe1wSDK aFe1wSDK, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, aFe1wSDK, j, f, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(fliphorizontally);
        }
        onWarmupCompleted(fliphorizontally);
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(AFf1aSDK.onNavigationEvent onnavigationevent, AFe1wSDK aFe1wSDK, AFf1aSDK.IAuthTabCallback iAuthTabCallback, float f, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(onnavigationevent, aFe1wSDK, iAuthTabCallback, f, j, sessionProcessorCaptureCallback);
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        AFf1aSDK.IAuthTabCallback iAuthTabCallback = (AFf1aSDK.IAuthTabCallback) objArr[1];
        AFf1aSDK.onNavigationEvent onnavigationevent = (AFf1aSDK.onNavigationEvent) objArr[2];
        AFf1aSDK.onWarmupCompleted onwarmupcompleted = (AFf1aSDK.onWarmupCompleted) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[6];
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue3 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(jLongValue);
        Float fValueOf = Float.valueOf(fFloatValue);
        if (i3 == 0) {
            Object[] objArr2 = {quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, onwarmupcompleted, lValueOf, fValueOf, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(570081063, -570081061, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        }
        Object[] objArr3 = {quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, onwarmupcompleted, lValueOf, fValueOf, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int i4 = 43 / 0;
        return (Unit) onWarmupCompleted(570081063, -570081061, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr3, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, AFe1wSDK aFe1wSDK, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, aFe1wSDK, j, f, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i));
        int i13 = i2 + i + i4 + (1112421973 * i3) + ((-1897213938) * i5);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i4) + ((-1446510592) * i3) + (892338176 * i5) + ((-1657864192) * i14);
        int i16 = (i2 * 2010092721) + 1217064380 + (i * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i4 * 2010091741) + (i3 * (-1378896031)) + (i5 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static final Unit onWarmupCompleted(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, long j, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(i, quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, j, quirkSettingsLoader, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r3 r5
      0x0048: PHI (r3v14 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v15 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0037, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r5v11 int) = (r5v4 int), (r5v12 int) binds: [B:8:0x0037, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r3 r5
      0x0039: PHI (r3v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r3v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r3v15 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0037, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r5v5 int) = (r5v4 int), (r5v12 int) binds: [B:8:0x0037, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AFf1aSDK.IAuthTabCallback iAuthTabCallback, @Nullable AFf1aSDK.onNavigationEvent onnavigationevent, @Nullable AFf1aSDK.onWarmupCompleted onwarmupcompleted, long j, float f, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirkSettingsLoader quirkSettingsLoader, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        AFf1aSDK.onNavigationEvent onnavigationevent2;
        boolean zOnExtraCallback;
        int i5;
        long jOnNavigationEvent;
        int i6;
        final float f2;
        final QuirkSettingsLoader quirkSettingsLoader2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final AFf1aSDK.onNavigationEvent onnavigationevent3;
        final AFf1aSDK.IAuthTabCallback iAuthTabCallback2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final long j2;
        final AFf1aSDK.onWarmupCompleted onwarmupcompleted2;
        AFf1aSDK.onNavigationEvent onextracallback;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
        AFf1aSDK.IAuthTabCallback iAuthTabCallback3;
        float f3;
        QuirkSettingsLoader quirkSettingsLoader3;
        AFf1aSDK.onNavigationEvent onnavigationevent4;
        long j3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        AFf1aSDK.onWarmupCompleted onwarmupcompleted3;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        long smallIconId;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(166260912);
            i3 = i2 & 1;
            if (i3 != 0) {
                int i9 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else if ((i & 6) == 0) {
                int i11 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(function2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(166260912);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            int i14 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i16 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
                onnavigationevent2 = onnavigationevent;
            } else {
                onnavigationevent2 = onnavigationevent;
                int i17 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(onnavigationevent2) ? 256 : 128;
                i4 |= i17;
            }
            i4 |= i17;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        int i18 = i2 & 8;
        Object obj = null;
        if (i18 != 0) {
            int i19 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i19 % 128;
            i4 = i19 % 2 == 0 ? i4 | 8389 : i4 | 3072;
        } else if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                int i20 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i20 % 128;
                if (i20 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(onwarmupcompleted);
                    throw null;
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(onwarmupcompleted);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(onwarmupcompleted);
            }
            i4 |= zOnExtraCallback ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 = i3;
            jOnNavigationEvent = j;
            i4 |= ((i2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jOnNavigationEvent)) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
        } else {
            i5 = i3;
            jOnNavigationEvent = j;
        }
        int i21 = i2 & 32;
        if (i21 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            int i22 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 76 / 0;
                i6 = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f)) {
            }
            i4 |= i6;
        }
        if ((1572864 & i) == 0) {
            i4 |= ((i2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) ? 1048576 : 524288;
        }
        int i24 = i2 & 128;
        if (i24 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            int i25 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i25 % 128;
            if (i25 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirkSettingsLoaderOnExtraCallback);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirkSettingsLoaderOnExtraCallback) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                if (i5 != 0) {
                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                }
                AFf1aSDK.IAuthTabCallback iAuthTabCallback4 = i13 != 0 ? AFf1aSDK.IAuthTabCallback.Down : iAuthTabCallback;
                if ((i2 & 4) != 0) {
                    onextracallback = new AFf1aSDK.onNavigationEvent.onExtraCallback(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i4 &= -897;
                } else {
                    onextracallback = onnavigationevent2;
                }
                AFf1aSDK.onWarmupCompleted onwarmupcompleted4 = i18 != 0 ? AFf1aSDK.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback : onwarmupcompleted;
                if ((i2 & 16) != 0) {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(862959639);
                        smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ITrustedWebActivityServiceStubProxy();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(862960599);
                        smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).getSmallIconId();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    jOnNavigationEvent = getMaxAdCount.onNavigationEvent(smallIconId, 0.15f);
                    i4 &= -57345;
                }
                float fIAuthTabCallback = i21 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
                if ((i2 & 64) != 0) {
                    deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                    i4 &= -3670017;
                } else {
                    deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = deviceQuirksExternalSyntheticLambda0;
                }
                if (i24 != 0) {
                    quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                }
                iAuthTabCallback3 = iAuthTabCallback4;
                f3 = fIAuthTabCallback;
                quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                onnavigationevent4 = onextracallback;
                j3 = jOnNavigationEvent;
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                onwarmupcompleted3 = onwarmupcompleted4;
                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                if ((i2 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i2 & 16) != 0) {
                    int i26 = onExtraCallbackWithResult + 85;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    i4 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                }
                iAuthTabCallback3 = iAuthTabCallback;
                onwarmupcompleted3 = onwarmupcompleted;
                f3 = f;
                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                j3 = jOnNavigationEvent;
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                onnavigationevent4 = onnavigationevent2;
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(166260912, i4, -1, "im.toss.tosssecurities.uikit.base.TossSecTdsFullTooltipV1 (TossSecTdsTooltipV1.kt:151)");
            }
            AFf1aSDK.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
            IAuthTabCallback(quirksExternalSyntheticBackport04, iAuthTabCallback3, onnavigationevent4, new AFe1wSDK.onExtraCallback(onwarmupcompleted3), j3, f3, deviceQuirksExternalSyntheticLambda03, quirkSettingsLoader3, function2, cameraCaptureResultEmptyCameraCaptureResult2, i4 & 268428286);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            iAuthTabCallback2 = iAuthTabCallback3;
            onnavigationevent3 = onnavigationevent4;
            j2 = j3;
            f2 = f3;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
            quirkSettingsLoader2 = quirkSettingsLoader3;
            onwarmupcompleted2 = onwarmupcompleted5;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            f2 = f;
            quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            onnavigationevent3 = onnavigationevent2;
            iAuthTabCallback2 = iAuthTabCallback;
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
            j2 = jOnNavigationEvent;
            onwarmupcompleted2 = onwarmupcompleted;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i28 = 2 % 2;
                    int i29 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i29 % 128;
                    int i30 = i29 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                    AFf1aSDK.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback2;
                    AFf1aSDK.onNavigationEvent onnavigationevent5 = onnavigationevent3;
                    AFf1aSDK.onWarmupCompleted onwarmupcompleted6 = onwarmupcompleted2;
                    long j4 = j2;
                    float f4 = f2;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                    QuirkSettingsLoader quirkSettingsLoader4 = quirkSettingsLoader2;
                    Function2 function22 = function2;
                    int i31 = i;
                    int i32 = i2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {quirksExternalSyntheticBackport05, iAuthTabCallback5, onnavigationevent5, onwarmupcompleted6, Long.valueOf(j4), Float.valueOf(f4), deviceQuirksExternalSyntheticLambda04, quirkSettingsLoader4, function22, Integer.valueOf(i31), Integer.valueOf(i32), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
                    Unit unit = (Unit) getHeaderField.onWarmupCompleted(-1047391731, 1047391732, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                    int i33 = onExtraCallbackWithResult + 45;
                    IAuthTabCallback = i33 % 128;
                    int i34 = i33 % 2;
                    return unit;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AFf1aSDK.IAuthTabCallback iAuthTabCallback, @Nullable AFf1aSDK.onNavigationEvent onnavigationevent, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        AFf1aSDK.onNavigationEvent onextracallback;
        long jOnNavigationEvent;
        int i7;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final AFf1aSDK.IAuthTabCallback iAuthTabCallback2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final AFf1aSDK.onNavigationEvent onnavigationevent2;
        final long j2;
        final QuirkSettingsLoader quirkSettingsLoader2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        AFf1aSDK.IAuthTabCallback iAuthTabCallback3;
        long jITrustedWebActivityServiceStubProxy;
        int i8;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2124093048);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i11 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i11 % 128;
                i9 = i11 % 2 == 0 ? 5 : 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i13 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i13 % 128;
                    i5 = i13 % 2 != 0 ? Imgproc.COLOR_YUV2RGBA_YVYU : 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                int i14 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                int i16 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0 ? (i3 & 8) != 0 : (i3 & 91) != 0) {
                    onextracallback = onnavigationevent;
                } else {
                    onextracallback = onnavigationevent;
                    int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 2048 : 1024;
                    i4 |= i17;
                }
                i4 |= i17;
            } else {
                onextracallback = onnavigationevent;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    jOnNavigationEvent = j;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent)) {
                        int i18 = onExtraCallbackWithResult + 39;
                        onWarmupCompleted = i18 % 128;
                        i8 = i18 % 2 != 0 ? 447 : Http2.INITIAL_MAX_FRAME_SIZE;
                    }
                    i4 |= i8;
                } else {
                    jOnNavigationEvent = j;
                }
                i8 = TTHistoryActivity2.SIZE;
                i4 |= i8;
            } else {
                jOnNavigationEvent = j;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i4 |= 196608;
                quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
            } else {
                quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
                if ((i2 & 196608) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoaderOnExtraCallback) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                }
            }
            if ((i2 & 1572864) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
            }
            if ((i4 & 599187) == 599186) {
                int i19 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                iAuthTabCallback2 = iAuthTabCallback;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                onnavigationevent2 = onextracallback;
                j2 = jOnNavigationEvent;
                quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                Object obj = null;
                if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i12 != 0) {
                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    AFf1aSDK.IAuthTabCallback iAuthTabCallback4 = i6 != 0 ? AFf1aSDK.IAuthTabCallback.Down : iAuthTabCallback;
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        onextracallback = new AFf1aSDK.onNavigationEvent.onExtraCallback(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    if ((i3 & 16) != 0) {
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1143965183);
                            jITrustedWebActivityServiceStubProxy = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).getSmallIconId();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1143964223);
                            jITrustedWebActivityServiceStubProxy = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityServiceStubProxy();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i21 = onWarmupCompleted + 9;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 == 0) {
                            getMaxAdCount.onNavigationEvent(jITrustedWebActivityServiceStubProxy, 0.15f);
                            throw null;
                        }
                        jOnNavigationEvent = getMaxAdCount.onNavigationEvent(jITrustedWebActivityServiceStubProxy, 0.15f);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                    }
                    iAuthTabCallback3 = iAuthTabCallback4;
                } else {
                    int i22 = onExtraCallbackWithResult + 41;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i3 & 8) != 0) {
                        int i24 = onExtraCallbackWithResult + 1;
                        onWarmupCompleted = i24 % 128;
                        i4 = i24 % 2 != 0 ? i4 & 19345 : i4 & (-7169);
                    }
                    if ((i3 & 16) != 0) {
                        int i25 = onExtraCallbackWithResult + 47;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i4 &= -57345;
                    }
                    iAuthTabCallback3 = iAuthTabCallback;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                AFf1aSDK.onNavigationEvent onnavigationevent3 = onextracallback;
                long j3 = jOnNavigationEvent;
                QuirkSettingsLoader quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2124093048, i4, -1, "im.toss.tosssecurities.uikit.base.TossSecTdsFullTooltipV1 (TossSecTdsTooltipV1.kt:174)");
                }
                int i26 = i4 >> 3;
                int i27 = i4 << 6;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                IAuthTabCallback(quirksExternalSyntheticBackport04, iAuthTabCallback3, onnavigationevent3, new AFe1wSDK.onExtraCallbackWithResult(i), j3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), quirkSettingsLoader3, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i26 & 896) | (i26 & 14) | 196608 | (i26 & 112) | (i4 & 57344) | (29360128 & i27) | (234881024 & i27));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                iAuthTabCallback2 = iAuthTabCallback3;
                onnavigationevent2 = onnavigationevent3;
                j2 = j3;
                quirkSettingsLoader2 = quirkSettingsLoader3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i28 = 2 % 2;
                        int i29 = onExtraCallbackWithResult + 49;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        Unit unitOnExtraCallback = getHeaderField.onExtraCallback(i, quirksExternalSyntheticBackport03, iAuthTabCallback2, onnavigationevent2, j2, quirkSettingsLoader2, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i31 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i31 % 128;
                        int i32 = i31 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final AFf1aSDK.IAuthTabCallback iAuthTabCallback, final AFf1aSDK.onNavigationEvent onnavigationevent, final AFe1wSDK aFe1wSDK, final long j, final float f, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final QuirkSettingsLoader quirkSettingsLoader, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float fIAuthTabCallback;
        long jRemoteActionCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-220649267);
        if ((i & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback.ordinal()) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i11 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i11 % 128;
            if ((i11 % 2 == 0 ? (i & 4096) != 0 : (i & 13986) != 0) ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(aFe1wSDK) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFe1wSDK)) {
                int i12 = onWarmupCompleted + 105;
                onExtraCallbackWithResult = i12 % 128;
                i3 = i12 % 2 == 0 ? 31158 : 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
        }
        if ((i & 1572864) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 1048576 : 524288;
            int i13 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
        }
        if ((12582912 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 67108864 : 33554432;
        }
        int i15 = i2;
        if ((38347923 & i15) != 38347922) {
            int i16 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i16 % 128;
            z = i16 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i15 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i17 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-220649267, i15, -1, "im.toss.tosssecurities.uikit.base.FullTooltipContainer (TossSecTdsTooltipV1.kt:199)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-220649267, i15, -1, "im.toss.tosssecurities.uikit.base.FullTooltipContainer (TossSecTdsTooltipV1.kt:199)");
            }
            float fIAuthTabCallback2 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(Float.intBitsToFloat((int) onExtraCallback(onnavigationevent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i15 >> 6) & 14)));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) onWarmupCompleted(444332068, -444332068, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), onnavigationevent}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()), iAuthTabCallback, onnavigationevent, aFe1wSDK, j, f);
            float fIAuthTabCallback3 = iAuthTabCallback == AFf1aSDK.IAuthTabCallback.Up ? fIAuthTabCallback2 : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            if (iAuthTabCallback != AFf1aSDK.IAuthTabCallback.Down) {
                int i18 = onWarmupCompleted + 73;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            } else {
                fIAuthTabCallback = fIAuthTabCallback2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0.0f, fIAuthTabCallback3, 0.0f, fIAuthTabCallback, 5, (Object) null), deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoader, false);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2031537190);
                jRemoteActionCompatParcelizer = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1476501535, OverseasRrnInputTextField.IAuthTabCallback(), 1476501541)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2031536230);
                jRemoteActionCompatParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).RemoteActionCompatParcelizer();
            }
            long j2 = jRemoteActionCompatParcelizer;
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            int i20 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablename, j2, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), function2, cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | ((i15 >> 21) & 112));
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i22 = 2 % 2;
                    int i23 = onExtraCallbackWithResult + 33;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                    Unit unitOnExtraCallback = getHeaderField.onExtraCallback(quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, aFe1wSDK, j, f, deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i25 = onExtraCallbackWithResult + 113;
                    onExtraCallback = i25 % 128;
                    int i26 = i25 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long onExtraCallback(AFf1aSDK.onNavigationEvent onnavigationevent, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1566930630, i, -1, "im.toss.tosssecurities.uikit.base.rememberArrowSize (TossSecTdsTooltipV1.kt:233)");
                int i4 = 20 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1566930630, i, -1, "im.toss.tosssecurities.uikit.base.rememberArrowSize (TossSecTdsTooltipV1.kt:233)");
            }
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        if (((i & 14) ^ 6) > 4) {
            int i5 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent)) {
                z = true;
            } else if ((i & 6) == 4) {
            }
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!(zOnNavigationEvent | z)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = setUseCaseDetached.onNavigationEvent(((Long) onWarmupCompleted(-43549323, 43549326, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{onnavigationevent.IAuthTabCallback(setUseCaseDetached.Companion.IAuthTabCallback(), ExtensionsManagerExtensionsAvailability.Ltr, r8lambdanm9dm2eewl4vrptnjmesfjqky4)}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).longValue());
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        long jOnNavigationEvent = ((setUseCaseDetached) objOnMinimized).onNavigationEvent();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return jOnNavigationEvent;
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final AFf1aSDK.IAuthTabCallback iAuthTabCallback, final AFf1aSDK.onNavigationEvent onnavigationevent, final AFe1wSDK aFe1wSDK, final long j, final float f) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0, new Function1() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 41;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return getHeaderField.onExtraCallbackWithResult(onnavigationevent, aFe1wSDK, iAuthTabCallback, f, j, (SessionProcessorCaptureCallback) obj);
                }
                getHeaderField.onExtraCallbackWithResult(onnavigationevent, aFe1wSDK, iAuthTabCallback, f, j, (SessionProcessorCaptureCallback) obj);
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final removeObserverLocked onExtraCallback(final AFf1aSDK.onNavigationEvent onnavigationevent, AFe1wSDK aFe1wSDK, final AFf1aSDK.IAuthTabCallback iAuthTabCallback, float f, final long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        float fIntBitsToFloat;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        rotate.onExtraCallback onextracallbackIAuthTabCallback = onnavigationevent.IAuthTabCallback(setUseCaseDetached.Companion.IAuthTabCallback(), ExtensionsManagerExtensionsAvailability.Ltr, sessionProcessorCaptureCallback);
        Intrinsics.checkNotNull(onextracallbackIAuthTabCallback, "");
        final removeTimestamp removetimestampOnWarmupCompleted = onextracallbackIAuthTabCallback.onWarmupCompleted();
        final long jLongValue = ((Long) onWarmupCompleted(-43549323, 43549326, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{onextracallbackIAuthTabCallback}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).longValue();
        final float fOnNavigationEvent = onNavigationEvent(aFe1wSDK, Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32)), Float.intBitsToFloat((int) (jLongValue >> 32)));
        AFf1aSDK.IAuthTabCallback iAuthTabCallback2 = AFf1aSDK.IAuthTabCallback.Up;
        final float fIntBitsToFloat2 = iAuthTabCallback == iAuthTabCallback2 ? 0.0f : Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) - Float.intBitsToFloat((int) jLongValue);
        if (iAuthTabCallback == iAuthTabCallback2) {
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Float.intBitsToFloat((int) jLongValue);
                throw null;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) jLongValue);
            int i3 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            fIntBitsToFloat = 0.0f;
        }
        final long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(RangesKt___RangesKt.coerceAtLeast(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) - Float.intBitsToFloat((int) jLongValue), 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32))) << 32));
        final long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
        final float fOnExtraCallback = sessionProcessorCaptureCallback.onExtraCallback(f);
        return sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit unitOnExtraCallback;
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 101;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    unitOnExtraCallback = getHeaderField.onExtraCallback(onnavigationevent, fOnExtraCallback, j, jIAuthTabCallback, jOnWarmupCompleted, fIntBitsToFloat2, jLongValue, fOnNavigationEvent, removetimestampOnWarmupCompleted, iAuthTabCallback, (setIso) obj);
                    int i7 = 73 / 0;
                } else {
                    unitOnExtraCallback = getHeaderField.onExtraCallback(onnavigationevent, fOnExtraCallback, j, jIAuthTabCallback, jOnWarmupCompleted, fIntBitsToFloat2, jLongValue, fOnNavigationEvent, removetimestampOnWarmupCompleted, iAuthTabCallback, (setIso) obj);
                }
                int i8 = IAuthTabCallback + 65;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 75 / 0;
                }
                return unitOnExtraCallback;
            }
        });
    }

    private static final Unit onExtraCallbackWithResult(AFf1aSDK.onNavigationEvent onnavigationevent, float f, long j, long j2, long j3, float f2, long j4, float f3, removeTimestamp removetimestamp, AFf1aSDK.IAuthTabCallback iAuthTabCallback, setIso setiso) {
        long j5;
        long j6;
        float f4;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        Object obj;
        setIso setiso2;
        long j7;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        if (onnavigationevent instanceof AFf1aSDK.onNavigationEvent.onExtraCallback) {
            int i4 = onExtraCallbackWithResult + 107;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            if (f == 0.0f) {
                int i7 = i5 + 31;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    j5 = 1;
                    j6 = 0;
                    f4 = 0.0f;
                    hasmoreelements = null;
                    i = 0;
                    i2 = 85;
                    obj = null;
                    setiso2 = setiso;
                    j7 = j;
                    seekVar = null;
                } else {
                    j5 = 0;
                    j6 = 0;
                    f4 = 0.0f;
                    hasmoreelements = null;
                    seekVar = null;
                    i = 0;
                    i2 = 126;
                    obj = null;
                    setiso2 = setiso;
                    j7 = j;
                }
                setOrientationDegrees.onWarmupCompleted(setiso2, j7, j5, j6, f4, hasmoreelements, seekVar, i, i2, obj);
            } else {
                setOrientationDegrees.onWarmupCompleted(setiso, j, j2, j3, getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), (hasMoreElements) null, 0.0f, (seek) null, 0, 240, (Object) null);
                long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (setiso.onTransact() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) j4);
                setOrientationDegrees.onWarmupCompleted(setiso, j, jIAuthTabCallback, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
            }
            setiso.onWarmupCompleted();
            float fCoerceIn = RangesKt___RangesKt.coerceIn(f3, 0.0f, Float.intBitsToFloat((int) (setiso.onTransact() >> 32)));
            float fCoerceIn2 = RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (j4 >> 32)) + f3, 0.0f, Float.intBitsToFloat((int) (setiso.onTransact() >> 32)));
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            long jOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            long jIAuthTabCallback2 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            int i8 = (int) j4;
            float fIntBitsToFloat3 = Float.intBitsToFloat(i8);
            long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fCoerceIn) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L));
            readBoolean.onNavigationEvent onnavigationevent2 = readBoolean.Companion;
            setOrientationDegrees.onWarmupCompleted(setiso, jOnNavigationEvent, jIAuthTabCallback2, jOnWarmupCompleted, 0.0f, (hasMoreElements) null, (seek) null, onnavigationevent2.onWarmupCompleted(), 56, (Object) null);
            long jOnNavigationEvent2 = onextracallbackwithresult.onNavigationEvent();
            long jIAuthTabCallback3 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fCoerceIn2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (setiso.onTransact() >> 32));
            float fIntBitsToFloat5 = Float.intBitsToFloat(i8);
            setOrientationDegrees.onWarmupCompleted(setiso, jOnNavigationEvent2, jIAuthTabCallback3, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(fIntBitsToFloat4 - fCoerceIn2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L)), 0.0f, (hasMoreElements) null, (seek) null, onnavigationevent2.onWarmupCompleted(), 56, (Object) null);
            onWarmupCompleted(setiso, removetimestamp, f3, f2, j4, iAuthTabCallback, onextracallbackwithresult.onNavigationEvent(), onnavigationevent2.onWarmupCompleted());
        } else {
            if (!Intrinsics.areEqual(onnavigationevent, AFf1aSDK.onNavigationEvent.onWarmupCompleted.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            onExtraCallbackWithResult(setiso, j2, j3, f, j);
            onExtraCallback((setOrientationDegrees) setiso, removetimestamp, f3, f2, j4, iAuthTabCallback, j, 0, 64, (Object) null);
            setiso.onWarmupCompleted();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = (QuirksExternalSyntheticBackport0) objArr[0];
        AFf1aSDK.onNavigationEvent onnavigationevent = (AFf1aSDK.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = onnavigationevent instanceof AFf1aSDK.onNavigationEvent.onExtraCallback;
            throw null;
        }
        if (onnavigationevent instanceof AFf1aSDK.onNavigationEvent.onExtraCallback) {
            quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, new Function1() { // from class: im.toss.tosssecurities.uikit.base.TossSecTdsTooltipV1Kt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 67;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Unit unitOnExtraCallbackWithResult = getHeaderField.onExtraCallbackWithResult((flipHorizontally) obj);
                    if (i5 == 0) {
                        int i6 = 35 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        int i3 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void onExtraCallbackWithResult(setOrientationDegrees setorientationdegrees, long j, long j2, float f, long j3) {
        int i = 2 % 2;
        if (f == 0.0f) {
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j3, j, j2, 1.0f, (hasMoreElements) null, (seek) null, 1, 65, (Object) null);
            } else {
                setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j3, j, j2, 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
            }
            int i3 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
                return;
            }
            return;
        }
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j3, j, j2, getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), (hasMoreElements) null, 0.0f, (seek) null, 0, 240, (Object) null);
    }

    static /* synthetic */ void onExtraCallback(setOrientationDegrees setorientationdegrees, removeTimestamp removetimestamp, float f, float f2, long j, AFf1aSDK.IAuthTabCallback iAuthTabCallback, long j2, int i, int i2, Object obj) {
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 64) != 0) {
            int i5 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int iICustomTabsCallbackStubProxy = readBoolean.Companion.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i3 = iICustomTabsCallbackStubProxy;
        } else {
            i3 = i;
        }
        onWarmupCompleted(setorientationdegrees, removetimestamp, f, f2, j, iAuthTabCallback, j2, i3);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jAccess100;
        rotate.onExtraCallback onextracallback = (rotate) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(onextracallback, "");
        rotate.onExtraCallback onextracallback2 = onextracallback;
        if (i3 != 0) {
            jAccess100 = onextracallback2.onWarmupCompleted().onWarmupCompleted().access100();
            int i4 = 60 / 0;
        } else {
            jAccess100 = onextracallback2.onWarmupCompleted().onWarmupCompleted().access100();
        }
        return Long.valueOf(jAccess100);
    }

    private static final float onNavigationEvent(AFe1wSDK aFe1wSDK, float f, float f2) {
        int i = 2 % 2;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f - f2, 0.0f);
        if (!(aFe1wSDK instanceof AFe1wSDK.onExtraCallback)) {
            if (aFe1wSDK instanceof AFe1wSDK.onExtraCallbackWithResult) {
                return RangesKt___RangesKt.coerceIn(((AFe1wSDK.onExtraCallbackWithResult) aFe1wSDK).onWarmupCompleted() - (f2 / 2.0f), 0.0f, fCoerceAtLeast);
            }
            throw new NoWhenBranchMatchedException();
        }
        AFf1aSDK.onWarmupCompleted onwarmupcompletedOnNavigationEvent = ((AFe1wSDK.onExtraCallback) aFe1wSDK).onNavigationEvent();
        if (!(!Intrinsics.areEqual(onwarmupcompletedOnNavigationEvent, AFf1aSDK.onWarmupCompleted.C0015onWarmupCompleted.onExtraCallbackWithResult))) {
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return 0.0f;
        }
        if (!(!Intrinsics.areEqual(onwarmupcompletedOnNavigationEvent, AFf1aSDK.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult))) {
            return fCoerceAtLeast;
        }
        if (Intrinsics.areEqual(onwarmupcompletedOnNavigationEvent, AFf1aSDK.onWarmupCompleted.IAuthTabCallback.IAuthTabCallback)) {
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0 ? fCoerceAtLeast / 0.0f : fCoerceAtLeast / 2.0f;
        }
        if (!(onwarmupcompletedOnNavigationEvent instanceof AFf1aSDK.onWarmupCompleted.onExtraCallbackWithResult)) {
            throw new NoWhenBranchMatchedException();
        }
        return fCoerceAtLeast * RangesKt___RangesKt.coerceIn(((AFf1aSDK.onWarmupCompleted.onExtraCallbackWithResult) onwarmupcompletedOnNavigationEvent).IAuthTabCallback(), 0.0f, 1.0f);
    }

    private static final void onWarmupCompleted(setOrientationDegrees setorientationdegrees, removeTimestamp removetimestamp, float f, float f2, long j, AFf1aSDK.IAuthTabCallback iAuthTabCallback, long j2, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        setFlashState setflashstateOnExtraCallback = setorientationdegrees.onExtraCallback();
        long jOnExtraCallback = setflashstateOnExtraCallback.onExtraCallback();
        setflashstateOnExtraCallback.onNavigationEvent().onNavigationEvent();
        try {
            ExifDataBuilder1 exifDataBuilder1OnTransact = setflashstateOnExtraCallback.onTransact();
            exifDataBuilder1OnTransact.onWarmupCompleted(f, f2);
            if (iAuthTabCallback == AFf1aSDK.IAuthTabCallback.Down) {
                int i5 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) j) / 2.0f;
                exifDataBuilder1OnTransact.onExtraCallbackWithResult(180.0f, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
                int i7 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            setOrientationDegrees.onWarmupCompleted(setorientationdegrees, removetimestamp, j2, 0.0f, (hasMoreElements) null, (seek) null, i, 28, (Object) null);
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            int i9 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        } catch (Throwable th) {
            setflashstateOnExtraCallback.onNavigationEvent().IAuthTabCallback();
            setflashstateOnExtraCallback.onExtraCallbackWithResult(jOnExtraCallback);
            throw th;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, AFf1aSDK.onWarmupCompleted onwarmupcompleted, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, onwarmupcompleted, Long.valueOf(j), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-1047391731, 1047391732, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.IAuthTabCallback iAuthTabCallback, AFf1aSDK.onNavigationEvent onnavigationevent, AFf1aSDK.onWarmupCompleted onwarmupcompleted, long j, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirkSettingsLoader quirkSettingsLoader, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, onnavigationevent, onwarmupcompleted, Long.valueOf(j), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, quirkSettingsLoader, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(570081063, -570081061, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final long onWarmupCompleted(rotate rotateVar) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return ((Long) onWarmupCompleted(-43549323, 43549326, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{rotateVar}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult)).longValue();
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AFf1aSDK.onNavigationEvent onnavigationevent) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (QuirksExternalSyntheticBackport0) onWarmupCompleted(444332068, -444332068, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{quirksExternalSyntheticBackport0, onnavigationevent}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
