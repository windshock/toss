package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.getStreamSharingChildren;
import o.r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c;
import o.r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac;
import o.r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(r8lambdacjkj3fyaityxmdlou1fsameeiu);
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) objArr[0];
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1133227257, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1133227260, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        List list = (List) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue4 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(iIntValue, iIntValue2, list, zBooleanValue, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        }
        onWarmupCompleted(iIntValue, iIntValue2, list, zBooleanValue, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1618835871, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1618835875, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i6 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            onExtraCallbackWithResult(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, z, z2, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, z, z2, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, quirksExternalSyntheticBackport0, iAuthTabCallback, z, z2, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(r8lambdacjkj3fyaityxmdlou1fsameeiu);
            throw null;
        }
        Unit unitAsBinder = asBinder(r8lambdacjkj3fyaityxmdlou1fsameeiu);
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(i, i2, (List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>>) list, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1));
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(int i, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, z, z2, (Function1<? super r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, Boolean.valueOf(z), Boolean.valueOf(z2), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        } else {
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, Boolean.valueOf(z), Boolean.valueOf(z2), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(r8lambdacjkj3fyaityxmdlou1fsameeiu);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return unitOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 28 / 0;
        }
        int i7 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnTransact;
    }

    private static final Unit onNavigationEvent(int i, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i6 % 128;
        onExtraCallback(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, z, z2, (Function1<? super r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(r8lambdacjkj3fyaityxmdlou1fsameeiu);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(r8lambdacjkj3fyaityxmdlou1fsameeiu);
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = (~(i7 | i)) | (~(i7 | i8));
        int i10 = ~i;
        int i11 = (~(i6 | i10 | i4)) | i9;
        int i12 = ~(i8 | i10);
        int i13 = i + i4 + i2 + ((-1228711472) * i3) + ((-141981132) * i5);
        int i14 = i13 * i13;
        int i15 = (((-639131287) * i) - 2072313856) + (1118068377 * i4) + (i11 * (-1268883816)) + ((-1757199664) * i9) + ((-1268883816) * i12) + ((-1908015104) * i2) + ((-287309824) * i3) + ((-1573388288) * i5) + ((-2138374144) * i14);
        int i16 = ((i * (-646461497)) - 273503129) + (i4 * (-646460521)) + (i11 * 488) + (i9 * (-976)) + (i12 * 488) + (i2 * (-646461009)) + (i3 * 1623110960) + (i5 * (-2035004020)) + (i14 * 33882112);
        switch (i15 + (i16 * i16 * (-1051394048))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asBinder(objArr);
            default:
                r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) objArr[0];
                r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i17 = 2 % 2;
                int i18 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Unit unit = (Unit) onWarmupCompleted(-965844751, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 965844758, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                int i20 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return unit;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        List list = (List) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue4 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(iIntValue, iIntValue2, list, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        }
        onExtraCallbackWithResult(iIntValue, iIntValue2, list, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, int i2, List list, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(i, i2, list, z, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, z, z2, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ float[] onWarmupCompleted(int i, int i2, int i3, float f, boolean z) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        float[] fArrOnExtraCallback = onExtraCallback(i, i2, i3, f, z);
        int i7 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return fArrOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        boolean z;
        final r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback;
        final boolean z2;
        int i4;
        final int iIntValue = ((Number) objArr[0]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[1];
        r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback2 = (r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback) objArr[2];
        final boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        final Function1 function1 = (Function1) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        final int iIntValue3 = ((Number) objArr[8]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1105381257);
        if ((iIntValue2 & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        int i8 = iIntValue3 & 2;
        if (i8 != 0) {
            i |= 48;
        } else if ((iIntValue2 & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 32 : 16;
        }
        int i9 = iIntValue3 & 4;
        if (i9 != 0) {
            i |= 384;
        } else if ((iIntValue2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback2 == null ? -1 : iAuthTabCallback2.ordinal())) {
                int i10 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i10 % 128;
                i2 = i10 % 2 != 0 ? 27124 : 256;
            } else {
                i2 = 128;
            }
            i |= i2;
        }
        int i11 = iIntValue3 & 8;
        if (i11 != 0) {
            i |= 3072;
        } else if ((iIntValue2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                int i12 = onExtraCallbackWithResult + 103;
                onNavigationEvent = i12 % 128;
                i3 = i12 % 2 == 0 ? 19134 : 2048;
            } else {
                i3 = 1024;
            }
            i |= i3;
        }
        int i13 = iIntValue3 & 16;
        if (i13 != 0) {
            int i14 = onExtraCallbackWithResult + 51;
            onextracallback = onextracallback2;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            i |= 24576;
        } else {
            onextracallback = onextracallback2;
            if ((iIntValue2 & 24576) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 16384 : 8192;
            }
        }
        if ((196608 & iIntValue2) == 0) {
            int i16 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                i4 = 131072;
            } else {
                int i17 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 4 / 3;
                }
                i4 = 65536;
            }
            i |= i4;
        }
        if ((74899 & i) != 74898) {
            int i19 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (i8 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (i9 != 0) {
                int i21 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i21 % 128;
                if (i21 % 2 == 0) {
                    r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback3 = r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback.Medium;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iAuthTabCallback2 = r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback.Medium;
            }
            r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
            boolean z3 = i11 != 0 ? false : zBooleanValue;
            boolean z4 = i13 != 0 ? true : zBooleanValue2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i22 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i22 % 128;
                if (i22 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1105381257, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1 (TdsCompactProgressStepperV1.kt:34)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1105381257, i, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1 (TdsCompactProgressStepperV1.kt:34)");
            }
            onExtraCallback(iIntValue, iAuthTabCallback4.getValue(), (QuirksExternalSyntheticBackport0) onextracallback, z3, z4, (Function1<? super r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i & 14) | ((i << 3) & 896) | (i & 7168) | (57344 & i) | (i & 458752), 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            iAuthTabCallback = iAuthTabCallback4;
            zBooleanValue = z3;
            z2 = z4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            iAuthTabCallback = iAuthTabCallback2;
            z2 = zBooleanValue2;
        }
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda14
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3) {
                int i23 = 2 % 2;
                int i24 = onWarmupCompleted + 111;
                onNavigationEvent = i24 % 128;
                int i25 = i24 % 2;
                Unit unitOnExtraCallback = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onExtraCallback(iIntValue, onextracallback3, iAuthTabCallback, zBooleanValue, z2, function1, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i26 = onWarmupCompleted + 99;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                return unitOnExtraCallback;
            }
        });
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(final int i, @NotNull final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, @NotNull final Function1<? super r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z4;
        final boolean z5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-225442616);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                i7 = 4;
            } else {
                int i9 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i11 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            int i14 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i14 % 128;
            i4 = i14 % 2 != 0 ? i4 | 1185 : i4 | 384;
        } else {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                int i15 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i15 % 128;
                if (i15 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                    throw null;
                }
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    z3 = z2;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    boolean z6 = i5 == 0 ? z : false;
                    boolean z7 = i6 == 0 ? z3 : true;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-225442616, i4, -1, "im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1 (TdsCompactProgressStepperV1.kt:53)");
                    }
                    r8lambdaiWUleEdQikcDNtpoSyB6XdyDG8 r8lambdaiwuleedqikcdntposyb6xdydg8 = new r8lambdaiWUleEdQikcDNtpoSyB6XdyDG8();
                    function1.invoke(r8lambdaiwuleedqikcdntposyb6xdydg8);
                    List listOnNavigationEvent = r8lambdaiwuleedqikcdntposyb6xdydg8.onNavigationEvent();
                    int size = listOnNavigationEvent.size();
                    if (size == 0) {
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i16 = onExtraCallbackWithResult + 11;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i18 = onExtraCallbackWithResult + 111;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            final boolean z8 = z6;
                            final boolean z9 = z7;
                            function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda2
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i20 = 2 % 2;
                                    int i21 = onNavigationEvent + 79;
                                    onExtraCallback = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        return r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport05, z8, z9, function1, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    }
                                    r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport05, z8, z9, function1, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                            return;
                        }
                        return;
                    }
                    float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
                    if (!z7 || fOnNavigationEvent < 2.75f) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1168544686);
                        onNavigationEvent(i, size, listOnNavigationEvent, z6, quirksExternalSyntheticBackport04, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 7182) | (57344 & (i4 << 6)) | ((i4 << 12) & 458752));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i20 = onExtraCallbackWithResult + 89;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        z5 = z6;
                        z4 = z7;
                    } else {
                        int i22 = onExtraCallbackWithResult + 67;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        if (z6) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1168443130);
                            onWarmupCompleted(i, size, (List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>>) listOnNavigationEvent, quirksExternalSyntheticBackport04, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | ((i4 << 3) & 7168) | ((i4 << 9) & 57344));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        z5 = z6;
                        z4 = z7;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                z4 = z3;
                z5 = z;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onExtraCallbackWithResult + 19;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnExtraCallback = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onExtraCallback(i, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport03, z5, z4, function1, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i27 = onExtraCallbackWithResult + 27;
                            onNavigationEvent = i27 % 128;
                            if (i27 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                return;
            }
            i4 |= 24576;
            z3 = z2;
            if ((196608 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z2;
        if ((196608 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i4) != 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) objArr[0];
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 4) == 5) {
            z = false;
        } else {
            int i4 = i3 + 51;
            onExtraCallbackWithResult = i4 % 128;
            z = true ^ (i4 % 2 != 0);
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(962630035, iIntValue, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperHorizontal.<anonymous>.<anonymous>.<anonymous> (TdsCompactProgressStepperV1.kt:105)");
                    int i6 = 92 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(962630035, iIntValue, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperHorizontal.<anonymous>.<anonymous>.<anonymous> (TdsCompactProgressStepperV1.kt:105)");
                }
            }
            r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.IAuthTabCallback().invoke(new r8lambdaTuSkhC09A81B66TebS9EtGm9W9U(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted(), false, 4, null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements component5 {
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M IAuthTabCallback;
        final /* synthetic */ float onExtraCallback;
        final /* synthetic */ int onNavigationEvent;
        final /* synthetic */ boolean onWarmupCompleted;

        onNavigationEvent(boolean z, int i, float f, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m) {
            this.onWarmupCompleted = z;
            this.onNavigationEvent = i;
            this.onExtraCallback = f;
            this.IAuthTabCallback = r8lambdawxvv9xwdigsnld64xj_ruham57m;
        }

        public static /* synthetic */ Unit onExtraCallback(List list, Integer num, int i, int i2, float[] fArr, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, num, i, i2, fArr, onextracallbackwithresult);
            int i6 = asInterface + 29;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 89 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int iCoerceAtMost;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            final int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
            int i2 = this.onNavigationEvent;
            int iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted.onTransact());
            if (i2 <= 1) {
                int i3 = onExtraCallbackWithResult + 41;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                iCoerceAtMost = iAsInterface;
            } else {
                iCoerceAtMost = i2 <= 3 ? iAsInterface / i2 : RangesKt.coerceAtMost(iOnExtraCallbackWithResult, iAsInterface / i2);
            }
            Integer num = null;
            Integer numValueOf = (this.onWarmupCompleted || this.onNavigationEvent <= 3) ? Integer.valueOf(iCoerceAtMost) : null;
            List<? extends component7> list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (component7 component7Var : list2) {
                int i5 = asInterface + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                if (numValueOf != null) {
                    int i7 = onExtraCallbackWithResult + 95;
                    asInterface = i7 % 128;
                    getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(i7 % 2 == 0 ? VirtualCameraCaptureResult.IAuthTabCallback(j, numValueOf.intValue(), numValueOf.intValue(), 1, 1, 55, (Object) null) : VirtualCameraCaptureResult.IAuthTabCallback(j, numValueOf.intValue(), numValueOf.intValue(), 0, 0, 8, (Object) null));
                } else {
                    getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(j, 0, 0, 0, 0, 14, (Object) null));
                    int i8 = asInterface + 113;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
                arrayList.add(getstreamsharingchildrenOnExtraCallback);
            }
            int i10 = this.onNavigationEvent;
            final float[] fArrOnWarmupCompleted = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(iAsInterface, i10, iCoerceAtMost, this.onExtraCallback, i10 <= 3);
            this.IAuthTabCallback.onWarmupCompleted(fArrOnWarmupCompleted);
            Iterator it = arrayList.iterator();
            if (!(!it.hasNext())) {
                Integer numValueOf2 = Integer.valueOf(((getStreamSharingChildren) it.next()).T_());
                loop1: while (true) {
                    num = numValueOf2;
                    while (it.hasNext()) {
                        numValueOf2 = Integer.valueOf(((getStreamSharingChildren) it.next()).T_());
                        if (num.compareTo(numValueOf2) < 0) {
                            break;
                        }
                    }
                }
            }
            int iIntValue = num != null ? num.intValue() : 0;
            final int i11 = this.onNavigationEvent;
            final Integer num2 = numValueOf;
            return component4.IAuthTabCallback(component4Var, iAsInterface, iIntValue, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$CompactProgressStepperHorizontal$2$1$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 17;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 != 0) {
                        return r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onNavigationEvent.onExtraCallback(arrayList, num2, i11, iAsInterface, fArrOnWarmupCompleted, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    }
                    int i14 = 68 / 0;
                    return r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onNavigationEvent.onExtraCallback(arrayList, num2, i11, iAsInterface, fArrOnWarmupCompleted, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                }
            }, 4, (Object) null);
        }

        private static final Unit onExtraCallbackWithResult(List list, Integer num, int i, int i2, float[] fArr, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int interfaceDescriptor;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i4 = onExtraCallbackWithResult + 99;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            for (Object obj : list) {
                int i7 = asInterface + 61;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                if (i6 < 0) {
                    int i9 = onExtraCallbackWithResult + 41;
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt.throwIndexOverflow();
                }
                getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) obj;
                if (num == null) {
                    interfaceDescriptor = (int) (fArr[i6] - (getstreamsharingchildren.getInterfaceDescriptor() / 2.0f));
                } else if (i == 1) {
                    int i10 = asInterface + 105;
                    onExtraCallbackWithResult = i10 % 128;
                    interfaceDescriptor = i10 % 2 != 0 ? getBacktraceNoteBytes.onExtraCallback(getstreamsharingchildren.getInterfaceDescriptor() + i2 + 1.0f) : getBacktraceNoteBytes.onExtraCallback((i2 - getstreamsharingchildren.getInterfaceDescriptor()) / 2.0f);
                } else {
                    interfaceDescriptor = getBacktraceNoteBytes.onExtraCallback(i6 * ((i2 - num.intValue()) / (i - 1)));
                    int i11 = onExtraCallbackWithResult + 3;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                }
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren, interfaceDescriptor, 0, 0.0f, 4, (Object) null);
                i6++;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final int i, final int i2, final List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>> list, final boolean z, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3) {
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m;
        boolean z2;
        float f;
        boolean z3;
        boolean zIAuthTabCallback;
        Object objOnMinimized2;
        boolean z4;
        boolean z5;
        Iterator<T> it;
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-735892960);
        if ((i3 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 32 : 16;
        }
        Object obj = null;
        if ((i3 & 384) == 0) {
            int i7 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                i5 = 1024;
            } else {
                int i8 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i8 % 128;
                i5 = i8 % 2 == 0 ? 19480 : 2048;
            }
            i4 |= i5;
        }
        if ((i3 & 24576) == 0) {
            int i9 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
        }
        int i10 = i4;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
            int i11 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 45 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-735892960, i10, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperHorizontal (TdsCompactProgressStepperV1.kt:79)");
                }
                r8lambdaJeSsRUT1RsUcU58dobBVG9R83I r8lambdajessrut1rsucu58dobbvg9r83i = r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted;
                r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback = r8lambdajessrut1rsucu58dobbvg9r83i.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                float fAsInterface = r8lambdajessrut1rsucu58dobbvg9r83i.asInterface();
                float fOnExtraCallbackWithResult = r8lambdajessrut1rsucu58dobbvg9r83i.onExtraCallbackWithResult();
                float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fOnExtraCallbackWithResult) / 2.0f;
                float fOnExtraCallback2 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fOnExtraCallbackWithResult) / 2.0f;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                r8lambdawxvv9xwdigsnld64xj_ruham57m = (r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = r8lambdajZetUjzyoReOiAaP9UrM0Uy5Lok.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0), i, i2, fAsInterface, fOnExtraCallback, r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback, r8lambdawxvv9xwdigsnld64xj_ruham57m, fOnExtraCallback2, 0.0f, r8lambdajessrut1rsucu58dobbvg9r83i.asBinder(), r8lambdajessrut1rsucu58dobbvg9r83i.isEngagementSignalsApiAvailable(), r8lambdajessrut1rsucu58dobbvg9r83i.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 128, null);
                z2 = (i10 & 112) != 32;
                if ((i10 & 7168) != 2048) {
                    int i13 = onNavigationEvent + 67;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    f = fOnExtraCallback2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    z3 = true;
                } else {
                    f = fOnExtraCallback2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    z3 = false;
                }
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((!(z3 | z2) && !zIAuthTabCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    z4 = z;
                    objOnMinimized2 = new onNavigationEvent(z4, i2, f, r8lambdawxvv9xwdigsnld64xj_ruham57m);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                } else {
                    z4 = z;
                }
                component5 component5Var = (component5) objOnMinimized2;
                int i15 = 0;
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() != null) {
                    z5 = true;
                    int i16 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    getAwbState.onExtraCallback();
                } else {
                    z5 = true;
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1799321457);
                it = list.iterator();
                while (it.hasNext()) {
                    final r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) it.next();
                    if (r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted() < i) {
                        r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Completed;
                    } else if (r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted() == i) {
                        int i18 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 != 0) {
                            r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active;
                            int i19 = 11 / i15;
                        } else {
                            r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active;
                        }
                    } else {
                        r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Upcoming;
                    }
                    final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg2 = r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg;
                    setPostviewFormatSelector.onNavigationEvent(r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.onWarmupCompleted().onExtraCallback(new r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(i2 <= 3 ? r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.onWarmupCompleted(r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted(), i2) : QuirkSettingsLoader.Companion.onTransact(), (!(z4 ^ true) || i2 <= 3) ? z5 : i15, 0.0f, i2, 4, null)), ForwardingCameraControl.onExtraCallback(962630035, z5, new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda8
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i20 = 2 % 2;
                            int i21 = onNavigationEvent + 115;
                            onExtraCallback = i21 % 128;
                            int i22 = i21 % 2;
                            Unit unit = (Unit) r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(889364379, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -889364373, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                            int i23 = onExtraCallback + 13;
                            onNavigationEvent = i23 % 128;
                            if (i23 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                    i15 = 0;
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                r8lambdaJeSsRUT1RsUcU58dobBVG9R83I r8lambdajessrut1rsucu58dobbvg9r83i2 = r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted;
                r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback2 = r8lambdajessrut1rsucu58dobbvg9r83i2.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                float fAsInterface2 = r8lambdajessrut1rsucu58dobbvg9r83i2.asInterface();
                float fOnExtraCallbackWithResult2 = r8lambdajessrut1rsucu58dobbvg9r83i2.onExtraCallbackWithResult();
                float fOnExtraCallback3 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fOnExtraCallbackWithResult2) / 2.0f;
                float fOnExtraCallback22 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fOnExtraCallbackWithResult2) / 2.0f;
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                r8lambdawxvv9xwdigsnld64xj_ruham57m = (r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = r8lambdajZetUjzyoReOiAaP9UrM0Uy5Lok.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0), i, i2, fAsInterface2, fOnExtraCallback3, r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback2, r8lambdawxvv9xwdigsnld64xj_ruham57m, fOnExtraCallback22, 0.0f, r8lambdajessrut1rsucu58dobbvg9r83i2.asBinder(), r8lambdajessrut1rsucu58dobbvg9r83i2.isEngagementSignalsApiAvailable(), r8lambdajessrut1rsucu58dobbvg9r83i2.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 128, null);
                if ((i10 & 112) != 32) {
                }
                if ((i10 & 7168) != 2048) {
                }
                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(z3 | z2 | zIAuthTabCallback)) {
                    z4 = z;
                    objOnMinimized2 = new onNavigationEvent(z4, i2, f, r8lambdawxvv9xwdigsnld64xj_ruham57m);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    component5 component5Var2 = (component5) objOnMinimized2;
                    int i152 = 0;
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() != null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5Var2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1799321457);
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda9
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i20 = 2 % 2;
                    int i21 = onNavigationEvent + 59;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    int i23 = i;
                    int i24 = i2;
                    List list2 = list;
                    boolean z6 = z;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    int i25 = i3;
                    int iIntValue = ((Integer) obj3).intValue();
                    Unit unit = (Unit) r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(-1824290526, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i23), Integer.valueOf(i24), list2, Boolean.valueOf(z6), quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda02, Integer.valueOf(i25), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1824290527, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    int i26 = onWarmupCompleted + 115;
                    onNavigationEvent = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 17 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float[] onExtraCallback(int i, int i2, int i3, float f, boolean z) {
        float f2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0 ? i2 == 1 : i2 == 0) {
            return new float[]{i / 2.0f};
        }
        int i6 = i2 - 1;
        float f3 = (i - i3) / i6;
        float[] fArr = new float[i2];
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = onExtraCallbackWithResult;
            int i9 = i8 + 15;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            float f4 = i7;
            if (z) {
                int i11 = i8 + 15;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i7 == 0) {
                    f2 = f;
                } else if (z && i7 == i6) {
                    int i12 = i8 + 57;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    f2 = i3 - f;
                } else {
                    f2 = i3 / 2.0f;
                }
            }
            fArr[i7] = (f4 * f3) + f2;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean z;
        r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) objArr[0];
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = (r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 3) != 2) {
            int i5 = i3 + 5;
            onNavigationEvent = i5 % 128;
            z = i5 % 2 != 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            int i6 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1892176575, iIntValue, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperVertical.<anonymous>.<anonymous>.<anonymous> (TdsCompactProgressStepperV1.kt:237)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1892176575, iIntValue, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperVertical.<anonymous>.<anonymous>.<anonymous> (TdsCompactProgressStepperV1.kt:237)");
            }
            r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.IAuthTabCallback().invoke(new r8lambdaTuSkhC09A81B66TebS9EtGm9W9U(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted(), true), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback implements component5 {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ int IAuthTabCallback;
        final /* synthetic */ r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M onExtraCallback;
        final /* synthetic */ float onWarmupCompleted;

        onExtraCallback(int i, r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m, float f) {
            this.IAuthTabCallback = i;
            this.onExtraCallback = r8lambdawxvv9xwdigsnld64xj_ruham57m;
            this.onWarmupCompleted = f;
        }

        public static /* synthetic */ Unit onExtraCallback(List list, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, f, onextracallbackwithresult);
            int i4 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            List<? extends component7> list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((component7) it.next()).onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(j, 0, 0, 0, 0, 14, (Object) null)));
                int i2 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            float[] fArr = new float[this.IAuthTabCallback];
            float f = this.onWarmupCompleted;
            int iT_ = 0;
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 < 0) {
                    int i7 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        CollectionsKt.throwIndexOverflow();
                        int i8 = 45 / 0;
                    } else {
                        CollectionsKt.throwIndexOverflow();
                    }
                }
                fArr[i4] = iT_ + (r10.T_() / 2.0f);
                iT_ += ((getStreamSharingChildren) obj).T_();
                if (i4 != CollectionsKt.getLastIndex(arrayList)) {
                    iT_ += component4Var.onExtraCallbackWithResult(f);
                }
                i4++;
            }
            this.onExtraCallback.onWarmupCompleted(fArr);
            int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
            final float f2 = this.onWarmupCompleted;
            return component4.IAuthTabCallback(component4Var, iAsInterface, iT_, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$CompactProgressStepperVertical$2$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 101;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallback = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onExtraCallback.onExtraCallback(arrayList, f2, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                    int i12 = IAuthTabCallback + 103;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnExtraCallback;
                }
            }, 4, (Object) null);
        }

        private static final Unit onExtraCallbackWithResult(List list, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Iterator it = list.iterator();
            int i2 = 0;
            int iT_ = 0;
            while (it.hasNext()) {
                int i3 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    it.next();
                    throw null;
                }
                Object next = it.next();
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) next;
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren, 0, iT_, 0.0f, 4, (Object) null);
                iT_ += getstreamsharingchildren.T_();
                if (i2 != CollectionsKt.getLastIndex(list)) {
                    iT_ += onextracallbackwithresult.onExtraCallbackWithResult(f);
                }
                i2++;
                int i4 = onExtraCallbackWithResult + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onWarmupCompleted(final int i, final int i2, final List<r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>> list, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3) {
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(366486030);
        if ((i3 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2)) {
                int i7 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i7 % 128;
                i5 = i7 % 2 != 0 ? 7 : 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        Object obj = null;
        if ((i3 & 384) == 0) {
            int i8 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            int i9 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                throw null;
            }
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ^ true) ? 16384 : 8192;
        }
        int i10 = i4;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i10 & 9363) != 9362, i10 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(366486030, i10, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperVertical (TdsCompactProgressStepperV1.kt:214)");
                    int i12 = 1 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(366486030, i10, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactProgressStepperVertical (TdsCompactProgressStepperV1.kt:214)");
                }
            }
            r8lambdaJeSsRUT1RsUcU58dobBVG9R83I r8lambdajessrut1rsucu58dobbvg9r83i = r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted;
            r8lambdacVBglJs0KSxuT8ZctwBlsCbeIxI r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback = r8lambdajessrut1rsucu58dobbvg9r83i.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            float fIAuthTabCallbackStubProxy = r8lambdajessrut1rsucu58dobbvg9r83i.IAuthTabCallbackStubProxy();
            float fFloatValue = ((Float) r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onExtraCallback(-1142032812, new Object[]{r8lambdajessrut1rsucu58dobbvg9r83i}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1142032818)).floatValue();
            float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fFloatValue) / 2.0f;
            float fOnExtraCallback2 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fFloatValue) / 2.0f;
            float fOnExtraCallback3 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(r8lambdajessrut1rsucu58dobbvg9r83i.access100()) / 2.0f;
            float interfaceDescriptor = r8lambdajessrut1rsucu58dobbvg9r83i.getInterfaceDescriptor();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M r8lambdawxvv9xwdigsnld64xj_ruham57m = (r8lambdawXVv9xwdiGsnLD64xJ_ruHAm57M) objOnMinimized;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdajZetUjzyoReOiAaP9UrM0Uy5Lok.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0), i, i2, fIAuthTabCallbackStubProxy, fOnExtraCallback, r8lambdacvbgljs0ksxut8zctwblscbeixiOnExtraCallback, r8lambdawxvv9xwdigsnld64xj_ruham57m, fOnExtraCallback3, fOnExtraCallback2, r8lambdajessrut1rsucu58dobbvg9r83i.IAuthTabCallback_Parcel(), r8lambdajessrut1rsucu58dobbvg9r83i.isEngagementSignalsApiAvailable(), r8lambdajessrut1rsucu58dobbvg9r83i.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6));
            boolean z = (i10 & 112) == 32;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallback(i2, r8lambdawxvv9xwdigsnld64xj_ruham57m, interfaceDescriptor);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            }
            component5 component5Var = (component5) objOnMinimized2;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                int i13 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-394790159);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                final r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4 = (r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4) it.next();
                final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted() < i ? r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Completed : r8lambdassqb2xj0cb4hmaszlgbm3t5xht4.onWarmupCompleted() == i ? r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active : r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Upcoming;
                setPostviewFormatSelector.onNavigationEvent(r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.onWarmupCompleted().onExtraCallback(new r8lambdalBPysS0CPqCWn6NRPDKJD1o6so(null, false, 0.0f, i2, 7, null)), ForwardingCameraControl.onExtraCallback(-1892176575, true, new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i14 = 2 % 2;
                        int i15 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        Unit unit = (Unit) r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(-272189663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 272189663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                        int i17 = onExtraCallbackWithResult + 123;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallbackWithResult + 23;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = i;
                    if (i16 != 0) {
                        int i18 = i2;
                        List list2 = list;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        int i19 = i3;
                        int iIntValue = ((Integer) obj3).intValue();
                        return (Unit) r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onWarmupCompleted(922571472, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i17), Integer.valueOf(i18), list2, quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda02, Integer.valueOf(i19), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -922571467, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    }
                    int i20 = i2;
                    List list3 = list;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                    int i21 = i3;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        int i14 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i14 % 128;
        int i15 = i14 % 2;
    }

    private static final Unit onWarmupCompleted(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdacjkj3fyaityxmdlou1fsameeiu, "");
        r8lambdaAbqaGYcW2nBV78zvW6SS4TA90 r8lambdaabqagycw2nbv78zvw6ss4ta90 = r8lambdaAbqaGYcW2nBV78zvW6SS4TA90.onExtraCallbackWithResult;
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.IAuthTabCallbackStub());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.access100());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(694270184);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(694270184, i, -1, "im.toss.tds.compose.component.compound.progressstepper.Compact3StepsPreview (TdsCompactProgressStepperV1.kt:286)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 25;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnNavigationEvent = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onNavigationEvent((r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU) obj);
                        if (i7 != 0) {
                            int i8 = 57 / 0;
                        }
                        int i9 = onExtraCallback + 87;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{1, quirksExternalSyntheticBackport0OnExtraCallback, null, true, false, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 20}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.TdsCompactProgressStepperV1Kt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnExtraCallback;
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 7;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        unitOnExtraCallback = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onExtraCallback(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i9 = 57 / 0;
                    } else {
                        unitOnExtraCallback = r8lambdaKzZvO1SAp_Z0sJqUZT6sHD27f0c.onExtraCallback(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i10 = onExtraCallback + 33;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        int i7 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 19 / 0;
        }
    }

    private static final Unit onTransact(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdacjkj3fyaityxmdlou1fsameeiu, "");
        r8lambdaAbqaGYcW2nBV78zvW6SS4TA90 r8lambdaabqagycw2nbv78zvw6ss4ta90 = r8lambdaAbqaGYcW2nBV78zvW6SS4TA90.onExtraCallbackWithResult;
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.onExtraCallback());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.IAuthTabCallbackStubProxy());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.onNavigationEvent());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.asInterface());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r0
      0x0029: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r0
      0x0027: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-452270329);
            int i4 = 13 / 0;
            z = i != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-452270329);
            if (i != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-452270329, i, -1, "im.toss.tds.compose.component.compound.progressstepper.Compact4StepsPreview (TdsCompactProgressStepperV1.kt:300)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda10();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{2, quirksExternalSyntheticBackport0OnExtraCallback, null, true, false, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 20}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda11(i));
        }
    }

    private static final Unit IAuthTabCallbackStub(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdacjkj3fyaityxmdlou1fsameeiu, "");
        r8lambdaAbqaGYcW2nBV78zvW6SS4TA90 r8lambdaabqagycw2nbv78zvw6ss4ta90 = r8lambdaAbqaGYcW2nBV78zvW6SS4TA90.onExtraCallbackWithResult;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback((getBacktraceNote) r8lambdaAbqaGYcW2nBV78zvW6SS4TA90.IAuthTabCallback(-1778220054, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{r8lambdaabqagycw2nbv78zvw6ss4ta90}, 1778220059, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2));
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.onTransact());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.IAuthTabCallbackDefault());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.IAuthTabCallback());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1598810842);
        if (i != 0) {
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i7 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1598810842, i, -1, "im.toss.tds.compose.component.compound.progressstepper.Compact5StepsPreview (TdsCompactProgressStepperV1.kt:315)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1598810842, i, -1, "im.toss.tds.compose.component.compound.progressstepper.Compact5StepsPreview (TdsCompactProgressStepperV1.kt:315)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda0();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{0, quirksExternalSyntheticBackport0OnExtraCallback, null, true, false, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 20}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 60 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda1(i));
        }
    }

    private static final Unit asBinder(r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU r8lambdacjkj3fyaityxmdlou1fsameeiu) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdacjkj3fyaityxmdlou1fsameeiu, "");
        r8lambdaAbqaGYcW2nBV78zvW6SS4TA90 r8lambdaabqagycw2nbv78zvw6ss4ta90 = r8lambdaAbqaGYcW2nBV78zvW6SS4TA90.onExtraCallbackWithResult;
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.IAuthTabCallback_Parcel());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.access000());
        r8lambdacjkj3fyaityxmdlou1fsameeiu.IAuthTabCallback(r8lambdaabqagycw2nbv78zvw6ss4ta90.getInterfaceDescriptor());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1703768317);
        if (i != 0) {
            int i5 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1703768317, i, -1, "im.toss.tds.compose.component.compound.progressstepper.CompactNoLabelPreview (TdsCompactProgressStepperV1.kt:331)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda4();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{1, quirksExternalSyntheticBackport0OnExtraCallback, null, false, false, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196662, 28}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsCompactProgressStepperV1Kt$.ExternalSyntheticLambda5(i));
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-272189663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 272189663, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(int i, int i2, List list, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onWarmupCompleted(922571472, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2), list, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -922571467, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(889364379, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -889364373, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, List list, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onWarmupCompleted(-1824290526, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2), list, Boolean.valueOf(z), quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1824290527, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(-1618835871, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1618835875, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1133227257, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1133227260, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(r8lambdassQB2Xj0cB4hMaSZLGBM3T5xhT4 r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-965844751, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{r8lambdassqb2xj0cb4hmaszlgbm3t5xht4, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 965844758, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static final void onExtraCallback(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaPn1mwPUDvOCFmqcO_sSvSBFquac.IAuthTabCallback iAuthTabCallback, boolean z, boolean z2, @NotNull Function1<? super r8lambdacjkJ3fYaItyXMDlou1fsAmeEIU<r8lambdaTuSkhC09A81B66TebS9EtGm9W9U>, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        onWarmupCompleted(1971588051, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Integer.valueOf(i), quirksExternalSyntheticBackport0, iAuthTabCallback, Boolean.valueOf(z), Boolean.valueOf(z2), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1971588049, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
