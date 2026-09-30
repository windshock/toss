package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.readFully;
import o.removeObserverLocked;
import o.setMaxAdCount;
import o.setOrientationDegrees;
import o.setUseCaseDetached;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMaxAdCount {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static final Function2<setUseCaseDetached, Float, Pair<setUseCaseAttached, setUseCaseAttached>> onExtraCallbackWithResult = new Function2() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setUseCaseDetached setusecasedetached = (setUseCaseDetached) obj;
            float fFloatValue = ((Float) obj2).floatValue();
            if (i3 == 0) {
                setMaxAdCount.onExtraCallbackWithResult(setusecasedetached, fFloatValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Pair pairOnExtraCallbackWithResult = setMaxAdCount.onExtraCallbackWithResult(setusecasedetached, fFloatValue);
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return pairOnExtraCallbackWithResult;
        }
    };
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        readFully readfully = (readFully) objArr[0];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(readfully, setorientationdegrees);
        }
        onTransact(readfully, setorientationdegrees);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        if (i3 == 0) {
            return (Unit) onNavigationEvent(-405602374, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 405602382);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(readfully, setorientationdegrees);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(readfully, setorientationdegrees);
        int i3 = onNavigationEvent + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(float f, float f2, float f3, float f4, List list, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), list, Integer.valueOf(i), sessionProcessorCaptureCallback};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        removeObserverLocked removeobserverlocked = (removeObserverLocked) onNavigationEvent(-796648949, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 796648949);
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return removeobserverlocked;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(int i, float f, int i2, setOnQueryTextListener setonquerytextlistener, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(i, f, i2, setonquerytextlistener, j, sessionProcessorCaptureCallback);
        int i6 = onNavigationEvent + 51;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        List list = (List) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(list, fFloatValue, iIntValue, sessionProcessorCaptureCallback);
        }
        onNavigationEvent(list, fFloatValue, iIntValue, sessionProcessorCaptureCallback);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallbackStub(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallbackStub(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(setUseCaseDetached setusecasedetached, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnWarmupCompleted = onWarmupCompleted(setusecasedetached, f);
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return pairOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(getsupportedhighspeedresolutions, f);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutions, f);
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(readfully, setorientationdegrees);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(readfully, setorientationdegrees);
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i4 | i6)) | (~(i7 | i9));
        int i12 = ~(i9 | i | i6);
        int i13 = i + i6 + i2 + ((-194346734) * i5) + (9035316 * i3);
        int i14 = i13 * i13;
        int i15 = (i * 1174986172) + 1294669563 + (i6 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (1174986385 * i2) + ((-1060063438) * i5) + (107475828 * i3) + (i14 * 168099840);
        switch ((((-787818500) * i) - 443744256) + ((-1492047866) * i6) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i2) + (1190920192 * i5) + (1456996352 * i3) + ((-1774911488) * i14) + (i15 * i15 * 40566784)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                readFully readfully = (readFully) objArr[0];
                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
                int i16 = 2 % 2;
                int i17 = onNavigationEvent + 67;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(setorientationdegrees, "");
                setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i19 = onWarmupCompleted + 97;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                return unit;
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
            unit = (Unit) onNavigationEvent(1358751756, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{readfully, setorientationdegrees}, iIAuthTabCallback, iIAuthTabCallback3, -1358751749);
            int i3 = 24 / 0;
        } else {
            int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
            unit = (Unit) onNavigationEvent(1358751756, iIAuthTabCallback5, R.drawable.IAuthTabCallback(), new Object[]{readfully, setorientationdegrees}, iIAuthTabCallback4, iIAuthTabCallback6, -1358751749);
        }
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(Pair[] pairArr, float f, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        removeObserverLocked removeobserverlockedOnWarmupCompleted = onWarmupCompleted(pairArr, f, i, sessionProcessorCaptureCallback);
        int i5 = onNavigationEvent + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return removeobserverlockedOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutions, f);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(readfully, setorientationdegrees);
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(float f, float f2, float f3, float f4, Pair[] pairArr, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(f, f2, f3, f4, pairArr, i, sessionProcessorCaptureCallback);
        int i5 = onNavigationEvent + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    static {
        int i = IAuthTabCallback + 103;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Pair onWarmupCompleted(setUseCaseDetached setusecasedetached, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        double radians = Math.toRadians(f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setusecasedetached.onNavigationEvent()) >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(setusecasedetached.onNavigationEvent()));
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float fAbs = (Math.abs(fCos) * (Float.intBitsToFloat((int) (setusecasedetached.onNavigationEvent() >> 32)) / 2.0f)) + (Math.abs(fSin) * (Float.intBitsToFloat((int) setusecasedetached.onNavigationEvent()) / 2.0f));
        float f2 = fCos * fAbs;
        float f3 = fSin * fAbs;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat - f2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 - f3) & 4294967295L))), setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat + f2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2 + f3) & 4294967295L))));
        int i4 = onWarmupCompleted + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }

    public static final readFully onExtraCallback(@NotNull readFully.onExtraCallback onextracallback, @NotNull List<setByteOrder> list, float f, long j, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(list, "");
        Pair pair = (Pair) onExtraCallbackWithResult.invoke(setUseCaseDetached.onNavigationEvent(j), Float.valueOf(f));
        long jOnExtraCallback = ((setUseCaseAttached) pair.onExtraCallbackWithResult()).onExtraCallback();
        long jOnExtraCallback2 = ((setUseCaseAttached) pair.IAuthTabCallback()).onExtraCallback();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jOnExtraCallback >> 32));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) jOnExtraCallback)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jOnExtraCallback2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) jOnExtraCallback2);
        readFully readfullyOnWarmupCompleted = onextracallback.onWarmupCompleted(list, jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L)), i);
        int i5 = onNavigationEvent + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return readfullyOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        readFully.onExtraCallback onextracallback = (readFully.onExtraCallback) objArr[0];
        Pair[] pairArr = (Pair[]) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        if ((iIntValue2 & 8) != 0) {
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = createURational.Companion.onExtraCallback();
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr2 = {onextracallback, pairArr, Float.valueOf(fFloatValue), Long.valueOf(jLongValue), Integer.valueOf(iIntValue)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (readFully) onNavigationEvent(92240538, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, iIAuthTabCallback, R.drawable.IAuthTabCallback(), -92240532);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        readFully.onExtraCallback onextracallback = (readFully.onExtraCallback) objArr[0];
        Pair[] pairArr = (Pair[]) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        Pair pair = (Pair) onExtraCallbackWithResult.invoke(setUseCaseDetached.onNavigationEvent(jLongValue), Float.valueOf(fFloatValue));
        long jOnExtraCallback = ((setUseCaseAttached) pair.onExtraCallbackWithResult()).onExtraCallback();
        long jOnExtraCallback2 = ((setUseCaseAttached) pair.IAuthTabCallback()).onExtraCallback();
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jOnExtraCallback >> 32));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) jOnExtraCallback)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jOnExtraCallback2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) jOnExtraCallback2);
        readFully readfullyOnWarmupCompleted = onextracallback.onWarmupCompleted(pairArr2, jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L)), iIntValue);
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return readfullyOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final List list = (List) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        final int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(list, "");
        if ((iIntValue3 & 2) != 0) {
            fFloatValue = 0.0f;
        }
        if ((iIntValue3 & 4) != 0) {
            iIntValue = createURational.Companion.onExtraCallback();
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-365889972, iIntValue2, -1, "im.toss.tds.compose.foundation.graphics.gradient.linearGradient (LinearGradientModifier.kt:95)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Object obj = null;
        if (((iIntValue2 & 112) ^ 48) > 32) {
            int i6 = onWarmupCompleted + 63;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
                z = (iIntValue2 & 48) == 32;
            }
        }
        boolean z2 = (((iIntValue2 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue)) || (iIntValue2 & 384) == 256;
        boolean z3 = (((iIntValue2 & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) || (iIntValue2 & 3072) == 2048;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z3 | z | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 55;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    List list2 = list;
                    if (i9 == 0) {
                        float f = fFloatValue;
                        int i10 = iIntValue;
                        Float fValueOf = Float.valueOf(f);
                        Integer numValueOf = Integer.valueOf(i10);
                        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                        return (removeObserverLocked) setMaxAdCount.onNavigationEvent(-1624407650, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{list2, fValueOf, numValueOf, (SessionProcessorCaptureCallback) obj2}, iIAuthTabCallback, iIAuthTabCallback3, 1624407659);
                    }
                    float f2 = fFloatValue;
                    int i11 = iIntValue;
                    Float fValueOf2 = Float.valueOf(f2);
                    Integer numValueOf2 = Integer.valueOf(i11);
                    int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 117;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i9 = onWarmupCompleted + 21;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final removeObserverLocked onNavigationEvent(List list, float f, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyOnExtraCallback = onExtraCallback(readFully.Companion, list, f, sessionProcessorCaptureCallback.onWarmupCompleted(), i);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 55;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                readFully readfully = readfullyOnExtraCallback;
                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) obj;
                if (i5 != 0) {
                    return setMaxAdCount.onWarmupCompleted(readfully, setorientationdegrees);
                }
                setMaxAdCount.onWarmupCompleted(readfully, setorientationdegrees);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Pair<Float, setByteOrder>[] pairArr, final float f, final int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        if ((i3 & 2) != 0) {
            int i5 = onWarmupCompleted + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            f = 0.0f;
        }
        if ((i3 & 4) != 0) {
            i = createURational.Companion.onExtraCallback();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(882086579, i2, -1, "im.toss.tds.compose.foundation.graphics.gradient.linearGradient (LinearGradientModifier.kt:115)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
        boolean z2 = true;
        Object obj = null;
        if (((i2 & 896) ^ 384) > 256) {
            int i7 = onNavigationEvent + 99;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f)) {
                z = (i2 & 384) == 256;
            }
        }
        if (((i2 & 7168) ^ 3072) > 2048) {
            int i8 = onNavigationEvent + 5;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                if ((i2 & 3072) != 2048) {
                    z2 = false;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | z | z2)) {
            int i9 = onNavigationEvent + 59;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallback + 63;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        removeObserverLocked removeobserverlockedOnNavigationEvent = setMaxAdCount.onNavigationEvent(pairArr, f, i, (SessionProcessorCaptureCallback) obj2);
                        int i13 = onExtraCallbackWithResult + 53;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                        return removeobserverlockedOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final removeObserverLocked onWarmupCompleted(Pair[] pairArr, float f, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        Object[] objArr = {readFully.Companion, pairArr, Float.valueOf(f), Long.valueOf(sessionProcessorCaptureCallback.onWarmupCompleted()), Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        final readFully readfully = (readFully) onNavigationEvent(92240538, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), -92240532);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 67;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                readFully readfully2 = readfully;
                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) obj;
                if (i5 == 0) {
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                    return (Unit) setMaxAdCount.onNavigationEvent(-1487424080, iIAuthTabCallback3, R.drawable.IAuthTabCallback(), new Object[]{readfully2, setorientationdegrees}, iIAuthTabCallback2, iIAuthTabCallback4, 1487424082);
                }
                int iIAuthTabCallback5 = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback6 = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback7 = R.drawable.IAuthTabCallback();
                Unit unit = (Unit) setMaxAdCount.onNavigationEvent(-1487424080, iIAuthTabCallback6, R.drawable.IAuthTabCallback(), new Object[]{readfully2, setorientationdegrees}, iIAuthTabCallback5, iIAuthTabCallback7, 1487424082);
                int i6 = 95 / 0;
                return unit;
            }
        });
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onTransact(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 1L, 1L, 2.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, @NotNull final setOnQueryTextListener setonquerytextlistener, float f, int i, int i2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        final float f2;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 49;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(setonquerytextlistener, "");
            f2 = (i4 & 3) != 0 ? 0.0f : f;
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(setonquerytextlistener, "");
            if ((i4 & 4) != 0) {
            }
        }
        if ((i4 & 8) != 0) {
            int i8 = onNavigationEvent + 35;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i5 = 15;
        } else {
            i5 = i;
        }
        int iOnExtraCallback = (i4 & 16) != 0 ? createURational.Companion.onExtraCallback() : i2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1960854853, i3, -1, "im.toss.tds.compose.foundation.graphics.gradient.linearGradient (LinearGradientModifier.kt:137)");
            int i10 = onNavigationEvent + 111;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        if ((((57344 & i3) ^ 24576) <= 16384 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i5)) && (i3 & 24576) != 16384) {
            int i12 = onWarmupCompleted + 55;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            z = false;
        } else {
            z = true;
        }
        boolean z5 = (((i3 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setonquerytextlistener)) || (i3 & 384) == 256;
        if (((i3 & 112) ^ 48) > 32) {
            int i14 = onNavigationEvent + 97;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
            if (i15 != 0) {
                int i16 = 64 / 0;
                if (!zOnWarmupCompleted) {
                    z2 = (i3 & 48) == 32;
                }
            } else if (!zOnWarmupCompleted) {
            }
        }
        if (((i3 & 7168) ^ 3072) > 2048) {
            int i17 = onNavigationEvent + 77;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) {
                z3 = (i3 & 3072) == 2048;
            }
        }
        if (((458752 & i3) ^ 196608) > 131072) {
            int i19 = onWarmupCompleted + 21;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallback);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallback)) {
                z4 = (i3 & 196608) == 131072;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z4 | z | z5 | z2 | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            final int i20 = i5;
            final int i21 = iOnExtraCallback;
            Function1 function1 = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 41;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    removeObserverLocked removeobserverlockedIAuthTabCallback = setMaxAdCount.IAuthTabCallback(i20, f2, i21, setonquerytextlistener, j, (SessionProcessorCaptureCallback) obj);
                    int i25 = onWarmupCompleted + 89;
                    IAuthTabCallback = i25 % 128;
                    if (i25 % 2 == 0) {
                        return removeobserverlockedIAuthTabCallback;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
            objOnMinimized = function1;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(int i, float f, int i2, setOnQueryTextListener setonquerytextlistener, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        IntRange intRange = new IntRange(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        IntIterator it = intRange.iterator();
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            float fTransform = setonquerytextlistener.transform(it.nextInt() / i);
            arrayList.add(getWrite.IAuthTabCallback(Float.valueOf(fTransform), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(j, fTransform, 0.0f, 0.0f, 0.0f, 14, (Object) null))));
        }
        final readFully readfully = (readFully) onNavigationEvent(92240538, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{readFully.Companion, (Pair[]) arrayList.toArray(new Pair[0]), Float.valueOf(f), Long.valueOf(sessionProcessorCaptureCallback.onWarmupCompleted()), Integer.valueOf(i2)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -92240532);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 109;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    setMaxAdCount.onExtraCallbackWithResult(readfully, (setOrientationDegrees) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = setMaxAdCount.onExtraCallbackWithResult(readfully, (setOrientationDegrees) obj);
                int i8 = onNavigationEvent + 73;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 18 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        int i6 = onWarmupCompleted + 65;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit asBinder(readFully readfully, setOrientationDegrees setorientationdegrees) {
        long j;
        long j2;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 1;
            j2 = 1;
            f = 2.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 1;
            i2 = 55;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            j = 0;
            j2 = 0;
            f = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 0;
            i2 = 126;
        }
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, j, j2, f, hasmoreelements, seekVar, i, i2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(getsupportedhighspeedresolutions, f);
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        IAuthTabCallbackStub(getsupportedhighspeedresolutions, f);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-985371958);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i5 = onNavigationEvent + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-985371958, i, -1, "im.toss.tds.compose.foundation.graphics.gradient.LinearGradientWithEasingPreview (LinearGradientModifier.kt:159)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i7 = onNavigationEvent + 107;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i8 = 7 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i9 = onNavigationEvent + 9;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(onExtraCallback(getsupportedhighspeedresolutions));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!zIAuthTabCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = Float.valueOf(deprecated_immutable.onWarmupCompleted(Float.valueOf(onExtraCallback(getsupportedhighspeedresolutions)), new Number[]{0, 1}, new Number[]{Float.valueOf(0.0f), Float.valueOf(360.0f)}).floatValue());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            float fFloatValue = ((Number) objOnMinimized2).floatValue();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i11 = onNavigationEvent + 61;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            float fOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutions);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new LinearGradientModifierKt$.ExternalSyntheticLambda4(getsupportedhighspeedresolutions);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            MeteringPoint.onExtraCallbackWithResult(fOnExtraCallback, (Function1) objOnMinimized3, quirksExternalSyntheticBackport0OnExtraCallback2, false, (getUnreadableElfFilesList) null, 0, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (resultIncoming) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 504);
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult(String.valueOf(fFloatValue), (QuirksExternalSyntheticBackport0) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(150.0f));
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), new setInputType(0.8f, 0.0f, 0.72f, 0.8f), fFloatValue, 0, 0, cameraCaptureResultEmptyCameraCaptureResult2, 390, 24), cameraCaptureResultEmptyCameraCaptureResult2, 0);
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LinearGradientModifierKt$.ExternalSyntheticLambda5(i));
        }
    }

    private static final Unit asInterface(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onTransact(getsupportedhighspeedresolutions, f);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jIEngagementSignalsCallbackStub;
        long jIEngagementSignalsCallbackStub2;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-390369499);
        if (i != 0) {
            int i3 = onNavigationEvent + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onNavigationEvent + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-390369499, i, -1, "im.toss.tds.compose.foundation.graphics.gradient.LinearGradientWithColorsPreview (LinearGradientModifier.kt:201)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
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
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i7 = onNavigationEvent + 41;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(IAuthTabCallback(getsupportedhighspeedresolutions));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = Float.valueOf(deprecated_immutable.onWarmupCompleted(Float.valueOf(IAuthTabCallback(getsupportedhighspeedresolutions)), new Number[]{0, 1}, new Number[]{fValueOf, Float.valueOf(360.0f)}).floatValue());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            float fFloatValue = ((Number) objOnMinimized2).floatValue();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i9 = onWarmupCompleted + 73;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            float fIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutions);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda13
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 15;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnWarmupCompleted = setMaxAdCount.onWarmupCompleted(getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                        if (i12 != 0) {
                            int i13 = 93 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            MeteringPoint.onExtraCallbackWithResult(fIAuthTabCallback, (Function1) objOnMinimized3, quirksExternalSyntheticBackport0OnExtraCallback2, false, (getUnreadableElfFilesList) null, 0, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (resultIncoming) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 504);
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult(String.valueOf(fFloatValue), (QuirksExternalSyntheticBackport0) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(270.0f));
            setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue());
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i10 = onNavigationEvent + 61;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2139971841);
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2139972769);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) onNavigationEvent(-53108025, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0IAuthTabCallback, CollectionsKt.listOf(new setByteOrder[]{setbyteorderOnNavigationEvent, setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub)}), Float.valueOf(fFloatValue), 0, cameraCaptureResultEmptyCameraCaptureResult2, 6, 4}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 53108030), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(370.0f)), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), 0.0f, 0.0f, 13, (Object) null);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2139987393);
                jIEngagementSignalsCallbackStub2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2139988321);
                jIEngagementSignalsCallbackStub2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback3, new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub2))}, -0.5f, -0.5f, 1.0f, 1.0f, 0, cameraCaptureResultEmptyCameraCaptureResult2, 221190, 32), cameraCaptureResultEmptyCameraCaptureResult2, 0);
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 21;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = i;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {Integer.valueOf(i14), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                        throw null;
                    }
                    int i15 = i;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {Integer.valueOf(i15), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    Unit unit = (Unit) setMaxAdCount.onNavigationEvent(-514150776, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), 514150780);
                    int i16 = onWarmupCompleted + 17;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unit;
                }
            });
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutions, fFloatValue);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0325 A[PHI: r3
      0x0325: PHI (r3v7 kotlin.Pair) = (r3v1 kotlin.Pair), (r3v8 kotlin.Pair) binds: [B:48:0x0323, B:45:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0334 A[PHI: r3
      0x0334: PHI (r3v2 kotlin.Pair) = (r3v1 kotlin.Pair), (r3v8 kotlin.Pair) binds: [B:48:0x0323, B:45:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        Throwable th;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2;
        long jIEngagementSignalsCallbackStub;
        Pair pairIAuthTabCallback;
        long jICustomTabsCallback;
        int i3 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1690823225);
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1690823225, i, -1, "im.toss.tds.compose.foundation.graphics.gradient.LinearGradientWithColorStopsPreview (LinearGradientModifier.kt:261)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i7 = onNavigationEvent + 7;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(onNavigationEvent(getsupportedhighspeedresolutions));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = Float.valueOf(deprecated_immutable.onWarmupCompleted(Float.valueOf(onNavigationEvent(getsupportedhighspeedresolutions)), new Number[]{0, 1}, new Number[]{fValueOf, Float.valueOf(360.0f)}).floatValue());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            float fFloatValue = ((Number) objOnMinimized2).floatValue();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            float fOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        Unit unitIAuthTabCallback;
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 101;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            unitIAuthTabCallback = setMaxAdCount.IAuthTabCallback(getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                            int i11 = 52 / 0;
                        } else {
                            unitIAuthTabCallback = setMaxAdCount.IAuthTabCallback(getsupportedhighspeedresolutions, ((Float) obj2).floatValue());
                        }
                        int i12 = onWarmupCompleted + 47;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            MeteringPoint.onExtraCallbackWithResult(fOnNavigationEvent, (Function1) objOnMinimized3, quirksExternalSyntheticBackport0OnExtraCallback2, false, (getUnreadableElfFilesList) null, 0, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (resultIncoming) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 504);
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult(String.valueOf(fFloatValue), (QuirksExternalSyntheticBackport0) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 131066);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1398443421);
                i2 = 6;
                jIEngagementSignalsCallbackStub = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
            } else {
                i2 = 6;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1398442493);
                jIEngagementSignalsCallbackStub = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IEngagementSignalsCallbackStub();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            int i9 = onWarmupCompleted + 27;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub));
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 50}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1398439835);
                    jICustomTabsCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i2).ICustomTabsCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1398438843);
                    jICustomTabsCallback = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i2).extraCallback();
                }
            } else {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(jIEngagementSignalsCallbackStub));
                if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i2)}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = onExtraCallback(onextracallback, new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(jICustomTabsCallback)), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i2)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()))}, fFloatValue, 0, cameraCaptureResultEmptyCameraCaptureResult2, 6, 4);
            th = null;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback3, 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            th = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 7;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = i;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {Integer.valueOf(i13), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    Unit unit = (Unit) setMaxAdCount.onNavigationEvent(-1735684769, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 1735684770);
                    int i14 = onNavigationEvent + 45;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unit;
                }
            });
        }
        int i10 = onNavigationEvent + 97;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            throw th;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        float fFloatValue2 = ((Number) objArr[1]).floatValue();
        float fFloatValue3 = ((Number) objArr[2]).floatValue();
        float fFloatValue4 = ((Number) objArr[3]).floatValue();
        List list = (List) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[6];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted());
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2 * fFloatValue2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * fFloatValue) << 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        final readFully readfullyOnWarmupCompleted = readFully.Companion.onWarmupCompleted(list, jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) * fFloatValue4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3 * fFloatValue3) << 32)), iIntValue);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = setMaxAdCount.onNavigationEvent(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                int i5 = IAuthTabCallback + 93;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Pair<Float, setByteOrder>[] pairArr, final float f, final float f2, final float f3, final float f4, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zOnExtraCallback;
        boolean z5;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        final int iOnExtraCallback = (i3 & 32) != 0 ? createURational.Companion.onExtraCallback() : i;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(938881077, i2, -1, "im.toss.tds.compose.foundation.graphics.gradient.linearGradientByPercent (LinearGradientModifier.kt:333)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        if (((i2 & 896) ^ 384) > 256) {
            int i5 = onWarmupCompleted + 75;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f)) {
                z = (i2 & 384) == 256;
            }
        }
        if (((i2 & 7168) ^ 3072) > 2048) {
            int i6 = onNavigationEvent + 115;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) {
                    z2 = (i2 & 3072) == 2048;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2)) {
            }
        }
        if (((57344 & i2) ^ 24576) > 16384) {
            int i8 = onWarmupCompleted + 35;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f3)) {
                z3 = true;
            }
            if (((458752 & i2) ^ 196608) > 131072 || !cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f4)) {
                z4 = (i2 & 196608) != 131072;
            }
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
            if (((i2 & 3670016) ^ 1572864) <= 1048576) {
                int i10 = onNavigationEvent + 51;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallback)) {
                    z5 = (i2 & 1572864) == 1048576;
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(z5 | z | z2 | z3 | z4 | zOnExtraCallback)) {
                Function1 function1 = new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            setMaxAdCount.onWarmupCompleted(f, f2, f3, f4, pairArr, iOnExtraCallback, (SessionProcessorCaptureCallback) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        removeObserverLocked removeobserverlockedOnWarmupCompleted = setMaxAdCount.onWarmupCompleted(f, f2, f3, f4, pairArr, iOnExtraCallback, (SessionProcessorCaptureCallback) obj);
                        int i14 = onExtraCallback + 79;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 99 / 0;
                        }
                        return removeobserverlockedOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                int i12 = onNavigationEvent + 7;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                objOnMinimized = function1;
            } else {
                int i14 = onWarmupCompleted + 123;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        if ((i2 & 24576) != 16384) {
            z3 = false;
        }
        if (((458752 & i2) ^ 196608) > 131072) {
        }
        if ((i2 & 196608) != 131072) {
        }
        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pairArr);
        if (((i2 & 3670016) ^ 1572864) <= 1048576) {
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z5 | z | z2 | z3 | z4 | zOnExtraCallback)) {
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized2));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    private static final removeObserverLocked IAuthTabCallback(float f, float f2, float f3, float f4, Pair[] pairArr, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) * f2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * f) << 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        final readFully readfullyOnWarmupCompleted = readFully.Companion.onWarmupCompleted((Pair[]) Arrays.copyOf(pairArr, pairArr.length), jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()) * f4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2 * f3) << 32)), i);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.foundation.graphics.gradient.LinearGradientModifierKt$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 53;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = setMaxAdCount.IAuthTabCallback(readfullyOnWarmupCompleted, (setOrientationDegrees) obj);
                int i6 = IAuthTabCallback + 21;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 34 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
        int i3 = onNavigationEvent + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getsupportedhighspeedresolutions.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i3 = onWarmupCompleted + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return fOnNavigationEvent;
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = onWarmupCompleted + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return fOnNavigationEvent;
    }

    private static final void onTransact(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getsupportedhighspeedresolutions.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return fOnNavigationEvent;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(-514150776, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 514150780);
    }

    public static /* synthetic */ Unit onExtraCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1487424080, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{readfully, setorientationdegrees}, iIAuthTabCallback, iIAuthTabCallback3, 1487424082);
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1735684769, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 1735684770);
    }

    public static /* synthetic */ removeObserverLocked onExtraCallback(List list, float f, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {list, Float.valueOf(f), Integer.valueOf(i), sessionProcessorCaptureCallback};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (removeObserverLocked) onNavigationEvent(-1624407650, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 1624407659);
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(-405602374, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 405602382);
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull List<setByteOrder> list, float f, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, list, Float.valueOf(f), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (QuirksExternalSyntheticBackport0) onNavigationEvent(-53108025, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 53108030);
    }

    public static final readFully onNavigationEvent(@NotNull readFully.onExtraCallback onextracallback, @NotNull Pair<Float, setByteOrder>[] pairArr, float f, long j, int i) {
        Object[] objArr = {onextracallback, pairArr, Float.valueOf(f), Long.valueOf(j), Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (readFully) onNavigationEvent(92240538, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), -92240532);
    }

    public static /* synthetic */ readFully onExtraCallbackWithResult(readFully.onExtraCallback onextracallback, Pair[] pairArr, float f, long j, int i, int i2, Object obj) {
        Object[] objArr = {onextracallback, pairArr, Float.valueOf(f), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), obj};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (readFully) onNavigationEvent(-1573900131, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 1573900134);
    }

    private static final removeObserverLocked onNavigationEvent(float f, float f2, float f3, float f4, List list, int i, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), list, Integer.valueOf(i), sessionProcessorCaptureCallback};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (removeObserverLocked) onNavigationEvent(-796648949, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, iIAuthTabCallback, R.drawable.IAuthTabCallback(), 796648949);
    }

    private static final Unit asInterface(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(1358751756, iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{readfully, setorientationdegrees}, iIAuthTabCallback, iIAuthTabCallback3, -1358751749);
    }
}
