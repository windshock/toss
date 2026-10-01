package o;

import android.content.Context;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.tds.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.AUTextView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.findResAndMsg;
import o.flipHorizontally;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.getSwitchMinWidth;
import o.isExtraPreviewRequired;
import o.putCharArray;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.readFully;
import o.setIso;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.x2ExternalSyntheticLambda19;
import o.x2ExternalSyntheticLambda22;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda22 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);
    private static final getConfiguration<Float> onWarmupCompleted = configureReward.onExtraCallback(0.9f, 1.0f);

    public static final /* synthetic */ class IAuthTabCallbackStub {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[x2ExternalSyntheticLambda19.onNavigationEvent.values().length];
            try {
                iArr[x2ExternalSyntheticLambda19.onNavigationEvent.Fixed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x2ExternalSyntheticLambda19.onNavigationEvent.Fluid.ordinal()] = 2;
                int i = onExtraCallback + 23;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        List list = (List) objArr[0];
        isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[1];
        List list2 = (List) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        List list3 = (List) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[8];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(list, isextrapreviewrequired, list2, iIntValue, getbacktracenote, list3, iIntValue2, iIntValue3, onextracallbackwithresult);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        x2ExternalSyntheticLambda17 x2externalsyntheticlambda17;
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i6));
        int i11 = ~(i7 | i9);
        int i12 = i | i11;
        int i13 = (~(i6 | i5)) | i11 | (~(i8 | i5));
        int i14 = i5 + i + i3 + (296844165 * i2) + (1729652556 * i4);
        int i15 = i14 * i14;
        int i16 = ((i5 * 599922083) - 580124672) + (599922083 * i) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i3) + ((-279707648) * i2) + ((-265289728) * i4) + (2117271552 * i15);
        int i17 = (i5 * (-1181628991)) + 1322814002 + (i * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + ((-1181629109) * i3) + ((-698251017) * i2) + (1773125444 * i4) + (i15 * 938541056);
        int i18 = 6;
        boolean z = true;
        switch (i16 + (i17 * i17 * (-109772800))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
                int i19 = 2 % 2;
                int i20 = onNavigationEvent + 121;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                Unit unit = (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, 661826817, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -661826817, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
                int i22 = onNavigationEvent + 25;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 4:
                x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult = (x2ExternalSyntheticLambda19.onExtraCallbackWithResult) objArr[0];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
                HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                int i24 = 2 % 2;
                int i25 = onExtraCallback + 39;
                onNavigationEvent = i25 % 128;
                int i26 = i25 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, getbacktracenote, getbacktracenote2, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i27 = onExtraCallback + 123;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return unitOnNavigationEvent;
            case 5:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i29 = 2 % 2;
                int i30 = onExtraCallback + 95;
                onNavigationEvent = i30 % 128;
                int i31 = i30 % 2;
                Unit unitOnNavigationEvent2 = onNavigationEvent(iIntValue2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue3);
                int i32 = onNavigationEvent + 67;
                onExtraCallback = i32 % 128;
                int i33 = i32 % 2;
                return unitOnNavigationEvent2;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                long jLongValue2 = ((Number) objArr[3]).longValue();
                float fFloatValue = ((Number) objArr[4]).floatValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                int iIntValue4 = ((Number) objArr[6]).intValue();
                int iIntValue5 = ((Number) objArr[7]).intValue();
                int i34 = 2 % 2;
                int i35 = onExtraCallback + 53;
                int i36 = i35 % 128;
                onNavigationEvent = i36;
                if (i35 % 2 != 0 ? (iIntValue5 & 2) != 0 : (iIntValue5 & 3) != 0) {
                    int i37 = i36 + 97;
                    onExtraCallback = i37 % 128;
                    int i38 = i37 % 2;
                    jLongValue = x2ExternalSyntheticLambda17.IAuthTabCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6);
                    int i39 = onExtraCallback + 55;
                    onNavigationEvent = i39 % 128;
                    int i40 = i39 % 2;
                }
                if ((iIntValue5 & 4) != 0) {
                    int i41 = onNavigationEvent + 31;
                    onExtraCallback = i41 % 128;
                    if (i41 % 2 != 0) {
                        x2externalsyntheticlambda17 = x2ExternalSyntheticLambda17.IAuthTabCallback;
                        i18 = 93;
                    } else {
                        x2externalsyntheticlambda17 = x2ExternalSyntheticLambda17.IAuthTabCallback;
                    }
                    jLongValue2 = x2externalsyntheticlambda17.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, i18);
                }
                if ((iIntValue5 & 8) != 0) {
                    fFloatValue = onExtraCallbackWithResult;
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1715920752, iIntValue4, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.fluidGradient (TdsSegmentedControlV1.kt:683)");
                }
                if (setcontentinsetsrelative.onNavigationEvent()) {
                    int i42 = onNavigationEvent + 123;
                    onExtraCallback = i42 % 128;
                    int i43 = i42 % 2;
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f, (onItemClicked) null, 0.0f, "leftGradientAlpha", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult3, 3072, 22);
                if (!(!setcontentinsetsrelative.onExtraCallbackWithResult())) {
                    int i44 = onNavigationEvent + 55;
                    onExtraCallback = i44 % 128;
                    int i45 = i44 % 2;
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(IAuthTabCallback((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, jLongValue, jLongValue2, ((Number) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult()).floatValue(), ((Number) isSubmitButtonEnabled.IAuthTabCallback(f2, (onItemClicked) null, 0.0f, "rightGradientAlpha", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult3, 3072, 22).onExtraCallbackWithResult()).floatValue(), fFloatValue));
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return quirksExternalSyntheticBackport0OnExtraCallback;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                return quirksExternalSyntheticBackport0OnExtraCallback;
            case 8:
                return IAuthTabCallback(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[0];
                x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult2 = (x2ExternalSyntheticLambda19.onExtraCallbackWithResult) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue6 = ((Number) objArr[3]).intValue();
                int i46 = 2 % 2;
                if ((iIntValue6 & 3) != 2) {
                    int i47 = onExtraCallback + 65;
                    onNavigationEvent = i47 % 128;
                    int i48 = i47 % 2;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(z, iIntValue6 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i49 = onNavigationEvent + 119;
                        onExtraCallback = i49 % 128;
                        int i50 = i49 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1701052695, iIntValue6, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFixedSegmentedControlV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:755)");
                    }
                    getbacktracenote3.invoke(new x2ExternalSyntheticLambda21(onextracallbackwithresult2, onWarmupCompleted(onextracallbackwithresult2), null), cameraCaptureResultEmptyCameraCaptureResult4, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 11:
                return asBinder(objArr);
            case 12:
                int iIntValue7 = ((Number) objArr[0]).intValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[1];
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[2];
                x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult3 = (x2ExternalSyntheticLambda19.onExtraCallbackWithResult) objArr[3];
                getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[4];
                getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[5];
                int iIntValue8 = ((Number) objArr[6]).intValue();
                int iIntValue9 = ((Number) objArr[7]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
                ((Number) objArr[9]).intValue();
                int i51 = 2 % 2;
                int i52 = onExtraCallback + 5;
                onNavigationEvent = i52 % 128;
                if (i52 % 2 != 0) {
                    iIntValue8 |= 1;
                }
                onWarmupCompleted(iIntValue7, quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda0, onextracallbackwithresult3, (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote4, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote5, cameraCaptureResultEmptyCameraCaptureResult5, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue8), iIntValue9);
                Unit unit2 = Unit.INSTANCE;
                int i53 = onExtraCallback + 7;
                onNavigationEvent = i53 % 128;
                int i54 = i53 % 2;
                return unit2;
            case 13:
                return asInterface(objArr);
            case 14:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, fliphorizontally);
        int i4 = onNavigationEvent + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(findResAndMsg findresandmsg, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, onwarmupcompleted);
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(tometerspersecond, quirksExternalSyntheticBackport0, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 109;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 0 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
            return (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, -156252952, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 156252961, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(onextracallbackwithresult, i, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(onextracallbackwithresult, i, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ component8 IAuthTabCallback(x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, int i, findResAndMsg findresandmsg, getBacktraceNote getbacktracenote2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(iAuthTabCallback, getbacktracenote, onwarmupcompleted, i, findresandmsg, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult);
        }
        onExtraCallback(iAuthTabCallback, getbacktracenote, onwarmupcompleted, i, findresandmsg, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult);
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        x2ExternalSyntheticLambda19.asBinder asbinder = (x2ExternalSyntheticLambda19.asBinder) objArr[0];
        x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent = (x2ExternalSyntheticLambda19.onNavigationEvent) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        List list = (List) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(asbinder, onnavigationevent, iIntValue, list, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        int i3 = 19 / 0;
        return IAuthTabCallback(asbinder, onnavigationevent, iIntValue, list, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[1];
        toMetersPerSecond tometerspersecond = (toMetersPerSecond) objArr[2];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 87;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {Integer.valueOf(i), quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, onextracallbackwithresult, getbacktracenote, getbacktracenote2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(objArr, 901557187, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -901557175, iOnWarmupCompleted);
        int i8 = onExtraCallback + 25;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, setContentInsetsRelative setcontentinsetsrelative, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, setcontentinsetsrelative, function0, quirksExternalSyntheticBackport0, f, f2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 109;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(getbacktracenote, list, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, list, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ x2ExternalSyntheticLambda19.onWarmupCompleted onExtraCallback(setContentInsetsRelative setcontentinsetsrelative) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(setcontentinsetsrelative);
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, list, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(getbacktracenote, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(getbacktracenote, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(objArr, -390621122, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 390621132, iOnWarmupCompleted);
        int i5 = onNavigationEvent + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda19.IAuthTabCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        int i5 = onExtraCallback + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 87;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 81;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(i, quirksExternalSyntheticBackport0, iAuthTabCallback, (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, deviceQuirksExternalSyntheticLambda0, onwarmupcompleted, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, setContentInsetsRelative setcontentinsetsrelative, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 3;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(highSpeedResolverExternalSyntheticLambda2, setcontentinsetsrelative, (Function0<Unit>) function0, quirksExternalSyntheticBackport0, f, f2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 63;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, iAuthTabCallback, deviceQuirksExternalSyntheticLambda0, onwarmupcompleted, getbacktracenote, getbacktracenote2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(toMetersPerSecond tometerspersecond, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(tometerspersecond, (List<x2ExternalSyntheticLambda2>) list, i, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 119;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tometerspersecond, quirksExternalSyntheticBackport0, f, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 95;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(float f, long j, long j2, float f2, float f3, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(f, j, j2, f2, f3, sessionProcessorCaptureCallback);
        }
        onExtraCallback(f, j, j2, f2, f3, sessionProcessorCaptureCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 45;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, quirksExternalSyntheticBackport0, iAuthTabCallback, getbacktracenote, deviceQuirksExternalSyntheticLambda0, onwarmupcompleted, getbacktracenote2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 21;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, isExtraPreviewRequired isextrapreviewrequired, List list2, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, int i, List list3, int i2, findResAndMsg findresandmsg, getBacktraceNote getbacktracenote, Ref.IntRef intRef, Ref.IntRef intRef2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(list, isextrapreviewrequired, list2, onwarmupcompleted, i, list3, i2, findresandmsg, getbacktracenote, intRef, intRef2, onextracallbackwithresult);
        int i6 = onNavigationEvent + 57;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(readFully readfully, float f, readFully readfully2, float f2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(readfully, f, readfully2, f2, setiso);
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(toMetersPerSecond tometerspersecond, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tometerspersecond, list, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 85;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, i, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 11;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, findResAndMsg findresandmsg, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onwarmupcompleted, iAuthTabCallback, getbacktracenote, getbacktracenote2, i, findresandmsg, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 29;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ component8 onWarmupCompleted(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarIAuthTabCallback = IAuthTabCallback(getbacktracenote, onextracallbackwithresult, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return component8VarIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        x2ExternalSyntheticLambda19.asBinder.onWarmupCompleted onwarmupcompleted = x2ExternalSyntheticLambda19.asBinder.Companion;
        if (Intrinsics.areEqual(iAuthTabCallback, onwarmupcompleted.onExtraCallbackWithResult()) || Intrinsics.areEqual(iAuthTabCallback, onwarmupcompleted.onNavigationEvent())) {
            float fOnExtraCallbackWithResult = MaxAdapter.onExtraCallbackWithResult.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return Float.valueOf(fOnExtraCallbackWithResult);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(iAuthTabCallback, onwarmupcompleted.onWarmupCompleted()) || Intrinsics.areEqual(iAuthTabCallback, onwarmupcompleted.IAuthTabCallback())) {
            return Float.valueOf(MaxAdapter.onExtraCallbackWithResult.onWarmupCompleted());
        }
        return Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final toMetersPerSecond IAuthTabCallback(@NotNull x2ExternalSyntheticLambda19.asBinder asbinder, @NotNull x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asbinder, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        int i2 = IAuthTabCallbackStub.onWarmupCompleted[onnavigationevent.ordinal()];
        if (i2 != 1) {
            int i3 = onNavigationEvent + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 2 : i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return IAuthTabCallback(asbinder).onExtraCallbackWithResult();
        }
        toMetersPerSecond tometerspersecondOnExtraCallbackWithResult = onExtraCallback(asbinder).onExtraCallbackWithResult();
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return tometerspersecondOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final x2ExternalSyntheticLambda19.onExtraCallbackWithResult onExtraCallback(@NotNull x2ExternalSyntheticLambda19.asBinder asbinder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asbinder, "");
        x2ExternalSyntheticLambda19.asBinder.onWarmupCompleted onwarmupcompleted = x2ExternalSyntheticLambda19.asBinder.Companion;
        if (Intrinsics.areEqual(asbinder, onwarmupcompleted.onExtraCallback())) {
            return onwarmupcompleted.onExtraCallbackWithResult();
        }
        if (Intrinsics.areEqual(asbinder, onwarmupcompleted.IAuthTabCallbackStub())) {
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted.onWarmupCompleted();
        }
        if (!(asbinder instanceof x2ExternalSyntheticLambda19.onExtraCallbackWithResult)) {
            if (!(asbinder instanceof x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback)) {
                return onwarmupcompleted.onExtraCallbackWithResult();
            }
            x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback) asbinder;
            return new x2ExternalSyntheticLambda19.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallback(), iAuthTabCallback.onNavigationEvent(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.IAuthTabCallback());
        }
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return (x2ExternalSyntheticLambda19.onExtraCallbackWithResult) asbinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final x2ExternalSyntheticLambda19.IAuthTabCallback IAuthTabCallback(@NotNull x2ExternalSyntheticLambda19.asBinder asbinder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asbinder, "");
        x2ExternalSyntheticLambda19.asBinder.onWarmupCompleted onwarmupcompleted = x2ExternalSyntheticLambda19.asBinder.Companion;
        if (Intrinsics.areEqual(asbinder, onwarmupcompleted.onExtraCallback())) {
            return onwarmupcompleted.onNavigationEvent();
        }
        if (Intrinsics.areEqual(asbinder, onwarmupcompleted.IAuthTabCallbackStub())) {
            int i4 = onExtraCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted.IAuthTabCallback();
        }
        if (asbinder instanceof x2ExternalSyntheticLambda19.IAuthTabCallback) {
            return (x2ExternalSyntheticLambda19.IAuthTabCallback) asbinder;
        }
        if (!(asbinder instanceof x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback)) {
            return onwarmupcompleted.onNavigationEvent();
        }
        x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback) asbinder;
        return new x2ExternalSyntheticLambda19.IAuthTabCallback(iAuthTabCallback.onExtraCallback(), iAuthTabCallback.onNavigationEvent(), false, null, iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.IAuthTabCallback(), 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x2ExternalSyntheticLambda19.onWarmupCompleted onWarmupCompleted(@Nullable final setContentInsetsRelative setcontentinsetsrelative, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            setcontentinsetsrelative = i4 % 2 == 0 ? setContentInsetsAbsolute.IAuthTabCallback(1, cameraCaptureResultEmptyCameraCaptureResult, 0, 0) : setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-715667559, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.rememberSegmentedControlV1FluidState (TdsSegmentedControlV1.kt:446)");
        }
        Object[] objArr = new Object[0];
        getCaptureIds<x2ExternalSyntheticLambda19.onWarmupCompleted, Object> getcaptureidsOnExtraCallback = x2ExternalSyntheticLambda19.onWarmupCompleted.Companion.onExtraCallback();
        if (((i & 14) ^ 6) > 4) {
            int i5 = onExtraCallback + 103;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelative) : cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelative)) {
                z = true;
            } else if ((i & 6) != 4) {
                z = false;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda29
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 67;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompletedOnExtraCallback = x2ExternalSyntheticLambda22.onExtraCallback(setcontentinsetsrelative);
                    int i9 = onNavigationEvent + 101;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        return onwarmupcompletedOnExtraCallback;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted = (x2ExternalSyntheticLambda19.onWarmupCompleted) RememberSaveableKt.onWarmupCompleted(objArr, getcaptureidsOnExtraCallback, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 85;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return onwarmupcompleted;
    }

    private static final x2ExternalSyntheticLambda19.onWarmupCompleted onExtraCallbackWithResult(setContentInsetsRelative setcontentinsetsrelative) {
        int i = 2 % 2;
        x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted = new x2ExternalSyntheticLambda19.onWarmupCompleted(setcontentinsetsrelative);
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda19.asBinder asbinder, x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if ((i2 & 6) == 0) {
            i2 |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list) ? 2 : 4;
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i2 & 19) != 18) {
            int i6 = onNavigationEvent + 113;
            onExtraCallback = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i7 = onExtraCallback + 43;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 85 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onNavigationEvent + 101;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1966954625, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:462)");
                }
                onExtraCallbackWithResult(IAuthTabCallback(asbinder, onnavigationevent), (List<x2ExternalSyntheticLambda2>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 3) & 112);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onExtraCallbackWithResult(IAuthTabCallback(asbinder, onnavigationevent), (List<x2ExternalSyntheticLambda2>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 3) & 112);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        final int iIntValue = ((Number) objArr[0]).intValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        final x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent = (x2ExternalSyntheticLambda19.onNavigationEvent) objArr[2];
        final x2ExternalSyntheticLambda19.asBinder asbinderOnExtraCallback = (x2ExternalSyntheticLambda19.asBinder) objArr[3];
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = (getBacktraceNote) objArr[4];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int iIntValue3 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((iIntValue3 & 2) != 0) {
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue3 & 4) != 0) {
            onnavigationevent = x2ExternalSyntheticLambda19.onNavigationEvent.Fixed;
        }
        if ((iIntValue3 & 8) != 0) {
            asbinderOnExtraCallback = x2ExternalSyntheticLambda19.asBinder.Companion.onExtraCallback();
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = (iIntValue3 & 16) != 0 ? ForwardingCameraControl.onExtraCallback(-1966954625, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                x2ExternalSyntheticLambda19.asBinder asbinder = asbinderOnExtraCallback;
                x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent2 = onnavigationevent;
                int i7 = iIntValue;
                int iIntValue4 = ((Integer) obj3).intValue();
                Object[] objArr2 = {asbinder, onnavigationevent2, Integer.valueOf(i7), (List) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue4)};
                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr2, -1524730866, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1524730879, iOnWarmupCompleted);
                int i8 = onExtraCallback + 119;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54) : encoderProfilesProxyVideoProfileProxy;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = (iIntValue3 & 32) != 0 ? x2ExternalSyntheticLambda17.IAuthTabCallback.onNavigationEvent() : deviceQuirksExternalSyntheticLambda0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1062219838, iIntValue2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1 (TdsSegmentedControlV1.kt:470)");
            int i4 = onExtraCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        int i6 = IAuthTabCallbackStub.onWarmupCompleted[onnavigationevent.ordinal()];
        if (i6 == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-727147831);
            onWarmupCompleted(iIntValue, (QuirksExternalSyntheticBackport0) onextracallback, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, onExtraCallback(asbinderOnExtraCallback), (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue2 & 126) | ((iIntValue2 >> 9) & 896) | (57344 & iIntValue2) | ((iIntValue2 >> 3) & 458752), 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (i6 != 2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1408931503);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-726848247);
            int i7 = iIntValue2 >> 3;
            onNavigationEvent(iIntValue, (QuirksExternalSyntheticBackport0) onextracallback, IAuthTabCallback(asbinderOnExtraCallback), (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, (x2ExternalSyntheticLambda19.onWarmupCompleted) null, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i7 & 57344) | (iIntValue2 & 126) | (i7 & 7168) | (3670016 & iIntValue2), 32);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        int i8 = onNavigationEvent + 109;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        if (i9 == 0) {
            return null;
        }
        int i10 = 77 / 0;
        return null;
    }

    private static final Unit onNavigationEvent(x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if ((i2 & 6) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list) ^ true ? 2 : 4;
            int i6 = onNavigationEvent + 3;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i2 & 19) != 18) {
            int i8 = onNavigationEvent + 19;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = onExtraCallback + 123;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1678875533, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:498)");
            }
            onExtraCallbackWithResult(iAuthTabCallback.onExtraCallbackWithResult(), (List<x2ExternalSyntheticLambda2>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 3) & 112);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallback + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 29;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-640594752, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:543)");
            }
            getbacktracenote.invoke(new x2ExternalSyntheticLambda21(iAuthTabCallback, ((Float) IAuthTabCallback(new Object[]{iAuthTabCallback}, 1225860531, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1225860517, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).floatValue(), null), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(final getBacktraceNote getbacktracenote, final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1204608051, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:542)");
                int i5 = onExtraCallback + 29;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            putBooleanArray.IAuthTabCallback(x2ExternalSyntheticLambda19.IAuthTabCallbackDefault.Item, ForwardingCameraControl.onExtraCallback(-640594752, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda21
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 113;
                    IAuthTabCallback = i8 % 128;
                    Object obj3 = null;
                    if (i8 % 2 != 0) {
                        Object[] objArr = {getbacktracenote, iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                        obj3.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {getbacktracenote, iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr2, -1096325513, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1096325514, iOnWarmupCompleted2);
                    int i9 = IAuthTabCallback + 43;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unit;
                    }
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final component8 onExtraCallback(final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, final int i, final findResAndMsg findresandmsg, final getBacktraceNote getbacktracenote2, final isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        final ArrayList arrayList;
        Integer numValueOf;
        int iIntValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        final int iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(iAuthTabCallback.onNavigationEvent().onNavigationEvent(isextrapreviewrequired.onExtraCallback()));
        int iOnExtraCallbackWithResult2 = isextrapreviewrequired.onExtraCallbackWithResult(iAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback()));
        int i3 = 1;
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x2ExternalSyntheticLambda20.Items, ForwardingCameraControl.onExtraCallbackWithResult(-1204608051, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                getBacktraceNote getbacktracenote3 = getbacktracenote;
                if (i6 == 0) {
                    return x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote3, iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
                x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote3, iAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                throw null;
            }
        }));
        ArrayList arrayList2 = new ArrayList(listIAuthTabCallback.size());
        List list = listIAuthTabCallback;
        int size = list.size();
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= size) {
                if (iAuthTabCallback.onTransact() == x2ExternalSyntheticLambda19.onExtraCallback.Uniform) {
                    int i5 = onExtraCallback + 35;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        arrayList2.isEmpty();
                        throw null;
                    }
                    if (arrayList2.isEmpty()) {
                        int i6 = onNavigationEvent + 25;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(((component7) arrayList2.get(0)).onExtraCallbackWithResult(Integer.MAX_VALUE));
                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                        if (lastIndex > 0) {
                            while (true) {
                                Integer numValueOf2 = Integer.valueOf(((component7) arrayList2.get(i3)).onExtraCallbackWithResult(Integer.MAX_VALUE));
                                if (numValueOf2.compareTo(numValueOf) > 0) {
                                    numValueOf = numValueOf2;
                                }
                                if (i3 == lastIndex) {
                                    break;
                                }
                                int i8 = onExtraCallback;
                                int i9 = i8 + 87;
                                onNavigationEvent = i9 % 128;
                                i3 = i9 % 2 == 0 ? i3 + 86 : i3 + 1;
                                int i10 = i8 + 121;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                            }
                        }
                    }
                    if (numValueOf != null) {
                        int i12 = onExtraCallback + 49;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            numValueOf.intValue();
                            obj.hashCode();
                            throw null;
                        }
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    ArrayList arrayList3 = new ArrayList(arrayList2.size());
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        arrayList3.add(((component7) arrayList2.get(i13)).onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), iIntValue, iIntValue, 0, 0, 12, (Object) null)));
                    }
                    arrayList = arrayList3;
                } else {
                    ArrayList arrayList4 = new ArrayList(arrayList2.size());
                    int size3 = arrayList2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        arrayList4.add(((component7) arrayList2.get(i14)).onExtraCallback(virtualCameraCaptureResult.onExtraCallback()));
                    }
                    arrayList = arrayList4;
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult;
                final Ref.IntRef intRef2 = new Ref.IntRef();
                final ArrayList arrayList5 = new ArrayList();
                int interfaceDescriptor = iOnExtraCallbackWithResult;
                int i15 = 0;
                for (int size4 = arrayList.size(); i15 < size4; size4 = size4) {
                    getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) arrayList.get(i15);
                    intRef.element += getstreamsharingchildren.getInterfaceDescriptor();
                    intRef2.element = Math.max(intRef2.element, getstreamsharingchildren.T_());
                    arrayList5.add(new x2ExternalSyntheticLambda2(isextrapreviewrequired.c_(interfaceDescriptor), isextrapreviewrequired.c_(getstreamsharingchildren.getInterfaceDescriptor()), isextrapreviewrequired.c_(getstreamsharingchildren.T_()), null));
                    interfaceDescriptor += getstreamsharingchildren.getInterfaceDescriptor();
                    i15++;
                }
                ArrayList arrayList6 = new ArrayList(listIAuthTabCallback.size());
                int size5 = list.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    Object obj2 = listIAuthTabCallback.get(i16);
                    if (Intrinsics.areEqual(ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) obj2), x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback())) {
                        arrayList6.add(obj2);
                    }
                }
                final ArrayList arrayList7 = new ArrayList(arrayList6.size());
                int size6 = arrayList6.size();
                for (int i17 = 0; i17 < size6; i17++) {
                    arrayList7.add(((component7) arrayList6.get(i17)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(((getStreamSharingChildren) arrayList.get(i17)).getInterfaceDescriptor(), intRef2.element)));
                }
                return component4.IAuthTabCallback(isextrapreviewrequired, intRef.element, intRef2.element, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj3) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 3;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(arrayList7, isextrapreviewrequired, arrayList, onwarmupcompleted, iOnExtraCallbackWithResult, arrayList5, i, findresandmsg, getbacktracenote2, intRef, intRef2, (getStreamSharingChildren.onExtraCallbackWithResult) obj3);
                        int i21 = IAuthTabCallback + 103;
                        onExtraCallback = i21 % 128;
                        if (i21 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, 4, (Object) null);
            }
            int i18 = onExtraCallback + 105;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
            Object obj3 = listIAuthTabCallback.get(i4);
            if (!Intrinsics.areEqual(ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) obj3), x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback())) {
                int i20 = onNavigationEvent + 107;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    arrayList2.add(obj3);
                    throw null;
                }
                arrayList2.add(obj3);
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 17;
            onExtraCallback = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onNavigationEvent + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-332536404, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:575)");
            }
            getbacktracenote.invoke(list, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 83;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 121;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ x2ExternalSyntheticLambda19.onWarmupCompleted $fluidState;
        final /* synthetic */ Integer $targetScrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, Integer num, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$fluidState = onwarmupcompleted;
            this.$targetScrollOffset = num;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$fluidState, this.$targetScrollOffset, access13800Var);
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 90 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setContentInsetsRelative setcontentinsetsrelativeOnWarmupCompleted = this.$fluidState.onWarmupCompleted();
                    int iIntValue = this.$targetScrollOffset.intValue();
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(x2ExternalSyntheticLambda17.IAuthTabCallback.onWarmupCompleted(), 0, 2, (Object) null);
                    this.label = 1;
                    if (setcontentinsetsrelativeOnWarmupCompleted.onWarmupCompleted(iIntValue, getthumbpositionOnExtraCallback, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallback + 91;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 71 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 113;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    private static final Unit onNavigationEvent(List list, isExtraPreviewRequired isextrapreviewrequired, List list2, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, int i, final List list3, int i2, findResAndMsg findresandmsg, final getBacktraceNote getbacktracenote, Ref.IntRef intRef, Ref.IntRef intRef2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int size = list.size();
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < size; i6++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), onextracallbackwithresult.onExtraCallbackWithResult(((x2ExternalSyntheticLambda2) list3.get(i6)).IAuthTabCallback()), 0, 0.0f, 4, (Object) null);
        }
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x2ExternalSyntheticLambda20.FocusBox, ForwardingCameraControl.onExtraCallbackWithResult(-332536404, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 81;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote, list3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote, list3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i9 = IAuthTabCallback + 11;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }));
        int size2 = listIAuthTabCallback.size();
        int i7 = onNavigationEvent + 101;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        for (int i9 = 0; i9 < size2; i9++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, ((component7) listIAuthTabCallback.get(i9)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(intRef.element, intRef2.element)), 0, 0, 0.0f, 4, (Object) null);
        }
        int size3 = list2.size();
        int i10 = onNavigationEvent + 91;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 2;
        }
        for (int i12 = 0; i12 < size3; i12++) {
            int i13 = onExtraCallback + 113;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list2.get(i12), onextracallbackwithresult.onExtraCallbackWithResult(((x2ExternalSyntheticLambda2) list3.get(i12)).IAuthTabCallback()), 0, 0.0f, 4, (Object) null);
        }
        Integer numOnExtraCallback = onwarmupcompleted.onExtraCallback(isextrapreviewrequired, i, list3, i2);
        Object obj = null;
        if (numOnExtraCallback != null) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new asBinder(onwarmupcompleted, numOnExtraCallback, null), 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i15 = onNavigationEvent + 41;
        onExtraCallback = i15 % 128;
        if (i15 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final int i, final findResAndMsg findresandmsg, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        if ((i2 & 17) != 16) {
            int i4 = onExtraCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 113;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-350700911, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:525)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-350700911, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:525)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = (QuirksExternalSyntheticBackport0) IAuthTabCallback(new Object[]{onextracallback, onwarmupcompleted.onWarmupCompleted(), 0L, 0L, Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 6, 14}, 726111052, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -726111045, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            if (!(!iAuthTabCallback.asInterface())) {
                int i7 = onNavigationEvent + 9;
                onExtraCallback = i7 % 128;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(i7 % 2 != 0 ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 0, (Object) null) : ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null));
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, onwarmupcompleted.onWarmupCompleted(), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), QuirkSettingsLoader.Companion.asInterface(), false, 2, (Object) null), 0.0f, iAuthTabCallback.onNavigationEvent().IAuthTabCallback(), 0.0f, iAuthTabCallback.onNavigationEvent().onExtraCallback(), 5, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote2);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda25
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 81;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            x2ExternalSyntheticLambda22.IAuthTabCallback(iAuthTabCallback, getbacktracenote, onwarmupcompleted, i, findresandmsg, getbacktracenote2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        component8 component8VarIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback(iAuthTabCallback, getbacktracenote, onwarmupcompleted, i, findresandmsg, getbacktracenote2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                        int i10 = IAuthTabCallback + 105;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 31 / 0;
                        }
                        return component8VarIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ x2ExternalSyntheticLambda19.onWarmupCompleted $fluidState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$fluidState = onwarmupcompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$fluidState, access13800Var);
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 56 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                setContentInsetsRelative setcontentinsetsrelativeOnWarmupCompleted = this.$fluidState.onWarmupCompleted();
                this.label = 1;
                if (setContentInsetsRelative.onExtraCallback(setcontentinsetsrelativeOnWarmupCompleted, 0, (onItemClicked) null, this, 2, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onTransact(onwarmupcompleted, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if ((i2 & 3) != 2) {
            int i7 = i5 + 85;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 5;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1621670709, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:513)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1621670709, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:513)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i10 = 2 % 2;
                        int i11 = onWarmupCompleted + 39;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr = {(useAndConfigureProgramWithTexture) obj};
                        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                        if (i12 != 0) {
                            return (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr, 1617127837, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, -1617127834, iOnWarmupCompleted);
                        }
                        Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr, 1617127837, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, -1617127834, iOnWarmupCompleted);
                        int i13 = 98 / 0;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
            onWarmupCompleted(iAuthTabCallback.onExtraCallback(), getImplementationType.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion), 0.0f, deviceQuirksExternalSyntheticLambda0, ForwardingCameraControl.onExtraCallback(-350700911, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 13;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
                    x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                    getBacktraceNote getbacktracenote3 = getbacktracenote;
                    getBacktraceNote getbacktracenote4 = getbacktracenote2;
                    int i13 = i;
                    findResAndMsg findresandmsg2 = findresandmsg;
                    HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i12 != 0) {
                        x2ExternalSyntheticLambda22.onWarmupCompleted(onwarmupcompleted3, iAuthTabCallback2, getbacktracenote3, getbacktracenote4, i13, findresandmsg2, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(onwarmupcompleted3, iAuthTabCallback2, getbacktracenote3, getbacktracenote4, i13, findresandmsg2, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                    int i14 = onExtraCallbackWithResult + 91;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24624, 4);
            if (varyFields.onWarmupCompleted((Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()))) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(116115313);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                int i10 = onNavigationEvent + 109;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(115737206);
                float fOnNavigationEvent = deviceQuirksExternalSyntheticLambda0.onNavigationEvent((ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy()));
                setContentInsetsRelative setcontentinsetsrelativeOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnNavigationEvent)) {
                    Object obj = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke() {
                                Unit unitIAuthTabCallback;
                                int i12 = 2 % 2;
                                int i13 = onExtraCallbackWithResult + 53;
                                onExtraCallback = i13 % 128;
                                if (i13 % 2 == 0) {
                                    unitIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback(findresandmsg, onwarmupcompleted);
                                    int i14 = 10 / 0;
                                } else {
                                    unitIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback(findresandmsg, onwarmupcompleted);
                                }
                                int i15 = onExtraCallback + 121;
                                onExtraCallbackWithResult = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i16 = 54 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj = function0;
                    }
                    IAuthTabCallback((HighSpeedResolverExternalSyntheticLambda2) highSpeedResolverExternalSyntheticLambda1, setcontentinsetsrelativeOnWarmupCompleted, (Function0<Unit>) obj, (QuirksExternalSyntheticBackport0) null, 0.0f, fOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6, 12);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, @Nullable getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted, @NotNull final getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback2;
        int i6;
        int i7;
        getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnExtraCallback;
        int i8;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback3;
        final getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        x2ExternalSyntheticLambda19.onWarmupCompleted onWarmupCompleted2;
        Object objOnMinimized;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1657369966);
        if ((i2 & 6) == 0) {
            i4 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ^ true) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            int i13 = onExtraCallback + 41;
            onNavigationEvent = i13 % 128;
            i4 = i13 % 2 == 0 ? i4 | 12 : i4 | 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    iAuthTabCallback2 = iAuthTabCallback;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2)) {
                        int i14 = onExtraCallback + 41;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    int i16 = onExtraCallback + 37;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        getbacktracenoteOnExtraCallback = getbacktracenote;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnExtraCallback) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnNavigationEvent) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) == 0) {
                            i4 |= ((i3 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                                int i18 = onExtraCallback + 63;
                                onNavigationEvent = i18 % 128;
                                int i19 = i18 % 2;
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i4 |= i10;
                        }
                        if ((599187 & i4) != 599186) {
                            int i20 = onExtraCallback + 121;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            z = true;
                        } else {
                            int i22 = onNavigationEvent + 69;
                            onExtraCallback = i22 % 128;
                            if (i22 % 2 != 0) {
                                int i23 = 3 % 3;
                            }
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            Object obj = null;
                            if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                if (i5 != 0) {
                                    x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = x2ExternalSyntheticLambda19.asBinder.Companion.onNavigationEvent();
                                    int i24 = onNavigationEvent + 101;
                                    onExtraCallback = i24 % 128;
                                    int i25 = i24 % 2;
                                    iAuthTabCallback2 = iAuthTabCallbackOnNavigationEvent;
                                }
                                if (i7 != 0) {
                                    getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1678875533, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda11
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                                            Unit unitOnWarmupCompleted;
                                            int i26 = 2 % 2;
                                            int i27 = onWarmupCompleted + 63;
                                            IAuthTabCallback = i27 % 128;
                                            if (i27 % 2 != 0) {
                                                unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(iAuthTabCallback2, i, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                int i28 = 54 / 0;
                                            } else {
                                                unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(iAuthTabCallback2, i, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                            }
                                            int i29 = onWarmupCompleted + 73;
                                            IAuthTabCallback = i29 % 128;
                                            int i30 = i29 % 2;
                                            return unitOnWarmupCompleted;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                }
                                if (i8 != 0) {
                                    deviceQuirksExternalSyntheticLambda0OnNavigationEvent = x2ExternalSyntheticLambda17.IAuthTabCallback.onNavigationEvent();
                                }
                                if ((i3 & 32) != 0) {
                                    int i26 = onNavigationEvent + 19;
                                    onExtraCallback = i26 % 128;
                                    int i27 = i26 % 2;
                                    i9 = (-458753) & i4;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                    onWarmupCompleted2 = onWarmupCompleted((setContentInsetsRelative) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                                    final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback2;
                                    final getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4 = getbacktracenoteOnExtraCallback;
                                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i28 = onExtraCallback + 65;
                                        onNavigationEvent = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1657369966, i9, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1 (TdsSegmentedControlV1.kt:507)");
                                            obj.hashCode();
                                            throw null;
                                        }
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1657369966, i9, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFluidSegmentedControlV1 (TdsSegmentedControlV1.kt:507)");
                                    }
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new putCharSequenceArray();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    putCharSequenceArray putcharsequencearray = (putCharSequenceArray) objOnMinimized;
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                    final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted3 = onWarmupCompleted2;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    putBooleanArray.onExtraCallbackWithResult((String) putCharArray.onNavigationEvent.onExtraCallback(-1633311317, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{putCharArray.Companion}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1633311319, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), null, putcharsequencearray, ForwardingCameraControl.onExtraCallback(-1621670709, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda12
                                        private static int onNavigationEvent = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                            int i29 = 2 % 2;
                                            int i30 = onNavigationEvent + 117;
                                            onWarmupCompleted = i30 % 128;
                                            if (i30 % 2 != 0) {
                                                return x2ExternalSyntheticLambda22.onNavigationEvent(quirksExternalSyntheticBackport06, iAuthTabCallback4, deviceQuirksExternalSyntheticLambda03, onwarmupcompleted3, getbacktracenote2, getbacktracenote4, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            }
                                            x2ExternalSyntheticLambda22.onNavigationEvent(quirksExternalSyntheticBackport06, iAuthTabCallback4, deviceQuirksExternalSyntheticLambda03, onwarmupcompleted3, getbacktracenote2, getbacktracenote4, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3462, 2);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    iAuthTabCallback3 = iAuthTabCallback4;
                                    getbacktracenote3 = getbacktracenote4;
                                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                                    onwarmupcompleted2 = onWarmupCompleted2;
                                } else {
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                            }
                            onWarmupCompleted2 = onwarmupcompleted;
                            i9 = i4;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback42 = iAuthTabCallback2;
                            final getBacktraceNote getbacktracenote42 = getbacktracenoteOnExtraCallback;
                            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda032 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            putCharSequenceArray putcharsequencearray2 = (putCharSequenceArray) objOnMinimized;
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                            final x2ExternalSyntheticLambda19.onWarmupCompleted onwarmupcompleted32 = onWarmupCompleted2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            putBooleanArray.onExtraCallbackWithResult((String) putCharArray.onNavigationEvent.onExtraCallback(-1633311317, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{putCharArray.Companion}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1633311319, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback()), null, putcharsequencearray2, ForwardingCameraControl.onExtraCallback(-1621670709, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda12
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                    int i29 = 2 % 2;
                                    int i30 = onNavigationEvent + 117;
                                    onWarmupCompleted = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return x2ExternalSyntheticLambda22.onNavigationEvent(quirksExternalSyntheticBackport062, iAuthTabCallback42, deviceQuirksExternalSyntheticLambda032, onwarmupcompleted32, getbacktracenote2, getbacktracenote42, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    }
                                    x2ExternalSyntheticLambda22.onNavigationEvent(quirksExternalSyntheticBackport062, iAuthTabCallback42, deviceQuirksExternalSyntheticLambda032, onwarmupcompleted32, getbacktracenote2, getbacktracenote42, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3462, 2);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            iAuthTabCallback3 = iAuthTabCallback42;
                            getbacktracenote3 = getbacktracenote42;
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda032;
                            onwarmupcompleted2 = onWarmupCompleted2;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            iAuthTabCallback3 = iAuthTabCallback2;
                            getbacktracenote3 = getbacktracenoteOnExtraCallback;
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                            onwarmupcompleted2 = onwarmupcompleted;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda13
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = IAuthTabCallback + 69;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(i, quirksExternalSyntheticBackport03, iAuthTabCallback3, getbacktracenote3, deviceQuirksExternalSyntheticLambda02, onwarmupcompleted2, getbacktracenote2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i32 = onWarmupCompleted + 101;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
                    if ((i2 & 196608) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((599187 & i4) != 599186) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                getbacktracenoteOnExtraCallback = getbacktracenote;
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
                if ((i2 & 196608) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((599187 & i4) != 599186) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            iAuthTabCallback2 = iAuthTabCallback;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            getbacktracenoteOnExtraCallback = getbacktracenote;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((599187 & i4) != 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        iAuthTabCallback2 = iAuthTabCallback;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        getbacktracenoteOnExtraCallback = getbacktracenote;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((599187 & i4) != 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(RangesKt.coerceIn(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6), 0.0f, 1.0f));
        fliphorizontally.IAuthTabCallback_Parcel(fliphorizontally.onExtraCallback(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda62)));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, @NotNull final setContentInsetsRelative setcontentinsetsrelative, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5;
        float f3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float f4;
        final float f5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object objIAuthTabCallback;
        Object objIAuthTabCallback2;
        Function1 function1IAuthTabCallbackStub;
        int i6;
        int i7;
        float fIAuthTabCallback = f;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(setcontentinsetsrelative, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1742744661);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative)) {
                int i9 = onNavigationEvent + 69;
                onExtraCallback = i9 % 128;
                i7 = i9 % 2 != 0 ? 14 : 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = onExtraCallback + 55;
                onNavigationEvent = i10 % 128;
                i6 = i10 % 2 == 0 ? 16439 : 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            Object obj = null;
            if (i4 == 0) {
                int i12 = onExtraCallback + 17;
                onNavigationEvent = i12 % 128;
                i3 = i12 % 2 == 0 ? i3 | 13055 : i3 | 24576;
            } else if ((i & 24576) == 0) {
                int i13 = onExtraCallback + 17;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback) ? 16384 : 8192;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    int i14 = onExtraCallback + 21;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    f3 = f2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898) {
                    int i16 = onExtraCallback + 111;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    if (i4 != 0) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                    }
                    float fIAuthTabCallback2 = i5 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f3;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1742744661, i3, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow (TdsSegmentedControlV1.kt:627)");
                    }
                    getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(setcontentinsetsrelative.onNavigationEvent()), "arrowAnim", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                    onWarmupCompleted onwarmupcompleted = onWarmupCompleted.IAuthTabCallback;
                    getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
                    if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                            if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null) {
                                int i18 = onExtraCallback + 59;
                                onNavigationEvent = i18 % 128;
                                if (i18 % 2 == 0) {
                                    r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub();
                            } else {
                                function1IAuthTabCallbackStub = null;
                            }
                            Function1 function1 = function1IAuthTabCallbackStub;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                            try {
                                Object objIAuthTabCallback3 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback3);
                                objIAuthTabCallback = objIAuthTabCallback3;
                            } catch (Throwable th) {
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1);
                                throw th;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    boolean zBooleanValue = ((Boolean) objIAuthTabCallback).booleanValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(682789365);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(682789365, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow.<anonymous> (TdsSegmentedControlV1.kt:632)");
                    }
                    float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback2 - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)) + (!(zBooleanValue ^ true) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)));
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent2) {
                        int i19 = onExtraCallback + 103;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidthOnWarmupCompleted));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        boolean zBooleanValue2 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).booleanValue();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(682789365);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(682789365, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow.<anonymous> (TdsSegmentedControlV1.kt:632)");
                        }
                        float fIAuthTabCallback4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback2 - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(zBooleanValue2 ? 5.0f : 0.0f));
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback4);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent3) {
                            int i21 = onNavigationEvent + 63;
                            onExtraCallback = i21 % 128;
                            int i22 = i21 % 2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidthOnWarmupCompleted));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) onwarmupcompleted.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistOnExtraCallbackWithResult, "arrowOffset", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                            IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.onExtraCallback;
                            getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
                            if (!getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                                objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent4 || objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback3 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback3.IAuthTabCallback();
                                    Function1 function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub() : null;
                                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback3.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                                    try {
                                        Object objIAuthTabCallback4 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                                        iAuthTabCallback3.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub2);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback4);
                                        objIAuthTabCallback2 = objIAuthTabCallback4;
                                    } catch (Throwable th2) {
                                        iAuthTabCallback3.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub2);
                                        throw th2;
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            }
                            boolean zBooleanValue3 = ((Boolean) objIAuthTabCallback2).booleanValue();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2001593626);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i23 = onNavigationEvent + 93;
                                onExtraCallback = i23 % 128;
                                if (i23 % 2 != 0) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2001593626, 1, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow.<anonymous> (TdsSegmentedControlV1.kt:633)");
                                } else {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2001593626, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow.<anonymous> (TdsSegmentedControlV1.kt:633)");
                                }
                            }
                            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent5 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            boolean zBooleanValue4 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult()).booleanValue();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2001593626);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2001593626, 0, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FluidArrow.<anonymous> (TdsSegmentedControlV1.kt:633)");
                            }
                            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidthOnWarmupCompleted));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            }
                            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, Float.valueOf(f6), Float.valueOf(f7), (updateFocusedState) iAuthTabCallback2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistIAuthTabCallback, "arrowAlpha", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport03, onextracallbackwithresult.asInterface());
                            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2);
                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(!(zOnNavigationEvent7 | zOnNavigationEvent8)) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda18
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj3) {
                                        int i24 = 2 % 2;
                                        int i25 = onNavigationEvent + 67;
                                        IAuthTabCallback = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            x2ExternalSyntheticLambda22.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, (flipHorizontally) obj3);
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        Unit unitIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, (flipHorizontally) obj3);
                                        int i26 = onNavigationEvent + 101;
                                        IAuthTabCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized5);
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
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
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized6 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized6;
                            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(measureChildConstrained.IAuthTabCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(addAdapter.onExtraCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, onWarmupCompleted, null, 4, null), RoundedCornerShapeKt.onWarmupCompleted(), AppLovinAdService.onWarmupCompleted(accessgetINSTANCEScp.Small, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.SegmentedControlArrowButtonFill, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), RoundedCornerShapeKt.onWarmupCompleted()), RoundedCornerShapeKt.onWarmupCompleted()), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(getPopupTheme.onExtraCallback()), false, (String) null, (Role) null, function0, 28, (Object) null), fIAuthTabCallback);
                            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                            int i24 = R.drawable.icon_arrow_left_small;
                            long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconPrimary, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback / 2.0f));
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                                objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda19
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3) {
                                        int i25 = 2 % 2;
                                        int i26 = onWarmupCompleted + 109;
                                        onExtraCallbackWithResult = i26 % 128;
                                        int i27 = i26 % 2;
                                        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                        Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{(useAndConfigureProgramWithTexture) obj3}, 893318648, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -893318642, iOnWarmupCompleted);
                                        int i28 = onExtraCallbackWithResult + 9;
                                        onWarmupCompleted = i28 % 128;
                                        int i29 = i28 % 2;
                                        return unit;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                            }
                            AppLovinNativeAdImplc.onExtraCallback(i24, getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault2, (Function1) objOnMinimized7), jOnExtraCallback, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 504);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            f4 = fIAuthTabCallback;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            f5 = fIAuthTabCallback2;
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    f4 = fIAuthTabCallback;
                    f5 = f3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda20
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i25 = 2 % 2;
                            int i26 = onWarmupCompleted + 83;
                            onExtraCallbackWithResult = i26 % 128;
                            int i27 = i26 % 2;
                            Unit unitOnExtraCallback = x2ExternalSyntheticLambda22.onExtraCallback(highSpeedResolverExternalSyntheticLambda2, setcontentinsetsrelative, function0, quirksExternalSyntheticBackport02, f4, f5, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i28 = onWarmupCompleted + 115;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            f3 = f2;
            if ((74899 & i3) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i4 = i2 & 8;
        Object obj3 = null;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        f3 = f2;
        if ((74899 & i3) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final long j, final long j2, final float f, final float f2, final float f3) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda8
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 13;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return x2ExternalSyntheticLambda22.onNavigationEvent(f3, j, j2, f, f2, (SessionProcessorCaptureCallback) obj);
                }
                x2ExternalSyntheticLambda22.onNavigationEvent(f3, j, j2, f, f2, (SessionProcessorCaptureCallback) obj);
                throw null;
            }
        }));
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final removeObserverLocked onExtraCallback(float f, long j, long j2, final float f2, final float f3, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted())) & 4294967295L) | (Float.floatToRawIntBits(sessionProcessorCaptureCallback.onExtraCallback(f)) << 32));
        readFully.onExtraCallback onextracallback = readFully.Companion;
        int i2 = (int) (jOnWarmupCompleted >> 32);
        final readFully readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(onextracallback, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(j2)}), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat(i2)) << 32)), 0, 8, (Object) null);
        final readFully readfullyOnExtraCallback2 = readFully.onExtraCallback.onExtraCallback(onextracallback, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j2), setByteOrder.onNavigationEvent(j)}), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32)) - Float.intBitsToFloat(i2)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0, 8, (Object) null);
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(readfullyOnExtraCallback, f2, readfullyOnExtraCallback2, f3, (setIso) obj);
                int i6 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        });
        int i3 = onExtraCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(readFully readfully, float f, readFully readfully2, float f2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        setOrientationDegrees.onExtraCallback(setiso, readfully, 0L, 0L, f, (hasMoreElements) null, (seek) null, 0, 118, (Object) null);
        setOrientationDegrees.onExtraCallback(setiso, readfully2, 0L, 0L, f2, (hasMoreElements) null, (seek) null, 0, 118, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if ((i2 & 6) == 0) {
            int i7 = onNavigationEvent + 43;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
                int i9 = onExtraCallback + 57;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(438339284, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFixedSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:735)");
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), (List<x2ExternalSyntheticLambda2>) list, i, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 3) & 112);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent + 75;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final component8 IAuthTabCallback(final getBacktraceNote getbacktracenote, final x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote2, final isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        Integer numValueOf;
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        final int iAsInterface = VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback());
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x2ExternalSyntheticLambda20.Items, ForwardingCameraControl.onExtraCallbackWithResult(1701052695, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 107;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                getBacktraceNote getbacktracenote3 = getbacktracenote;
                if (i4 != 0) {
                    return x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote3, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                x2ExternalSyntheticLambda22.onExtraCallbackWithResult(getbacktracenote3, onextracallbackwithresult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                throw null;
            }
        }));
        ArrayList arrayList = new ArrayList(listIAuthTabCallback.size());
        List list = listIAuthTabCallback;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = listIAuthTabCallback.get(i2);
            if (!Intrinsics.areEqual(ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) obj2), x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback())) {
                arrayList.add(obj2);
            }
        }
        int size2 = arrayList.size();
        final int i3 = iAsInterface / size2;
        Object obj3 = null;
        if (!listIAuthTabCallback.isEmpty()) {
            numValueOf = Integer.valueOf(((component7) listIAuthTabCallback.get(0)).onNavigationEvent(i3));
            int lastIndex = CollectionsKt.getLastIndex(listIAuthTabCallback);
            if (lastIndex > 0) {
                int i4 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((component7) listIAuthTabCallback.get(i4)).onNavigationEvent(i3));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        int i5 = onNavigationEvent + 115;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        numValueOf = numValueOf2;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size3 = arrayList.size();
        int i7 = 0;
        while (i7 < size3) {
            arrayList2.add(((component7) arrayList.get(i7)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i3, iIntValue)));
            i7++;
            listIAuthTabCallback = listIAuthTabCallback;
        }
        List list2 = listIAuthTabCallback;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int iT_ = ((getStreamSharingChildren) obj).T_();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex2 > 0) {
                int i8 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i8);
                    int iT_2 = ((getStreamSharingChildren) obj4).T_();
                    if (iT_ < iT_2) {
                        int i9 = onNavigationEvent + 113;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        obj = obj4;
                        iT_ = iT_2;
                    }
                    if (i8 == lastIndex2) {
                        break;
                    }
                    i8++;
                }
            }
        }
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) obj;
        int iT_3 = getstreamsharingchildren != null ? getstreamsharingchildren.T_() : 0;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size4 = list.size();
        int i11 = onNavigationEvent + 43;
        onExtraCallback = i11 % 128;
        int i12 = 2;
        if (i11 % 2 != 0) {
            int i13 = 2 % 3;
        }
        int i14 = 0;
        while (i14 < size4) {
            int i15 = onNavigationEvent + 91;
            onExtraCallback = i15 % 128;
            if (i15 % i12 != 0) {
                Intrinsics.areEqual(ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) list2.get(i14)), x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback());
                obj3.hashCode();
                throw null;
            }
            List list3 = list2;
            Object obj5 = list3.get(i14);
            if (Intrinsics.areEqual(ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) obj5), x2ExternalSyntheticLambda17.IAuthTabCallback.IAuthTabCallback())) {
                int i16 = onExtraCallback + 75;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                arrayList3.add(obj5);
            }
            i14++;
            list2 = list3;
            i12 = 2;
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size5 = arrayList3.size();
        int i18 = 0;
        while (i18 < size5) {
            int i19 = onExtraCallback + 11;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0) {
                arrayList4.add(((component7) arrayList3.get(i18)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i3, iT_3)));
                i18 += 57;
            } else {
                arrayList4.add(((component7) arrayList3.get(i18)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i3, iT_3)));
                i18++;
            }
        }
        final ArrayList arrayList5 = new ArrayList(size2);
        for (int i20 = 0; i20 < size2; i20++) {
            arrayList5.add(new x2ExternalSyntheticLambda2(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(isextrapreviewrequired.c_(i3) * i20), isextrapreviewrequired.c_(i3), isextrapreviewrequired.c_(iT_3), null));
        }
        final int i21 = iT_3;
        return component4.IAuthTabCallback(isextrapreviewrequired, iAsInterface, iT_3, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj6) {
                int i22 = 2 % 2;
                int i23 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                List list4 = arrayList4;
                isExtraPreviewRequired isextrapreviewrequired2 = isextrapreviewrequired;
                List list5 = arrayList2;
                int i25 = i3;
                getBacktraceNote getbacktracenote3 = getbacktracenote2;
                List list6 = arrayList5;
                int i26 = iAsInterface;
                int i27 = i21;
                Integer numValueOf3 = Integer.valueOf(i25);
                Integer numValueOf4 = Integer.valueOf(i26);
                Integer numValueOf5 = Integer.valueOf(i27);
                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{list4, isextrapreviewrequired2, list5, numValueOf3, getbacktracenote3, list6, numValueOf4, numValueOf5, (getStreamSharingChildren.onExtraCallbackWithResult) obj6}, -609366219, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 609366227, iOnWarmupCompleted);
                int i28 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i28 % 128;
                int i29 = i28 % 2;
                return unit;
            }
        }, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 3) == 2), i & 1)) {
            int i3 = onNavigationEvent + 107;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 48 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1676715096, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFixedSegmentedControlV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:785)");
                }
                getbacktracenote.invoke(list, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onNavigationEvent + 43;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getbacktracenote.invoke(list, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(List list, isExtraPreviewRequired isextrapreviewrequired, List list2, int i, final getBacktraceNote getbacktracenote, final List list3, int i2, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int size;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 43;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            size = list.size();
            i4 = 1;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            size = list.size();
            i4 = 0;
        }
        while (i4 < size) {
            int i7 = onNavigationEvent + 79;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list.get(i4), i4 / i, 0, 1.0f, 5, (Object) null);
                i4 += 119;
            } else {
                int i8 = i4;
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list.get(i8), i8 * i, 0, 0.0f, 4, (Object) null);
                i4 = i8 + 1;
            }
        }
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(x2ExternalSyntheticLambda20.FocusBox, ForwardingCameraControl.onExtraCallbackWithResult(1676715096, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnExtraCallback = x2ExternalSyntheticLambda22.onExtraCallback(getbacktracenote, list3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i12 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitOnExtraCallback;
            }
        }));
        int size2 = listIAuthTabCallback.size();
        int i9 = 0;
        while (i9 < size2) {
            int i10 = onNavigationEvent + 3;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, ((component7) listIAuthTabCallback.get(i9)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i2, i3)), 0, 0, 1.0f, 4, (Object) null);
                i9 += 33;
            } else {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, ((component7) listIAuthTabCallback.get(i9)).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i2, i3)), 0, 0, 0.0f, 4, (Object) null);
                i9++;
            }
        }
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, (getStreamSharingChildren) list2.get(i11), i11 * i, 0, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback;
            int i4 = i3 + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-733033005, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFixedSegmentedControlV1.<anonymous> (TdsSegmentedControlV1.kt:748)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), onextracallbackwithresult.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda26
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 105;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            x2ExternalSyntheticLambda22.onWarmupCompleted(getbacktracenote, onextracallbackwithresult, getbacktracenote2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        component8 component8VarOnWarmupCompleted = x2ExternalSyntheticLambda22.onWarmupCompleted(getbacktracenote, onextracallbackwithresult, getbacktracenote2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                        int i10 = onNavigationEvent + 33;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return component8VarOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallback + 123;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 27;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, @Nullable getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        int i7;
        x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult2;
        int i8;
        final getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnExtraCallback;
        int i9;
        int i10;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult3;
        final getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i11;
        int i12 = 2 % 2;
        int i13 = onExtraCallback + 103;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-827453549);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i16 = onExtraCallback + 21;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    int i18 = onNavigationEvent + 111;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    int i20 = onExtraCallback + 45;
                    onNavigationEvent = i20 % 128;
                    int i21 = i20 % 2;
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        onextracallbackwithresult2 = onextracallbackwithresult;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            getbacktracenoteOnExtraCallback = getbacktracenote;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnExtraCallback)) {
                                int i22 = onNavigationEvent + 47;
                                onExtraCallback = i22 % 128;
                                i9 = i22 % 2 != 0 ? 22897 : 16384;
                            } else {
                                i9 = 8192;
                            }
                            i10 = i9 | i4;
                        }
                        if ((196608 & i2) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                                int i23 = onExtraCallback + 17;
                                onNavigationEvent = i23 % 128;
                                if (i23 % 2 == 0) {
                                    throw null;
                                }
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i10 |= i11;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
                            if (i15 != 0) {
                                int i24 = onNavigationEvent + 35;
                                onExtraCallback = i24 % 128;
                                if (i24 % 2 != 0) {
                                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                    int i25 = 55 / 0;
                                } else {
                                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                }
                            } else {
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            }
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = i6 != 0 ? x2ExternalSyntheticLambda17.IAuthTabCallback.onNavigationEvent() : deviceQuirksExternalSyntheticLambda02;
                            final x2ExternalSyntheticLambda19.onExtraCallbackWithResult onExtraCallbackWithResult2 = i7 != 0 ? x2ExternalSyntheticLambda19.asBinder.Companion.onExtraCallbackWithResult() : onextracallbackwithresult2;
                            if (i8 != 0) {
                                getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(438339284, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda15
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                        int i26 = 2 % 2;
                                        int i27 = onWarmupCompleted + 7;
                                        onNavigationEvent = i27 % 128;
                                        int i28 = i27 % 2;
                                        Unit unitIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback(onExtraCallbackWithResult2, i, (List) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i29 = onNavigationEvent + 103;
                                        onWarmupCompleted = i29 % 128;
                                        if (i29 % 2 == 0) {
                                            return unitIAuthTabCallback;
                                        }
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827453549, i10, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsFixedSegmentedControlV1 (TdsSegmentedControlV1.kt:742)");
                            }
                            int i26 = ((i10 << 3) & 7168) | 24576;
                            getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4 = getbacktracenoteOnExtraCallback;
                            x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult4 = onExtraCallbackWithResult2;
                            onWarmupCompleted(onExtraCallbackWithResult2.onExtraCallback(), getImplementationType.onNavigationEvent(quirksExternalSyntheticBackport04), 0.0f, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, ForwardingCameraControl.onExtraCallback(-733033005, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda16
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i27 = 2 % 2;
                                    int i28 = IAuthTabCallback + 59;
                                    onExtraCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    Object[] objArr = {onExtraCallbackWithResult2, getbacktracenote2, getbacktracenoteOnExtraCallback, (HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                                    int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                    Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr, 1317075220, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1317075216, iOnWarmupCompleted);
                                    int i30 = IAuthTabCallback + 105;
                                    onExtraCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    return unit;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i26, 4);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i27 = onNavigationEvent + 77;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                            getbacktracenote3 = getbacktracenote4;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            onextracallbackwithresult3 = onextracallbackwithresult4;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            onextracallbackwithresult3 = onextracallbackwithresult2;
                            getbacktracenote3 = getbacktracenoteOnExtraCallback;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda17
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i29 = 2 % 2;
                                    int i30 = IAuthTabCallback + 121;
                                    onExtraCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    Unit unitOnExtraCallback = x2ExternalSyntheticLambda22.onExtraCallback(i, quirksExternalSyntheticBackport03, deviceQuirksExternalSyntheticLambda03, onextracallbackwithresult3, getbacktracenote3, getbacktracenote2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i32 = onExtraCallback + 27;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    return unitOnExtraCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    getbacktracenoteOnExtraCallback = getbacktracenote;
                    i10 = i4;
                    if ((196608 & i2) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                onextracallbackwithresult2 = onextracallbackwithresult;
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                getbacktracenoteOnExtraCallback = getbacktracenote;
                i10 = i4;
                if ((196608 & i2) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            onextracallbackwithresult2 = onextracallbackwithresult;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            getbacktracenoteOnExtraCallback = getbacktracenote;
            i10 = i4;
            if ((196608 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        onextracallbackwithresult2 = onextracallbackwithresult;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        getbacktracenoteOnExtraCallback = getbacktracenote;
        i10 = i4;
        if ((196608 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i10) != 74898, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    static final class asInterface implements PointerInputEventHandler {
        private static int IAuthTabCallback = 1;
        public static final asInterface onExtraCallback = new asInterface();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 19;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 7 / 0;
            }
        }

        asInterface() {
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, false);
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1263209759, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Container.<anonymous> (TdsSegmentedControlV1.kt:815)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0);
                Object[] objArr = {x2ExternalSyntheticLambda17.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6};
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, ((Long) x2ExternalSyntheticLambda17.onWarmupCompleted(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr, 137113939, -137113938)).longValue(), tometerspersecond), tometerspersecond);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda9
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i4 = 2 % 2;
                            int i5 = onNavigationEvent + 23;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unitIAuthTabCallback = x2ExternalSyntheticLambda22.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                            if (i6 != 0) {
                                int i7 = 39 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (Function1) objOnMinimized, 1, (Object) null);
                Unit unit = Unit.INSTANCE;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    int i4 = onExtraCallback + 83;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(asInterface.onExtraCallback);
                        throw null;
                    }
                    objOnMinimized2 = asInterface.onExtraCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, unit, (PointerInputEventHandler) objOnMinimized2);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i5 = onExtraCallback + 65;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        int i6 = 13 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                getbacktracenote.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onExtraCallback + 83;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            Unit unit2 = Unit.INSTANCE;
            int i9 = onNavigationEvent + 119;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return unit2;
        }
        int i11 = onExtraCallback + 93;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        Unit unit22 = Unit.INSTANCE;
        int i92 = onNavigationEvent + 119;
        onExtraCallback = i92 % 128;
        int i102 = i92 % 2;
        return unit22;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final toMetersPerSecond tometerspersecond, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i8;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = deviceQuirksExternalSyntheticLambda0;
        int i9 = 2 % 2;
        int i10 = onNavigationEvent + 87;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(235379167);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i13 = onExtraCallback + 63;
                    onNavigationEvent = i13 % 128;
                    i4 = i13 % 2 == 0 ? 71 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    f2 = f;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        int i14 = onExtraCallback + 15;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnNavigationEvent);
                            throw null;
                        }
                        i7 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnNavigationEvent) ^ true) ? 2048 : 1024) | i3;
                    }
                    if ((i & 24576) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                            int i15 = onExtraCallback + 113;
                            onNavigationEvent = i15 % 128;
                            i8 = i15 % 2 == 0 ? 26358 : 16384;
                        } else {
                            i8 = 8192;
                        }
                        i7 |= i8;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    } else {
                        if (i12 != 0) {
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if (i5 != 0) {
                            int i16 = onExtraCallback + 7;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                            f2 = 1.5f;
                        }
                        if (i6 != 0) {
                            deviceQuirksExternalSyntheticLambda0OnNavigationEvent = x2ExternalSyntheticLambda17.IAuthTabCallback.onNavigationEvent();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(235379167, i7, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Container (TdsSegmentedControlV1.kt:804)");
                        }
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        if (r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.onNavigationEvent() > f2) {
                            int i17 = onNavigationEvent + 105;
                            onExtraCallback = i17 % 128;
                            if (i17 % 2 != 0) {
                                VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.IAuthTabCallback(), f2);
                                throw null;
                            }
                            r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult = VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.IAuthTabCallback(), f2);
                        }
                        setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult), ForwardingCameraControl.onExtraCallback(1263209759, true, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda23
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i18 = 2 % 2;
                                int i19 = onWarmupCompleted + 37;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                Object[] objArr = {quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, tometerspersecond, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                                int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                                if (i20 == 0) {
                                    return (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr, 10751850, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, -10751848, iOnWarmupCompleted);
                                }
                                int i21 = 92 / 0;
                                return (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr, 10751850, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4, -10751848, iOnWarmupCompleted);
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    final float f3 = f2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda24
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i18 = 2 % 2;
                                int i19 = onWarmupCompleted + 11;
                                onExtraCallbackWithResult = i19 % 128;
                                if (i19 % 2 == 0) {
                                    return x2ExternalSyntheticLambda22.onNavigationEvent(tometerspersecond, quirksExternalSyntheticBackport03, f3, deviceQuirksExternalSyntheticLambda02, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                }
                                x2ExternalSyntheticLambda22.onNavigationEvent(tometerspersecond, quirksExternalSyntheticBackport03, f3, deviceQuirksExternalSyntheticLambda02, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                i7 = i3;
                if ((i & 24576) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
                }
                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda022 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport032 = quirksExternalSyntheticBackport02;
                final float f32 = f2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            f2 = f;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            i7 = i3;
            if ((i & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
            }
            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0222 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0322 = quirksExternalSyntheticBackport02;
            final float f322 = f2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        i7 = i3;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 9363) == 9362, i7 & 1)) {
        }
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02222 = deviceQuirksExternalSyntheticLambda0OnNavigationEvent;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03222 = quirksExternalSyntheticBackport02;
        final float f3222 = f2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[PHI: r0
      0x0040: PHI (r0v36 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v37 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r0
      0x002a: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v37 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final toMetersPerSecond tometerspersecond, final List<x2ExternalSyntheticLambda2> list, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 39;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(755102503);
            if ((i2 & 121) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond))) {
                    i3 = 4;
                } else {
                    int i8 = onNavigationEvent + 115;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    i3 = 2;
                }
                i4 = i3 | i2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(755102503);
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(list) ? 32 : 16;
        }
        boolean z = false;
        if ((i2 & 384) == 0) {
            int i10 = onExtraCallback + 91;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 86 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i)) {
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            int i12 = onExtraCallback + 123;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(755102503, i4, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.FocusBox (TdsSegmentedControlV1.kt:837)");
                int i14 = onNavigationEvent + 41;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
            }
            x2ExternalSyntheticLambda2 x2externalsyntheticlambda2 = (x2ExternalSyntheticLambda2) CollectionsKt.getOrNull(list, i);
            if (x2externalsyntheticlambda2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1779834986);
                x2ExternalSyntheticLambda17 x2externalsyntheticlambda17 = x2ExternalSyntheticLambda17.IAuthTabCallback;
                x2externalsyntheticlambda17.onWarmupCompleted(tometerspersecond, x2externalsyntheticlambda17.onExtraCallback((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, x2externalsyntheticlambda2), 0L, cameraCaptureResultEmptyCameraCaptureResult2, (i4 & 14) | 3072, 4);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1779664238);
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1779477029);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda27
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i16 = 2 % 2;
                    int i17 = onNavigationEvent + 121;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        return x2ExternalSyntheticLambda22.onWarmupCompleted(tometerspersecond, list, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    x2ExternalSyntheticLambda22.onWarmupCompleted(tometerspersecond, list, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    throw null;
                }
            });
        }
    }

    public static final getConfiguration<Float> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        getConfiguration<Float> getconfiguration = onWarmupCompleted;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return getconfiguration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r9
      0x0022: PHI (r9v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r9v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r9v5 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-942152801);
            int i4 = 23 / 0;
            if (i != 0) {
                z = true;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-942152801);
            if (i != 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-942152801, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Preview (TdsSegmentedControlV1.kt:892)");
            }
            Object[] objArr = {x2ExternalSyntheticLambda18.onWarmupCompleted};
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) x2ExternalSyntheticLambda18.onNavigationEvent(1837397238, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, -1837397233, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.TdsSegmentedControlV1Kt$$ExternalSyntheticLambda22
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 15;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr2 = {Integer.valueOf(i10), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
                    Unit unit = (Unit) x2ExternalSyntheticLambda22.IAuthTabCallback(objArr2, -476477842, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 476477847, iOnWarmupCompleted);
                    int i11 = onNavigationEvent + 115;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 10 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        }
        virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        throw null;
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.floatValue();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 99;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallback implements Function0<Boolean> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onExtraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ?? Access000 = this.onNavigationEvent.access000();
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return Access000;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements Function0<Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onNavigationEvent;
            if (i3 != 0) {
                return getswitchminwidth.access000();
            }
            getswitchminwidth.access000();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public IAuthTabCallbackDefault(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnWarmupCompleted;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onExtraCallback2 = onExtraCallback();
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return onExtraCallback2;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getBacktraceNote<getSwitchMinWidth.onExtraCallback<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, getCompoundPaddingRight<Float>> {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 109;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if (i3 == 0) {
                return IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }

        public final getCompoundPaddingRight<Float> IAuthTabCallback(getSwitchMinWidth.onExtraCallback<Boolean> onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-985243360);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 69;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-985243360, i, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1947)");
                int i5 = onWarmupCompleted + 95;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            getCompoundPaddingRight<Float> getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 0.0f, (Object) null, 7, (Object) null);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return getcompoundpaddingrightOnExtraCallback;
        }
    }

    public static final class onWarmupCompleted implements getBacktraceNote<getSwitchMinWidth.onExtraCallback<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, getCompoundPaddingRight<VirtualCameraControlExternalSyntheticLambda1>> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 117;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getCompoundPaddingRight<VirtualCameraControlExternalSyntheticLambda1> getcompoundpaddingrightIAuthTabCallback = IAuthTabCallback((getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getcompoundpaddingrightIAuthTabCallback;
        }

        public final getCompoundPaddingRight<VirtualCameraControlExternalSyntheticLambda1> IAuthTabCallback(getSwitchMinWidth.onExtraCallback<Boolean> onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1953972046);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1953972046, i, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1977)");
                int i3 = onExtraCallback + 85;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            getCompoundPaddingRight<VirtualCameraControlExternalSyntheticLambda1> getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(setSwitchPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion)), 3, (Object) null);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onExtraCallback + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return getcompoundpaddingrightOnExtraCallback;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, getbacktracenote, getbacktracenote2, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, 1317075220, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1317075216, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, isExtraPreviewRequired isextrapreviewrequired, List list2, int i, getBacktraceNote getbacktracenote, List list3, int i2, int i3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {list, isextrapreviewrequired, list2, Integer.valueOf(i), getbacktracenote, list3, Integer.valueOf(i2), Integer.valueOf(i3), onextracallbackwithresult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, -609366219, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 609366227, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, -476477842, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 476477847, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, -1096325513, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1096325514, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda19.asBinder asbinder, x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent, int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {asbinder, onnavigationevent, Integer.valueOf(i), list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, -1524730866, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1524730879, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, 1617127837, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1617127834, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, 893318648, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -893318642, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, 10751850, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -10751848, iOnWarmupCompleted);
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, -390621122, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 390621132, iOnWarmupCompleted);
    }

    private static final Unit onNavigationEvent(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {Integer.valueOf(i), quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, onextracallbackwithresult, getbacktracenote, getbacktracenote2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(objArr, 901557187, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -901557175, iOnWarmupCompleted);
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, 661826817, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -661826817, iOnWarmupCompleted);
    }

    public static final void onWarmupCompleted(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent, @Nullable x2ExternalSyntheticLambda19.asBinder asbinder, @Nullable getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        Object[] objArr = {Integer.valueOf(i), quirksExternalSyntheticBackport0, onnavigationevent, asbinder, getbacktracenote, deviceQuirksExternalSyntheticLambda0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        IAuthTabCallback(objArr, -878512974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 878512985, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) IAuthTabCallback(new Object[]{useandconfigureprogramwithtexture}, -156252952, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 156252961, iOnWarmupCompleted);
    }

    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setContentInsetsRelative setcontentinsetsrelative, long j, long j2, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, setcontentinsetsrelative, Long.valueOf(j), Long.valueOf(j2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(objArr, 726111052, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -726111045, iOnWarmupCompleted);
    }

    private static final float onWarmupCompleted(x2ExternalSyntheticLambda19.asBinder.IAuthTabCallback iAuthTabCallback) {
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Float) IAuthTabCallback(new Object[]{iAuthTabCallback}, 1225860531, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1225860517, iOnWarmupCompleted)).floatValue();
    }
}
