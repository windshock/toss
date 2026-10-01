package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.widget.Toast;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.R;
import im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AvoidPostviewAvailabilityCheckQuirk;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.getSupportedHighSpeedResolutionsFor;
import o.getViewTypeCount;
import o.initSDK;
import o.isExtraPreviewRequired;
import o.putBooleanArray;
import o.putCharSequenceArray;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.w3b;
import o.w4;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w4 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[getViewTypeCount.IAuthTabCallback.onNavigationEvent.values().length];
            try {
                iArr[getViewTypeCount.IAuthTabCallback.onNavigationEvent.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getViewTypeCount.IAuthTabCallback.onNavigationEvent.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getViewTypeCount.IAuthTabCallback.onNavigationEvent.Down.ordinal()] = 3;
                int i = IAuthTabCallback + 7;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[getViewTypeCount.asInterface.IAuthTabCallback.values().length];
            try {
                iArr2[getViewTypeCount.asInterface.IAuthTabCallback.Center.ordinal()] = 1;
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getViewTypeCount.asInterface.IAuthTabCallback.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getViewTypeCount.onExtraCallback onextracallback = (getViewTypeCount.onExtraCallback) objArr[2];
        getViewTypeCount.onExtraCallback onextracallback2 = (getViewTypeCount.onExtraCallback) objArr[3];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[4];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[5];
        getViewTypeCount.onExtraCallback onextracallback3 = (getViewTypeCount.onExtraCallback) objArr[6];
        getViewTypeCount.onExtraCallback onextracallback4 = (getViewTypeCount.onExtraCallback) objArr[7];
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub = (getViewTypeCount.IAuthTabCallbackStub) objArr[8];
        getViewTypeCount.asInterface asinterface = (getViewTypeCount.asInterface) objArr[9];
        getViewTypeCount.IAuthTabCallback iAuthTabCallback = (getViewTypeCount.IAuthTabCallback) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[13];
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1327372535, 1327372539);
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            access100(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitAccess100 = access100(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(th);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws NoWhenBranchMatchedException {
        getViewTypeCount.IAuthTabCallback iAuthTabCallback = (getViewTypeCount.IAuthTabCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit access100(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallbackDefault(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 195605341, -195605330);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitAsBinder;
    }

    private static final Unit onExtraCallback(List list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1291431202, 1291431212);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, String str, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, getbacktracenote2, onextracallback, onextracallback2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallback, iAuthTabCallbackStub, asinterface, str, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(onextracallbackwithresult, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ component8 onExtraCallback(getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, putCharSequenceArray putcharsequencearray, Function1 function1, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, pin pinVar, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarIAuthTabCallback = IAuthTabCallback(getbacktracenote, getbacktracenote2, getbacktracenote3, iAuthTabCallbackStub, putcharsequencearray, function1, asinterface, iAuthTabCallback, getsupportedhighspeedresolutionsfor, pinVar, onextracallback, onextracallback2, onextracallback3, onextracallback4, isextrapreviewrequired, virtualCameraCaptureResult);
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return component8VarIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, th);
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            asInterface(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(initsdk, function0);
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(putCharSequenceArray putcharsequencearray, isExtraPreviewRequired isextrapreviewrequired, int i, pin pinVar, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, List list, boolean z, int i2, List list2, List list3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, int i3, int i4, int i5, int i6, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        Unit unitOnExtraCallback = onExtraCallback(putcharsequencearray, isextrapreviewrequired, i, pinVar, onextracallback, onextracallback2, list, z, i2, list2, list3, onextracallback3, onextracallback4, i3, i4, i5, i6, onextracallbackwithresult);
        int i10 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, putCharSequenceArray putcharsequencearray, getBacktraceNote getbacktracenote, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(z, putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -8854768, 8854769);
        int i5 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 15 / 0;
        }
        int i7 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, String str, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return onExtraCallback(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, getbacktracenote2, onextracallback, onextracallback2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallback, iAuthTabCallbackStub, asinterface, str, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onExtraCallback(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, getbacktracenote2, onextracallback, onextracallback2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallback, iAuthTabCallbackStub, asinterface, str, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ QuirkSettingsLoader.onNavigationEvent onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        QuirkSettingsLoader.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1454995559, -1454995547);
        int i6 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        List listIAuthTabCallback;
        int i7 = ~i5;
        int i8 = i7 | i6;
        int i9 = (~i8) | (~(i7 | i4));
        int i10 = (~((~i4) | i7 | (~i6))) | (~(i5 | i6));
        int i11 = i5 + i6 + i3 + ((-540997959) * i) + (162607451 * i2);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i5) + 1723858944 + (1667710703 * i6) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i3) + ((-672137216) * i) + (483393536 * i2) + (377683968 * i12);
        int i14 = (i5 * 228155117) + 240245784 + (i6 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i3 * 228155391) + (i * (-329950905)) + (i2 * (-2026639707)) + (i12 * 159186944);
        switch (i13 + (i14 * i14 * (-1451425792))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[1];
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
                Object obj = objArr[3];
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                if (getbacktracenote == null || (listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(obj, ForwardingCameraControl.onExtraCallbackWithResult(324312746, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 113;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnExtraCallback = w4.onExtraCallback(getbacktracenote, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i21 = onWarmupCompleted + 97;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        return unitOnExtraCallback;
                    }
                }))) == null) {
                    return CollectionsKt.emptyList();
                }
                int i18 = onNavigationEvent + 65;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                return listIAuthTabCallback;
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access100(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iOnExtraCallbackWithResult;
        int iOnExtraCallbackWithResult2;
        putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getViewTypeCount.onExtraCallback onextracallback = (getViewTypeCount.onExtraCallback) objArr[2];
        getViewTypeCount.onExtraCallback onextracallback2 = (getViewTypeCount.onExtraCallback) objArr[3];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[4];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[5];
        getViewTypeCount.onExtraCallback onextracallback3 = (getViewTypeCount.onExtraCallback) objArr[6];
        getViewTypeCount.onExtraCallback onextracallback4 = (getViewTypeCount.onExtraCallback) objArr[7];
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub = (getViewTypeCount.IAuthTabCallbackStub) objArr[8];
        getViewTypeCount.asInterface asinterface = (getViewTypeCount.asInterface) objArr[9];
        getViewTypeCount.IAuthTabCallback iAuthTabCallback = (getViewTypeCount.IAuthTabCallback) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[13];
        ((Number) objArr[14]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
        } else {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
        }
        onExtraCallbackWithResult(putcharsequencearray, (getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, onextracallback, onextracallback2, (getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, boolean z, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, z, onextracallback, onextracallback2, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, boolean z, putCharSequenceArray putcharsequencearray, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, initSDK initsdk, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, z, putcharsequencearray, onextracallback, onextracallback2, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, initsdk, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1045201251, -1045201251);
        int i5 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return unit;
    }

    public static final int onExtraCallbackWithResult(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull getViewTypeCount.onExtraCallback onextracallback, int i, int i2, int i3) {
        int iOnNavigationEvent;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            iOnNavigationEvent = onextracallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, onextracallback.onNavigationEvent(i2, i3));
            int i6 = 38 / 0;
        } else {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            iOnNavigationEvent = onextracallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, onextracallback.onNavigationEvent(i2, i3));
        }
        int i7 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 27 / 0;
        }
        return iOnNavigationEvent;
    }

    public static final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getViewTypeCount.onExtraCallback onextracallback, @Nullable getViewTypeCount.onExtraCallback onextracallback2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getViewTypeCount.onExtraCallback onextracallback3, @Nullable getViewTypeCount.onExtraCallback onextracallback4, @Nullable getViewTypeCount.IAuthTabCallback iAuthTabCallback, @Nullable getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable getViewTypeCount.asInterface asinterface, @Nullable getViewTypeCount.onNavigationEvent onnavigationevent, @Nullable getViewTypeCount.onTransact ontransact, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent;
        getViewTypeCount.onNavigationEvent onnavigationeventOnExtraCallback;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub2;
        String str2;
        String str3;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        Object obj = null;
        getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = (i3 & 4) != 0 ? null : getbacktracenote2;
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = (i3 & 8) != 0 ? getViewTypeCount.onExtraCallback.Companion.onNavigationEvent() : onextracallback;
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted = (i3 & 16) != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback2;
        if ((i3 & 32) != 0) {
            int i7 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            getbacktracenote4 = null;
        } else {
            getbacktracenote4 = getbacktracenote3;
        }
        if ((i3 & 64) != 0) {
            int i9 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
        } else {
            onextracallbackOnNavigationEvent = onextracallback3;
        }
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted2 = (i3 & 128) != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback4;
        getViewTypeCount.IAuthTabCallback iAuthTabCallback2 = (i3 & 256) != 0 ? null : iAuthTabCallback;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub3 = (i3 & 512) != 0 ? (getViewTypeCount.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted()) : iAuthTabCallbackStub;
        getViewTypeCount.asInterface asinterface2 = (i3 & 1024) != 0 ? new getViewTypeCount.asInterface(null, 0.0f, false, 7, null) : asinterface;
        if ((i3 & 2048) != 0) {
            int i10 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                onnavigationeventOnExtraCallback = getViewTypeCount.onNavigationEvent.Companion.onExtraCallback();
                int i11 = 75 / 0;
            } else {
                onnavigationeventOnExtraCallback = getViewTypeCount.onNavigationEvent.Companion.onExtraCallback();
            }
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        getViewTypeCount.onTransact ontransactOnExtraCallback = (i3 & 4096) != 0 ? getViewTypeCount.onTransact.Companion.onExtraCallback() : ontransact;
        getViewTypeCount.asInterface asinterface3 = asinterface2;
        if ((i3 & 8192) != 0) {
            int i12 = onNavigationEvent + 115;
            iAuthTabCallbackStub2 = iAuthTabCallbackStub3;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            str2 = null;
        } else {
            iAuthTabCallbackStub2 = iAuthTabCallbackStub3;
            str2 = str;
        }
        if ((i3 & 16384) != 0) {
            int i14 = onExtraCallbackWithResult + 85;
            str3 = str2;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            function02 = null;
        } else {
            str3 = str2;
            function02 = function0;
        }
        if ((32768 & i3) != 0) {
            int i16 = onExtraCallbackWithResult + 29;
            function03 = function02;
            onNavigationEvent = i16 % 128;
            if (i16 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i17 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        } else {
            function03 = function02;
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        getSubtitle getsubtitle2 = (i3 & 65536) != 0 ? (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getPopupTheme.onExtraCallback()) : getsubtitle;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1648813676, i, i2, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1 (TdsListRowV1.kt:477)");
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onnavigationeventOnExtraCallback.IAuthTabCallback(), ontransactOnExtraCallback.onTransact());
        int i19 = i << 3;
        int i20 = i2 >> 3;
        onExtraCallbackWithResult(getbacktracenote, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, quirksExternalSyntheticBackport02, getbacktracenote5, onextracallbackOnNavigationEvent2, onextracallbackOnWarmupCompleted, getbacktracenote4, onextracallbackOnNavigationEvent, onextracallbackOnWarmupCompleted2, iAuthTabCallback2, iAuthTabCallbackStub2, asinterface3, str3, function03, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), ((i >> 27) & 14) | ((i2 << 3) & 112) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i21 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onWarmupCompleted(boolean z, putCharSequenceArray putcharsequencearray, getBacktraceNote getbacktracenote, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1284958052, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:555)");
            }
            if (z) {
                int i5 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-858110752);
                    i2 = 111;
                    i3 = 1;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-858110752);
                    i2 = 6;
                    i3 = 0;
                }
                onExtraCallbackWithResult(putcharsequencearray, (getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, onextracallback, onextracallback2, (getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i2, i3);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i6 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-857316346);
                w3.IAuthTabCallback(putcharsequencearray, getbacktracenote, getbacktracenote2, getbacktracenote3, onextracallback, onextracallback2, onextracallback3, onextracallback4, asinterface, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 79 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(getViewTypeCount.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        if ((i & 3) != 2) {
            int i4 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-248738049, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:585)");
            }
            int i7 = IAuthTabCallback.onExtraCallbackWithResult[iAuthTabCallback.onNavigationEvent().ordinal()];
            if (i7 != 1) {
                int i8 = onExtraCallbackWithResult;
                int i9 = i8 + 77;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0 ? i7 == 2 : i7 == 3) {
                    i2 = R.drawable.icon_arrow_right_mono;
                } else {
                    int i10 = i8 + 75;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 != 0 ? i7 != 3 : i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.icon_arrow_down_mono;
                    int i11 = onNavigationEvent + 113;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                }
            } else {
                i2 = R.drawable.icon_arrow_up_mono;
            }
            AppLovinNativeAdImplc.onExtraCallback(i2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, iAuthTabCallback.IAuthTabCallbackDefault(), 0.0f, 10, (Object) null), iAuthTabCallback.asInterface()), 0L, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 3, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        }
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class onWarmupCompleted implements getCameraUseCases {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        final /* synthetic */ getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
        final /* synthetic */ getViewTypeCount.IAuthTabCallback onExtraCallbackWithResult;
        final /* synthetic */ getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
        final /* synthetic */ getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, getViewTypeCount.IAuthTabCallback iAuthTabCallback) {
            this.onWarmupCompleted = getbacktracenote;
            this.onNavigationEvent = getbacktracenote2;
            this.onExtraCallback = getbacktracenote3;
            this.onExtraCallbackWithResult = iAuthTabCallback;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(List list, List list2, int i, int i2, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallback + 39;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return IAuthTabCallback(list, list2, i, i2, i3, onextracallbackwithresult);
            }
            IAuthTabCallback(list, list2, i, i2, i3, onextracallbackwithresult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onNavigationEvent(component4 component4Var, List<? extends List<? extends component7>> list, long j) {
            List<? extends component7> list2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (this.onWarmupCompleted == null && this.onNavigationEvent == null) {
                int i2 = IAuthTabCallback + 33;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                if (this.onExtraCallback == null) {
                    int i5 = i3 + 33;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    list2 = null;
                }
            } else {
                list2 = list.get(0);
            }
            Triple<Integer, Integer, List<getStreamSharingChildren>> tripleIAuthTabCallback = lExternalSyntheticLambda6.IAuthTabCallback(this.onExtraCallbackWithResult != null ? list.get(1) : null, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, VirtualCameraCaptureResult.asInterface(j), 0, 0, 13, (Object) null));
            int iIntValue = ((Number) tripleIAuthTabCallback.onExtraCallbackWithResult()).intValue();
            final int iIntValue2 = ((Number) tripleIAuthTabCallback.onExtraCallback()).intValue();
            final List list3 = (List) tripleIAuthTabCallback.IAuthTabCallback();
            Triple<Integer, Integer, List<getStreamSharingChildren>> tripleIAuthTabCallback2 = lExternalSyntheticLambda6.IAuthTabCallback(list2, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, VirtualCameraCaptureResult.asInterface(j) - iIntValue, 0, 0, 13, (Object) null));
            final int iIntValue3 = ((Number) tripleIAuthTabCallback2.onExtraCallbackWithResult()).intValue();
            int iIntValue4 = ((Number) tripleIAuthTabCallback2.onExtraCallback()).intValue();
            final List list4 = (List) tripleIAuthTabCallback2.IAuthTabCallback();
            int iMax = Math.max(VirtualCameraCaptureResult.asInterface(j), iIntValue + iIntValue3);
            final int iMax2 = Math.max(iIntValue4, iIntValue2);
            return component4.IAuthTabCallback(component4Var, iMax, iMax2, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$TdsListRowV1$3$1$4$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 75;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallbackWithResult = w4.onWarmupCompleted.onExtraCallbackWithResult(list4, list3, iIntValue3, iIntValue2, iMax2, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i10 = IAuthTabCallback + 63;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, 4, (Object) null);
        }

        private static final Unit IAuthTabCallback(List list, List list2, int i, int i2, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i4 = 2 % 2;
            int i5 = asInterface + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            if (list != null) {
                int size = list.size();
                int i7 = 0;
                while (i7 < size) {
                    int i8 = asInterface + 57;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i7), 0, 1, 0.0f, 5, (Object) null);
                        i7 += 42;
                    } else {
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i7), 0, 0, 0.0f, 4, (Object) null);
                        i7++;
                    }
                }
            }
            if (list2 != null) {
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list2.get(i9), i, QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(i2, i3), 0.0f, 4, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final Function0 function0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, String str, final getViewTypeCount.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final boolean z, final putCharSequenceArray putcharsequencearray, final getViewTypeCount.onExtraCallback onextracallback, final getViewTypeCount.onExtraCallback onextracallback2, final getViewTypeCount.onExtraCallback onextracallback3, final getViewTypeCount.onExtraCallback onextracallback4, final getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, final getViewTypeCount.asInterface asinterface, final initSDK initsdk, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2;
        Function0 function02;
        float fOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        if ((i & 3) != 2) {
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(652126189, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.<anonymous>.<anonymous> (TdsListRowV1.kt:549)");
            }
            ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
            float fIAuthTabCallback = deviceQuirksExternalSyntheticLambda0.IAuthTabCallback();
            float fOnExtraCallback = deviceQuirksExternalSyntheticLambda0.onExtraCallback();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-371947169);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(1284958052, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda18
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 11;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(z, putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onExtraCallback + 117;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54));
            if (iAuthTabCallback != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1651824255);
                listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(-248738049, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda19
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 23;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unit = (Unit) w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 2054970225, -2054970211);
                        int i11 = onExtraCallback + 53;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54));
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1651098700);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport02);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda20
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 75;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr = {(useAndConfigureProgramWithTexture) obj};
                        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                        if (i10 != 0) {
                            return (Unit) w4.onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1614402211, 1614402213);
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, true, (Function1) objOnMinimized);
            if (function0 == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1357226792);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                function02 = null;
                i2 = 0;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1357226793);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent && !zOnNavigationEvent2) {
                    int i8 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        i2 = 0;
                        int i9 = 25 / 0;
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        function02 = (Function0) objOnMinimized2;
                    } else {
                        i2 = 0;
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        function02 = (Function0) objOnMinimized2;
                    }
                } else {
                    i2 = 0;
                }
                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda21
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 105;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(initsdk, function0);
                        int i13 = onNavigationEvent + 37;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                function02 = (Function0) objOnMinimized2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, (setTitleMarginStart) null, false, str, (Role) null, function02, 44, (Object) null);
            float fOnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability);
            if (iAuthTabCallback != null) {
                int i10 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                fOnExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            } else {
                fOnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, fOnExtraCallback2, fIAuthTabCallback, fOnExtraCallbackWithResult, fOnExtraCallback), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(w3a.onWarmupCompleted.IAuthTabCallbackDefault() - fIAuthTabCallback) - fOnExtraCallback), 1, (Object) null);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote2);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote3);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new onWarmupCompleted(getbacktracenote, getbacktracenote2, getbacktracenote3, iAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            getCameraUseCases getcamerausecases = (getCameraUseCases) objOnMinimized3;
            Function2 function2OnWarmupCompleted = callAllGets.onWarmupCompleted(listBuild);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getcamerausecases);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent7 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                int i12 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 % 5;
                }
            }
            component5 component5Var = (component5) objOnMinimized4;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i2));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2));
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function0 function0, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final getSubtitle getsubtitle, final String str, final getViewTypeCount.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final boolean z, final getViewTypeCount.onExtraCallback onextracallback, final getViewTypeCount.onExtraCallback onextracallback2, final getViewTypeCount.onExtraCallback onextracallback3, final getViewTypeCount.onExtraCallback onextracallback4, final getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, final getViewTypeCount.asInterface asinterface, final initSDK initsdk, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk)) {
                int i6 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i8 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1701617366, i2, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1.<anonymous> (TdsListRowV1.kt:547)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new putCharSequenceArray();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objOnMinimized;
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.access100(), null, putcharsequencearray, ForwardingCameraControl.onExtraCallback(652126189, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 19;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnWarmupCompleted = w4.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, str, iAuthTabCallback, getbacktracenote, getbacktracenote2, getbacktracenote3, z, putcharsequencearray, onextracallback, onextracallback2, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, initsdk, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = onWarmupCompleted + 85;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3462, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 20 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getViewTypeCount.onExtraCallback onextracallback, @Nullable getViewTypeCount.onExtraCallback onextracallback2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getViewTypeCount.onExtraCallback onextracallback3, @Nullable getViewTypeCount.onExtraCallback onextracallback4, @Nullable getViewTypeCount.IAuthTabCallback iAuthTabCallback, @Nullable getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable getViewTypeCount.asInterface asinterface, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getViewTypeCount.onExtraCallback onextracallback5;
        final getViewTypeCount.onExtraCallback onextracallback6;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final getViewTypeCount.onExtraCallback onextracallback7;
        final getViewTypeCount.onExtraCallback onextracallback8;
        final getViewTypeCount.IAuthTabCallback iAuthTabCallback2;
        final getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub2;
        final getViewTypeCount.asInterface asinterface2;
        final String str2;
        final Function0<Unit> function02;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final getSubtitle getsubtitle2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        getViewTypeCount.onExtraCallback onextracallback9;
        getViewTypeCount.onExtraCallback onextracallback10;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        getViewTypeCount.onExtraCallback onextracallback11;
        getViewTypeCount.onExtraCallback onextracallback12;
        getViewTypeCount.IAuthTabCallback iAuthTabCallback3;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub3;
        getViewTypeCount.asInterface asinterface3;
        String str3;
        Function0<Unit> function03;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        getSubtitle getsubtitle3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub4;
        getViewTypeCount.asInterface asinterface4;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        int i21 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-681488299);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            int i22 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 32 : 16;
        }
        int i24 = i3 & 4;
        if (i24 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                            int i25 = onExtraCallbackWithResult + 93;
                            onNavigationEvent = i25 % 128;
                            i7 = i25 % 2 == 0 ? 12425 : 16384;
                        } else {
                            i7 = 8192;
                        }
                        i4 |= i7;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                            i9 = 65536;
                        } else {
                            int i26 = onExtraCallbackWithResult + 97;
                            onNavigationEvent = i26 % 128;
                            int i27 = i26 % 2;
                            i9 = 131072;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i4 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 1048576 : 524288;
                        }
                        i11 = i3 & 128;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 8388608 : 4194304;
                        }
                        i12 = i3 & 256;
                        if (i12 != 0) {
                            int i28 = onExtraCallbackWithResult + 107;
                            onNavigationEvent = i28 % 128;
                            int i29 = i28 % 2;
                            i4 |= 100663296;
                        } else {
                            if ((100663296 & i) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback4) ? 67108864 : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                int i30 = onNavigationEvent + 37;
                                onExtraCallbackWithResult = i30 % 128;
                                if (i30 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback);
                                    throw null;
                                }
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                if ((i3 & 1024) == 0) {
                                    int i31 = onNavigationEvent + 29;
                                    onExtraCallbackWithResult = i31 % 128;
                                    int i32 = i31 % 2;
                                    int i33 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 4 : 2;
                                    i14 = i33 | i2;
                                }
                                i14 = i33 | i2;
                            } else {
                                i14 = i2;
                            }
                            i15 = i3 & 2048;
                            if (i15 == 0) {
                                i14 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(asinterface) ? 32 : 16;
                            }
                            i16 = i3 & 4096;
                            if (i16 == 0) {
                                i14 |= 384;
                            } else if ((i2 & 384) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                                    int i34 = onNavigationEvent + 7;
                                    onExtraCallbackWithResult = i34 % 128;
                                    int i35 = i34 % 2;
                                    i17 = 256;
                                } else {
                                    i17 = 128;
                                }
                                i14 |= i17;
                            }
                            i18 = i3 & 8192;
                            if (i18 == 0) {
                                i14 |= 3072;
                            } else {
                                if ((i2 & 3072) == 0) {
                                    i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
                                }
                                i19 = i3 & 16384;
                                if (i19 == 0) {
                                    i20 = i19;
                                    if ((i2 & 24576) == 0) {
                                        i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 16384 : 8192;
                                    }
                                    if ((i2 & 196608) == 0) {
                                        i14 |= ((i3 & 32768) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) ? 131072 : 65536;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        getbacktracenote4 = getbacktracenote2;
                                        onextracallback5 = onextracallback;
                                        onextracallback6 = onextracallback2;
                                        getbacktracenote5 = getbacktracenote3;
                                        onextracallback7 = onextracallback3;
                                        onextracallback8 = onextracallback4;
                                        iAuthTabCallback2 = iAuthTabCallback;
                                        iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                        asinterface2 = asinterface;
                                        str2 = str;
                                        function02 = function0;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                        getsubtitle2 = getsubtitle;
                                    } else {
                                        int i36 = onExtraCallbackWithResult + 79;
                                        onNavigationEvent = i36 % 128;
                                        if (i36 % 2 == 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i & 1) != 0) {
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                    if (i24 != 0) {
                                                        int i37 = onExtraCallbackWithResult + 99;
                                                        onNavigationEvent = i37 % 128;
                                                        int i38 = i37 % 2;
                                                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                                    } else {
                                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                                    }
                                                    getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = i5 != 0 ? null : getbacktracenote2;
                                                    getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = i6 != 0 ? getViewTypeCount.onExtraCallback.Companion.onNavigationEvent() : onextracallback;
                                                    getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted = i8 != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback2;
                                                    getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = i10 != 0 ? null : getbacktracenote3;
                                                    getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = i11 != 0 ? getViewTypeCount.onExtraCallback.Companion.onNavigationEvent() : onextracallback3;
                                                    getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted2 = i12 != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback4;
                                                    getViewTypeCount.IAuthTabCallback iAuthTabCallback4 = i13 != 0 ? null : iAuthTabCallback;
                                                    getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = getbacktracenote9;
                                                    if ((i3 & 1024) != 0) {
                                                        iAuthTabCallbackStub4 = (getViewTypeCount.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted());
                                                        i14 &= -15;
                                                    } else {
                                                        iAuthTabCallbackStub4 = iAuthTabCallbackStub;
                                                    }
                                                    getViewTypeCount.asInterface asinterfaceIAuthTabCallback = i15 != 0 ? getViewTypeCount.asInterface.Companion.IAuthTabCallback() : asinterface;
                                                    String str4 = i16 != 0 ? null : str;
                                                    function03 = i18 == 0 ? function0 : null;
                                                    if (i20 != 0) {
                                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        asinterface4 = asinterfaceIAuthTabCallback;
                                                        Object obj = objOnMinimized;
                                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            Object objOnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
                                                            obj = objOnWarmupCompleted;
                                                        }
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj;
                                                    } else {
                                                        asinterface4 = asinterfaceIAuthTabCallback;
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                    }
                                                    if ((i3 & 32768) != 0) {
                                                        int i39 = onExtraCallbackWithResult + 49;
                                                        onNavigationEvent = i39 % 128;
                                                        int i40 = i39 % 2;
                                                        i14 &= -458753;
                                                        getbacktracenote7 = getbacktracenote10;
                                                        asinterface3 = asinterface4;
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                        getsubtitle3 = (getSubtitle) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(getPopupTheme.onExtraCallback());
                                                    } else {
                                                        getbacktracenote7 = getbacktracenote10;
                                                        asinterface3 = asinterface4;
                                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                                        getsubtitle3 = getsubtitle;
                                                    }
                                                    onextracallback11 = onextracallbackOnNavigationEvent2;
                                                    onextracallback12 = onextracallbackOnWarmupCompleted2;
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                    str3 = str4;
                                                    iAuthTabCallback3 = iAuthTabCallback4;
                                                    onextracallback10 = onextracallbackOnWarmupCompleted;
                                                    getbacktracenote6 = getbacktracenote8;
                                                    onextracallback9 = onextracallbackOnNavigationEvent;
                                                    iAuthTabCallbackStub3 = iAuthTabCallbackStub4;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                    if ((i3 & 1024) != 0) {
                                                        i14 &= -15;
                                                    }
                                                    if ((i3 & 32768) != 0) {
                                                        i14 &= -458753;
                                                    }
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                    getbacktracenote6 = getbacktracenote2;
                                                    onextracallback9 = onextracallback;
                                                    onextracallback10 = onextracallback2;
                                                    getbacktracenote7 = getbacktracenote3;
                                                    onextracallback11 = onextracallback3;
                                                    onextracallback12 = onextracallback4;
                                                    iAuthTabCallback3 = iAuthTabCallback;
                                                    iAuthTabCallbackStub3 = iAuthTabCallbackStub;
                                                    asinterface3 = asinterface;
                                                    str3 = str;
                                                    function03 = function0;
                                                    camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                                    getsubtitle3 = getsubtitle;
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-681488299, i4, i14, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1 (TdsListRowV1.kt:544)");
                                                }
                                                boolean zAreEqual = Intrinsics.areEqual(iAuthTabCallbackStub3, getViewTypeCount.IAuthTabCallbackStub.Companion.onExtraCallbackWithResult());
                                                IOOMCallback iOOMCallback = IOOMCallback.ListRow;
                                                final boolean z = !zAreEqual;
                                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                                final Function0<Unit> function04 = function03;
                                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                                final getSubtitle getsubtitle4 = getsubtitle3;
                                                final String str5 = str3;
                                                final getViewTypeCount.IAuthTabCallback iAuthTabCallback5 = iAuthTabCallback3;
                                                final getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = getbacktracenote6;
                                                final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12 = getbacktracenote7;
                                                final getViewTypeCount.onExtraCallback onextracallback13 = onextracallback9;
                                                final getViewTypeCount.onExtraCallback onextracallback14 = onextracallback10;
                                                final getViewTypeCount.onExtraCallback onextracallback15 = onextracallback11;
                                                final getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub5 = iAuthTabCallbackStub3;
                                                final getViewTypeCount.onExtraCallback onextracallback16 = onextracallback12;
                                                final getViewTypeCount.asInterface asinterface5 = asinterface3;
                                                setTaggedAddrCtrl settaggedaddrctrl = new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda10
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onNavigationEvent;

                                                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                                        int i41 = 2 % 2;
                                                        int i42 = onNavigationEvent + 69;
                                                        onExtraCallbackWithResult = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        Unit unitOnWarmupCompleted = w4.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport05, function04, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, getsubtitle4, str5, iAuthTabCallback5, getbacktracenote11, getbacktracenote, getbacktracenote12, z, onextracallback13, onextracallback14, onextracallback15, onextracallback16, iAuthTabCallbackStub5, asinterface5, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                        int i44 = onExtraCallbackWithResult + 59;
                                                        onNavigationEvent = i44 % 128;
                                                        if (i44 % 2 == 0) {
                                                            return unitOnWarmupCompleted;
                                                        }
                                                        throw null;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                setThreadList.IAuthTabCallback(iOOMCallback, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-1701617366, true, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196614, 30);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                getbacktracenote4 = getbacktracenote6;
                                                onextracallback5 = onextracallback9;
                                                onextracallback6 = onextracallback10;
                                                getbacktracenote5 = getbacktracenote7;
                                                onextracallback7 = onextracallback11;
                                                onextracallback8 = onextracallback12;
                                                iAuthTabCallback2 = iAuthTabCallback3;
                                                asinterface2 = asinterface3;
                                                str2 = str3;
                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                                iAuthTabCallbackStub2 = iAuthTabCallbackStub5;
                                                function02 = function03;
                                                getsubtitle2 = getsubtitle3;
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i & 1) != 0) {
                                            }
                                        }
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda11
                                            private static int onExtraCallback = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i41 = 2 % 2;
                                                int i42 = onExtraCallback + 13;
                                                onWarmupCompleted = i42 % 128;
                                                int i43 = i42 % 2;
                                                Unit unitOnNavigationEvent = w4.onNavigationEvent(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, getbacktracenote4, onextracallback5, onextracallback6, getbacktracenote5, onextracallback7, onextracallback8, iAuthTabCallback2, iAuthTabCallbackStub2, asinterface2, str2, function02, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                int i44 = onWarmupCompleted + 85;
                                                onExtraCallback = i44 % 128;
                                                if (i44 % 2 != 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i14 |= 24576;
                                i20 = i19;
                                if ((i2 & 196608) == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i19 = i3 & 16384;
                            if (i19 == 0) {
                            }
                            if ((i2 & 196608) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        i15 = i3 & 2048;
                        if (i15 == 0) {
                        }
                        i16 = i3 & 4096;
                        if (i16 == 0) {
                        }
                        i18 = i3 & 8192;
                        if (i18 == 0) {
                        }
                        i19 = i3 & 16384;
                        if (i19 == 0) {
                        }
                        if ((i2 & 196608) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                    }
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                    }
                    i18 = i3 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i3 & 16384;
                    if (i19 == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                }
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 == 0) {
                }
                i19 = i3 & 16384;
                if (i19 == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
            }
            i19 = i3 & 16384;
            if (i19 == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        i19 = i3 & 16384;
        if (i19 == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (74899 & i14) != 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub;
        float f;
        getViewTypeCount.asInterface asinterface;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub2;
        getViewTypeCount.asInterface asinterface2;
        String str;
        String str2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        getViewTypeCount.IAuthTabCallback IAuthTabCallback2;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = (getViewTypeCount.onExtraCallback) objArr[4];
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted = (getViewTypeCount.onExtraCallback) objArr[5];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[6];
        getViewTypeCount.onExtraCallback onextracallback2 = (getViewTypeCount.onExtraCallback) objArr[7];
        getViewTypeCount.onExtraCallback onextracallback3 = (getViewTypeCount.onExtraCallback) objArr[8];
        float fFloatValue = ((Number) objArr[9]).floatValue();
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub3 = (getViewTypeCount.IAuthTabCallbackStub) objArr[10];
        getViewTypeCount.asInterface asinterface3 = (getViewTypeCount.asInterface) objArr[11];
        getViewTypeCount.onNavigationEvent onnavigationevent = (getViewTypeCount.onNavigationEvent) objArr[12];
        getViewTypeCount.onTransact ontransact = (getViewTypeCount.onTransact) objArr[13];
        String str3 = (String) objArr[14];
        Function0 function0 = (Function0) objArr[15];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[16];
        getSubtitle getsubtitle = (getSubtitle) objArr[17];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[18];
        int iIntValue = ((Number) objArr[19]).intValue();
        int iIntValue2 = ((Number) objArr[20]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback;
        int iIntValue3 = ((Number) objArr[21]).intValue();
        int i = 2 % 2;
        if ((iIntValue3 & 4) != 0) {
            onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
        }
        Object obj = null;
        if ((iIntValue3 & 8) != 0) {
            getbacktracenote2 = null;
        }
        if ((iIntValue3 & 16) != 0) {
            onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
        }
        if ((iIntValue3 & 32) != 0) {
            onextracallbackOnWarmupCompleted = getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted();
        }
        if ((iIntValue3 & 64) != 0) {
            getbacktracenote3 = null;
        }
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = (iIntValue3 & 128) != 0 ? getViewTypeCount.onExtraCallback.Companion.onNavigationEvent() : onextracallback2;
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted2 = (iIntValue3 & 256) != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback3;
        if ((iIntValue3 & 512) != 0) {
            float fOnExtraCallbackWithResult = w3a.onWarmupCompleted.onExtraCallbackWithResult();
            int i2 = onExtraCallbackWithResult + 87;
            iAuthTabCallbackStub = iAuthTabCallbackStub3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            f = fOnExtraCallbackWithResult;
        } else {
            iAuthTabCallbackStub = iAuthTabCallbackStub3;
            f = fFloatValue;
        }
        if ((iIntValue3 & 1024) != 0) {
            int i4 = onExtraCallbackWithResult + 109;
            asinterface = asinterface3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                iAuthTabCallbackStub2 = (getViewTypeCount.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted());
                int i5 = 22 / 0;
            } else {
                iAuthTabCallbackStub2 = (getViewTypeCount.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted());
            }
        } else {
            asinterface = asinterface3;
            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
        }
        getViewTypeCount.asInterface asinterface4 = (iIntValue3 & 2048) != 0 ? new getViewTypeCount.asInterface(null, 0.0f, false, 7, null) : asinterface;
        getViewTypeCount.onNavigationEvent onnavigationeventOnExtraCallback = (iIntValue3 & 4096) != 0 ? getViewTypeCount.onNavigationEvent.Companion.onExtraCallback() : onnavigationevent;
        getViewTypeCount.onTransact ontransactOnExtraCallback = (iIntValue3 & 8192) != 0 ? getViewTypeCount.onTransact.Companion.onExtraCallback() : ontransact;
        if ((iIntValue3 & 16384) != 0) {
            int i6 = onExtraCallbackWithResult + 7;
            asinterface2 = asinterface4;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        } else {
            asinterface2 = asinterface4;
            str = str3;
        }
        if ((32768 & iIntValue3) != 0) {
            function0 = null;
        }
        if ((65536 & iIntValue3) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            str2 = str;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        } else {
            str2 = str;
            camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        }
        getSubtitle getsubtitle2 = (iIntValue3 & 131072) != 0 ? (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getPopupTheme.onExtraCallback()) : getsubtitle;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1999981935, iIntValue, iIntValue2, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1 (TdsListRowV1.kt:664)");
        }
        if (zBooleanValue) {
            int i7 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            IAuthTabCallback2 = getViewTypeCount.IAuthTabCallback.Companion.IAuthTabCallback(f);
        } else {
            IAuthTabCallback2 = null;
        }
        int i9 = iIntValue >> 3;
        onExtraCallbackWithResult(getbacktracenote, onextracallback4, getbacktracenote2, onextracallbackOnNavigationEvent, onextracallbackOnWarmupCompleted, getbacktracenote3, onextracallbackOnNavigationEvent2, onextracallbackOnWarmupCompleted2, IAuthTabCallback2, iAuthTabCallbackStub2, asinterface2, onnavigationeventOnExtraCallback, ontransactOnExtraCallback, str2, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle2, cameraCaptureResultEmptyCameraCaptureResult, (i9 & 3670016) | (iIntValue & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (29360128 & i9) | ((iIntValue2 << 27) & 1879048192), (iIntValue2 >> 3) & 4194302, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i11 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public static final void onWarmupCompleted(@Nullable getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getViewTypeCount.onExtraCallback onextracallback, @Nullable getViewTypeCount.onExtraCallback onextracallback2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getViewTypeCount.onExtraCallback onextracallback3, @Nullable getViewTypeCount.onExtraCallback onextracallback4, float f, @Nullable getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable getViewTypeCount.asInterface asinterface, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent;
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted;
        getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub2;
        getViewTypeCount.asInterface asinterfaceIAuthTabCallback;
        String str2;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i3 & 8) != 0) {
            int i5 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        Object obj = null;
        if ((i3 & 16) != 0) {
            int i7 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 63 / 0;
            }
            getbacktracenote4 = null;
        } else {
            getbacktracenote4 = getbacktracenote2;
        }
        getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = (i3 & 32) != 0 ? getViewTypeCount.onExtraCallback.Companion.onNavigationEvent() : onextracallback;
        getViewTypeCount.onExtraCallback onextracallbackOnWarmupCompleted2 = (i3 & 64) != 0 ? getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted() : onextracallback2;
        if ((i3 & 128) != 0) {
            int i9 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            getbacktracenote5 = null;
        } else {
            getbacktracenote5 = getbacktracenote3;
        }
        if ((i3 & 256) != 0) {
            int i11 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            onextracallbackOnNavigationEvent = getViewTypeCount.onExtraCallback.Companion.onNavigationEvent();
        } else {
            onextracallbackOnNavigationEvent = onextracallback3;
        }
        if ((i3 & 512) != 0) {
            onextracallbackOnWarmupCompleted = getViewTypeCount.onExtraCallback.Companion.onWarmupCompleted();
            int i12 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        } else {
            onextracallbackOnWarmupCompleted = onextracallback4;
        }
        float fOnExtraCallbackWithResult = (i3 & 1024) != 0 ? w3a.onWarmupCompleted.onExtraCallbackWithResult() : f;
        if ((i3 & 2048) != 0) {
            int i14 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            iAuthTabCallbackStub2 = (getViewTypeCount.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted());
        } else {
            iAuthTabCallbackStub2 = iAuthTabCallbackStub;
        }
        if ((i3 & 4096) != 0) {
            int i16 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                getViewTypeCount.asInterface.Companion.IAuthTabCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            asinterfaceIAuthTabCallback = getViewTypeCount.asInterface.Companion.IAuthTabCallback();
        } else {
            asinterfaceIAuthTabCallback = asinterface;
        }
        if ((i3 & 8192) != 0) {
            int i17 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 87 / 0;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        Function0<Unit> function02 = (i3 & 16384) != 0 ? null : function0;
        if ((32768 & i3) != 0) {
            int i19 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        getSubtitle getsubtitle2 = (i3 & 65536) != 0 ? (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(getPopupTheme.onExtraCallback()) : getsubtitle;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2041525160, i, i2, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1 (TdsListRowV1.kt:705)");
        }
        int i21 = i >> 3;
        onExtraCallbackWithResult(getbacktracenote, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, getbacktracenote4, onextracallbackOnNavigationEvent2, onextracallbackOnWarmupCompleted2, getbacktracenote5, onextracallbackOnNavigationEvent, onextracallbackOnWarmupCompleted, z ? getViewTypeCount.IAuthTabCallback.Companion.IAuthTabCallback(fOnExtraCallbackWithResult) : null, iAuthTabCallbackStub2, asinterfaceIAuthTabCallback, str2, function02, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (29360128 & i21) | (i21 & 234881024), (i2 >> 3) & 524286, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Context context, Throwable th) {
        String simpleName;
        AtomicInteger atomicIntegerPutIfAbsent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        th.getMessage();
        Toast.makeText(context, "TdsListRowV1 IntrinsicMeasure Error(로그캣 확인)", 1).show();
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        if (activityIAuthTabCallback != null) {
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                activityIAuthTabCallback.getLocalClassName();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            simpleName = activityIAuthTabCallback.getLocalClassName();
            if (simpleName == null) {
                simpleName = context.getClass().getSimpleName();
                int i3 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMapIAuthTabCallback = w3a.onWarmupCompleted.IAuthTabCallback();
        AtomicInteger atomicInteger = concurrentHashMapIAuthTabCallback.get(simpleName);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMapIAuthTabCallback.putIfAbsent(simpleName, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        if (atomicInteger.incrementAndGet() <= 10) {
            isUserConsentSet.onExtraCallbackWithResult(getTcfVendorConsentStatus.Companion.onTransact(), "IntrinsicMeasureError", "source: " + simpleName, null, null, false, 28, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = i4 + 23;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(554843386, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.centerMeasurablesOf.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:777)");
                int i12 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            }
            getbacktracenote.invoke(w5a.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(191596551, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.centerMeasurablesOf.<anonymous>.<anonymous> (TdsListRowV1.kt:776)");
                    int i6 = 0 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(191596551, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.centerMeasurablesOf.<anonymous>.<anonymous> (TdsListRowV1.kt:776)");
                }
            }
            putBooleanArray.IAuthTabCallback(getViewTypeCount.asBinder.Center, ForwardingCameraControl.onExtraCallback(554843386, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda22
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 87;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnWarmupCompleted = w4.onWarmupCompleted(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    if (i9 == 0) {
                        int i10 = 7 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final List<component7> onWarmupCompleted(final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, isExtraPreviewRequired isextrapreviewrequired, Object obj) {
        List<component7> listIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (getbacktracenote == null || (listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(obj, ForwardingCameraControl.onExtraCallbackWithResult(191596551, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj3, Object obj4) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i6 = IAuthTabCallback + 25;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }))) == null) {
            return CollectionsKt.emptyList();
        }
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return listIAuthTabCallback;
    }

    private static final QuirkSettingsLoader.onNavigationEvent onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QuirkSettingsLoader.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent>) getsupportedhighspeedresolutionsfor);
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
        return onnavigationeventIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 5, i & 1)) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(324312746, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.rightMeasurablesOf.<anonymous>.<anonymous> (TdsListRowV1.kt:784)");
                    int i7 = 99 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(324312746, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.rightMeasurablesOf.<anonymous>.<anonymous> (TdsListRowV1.kt:784)");
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda25
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 113;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                        if (i10 == 0) {
                            return w4.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        }
                        w4.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            putBooleanArray.IAuthTabCallback(getViewTypeCount.asBinder.Right, ForwardingCameraControl.onExtraCallback(-1129095117, true, new onNavigationEvent((Function0) objOnMinimized, getbacktracenote), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
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
        int i9 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1374700270, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:796)");
            }
            getbacktracenote.invoke(w3b.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
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

    private static final Unit onNavigationEvent(final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-285669695, i, -1, "im.toss.tds.compose.component.compound.listrow.Contents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:795)");
            }
            putBooleanArray.IAuthTabCallback(getViewTypeCount.asBinder.Left, ForwardingCameraControl.onExtraCallback(1374700270, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = {getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    Unit unit = (Unit) w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1874404819, 1874404826);
                    int i8 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 69 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (objectRef.element == null) {
            int i4 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return (List) objectRef2.element;
            }
            throw null;
        }
        List<component7> listOnWarmupCompleted = onWarmupCompleted((getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, isextrapreviewrequired, w2a.AdjustedCenter);
        int i5 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return listOnWarmupCompleted;
        }
        throw null;
    }

    private static final List<component7> IAuthTabCallback(Ref.ObjectRef<List<getStreamSharingChildren>> objectRef, Ref.ObjectRef<List<component7>> objectRef2, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, isExtraPreviewRequired isextrapreviewrequired, getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (objectRef.element != null) {
            Object[] objArr = {getbacktracenote, isextrapreviewrequired, getsupportedhighspeedresolutionsfor, w2a.AdjustedRight};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1108119147, -1108119141);
        }
        List<component7> list = (List) objectRef2.element;
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x053d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final component8 IAuthTabCallback(final getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, final putCharSequenceArray putcharsequencearray, Function1 function1, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final pin pinVar, final getViewTypeCount.onExtraCallback onextracallback, final getViewTypeCount.onExtraCallback onextracallback2, final getViewTypeCount.onExtraCallback onextracallback3, final getViewTypeCount.onExtraCallback onextracallback4, final isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) throws NoWhenBranchMatchedException {
        List listEmptyList;
        boolean z;
        QuirkSettingsLoader.onNavigationEvent onnavigationeventAsBinder;
        int i;
        int i2;
        int iOnExtraCallback;
        int i3;
        int i4;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        int iOnExtraCallback2;
        boolean z2;
        List arrayList;
        List list;
        ArrayList arrayList2;
        int iOnExtraCallbackWithResult;
        final boolean z3;
        final int i5;
        int iMax;
        int i6;
        int i7;
        List list2;
        Integer numValueOf;
        List list3;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = onWarmupCompleted((getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, isextrapreviewrequired, getViewTypeCount.asBinder.Center);
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{getbacktracenote3, isextrapreviewrequired, getsupportedhighspeedresolutionsfor, getViewTypeCount.asBinder.Right}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1108119147, -1108119141);
        if (getbacktracenote == null || (listEmptyList = isextrapreviewrequired.IAuthTabCallback(getViewTypeCount.asBinder.Left, ForwardingCameraControl.onExtraCallbackWithResult(-285669695, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 69;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitIAuthTabCallback = w4.IAuthTabCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i12 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitIAuthTabCallback;
            }
        }))) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (getbacktracenote2 == null || getbacktracenote3 == null || !iAuthTabCallbackStub.IAuthTabCallback(putcharsequencearray)) {
            z = false;
        } else {
            int i9 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        if (z) {
            int i11 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            onnavigationeventAsBinder = onextracallbackwithresult.IAuthTabCallbackStubProxy();
        } else {
            onnavigationeventAsBinder = onextracallbackwithresult.asBinder();
        }
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent>) getsupportedhighspeedresolutionsfor, onnavigationeventAsBinder);
        int iAsInterface = VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback());
        int iIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback());
        Triple<Integer, Integer, List<getStreamSharingChildren>> tripleOnExtraCallback = lExternalSyntheticLambda6.onExtraCallback(listEmptyList, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iAsInterface, 0, 0, 13, (Object) null));
        final int iIntValue = ((Number) tripleOnExtraCallback.onExtraCallbackWithResult()).intValue();
        int iIntValue2 = ((Number) tripleOnExtraCallback.onExtraCallback()).intValue();
        final List list4 = (List) tripleOnExtraCallback.IAuthTabCallback();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iAsInterface - iIntValue, 0);
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        Integer numValueOf2 = null;
        try {
            List list5 = (List) objectRef3.element;
            if (list5.isEmpty()) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((component7) list5.get(0)).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                int lastIndex = CollectionsKt.getLastIndex(list5);
                if (lastIndex > 0) {
                    int i13 = 1;
                    while (true) {
                        Integer numValueOf3 = Integer.valueOf(((component7) list5.get(i13)).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                        if (numValueOf3.compareTo(numValueOf) > 0) {
                            int i14 = onExtraCallbackWithResult + 77;
                            list3 = list5;
                            onNavigationEvent = i14 % 128;
                            int i15 = i14 % 2;
                            numValueOf = numValueOf3;
                        } else {
                            list3 = list5;
                        }
                        if (i13 == lastIndex) {
                            break;
                        }
                        int i16 = onExtraCallbackWithResult + 57;
                        onNavigationEvent = i16 % 128;
                        i13 = i16 % 2 == 0 ? i13 + 103 : i13 + 1;
                        list5 = list3;
                    }
                }
            }
            if (numValueOf != null) {
                iOnExtraCallback = numValueOf.intValue();
                i = iCoerceAtLeast;
                i2 = iIntValue2;
            } else {
                int i17 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i17 % 128;
                int i18 = i17 % 2;
                i = iCoerceAtLeast;
                i2 = iIntValue2;
                iOnExtraCallback = 0;
            }
        } catch (Exception e) {
            function1.invoke(e);
            List<component7> listOnWarmupCompleted = onWarmupCompleted((getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, isextrapreviewrequired, w2a.Center);
            objectRef3.element = listOnWarmupCompleted;
            ArrayList arrayList3 = new ArrayList(listOnWarmupCompleted.size());
            int size = listOnWarmupCompleted.size();
            int i19 = 0;
            while (i19 < size) {
                arrayList3.add(listOnWarmupCompleted.get(i19).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast, 0, 0, 13, (Object) null)));
                i19++;
                iIntValue2 = iIntValue2;
                iCoerceAtLeast = iCoerceAtLeast;
            }
            i = iCoerceAtLeast;
            i2 = iIntValue2;
            objectRef5.element = arrayList3;
            iOnExtraCallback = y1g.onExtraCallback(arrayList3);
        }
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        try {
            List list6 = (List) objectRef4.element;
            if (!list6.isEmpty()) {
                numValueOf2 = Integer.valueOf(((component7) list6.get(0)).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                int lastIndex2 = CollectionsKt.getLastIndex(list6);
                if (lastIndex2 > 0) {
                    int i20 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    Integer num = numValueOf2;
                    int i22 = 1;
                    while (true) {
                        Integer numValueOf4 = Integer.valueOf(((component7) list6.get(i22)).onExtraCallbackWithResult(iIAuthTabCallbackDefault));
                        if (numValueOf4.compareTo(num) > 0) {
                            int i23 = onExtraCallbackWithResult + 41;
                            list2 = list6;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            num = numValueOf4;
                        } else {
                            list2 = list6;
                        }
                        if (i22 == lastIndex2) {
                            break;
                        }
                        i22++;
                        list6 = list2;
                    }
                    numValueOf2 = num;
                }
            }
            if (numValueOf2 != null) {
                int i25 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                i4 = i2;
                i3 = i;
                iOnExtraCallback2 = numValueOf2.intValue();
                objectRef = objectRef6;
                objectRef2 = objectRef5;
            } else {
                i4 = i2;
                i3 = i;
                objectRef = objectRef6;
                objectRef2 = objectRef5;
                iOnExtraCallback2 = 0;
            }
        } catch (Exception e2) {
            function1.invoke(e2);
            i3 = i;
            i4 = i2;
            objectRef = objectRef6;
            objectRef2 = objectRef5;
            List list7 = (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{getbacktracenote3, isextrapreviewrequired, getsupportedhighspeedresolutionsfor, w2a.Right}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1108119147, -1108119141);
            objectRef4.element = list7;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size2 = list7.size();
            for (int i27 = 0; i27 < size2; i27++) {
                arrayList4.add(((component7) list7.get(i27)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, i3, 0, 0, 13, (Object) null)));
            }
            objectRef.element = arrayList4;
            iOnExtraCallback2 = y1g.onExtraCallback(arrayList4);
        }
        int iOnExtraCallbackWithResult2 = isextrapreviewrequired.onExtraCallbackWithResult(w3a.onWarmupCompleted.onWarmupCompleted());
        boolean z4 = (iOnExtraCallback2 + iOnExtraCallback) + iOnExtraCallbackWithResult2 > i3 && iOnExtraCallback2 > 0 && iOnExtraCallback > 0;
        if (z || !z4) {
            Ref.ObjectRef objectRef7 = objectRef;
            z2 = true;
            List list8 = (List) objectRef2.element;
            if (list8 == null) {
                List list9 = (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{objectRef2, objectRef3, getbacktracenote2, isextrapreviewrequired}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 301365379, -301365370);
                ArrayList arrayList5 = new ArrayList(list9.size());
                int size3 = list9.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    arrayList5.add(((component7) list9.get(i28)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, i3, 0, 0, 13, (Object) null)));
                }
                arrayList = arrayList5;
            } else {
                arrayList = list8;
            }
            List list10 = (List) objectRef7.element;
            if (list10 != null) {
                list = list10;
                final List list11 = arrayList;
                int iIAuthTabCallback = y1g.IAuthTabCallback(list11);
                if (iAuthTabCallback == null) {
                    int i29 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i29 % 128;
                    int i30 = i29 % 2;
                    iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(iAuthTabCallback.asInterface());
                } else {
                    iOnExtraCallbackWithResult = 0;
                }
                final int iCoerceAtLeast2 = RangesKt.coerceAtLeast(iIAuthTabCallback, iOnExtraCallbackWithResult);
                int iIAuthTabCallback2 = y1g.IAuthTabCallback(list);
                z3 = (z || iIAuthTabCallback2 <= 0 || iCoerceAtLeast2 <= 0) ? false : z2;
                final int iOnExtraCallbackWithResult3 = isextrapreviewrequired.onExtraCallbackWithResult(w3a.onWarmupCompleted.IAuthTabCallbackStub());
                if (z3) {
                    i5 = i4;
                    iMax = Math.max(i5, Math.max(iCoerceAtLeast2, iIAuthTabCallback2));
                } else {
                    int i31 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i31 % 128;
                    int i32 = i31 % 2;
                    i5 = i4;
                    iMax = Math.max(i5, iCoerceAtLeast2) + iIAuthTabCallback2 + iOnExtraCallbackWithResult3;
                }
                final int i33 = i3;
                final List list12 = list;
                final int i34 = iMax;
                return component4.IAuthTabCallback(isextrapreviewrequired, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda24
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i35 = 2 % 2;
                        int i36 = onWarmupCompleted + 35;
                        onExtraCallbackWithResult = i36 % 128;
                        int i37 = i36 % 2;
                        Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(putcharsequencearray, isextrapreviewrequired, iCoerceAtLeast2, pinVar, onextracallback, onextracallback2, list4, z3, i5, list11, list12, onextracallback3, onextracallback4, i34, iIntValue, iOnExtraCallbackWithResult3, i33, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        int i38 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i38 % 128;
                        if (i38 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }, 4, (Object) null);
            }
            List<component7> listIAuthTabCallback = IAuthTabCallback(objectRef7, objectRef4, getbacktracenote3, isextrapreviewrequired, getsupportedhighspeedresolutionsfor);
            arrayList2 = new ArrayList(listIAuthTabCallback.size());
            int size4 = listIAuthTabCallback.size();
            for (int i35 = 0; i35 < size4; i35++) {
                arrayList2.add(listIAuthTabCallback.get(i35).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, i3, 0, 0, 13, (Object) null)));
            }
        } else {
            int iOnExtraCallbackWithResult4 = isextrapreviewrequired.onExtraCallbackWithResult(asinterface.onNavigationEvent());
            int i36 = IAuthTabCallback.onNavigationEvent[asinterface.onExtraCallbackWithResult().ordinal()];
            z2 = true;
            if (i36 == 1) {
                Ref.ObjectRef objectRef8 = objectRef;
                int i37 = 0;
                int iCoerceAtMost = RangesKt.coerceAtMost(iOnExtraCallback2, iOnExtraCallbackWithResult4);
                if (asinterface.onExtraCallback() && (i6 = (i3 - iOnExtraCallback) - iOnExtraCallbackWithResult2) > iCoerceAtMost) {
                    iCoerceAtMost = i6;
                }
                int iCoerceAtLeast3 = RangesKt.coerceAtLeast(iCoerceAtMost, 0);
                List list13 = (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{objectRef2, objectRef3, getbacktracenote2, isextrapreviewrequired}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 301365379, -301365370);
                arrayList = new ArrayList(list13.size());
                int size5 = list13.size();
                int i38 = 0;
                while (i38 < size5) {
                    arrayList.add(((component7) list13.get(i38)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceAtLeast((i3 - iOnExtraCallbackWithResult2) - iCoerceAtLeast3, i37), 0, 0, 13, (Object) null)));
                    i38++;
                    objectRef8 = objectRef8;
                    i37 = 0;
                }
                List<component7> listIAuthTabCallback2 = IAuthTabCallback(objectRef8, objectRef4, getbacktracenote3, isextrapreviewrequired, getsupportedhighspeedresolutionsfor);
                arrayList2 = new ArrayList(listIAuthTabCallback2.size());
                int size6 = listIAuthTabCallback2.size();
                for (int i39 = 0; i39 < size6; i39++) {
                    arrayList2.add(listIAuthTabCallback2.get(i39).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast3, 0, 0, 13, (Object) null)));
                }
                Unit unit = Unit.INSTANCE;
            } else {
                if (i36 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int iCoerceAtMost2 = RangesKt.coerceAtMost(iOnExtraCallback, iOnExtraCallbackWithResult4);
                if (asinterface.onExtraCallback()) {
                    i7 = 0;
                    int iCoerceAtLeast4 = RangesKt.coerceAtLeast((i3 - iOnExtraCallback2) - iOnExtraCallbackWithResult2, 0);
                    if (iCoerceAtLeast4 > iCoerceAtMost2) {
                        iCoerceAtMost2 = iCoerceAtLeast4;
                    }
                } else {
                    i7 = 0;
                }
                List list14 = (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{objectRef2, objectRef3, getbacktracenote2, isextrapreviewrequired}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 301365379, -301365370);
                arrayList = new ArrayList(list14.size());
                int size7 = list14.size();
                for (int i40 = i7; i40 < size7; i40++) {
                    arrayList.add(((component7) list14.get(i40)).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtMost2, 0, 0, 12, (Object) null)));
                }
                List<component7> listIAuthTabCallback3 = IAuthTabCallback(objectRef, objectRef4, getbacktracenote3, isextrapreviewrequired, getsupportedhighspeedresolutionsfor);
                arrayList2 = new ArrayList(listIAuthTabCallback3.size());
                int size8 = listIAuthTabCallback3.size();
                for (int i41 = i7; i41 < size8; i41++) {
                    arrayList2.add(listIAuthTabCallback3.get(i41).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, RangesKt.coerceAtLeast((i3 - iOnExtraCallbackWithResult2) - iCoerceAtMost2, i7), 0, 0, 13, (Object) null)));
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        list = arrayList2;
        final List list112 = arrayList;
        int iIAuthTabCallback3 = y1g.IAuthTabCallback(list112);
        if (iAuthTabCallback == null) {
        }
        final int iCoerceAtLeast22 = RangesKt.coerceAtLeast(iIAuthTabCallback3, iOnExtraCallbackWithResult);
        int iIAuthTabCallback22 = y1g.IAuthTabCallback(list);
        if (z) {
        }
        final int iOnExtraCallbackWithResult32 = isextrapreviewrequired.onExtraCallbackWithResult(w3a.onWarmupCompleted.IAuthTabCallbackStub());
        if (z3) {
        }
        final int i332 = i3;
        final List list122 = list;
        final int i342 = iMax;
        return component4.IAuthTabCallback(isextrapreviewrequired, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda24
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i352 = 2 % 2;
                int i362 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i362 % 128;
                int i372 = i362 % 2;
                Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(putcharsequencearray, isextrapreviewrequired, iCoerceAtLeast22, pinVar, onextracallback, onextracallback2, list4, z3, i5, list112, list122, onextracallback3, onextracallback4, i342, iIntValue, iOnExtraCallbackWithResult32, i332, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i382 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i382 % 128;
                if (i382 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 4, (Object) null);
    }

    private static final Unit onExtraCallback(putCharSequenceArray putcharsequencearray, isExtraPreviewRequired isextrapreviewrequired, int i, pin pinVar, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, List list, boolean z, int i2, List list2, List list3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, int i3, int i4, int i5, int i6, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i7;
        getViewTypeCount.onExtraCallback onextracallback5;
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getViewTypeCount.asBinder asbinder = getViewTypeCount.asBinder.Center;
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<accessgetTlsVersionsAsStringp> onExtraCallback = putBooleanArray.onExtraCallback();
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback = putcharsequencearray.IAuthTabCallback(asbinder, new putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), onExtraCallback));
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) ((r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback == null || (onwarmupcompletedIAuthTabCallback = r8lambda3ckywq3ss3onutwsvbshr4mmayIAuthTabCallback.IAuthTabCallback()) == null) ? null : onwarmupcompletedIAuthTabCallback.onWarmupCompleted(onExtraCallback));
        connectionCount connectioncountOnWarmupCompleted = accessgettlsversionsasstringp != null ? AppLovinInitProvider.onWarmupCompleted(accessgettlsversionsasstringp, 0.0f, 1, (Object) null) : null;
        int i9 = 0;
        if (connectioncountOnWarmupCompleted != null) {
            int i10 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            float fOnWarmupCompleted = AppLovinInitProvider.onWarmupCompleted(onextracallbackwithresult, connectioncountOnWarmupCompleted, w3a.onWarmupCompleted.asInterface());
            long jOnWarmupCompleted = AppLovinInitProvider.onWarmupCompleted(onextracallbackwithresult, connectioncountOnWarmupCompleted, 0.0f, 2, null);
            RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnWarmupCompleted);
            int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback(((Float) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnWarmupCompleted), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnWarmupCompleted) * fOnWarmupCompleted)), Float.valueOf(onextracallbackwithresult.c_(jOnWarmupCompleted)), isextrapreviewrequired}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1902972198, 1902972203)).floatValue());
            int i12 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i7 = iOnExtraCallback;
        } else {
            i7 = i;
        }
        if (CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(onextracallbackwithresult.onNavigationEvent(), pinVar)) {
            onextracallback5 = onextracallback;
        } else {
            int i14 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            onextracallback5 = onextracallback2;
        }
        int size = list.size();
        int i16 = 0;
        while (i16 < size) {
            int i17 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) list.get(i16);
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, onExtraCallbackWithResult(onextracallbackwithresult, onextracallback5, getstreamsharingchildren.T_(), i3, i7), 0.0f, 4, (Object) null);
            i16++;
            size = size;
            onextracallback5 = onextracallback5;
        }
        if (z) {
            int iMax = Math.max(i2, i);
            int size2 = list2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                int i20 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) list2.get(i19);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, i4, (iMax - getstreamsharingchildren2.T_()) / 2, 0.0f, 4, (Object) null);
            }
            int size3 = list3.size();
            while (i9 < size3) {
                int i22 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i22 % 128;
                if (i22 % 2 == 0) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i9), i4, iMax / i5, 0.0f, 2, (Object) null);
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i9), i4, iMax + i5, 0.0f, 4, (Object) null);
                    i9++;
                }
            }
        } else {
            getViewTypeCount.onExtraCallback onextracallback6 = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(onextracallbackwithresult.onNavigationEvent(), pinVar) ? onextracallback3 : onextracallback4;
            int size4 = list2.size();
            for (int i23 = 0; i23 < size4; i23++) {
                getStreamSharingChildren getstreamsharingchildren3 = (getStreamSharingChildren) list2.get(i23);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, i4, (i3 - getstreamsharingchildren3.T_()) / 2, 0.0f, 4, (Object) null);
            }
            int size5 = list3.size();
            while (i9 < size5) {
                getStreamSharingChildren getstreamsharingchildren4 = (getStreamSharingChildren) list3.get(i9);
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren4, (i6 - getstreamsharingchildren4.getInterfaceDescriptor()) + i4, onExtraCallbackWithResult(onextracallbackwithresult, onextracallback6, getstreamsharingchildren4.T_(), i3, i7), 0.0f, 4, (Object) null);
                i9++;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i24 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final putCharSequenceArray putcharsequencearray, final getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, final getViewTypeCount.onExtraCallback onextracallback, final getViewTypeCount.onExtraCallback onextracallback2, final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, final getViewTypeCount.onExtraCallback onextracallback3, final getViewTypeCount.onExtraCallback onextracallback4, final getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, final getViewTypeCount.asInterface asinterface, final getViewTypeCount.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Function1 function1;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1534951248);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putcharsequencearray) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 72 / 0;
                i9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
            }
            i3 |= i9;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i13 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                int i14 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            int i16 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3)) {
                int i18 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3)) {
                int i20 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback4)) {
                int i22 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(asinterface) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1534951248, i3, i4, "im.toss.tds.compose.component.compound.listrow.Contents (TdsListRowV1.kt:750)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(QuirkSettingsLoader.Companion.asBinder(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            if (getTcfVendorConsentStatus.Companion.onNavigationEvent().onWarmupCompleted()) {
                int i24 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-783361808);
                final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda14
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i26 = 2 % 2;
                            int i27 = onExtraCallback + 67;
                            onNavigationEvent = i27 % 128;
                            int i28 = i27 % 2;
                            Unit unitOnExtraCallbackWithResult = w4.onExtraCallbackWithResult(context, (Throwable) obj2);
                            int i29 = onNavigationEvent + 11;
                            onExtraCallback = i29 % 128;
                            if (i29 % 2 == 0) {
                                int i30 = 54 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                function1 = (Function1) objOnMinimized2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-782523041);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda15
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i26 = 2 % 2;
                            int i27 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i27 % 128;
                            Throwable th = (Throwable) obj2;
                            if (i27 % 2 != 0) {
                                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                                throw null;
                            }
                            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                            Unit unit = (Unit) w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{th}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 1590692497, -1590692484);
                            int i28 = onExtraCallbackWithResult + 119;
                            onNavigationEvent = i28 % 128;
                            int i29 = i28 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                function1 = (Function1) objOnMinimized3;
            }
            final pin pinVarOnNavigationEvent = readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult()));
            if ((57344 & i3) == 16384) {
                int i26 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i26 % 128;
                boolean z2 = i26 % 2 != 0;
                boolean z3 = (458752 & i3) == 131072;
                boolean z4 = (i3 & 112) == 32;
                if ((234881024 & i3) == 67108864) {
                    int i27 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = (i3 & 14) == 4;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function1);
                boolean z6 = (i3 & 1879048192) == 536870912;
                boolean z7 = (i4 & 14) == 4;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pinVarOnNavigationEvent.ordinal());
                boolean z8 = (i3 & 7168) == 2048;
                boolean z9 = (i3 & 896) == 256;
                boolean z10 = (29360128 & i3) == 8388608;
                boolean z11 = (i3 & 3670016) == 1048576;
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (((z2 | z3 | z4 | z | z5 | zOnNavigationEvent | z6 | z7 | zOnExtraCallback2 | z8 | z9 | z10) || z11) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    final Function1 function12 = function1;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda16
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                            int i29 = 2 % 2;
                            int i30 = onNavigationEvent + 115;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            component8 component8VarOnExtraCallback = w4.onExtraCallback(getbacktracenote, getbacktracenote2, getbacktracenote3, iAuthTabCallbackStub, putcharsequencearray, function12, asinterface, iAuthTabCallback, getsupportedhighspeedresolutionsfor, pinVarOnNavigationEvent, onextracallback2, onextracallback, onextracallback4, onextracallback3, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                            int i32 = onNavigationEvent + 71;
                            onWarmupCompleted = i32 % 128;
                            int i33 = i32 % 2;
                            return component8VarOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function2);
                    objOnMinimized4 = function2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                hasVideoCapture.onExtraCallback((QuirksExternalSyntheticBackport0) null, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i29 = 2 % 2;
                    int i30 = onWarmupCompleted + 53;
                    IAuthTabCallback = i30 % 128;
                    int i31 = i30 % 2;
                    putCharSequenceArray putcharsequencearray2 = putcharsequencearray;
                    getBacktraceNote getbacktracenote4 = getbacktracenote;
                    getViewTypeCount.onExtraCallback onextracallback5 = onextracallback;
                    getViewTypeCount.onExtraCallback onextracallback6 = onextracallback2;
                    getBacktraceNote getbacktracenote5 = getbacktracenote2;
                    getBacktraceNote getbacktracenote6 = getbacktracenote3;
                    getViewTypeCount.onExtraCallback onextracallback7 = onextracallback3;
                    getViewTypeCount.onExtraCallback onextracallback8 = onextracallback4;
                    getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                    getViewTypeCount.asInterface asinterface2 = asinterface;
                    getViewTypeCount.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    int i32 = i;
                    int i33 = i2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr = {putcharsequencearray2, getbacktracenote4, onextracallback5, onextracallback6, getbacktracenote5, getbacktracenote6, onextracallback7, onextracallback8, iAuthTabCallbackStub2, asinterface2, iAuthTabCallback2, Integer.valueOf(i32), Integer.valueOf(i33), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                    Unit unit = (Unit) w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1868848525, 1868848528);
                    int i34 = onWarmupCompleted + 89;
                    IAuthTabCallback = i34 % 128;
                    if (i34 % 2 != 0) {
                        int i35 = 48 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    public static final class onNavigationEvent implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
        final /* synthetic */ Function0<QuirkSettingsLoader.onNavigationEvent> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(Function0<? extends QuirkSettingsLoader.onNavigationEvent> function0, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
            this.onNavigationEvent = function0;
            this.IAuthTabCallback = getbacktracenote;
        }

        public final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            boolean z;
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 91;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 2) == 3) {
                int i6 = i3 + 63;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                int i8 = i5 + 75;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 23;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1129095117, i, -1, "im.toss.tds.compose.component.compound.listrow.Right.<anonymous> (TdsListRowV1.kt:980)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1129095117, i, -1, "im.toss.tds.compose.component.compound.listrow.Right.<anonymous> (TdsListRowV1.kt:980)");
            }
            setCallToAction.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = setCallToAction.onExtraCallbackWithResult.IAuthTabCallback((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback()), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, setCallToAction.IAuthTabCallback.Companion.onNavigationEvent(), null, 8, null);
            final Function0<QuirkSettingsLoader.onNavigationEvent> function0 = this.onNavigationEvent;
            final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.IAuthTabCallback;
            putCharSequence.onExtraCallback(null, null, null, null, onextracallbackwithresultIAuthTabCallback, false, ForwardingCameraControl.onExtraCallback(-53608833, true, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: o.w4.onNavigationEvent.5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
                    Unit unit = Unit.INSTANCE;
                    int i14 = onExtraCallbackWithResult + 77;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i11) {
                    boolean z2;
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 37;
                    int i14 = i13 % 128;
                    IAuthTabCallback = i14;
                    int i15 = i13 % 2;
                    if ((i11 & 3) != 2) {
                        int i16 = i14 + 95;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z2, i11 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        return;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-53608833, i11, -1, "im.toss.tds.compose.component.compound.listrow.Right.<anonymous>.<anonymous> (TdsListRowV1.kt:987)");
                    }
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function0);
                    Function0<QuirkSettingsLoader.onNavigationEvent> function02 = function0;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!zOnNavigationEvent) {
                        int i18 = onExtraCallbackWithResult + 39;
                        IAuthTabCallback = i18 % 128;
                        int i19 = i18 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new RightPreset(function02);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                            int i20 = IAuthTabCallback + 25;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }
                    getbacktracenote.invoke((RightPreset) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i22 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                    }
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 47);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (IAuthTabCallback(r10) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return java.lang.Float.valueOf(r10.c_(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        r10 = o.AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(r1) / o.AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(r10.onWarmupCompleted(r3));
        r0 = o.w4.onExtraCallbackWithResult + 47;
        o.w4.onNavigationEvent = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (IAuthTabCallback(r10) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        float fOnWarmupCompleted;
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        long jOnExtraCallback = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallback(jLongValue);
        AvoidPostviewAvailabilityCheckQuirk.onWarmupCompleted onwarmupcompleted = AvoidPostviewAvailabilityCheckQuirk.Companion;
        if (AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(jOnExtraCallback, onwarmupcompleted.onWarmupCompleted())) {
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 13 / 0;
            }
        } else {
            if (!AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(jOnExtraCallback, onwarmupcompleted.onNavigationEvent())) {
                return Float.valueOf(Float.NaN);
            }
            int i6 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            fOnWarmupCompleted = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jLongValue);
            int i8 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 2;
            }
        }
        return Float.valueOf(fOnWarmupCompleted * fFloatValue);
    }

    private static final boolean IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() > 1.05d) {
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r6
      0x0025: PHI (r6v8 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
      0x0023: PHI (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1566195134);
            int i4 = 43 / 0;
            z = i != 0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1566195134);
            if (i != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) w2ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            } else {
                int i6 = 38 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1566195134, i, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreview (TdsListRowV1.kt:1028)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) w2ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnNavigationEvent;
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        unitOnNavigationEvent = w4.onNavigationEvent(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i9 = 64 / 0;
                    } else {
                        unitOnNavigationEvent = w4.onNavigationEvent(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i10 = onWarmupCompleted + 37;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        int i7 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final void IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(475570786);
        if (i != 0) {
            int i3 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(475570786, i, -1, "im.toss.tds.compose.component.compound.listrow.TdsListRowV1Preview (TdsListRowV1.kt:1132)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) w2ExternalSyntheticLambda0.onNavigationEvent.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListRowV1Kt$.ExternalSyntheticLambda4(i));
        }
        int i8 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 86 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r5
      0x0022: PHI (r5v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2074376221);
            int i4 = 36 / 0;
            if (i != 0) {
                int i5 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    z = true;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2074376221);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2074376221, i, -1, "im.toss.tds.compose.component.compound.listrow.ServicePreview (TdsListRowV1.kt:1253)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) w2ExternalSyntheticLambda0.onNavigationEvent.ICustomTabsCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListRowV1Kt$.ExternalSyntheticLambda3(i));
        }
        int i6 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-144135155);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-144135155);
        int i4 = 0;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-144135155, i, -1, "im.toss.tds.compose.component.compound.listrow.CenterRowPreview (TdsListRowV1.kt:1409)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface = focusMeteringControlExternalSyntheticLambda12.asInterface();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventAsInterface, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i5 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1262423679);
            w2ExternalSyntheticLambda0 w2externalsyntheticlambda0 = w2ExternalSyntheticLambda0.onNavigationEvent;
            char c = '\n';
            List listListOf = CollectionsKt.listOf(new getBacktraceNote[]{(getBacktraceNote) w2ExternalSyntheticLambda0.onNavigationEvent(-1558952517, 1558952525, new Object[]{w2externalsyntheticlambda0}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()), w2externalsyntheticlambda0.extraCallbackWithResult(), w2externalsyntheticlambda0.readTypedObject(), w2externalsyntheticlambda0.getInterfaceDescriptor(), w2externalsyntheticlambda0.access000(), w2externalsyntheticlambda0.IAuthTabCallbackDefault(), w2externalsyntheticlambda0.asBinder(), w2externalsyntheticlambda0.IAuthTabCallbackStub(), w2externalsyntheticlambda0.asInterface(), (getBacktraceNote) w2ExternalSyntheticLambda0.onNavigationEvent(-2035849945, 2035849958, new Object[]{w2externalsyntheticlambda0}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()), w2externalsyntheticlambda0.IAuthTabCallback(), w2externalsyntheticlambda0.extraCallback(), w2externalsyntheticlambda0.writeTypedObject(), w2externalsyntheticlambda0.IAuthTabCallback_Parcel(), w2externalsyntheticlambda0.access100()});
            int size = listListOf.size();
            int i6 = 0;
            while (i6 < size) {
                onExtraCallbackWithResult((getBacktraceNote) listListOf.get(i6), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 131070);
                i6++;
                i4 = i4;
                c = '\n';
            }
            int i7 = i4;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance, QuirksExternalSyntheticBackport0.Companion, 1.0f, false, 2, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i8 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                    int i9 = 39 / i7;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i10 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(778384904);
            w2ExternalSyntheticLambda0 w2externalsyntheticlambda02 = w2ExternalSyntheticLambda0.onNavigationEvent;
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteMayLaunchUrl = w2externalsyntheticlambda02.mayLaunchUrl();
            getBacktraceNote getbacktracenote = (getBacktraceNote) w2ExternalSyntheticLambda0.onNavigationEvent(217867271, -217867238, new Object[]{w2externalsyntheticlambda02}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteICustomTabsCallbackStub = w2externalsyntheticlambda02.ICustomTabsCallbackStub();
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteICustomTabsCallbackDefault = w2externalsyntheticlambda02.ICustomTabsCallbackDefault();
            getBacktraceNote getbacktracenote2 = (getBacktraceNote) w2ExternalSyntheticLambda0.onNavigationEvent(-956405762, 956405782, new Object[]{w2externalsyntheticlambda02}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnRelationshipValidationResult = w2externalsyntheticlambda02.onRelationshipValidationResult();
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnMinimized = w2externalsyntheticlambda02.onMinimized();
            getBacktraceNote getbacktracenote3 = (getBacktraceNote) w2ExternalSyntheticLambda0.onNavigationEvent(-951844593, 951844622, new Object[]{w2externalsyntheticlambda02}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnPostMessage = w2externalsyntheticlambda02.onPostMessage();
            getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnActivityLayout = w2externalsyntheticlambda02.onActivityLayout();
            getBacktraceNote[] getbacktracenoteArr = new getBacktraceNote[10];
            getbacktracenoteArr[i7] = getbacktracenoteMayLaunchUrl;
            getbacktracenoteArr[1] = getbacktracenote;
            getbacktracenoteArr[2] = getbacktracenoteICustomTabsCallbackStub;
            getbacktracenoteArr[3] = getbacktracenoteICustomTabsCallbackDefault;
            getbacktracenoteArr[4] = getbacktracenote2;
            getbacktracenoteArr[5] = getbacktracenoteOnRelationshipValidationResult;
            getbacktracenoteArr[6] = getbacktracenoteOnMinimized;
            getbacktracenoteArr[7] = getbacktracenote3;
            getbacktracenoteArr[8] = getbacktracenoteOnPostMessage;
            getbacktracenoteArr[9] = getbacktracenoteOnActivityLayout;
            List listListOf2 = CollectionsKt.listOf(getbacktracenoteArr);
            int size2 = listListOf2.size();
            while (i7 < size2) {
                onExtraCallbackWithResult(w2ExternalSyntheticLambda0.onNavigationEvent.isEngagementSignalsApiAvailable(), null, null, null, null, (getBacktraceNote) listListOf2.get(i7), null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 131038);
                i7++;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 113;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnTransact = w4.onTransact(i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnTransact;
                }
            });
        }
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-491621207);
        if (i != 0) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-491621207, i, -1, "im.toss.tds.compose.component.compound.listrow.LeftAssetPreview (TdsListRowV1.kt:1460)");
            }
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{CollectionsKt.flatten(clearFaultAdjacentMetadata.onExtraCallback(new List[]{getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent.getEntries(), getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.EnumC0027IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent.IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent.onExtraCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent.EnumC0033onNavigationEvent.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent.onWarmupCompleted.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted.onNavigationEvent.getEntries(), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted.C0034onExtraCallbackWithResult.onExtraCallback), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult)})), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1291431202, 1291431212);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsListRowV1Kt$.ExternalSyntheticLambda7(i));
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-210921887);
        if (iIntValue != 0) {
            z = true;
        } else {
            int i4 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-210921887, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.LeftAssetPreview2 (TdsListRowV1.kt:1484)");
            }
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{CollectionsKt.flatten(clearFaultAdjacentMetadata.onExtraCallback(new List[]{getViewTypeCount.onExtraCallbackWithResult.onExtraCallback.IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.onExtraCallback.EnumC0030onExtraCallbackWithResult.getEntries(), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.onExtraCallback.C0029onExtraCallback.onWarmupCompleted), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.onNavigationEvent.onExtraCallback), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.C0032onExtraCallbackWithResult.onWarmupCompleted), CollectionsKt.listOf(getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted), getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.onWarmupCompleted.getEntries(), getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult.IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.asInterface.IAuthTabCallback.getEntries(), getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent.getEntries()})), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1291431202, 1291431212);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 31;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnExtraCallback = w4.onExtraCallback(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i9 = onWarmupCompleted + 119;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        int i6 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final String IAuthTabCallback(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        String canonicalName = onextracallbackwithresult.getClass().getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        String strRemovePrefix = StringsKt.removePrefix(canonicalName, onextracallbackwithresult.getClass().getPackageName() + ".TdsListRowV1.");
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return strRemovePrefix;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onExtraCallback(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = onextracallbackwithresult instanceof Enum;
            throw null;
        }
        if (onextracallbackwithresult instanceof Enum) {
            return ((Enum) onextracallbackwithresult).name();
        }
        int i4 = i3 + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0137 A[PHI: r3 r5
      0x0137: PHI (r3v12 int) = (r3v11 int), (r3v17 int) binds: [B:41:0x0135, B:38:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r5v28 o.y3ExternalSyntheticLambda0) = (r5v27 o.y3ExternalSyntheticLambda0), (r5v36 o.y3ExternalSyntheticLambda0) binds: [B:41:0x0135, B:38:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146 A[PHI: r3 r5
      0x0146: PHI (r3v16 int) = (r3v11 int), (r3v17 int) binds: [B:41:0x0135, B:38:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v33 o.y3ExternalSyntheticLambda0) = (r5v27 o.y3ExternalSyntheticLambda0), (r5v36 o.y3ExternalSyntheticLambda0) binds: [B:41:0x0135, B:38:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Pair pairIAuthTabCallback;
        int i;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jAudioAttributesImplBaseParcelizer;
        getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult = (getViewTypeCount.onExtraCallbackWithResult) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                throw null;
            }
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
        }
        int i4 = iIntValue;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 19) != 18, i4 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-933664368, i4, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreviews.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:1525)");
                    int i6 = 72 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-933664368, i4, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreviews.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:1525)");
                }
            }
            if (onextracallbackwithresult instanceof getViewTypeCount.onExtraCallbackWithResult.asInterface) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-586901744);
                w3bVar.onExtraCallbackWithResult("오늘", onextracallbackwithresult, null, 0L, 0L, 0, 0.0f, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, (i4 << 6) & 896, 4092);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-586621504);
                if ((onextracallbackwithresult instanceof getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent) || (onextracallbackwithresult instanceof getViewTypeCount.onExtraCallbackWithResult.asBinder) || (onextracallbackwithresult instanceof getViewTypeCount.onExtraCallbackWithResult.InterfaceC0031onExtraCallbackWithResult)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(396726722);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(android.R.drawable.bottom_bar), setByteOrder.onNavigationEvent(setByteOrder.Companion.onTransact()));
                } else {
                    int i7 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(396729730);
                        i = im.toss.tds.compose.R.drawable.icn_star_mono;
                        y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 68}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(396731929);
                            jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(396732953);
                            jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).MediaMetadataCompat();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(396729730);
                        i = im.toss.tds.compose.R.drawable.icn_star_mono;
                        y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(i), setByteOrder.onNavigationEvent(jAudioAttributesImplBaseParcelizer));
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                w3bVar.onExtraCallbackWithResult(Integer.valueOf(((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue()), onextracallbackwithresult, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f), 1, (Object) null), 0L, ((setByteOrder) pairIAuthTabCallback.IAuthTabCallback()).access100(), 0, 0.0f, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, (i4 << 6) & 896, 4072);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2 != 0 ? 2 : 4;
                i2 = i | i7;
            }
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(458485212, i2, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreviews.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:1548)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, IAuthTabCallback(onextracallbackwithresult), onExtraCallback(onextracallbackwithresult), null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 12) & 57344), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b A[LOOP:0: B:28:0x0109->B:29:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int size;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        char c = 2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        boolean z = true;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i6 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 39 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallbackWithResult + 41;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(950409539, i, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreviews.<anonymous> (TdsListRowV1.kt:1516)");
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                int i10 = 6;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i11 = onNavigationEvent + 57;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1240632750);
                size = list.size();
                i2 = 0;
                while (i2 < size) {
                    final getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult2 = (getViewTypeCount.onExtraCallbackWithResult) list.get(i2);
                    onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(458485212, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda12
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i12 = 2 % 2;
                            int i13 = IAuthTabCallback + 47;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnExtraCallback = w4.onExtraCallback(onextracallbackwithresult2, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i15 = onWarmupCompleted + 43;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, i10).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), ForwardingCameraControl.onExtraCallback(-933664368, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda13
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 85;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                w4.onWarmupCompleted(onextracallbackwithresult2, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = w4.onWarmupCompleted(onextracallbackwithresult2, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i14 = onExtraCallback + 53;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 390, 0, 131064);
                    i2++;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    size = size;
                    i10 = i10;
                    z = z;
                    c = c;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                int i102 = 6;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback2, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1240632750);
                size = list.size();
                i2 = 0;
                while (i2 < size) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i;
        boolean z;
        int i2;
        final List list = (List) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-155294741);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                int i4 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 86 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-155294741, i, -1, "im.toss.tds.compose.component.compound.listrow.AssetPreviews (TdsListRowV1.kt:1506)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(950409539, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda26
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        List list2 = list;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (i12 != 0) {
                            return w4.onWarmupCompleted(list2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        }
                        w4.onWarmupCompleted(list2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(950409539, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda26
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        List list2 = list;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (i12 != 0) {
                            return w4.onWarmupCompleted(list2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        }
                        w4.onWarmupCompleted(list2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.TdsListRowV1Kt$$ExternalSyntheticLambda27
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnNavigationEvent = w4.onNavigationEvent(list, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i13 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        return null;
    }

    private static final QuirkSettingsLoader.onNavigationEvent IAuthTabCallback(getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent = (QuirkSettingsLoader.onNavigationEvent) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent> getsupportedhighspeedresolutionsfor, QuirkSettingsLoader.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(onnavigationevent);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1874404819, 1874404826);
    }

    public static /* synthetic */ Unit onExtraCallback(getViewTypeCount.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 2054970225, -2054970211);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{th}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1590692497, -1590692484);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(putCharSequenceArray putcharsequencearray, getBacktraceNote getbacktracenote, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1868848525, 1868848528);
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{useandconfigureprogramwithtexture}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1614402211, 1614402213);
    }

    private static final Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -8854768, 8854769);
    }

    private static final void onExtraCallbackWithResult(List<? extends getViewTypeCount.onExtraCallbackWithResult> list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        Object[] objArr = {list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1291431202, 1291431212);
    }

    private static final Unit onNavigationEvent(getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1045201251, -1045201251);
    }

    private static final Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1454995559, -1454995547);
    }

    private static final List<component7> IAuthTabCallback(Ref.ObjectRef<List<getStreamSharingChildren>> objectRef, Ref.ObjectRef<List<component7>> objectRef2, getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, isExtraPreviewRequired isextrapreviewrequired) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{objectRef, objectRef2, getbacktracenote, isextrapreviewrequired}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 301365379, -301365370);
    }

    private static final List<component7> onNavigationEvent(getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, isExtraPreviewRequired isextrapreviewrequired, getSupportedHighSpeedResolutionsFor<QuirkSettingsLoader.onNavigationEvent> getsupportedhighspeedresolutionsfor, Object obj) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (List) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{getbacktracenote, isextrapreviewrequired, getsupportedhighspeedresolutionsfor, obj}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1108119147, -1108119141);
    }

    private static final Unit IAuthTabCallback(putCharSequenceArray putcharsequencearray, getBacktraceNote getbacktracenote, getViewTypeCount.onExtraCallback onextracallback, getViewTypeCount.onExtraCallback onextracallback2, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getViewTypeCount.onExtraCallback onextracallback3, getViewTypeCount.onExtraCallback onextracallback4, getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, getViewTypeCount.asInterface asinterface, getViewTypeCount.IAuthTabCallback iAuthTabCallback, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {putcharsequencearray, getbacktracenote, onextracallback, onextracallback2, getbacktracenote2, getbacktracenote3, onextracallback3, onextracallback4, iAuthTabCallbackStub, asinterface, iAuthTabCallback, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1327372535, 1327372539);
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 195605341, -195605330);
    }

    public static final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super w3b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getViewTypeCount.onExtraCallback onextracallback, @Nullable getViewTypeCount.onExtraCallback onextracallback2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getViewTypeCount.onExtraCallback onextracallback3, @Nullable getViewTypeCount.onExtraCallback onextracallback4, float f, @Nullable getViewTypeCount.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable getViewTypeCount.asInterface asinterface, @Nullable getViewTypeCount.onNavigationEvent onnavigationevent, @Nullable getViewTypeCount.onTransact ontransact, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        Object[] objArr = {getbacktracenote, Boolean.valueOf(z), quirksExternalSyntheticBackport0, getbacktracenote2, onextracallback, onextracallback2, getbacktracenote3, onextracallback3, onextracallback4, Float.valueOf(f), iAuthTabCallbackStub, asinterface, onnavigationevent, ontransact, str, function0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1882733109, -1882733101);
    }

    public static final float onWarmupCompleted(long j, float f, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f), r8lambdanm9dm2eewl4vrptnjmesfjqky4};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return ((Float) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1902972198, 1902972203)).floatValue();
    }
}
