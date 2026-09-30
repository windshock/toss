package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddings;
import im.toss.tds.compose.component.compound.RemoveCompoundPaddingsKt;
import im.toss.tds.compose.component.compound.top.TdsTopV2Kt$;
import im.toss.tds.compose.component.compound.top.v2.RightPreset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.initSDK;
import o.isExtraPreviewRequired;
import o.oExternalSyntheticLambda0;
import o.putCharArray;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda6 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~((~i) | i8);
        int i10 = i | i8;
        int i11 = i2 + i5 + i3 + ((-189913888) * i4) + ((-1809372279) * i6);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i5) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i3) + (952107008 * i4) + (1092222976 * i6) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i5 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i3 * 986544659) + (i4 * 1843362976) + (i6 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        boolean z = false;
        boolean z2 = true;
        switch (i15) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i16 = 2 % 2;
                int i17 = asBinder;
                int i18 = i17 + 17;
                int i19 = i18 % 128;
                onTransact = i19;
                if (i18 % 2 == 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 3) {
                    int i20 = i17 + 31;
                    onTransact = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = false;
                } else {
                    int i22 = i19 + 29;
                    asBinder = i22 % 128;
                    int i23 = i22 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2092042720, iIntValue, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:227)");
                    }
                    IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0}, 638313536, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -638313529, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i24 = onTransact + 19;
                        asBinder = i24 % 128;
                        int i25 = i24 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    int i26 = onTransact + 111;
                    asBinder = i26 % 128;
                    if (i26 % 2 == 0) {
                        int i27 = 2 % 3;
                    }
                }
                return Unit.INSTANCE;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                final int iIntValue2 = ((Number) objArr[1]).intValue();
                int i28 = 2 % 2;
                int i29 = asBinder + 5;
                onTransact = i29 % 128;
                int i30 = i29 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(492745057);
                if (iIntValue2 != 0) {
                    int i31 = onTransact + 65;
                    asBinder = i31 % 128;
                    if (i31 % 2 == 0) {
                        int i32 = 4 / 5;
                    }
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue2 & 1)) {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(492745057, iIntValue2, -1, "im.toss.tds.compose.component.compound.top.Asset2Preview (TdsTopV2.kt:862)");
                    }
                    y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.onActivityResized(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda18
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i33 = 2 % 2;
                            int i34 = onWarmupCompleted + 27;
                            IAuthTabCallback = i34 % 128;
                            int i35 = i34 % 2;
                            Unit unitOnNavigationEvent = y1ExternalSyntheticLambda6.onNavigationEvent(iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i36 = onWarmupCompleted + 93;
                            IAuthTabCallback = i36 % 128;
                            if (i36 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    });
                }
                return null;
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onTransact + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit typedObject = readTypedObject(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(z, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 123;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent = (y1ExternalSyntheticLambda0.onNavigationEvent) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[4];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[5];
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[6];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[7];
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[8];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[9];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[10];
        float fFloatValue = ((Number) objArr[11]).floatValue();
        float fFloatValue2 = ((Number) objArr[12]).floatValue();
        Function0 function0 = (Function0) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        int iIntValue2 = ((Number) objArr[15]).intValue();
        int iIntValue3 = ((Number) objArr[16]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue4 = ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, onnavigationevent, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, onwarmupcompleted, getbacktracenote5, getbacktracenote6, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), function0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue4)}, 2117210526, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -2117210525, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i4 = asBinder + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 31;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 99;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAccess000 = access000(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 70 / 0;
        }
        int i7 = asBinder + 41;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return access000(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        access000(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 67;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit access000(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onTransact(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 61;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return unit;
    }

    private static final Unit access100(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 93;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))}, 240841621, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -240841610, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 33;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asBinder(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess100 = access100(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 29;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        IAuthTabCallback_Parcel(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 5;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, onextracallbackwithresult, getbacktracenote, onnavigationevent, getbacktracenote2, onextracallbackwithresult2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackStubProxy(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStubProxy(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 67;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {onnavigationevent, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (i4 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, objArr, -596538665, iOnExtraCallback2, iOnExtraCallback3, 596538670, iOnExtraCallback4);
        int i5 = asBinder + 59;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(z, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Map map, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m2, Ref.BooleanRef booleanRef, int i, int i2, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m3, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m4, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i4 = 2 % 2;
        int i5 = onTransact + 21;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return onNavigationEvent(map, r8lambdavzmrfuakaij8kq5cm2nl8_za5m, r8lambdavzmrfuakaij8kq5cm2nl8_za5m2, booleanRef, i, i2, r8lambdavzmrfuakaij8kq5cm2nl8_za5m3, r8lambdavzmrfuakaij8kq5cm2nl8_za5m4, i3, onextracallbackwithresult);
        }
        onNavigationEvent(map, r8lambdavzmrfuakaij8kq5cm2nl8_za5m, r8lambdavzmrfuakaij8kq5cm2nl8_za5m2, booleanRef, i, i2, r8lambdavzmrfuakaij8kq5cm2nl8_za5m3, r8lambdavzmrfuakaij8kq5cm2nl8_za5m4, i3, onextracallbackwithresult);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote4, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote5, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote6, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, f, f2, getbacktracenote, getbacktracenote2, getbacktracenote3, function0, onextracallbackwithresult, getbacktracenote4, onnavigationevent, getbacktracenote5, onextracallbackwithresult2, getbacktracenote6, onwarmupcompleted, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 63;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, float f, float f2, RemoveCompoundPaddings removeCompoundPaddings, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote4, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote5, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote6, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, putCharSequenceArray putcharsequencearray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, f, f2, removeCompoundPaddings, getbacktracenote, getbacktracenote2, getbacktracenote3, function0, onextracallbackwithresult, getbacktracenote4, onnavigationevent, getbacktracenote5, onextracallbackwithresult2, getbacktracenote6, onwarmupcompleted, putcharsequencearray, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 34 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -525234320, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 525234326, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        Object[] objArr = {getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 55 / 0;
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr, -525234320, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 525234326, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 87;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{onextracallbackwithresult, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -195485879, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 195485889, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i5 = asBinder + 125;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return unit;
    }

    public static /* synthetic */ component8 onExtraCallbackWithResult(RemoveCompoundPaddings removeCompoundPaddings, putCharSequenceArray putcharsequencearray, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, getBacktraceNote getbacktracenote5, Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote6, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(removeCompoundPaddings, putcharsequencearray, onwarmupcompleted, getbacktracenote, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, function0, onextracallbackwithresult, onnavigationevent, getbacktracenote6, onextracallbackwithresult2, isextrapreviewrequired, virtualCameraCaptureResult);
            throw null;
        }
        component8 component8VarIAuthTabCallback = IAuthTabCallback(removeCompoundPaddings, putcharsequencearray, onwarmupcompleted, getbacktracenote, getbacktracenote2, getbacktracenote3, getbacktracenote4, getbacktracenote5, function0, onextracallbackwithresult, onnavigationevent, getbacktracenote6, onextracallbackwithresult2, isextrapreviewrequired, virtualCameraCaptureResult);
        int i3 = asBinder + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return component8VarIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iOnExtraCallbackWithResult;
        int iOnExtraCallbackWithResult2;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent = (y1ExternalSyntheticLambda0.onNavigationEvent) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[4];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[5];
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[6];
        getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[7];
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[8];
        getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[9];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[10];
        float fFloatValue = ((Number) objArr[11]).floatValue();
        float fFloatValue2 = ((Number) objArr[12]).floatValue();
        Function0 function0 = (Function0) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        int iIntValue2 = ((Number) objArr[15]).intValue();
        int iIntValue3 = ((Number) objArr[16]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
        } else {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2);
        }
        onExtraCallbackWithResult((getBacktraceNote<? super y1a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, quirksExternalSyntheticBackport0, onnavigationevent, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, onextracallbackwithresult, (getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote3, onextracallbackwithresult2, (getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote4, onwarmupcompleted, (getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote5, (getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote6, fFloatValue, fFloatValue2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i3 = asBinder + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 1;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 63;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -775003329, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 775003338, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i5 = onTransact + 39;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 9;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 87;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallbackDefault(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.BooleanRef booleanRef, getBacktraceNote getbacktracenote, Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote3, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{booleanRef, getbacktracenote, function0, onextracallbackwithresult, getbacktracenote2, onnavigationevent, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 517884041, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -517884041, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(151081473, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:220)");
            }
            writeTypedObject(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onTransact + 73;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i4 = 43 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit extraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onTransact + 117;
            asBinder = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asBinder + 121;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1001554730, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:231)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1001554730, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:231)");
            }
            IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, false, cameraCaptureResultEmptyCameraCaptureResult, 48}, -163672720, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 163672732, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 117;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 == 0) {
                    throw null;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit readTypedObject(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1190575560, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:240)");
            }
            IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, true, cameraCaptureResultEmptyCameraCaptureResult, 48}, -163672720, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 163672732, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i3 = asBinder + 81;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 125;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-944536073, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:255)");
                int i3 = asBinder + 51;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            if (function0 != null) {
                int i5 = asBinder + 43;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1951851713);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    int i7 = onTransact + 31;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized, getSharedInstance.onExtraCallback(false, false, 0L, null, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), null, null, null, 239, null), false, (String) null, (Role) null, function0, 28, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1952362035);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0IAuthTabCallback = quirksExternalSyntheticBackport0;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i9 = onTransact + 121;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
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
            onExtraCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Subtitle1, onextracallbackwithresult, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 6);
            onWarmupCompleted(onnavigationevent, (getBacktraceNote<? super y1a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            onExtraCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Subtitle2, onextracallbackwithresult2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        Ref.BooleanRef booleanRef = (Ref.BooleanRef) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[3];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[4];
        final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent = (y1ExternalSyntheticLambda0.onNavigationEvent) objArr[5];
        final getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[6];
        final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[7];
        final getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(969675447, iIntValue, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsTopV2.kt:250)");
            }
            accessisMonitoringp<RemoveCompoundPaddings> accessismonitoringpOnExtraCallbackWithResult = RemoveCompoundPaddingsKt.onExtraCallbackWithResult();
            RemoveCompoundPaddings removeCompoundPaddings = (RemoveCompoundPaddings) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(RemoveCompoundPaddingsKt.onExtraCallbackWithResult());
            if (!booleanRef.element) {
                int i2 = onTransact;
                int i3 = i2 + 15;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 34 / 0;
                    if (getbacktracenote != null) {
                        int i5 = i2 + 63;
                        asBinder = i5 % 128;
                        int i6 = i5 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (getbacktracenote != null) {
                }
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnExtraCallbackWithResult.onExtraCallback(RemoveCompoundPaddings.onExtraCallback(removeCompoundPaddings, false, false, z, false, 11, null)), ForwardingCameraControl.onExtraCallback(-944536073, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 53;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            y1ExternalSyntheticLambda6.onExtraCallback(function0, onextracallbackwithresult, getbacktracenote2, onnavigationevent, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                        Unit unitOnExtraCallback = y1ExternalSyntheticLambda6.onExtraCallback(function0, onextracallbackwithresult, getbacktracenote2, onnavigationevent, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i9 = onExtraCallback + 45;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onTransact + 111;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final component8 IAuthTabCallback(RemoveCompoundPaddings removeCompoundPaddings, putCharSequenceArray putcharsequencearray, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final getBacktraceNote getbacktracenote4, final getBacktraceNote getbacktracenote5, final Function0 function0, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, final getBacktraceNote getbacktracenote6, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int iOnExtraCallbackWithResult;
        boolean z;
        boolean z2;
        int iOnExtraCallbackWithResult2;
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda2;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedOnExtraCallback;
        int iOnExtraCallbackWithResult3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        int iAsInterface = VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback());
        int iIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback());
        if (removeCompoundPaddings.IAuthTabCallbackStub()) {
            int i3 = onTransact + 91;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            iOnExtraCallbackWithResult = 0;
        } else {
            iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(onNavigationEvent);
        }
        final int iCoerceAtLeast = RangesKt.coerceAtLeast((iAsInterface - iOnExtraCallbackWithResult) - (removeCompoundPaddings.onExtraCallback() ? 0 : isextrapreviewrequired.onExtraCallbackWithResult(onNavigationEvent)), 0);
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda22 = y1ExternalSyntheticLambda2.Upper;
        final r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult = onExtraCallbackWithResult((List<? extends component7>) isextrapreviewrequired.IAuthTabCallback(y1externalsyntheticlambda22, ForwardingCameraControl.onExtraCallbackWithResult(151081473, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                Unit unitOnTransact;
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 31;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    unitOnTransact = y1ExternalSyntheticLambda6.onTransact(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = 0 / 0;
                } else {
                    unitOnTransact = y1ExternalSyntheticLambda6.onTransact(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
                int i8 = onExtraCallback + 47;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return unitOnTransact;
            }
        })), lb.onNavigationEvent(0, iCoerceAtLeast, 0, iIAuthTabCallbackDefault, 5, null));
        int iOnExtraCallbackWithResult4 = removeCompoundPaddings.IAuthTabCallbackStub() ? 0 : isextrapreviewrequired.onExtraCallbackWithResult(onExtraCallback);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((iAsInterface - iOnExtraCallbackWithResult4) - (removeCompoundPaddings.onExtraCallback() ? 0 : isextrapreviewrequired.onExtraCallbackWithResult(onExtraCallback)), 0);
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda23 = y1ExternalSyntheticLambda2.Lower;
        final r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult2 = onExtraCallbackWithResult((List<? extends component7>) isextrapreviewrequired.IAuthTabCallback(y1externalsyntheticlambda23, ForwardingCameraControl.onExtraCallbackWithResult(2092042720, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 1;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitOnNavigationEvent = y1ExternalSyntheticLambda6.onNavigationEvent(getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i8 = onWarmupCompleted + 43;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        })), lb.onNavigationEvent(0, iCoerceAtLeast2, 0, iIAuthTabCallbackDefault, 5, null));
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda24 = y1ExternalSyntheticLambda2.Right;
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(y1externalsyntheticlambda24, ForwardingCameraControl.onExtraCallbackWithResult(1001554730, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda22
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 89;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Unit unit = (Unit) y1ExternalSyntheticLambda6.IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote5, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 754740091, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -754740089, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                int i8 = onNavigationEvent + 67;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (isextrapreviewrequired.onNavigationEvent() < 2.0f || !putcharsequencearray.onExtraCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Right, putCharArray.Companion.asInterface())) {
            int i5 = onTransact + 57;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        booleanRef.element = z;
        if (z) {
            listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(y1ExternalSyntheticLambda2.AdjustRight, ForwardingCameraControl.onExtraCallbackWithResult(1190575560, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda23
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    getBacktraceNote getbacktracenote7 = getbacktracenote5;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (i9 == 0) {
                        return y1ExternalSyntheticLambda6.IAuthTabCallback(getbacktracenote7, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    }
                    y1ExternalSyntheticLambda6.IAuthTabCallback(getbacktracenote7, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }));
        }
        final r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3 = onExtraCallbackWithResult((List<? extends component7>) listIAuthTabCallback, lb.onNavigationEvent(0, iCoerceAtLeast, 0, iIAuthTabCallbackDefault, 5, null));
        if (!booleanRef.element) {
            z2 = false;
        } else {
            int i7 = asBinder + 123;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3.onExtraCallback() > 0 && r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3.onExtraCallbackWithResult() > 0) {
                z2 = true;
            }
        }
        booleanRef.element = z2;
        if (z2) {
            int i9 = asBinder + 101;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            iOnExtraCallbackWithResult2 = iCoerceAtLeast;
        } else {
            iOnExtraCallbackWithResult2 = iCoerceAtLeast - r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3.onExtraCallbackWithResult();
        }
        int iCoerceAtLeast3 = RangesKt.coerceAtLeast(iOnExtraCallbackWithResult2, 0);
        y1ExternalSyntheticLambda2 y1externalsyntheticlambda25 = y1ExternalSyntheticLambda2.Title;
        final r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult4 = onExtraCallbackWithResult((List<? extends component7>) isextrapreviewrequired.IAuthTabCallback(y1externalsyntheticlambda25, ForwardingCameraControl.onExtraCallbackWithResult(969675447, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda24
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i11 = 2 % 2;
                int i12 = onNavigationEvent + 9;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                Unit unitOnWarmupCompleted = y1ExternalSyntheticLambda6.onWarmupCompleted(booleanRef, getbacktracenote5, function0, onextracallbackwithresult, getbacktracenote2, onnavigationevent, getbacktracenote6, onextracallbackwithresult2, getbacktracenote4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i14 = onNavigationEvent + 101;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        })), lb.onNavigationEvent(0, iCoerceAtLeast3, 0, iIAuthTabCallbackDefault, 5, null));
        int iOnExtraCallbackWithResult5 = isextrapreviewrequired.onExtraCallbackWithResult(onExtraCallbackWithResult);
        int iOnExtraCallback = r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult4.onExtraCallback();
        int iOnExtraCallback3 = r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3.onExtraCallback();
        int iOnExtraCallback4 = r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult2.onExtraCallback();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(y1externalsyntheticlambda22, 0);
        if (iOnExtraCallback > 0) {
            iOnExtraCallback += iOnExtraCallbackWithResult5;
        }
        if (!(!booleanRef.element)) {
            linkedHashMap.put(y1externalsyntheticlambda25, Integer.valueOf(iOnExtraCallback));
            int iOnExtraCallbackWithResult6 = iOnExtraCallback + iOnExtraCallback2 + isextrapreviewrequired.onExtraCallbackWithResult(onWarmupCompleted);
            linkedHashMap.put(y1ExternalSyntheticLambda2.AdjustRight, Integer.valueOf(iOnExtraCallbackWithResult6));
            i = iOnExtraCallbackWithResult6 + iOnExtraCallback3;
        } else {
            y1ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted2 = y1ExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult;
            if (Intrinsics.areEqual(onwarmupcompleted, onwarmupcompleted2.onNavigationEvent())) {
                y1ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = y1ExternalSyntheticLambda0.IAuthTabCallback.Right;
                putCharArray.onNavigationEvent onnavigationevent2 = putCharArray.Companion;
                y1externalsyntheticlambda2 = y1externalsyntheticlambda25;
                if (!putBooleanArray.onWarmupCompleted(putcharsequencearray, iAuthTabCallback, onnavigationevent2.asInterface(), onnavigationevent2.IAuthTabCallback())) {
                    onwarmupcompletedOnExtraCallback = onwarmupcompleted2.onExtraCallback();
                } else if (!(getbacktracenote == null && getbacktracenote2 == null) && getbacktracenote3 == null && getbacktracenote4 == null) {
                    int i11 = asBinder + 121;
                    onTransact = i11 % 128;
                    int i12 = i11 % 2;
                    onwarmupcompletedOnExtraCallback = onwarmupcompleted2.onExtraCallbackWithResult();
                } else {
                    onwarmupcompletedOnExtraCallback = onwarmupcompleted2.onExtraCallback();
                }
            } else {
                y1externalsyntheticlambda2 = y1externalsyntheticlambda25;
                onwarmupcompletedOnExtraCallback = onwarmupcompleted;
            }
            int iMax = Math.max(iOnExtraCallback2, iOnExtraCallback3);
            linkedHashMap.put(y1externalsyntheticlambda2, Integer.valueOf(QuirkSettingsLoader.Companion.IAuthTabCallbackDefault().onExtraCallbackWithResult(iOnExtraCallback2, iMax) + iOnExtraCallback));
            if (iOnExtraCallback3 > 0) {
                int i13 = onTransact + 79;
                asBinder = i13 % 128;
                if (i13 % 2 == 0) {
                    onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(iOnExtraCallback3, iMax);
                    throw null;
                }
                iOnExtraCallbackWithResult3 = onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(iOnExtraCallback3, iMax);
            } else {
                iOnExtraCallbackWithResult3 = 0;
            }
            linkedHashMap.put(y1externalsyntheticlambda24, Integer.valueOf(iOnExtraCallbackWithResult3 + iOnExtraCallback));
            i = iOnExtraCallback + iMax;
        }
        if (iOnExtraCallback4 > 0) {
            i += iOnExtraCallbackWithResult5;
        }
        linkedHashMap.put(y1externalsyntheticlambda23, Integer.valueOf(i));
        final int i14 = iOnExtraCallbackWithResult;
        final int i15 = iOnExtraCallbackWithResult4;
        return component4.IAuthTabCallback(isextrapreviewrequired, iAsInterface, i + iOnExtraCallback4, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda25
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i16 = 2 % 2;
                int i17 = IAuthTabCallback + 37;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(linkedHashMap, r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult, r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult4, booleanRef, i14, iCoerceAtLeast, r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult3, r8lambdavzmrfuakaij8kq5cm2nl8_za5mOnExtraCallbackWithResult2, i15, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i19 = onNavigationEvent + 23;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 4, (Object) null);
    }

    private static final Unit onNavigationEvent(Map map, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m2, Ref.BooleanRef booleanRef, int i, int i2, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m3, r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M r8lambdavzmrfuakaij8kq5cm2nl8_za5m4, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Pair pairIAuthTabCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Object obj = map.get(y1ExternalSyntheticLambda2.Upper);
        Intrinsics.checkNotNull(obj);
        int iIntValue = ((Number) obj).intValue();
        List<getStreamSharingChildren> listOnNavigationEvent = r8lambdavzmrfuakaij8kq5cm2nl8_za5m.onNavigationEvent();
        int size = listOnNavigationEvent.size();
        for (int i5 = 0; i5 < size; i5++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, listOnNavigationEvent.get(i5), i, iIntValue, 0.0f, 4, (Object) null);
        }
        Object obj2 = map.get(y1ExternalSyntheticLambda2.Title);
        Intrinsics.checkNotNull(obj2);
        int iIntValue2 = ((Number) obj2).intValue();
        List<getStreamSharingChildren> listOnNavigationEvent2 = r8lambdavzmrfuakaij8kq5cm2nl8_za5m2.onNavigationEvent();
        int size2 = listOnNavigationEvent2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, listOnNavigationEvent2.get(i6), i, iIntValue2, 0.0f, 4, (Object) null);
        }
        if (booleanRef.element) {
            int i7 = onTransact + 125;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            Object obj3 = map.get(y1ExternalSyntheticLambda2.AdjustRight);
            Intrinsics.checkNotNull(obj3);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf(i), obj3);
            int i9 = onTransact + 89;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int iOnExtraCallbackWithResult = r8lambdavzmrfuakaij8kq5cm2nl8_za5m3.onExtraCallbackWithResult();
            Object obj4 = map.get(y1ExternalSyntheticLambda2.Right);
            Intrinsics.checkNotNull(obj4);
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Integer.valueOf((i2 - iOnExtraCallbackWithResult) + i), obj4);
        }
        int iIntValue3 = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).intValue();
        int iIntValue4 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
        List<getStreamSharingChildren> listOnNavigationEvent3 = r8lambdavzmrfuakaij8kq5cm2nl8_za5m3.onNavigationEvent();
        int size3 = listOnNavigationEvent3.size();
        int i11 = 0;
        while (i11 < size3) {
            int i12 = onTransact + 39;
            asBinder = i12 % 128;
            if (i12 % 2 == 0) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, listOnNavigationEvent3.get(i11), iIntValue3, iIntValue4, 2.0f, 5, (Object) null);
                i11 += 85;
            } else {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, listOnNavigationEvent3.get(i11), iIntValue3, iIntValue4, 0.0f, 4, (Object) null);
                i11++;
            }
        }
        Object obj5 = map.get(y1ExternalSyntheticLambda2.Lower);
        Intrinsics.checkNotNull(obj5);
        int iIntValue5 = ((Number) obj5).intValue();
        List<getStreamSharingChildren> listOnNavigationEvent4 = r8lambdavzmrfuakaij8kq5cm2nl8_za5m4.onNavigationEvent();
        int size4 = listOnNavigationEvent4.size();
        for (int i13 = 0; i13 < size4; i13++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, listOnNavigationEvent4.get(i13), i3, iIntValue5, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, float f, float f2, final RemoveCompoundPaddings removeCompoundPaddings, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final Function0 function0, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote4, final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, final getBacktraceNote getbacktracenote5, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, final getBacktraceNote getbacktracenote6, final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, final putCharSequenceArray putcharsequencearray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 109;
            asBinder = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asBinder + 123;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-330928277, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous> (TdsTopV2.kt:206)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-330928277, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous>.<anonymous> (TdsTopV2.kt:206)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = putCharSequence.onExtraCallbackWithResult(quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02), 0.0f, f, 0.0f, f2, cameraCaptureResultEmptyCameraCaptureResult, 0, 5);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(removeCompoundPaddings);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote2);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote3);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote4);
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onnavigationevent);
            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote5);
            boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult2);
            boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote6);
            boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6 | zOnNavigationEvent7 | zOnNavigationEvent8 | zOnNavigationEvent9 | zOnNavigationEvent10 | zOnNavigationEvent11 | zOnNavigationEvent12) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 57;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        component8 component8VarOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(removeCompoundPaddings, putcharsequencearray, onwarmupcompleted, getbacktracenote, getbacktracenote4, getbacktracenote2, getbacktracenote6, getbacktracenote3, function0, onextracallbackwithresult, onnavigationevent, getbacktracenote5, onextracallbackwithresult2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                        int i8 = onExtraCallbackWithResult + 77;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return component8VarOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, final float f2, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final Function0 function0, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote4, final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, final getBacktraceNote getbacktracenote5, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, final getBacktraceNote getbacktracenote6, final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, initSDK initsdk, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i5 = asBinder + 117;
                onTransact = i5 % 128;
                i3 = i5 % 2 != 0 ? 79 : 32;
            } else {
                i3 = 16;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 145) != 144, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onTransact + 65;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(565597416, i2, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2.<anonymous> (TdsTopV2.kt:199)");
                int i8 = onTransact + 113;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
            }
            final RemoveCompoundPaddings removeCompoundPaddings = (RemoveCompoundPaddings) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(RemoveCompoundPaddingsKt.onExtraCallbackWithResult());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new putCharSequenceArray();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objOnMinimized;
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onRelationshipValidationResult(), null, putcharsequencearray, ForwardingCameraControl.onExtraCallback(-330928277, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda19
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, f, f2, removeCompoundPaddings, getbacktracenote, getbacktracenote2, getbacktracenote3, function0, onextracallbackwithresult, getbacktracenote4, onnavigationevent, getbacktracenote5, onextracallbackwithresult2, getbacktracenote6, onwarmupcompleted, putcharsequencearray, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = onExtraCallback + 117;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3462, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 109;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final getBacktraceNote<? super y1a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, @Nullable getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, @Nullable getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, @Nullable QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, @Nullable getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5, @Nullable getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6, float f, float f2, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
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
        int i21;
        int i22;
        int i23;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent2;
        final getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult3;
        final getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult4;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2;
        final getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        final getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        final float f3;
        final float f4;
        final Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        y1ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallback;
        getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult2;
        int i24 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(814258643);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i25 = i3 & 2;
        if (i25 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true ? 16 : 32;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                int i26 = onTransact + 95;
                asBinder = i26 % 128;
                i4 = i26 % 2 == 0 ? i4 | 986 : i4 | 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        int i27 = asBinder + 85;
                        onTransact = i27 % 128;
                        int i28 = i27 % 2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
                                int i29 = onTransact + 97;
                                asBinder = i29 % 128;
                                i8 = i29 % 2 == 0 ? 176 : 16384;
                            } else {
                                i8 = 8192;
                            }
                            i9 = i8 | i4;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i9 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                int i30 = asBinder + 25;
                                onTransact = i30 % 128;
                                int i31 = i30 % 2;
                                i9 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ^ true) ? 131072 : 65536;
                            }
                            i11 = i3 & 64;
                            if (i11 == 0) {
                                i9 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 1048576 : 524288;
                            }
                            i12 = i3 & 128;
                            if (i12 == 0) {
                                int i32 = onTransact + 19;
                                asBinder = i32 % 128;
                                if (i32 % 2 == 0) {
                                    throw null;
                                }
                                i9 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                int i33 = asBinder + 113;
                                onTransact = i33 % 128;
                                if (i33 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4);
                                    throw null;
                                }
                                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4) ? 8388608 : 4194304;
                            }
                            i13 = i3 & 256;
                            if (i13 == 0) {
                                i9 |= 100663296;
                            } else {
                                if ((100663296 & i) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted)) {
                                        int i34 = onTransact + 27;
                                        asBinder = i34 % 128;
                                        if (i34 % 2 == 0) {
                                            int i35 = 29 / 0;
                                        }
                                        i14 = 67108864;
                                    } else {
                                        i14 = 33554432;
                                    }
                                    i15 = i14 | i9;
                                }
                                i16 = i3 & 512;
                                if (i16 != 0) {
                                    i15 |= 805306368;
                                } else {
                                    if ((805306368 & i) == 0) {
                                        i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 536870912 : 268435456;
                                    }
                                    i17 = i3 & 1024;
                                    if (i17 == 0) {
                                        i18 = i2 | 6;
                                    } else if ((i2 & 6) == 0) {
                                        i18 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 4 : 2);
                                    } else {
                                        i18 = i2;
                                    }
                                    i19 = i3 & 2048;
                                    if (i19 == 0) {
                                        i18 |= 48;
                                    } else if ((i2 & 48) == 0) {
                                        i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
                                    }
                                    i20 = i18;
                                    i21 = i3 & 4096;
                                    if (i21 == 0) {
                                        i20 |= 384;
                                        i22 = i21;
                                    } else {
                                        i22 = i21;
                                        if ((i2 & 384) == 0) {
                                            i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 256 : 128;
                                        }
                                        i23 = i3 & 8192;
                                        if (i23 == 0) {
                                            if ((i2 & 3072) == 0) {
                                                i20 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
                                            }
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                                onnavigationevent2 = onnavigationevent;
                                                getbacktracenote7 = getbacktracenote2;
                                                onextracallbackwithresult3 = onextracallbackwithresult;
                                                getbacktracenote8 = getbacktracenote3;
                                                onextracallbackwithresult4 = onextracallbackwithresult2;
                                                getbacktracenote9 = getbacktracenote4;
                                                onwarmupcompleted2 = onwarmupcompleted;
                                                getbacktracenote10 = getbacktracenote5;
                                                getbacktracenote11 = getbacktracenote6;
                                                f3 = f;
                                                f4 = f2;
                                                function02 = function0;
                                            } else {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i25 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                if (i5 != 0) {
                                                    int i36 = asBinder + 65;
                                                    onTransact = i36 % 128;
                                                    int i37 = i36 % 2;
                                                    onnavigationeventOnExtraCallback = y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback();
                                                } else {
                                                    onnavigationeventOnExtraCallback = onnavigationevent;
                                                }
                                                if (i6 != 0) {
                                                    int i38 = asBinder + 87;
                                                    onTransact = i38 % 128;
                                                    if (i38 % 2 != 0) {
                                                        function0.hashCode();
                                                        throw null;
                                                    }
                                                    getbacktracenote12 = null;
                                                } else {
                                                    getbacktracenote12 = getbacktracenote2;
                                                }
                                                y1ExternalSyntheticLambda0.onExtraCallbackWithResult onExtraCallbackWithResult3 = i7 != 0 ? y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult() : onextracallbackwithresult;
                                                getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13 = i10 != 0 ? null : getbacktracenote3;
                                                if (i11 != 0) {
                                                    int i39 = asBinder + 5;
                                                    onTransact = i39 % 128;
                                                    int i40 = i39 % 2;
                                                    onExtraCallbackWithResult2 = y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
                                                } else {
                                                    onExtraCallbackWithResult2 = onextracallbackwithresult2;
                                                }
                                                getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14 = i12 != 0 ? null : getbacktracenote4;
                                                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedOnNavigationEvent = i13 != 0 ? y1ExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent() : onwarmupcompleted;
                                                getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15 = i16 != 0 ? null : getbacktracenote5;
                                                getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16 = i17 != 0 ? null : getbacktracenote6;
                                                float fOnExtraCallbackWithResult = i19 != 0 ? y1ExternalSyntheticLambda5.onNavigationEvent.onExtraCallbackWithResult() : f;
                                                float fOnWarmupCompleted = i22 != 0 ? y1ExternalSyntheticLambda5.onNavigationEvent.onWarmupCompleted() : f2;
                                                function0 = i23 == 0 ? function0 : null;
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(814258643, i15, i20, "im.toss.tds.compose.component.compound.top.TdsTopV2 (TdsTopV2.kt:197)");
                                                }
                                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                final float f5 = fOnExtraCallbackWithResult;
                                                final float f6 = fOnWarmupCompleted;
                                                final getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote17 = getbacktracenote15;
                                                final getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote18 = getbacktracenote16;
                                                final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote19 = getbacktracenote14;
                                                final Function0<Unit> function03 = function0;
                                                final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult5 = onExtraCallbackWithResult3;
                                                final getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote20 = getbacktracenote12;
                                                final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent3 = onnavigationeventOnExtraCallback;
                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult6 = onExtraCallbackWithResult2;
                                                final getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote21 = getbacktracenote13;
                                                final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedOnNavigationEvent;
                                                setThreadList.IAuthTabCallback(IOOMCallback.Top, (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(565597416, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda12
                                                    private static int IAuthTabCallback = 0;
                                                    private static int onExtraCallbackWithResult = 1;

                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        int i41 = 2 % 2;
                                                        int i42 = IAuthTabCallback + 29;
                                                        onExtraCallbackWithResult = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, f5, f6, getbacktracenote17, getbacktracenote18, getbacktracenote19, function03, onextracallbackwithresult5, getbacktracenote20, onnavigationevent3, getbacktracenote, onextracallbackwithresult6, getbacktracenote21, onwarmupcompleted3, (initSDK) obj, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                        int i44 = onExtraCallbackWithResult + 1;
                                                        IAuthTabCallback = i44 % 128;
                                                        if (i44 % 2 == 0) {
                                                            return unitOnExtraCallbackWithResult;
                                                        }
                                                        Object obj5 = null;
                                                        obj5.hashCode();
                                                        throw null;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196614, 30);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                onnavigationevent2 = onnavigationeventOnExtraCallback;
                                                f3 = fOnExtraCallbackWithResult;
                                                getbacktracenote7 = getbacktracenote12;
                                                onextracallbackwithresult3 = onExtraCallbackWithResult3;
                                                f4 = fOnWarmupCompleted;
                                                getbacktracenote8 = getbacktracenote13;
                                                onextracallbackwithresult4 = onExtraCallbackWithResult2;
                                                function02 = function0;
                                                getbacktracenote9 = getbacktracenote14;
                                                onwarmupcompleted2 = onwarmupcompletedOnNavigationEvent;
                                                getbacktracenote10 = getbacktracenote15;
                                                getbacktracenote11 = getbacktracenote16;
                                            }
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda13
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj, Object obj2) {
                                                        int i41 = 2 % 2;
                                                        int i42 = onExtraCallbackWithResult + 115;
                                                        onWarmupCompleted = i42 % 128;
                                                        int i43 = i42 % 2;
                                                        getBacktraceNote getbacktracenote22 = getbacktracenote;
                                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                                                        y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent4 = onnavigationevent2;
                                                        getBacktraceNote getbacktracenote23 = getbacktracenote7;
                                                        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult7 = onextracallbackwithresult3;
                                                        getBacktraceNote getbacktracenote24 = getbacktracenote8;
                                                        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult8 = onextracallbackwithresult4;
                                                        getBacktraceNote getbacktracenote25 = getbacktracenote9;
                                                        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
                                                        getBacktraceNote getbacktracenote26 = getbacktracenote10;
                                                        getBacktraceNote getbacktracenote27 = getbacktracenote11;
                                                        float f7 = f3;
                                                        float f8 = f4;
                                                        Function0 function04 = function02;
                                                        int i44 = i;
                                                        int i45 = i2;
                                                        int i46 = i3;
                                                        int iIntValue = ((Integer) obj2).intValue();
                                                        Unit unit = (Unit) y1ExternalSyntheticLambda6.IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote22, quirksExternalSyntheticBackport05, onnavigationevent4, getbacktracenote23, onextracallbackwithresult7, getbacktracenote24, onextracallbackwithresult8, getbacktracenote25, onwarmupcompleted4, getbacktracenote26, getbacktracenote27, Float.valueOf(f7), Float.valueOf(f8), function04, Integer.valueOf(i44), Integer.valueOf(i45), Integer.valueOf(i46), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -1686636941, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1686636949, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                                                        int i47 = onWarmupCompleted + 71;
                                                        onExtraCallbackWithResult = i47 % 128;
                                                        int i48 = i47 % 2;
                                                        return unit;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i20 |= 3072;
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        }
                                    }
                                    i23 = i3 & 8192;
                                    if (i23 == 0) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                    }
                                }
                                i17 = i3 & 1024;
                                if (i17 == 0) {
                                }
                                i19 = i3 & 2048;
                                if (i19 == 0) {
                                }
                                i20 = i18;
                                i21 = i3 & 4096;
                                if (i21 == 0) {
                                }
                                i23 = i3 & 8192;
                                if (i23 == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            i15 = i9;
                            i16 = i3 & 512;
                            if (i16 != 0) {
                            }
                            i17 = i3 & 1024;
                            if (i17 == 0) {
                            }
                            i19 = i3 & 2048;
                            if (i19 == 0) {
                            }
                            i20 = i18;
                            i21 = i3 & 4096;
                            if (i21 == 0) {
                            }
                            i23 = i3 & 8192;
                            if (i23 == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i11 = i3 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i3 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i3 & 256;
                        if (i13 == 0) {
                        }
                        i15 = i9;
                        i16 = i3 & 512;
                        if (i16 != 0) {
                        }
                        i17 = i3 & 1024;
                        if (i17 == 0) {
                        }
                        i19 = i3 & 2048;
                        if (i19 == 0) {
                        }
                        i20 = i18;
                        i21 = i3 & 4096;
                        if (i21 == 0) {
                        }
                        i23 = i3 & 8192;
                        if (i23 == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i4;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i3 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i3 & 256;
                    if (i13 == 0) {
                    }
                    i15 = i9;
                    i16 = i3 & 512;
                    if (i16 != 0) {
                    }
                    i17 = i3 & 1024;
                    if (i17 == 0) {
                    }
                    i19 = i3 & 2048;
                    if (i19 == 0) {
                    }
                    i20 = i18;
                    i21 = i3 & 4096;
                    if (i21 == 0) {
                    }
                    i23 = i3 & 8192;
                    if (i23 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i9 = i4;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                i11 = i3 & 64;
                if (i11 == 0) {
                }
                i12 = i3 & 128;
                if (i12 == 0) {
                }
                i13 = i3 & 256;
                if (i13 == 0) {
                }
                i15 = i9;
                i16 = i3 & 512;
                if (i16 != 0) {
                }
                i17 = i3 & 1024;
                if (i17 == 0) {
                }
                i19 = i3 & 2048;
                if (i19 == 0) {
                }
                i20 = i18;
                i21 = i3 & 4096;
                if (i21 == 0) {
                }
                i23 = i3 & 8192;
                if (i23 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i9 = i4;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            i11 = i3 & 64;
            if (i11 == 0) {
            }
            i12 = i3 & 128;
            if (i12 == 0) {
            }
            i13 = i3 & 256;
            if (i13 == 0) {
            }
            i15 = i9;
            i16 = i3 & 512;
            if (i16 != 0) {
            }
            i17 = i3 & 1024;
            if (i17 == 0) {
            }
            i19 = i3 & 2048;
            if (i19 == 0) {
            }
            i20 = i18;
            i21 = i3 & 4096;
            if (i21 == 0) {
            }
            i23 = i3 & 8192;
            if (i23 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
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
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i9 = i4;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        i11 = i3 & 64;
        if (i11 == 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i13 = i3 & 256;
        if (i13 == 0) {
        }
        i15 = i9;
        i16 = i3 & 512;
        if (i16 != 0) {
        }
        i17 = i3 & 1024;
        if (i17 == 0) {
        }
        i19 = i3 & 2048;
        if (i19 == 0) {
        }
        i20 = i18;
        i21 = i3 & 4096;
        if (i21 == 0) {
        }
        i23 = i3 & 8192;
        if (i23 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170, i15 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z = false;
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i2 = asBinder + 63;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asBinder + 63;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1731816211, iIntValue, -1, "im.toss.tds.compose.component.compound.top.UpperSlot.<anonymous> (TdsTopV2.kt:373)");
            }
            getbacktracenote.invoke(y1b.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 119;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void writeTypedObject(final getBacktraceNote<? super y1b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onTransact + 67;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-342601541, i, -1, "im.toss.tds.compose.component.compound.top.UpperSlot (TdsTopV2.kt:370)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-342601541, i, -1, "im.toss.tds.compose.component.compound.top.UpperSlot (TdsTopV2.kt:370)");
        }
        if (getbacktracenote != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1600114487);
            putBooleanArray.IAuthTabCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Upper, ForwardingCameraControl.onExtraCallback(-1731816211, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnExtraCallbackWithResult;
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i6 = 6 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i7 = onWarmupCompleted + 47;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1600024153);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onTransact + 113;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                throw null;
            }
            int i6 = asBinder + 31;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final Unit extraCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 73;
        asBinder = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 2) {
            int i5 = i3 + 39;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = asBinder + 1;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(271472054, i, -1, "im.toss.tds.compose.component.compound.top.TitleSlot.<anonymous>.<anonymous> (TdsTopV2.kt:391)");
            }
            getbacktracenote.invoke(y1a.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onTransact + 81;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean z;
        y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent = (y1ExternalSyntheticLambda0.onNavigationEvent) objArr[0];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onTransact;
            int i3 = i2 + 67;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-22503318, iIntValue, -1, "im.toss.tds.compose.component.compound.top.TitleSlot.<anonymous> (TdsTopV2.kt:386)");
            }
            getHumanReadableName gethumanreadablenameOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
            y1ExternalSyntheticLambda5 y1externalsyntheticlambda5 = y1ExternalSyntheticLambda5.onNavigationEvent;
            putCharSequence.onExtraCallback(gethumanreadablenameOnExtraCallbackWithResult, null, y1externalsyntheticlambda5.onTransact(cameraCaptureResultEmptyCameraCaptureResult, 6), (oExternalSyntheticLambda0.onWarmupCompleted) y1ExternalSyntheticLambda5.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{y1externalsyntheticlambda5, cameraCaptureResultEmptyCameraCaptureResult, 6}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1193204434, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1193204433), null, false, ForwardingCameraControl.onExtraCallback(271472054, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda10
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 9;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        y1ExternalSyntheticLambda6.IAuthTabCallbackDefault(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitIAuthTabCallbackDefault = y1ExternalSyntheticLambda6.IAuthTabCallbackDefault(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i9 = onExtraCallback + 93;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return unitIAuthTabCallbackDefault;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 50);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 75;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onTransact + 125;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 3;
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(final y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, final getBacktraceNote<? super y1a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-741313864, i, -1, "im.toss.tds.compose.component.compound.top.TitleSlot (TdsTopV2.kt:383)");
            int i5 = onTransact + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        if (getbacktracenote != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(240654908);
            putBooleanArray.IAuthTabCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Title, ForwardingCameraControl.onExtraCallback(-22503318, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 11;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallback = y1ExternalSyntheticLambda6.onExtraCallback(onnavigationevent, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 49 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(241006634);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onTransact + 15;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final void onExtraCallback(y1ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, final y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote<? super y1ExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1491998770, i, -1, "im.toss.tds.compose.component.compound.top.SubtitleSlot (TdsTopV2.kt:403)");
            int i5 = asBinder + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        putBooleanArray.IAuthTabCallback(iAuthTabCallback, ForwardingCameraControl.onExtraCallback(1782999681, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 117;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                if (i9 != 0) {
                    return y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onextracallbackwithresult2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
                Unit unitOnExtraCallbackWithResult = y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onextracallbackwithresult2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i10 = 93 / 0;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = asBinder + 99;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 3;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onTransact + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 1;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1988665675, i, -1, "im.toss.tds.compose.component.compound.top.SubtitleSlot.<anonymous>.<anonymous> (TdsTopV2.kt:409)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1988665675, i, -1, "im.toss.tds.compose.component.compound.top.SubtitleSlot.<anonymous>.<anonymous> (TdsTopV2.kt:409)");
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(439793557);
                getbacktracenote.invoke(y1ExternalSyntheticLambda3.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(439847373);
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

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[0];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = asBinder + 15;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 79;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1782999681, iIntValue, -1, "im.toss.tds.compose.component.compound.top.SubtitleSlot.<anonymous> (TdsTopV2.kt:405)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1782999681, iIntValue, -1, "im.toss.tds.compose.component.compound.top.SubtitleSlot.<anonymous> (TdsTopV2.kt:405)");
            }
            putCharSequence.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, y1ExternalSyntheticLambda5.onNavigationEvent.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6), null, false, ForwardingCameraControl.onExtraCallback(-1988665675, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda14
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnExtraCallback = y1ExternalSyntheticLambda6.onExtraCallback(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i8 = onExtraCallbackWithResult + 121;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 111;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onTransact + 65;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(boolean z, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 3;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = asBinder + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1628128477, i, -1, "im.toss.tds.compose.component.compound.top.RightSlot.<anonymous>.<anonymous> (TdsTopV2.kt:427)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new RightPreset(z);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getbacktracenote.invoke((RightPreset) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final boolean z, final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 73;
        onTransact = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asBinder + 59;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1160389335, i, -1, "im.toss.tds.compose.component.compound.top.RightSlot.<anonymous> (TdsTopV2.kt:424)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1160389335, i, -1, "im.toss.tds.compose.component.compound.top.RightSlot.<anonymous> (TdsTopV2.kt:424)");
            }
            putCharSequence.onExtraCallback(null, null, null, null, y1ExternalSyntheticLambda5.onNavigationEvent.onExtraCallback(), false, ForwardingCameraControl.onExtraCallback(-1628128477, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 91;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        y1ExternalSyntheticLambda6.IAuthTabCallback(z, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitIAuthTabCallback = y1ExternalSyntheticLambda6.IAuthTabCallback(z, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i7 = onExtraCallback + 123;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1597440, 47);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-954322779, iIntValue, -1, "im.toss.tds.compose.component.compound.top.RightSlot (TdsTopV2.kt:421)");
        }
        if (getbacktracenote != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1841241090);
            putBooleanArray.IAuthTabCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Right, ForwardingCameraControl.onExtraCallback(1160389335, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 21;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        y1ExternalSyntheticLambda6.onExtraCallback(zBooleanValue, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = y1ExternalSyntheticLambda6.onExtraCallback(zBooleanValue, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i6 = IAuthTabCallback + 35;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1840934531);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i4 = asBinder + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return null;
    }

    private static final Unit access000(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 109;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1219506374, i, -1, "im.toss.tds.compose.component.compound.top.LowerSlot.<anonymous>.<anonymous> (TdsTopV2.kt:444)");
            }
            getbacktracenote.invoke(y1ExternalSyntheticLambda4.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 11;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
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
        return Unit.INSTANCE;
    }

    private static final Unit access100(final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = asBinder + 115;
        int i5 = i4 % 128;
        onTransact = i5;
        int i6 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i7 = i5 + 77;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1947063570, i, -1, "im.toss.tds.compose.component.compound.top.LowerSlot.<anonymous> (TdsTopV2.kt:441)");
            }
            putCharSequence.onExtraCallback(null, null, null, null, (setCallToAction.onExtraCallbackWithResult) y1ExternalSyntheticLambda5.IAuthTabCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{y1ExternalSyntheticLambda5.onNavigationEvent}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1728346247, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1728346247), false, ForwardingCameraControl.onExtraCallback(-1219506374, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 97;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        y1ExternalSyntheticLambda6.IAuthTabCallbackStub(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitIAuthTabCallbackStub = y1ExternalSyntheticLambda6.IAuthTabCallbackStub(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = IAuthTabCallback + 43;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallbackStub;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1597440, 47);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i2 = asBinder + 99;
                onTransact = i2 % 128;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i2 = onTransact + 97;
        asBinder = i2 % 128;
        int i9 = i2 % 2;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-557848900, iIntValue, -1, "im.toss.tds.compose.component.compound.top.LowerSlot (TdsTopV2.kt:438)");
            int i2 = onTransact + 59;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        if (getbacktracenote != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1648009188);
            putBooleanArray.IAuthTabCallback(y1ExternalSyntheticLambda0.IAuthTabCallback.Lower, ForwardingCameraControl.onExtraCallback(-1947063570, true, new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 109;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    Unit unitAsBinder = y1ExternalSyntheticLambda6.asBinder(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i7 = onWarmupCompleted + 5;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unitAsBinder;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i4 = asBinder + 67;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1647784314);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = asBinder + 5;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                int i8 = 14 / 0;
            }
        }
        int i9 = onTransact + 57;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[PHI: r4 r6
      0x004e: PHI (r4v4 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x004c, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r6v7 o.getStreamSharingChildren) = (r6v5 o.getStreamSharingChildren), (r6v10 o.getStreamSharingChildren) binds: [B:10:0x004c, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M onExtraCallbackWithResult(List<? extends component7> list, long j) {
        getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int interfaceDescriptor = 0;
        int iT_ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = onTransact + 79;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                getstreamsharingchildrenOnExtraCallback = list.get(i2).onExtraCallback(j);
                interfaceDescriptor *= getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
                if (getstreamsharingchildrenOnExtraCallback.T_() > iT_) {
                    int i4 = onTransact + 33;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        getstreamsharingchildrenOnExtraCallback.T_();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    iT_ = getstreamsharingchildrenOnExtraCallback.T_();
                } else {
                    continue;
                }
            } else {
                getstreamsharingchildrenOnExtraCallback = list.get(i2).onExtraCallback(j);
                interfaceDescriptor += getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
                if (getstreamsharingchildrenOnExtraCallback.T_() <= iT_) {
                    continue;
                }
            }
            arrayList.add(getstreamsharingchildrenOnExtraCallback);
        }
        return new r8lambdavZmRfUaKaiJ8KQ5cM2nl8_za5M(interfaceDescriptor, iT_, arrayList);
    }

    public static final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallback;
        int i5 = i2 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private static final void onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-766850251);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = asBinder + 35;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 57;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-766850251, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2Preview (TdsTopV2.kt:488)");
                int i7 = asBinder + 33;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.onMinimized(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV2Kt$.ExternalSyntheticLambda3(i));
            int i9 = onTransact + 119;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(591981822);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = asBinder + 85;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.ICustomTabsCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            } else {
                int i4 = 90 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(591981822, i, -1, "im.toss.tds.compose.component.compound.top.TdsTopV2BigFontPreview (TdsTopV2.kt:552)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.ICustomTabsCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda16
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 13;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) y1ExternalSyntheticLambda6.IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{Integer.valueOf(i8), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, -999981899, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 999981903, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                    int i9 = IAuthTabCallback + 13;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            });
            int i5 = onTransact + 61;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r5
      0x0023: PHI (r5v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        asBinder = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(411921775);
            int i4 = 27 / 0;
            if (i != 0) {
                z = true;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(411921775);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i5 = onTransact + 69;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 15;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(411921775, i, -1, "im.toss.tds.compose.component.compound.top.CtaPreview (TdsTopV2.kt:614)");
                if (i8 == 0) {
                    throw null;
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.onActivityLayout(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV2Kt$.ExternalSyntheticLambda2(i));
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 51;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1877659826);
        if (i != 0) {
            int i5 = onTransact + 57;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1877659826, i, -1, "im.toss.tds.compose.component.compound.top.RightVerticalAlignmentPreview (TdsTopV2.kt:652)");
            }
            Object[] objArr = {r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback};
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.onExtraCallbackWithResult(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1826192803, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1826192817, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 69;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.TdsTopV2Kt$$ExternalSyntheticLambda26
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 5;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) y1ExternalSyntheticLambda6.IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{Integer.valueOf(i12), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 481252638, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -481252635, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
                    int i13 = onNavigationEvent + 125;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 18 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1081794364);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1081794364);
        if (i != 0) {
            int i4 = onTransact + 35;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i6 = onTransact + 63;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1081794364, i, -1, "im.toss.tds.compose.component.compound.top.BadgePreview (TdsTopV2.kt:766)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.onPostMessage(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asBinder + 41;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV2Kt$.ExternalSyntheticLambda17(i));
        }
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1786615186);
        if (i != 0) {
            int i3 = asBinder + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onTransact + 55;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1786615186, i, -1, "im.toss.tds.compose.component.compound.top.CustomPreview (TdsTopV2.kt:819)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaW9P9CDVGOhJt8qQG2JiTmKz1LOA.IAuthTabCallback.writeTypedObject(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asBinder + 31;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 43 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTopV2Kt$.ExternalSyntheticLambda6(i));
        }
        int i8 = asBinder + 51;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
    }

    static {
        int i = IAuthTabCallbackDefault + 97;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 754740091, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -754740089, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, -999981899, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 999981903, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, 481252638, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -481252635, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote3, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote4, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, float f, float f2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, onnavigationevent, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, onwarmupcompleted, getbacktracenote5, getbacktracenote6, Float.valueOf(f), Float.valueOf(f2), function0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, -1686636941, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1686636949, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 240841621, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -240841610, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final void asInterface(getBacktraceNote<? super y1ExternalSyntheticLambda4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 638313536, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -638313529, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final void onNavigationEvent(getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -163672720, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 163672732, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onExtraCallback(y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{onextracallbackwithresult, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -195485879, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 195485889, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit getInterfaceDescriptor(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -775003329, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 775003338, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onExtraCallback(Ref.BooleanRef booleanRef, getBacktraceNote getbacktracenote, Function0 function0, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote3, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{booleanRef, getbacktracenote, function0, onextracallbackwithresult, getbacktracenote2, onnavigationevent, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 517884041, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -517884041, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote2, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote3, y1ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote4, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote5, getBacktraceNote getbacktracenote6, float f, float f2, Function0 function0, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, onnavigationevent, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, getbacktracenote4, onwarmupcompleted, getbacktracenote5, getbacktracenote6, Float.valueOf(f), Float.valueOf(f2), function0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, 2117210526, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -2117210525, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onNavigationEvent(y1ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{onnavigationevent, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -596538665, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 596538670, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit ICustomTabsCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -525234320, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 525234326, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback());
    }
}
