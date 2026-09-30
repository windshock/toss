package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.Role;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.foreigner.home.R;
import im.toss.features.foreigner.home.R$drawable;
import im.toss.features.foreigner.home.ui.asset.ForeignerHomeAssetCardKt$;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.AppLovinVastMediaViewf;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getSurfaceSize;
import o.handleNativeAdClick;
import o.seek;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class sendSuccess {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i4 | i8 | i6)) | (~(i7 | i5)) | (~(i10 | i7));
        int i14 = i6 + i5 + i2 + ((-1336646162) * i3) + (1706069763 * i);
        int i15 = i14 * i14;
        int i16 = ((i6 * 112646815) - 831444653) + (i5 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (112647075 * i2) + ((-2078048118) * i3) + ((-2015059991) * i) + (i15 * (-829161472));
        switch (((i6 * (-1709230891)) - 203685888) + ((-1709230891) * i5) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i2) + ((-602931200) * i3) + ((-1331167232) * i) + ((-1604583424) * i15) + (i16 * i16 * (-1266417664))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                int i17 = 2 % 2;
                int iAsBinder = (int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult((SurfaceProcessorWithExecutorExternalSyntheticLambda1) objArr[0], " " + ((String) objArr[1]), getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0L, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777211, (Object) null), 0, false, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1004, (Object) null).asBinder() >> 32);
                int i18 = onExtraCallbackWithResult + 105;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                return Integer.valueOf(iAsBinder);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return getInterfaceDescriptor(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Object obj, long j, long j2, long j3, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(str, obj, j, j2, j3, function0, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, obj, j, j2, j3, function0, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(function1, bindenginerouter);
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    private static final Unit IAuthTabCallback(getMemoryMappingsOrBuilder getmemorymappingsorbuilder, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 == 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted5 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted6 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted6, iOnWarmupCompleted4, -519563067, 519563067, new Object[]{bindenginerouter, cameraCaptureResultEmptyCameraCaptureResult, numValueOf});
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Unit unitOnExtraCallback;
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function1 function13 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = onExtraCallback(bindenginerouter, zBooleanValue, function1, function12, function13, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            int i3 = 21 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(bindenginerouter, zBooleanValue, function1, function12, function13, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit asBinder(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(function1, bindenginerouter);
        }
        IAuthTabCallbackDefault(function1, bindenginerouter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, Object obj, long j, long j2, long j3, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 103;
        onExtraCallback = i5 % 128;
        onWarmupCompleted(str, obj, j, j2, j3, function0, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 109;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function1, bindenginerouter);
        int i4 = onExtraCallbackWithResult + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(surfaceProcessorNodeOut);
        }
        IAuthTabCallback(surfaceProcessorNodeOut);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(bindEngineRouter bindenginerouter, Function1 function1, Function1 function12, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(bindenginerouter, function1, function12, z, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 123;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(bindEngineRouter bindenginerouter, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(bindenginerouter, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(bindenginerouter, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 63;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(bindEngineRouter bindenginerouter, boolean z, Function1 function1, Function1 function12, Function1 function13, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {bindenginerouter, Boolean.valueOf(z), function1, function12, function13, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -754518680, 754518687, objArr);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = onExtraCallback + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, int i, bindEngineRouter bindenginerouter, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {str, Integer.valueOf(i), bindenginerouter, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, 1756916188, -1756916187, objArr);
        int i6 = onExtraCallbackWithResult + 39;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function1, bindenginerouter);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = onExtraCallbackWithResult + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(bindEngineRouter bindenginerouter, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(bindenginerouter, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(bindEngineRouter bindenginerouter, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 57;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(bindenginerouter, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(bindenginerouter, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getMemoryMappingsOrBuilder getmemorymappingsorbuilder, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        onExtraCallbackWithResult(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(String str, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(str, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 27;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy(function1, bindenginerouter);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, bindenginerouter);
        int i3 = onExtraCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(bindEngineRouter bindenginerouter, Function1 function1, Function1 function12, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(bindenginerouter, function1, function12, z, function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 47;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(bindEngineRouter bindenginerouter, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(bindenginerouter, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(bindenginerouter, setDetectableSize);
        }
        IAuthTabCallback(bindenginerouter, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getMemoryMappingsOrBuilder getmemorymappingsorbuilder, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 105;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -641230410, 641230421, objArr);
        int i4 = onExtraCallbackWithResult + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onTransact(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -650526897, 650526901, new Object[]{function1, bindenginerouter});
        }
        int iOnWarmupCompleted4 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted5 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted6 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted5, iOnWarmupCompleted6, iOnWarmupCompleted4, -650526897, 650526901, new Object[]{function1, bindenginerouter});
        int i3 = 90 / 0;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -750606536, 750606541, new Object[]{bindenginerouter, str});
        int i4 = onExtraCallbackWithResult + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 99 / 0;
        }
        int i8 = onExtraCallbackWithResult + 119;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(function1, bindenginerouter);
        }
        IAuthTabCallback_Parcel(function1, bindenginerouter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(bindEngineRouter bindenginerouter, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(bindenginerouter, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 55;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getMemoryMappingsOrBuilder getmemorymappingsorbuilder, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallbackWithResult(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallbackWithResult(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$referrer = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$referrer, access13800Var);
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            setParams.onWarmupCompleted(4707186L, this.$referrer, null, 4, null);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull getMemoryMappingsOrBuilder<bindEngineRouter> getmemorymappingsorbuilder, boolean z, boolean z2, @NotNull Function1<? super bindEngineRouter, Unit> function1, @NotNull Function1<? super bindEngineRouter, Unit> function12, @NotNull Function1<? super bindEngineRouter, Unit> function13, @NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object obj;
        Object objOnWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        access13800 access13800Var;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1190865648);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmemorymappingsorbuilder) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ^ true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ^ true ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                int i8 = onExtraCallbackWithResult + 19;
                onExtraCallback = i8 % 128;
                i6 = 131072;
                if (i8 % 2 != 0) {
                    int i9 = 89 / 0;
                }
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        Object obj2 = null;
        if ((1572864 & i) == 0) {
            int i10 = onExtraCallback + 75;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                obj2.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1048576 : 524288;
        }
        int i11 = i2 & 128;
        if (i11 == 0) {
            if ((i & 12582912) == 0) {
                int i12 = onExtraCallback + 123;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 8388608 : 4194304;
            }
            i4 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i4) == 4793490, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                if (i11 != 0) {
                    int i14 = onExtraCallback + 57;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    int i16 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = onExtraCallbackWithResult + 33;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1190865648, i4, -1, "im.toss.features.foreigner.home.ui.asset.ForeignerHomeAssetCard (ForeignerHomeAssetCard.kt:72)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1190865648, i4, -1, "im.toss.features.foreigner.home.ui.asset.ForeignerHomeAssetCard (ForeignerHomeAssetCard.kt:72)");
                }
                bindEngineRouter bindenginerouter = (bindEngineRouter) CollectionsKt.firstOrNull(getmemorymappingsorbuilder);
                if (bindenginerouter == null) {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 != null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda3(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport02, i, i2));
                        return;
                    }
                    return;
                }
                List listDrop = CollectionsKt.drop(getmemorymappingsorbuilder, 1);
                if (listDrop.size() > 1) {
                    listDrop = CollectionsKt.take(listDrop, 2);
                }
                List list = listDrop;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindenginerouter.onNavigationEvent());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    obj = null;
                    objOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
                } else {
                    objOnWarmupCompleted = objOnMinimized;
                    obj = null;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setPluginId.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, obj), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    int i19 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i20 = onExtraCallback + 59;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -754518680, 754518687, new Object[]{bindenginerouter, Boolean.valueOf(z2), function1, function12, function13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 3) & 65520)});
                char c = 6;
                if (list.isEmpty()) {
                    i5 = 6;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    access13800Var = null;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(476793704);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(476360293);
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinNativeAdImplExternalSyntheticLambda6.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback) null, (AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted) null, (AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 15);
                    ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(15369084);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int i22 = onExtraCallback + 67;
                        onExtraCallbackWithResult = i22 % 128;
                        if (i22 % 2 == 0) {
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                            cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                            throw null;
                        }
                        bindEngineRouter bindenginerouter2 = (bindEngineRouter) it.next();
                        boolean zIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda4(getsupportedhighspeedresolutionsfor);
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                        }
                        onExtraCallbackWithResult(bindenginerouter2, function1, function13, zIAuthTabCallback, (Function0) objOnMinimized2, null, cameraCaptureResultEmptyCameraCaptureResult3, ((i4 >> 6) & 112) | ((i4 >> 9) & 896), 32);
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult3;
                        c = 6;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    access13800Var = null;
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    i5 = 6;
                    ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (!(!z)) {
                    int i23 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(476841413);
                    String str = (String) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(setParams.onWarmupCompleted());
                    Unit unit = Unit.INSTANCE;
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (zOnNavigationEvent3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new onNavigationEvent(str, access13800Var);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                    getSource.onNavigationEvent(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{function0, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), setStep.onWarmupCompleted.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i4 >> 18) & 14) | 3456), 2}, -1612679455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1612679455, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(477520840);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda5(getmemorymappingsorbuilder, z, z2, function1, function12, function13, function0, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        i3 |= 12582912;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i4) == 4793490, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ bindEngineRouter $card;
        final /* synthetic */ String $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(bindEngineRouter bindenginerouter, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$card = bindenginerouter;
            this.$referrer = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$card, this.$referrer, access13800Var);
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = 43 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 39 / 0;
            } else {
                objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {this.$card, this.$referrer};
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            sendSuccess.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, 121863386, -121863383, objArr);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = onExtraCallback + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i;
        Function1 function1;
        Function1 function12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function1 function13;
        boolean z;
        bindEngineRouter bindenginerouter;
        int i3;
        Function1 function14;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        boolean z2;
        Function1 function15;
        boolean z3;
        Function1 function16;
        Object obj;
        Object obj2;
        int i5;
        int i6;
        boolean z4;
        Function1 function17;
        bindEngineRouter bindenginerouter2;
        Object obj3;
        boolean z5;
        Function1 function18;
        Object obj4;
        bindEngineRouter bindenginerouter3 = (bindEngineRouter) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function19 = (Function1) objArr[2];
        Function1 function110 = (Function1) objArr[3];
        Function1 function111 = (Function1) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-656978907);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindenginerouter3) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i8 = onExtraCallbackWithResult + 39;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i9 = onExtraCallback + 61;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function19) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function110) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function111) ? 8192 : 16384;
        }
        int i11 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 9363) != 9362, i11 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-656978907, i11, -1, "im.toss.features.foreigner.home.ui.asset.PrimaryAssetCardContent (ForeignerHomeAssetCard.kt:140)");
            }
            String str = (String) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setParams.onWarmupCompleted());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindenginerouter3.onNavigationEvent());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            boolean z6 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() >= 1.3f;
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z6 ? 10.0f : 6.0f);
            String strOnNavigationEvent = bindenginerouter3.onNavigationEvent();
            int i12 = i11 & 14;
            boolean z7 = i12 == 4;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z7 | zOnNavigationEvent2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new onExtraCallbackWithResult(bindenginerouter3, str, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(strOnNavigationEvent, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
            boolean z8 = (i11 & 896) == 256;
            boolean z9 = i12 == 4;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z8 | z9)) {
                Object obj5 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    ForeignerHomeAssetCardKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda7(function19, bindenginerouter3);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda7);
                    obj5 = externalSyntheticLambda7;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageLoaderBuilderExternalSyntheticLambda2.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, 0L, RealImageLoader.onWarmupCompleted(0L, (Function0) obj5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), 507, (Object) null);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    i3 = i11;
                    int i13 = onExtraCallbackWithResult + 73;
                    function14 = function19;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                } else {
                    i3 = i11;
                    function14 = function19;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i14 = onExtraCallbackWithResult + 7;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        int i15 = 16 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(z6 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i16 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i18 = onExtraCallbackWithResult + 103;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                String strOnTransact = bindenginerouter3.onTransact();
                if (strOnTransact != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1965137570);
                    setMainImageUri.IAuthTabCallback(strOnTransact, deprecated_eventListenerFactory.Image, setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).extraCommand(), RoundedCornerShapeKt.onNavigationEvent(fIAuthTabCallback)), RoundedCornerShapeKt.onNavigationEvent(fIAuthTabCallback)), handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(z6 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0, 8176);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1964482447);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                onNavigationEvent(bindenginerouter3, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12, 2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                component5 component5VarOnExtraCallback3 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback5);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnExtraCallback3, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                String str2 = (String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -90453027, 90453029, new Object[]{bindenginerouter3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i12)});
                getHumanReadableName gethumanreadablenameAccess100 = AppLovinPostbackService.onExtraCallbackWithResult.access100();
                int i20 = i3;
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                i2 = iIntValue;
                function12 = function14;
                z = zBooleanValue;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, gethumanreadablenameAccess100, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(867992852);
                    i4 = 6;
                    ImageLoaderBuilderExternalSyntheticLambda5.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
                    getNavigationIcon.IAuthTabCallback(snapshot.onNavigationEvent(R$drawable.foreigner_home_icn_wifi_slash, cameraCaptureResultEmptyCameraCaptureResult, 0), (String) null, setAdVideoPlaybackListener.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), "Image"), (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, seek.onExtraCallbackWithResult.onNavigationEvent(seek.Companion, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).getSmallIconBitmap(), 0, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, Painter.$stable | 48, 56);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    i4 = 6;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(868411848);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                setMainImageUri.IAuthTabCallback(encodedValue.onExtraCallback(OkHttp.onExtraCallback), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4).onRelationshipValidationResult(), 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 0, 8164);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResult, i4);
                if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2113417500);
                    Object obj7 = null;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, i4);
                    int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                    Function0 function0IAuthTabCallback6 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback6);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_charge, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    verifyClientState verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-plus-thin-mono");
                    long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4)}, 1368051753, OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
                    long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    long jLongValue3 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    if ((i20 & 7168) == 2048) {
                        z4 = true;
                        i5 = i12;
                        i6 = 4;
                    } else {
                        i5 = i12;
                        i6 = 4;
                        z4 = false;
                    }
                    boolean z10 = i5 == i6;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(z4 | z10)) {
                        int i21 = onExtraCallback + 25;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 == 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            obj7.hashCode();
                            throw null;
                        }
                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            function17 = function110;
                            bindenginerouter2 = bindenginerouter3;
                            ForeignerHomeAssetCardKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda8(function17, bindenginerouter2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                            obj3 = externalSyntheticLambda8;
                        } else {
                            function17 = function110;
                            bindenginerouter2 = bindenginerouter3;
                            obj3 = objOnMinimized4;
                        }
                        onWarmupCompleted(strOnExtraCallback, verifyclientstateOnWarmupCompleted, jLongValue, jLongValue2, jLongValue3, (Function0) obj3, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 128);
                        String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_send, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        verifyClientState verifyclientstateOnWarmupCompleted2 = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-up-small-mono");
                        long jLongValue4 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                        long jOnNavigationEvent = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).onNavigationEvent();
                        long jOnNavigationEvent2 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i4).onNavigationEvent();
                        if ((57344 & i20) == 16384) {
                            int i22 = onExtraCallback + 117;
                            onExtraCallbackWithResult = i22 % 128;
                            int i23 = i22 % 2;
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z11 = i5 == 4;
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((z5 || z11) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            function18 = function111;
                            ForeignerHomeAssetCardKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda9(function18, bindenginerouter2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                            obj4 = externalSyntheticLambda9;
                        } else {
                            function18 = function111;
                            obj4 = objOnMinimized5;
                        }
                        onWarmupCompleted(strOnExtraCallback2, verifyclientstateOnWarmupCompleted2, jLongValue4, jOnNavigationEvent, jOnNavigationEvent2, (Function0) obj4, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 128);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        bindenginerouter = bindenginerouter2;
                        function13 = function18;
                        function1 = function17;
                    }
                } else {
                    bindenginerouter = bindenginerouter3;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2112216405);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                    component5 component5VarOnExtraCallback4 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, i4);
                    int iHashCode7 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
                    Function0 function0IAuthTabCallback7 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback7);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, component5VarOnExtraCallback4, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject7, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, Integer.valueOf(iHashCode7), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult7, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                    String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_charge, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    verifyClientState verifyclientstateOnWarmupCompleted3 = deprecated_authenticator.onWarmupCompleted("icon-plus-thin-mono");
                    long jLongValue5 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1368051753, OverseasRrnInputTextField.IAuthTabCallback(), -1368051749)).longValue();
                    long jLongValue6 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    long jLongValue7 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0, 1.0f, false, 2, (Object) null);
                    if ((i20 & 7168) == 2048) {
                        int i24 = onExtraCallback + 71;
                        onExtraCallbackWithResult = i24 % 128;
                        int i25 = i24 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i12 == 4) {
                        function15 = function111;
                        z3 = true;
                    } else {
                        function15 = function111;
                        z3 = false;
                    }
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(z2 | z3)) {
                        int i26 = onExtraCallbackWithResult + 53;
                        onExtraCallback = i26 % 128;
                        int i27 = i26 % 2;
                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            function16 = function110;
                            ForeignerHomeAssetCardKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda10(function16, bindenginerouter);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                            obj = externalSyntheticLambda10;
                        } else {
                            function16 = function110;
                            obj = objOnMinimized6;
                        }
                        Function0 function0 = (Function0) obj;
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                        function1 = function16;
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent3) {
                            Object obj8 = objOnMinimized7;
                            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                ForeignerHomeAssetCardKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda11(getsupportedhighspeedresolutionsfor);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                obj8 = externalSyntheticLambda11;
                            }
                            onWarmupCompleted(strOnExtraCallback3, verifyclientstateOnWarmupCompleted3, jLongValue5, jLongValue6, jLongValue7, function0, quirksExternalSyntheticBackport0OnNavigationEvent3, (Function1) obj8, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                            String strOnExtraCallback4 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_send, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            verifyClientState verifyclientstateOnWarmupCompleted4 = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-up-small-mono");
                            long jLongValue8 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                            long jOnNavigationEvent3 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
                            long jOnNavigationEvent4 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0, 1.0f, false, 2, (Object) null);
                            boolean z12 = (57344 & i20) == 16384;
                            boolean z13 = i12 == 4;
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if ((z12 || z13) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                function13 = function15;
                                ForeignerHomeAssetCardKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda12(function13, bindenginerouter);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                                obj2 = externalSyntheticLambda12;
                            } else {
                                function13 = function15;
                                obj2 = objOnMinimized8;
                            }
                            Function0 function02 = (Function0) obj2;
                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnNavigationEvent4) {
                                Object obj9 = objOnMinimized9;
                                if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    ForeignerHomeAssetCardKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda13(getsupportedhighspeedresolutionsfor);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                                    obj9 = externalSyntheticLambda13;
                                }
                                onWarmupCompleted(strOnExtraCallback4, verifyclientstateOnWarmupCompleted4, jLongValue8, jOnNavigationEvent3, jOnNavigationEvent4, function02, quirksExternalSyntheticBackport0OnNavigationEvent4, (Function1) obj9, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                        }
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            function1 = function110;
            function12 = function19;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function13 = function111;
            z = zBooleanValue;
            bindenginerouter = bindenginerouter3;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda14(bindenginerouter, z, function12, function1, function13, i2));
        return null;
    }

    private static final Unit access100(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access000(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            surfaceProcessorNodeOut.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        if (surfaceProcessorNodeOut.onExtraCallbackWithResult()) {
            onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
            int i3 = onExtraCallback + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        if (!(!surfaceProcessorNodeOut.onExtraCallbackWithResult())) {
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
            } else {
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
            }
            int i5 = onExtraCallback + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(String str, Object obj, long j, long j2, long j3, Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1<? super SurfaceProcessorNodeOut, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        float f;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1949648544);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
            int i9 = onExtraCallbackWithResult + 75;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i11 = onExtraCallback + 9;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            int i13 = onExtraCallbackWithResult + 41;
            onExtraCallback = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 15 / 0;
                i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                int i15 = onExtraCallbackWithResult + 11;
                onExtraCallback = i15 % 128;
                i5 = i15 % 2 != 0 ? 16995 : 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i16 = onExtraCallbackWithResult + 123;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        int i18 = i2 & 64;
        if (i18 != 0) {
            i3 |= 1572864;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if ((i & 1572864) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 1048576 : 524288;
            }
        }
        int i19 = i2 & 128;
        if (i19 != 0) {
            int i20 = onExtraCallbackWithResult + 13;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 8388608 : 4194304;
            int i22 = onExtraCallbackWithResult + 101;
            onExtraCallback = i22 % 128;
            int i23 = i22 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i3) != 4793490, i3 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (i19 != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda0();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                function13 = (Function1) objOnMinimized;
            } else {
                function13 = function1;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1949648544, i3, -1, "im.toss.features.foreigner.home.ui.asset.PrimaryActionButton (ForeignerHomeAssetCard.kt:285)");
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f))), j, (toMetersPerSecond) null, 2, (Object) null);
            if ((458752 & i3) == 131072) {
                z = true;
                f = 0.0f;
            } else {
                int i24 = onExtraCallbackWithResult + 81;
                onExtraCallback = i24 % 128;
                int i25 = i24 % 2;
                f = 0.0f;
                z = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda1(function0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, RealImageLoader.onWarmupCompleted(0L, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), 15, (Object) null), f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onExtraCallbackWithResult(fIAuthTabCallback, onextracallbackwithresult.onTransact()), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
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
                int i26 = onExtraCallbackWithResult + 123;
                onExtraCallback = i26 % 128;
                int i27 = i26 % 2;
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
            int i28 = i3 >> 3;
            setMainImageUri.IAuthTabCallback(obj, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), j3, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i28 & 14) | 3120 | (57344 & i3), 0, 8164);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), Long.valueOf(j2), 0L, 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onNavigationEvent()), false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), function13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 & 7168) | (i3 & 14) | 12582912), Integer.valueOf((i28 & 3670016) | 199680), 24434}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            function12 = function13;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            function12 = function1;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda2(str, obj, j, j2, j3, function0, quirksExternalSyntheticBackport03, function12, i, i2));
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ bindEngineRouter $card;
        final /* synthetic */ String $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(bindEngineRouter bindenginerouter, String str, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$card = bindenginerouter;
            this.$referrer = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$card, this.$referrer, access13800Var);
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            int i5 = onExtraCallback + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {this.$card, this.$referrer};
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            sendSuccess.IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, 121863386, -121863383, objArr);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 31;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(Function1 function1, bindEngineRouter bindenginerouter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(bindenginerouter);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z;
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onExtraCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = onExtraCallbackWithResult + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            }
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 109;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-170626635, iIntValue, -1, "im.toss.features.foreigner.home.ui.asset.AssetSummaryRow.<anonymous> (ForeignerHomeAssetCard.kt:340)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-170626635, iIntValue, -1, "im.toss.features.foreigner.home.ui.asset.AssetSummaryRow.<anonymous> (ForeignerHomeAssetCard.kt:340)");
            }
            onNavigationEvent(bindenginerouter, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(bindEngineRouter bindenginerouter, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1306571081, i, -1, "im.toss.features.foreigner.home.ui.asset.AssetSummaryRow.<anonymous> (ForeignerHomeAssetCard.kt:343)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1306571081, i, -1, "im.toss.features.foreigner.home.ui.asset.AssetSummaryRow.<anonymous> (ForeignerHomeAssetCard.kt:343)");
            }
            String strOnTransact = bindenginerouter.onTransact();
            if (strOnTransact != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1229651998);
                setMainImageUri.IAuthTabCallback(strOnTransact, deprecated_eventListenerFactory.Image, setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).extraCommand(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f))), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f))), handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f)), 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 0, 8176);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1230170411);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i4 = onExtraCallback + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(bindEngineRouter bindenginerouter, Function1<? super bindEngineRouter, Unit> function1, Function1<? super bindEngineRouter, Unit> function12, boolean z, Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Throwable th;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(56651524);
        if ((i & 6) == 0) {
            int i7 = onExtraCallback + 33;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindenginerouter) ? 4 : 2) | i;
            int i9 = onExtraCallbackWithResult + 93;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i11 = onExtraCallbackWithResult + 37;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i13 = onExtraCallbackWithResult + 123;
                onExtraCallback = i13 % 128;
                i5 = i13 % 2 != 0 ? 16651 : 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i14 = onExtraCallbackWithResult + 93;
                onExtraCallback = i14 % 128;
                i4 = i14 % 2 != 0 ? 6746 : 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i15 = i2 & 32;
        if (i15 == 0) {
            if ((i & 196608) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 131072 : 65536;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                int i16 = onExtraCallback + 95;
                int i17 = i16 % 128;
                onExtraCallbackWithResult = i17;
                int i18 = i16 % 2;
                if (i15 != 0) {
                    int i19 = i17 + 31;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 != 0) {
                        quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                        int i20 = 93 / 0;
                    } else {
                        quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(56651524, i3, -1, "im.toss.features.foreigner.home.ui.asset.AssetSummaryRow (ForeignerHomeAssetCard.kt:323)");
                }
                String str = (String) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setParams.onWarmupCompleted());
                String strOnNavigationEvent = bindenginerouter.onNavigationEvent();
                int i21 = i3 & 14;
                boolean z2 = i21 == 4;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z2 | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(bindenginerouter, str, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(strOnNavigationEvent, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                Object[] objArr = {bindenginerouter, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i21)};
                String str2 = (String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), -90453027, 90453029, objArr);
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_send, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
                setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
                boolean z3 = (i3 & 112) == 32;
                boolean z4 = i21 == 4;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(z3 | z4)) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        ForeignerHomeAssetCardKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda18(function1, bindenginerouter);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda18);
                        obj2 = externalSyntheticLambda18;
                    }
                    Function0 function02 = (Function0) obj2;
                    boolean z5 = (i3 & 896) == 256;
                    boolean z6 = i21 == 4;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z5 | z6)) {
                        int i22 = onExtraCallbackWithResult + 97;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 != 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            th = null;
                            ForeignerHomeAssetCardKt$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda19(function12, bindenginerouter);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda19);
                            obj = externalSyntheticLambda19;
                        } else {
                            th = null;
                            obj = objOnMinimized3;
                        }
                        Throwable th2 = th;
                        setOriginalData.onWarmupCompleted(str2, function02, quirksExternalSyntheticBackport04, (String) null, strOnExtraCallback, onwarmupcompleted, onextracallback, (Function0) obj, false, Boolean.valueOf(z), function0, (getBacktraceNote) null, (Function2) null, ForwardingCameraControl.onExtraCallback(-170626635, true, new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda20(bindenginerouter), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setFromXRiver) null, ForwardingCameraControl.onExtraCallback(-1306571081, true, new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda21(bindenginerouter), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 9) & 896) | 1769472 | ((i3 << 18) & 1879048192), ((i3 >> 12) & 14) | 199680, 22792);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i23 = onExtraCallbackWithResult + 31;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                th2.hashCode();
                                throw th2;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda22(bindenginerouter, function1, function12, z, function0, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        int i24 = onExtraCallbackWithResult + 95;
        onExtraCallback = i24 % 128;
        int i25 = i24 % 2;
        i3 |= 196608;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[PHI: r6
      0x0052: PHI (r6v5 java.lang.Integer) = (r6v4 int), (r6v45 int) binds: [B:8:0x0050, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        Throwable th;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[2];
        FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9 = (FocusMeteringControlExternalSyntheticLambda9) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            i = 0;
            Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
            if ((iIntValue2 & 107) == 0) {
                iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2;
            }
        } else {
            i = 1;
            Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
            if ((iIntValue2 & 6) == 0) {
            }
        }
        Integer num = i;
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            int i4 = onExtraCallbackWithResult + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-403051695, iIntValue2, -1, "im.toss.features.foreigner.home.ui.asset.AssetCardDisplayName.<anonymous> (ForeignerHomeAssetCard.kt:390)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult3, 0, 1);
            int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(focusMeteringControlExternalSyntheticLambda9.IAuthTabCallback());
            int iIntValue3 = ((Integer) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1732453159, -1732453151, new Object[]{surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, str})).intValue();
            int iCoerceAtLeast = RangesKt.coerceAtLeast(iOnExtraCallbackWithResult - iIntValue3, 0);
            float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(iCoerceAtLeast);
            if (iIntValue == 1) {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1416128975);
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult3, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                    int i6 = onExtraCallbackWithResult + 99;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 99606765, -99606759, new Object[]{bindenginerouter.onExtraCallbackWithResult(), surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, Integer.valueOf(iCoerceAtLeast)}), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, 0.0f, fC_, 1, (Object) null), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService()), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122736}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                onExtraCallback(str, false, cameraCaptureResultEmptyCameraCaptureResult3, 0, 2);
                cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            }
            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1416838193);
            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            String strOnExtraCallbackWithResult = bindenginerouter.onExtraCallbackWithResult();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, strOnExtraCallbackWithResult, appLovinPostbackService.IAuthTabCallback_Parcel(), notifySessionStart.Companion.IAuthTabCallback(), false, 2, r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iOnExtraCallbackWithResult, 0, 0, 13, (Object) null), (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 968, (Object) null);
            int iAsBinder = (int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, bindenginerouter.onExtraCallbackWithResult(), appLovinPostbackService.IAuthTabCallback_Parcel(), 0, false, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1004, (Object) null).asBinder() >> 32);
            if (surfaceProcessorNodeOutOnExtraCallbackWithResult.IAuthTabCallbackDefault() <= 1) {
                int i8 = onExtraCallbackWithResult + 23;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1417444708);
                    if (iAsBinder - iIntValue3 > iOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1417570103);
                        FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback2);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{bindenginerouter.onExtraCallbackWithResult(), null, appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService()), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122738}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        onExtraCallback(str, false, cameraCaptureResultEmptyCameraCaptureResult3, 48, 0);
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1418145928);
                        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault2 = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault2, cameraCaptureResultEmptyCameraCaptureResult3, 48);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback3);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                            int i9 = onExtraCallback + 7;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback2, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 99606765, -99606759, new Object[]{bindenginerouter.onExtraCallbackWithResult(), surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, Integer.valueOf(iCoerceAtLeast)}), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback3, 0.0f, fC_, 1, (Object) null), appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService()), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122736}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                        onExtraCallback(str, false, cameraCaptureResultEmptyCameraCaptureResult2, 0, 2);
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1417444708);
                    if (iAsBinder + iIntValue3 > iOnExtraCallbackWithResult) {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                th = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1418932398);
                int iOnNavigationEvent = surfaceProcessorNodeOutOnExtraCallbackWithResult.onNavigationEvent(0, true);
                String strSubstring = bindenginerouter.onExtraCallbackWithResult().substring(0, iOnNavigationEvent);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = bindenginerouter.onExtraCallbackWithResult().substring(iOnNavigationEvent);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                String string = StringsKt.trimStart(strSubstring2).toString();
                if (iCoerceAtLeast < ((int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, StringsKt.take(string, 1) + "...", appLovinPostbackService.IAuthTabCallback_Parcel(), 0, false, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1004, (Object) null).asBinder() >> 32))) {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1419521274);
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback2, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback4);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult4 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult4.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        int i11 = onExtraCallbackWithResult + 35;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback4);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent2, onextracallbackwithresult4.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult4.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult4.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult4.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult4.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 99606765, -99606759, new Object[]{bindenginerouter.onExtraCallbackWithResult(), surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, Integer.valueOf(iOnExtraCallbackWithResult)}), null, appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService()), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122738}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    onExtraCallback(str, false, cameraCaptureResultEmptyCameraCaptureResult3, 48, 0);
                    cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    int i13 = onExtraCallbackWithResult + 65;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                    th = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1420357251);
                    String str2 = (String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 99606765, -99606759, new Object[]{string, surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, Integer.valueOf(iCoerceAtLeast)});
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback3 = focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = QuirksExternalSyntheticBackport0.Companion;
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult5 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback3, onextracallbackwithresult5.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                    int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback5);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult6 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback5 = onextracallbackwithresult6.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        int i15 = onExtraCallback + 73;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            getAwbState.onExtraCallback();
                            int i16 = 98 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback5);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnNavigationEvent3, onextracallbackwithresult6.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult6.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult6.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult6.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult6.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda03 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    long jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService();
                    AppLovinVastMediaViewf.IAuthTabCallback iAuthTabCallback = AppLovinVastMediaViewf.Companion;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strSubstring, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jICustomTabsService), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(iAuthTabCallback.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122738}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    component5 component5VarOnExtraCallback3 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult5.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult3, 48);
                    int iHashCode6 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, onextracallback5);
                    Function0 function0IAuthTabCallback6 = onextracallbackwithresult6.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        int i17 = onExtraCallback + 99;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback6);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, component5VarOnExtraCallback3, onextracallbackwithresult6.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject6, onextracallbackwithresult6.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, Integer.valueOf(iHashCode6), onextracallbackwithresult6.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, onextracallbackwithresult6.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult6, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult6.onTransact());
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.onNavigationEvent;
                    th = null;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback5, 0.0f, fC_, 1, (Object) null), appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ICustomTabsService()), 0L, 0L, null, num, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(iAuthTabCallback.IAuthTabCallback()), false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 3072, 122736}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                    onExtraCallback(str, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onExtraCallbackWithResult + 89;
                onExtraCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    th.hashCode();
                    throw th;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(bindEngineRouter bindenginerouter, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        ForeignerHomeAssetCardKt$.ExternalSyntheticLambda15 externalSyntheticLambda17;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1497283737);
        if ((i & 6) == 0) {
            i3 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindenginerouter) ^ true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                int i8 = onExtraCallback + 21;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i10 = onExtraCallback + 93;
                    onExtraCallbackWithResult = i10 % 128;
                    i4 = i10 % 2 == 0 ? 79 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 19) == 18, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                if (i7 != 0) {
                    int i11 = onExtraCallback + 125;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onExtraCallbackWithResult + 25;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1497283737, i5, -1, "im.toss.features.foreigner.home.ui.asset.AssetCardDisplayName (ForeignerHomeAssetCard.kt:366)");
                }
                int i15 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() < 1.3f ? 1 : 2;
                Long l = (Long) bindEngineRouter.onWarmupCompleted(1754662571, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1754662571, new Object[]{bindenginerouter}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
                String strIAuthTabCallback = null;
                if (l != null) {
                    int i16 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    long jLongValue = l.longValue();
                    if (!bindenginerouter.IAuthTabCallbackStubProxy() || jLongValue <= 0) {
                    }
                    if (l != null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1950818380);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1950818381);
                        strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.foreigner_home_asset_toss_bank_interest_amount, new Object[]{getLongName.onNavigationEvent(l.longValue(), (ParamImpl) null, 1, (Object) null)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (strIAuthTabCallback != null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1951057050);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{bindenginerouter.onExtraCallbackWithResult(), quirksExternalSyntheticBackport05, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), 0L, 0L, null, Integer.valueOf(i15), null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onNavigationEvent()), false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5 & 112), 3072, 122736}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            externalSyntheticLambda17 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda15(bindenginerouter, quirksExternalSyntheticBackport05, i, i2);
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda17);
                            return;
                        }
                        int i18 = onExtraCallbackWithResult + 19;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1951334779);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(quirksExternalSyntheticBackport03, (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(-403051695, true, new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda16(strIAuthTabCallback, i15, bindenginerouter), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((i5 >> 3) & 14) | 3072, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = onExtraCallback + 15;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                l = null;
                if (l != null) {
                }
                if (strIAuthTabCallback != null) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                externalSyntheticLambda17 = new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda17(bindenginerouter, quirksExternalSyntheticBackport03, i, i2);
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda17);
                return;
            }
            int i182 = onExtraCallbackWithResult + 19;
            onExtraCallback = i182 % 128;
            int i192 = i182 % 2;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 19) == 18, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        int i1822 = onExtraCallbackWithResult + 19;
        onExtraCallback = i1822 % 128;
        int i1922 = i1822 % 2;
    }

    private static final void onExtraCallback(String str, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str2;
        int i4;
        boolean z2 = z;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1115650798);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i6 = onExtraCallback + 27;
                int i7 = i6 % 128;
                onExtraCallbackWithResult = i7;
                i4 = i6 % 2 == 0 ? 3 : 4;
                int i8 = i7 + 51;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        Object obj = null;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i11 = onExtraCallback + 77;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i12 = onExtraCallback + 93;
            int i13 = i12 % 128;
            onExtraCallbackWithResult = i13;
            if (i12 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i10 != 0) {
                int i14 = i13 + 87;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                z2 = true;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 107;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1115650798, i3, -1, "im.toss.features.foreigner.home.ui.asset.InterestText (ForeignerHomeAssetCard.kt:542)");
            }
            if (z2) {
                str2 = " " + str;
            } else {
                str2 = str;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).warmup()), 0L, 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.IAuthTabCallback()), false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult2, 12582912, 224256, 73586}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = onExtraCallback + 53;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda23(str, z2, i, i2));
        }
        int i20 = onExtraCallbackWithResult + 45;
        onExtraCallback = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1 = (SurfaceProcessorWithExecutorExternalSyntheticLambda1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Object obj = null;
        if (str.length() == 0) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
        if (iIntValue > 0) {
            String str2 = "...";
            if (((int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, str, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0, false, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1004, (Object) null).asBinder() >> 32)) <= iIntValue) {
                return str;
            }
            int length = str.length();
            while (length > 0) {
                String strTake = StringsKt.take(str, length);
                StringBuilder sb = new StringBuilder();
                sb.append(strTake);
                String str3 = str2;
                sb.append(str3);
                String string = sb.toString();
                if (((int) (SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, string, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0, false, 1, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1004, (Object) null).asBinder() >> 32)) <= iIntValue) {
                    int i3 = onExtraCallback + 31;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        return string;
                    }
                    obj.hashCode();
                    throw null;
                }
                length--;
                str2 = str3;
            }
            return StringsKt.take(str, 1) + str2;
        }
        return StringsKt.take(str, 1) + "...";
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        bindEngineRouter bindenginerouter = (bindEngineRouter) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1636327497, iIntValue, -1, "im.toss.features.foreigner.home.ui.asset.balanceText (ForeignerHomeAssetCard.kt:583)");
        }
        Long lIAuthTabCallback = bindenginerouter.IAuthTabCallback();
        String strOnExtraCallback = null;
        if (lIAuthTabCallback != null) {
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            strOnExtraCallback = i2 % 2 == 0 ? getLongName.onNavigationEvent(lIAuthTabCallback.longValue(), (ParamImpl) null, 0, (Object) null) : getLongName.onNavigationEvent(lIAuthTabCallback.longValue(), (ParamImpl) null, 1, (Object) null);
        }
        if (strOnExtraCallback == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(552697254);
            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_balance_unknown, cameraCaptureResultEmptyCameraCaptureResult, 0);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(552696572);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onExtraCallbackWithResult + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onExtraCallbackWithResult + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return strOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        int i = 2 % 2;
        setParams.onNavigationEvent(4707148L, (String) objArr[1], (Function1<? super SetDetectableSize, Unit>) new ForeignerHomeAssetCardKt$.ExternalSyntheticLambda6((bindEngineRouter) objArr[0]));
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return null;
    }

    private static final Unit IAuthTabCallback(bindEngineRouter bindenginerouter, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            bindenginerouter.IAuthTabCallbackStubProxy();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("account_type", bindenginerouter.IAuthTabCallbackStubProxy() ? "TOSSBANK" : "MYDATA");
        setDetectableSize.onExtraCallback("bank_code", bindenginerouter.onExtraCallback());
        setDetectableSize.onExtraCallback("account_id", bindenginerouter.onNavigationEvent());
        if (bindenginerouter.IAuthTabCallback() != null) {
            int i3 = onExtraCallbackWithResult + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Long lIAuthTabCallback = bindenginerouter.IAuthTabCallback();
            setDetectableSize.onExtraCallback("balance_yn", zzaz.onExtraCallbackWithResult(lIAuthTabCallback == null || lIAuthTabCallback.longValue() != 0));
        }
        setDetectableSize.onExtraCallback("account_order", Integer.valueOf(bindenginerouter.IAuthTabCallbackDefault() + 1));
        setDetectableSize.onExtraCallback("status", bindenginerouter.asBinder());
        return Unit.INSTANCE;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        int i4 = 33 / 0;
        return bool.booleanValue();
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(bindEngineRouter bindenginerouter, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bindenginerouter, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -2068116895, 2068116905, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(bindEngineRouter bindenginerouter, boolean z, Function1 function1, Function1 function12, Function1 function13, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {bindenginerouter, Boolean.valueOf(z), function1, function12, function13, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -632092459, 632092468, objArr);
    }

    private static final Unit IAuthTabCallback(String str, int i, bindEngineRouter bindenginerouter, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), bindenginerouter, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, 1756916188, -1756916187, objArr);
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1, bindEngineRouter bindenginerouter) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -650526897, 650526901, new Object[]{function1, bindenginerouter});
    }

    private static final Unit onWarmupCompleted(bindEngineRouter bindenginerouter, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bindenginerouter, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -519563067, 519563067, objArr);
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -641230410, 641230421, new Object[]{getsupportedhighspeedresolutionsfor});
    }

    private static final void onExtraCallbackWithResult(bindEngineRouter bindenginerouter, boolean z, Function1<? super bindEngineRouter, Unit> function1, Function1<? super bindEngineRouter, Unit> function12, Function1<? super bindEngineRouter, Unit> function13, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bindenginerouter, Boolean.valueOf(z), function1, function12, function13, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -754518680, 754518687, objArr);
    }

    public static final /* synthetic */ void onWarmupCompleted(bindEngineRouter bindenginerouter, String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, 121863386, -121863383, new Object[]{bindenginerouter, str});
    }

    private static final void onNavigationEvent(bindEngineRouter bindenginerouter, String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, -750606536, 750606541, new Object[]{bindenginerouter, str});
    }

    private static final String onNavigationEvent(bindEngineRouter bindenginerouter, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {bindenginerouter, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, -90453027, 90453029, objArr);
    }

    private static final String IAuthTabCallback(String str, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, int i) {
        Object[] objArr = {str, surfaceProcessorWithExecutorExternalSyntheticLambda1, Integer.valueOf(i)};
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (String) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted, 99606765, -99606759, objArr);
    }

    private static final int onNavigationEvent(SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, String str) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return ((Integer) IAuthTabCallback(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, iOnWarmupCompleted, 1732453159, -1732453151, new Object[]{surfaceProcessorWithExecutorExternalSyntheticLambda1, str})).intValue();
    }
}
