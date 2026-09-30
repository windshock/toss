package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getStreamSharingChildren;
import o.getSupportedHighSpeedResolutionsFor;
import o.readFully;
import o.setContentInsetsRelative;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.v6;
import o.v6a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v6 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        if (i5 != 0) {
            onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1855471633, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1855471620, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        } else {
            onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1855471633, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1855471620, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, setContentInsetsRelative setcontentinsetsrelative, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(j, setcontentinsetsrelative, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setContentInsetsRelative setcontentinsetsrelative, Function2 function2, Function2 function22, long j, getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setcontentinsetsrelative, function2, function22, j, getbacktracenote, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 45;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback4 = ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(objArr2, iIAuthTabCallback, -1782715482, iIAuthTabCallback3, iIAuthTabCallback4, 1782715493, iIAuthTabCallback2);
        int i4 = onNavigationEvent + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        asInterface(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -701871507, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 701871509, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static final Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i))}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1774170472, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1774170477, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        } else {
            onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1774170472, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1774170477, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 63;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(Function0 function0, getBacktraceNote getbacktracenote, Function2 function2, Function2 function22, setContentInsetsRelative setcontentinsetsrelative, v6a.IAuthTabCallback iAuthTabCallback, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(new Object[]{function0, getbacktracenote, function2, function22, setcontentinsetsrelative, iAuthTabCallback, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        } else {
            onWarmupCompleted(new Object[]{function0, getbacktracenote, function2, function22, setcontentinsetsrelative, iAuthTabCallback, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 != 0) {
            return (Unit) onWarmupCompleted(objArr, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1617445549, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1617445549, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 45;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 18 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, setContentInsetsRelative setcontentinsetsrelative, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, setcontentinsetsrelative, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setContentInsetsRelative setcontentinsetsrelative, Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setcontentinsetsrelative, function2, function22, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            asInterface(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1652470189, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1652470203, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor);
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return writeTypedObject(getsupportedhighspeedresolutionsfor);
        }
        writeTypedObject(getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(getsupportedhighspeedresolutionsfor);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i);
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i2));
        int i12 = i9 | i5;
        int i13 = (~i10) | i2;
        int i14 = i2 + i5 + i6 + ((-1587644119) * i3) + (1302866265 * i4);
        int i15 = i14 * i14;
        int i16 = (i2 * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i6) + (1500774400 * i3) + ((-1456209920) * i4) + ((-2144468992) * i15);
        int i17 = ((i2 * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i6 * (-855313873)) + (i3 * (-1467678585)) + (i4 * 593082711) + (i15 * 74579968);
        switch (i16 + (i17 * i17 * (-1668153344))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                boolean z = false;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                final int iIntValue = ((Number) objArr[1]).intValue();
                int i18 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-250432900);
                if (iIntValue != 0) {
                    int i19 = onWarmupCompleted + 49;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 == 0) {
                        z = true;
                    }
                } else {
                    int i20 = onNavigationEvent + 71;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
                    int i22 = onWarmupCompleted + 75;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-250432900, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview (TdsDialogV1.kt:352)");
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(523868628, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda29
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 71;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 959000316, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -959000306, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                            int i27 = onExtraCallbackWithResult + 39;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 != 0) {
                                return unit;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
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
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda30
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onNavigationEvent + 107;
                            onExtraCallbackWithResult = i25 % 128;
                            if (i25 % 2 != 0) {
                                v6.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                throw null;
                            }
                            Unit unitOnNavigationEvent = v6.onNavigationEvent(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i26 = onExtraCallbackWithResult + 39;
                            onNavigationEvent = i26 % 128;
                            int i27 = i26 % 2;
                            return unitOnNavigationEvent;
                        }
                    });
                }
                return null;
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 73;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, getBacktraceNote getbacktracenote, Function2 function2, Function2 function22, setContentInsetsRelative setcontentinsetsrelative, v6a.IAuthTabCallback iAuthTabCallback, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, getbacktracenote, function2, function22, setcontentinsetsrelative, iAuthTabCallback, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 37;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -629801713, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 629801719, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
        int i5 = onNavigationEvent + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-116567741, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:92)");
            }
            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.access100(), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i2 = onWarmupCompleted + 17;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 5) == 5) {
            int i5 = i4 + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onWarmupCompleted + 7;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 43;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1177953880, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:106)");
                    int i10 = 66 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1177953880, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:106)");
                }
                int i11 = onNavigationEvent + 11;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(setContentInsetsRelative setcontentinsetsrelative, final Function2 function2, final Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1702583836, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:81)");
                int i3 = onNavigationEvent + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setcontentinsetsrelative, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i5 = onWarmupCompleted + 113;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
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
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda20
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 93;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnNavigationEvent = v6.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                        if (i9 == 0) {
                            int i10 = 95 / 0;
                        }
                        int i11 = onExtraCallback + 101;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 55 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = getExtensionsBeforeInitialized.IAuthTabCallback(onextracallback, true, (Function1) objOnMinimized);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i8 = 79 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
            dispatchPostbackRequest.onNavigationEvent(0.0f, null, 0, connectionPool.onNavigationEvent(), null, ForwardingCameraControl.onExtraCallback(-116567741, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda21
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 41;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1671621758, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1671621765, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                    int i12 = onWarmupCompleted + 97;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196608, 23);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (function2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1369982832);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                dispatchPostbackRequest.onNavigationEvent(0.0f, null, 0, connectionPool.IAuthTabCallback(), null, ForwardingCameraControl.onExtraCallback(1177953880, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda22
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 117;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnWarmupCompleted = v6.onWarmupCompleted(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        if (i11 != 0) {
                            int i12 = 41 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196608, 23);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1369337040);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 15;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onWarmupCompleted + 87;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(long j, setContentInsetsRelative setcontentinsetsrelative, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
        readFully readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(j, 0.0f))}), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L)), 0, 8, (Object) null);
        if (!(!setcontentinsetsrelative.onNavigationEvent())) {
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setOrientationDegrees.onExtraCallback(setorientationdegrees, readfullyOnExtraCallback, 0L, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L)), 0.0f, (hasMoreElements) null, (seek) null, 0, 122, (Object) null);
            int i4 = onWarmupCompleted + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final long j, final setContentInsetsRelative setcontentinsetsrelative, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 51;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1201523771, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:118)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = onNavigationEvent + 11;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelative);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnWarmupCompleted | zOnNavigationEvent)) {
                int i6 = onNavigationEvent + 79;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda14
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj2) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallback + 45;
                            IAuthTabCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                return v6.onExtraCallbackWithResult(j, setcontentinsetsrelative, (setOrientationDegrees) obj2);
                            }
                            int i10 = 60 / 0;
                            return v6.onExtraCallbackWithResult(j, setcontentinsetsrelative, (setOrientationDegrees) obj2);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (!setcontentinsetsrelative.onExtraCallbackWithResult()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(553610103);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i8 = onNavigationEvent + 9;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    int i10 = onWarmupCompleted + 93;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(553323880);
                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onNavigationEvent(), highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BorderDefault, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 6, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onWarmupCompleted + 103;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onWarmupCompleted + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 51;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2121301724, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:146)");
            }
            getbacktracenote.invoke(v5b.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 97;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback implements getCameraUseCases {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        onExtraCallback() {
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(int i, List list, List list2, Ref.IntRef intRef, List list3, long j, long j2, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onNavigationEvent(i, list, list2, intRef, list3, j, j2, i2, onextracallbackwithresult);
            }
            onNavigationEvent(i, list, list2, intRef, list3, j, j2, i2, onextracallbackwithresult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x010d A[PHI: r6
          0x010d: PHI (r6v9 o.getStreamSharingChildren) = (r6v7 o.getStreamSharingChildren), (r6v12 o.getStreamSharingChildren) binds: [B:20:0x010b, B:17:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onNavigationEvent(component4 component4Var, List<? extends List<? extends component7>> list, final long j) {
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
            int i = 2;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            List<? extends component7> list2 = list.get(0);
            final List<? extends component7> list3 = list.get(1);
            List<? extends component7> list4 = list.get(2);
            final int iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f));
            final int iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
            long jIAuthTabCallback = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceAtLeast(VirtualCameraCaptureResult.asInterface(j) - (iOnExtraCallbackWithResult2 << 1), 0), 0, RangesKt.coerceAtLeast(VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) - (iOnExtraCallbackWithResult + iOnExtraCallbackWithResult2), 0), 5, (Object) null);
            final ArrayList arrayList = new ArrayList(list4.size());
            int size = list4.size();
            int iT_ = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    list4.get(i3).onExtraCallback(jIAuthTabCallback).T_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2 = list4.get(i3).onExtraCallback(jIAuthTabCallback);
                if (getstreamsharingchildrenOnExtraCallback2.T_() > iT_) {
                    iT_ = getstreamsharingchildrenOnExtraCallback2.T_();
                }
                arrayList.add(getstreamsharingchildrenOnExtraCallback2);
            }
            final long jIAuthTabCallback2 = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceAtLeast(VirtualCameraCaptureResult.asInterface(j) - (iOnExtraCallbackWithResult << 1), 0), 0, RangesKt.coerceAtLeast(VirtualCameraCaptureResult.IAuthTabCallbackDefault(jIAuthTabCallback) - iT_, 0), 5, (Object) null);
            final Ref.IntRef intRef = new Ref.IntRef();
            final ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            int i5 = 0;
            while (i5 < size2) {
                int i6 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % i == 0) {
                    getstreamsharingchildrenOnExtraCallback = list2.get(i5).onExtraCallback(jIAuthTabCallback2);
                    int i7 = 88 / 0;
                    if (getstreamsharingchildrenOnExtraCallback.T_() > intRef.element) {
                        intRef.element = getstreamsharingchildrenOnExtraCallback.T_();
                    }
                } else {
                    getstreamsharingchildrenOnExtraCallback = list2.get(i5).onExtraCallback(jIAuthTabCallback2);
                    if (getstreamsharingchildrenOnExtraCallback.T_() > intRef.element) {
                    }
                }
                arrayList2.add(getstreamsharingchildrenOnExtraCallback);
                i5++;
                i = 2;
            }
            return component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(j), intRef.element + iT_ + iOnExtraCallbackWithResult + iOnExtraCallbackWithResult2, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$TdsDialogV1$1$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 5;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = iOnExtraCallbackWithResult;
                    List list5 = arrayList2;
                    if (i10 == 0) {
                        v6.onExtraCallback.onExtraCallbackWithResult(i11, list5, list3, intRef, arrayList, j, jIAuthTabCallback2, iOnExtraCallbackWithResult2, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = v6.onExtraCallback.onExtraCallbackWithResult(i11, list5, list3, intRef, arrayList, j, jIAuthTabCallback2, iOnExtraCallbackWithResult2, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                    int i12 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, 4, (Object) null);
        }

        private static final Unit onNavigationEvent(int i, List list, List list2, Ref.IntRef intRef, List list3, long j, long j2, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int size = list.size();
            int i6 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                int i10 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i9), i, i, 0.0f, 4, (Object) null);
            }
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, ((component7) list2.get(i12)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, VirtualCameraCaptureResult.asInterface(j), 0, VirtualCameraCaptureResult.IAuthTabCallbackDefault(j2), 5, (Object) null)), 0, i, 0.0f, 4, (Object) null);
            }
            int i13 = intRef.element;
            int size3 = list3.size();
            while (i8 < size3) {
                int i14 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 == 0) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i8), i2, i / i13, 2.0f, 2, (Object) null);
                    i8 += 99;
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i8), i2, i + i13, 0.0f, 4, (Object) null);
                    i8++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final setContentInsetsRelative setcontentinsetsrelative, final Function2 function2, final Function2 function22, final long j, final getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            z = (i & 100) != 98;
        } else {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-636241037, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1.<anonymous> (TdsDialogV1.kt:78)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1542276390);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(1702583836, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 99;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    setContentInsetsRelative setcontentinsetsrelative2 = setcontentinsetsrelative;
                    if (i6 == 0) {
                        return v6.onExtraCallbackWithResult(setcontentinsetsrelative2, function2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = v6.onExtraCallbackWithResult(setcontentinsetsrelative2, function2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = 71 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54));
            listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(-1201523771, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda17
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 39;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        v6.IAuthTabCallback(j, setcontentinsetsrelative, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitIAuthTabCallback = v6.IAuthTabCallback(j, setcontentinsetsrelative, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i6 = onNavigationEvent + 67;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54));
            listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(-2121301724, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda18
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 9;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitOnExtraCallback = v6.onExtraCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 58 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54));
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i4 = onNavigationEvent + 101;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                objOnMinimized = onExtraCallback.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getCameraUseCases getcamerausecases = (getCameraUseCases) objOnMinimized;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Function2 function2OnWarmupCompleted = callAllGets.onWarmupCompleted(listBuild);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i6 = onNavigationEvent + 91;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                objOnMinimized2 = getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                int i7 = onWarmupCompleted + 31;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            component5 component5Var = (component5) objOnMinimized2;
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
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        boolean z;
        final v6a.IAuthTabCallback iAuthTabCallback;
        final setContentInsetsRelative setcontentinsetsrelative;
        final Function2 function2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i3;
        int i4;
        final Function0 function0 = (Function0) objArr[0];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        final Function2 function22 = (Function2) objArr[2];
        Function2 function23 = (Function2) objArr[3];
        setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = (setContentInsetsRelative) objArr[4];
        v6a.IAuthTabCallback iAuthTabCallback2 = (v6a.IAuthTabCallback) objArr[5];
        final long jLongValue = ((Number) objArr[6]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        final int iIntValue = ((Number) objArr[8]).intValue();
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(function22, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1698914854);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i6 = onNavigationEvent + 25;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 6 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    int i8 = onNavigationEvent + 39;
                    onWarmupCompleted = i8 % 128;
                    i4 = i8 % 2 == 0 ? 28699 : 256;
                } else {
                    i4 = 128;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
            }
            i |= i4;
        }
        int i9 = i;
        int i10 = iIntValue2 & 8;
        if (i10 == 0) {
            if ((iIntValue & 3072) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 2048 : 1024) | i9;
            }
            if ((iIntValue & 24576) == 0) {
                i2 |= ((iIntValue2 & 16) != 0 || (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelativeIAuthTabCallback) ^ true)) ? 8192 : 16384;
            }
            if ((196608 & iIntValue) == 0) {
                if ((iIntValue2 & 32) == 0) {
                    int i11 = onNavigationEvent + 107;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 131072 : 65536;
                    i2 |= i13;
                }
            }
            if ((1572864 & iIntValue) == 0) {
                if ((iIntValue2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                    int i14 = onWarmupCompleted + 39;
                    onNavigationEvent = i14 % 128;
                    i3 = 1048576;
                    if (i14 % 2 != 0) {
                        int i15 = 71 / 0;
                    }
                } else {
                    i3 = 524288;
                }
                i2 |= i3;
            }
            if ((599187 & i2) == 599186) {
                int i16 = onNavigationEvent + 117;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                iAuthTabCallback = iAuthTabCallback2;
                setcontentinsetsrelative = setcontentinsetsrelativeIAuthTabCallback;
                function2 = function23;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i10 != 0) {
                        function23 = null;
                    }
                    if ((iIntValue2 & 16) != 0) {
                        setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                        i2 &= -57345;
                    }
                    if ((iIntValue2 & 32) != 0) {
                        iAuthTabCallback2 = new v6a.IAuthTabCallback(false, false, null, 7, null);
                        i2 &= -458753;
                    }
                    if ((iIntValue2 & 64) != 0) {
                        int i18 = onNavigationEvent + 89;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        jLongValue = v7.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i2 &= -3670017;
                    }
                    final Function2 function24 = function23;
                    final setContentInsetsRelative setcontentinsetsrelative2 = setcontentinsetsrelativeIAuthTabCallback;
                    v6a.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
                    final long j = jLongValue;
                    int i20 = onWarmupCompleted + 125;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1698914854, i2, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1 (TdsDialogV1.kt:72)");
                    }
                    int i22 = i2 >> 12;
                    v3.onExtraCallbackWithResult(function0, iAuthTabCallback3, j, null, ForwardingCameraControl.onExtraCallback(-636241037, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i23 = 2 % 2;
                            int i24 = onExtraCallback + 45;
                            onWarmupCompleted = i24 % 128;
                            if (i24 % 2 == 0) {
                                return v6.IAuthTabCallback(setcontentinsetsrelative2, function24, function22, j, getbacktracenote, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            v6.IAuthTabCallback(setcontentinsetsrelative2, function24, function22, j, getbacktracenote, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | 24576 | (i22 & 112) | (i22 & 896), 8);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    function2 = function24;
                    setcontentinsetsrelative = setcontentinsetsrelative2;
                    iAuthTabCallback = iAuthTabCallback3;
                    jLongValue = j;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 16) != 0) {
                        int i23 = onWarmupCompleted + 81;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        i2 &= -57345;
                    }
                    if ((iIntValue2 & 32) != 0) {
                        int i25 = onNavigationEvent + 79;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 == 0) {
                            i2 &= -458753;
                            int i26 = 16 / 0;
                        } else {
                            i2 &= -458753;
                        }
                    }
                    if ((iIntValue2 & 64) != 0) {
                        i2 &= -3670017;
                    }
                    final Function2 function242 = function23;
                    final setContentInsetsRelative setcontentinsetsrelative22 = setcontentinsetsrelativeIAuthTabCallback;
                    v6a.IAuthTabCallback iAuthTabCallback32 = iAuthTabCallback2;
                    final long j2 = jLongValue;
                    int i202 = onWarmupCompleted + 125;
                    onNavigationEvent = i202 % 128;
                    int i212 = i202 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    int i222 = i2 >> 12;
                    v3.onExtraCallbackWithResult(function0, iAuthTabCallback32, j2, null, ForwardingCameraControl.onExtraCallback(-636241037, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i232 = 2 % 2;
                            int i242 = onExtraCallback + 45;
                            onWarmupCompleted = i242 % 128;
                            if (i242 % 2 == 0) {
                                return v6.IAuthTabCallback(setcontentinsetsrelative22, function242, function22, j2, getbacktracenote, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            v6.IAuthTabCallback(setcontentinsetsrelative22, function242, function22, j2, getbacktracenote, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | 24576 | (i222 & 112) | (i222 & 896), 8);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    function2 = function242;
                    setcontentinsetsrelative = setcontentinsetsrelative22;
                    iAuthTabCallback = iAuthTabCallback32;
                    jLongValue = j2;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i27 = 2 % 2;
                        int i28 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i28 % 128;
                        int i29 = i28 % 2;
                        Unit unitOnWarmupCompleted = v6.onWarmupCompleted(function0, getbacktracenote, function22, function2, setcontentinsetsrelative, iAuthTabCallback, jLongValue, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i30 = onWarmupCompleted + 73;
                        onExtraCallbackWithResult = i30 % 128;
                        int i31 = i30 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
            }
            return null;
        }
        int i27 = onNavigationEvent + 69;
        onWarmupCompleted = i27 % 128;
        i9 = i27 % 2 == 0 ? i9 | 24672 : i9 | 3072;
        i2 = i9;
        if ((iIntValue & 24576) == 0) {
        }
        if ((196608 & iIntValue) == 0) {
        }
        if ((1572864 & iIntValue) == 0) {
        }
        if ((599187 & i2) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        int i;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 9) == 0) {
                int i4 = onNavigationEvent + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                    int i6 = onNavigationEvent + 29;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    i = 4;
                } else {
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            int i8 = onWarmupCompleted + 5;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(899566614, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonPreview.<anonymous>.<anonymous> (TdsDialogV1.kt:211)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                int i10 = onNavigationEvent + 59;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    int i11 = 21 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f));
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                int i12 = onNavigationEvent + 33;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 33;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1661862626, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1661862630, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                        int i16 = onWarmupCompleted + 9;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 89 / 0;
                        }
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Dialog", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (getInterfaceDescriptor(getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1569719120);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = onNavigationEvent + 121;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                            if (i15 == 0) {
                                return v6.IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor2);
                            }
                            v6.IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor2);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                v2b v2bVar = v2b.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                onWarmupCompleted(new Object[]{(Function0) objOnMinimized2, v2bVar.asBinder(), v2bVar.asInterface(), v2bVar.access100(), null, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3510, 112}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1569088704);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        } else {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 5;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-666313768, i, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonPreview.<anonymous> (TdsDialogV1.kt:210)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(899566614, true, new TdsDialogV1Kt$.ExternalSyntheticLambda25(getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 12582912, 131071);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 85;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r7
      0x0025: PHI (r7v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r7v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r7v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r7
      0x0023: PHI (r7v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r7v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r7v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2025008592);
            int i4 = 55 / 0;
            if (i != 0) {
                z = true;
            } else {
                int i5 = onWarmupCompleted + 63;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2025008592);
            if (i != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 25;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2025008592, i, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonPreview (TdsDialogV1.kt:207)");
                if (i8 == 0) {
                    int i9 = 81 / 0;
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-666313768, true, new TdsDialogV1Kt$.ExternalSyntheticLambda2((getSupportedHighSpeedResolutionsFor) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsDialogV1Kt$.ExternalSyntheticLambda3(i));
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        int i;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i3 = onNavigationEvent + 87;
                onWarmupCompleted = i3 % 128;
                i = i3 % 2 == 0 ? 5 : 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1481012976, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonPreview.<anonymous>.<anonymous> (TdsDialogV1.kt:258)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onNavigationEvent + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                int i8 = onWarmupCompleted + 15;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f));
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onNavigationEvent + 73;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda23
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 81;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                        if (i13 == 0) {
                            return v6.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2);
                        }
                        v6.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Dialog", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (!extraCallback(getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1303397946);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1304246509);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda24
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = IAuthTabCallback + 105;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitIAuthTabCallback = v6.IAuthTabCallback(getsupportedhighspeedresolutionsfor);
                            if (i13 == 0) {
                                int i14 = 75 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                Function0 function0 = (Function0) objOnMinimized2;
                v2b v2bVar = v2b.onWarmupCompleted;
                onWarmupCompleted(new Object[]{function0, v2bVar.onWarmupCompleted(), v2bVar.onTransact(), v2bVar.access000(), null, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3510, 112}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 33;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 52 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit readTypedObject(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = onWarmupCompleted + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 15;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-84867406, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonPreview.<anonymous> (TdsDialogV1.kt:257)");
                    int i7 = 45 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-84867406, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonPreview.<anonymous> (TdsDialogV1.kt:257)");
                }
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(1481012976, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda11
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 29;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallback = v6.onExtraCallback(getsupportedhighspeedresolutionsfor, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = onWarmupCompleted + 91;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 12582912, 131071);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 15;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1443562230);
        if (i != 0) {
            int i3 = onWarmupCompleted + 69;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1443562230, i, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonPreview (TdsDialogV1.kt:254)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i8 = onWarmupCompleted + 33;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-84867406, true, new TdsDialogV1Kt$.ExternalSyntheticLambda9((getSupportedHighSpeedResolutionsFor) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsDialogV1Kt$.ExternalSyntheticLambda10(i));
        }
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, i2 % 2 != 0);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            int i6 = onNavigationEvent + 33;
            onWarmupCompleted = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(187237296, i2, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonAccessibilityPreview.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:309)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f));
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onWarmupCompleted + 23;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onNavigationEvent + 101;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallback + 113;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 434582092, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -434582084, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                        int i14 = onExtraCallback + 33;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Dialog", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                int i11 = onNavigationEvent + 67;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1500952685);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    onwarmupcompleted.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1500952685);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda13
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 101;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                            if (i14 == 0) {
                                return v6.asBinder(getsupportedhighspeedresolutionsfor2);
                            }
                            v6.asBinder(getsupportedhighspeedresolutionsfor2);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                Function0 function0 = (Function0) objOnMinimized2;
                v2b v2bVar = v2b.onWarmupCompleted;
                onWarmupCompleted(new Object[]{function0, (getBacktraceNote) v2b.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{v2bVar}, ICustomTabsCallbackStubProxy.onExtraCallback(), 1720700962, -1720700960, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback()), v2bVar.IAuthTabCallbackDefault(), v2bVar.onNavigationEvent(), null, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3510, 112}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1501737822);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 3) {
            z = false;
        } else {
            int i5 = i3 + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1125866066, i, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonAccessibilityPreview.<anonymous>.<anonymous> (TdsDialogV1.kt:308)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(187237296, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda15
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 39;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback = v6.IAuthTabCallback(getsupportedhighspeedresolutionsfor, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onExtraCallback + 99;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 85 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 12582912, 131071);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 107;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 34 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onWarmupCompleted + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-152055186, i, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonAccessibilityPreview.<anonymous> (TdsDialogV1.kt:307)");
            }
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), 3.0f)), ForwardingCameraControl.onExtraCallback(-1125866066, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 27;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        throw null;
                    }
                    Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -204351316, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 204351325, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                    int i9 = IAuthTabCallback + 125;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 113;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-926356714);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-926356714, iIntValue, -1, "im.toss.tds.compose.component.compound.dialog.OneButtonAccessibilityPreview (TdsDialogV1.kt:304)");
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-152055186, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda27
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 121;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 2087397994, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -2087397991, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                    int i8 = onWarmupCompleted + 67;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 50 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i7 = onNavigationEvent + 53;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda28
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 111;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = iIntValue;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (i11 == 0) {
                        return v6.onExtraCallback(i12, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    v6.onExtraCallback(i12, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    private static final Unit writeTypedObject(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = onWarmupCompleted + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = onWarmupCompleted + 71;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 97;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(863161110, i2, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:357)");
                    int i11 = 30 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(863161110, i2, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview.<anonymous>.<anonymous>.<anonymous> (TdsDialogV1.kt:357)");
                }
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i12 = onWarmupCompleted + 55;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i13 = 4 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i14 = onWarmupCompleted + 83;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f));
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i16 = onWarmupCompleted + 1;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    int i17 = 14 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i18 = 2 % 2;
                        int i19 = onWarmupCompleted + 33;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnTransact = v6.onTransact(getsupportedhighspeedresolutionsfor);
                        if (i20 == 0) {
                            int i21 = 26 / 0;
                        }
                        return unitOnTransact;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Dialog", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1154348410);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda5
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 31;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnWarmupCompleted = v6.onWarmupCompleted(getsupportedhighspeedresolutionsfor);
                            int i21 = onNavigationEvent + 15;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                Function0 function0 = (Function0) objOnMinimized2;
                v2b v2bVar = v2b.onWarmupCompleted;
                onWarmupCompleted(new Object[]{function0, v2bVar.IAuthTabCallback(), v2bVar.IAuthTabCallbackStubProxy(), (Function2) v2b.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{v2bVar}, ICustomTabsCallbackStubProxy.onExtraCallback(), 161343106, -161343103, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback()), null, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3510, 112}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1153347048);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i18 = onNavigationEvent + 107;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i20 = onWarmupCompleted + 67;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i4 + 101;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 95;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-449942252, i, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview.<anonymous>.<anonymous> (TdsDialogV1.kt:356)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-449942252, i, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview.<anonymous>.<anonymous> (TdsDialogV1.kt:356)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(863161110, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda19
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
                    if (i11 == 0) {
                        return v6.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = v6.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = 8 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 12582912, 131071);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 3) {
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            int i7 = i3 + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(523868628, i, -1, "im.toss.tds.compose.component.compound.dialog.TwoButtonAccessibilityPreview.<anonymous> (TdsDialogV1.kt:355)");
            }
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), 3.0f)), ForwardingCameraControl.onExtraCallback(-449942252, true, new Function2() { // from class: im.toss.tds.compose.component.compound.dialog.TdsDialogV1Kt$$ExternalSyntheticLambda26
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 59;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    Unit unit = (Unit) v6.onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -2005598350, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 2005598351, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
                    int i11 = onExtraCallback + 51;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 81 / 0;
                    }
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 23;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        int i4 = 78 / 0;
        return bool.booleanValue();
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final boolean extraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = onNavigationEvent + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 434582092, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -434582084, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1661862626, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1661862630, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -2005598350, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 2005598351, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 959000316, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -959000306, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1671621758, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1671621765, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -204351316, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 204351325, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 2087397994, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -2087397991, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1855471633, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1855471620, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit access100(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -701871507, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 701871509, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -629801713, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 629801719, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public static final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0, @NotNull getBacktraceNote<? super v5b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable setContentInsetsRelative setcontentinsetsrelative, @Nullable v6a.IAuthTabCallback iAuthTabCallback, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onWarmupCompleted(new Object[]{function0, getbacktracenote, function2, function22, setcontentinsetsrelative, iAuthTabCallback, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1782715482, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1782715493, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1774170472, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1774170477, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit access100(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1652470189, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1652470203, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }

    private static final Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), 1617445549, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback(), -1617445549, ComposableSingletons$TdsTableRowV1Kt$$ExternalSyntheticLambda1.IAuthTabCallback());
    }
}
