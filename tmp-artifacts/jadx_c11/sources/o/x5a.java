package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.semantics.Role;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import o.w5a;
import o.x5;
import o.x5a;
import o.x5b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x5a {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[x5.IAuthTabCallback.values().length];
            try {
                iArr[x5.IAuthTabCallback.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x5.IAuthTabCallback.Right.ordinal()] = 2;
                int i = onExtraCallback + 105;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i3 = onExtraCallbackWithResult + 53;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsInterface = asInterface(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        int i6 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitAsInterface;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1562141504, objArr, iOnExtraCallbackWithResult, 1562141512, iOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        getInterfaceDescriptor(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit access100(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        access100(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        x5.IAuthTabCallback iAuthTabCallback = (x5.IAuthTabCallback) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        x5.onExtraCallbackWithResult onextracallbackwithresult = (x5.onExtraCallbackWithResult) objArr[5];
        Function2 function2 = (Function2) objArr[6];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(iAuthTabCallback, quirksExternalSyntheticBackport0, fFloatValue, onwarmupcompleted, function0, onextracallbackwithresult, function2, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -861630812, new Object[]{str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, lt.40.onExtraCallbackWithResult(), 861630813, lt.40.onExtraCallbackWithResult());
            int i4 = 19 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -861630812, new Object[]{str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, lt.40.onExtraCallbackWithResult(), 861630813, lt.40.onExtraCallbackWithResult());
        }
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x5.onExtraCallbackWithResult onextracallbackwithresult, Function2 function2, Function0 function0, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, float f, x5.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -538499776, new Object[]{quirksExternalSyntheticBackport0, onextracallbackwithresult, function2, function0, onwarmupcompleted, Float.valueOf(f), iAuthTabCallback, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, lt.40.onExtraCallbackWithResult(), 538499782, lt.40.onExtraCallbackWithResult());
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(x5.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, Function0 function0, x5.onExtraCallbackWithResult onextracallbackwithresult, Function2 function2, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1856424302, new Object[]{iAuthTabCallback, quirksExternalSyntheticBackport0, Float.valueOf(f), onwarmupcompleted, function0, onextracallbackwithresult, function2, getbacktracenote, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, lt.40.onExtraCallbackWithResult(), -1856424297, lt.40.onExtraCallbackWithResult());
        int i7 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = (~(i7 | (~i4) | i3)) | (~(i8 | i7 | i4));
        int i11 = (~(i4 | i3)) | (~(i5 | i3));
        int i12 = i5 + i3 + i6 + ((-1520811122) * i2) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i5) - 1254686720) + (875799021 * i3) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i6) + ((-206831616) * i2) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i5 * (-660833811)) - 1995073173) + (i3 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i6 * (-660833671)) + (i2 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        switch (i14 + (i15 * i15 * 814809088)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 57 / 0;
        }
        int i7 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, GraphicDeviceInfo graphicDeviceInfo, long j, x5b x5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(str, graphicDeviceInfo, j, x5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, graphicDeviceInfo, j, x5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, GraphicDeviceInfo graphicDeviceInfo, long j, x7 x7Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(str, graphicDeviceInfo, j, x7Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, graphicDeviceInfo, j, x7Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, x5b x5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, x5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStubProxy(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStubProxy(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x5.IAuthTabCallback iAuthTabCallback, RowScope rowScope, float f, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallback, rowScope, f, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(x5.IAuthTabCallback iAuthTabCallback, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(iAuthTabCallback, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        if (i5 == 0) {
            onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1011403869, objArr, iOnExtraCallbackWithResult, -1011403860, iOnExtraCallbackWithResult2);
        } else {
            onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1011403869, objArr, iOnExtraCallbackWithResult, -1011403860, iOnExtraCallbackWithResult2);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access100(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            obj.hashCode();
            throw null;
        }
        Unit unitAccess100 = access100(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAccess100;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 6 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -701680815, objArr, iOnExtraCallbackWithResult, 701680818, iOnExtraCallbackWithResult2);
        int i5 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallbackWithResult(@NotNull x5.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable String str2, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, float f, @Nullable Function0<Unit> function0, @Nullable x5.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str3;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo3;
        Function0<Unit> function02;
        x5.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if ((i3 & 2) != 0) {
            int i7 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i9 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 86 / 0;
            }
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i3 & 8) != 0) {
            int i11 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        Object obj = null;
        if ((i3 & 16) != 0) {
            int i13 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo;
        }
        String str4 = (i3 & 32) == 0 ? str2 : "";
        long jOnTransact2 = (i3 & 64) != 0 ? setByteOrder.Companion.onTransact() : j2;
        GraphicDeviceInfo graphicDeviceInfo4 = (i3 & 128) != 0 ? null : graphicDeviceInfo2;
        float fOnExtraCallbackWithResult = (i3 & 256) != 0 ? x4a.IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback) : f;
        Function0<Unit> function03 = (i3 & 512) != 0 ? null : function0;
        if ((i3 & 1024) != 0) {
            int i14 = onExtraCallbackWithResult + 57;
            function02 = function03;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                onextracallbackwithresultOnWarmupCompleted = x5.onExtraCallbackWithResult.Companion.onWarmupCompleted();
                int i15 = 75 / 0;
            } else {
                onextracallbackwithresultOnWarmupCompleted = x5.onExtraCallbackWithResult.Companion.onWarmupCompleted();
            }
        } else {
            function02 = function03;
            onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
        }
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2IAuthTabCallbackDefault = (i3 & 2048) != 0 ? x4b.onWarmupCompleted.IAuthTabCallbackDefault() : function2;
        if ((i3 & 4096) != 0) {
            int i16 = IAuthTabCallback + 69;
            function22 = function2IAuthTabCallbackDefault;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0) {
                QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                throw null;
            }
            onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
        } else {
            function22 = function2IAuthTabCallbackDefault;
            onwarmupcompletedIAuthTabCallbackDefault = onwarmupcompleted;
        }
        x5.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresultOnWarmupCompleted;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1295885325, i, i2, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1 (TdsTableRowV1.kt:116)");
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1653319616, true, new TdsTableRowV1Kt$.ExternalSyntheticLambda1(str3, graphicDeviceInfo3, jOnTransact), cameraCaptureResultEmptyCameraCaptureResult, 54);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(654328582, true, new TdsTableRowV1Kt$.ExternalSyntheticLambda2(str4, graphicDeviceInfo4, jOnTransact2), cameraCaptureResultEmptyCameraCaptureResult, 54);
        int i17 = i2 << 15;
        onExtraCallbackWithResult(iAuthTabCallback, quirksExternalSyntheticBackport02, fOnExtraCallbackWithResult, onwarmupcompletedIAuthTabCallbackDefault, function02, onextracallbackwithresult2, function22, encoderProfilesProxyVideoProfileProxyOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 18) & 896) | (i & 14) | 113246208 | (i & 112) | ((i2 << 3) & 7168) | ((i >> 15) & 57344) | (458752 & i17) | (3670016 & i17), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onNavigationEvent(String str, GraphicDeviceInfo graphicDeviceInfo, long j, x7 x7Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(x7Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x7Var)) {
                i3 = 4;
            } else {
                int i7 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1653319616, i2, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1.<anonymous> (TdsTableRowV1.kt:126)");
                int i13 = onExtraCallbackWithResult + 67;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            }
            x7Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, graphicDeviceInfo, j, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 18);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, GraphicDeviceInfo graphicDeviceInfo, long j, x5b x5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x5bVar, "");
        Object obj = null;
        boolean z = true;
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x5bVar);
                obj.hashCode();
                throw null;
            }
            i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x5bVar) ^ true) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(654328582, i2, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1.<anonymous> (TdsTableRowV1.kt:133)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(654328582, i2, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1.<anonymous> (TdsTableRowV1.kt:133)");
            }
            x5bVar.onWarmupCompleted(str, null, graphicDeviceInfo, j, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 18);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(x5.IAuthTabCallback iAuthTabCallback, RowScope rowScope, float f, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        QuirkSettingsLoader quirkSettingsLoaderAsInterface;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1200256403, i, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTableRowV1.kt:194)");
            }
            int i5 = onWarmupCompleted.IAuthTabCallback[iAuthTabCallback.ordinal()];
            if (i5 == 1) {
                quirkSettingsLoaderAsInterface = QuirkSettingsLoader.Companion.asInterface();
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                quirkSettingsLoaderAsInterface = QuirkSettingsLoader.Companion.IAuthTabCallbackStub();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScope, QuirksExternalSyntheticBackport0.Companion, 1.0f - f, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderAsInterface, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            Object obj = null;
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i7 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
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
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback.ordinal());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i9 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new x5b(iAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getbacktracenote.invoke((x5b) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Integer num;
        boolean z;
        final x5.IAuthTabCallback iAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        x5.onExtraCallbackWithResult onextracallbackwithresult = (x5.onExtraCallbackWithResult) objArr[1];
        Function2 function2 = (Function2) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[4];
        final float fFloatValue = ((Number) objArr[5]).floatValue();
        x5.IAuthTabCallback iAuthTabCallback2 = (x5.IAuthTabCallback) objArr[6];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            num = 1;
            if ((iIntValue & 3) != 4) {
                int i3 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } else if ((iIntValue & 3) != 2) {
            num = 0;
            int i32 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i32 % 128;
            int i42 = i32 % 2;
            z = true;
        } else {
            num = 0;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1856194247, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1.<anonymous> (TdsTableRowV1.kt:164)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            x5.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted2 = x5.onExtraCallbackWithResult.Companion;
            if (onextracallbackwithresult.IAuthTabCallback(onwarmupcompleted2.IAuthTabCallback())) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-67989188);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, num);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-67949787);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted3.onExtraCallback()) {
                int i7 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                    throw null;
                }
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized, addRewardedAdapter.onWarmupCompleted(0L, RectangleShapeKt.onExtraCallback(), null, null, 13, null), (setTitleMarginStart) null, false, (String) null, (Role) null, function0, 60, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i9 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirkSettingsLoader quirkSettingsLoaderAsInterface = onextracallbackwithresult2.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, fFloatValue, false, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderAsInterface, false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback2.ordinal());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                iAuthTabCallback = iAuthTabCallback2;
                objOnMinimized2 = new x7(iAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            } else {
                iAuthTabCallback = iAuthTabCallback2;
            }
            getbacktracenote.invoke((x7) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, num);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()), 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, iAuthTabCallback == x5.IAuthTabCallback.Left ? createCameraCaptureCallback.Companion.onExtraCallbackWithResult() : createCameraCaptureCallback.Companion.onExtraCallback(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744447, (Object) null), null, null, null, null, false, ForwardingCameraControl.onExtraCallback(-1200256403, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 107;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnExtraCallbackWithResult = x5a.onExtraCallbackWithResult(iAuthTabCallback, rowScopeInstance, fFloatValue, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = onExtraCallback + 51;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (onextracallbackwithresult.IAuthTabCallback(onwarmupcompleted2.onExtraCallbackWithResult())) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66201604);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, num);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66162203);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0156 A[PHI: r20
      0x0156: PHI (r20v5 boolean) = (r20v4 boolean), (r20v8 boolean) binds: [B:105:0x0154, B:102:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163 A[PHI: r20
      0x0163: PHI (r20v7 boolean) = (r20v4 boolean), (r20v8 boolean) binds: [B:105:0x0154, B:102:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final x5.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, @Nullable Function0<Unit> function0, @Nullable x5.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable getBacktraceNote<? super x7, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super x5b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
        Function0<Unit> function02;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2IAuthTabCallbackStub;
        getBacktraceNote<? super x7, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnExtraCallbackWithResult;
        float fOnExtraCallbackWithResult;
        x5.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final float f3;
        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2;
        final Function0<Unit> function03;
        final x5.onExtraCallbackWithResult onextracallbackwithresult2;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        final getBacktraceNote<? super x7, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final getBacktraceNote<? super x5b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super x5b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteAsBinder = getbacktracenote2;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1622608531);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i15 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                if ((i2 & 4) == 0) {
                    f2 = f;
                    int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 256 : 128;
                    i3 |= i17;
                } else {
                    f2 = f;
                }
                i3 |= i17;
            } else {
                f2 = f;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    int i18 = onExtraCallbackWithResult + 107;
                    IAuthTabCallback = i18 % 128;
                    i3 = i18 % 2 != 0 ? i3 | 13989 : i3 | 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((i & 1572864) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            int i19 = IAuthTabCallback + 63;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                int i21 = IAuthTabCallback + 7;
                                onExtraCallbackWithResult = i21 % 128;
                                if (i21 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote);
                                    throw null;
                                }
                                i9 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 8388608 : 4194304) | i3;
                            }
                            i10 = i2 & 256;
                            if (i10 != 0) {
                                if ((i & 100663296) == 0) {
                                    int i22 = IAuthTabCallback + 75;
                                    onExtraCallbackWithResult = i22 % 128;
                                    if (i22 % 2 == 0) {
                                        z = false;
                                        int i23 = 15 / 0;
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteAsBinder)) {
                                            int i24 = onExtraCallbackWithResult + 35;
                                            IAuthTabCallback = i24 % 128;
                                            int i25 = i24 % 2;
                                            i11 = 67108864;
                                        } else {
                                            i11 = 33554432;
                                        }
                                    } else {
                                        z = false;
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteAsBinder)) {
                                        }
                                    }
                                    i12 = i11 | i9;
                                }
                                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    onwarmupcompleted2 = onwarmupcompleted;
                                    function03 = function0;
                                    onextracallbackwithresult2 = onextracallbackwithresult;
                                    getbacktracenote3 = getbacktracenote;
                                    getbacktracenote4 = getbacktracenoteAsBinder;
                                    f3 = f2;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    function22 = function2;
                                } else {
                                    int i26 = onExtraCallbackWithResult + 75;
                                    IAuthTabCallback = i26 % 128;
                                    if (i26 % 2 != 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                        if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i2 & 4) != 0) {
                                                i12 &= -897;
                                            }
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            onwarmupcompletedIAuthTabCallbackDefault = onwarmupcompleted;
                                            function02 = function0;
                                            function2IAuthTabCallbackStub = function2;
                                            getbacktracenoteOnExtraCallbackWithResult = getbacktracenote;
                                            fOnExtraCallbackWithResult = f2;
                                            onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                                        }
                                        final getBacktraceNote<? super x5b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = getbacktracenoteAsBinder;
                                        final getBacktraceNote<? super x7, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenoteOnExtraCallbackWithResult;
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                        final float f4 = fOnExtraCallbackWithResult;
                                        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedIAuthTabCallbackDefault;
                                        final x5.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                                        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23 = function2IAuthTabCallbackStub;
                                        final Function0<Unit> function04 = function02;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1622608531, i12, -1, "im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1 (TdsTableRowV1.kt:154)");
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 0L, isRepeatingEnabled.onExtraCallback.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), null, dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), 0.0f, 0, 0, ConnectionPool.onWarmupCompleted.onNavigationEvent(), null, 23, null), null, null, false, ForwardingCameraControl.onExtraCallback(1856194247, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda11
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj, Object obj2) {
                                                int i27 = 2 % 2;
                                                int i28 = onExtraCallback + 51;
                                                IAuthTabCallback = i28 % 128;
                                                int i29 = i28 % 2;
                                                Unit unitOnExtraCallback = x5a.onExtraCallback(quirksExternalSyntheticBackport04, onextracallbackwithresult3, function23, function04, onwarmupcompleted3, f4, iAuthTabCallback, getbacktracenote6, getbacktracenote5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                                int i30 = IAuthTabCallback + 59;
                                                onExtraCallback = i30 % 128;
                                                if (i30 % 2 == 0) {
                                                    int i31 = 17 / 0;
                                                }
                                                return unitOnExtraCallback;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1572864, 58);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                        f3 = f4;
                                        onwarmupcompleted2 = onwarmupcompleted3;
                                        function03 = function04;
                                        onextracallbackwithresult2 = onextracallbackwithresult3;
                                        function22 = function23;
                                        getbacktracenote3 = getbacktracenote6;
                                        getbacktracenote4 = getbacktracenote5;
                                    }
                                    quirksExternalSyntheticBackport02 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    if ((i2 & 4) != 0) {
                                        fOnExtraCallbackWithResult = x4a.IAuthTabCallback.onExtraCallbackWithResult(iAuthTabCallback);
                                        i12 &= -897;
                                    } else {
                                        fOnExtraCallbackWithResult = f2;
                                    }
                                    onwarmupcompletedIAuthTabCallbackDefault = i4 != 0 ? QuirkSettingsLoader.Companion.IAuthTabCallbackDefault() : onwarmupcompleted;
                                    function02 = i5 == 0 ? function0 : null;
                                    onextracallbackwithresultOnWarmupCompleted = i6 != 0 ? x5.onExtraCallbackWithResult.Companion.onWarmupCompleted() : onextracallbackwithresult;
                                    function2IAuthTabCallbackStub = i7 != 0 ? x4b.onWarmupCompleted.IAuthTabCallbackStub() : function2;
                                    getbacktracenoteOnExtraCallbackWithResult = i8 != 0 ? x4b.onWarmupCompleted.onExtraCallbackWithResult() : getbacktracenote;
                                    if (i10 != 0) {
                                        getbacktracenoteAsBinder = x4b.onWarmupCompleted.asBinder();
                                    }
                                    final getBacktraceNote getbacktracenote52 = getbacktracenoteAsBinder;
                                    final getBacktraceNote getbacktracenote62 = getbacktracenoteOnExtraCallbackWithResult;
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport02;
                                    final float f42 = fOnExtraCallbackWithResult;
                                    final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted32 = onwarmupcompletedIAuthTabCallbackDefault;
                                    final x5.onExtraCallbackWithResult onextracallbackwithresult32 = onextracallbackwithresultOnWarmupCompleted;
                                    final Function2 function232 = function2IAuthTabCallbackStub;
                                    final Function0 function042 = function02;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 0L, isRepeatingEnabled.onExtraCallback.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), null, dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), 0.0f, 0, 0, ConnectionPool.onWarmupCompleted.onNavigationEvent(), null, 23, null), null, null, false, ForwardingCameraControl.onExtraCallback(1856194247, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda11
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallback + 51;
                                            IAuthTabCallback = i28 % 128;
                                            int i29 = i28 % 2;
                                            Unit unitOnExtraCallback = x5a.onExtraCallback(quirksExternalSyntheticBackport042, onextracallbackwithresult32, function232, function042, onwarmupcompleted32, f42, iAuthTabCallback, getbacktracenote62, getbacktracenote52, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i30 = IAuthTabCallback + 59;
                                            onExtraCallback = i30 % 128;
                                            if (i30 % 2 == 0) {
                                                int i31 = 17 / 0;
                                            }
                                            return unitOnExtraCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1572864, 58);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport042;
                                    f3 = f42;
                                    onwarmupcompleted2 = onwarmupcompleted32;
                                    function03 = function042;
                                    onextracallbackwithresult2 = onextracallbackwithresult32;
                                    function22 = function232;
                                    getbacktracenote3 = getbacktracenote62;
                                    getbacktracenote4 = getbacktracenote52;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda12
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallbackWithResult + 119;
                                            IAuthTabCallback = i28 % 128;
                                            int i29 = i28 % 2;
                                            Unit unitOnExtraCallback = x5a.onExtraCallback(iAuthTabCallback, quirksExternalSyntheticBackport03, f3, onwarmupcompleted2, function03, onextracallbackwithresult2, function22, getbacktracenote3, getbacktracenote4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i30 = onExtraCallbackWithResult + 111;
                                            IAuthTabCallback = i30 % 128;
                                            int i31 = i30 % 2;
                                            return unitOnExtraCallback;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 |= 100663296;
                            z = false;
                            i12 = i9;
                            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i9 = i3;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        z = false;
                        i12 = i9;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    z = false;
                    i12 = i9;
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i3;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                z = false;
                i12 = i9;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i3;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            z = false;
            i12 = i9;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i3;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        z = false;
        i12 = i9;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i12) != 38347922 ? true : z, i12 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1499660084);
        if (iIntValue != 0) {
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1))) {
            int i6 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1499660084, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.Preview (TdsTableRowV1.kt:218)");
                    int i9 = 39 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1499660084, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.Preview (TdsTableRowV1.kt:218)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) x4b.onWarmupCompleted.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i12 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda17
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i14 = 2 % 2;
                int i15 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnWarmupCompleted = x5a.onWarmupCompleted(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i17 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                return unitOnWarmupCompleted;
            }
        });
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        x5.IAuthTabCallback iAuthTabCallback = (x5.IAuthTabCallback) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(40491688, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.RatioPreview.RatioPreviewItem (TdsTableRowV1.kt:251)");
                int i3 = 75 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(40491688, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.RatioPreview.RatioPreviewItem (TdsTableRowV1.kt:251)");
            }
        }
        x4b x4bVar = x4b.onWarmupCompleted;
        getBacktraceNote<x7, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallback_Parcel = x4bVar.IAuthTabCallback_Parcel();
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        onExtraCallbackWithResult(iAuthTabCallback, null, fFloatValue, null, null, null, null, getbacktracenoteIAuthTabCallback_Parcel, (getBacktraceNote) x4b.onWarmupCompleted(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1585009895, new Object[]{x4bVar}, 1585009901, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 14) | 113246208 | ((iIntValue << 3) & 896), 122);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    private static final Unit IAuthTabCallback(x5.IAuthTabCallback iAuthTabCallback, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 19) == 18), i & 1)) {
            int i6 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-546875926, i, -1, "im.toss.tds.compose.component.compound.tablerow.RatioPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTableRowV1.kt:277)");
                int i10 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            w5aVar.onExtraCallbackWithResult(iAuthTabCallback.toString(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        boolean z = true;
        int i6 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(i5 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 4, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-385290747, i, -1, "im.toss.tds.compose.component.compound.tablerow.RatioPreview.<anonymous> (TdsTableRowV1.kt:270)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-243252674);
            for (final x5.IAuthTabCallback iAuthTabCallback : CollectionsKt.listOf(new x5.IAuthTabCallback[]{x5.IAuthTabCallback.Left, x5.IAuthTabCallback.Right})) {
                int i7 = i6;
                boolean z2 = z;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-546875926, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 81;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnNavigationEvent = x5a.onNavigationEvent(iAuthTabCallback, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        if (i10 != 0) {
                            int i11 = 43 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), w3a.onNavigationEvent(w3a.onWarmupCompleted, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 65532);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-243243977);
                IntIterator it = new IntRange(2, 5).iterator();
                while (it.hasNext()) {
                    int i8 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 280532433, new Object[]{iAuthTabCallback, Float.valueOf(it.nextInt() / 10.0f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i7)}, lt.40.onExtraCallbackWithResult(), -280532433, lt.40.onExtraCallbackWithResult());
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i3 = 2;
                i6 = i7;
                z = z2;
            }
            i2 = i3;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % i2;
            }
        } else {
            i2 = 2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % i2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1743985571);
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1743985571, i, -1, "im.toss.tds.compose.component.compound.tablerow.RatioPreview (TdsTableRowV1.kt:246)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-385290747, false, new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 85;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                    if (i8 != 0) {
                        return (Unit) x5a.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1628816642, objArr, iOnExtraCallbackWithResult, 1628816644, iOnExtraCallbackWithResult2);
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 73;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                    Unit unit = (Unit) x5a.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1110688209, objArr, iOnExtraCallbackWithResult, 1110688216, iOnExtraCallbackWithResult2);
                    int i10 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unit;
                }
            });
        }
    }

    private static final void onWarmupCompleted(QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(882018047, i, -1, "im.toss.tds.compose.component.compound.tablerow.VerticalAlignmentPreview.VerticalAlignmentPreviewItem (TdsTableRowV1.kt:298)");
            int i5 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        x5.IAuthTabCallback iAuthTabCallback = x5.IAuthTabCallback.Left;
        x4b x4bVar = x4b.onWarmupCompleted;
        onExtraCallbackWithResult(iAuthTabCallback, null, 0.0f, onwarmupcompleted, null, null, null, x4bVar.onTransact(), x4bVar.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 113246214, 118);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        boolean z = false;
        String str = (String) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i5 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i5 % 128;
                i = 4;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 4;
                }
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i7 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(678158735, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.VerticalAlignmentPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTableRowV1.kt:331)");
            }
            w5aVar.onExtraCallbackWithResult(str, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStubProxy(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        char c = 2;
        int i2 = 2 % 2;
        boolean z2 = true;
        int i3 = 0;
        if ((i & 3) != 2) {
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1151542333, i, -1, "im.toss.tds.compose.component.compound.tablerow.VerticalAlignmentPreview.<anonymous> (TdsTableRowV1.kt:323)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i8 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1499872901);
            for (Pair pair : CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback("Top", onextracallbackwithresult.access000()), getWrite.IAuthTabCallback("CenterVertically", onextracallbackwithresult.IAuthTabCallbackDefault()), getWrite.IAuthTabCallback("Bottom", onextracallbackwithresult.onExtraCallbackWithResult())})) {
                final String str = (String) pair.onExtraCallbackWithResult();
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) pair.IAuthTabCallback();
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(678158735, z2, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda18
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onExtraCallback + 39;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnExtraCallback = x5a.onExtraCallback(str, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        if (i12 == 0) {
                            int i13 = 3 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), w3a.onNavigationEvent(w3a.onWarmupCompleted, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 65532);
                onWarmupCompleted(onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i3 = 0;
                z2 = z2;
                c = c;
            }
            int i10 = i3;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 14 / i10;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void access100(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-483783141);
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-483783141, i, -1, "im.toss.tds.compose.component.compound.tablerow.VerticalAlignmentPreview (TdsTableRowV1.kt:294)");
                int i5 = onExtraCallbackWithResult + 71;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1151542333, false, new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallbackWithResult = x5a.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda16
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 47;
                    onExtraCallback = i8 % 128;
                    Object obj3 = null;
                    if (i8 % 2 == 0) {
                        int i9 = i;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr = {Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                        obj3.hashCode();
                        throw null;
                    }
                    int i10 = i;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object[] objArr2 = {Integer.valueOf(i10), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                    int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
                    Unit unit = (Unit) x5a.onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 248380901, objArr2, iOnExtraCallbackWithResult3, -248380897, iOnExtraCallbackWithResult4);
                    int i11 = onWarmupCompleted + 75;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            });
        }
    }

    private static final void onWarmupCompleted(String str, x5.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final String str2;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 4;
            }
            str2 = "Contents";
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1260478160, i, -1, "im.toss.tds.compose.component.compound.tablerow.SectionPreview.SectionPreviewItem (TdsTableRowV1.kt:350)");
        }
        onExtraCallbackWithResult(x5.IAuthTabCallback.Left, null, 0.0f, null, null, onextracallbackwithresult, null, x4b.onWarmupCompleted.asInterface(), ForwardingCameraControl.onExtraCallback(84365309, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallbackWithResult = x5a.onExtraCallbackWithResult(str2, (x5b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i10 != 0) {
                    int i11 = 59 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 458752) | 113246214, 94);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, x5b x5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(x5bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x5bVar) ? 4 : 2);
            int i6 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 68 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(84365309, i2, -1, "im.toss.tds.compose.component.compound.tablerow.SectionPreview.SectionPreviewItem.<anonymous> (TdsTableRowV1.kt:358)");
                }
                x5bVar.onWarmupCompleted(str, null, null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                x5bVar.onWarmupCompleted(str, null, null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(494206059, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.SectionPreview.<anonymous> (TdsTableRowV1.kt:365)");
                int i4 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                int i6 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-415998954);
            x5.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted = x5.onExtraCallbackWithResult.Companion;
            Iterator it = CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback("None", onwarmupcompleted.onWarmupCompleted()), getWrite.IAuthTabCallback("Top", onwarmupcompleted.IAuthTabCallback()), getWrite.IAuthTabCallback("Bottom", onwarmupcompleted.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("Both", onwarmupcompleted.onExtraCallback())}).iterator();
            while (it.hasNext()) {
                int i8 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    Pair pair = (Pair) it.next();
                    onWarmupCompleted((String) pair.onExtraCallbackWithResult(), (x5.onExtraCallbackWithResult) pair.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                } else {
                    Pair pair2 = (Pair) it.next();
                    onWarmupCompleted((String) pair2.onExtraCallbackWithResult(), (x5.onExtraCallbackWithResult) pair2.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i9 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i11 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    int i12 = 15 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            x5.onExtraCallbackWithResult.onWarmupCompleted onwarmupcompleted2 = x5.onExtraCallbackWithResult.Companion;
            onWarmupCompleted(null, onwarmupcompleted2.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 48, 1);
            onWarmupCompleted(null, onwarmupcompleted2.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 48, 1);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r6
      0x0025: PHI (r6v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
      0x0023: PHI (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getInterfaceDescriptor(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(458538179);
            int i4 = 82 / 0;
            z = i != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(458538179);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(458538179, i, -1, "im.toss.tds.compose.component.compound.tablerow.SectionPreview (TdsTableRowV1.kt:345)");
                int i6 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(494206059, false, new TdsTableRowV1Kt$.ExternalSyntheticLambda9(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = 12 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTableRowV1Kt$.ExternalSyntheticLambda10(i));
        }
    }

    private static final void IAuthTabCallback(QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(846947561, i, -1, "im.toss.tds.compose.component.compound.tablerow.CustomBackgroundPreview.VerticalAlignmentPreviewItem (TdsTableRowV1.kt:399)");
        }
        x5.IAuthTabCallback iAuthTabCallback = x5.IAuthTabCallback.Left;
        x4b x4bVar = x4b.onWarmupCompleted;
        getBacktraceNote<x7, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallback = x4bVar.onExtraCallback();
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        onExtraCallbackWithResult(iAuthTabCallback, null, 0.0f, onwarmupcompleted, null, null, null, getbacktracenoteOnExtraCallback, (getBacktraceNote) x4b.onWarmupCompleted(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1260111506, new Object[]{x4bVar}, -1260111498, ACPayResult.onWarmupCompleted(), iOnWarmupCompleted), cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 113246214, 118);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-406554535, i, -1, "im.toss.tds.compose.component.compound.tablerow.CustomBackgroundPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTableRowV1.kt:432)");
            }
            w5aVar.onExtraCallbackWithResult(str, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        char c = 2;
        int i2 = 2 % 2;
        boolean z2 = true;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1435408475, i, -1, "im.toss.tds.compose.component.compound.tablerow.CustomBackgroundPreview.<anonymous> (TdsTableRowV1.kt:424)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = IAuthTabCallback + 77;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1751799355);
            for (Pair pair : CollectionsKt.listOf(new Pair[]{getWrite.IAuthTabCallback("Top", onextracallbackwithresult.access000()), getWrite.IAuthTabCallback("CenterVertically", onextracallbackwithresult.IAuthTabCallbackDefault()), getWrite.IAuthTabCallback("Bottom", onextracallbackwithresult.onExtraCallbackWithResult())})) {
                String str = (String) pair.onExtraCallbackWithResult();
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) pair.IAuthTabCallback();
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-406554535, z2, new TdsTableRowV1Kt$.ExternalSyntheticLambda14(str), cameraCaptureResultEmptyCameraCaptureResult2, 54), w3a.onNavigationEvent(w3a.onWarmupCompleted, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 7, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 65532);
                IAuthTabCallback(onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                z2 = z2;
                c = c;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-444036531);
        if (i != 0) {
            int i3 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-444036531, i, -1, "im.toss.tds.compose.component.compound.tablerow.CustomBackgroundPreview (TdsTableRowV1.kt:395)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1435408475, false, new TdsTableRowV1Kt$.ExternalSyntheticLambda6(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTableRowV1Kt$.ExternalSyntheticLambda7(i));
            int i7 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(677580955);
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            int i2 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(677580955, iIntValue, -1, "im.toss.tds.compose.component.compound.tablerow.CustomPreview (TdsTableRowV1.kt:446)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) x4b.onWarmupCompleted(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 190181450, new Object[]{x4b.onWarmupCompleted}, -190181441, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tablerow.TdsTableRowV1Kt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 51;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        x5a.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnNavigationEvent = x5a.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i6 = onExtraCallback + 17;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 248380901, objArr, iOnExtraCallbackWithResult, -248380897, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1628816642, objArr, iOnExtraCallbackWithResult, 1628816644, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1110688209, objArr, iOnExtraCallbackWithResult, 1110688216, iOnExtraCallbackWithResult2);
    }

    private static final void asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -1562141504, objArr, iOnExtraCallbackWithResult, 1562141512, iOnExtraCallbackWithResult2);
    }

    private static final void IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1011403869, objArr, iOnExtraCallbackWithResult, -1011403860, iOnExtraCallbackWithResult2);
    }

    private static final void onExtraCallbackWithResult(x5.IAuthTabCallback iAuthTabCallback, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 280532433, objArr, iOnExtraCallbackWithResult, -280532433, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback_Parcel(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -701680815, objArr, iOnExtraCallbackWithResult, 701680818, iOnExtraCallbackWithResult2);
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x5.onExtraCallbackWithResult onextracallbackwithresult, Function2 function2, Function0 function0, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, float f, x5.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, onextracallbackwithresult, function2, function0, onwarmupcompleted, Float.valueOf(f), iAuthTabCallback, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -538499776, objArr, iOnExtraCallbackWithResult, 538499782, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallback(x5.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, Function0 function0, x5.onExtraCallbackWithResult onextracallbackwithresult, Function2 function2, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {iAuthTabCallback, quirksExternalSyntheticBackport0, Float.valueOf(f), onwarmupcompleted, function0, onextracallbackwithresult, function2, getbacktracenote, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 1856424302, objArr, iOnExtraCallbackWithResult, -1856424297, iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), -861630812, objArr, iOnExtraCallbackWithResult, 861630813, iOnExtraCallbackWithResult2);
    }
}
