package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsInfoExternalSyntheticLambda0;
import o.HandlerScheduledExecutorService2;
import o.PreviewOrientationIncorrectQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.enableLoopMonitor;
import o.flipHorizontally;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.getSupportedHighSpeedResolutions;
import o.initSDK;
import o.isQueryRefinementEnabled;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.setUseCaseAttached;
import o.toPreviewOnlyRange;
import o.u5b;
import o.u5cExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;
import o.v1;
import o.x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5cExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~i2) | i8;
        int i10 = ~(i2 | i8);
        int i11 = i4 + i6 + i3 + ((-714989572) * i) + (1142003473 * i5);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i4) - 1983905792) + (1136689320 * i6) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i3) + ((-1891631104) * i) + ((-1355808768) * i5) + ((-1882259456) * i12);
        int i14 = (i4 * (-1158907614)) + 1427560840 + (i6 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i3 * (-1158906635)) + (i * 1387703340) + (i5 * 1202573125) + (i12 * (-451215360));
        switch (i13 + (i14 * i14 * (-310837248))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                final v1 v1Var = (v1) objArr[0];
                String str = (String) objArr[1];
                final findResAndMsg findresandmsg = (findResAndMsg) objArr[2];
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[3];
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, str, new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i16 = 2 % 2;
                        int i17 = onNavigationEvent + 81;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        Boolean boolValueOf = Boolean.valueOf(u5cExternalSyntheticLambda0.onExtraCallback(findresandmsg, v1Var));
                        int i19 = onExtraCallback + 33;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        return boolValueOf;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i16 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                return unit;
            case 8:
                return asInterface(objArr);
            case 9:
                String str2 = (String) objArr[0];
                final findResAndMsg findresandmsg2 = (findResAndMsg) objArr[1];
                final Function1 function1 = (Function1) objArr[2];
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture2 = (useAndConfigureProgramWithTexture) objArr[3];
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture2, "");
                unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture2, Float.MAX_VALUE);
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture2, str2);
                unregisterOutputSurface.asInterface(useandconfigureprogramwithtexture2, (String) null, new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        Boolean boolValueOf;
                        int i19 = 2 % 2;
                        int i20 = onNavigationEvent + 73;
                        onExtraCallbackWithResult = i20 % 128;
                        if (i20 % 2 == 0) {
                            boolValueOf = Boolean.valueOf(u5cExternalSyntheticLambda0.onWarmupCompleted(findresandmsg2, function1));
                            int i21 = 5 / 0;
                        } else {
                            boolValueOf = Boolean.valueOf(u5cExternalSyntheticLambda0.onWarmupCompleted(findresandmsg2, function1));
                        }
                        int i22 = onExtraCallbackWithResult + 83;
                        onNavigationEvent = i22 % 128;
                        if (i22 % 2 == 0) {
                            return boolValueOf;
                        }
                        throw null;
                    }
                }, 1, (Object) null);
                Unit unit2 = Unit.INSTANCE;
                int i19 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                return unit2;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asBinder(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, v1 v1Var, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, v1Var, function1, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, fliphorizontally}, iOnNavigationEvent, iOnNavigationEvent2, -1599963873, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1599963884);
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(rotate rotateVar, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(rotateVar, j, setorientationdegrees);
        }
        onWarmupCompleted(rotateVar, j, setorientationdegrees);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        }
        onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        throw null;
    }

    public static /* synthetic */ AppLovinAdClickListener IAuthTabCallback(v1 v1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdClickListener appLovinAdClickListenerOnNavigationEvent = onNavigationEvent(v1Var);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return appLovinAdClickListenerOnNavigationEvent;
    }

    public static final /* synthetic */ void IAuthTabCallback(findResAndMsg findresandmsg, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(findresandmsg, (Function1<? super access13800<? super Unit>, ? extends Object>) function1);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        v1 v1Var = (v1) objArr[2];
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[3];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getstreamsharingchildren, iIntValue, v1Var, onextracallbackwithresult);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getstreamsharingchildren, iIntValue, v1Var, onextracallbackwithresult);
        int i3 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        Function2 function2 = (Function2) objArr[3];
        long jLongValue3 = ((Number) objArr[4]).longValue();
        String str = (String) objArr[5];
        Function1 function1 = (Function1) objArr[6];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        onExtraCallback(v1Var, jLongValue, jLongValue2, function2, jLongValue3, str, function1, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(long j, v1 v1Var, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Long.valueOf(j), v1Var, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 553339403, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -553339397);
        } else {
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Long.valueOf(j), v1Var, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 553339403, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -553339397);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onnavigationevent);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(useandconfigureprogramwithtexture);
        }
        onWarmupCompleted(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(v1 v1Var, findResAndMsg findresandmsg, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(v1Var, findresandmsg, quirksExternalSyntheticBackport0, j, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(v1 v1Var, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, long j, isQueryRefinementEnabled isqueryrefinementenabled, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(v1Var, getsupportedhighspeedresolutions, j, isqueryrefinementenabled, setorientationdegrees);
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ component8 onExtraCallback(v1 v1Var, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (component8) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, component4Var, component7Var, virtualCameraCaptureResult}, iOnNavigationEvent, iOnNavigationEvent2, 1895820105, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1895820095);
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, v1Var);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onExtraCallback(v1 v1Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(v1Var);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return zOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        String str = (String) objArr[1];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[2];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, str, findresandmsg, useandconfigureprogramwithtexture}, iOnNavigationEvent, iOnNavigationEvent2, -1244676081, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1244676088);
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, v1 v1Var, long j2, Function2 function2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(j, v1Var, j2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(j, v1Var, j2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(v1 v1Var, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(v1Var, fliphorizontally);
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        Function2 function2 = (Function2) objArr[3];
        long jLongValue3 = ((Number) objArr[4]).longValue();
        String str = (String) objArr[5];
        Function1 function1 = (Function1) objArr[6];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), function2, Long.valueOf(jLongValue3), str, function1, getbacktracenote, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1518063812, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1518063820);
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, findResAndMsg findresandmsg, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, findresandmsg, function1, useandconfigureprogramwithtexture}, iOnNavigationEvent, iOnNavigationEvent2, -2108710646, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2108710655);
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, findresandmsg, function1, useandconfigureprogramwithtexture}, iOnNavigationEvent3, iOnNavigationEvent4, -2108710646, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2108710655);
        int i3 = 95 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, v1 v1Var, findResAndMsg findresandmsg, getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, v1Var, findresandmsg, getbacktracenote, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(isqueryrefinementenabled, fliphorizontally);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(isqueryrefinementenabled, fliphorizontally);
        int i3 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v1 v1Var, long j, long j2, Function2 function2, getBacktraceNote getbacktracenote, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -808800208, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 808800209);
            int i4 = 16 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -808800208, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 808800209);
        }
        int i5 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v1 v1Var, findResAndMsg findresandmsg, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(v1Var, findresandmsg, quirksExternalSyntheticBackport0, j, function2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 15 / 0;
        }
        int i8 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v1 v1Var, findResAndMsg findresandmsg, isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(v1Var, findresandmsg, isqueryrefinementenabled);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onWarmupCompleted(v1 v1Var, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(v1Var, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(v1Var, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, j, sessionProcessorCaptureCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, j, sessionProcessorCaptureCallback);
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
        return removeobserverlockedIAuthTabCallback;
    }

    public static /* synthetic */ boolean onWarmupCompleted(findResAndMsg findresandmsg, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(findresandmsg, function1);
        }
        onNavigationEvent(findresandmsg, function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $predictiveBackProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$predictiveBackProgress = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$predictiveBackProgress, access13800Var);
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 85;
                int i6 = i5 % 128;
                onWarmupCompleted = i6;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i6 + 19;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$predictiveBackProgress;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, (onItemClicked) null, (Object) null, (Function1) null, this, 14, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(v1 v1Var, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$sheetState, access13800Var);
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$sheetState;
                x1.onExtraCallback onextracallback = x1.onExtraCallback.onExtraCallbackWithResult;
                this.label = 1;
                if (v1Var.onNavigationEvent(onextracallback, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(v1 v1Var, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$sheetState, access13800Var);
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$sheetState;
                x1.onExtraCallback onextracallback = x1.onExtraCallback.onExtraCallbackWithResult;
                this.label = 1;
                if (v1Var.IAuthTabCallback(onextracallback, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(v1 v1Var, findResAndMsg findresandmsg, isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (v1Var.onNavigationEvent().compareTo(u5b.Expanded) >= 0) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(isqueryrefinementenabled, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(v1Var, null), 3, (Object) null);
            int i4 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(v1Var, null), 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class onNavigationEvent implements PointerInputEventHandler {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 69 / 0;
            }
        }

        onNavigationEvent() {
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit2;
        }
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(long j, v1 v1Var, long j2, Function2 function2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1358769823, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2.<anonymous>.<anonymous> (BasicTdsBottomSheetV2.kt:125)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 61;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnExtraCallback = u5cExternalSyntheticLambda0.onExtraCallback((useAndConfigureProgramWithTexture) obj);
                        int i8 = onNavigationEvent + 35;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, false, (Function1) objOnMinimized);
            Unit unit = Unit.INSTANCE;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = onNavigationEvent.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, unit, (PointerInputEventHandler) objOnMinimized2);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
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
            IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Long.valueOf(j), v1Var, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 553339403, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -553339397);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i5 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                objOnMinimized3 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            onExtraCallbackWithResult(v1Var, (findResAndMsg) objOnMinimized3, null, j2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final v1 v1Var = (v1) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        final long jLongValue2 = ((Number) objArr[2]).longValue();
        final Function2 function2 = (Function2) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        enableLoopMonitor enableloopmonitor = (enableLoopMonitor) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1824109374, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2.<anonymous> (BasicTdsBottomSheetV2.kt:105)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i2 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i4 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i6 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                objOnMinimized2 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
            va vaVar = new va(null, false, 3, null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback | zOnExtraCallback2)) {
                Object obj = objOnMinimized3;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda16
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = IAuthTabCallback + 125;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            v1 v1Var2 = v1Var;
                            if (i10 != 0) {
                                return u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var2, findresandmsg, isqueryrefinementenabled);
                            }
                            int i11 = 43 / 0;
                            return u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var2, findresandmsg, isqueryrefinementenabled);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                u7d.onExtraCallback((Function0) obj, vaVar, isqueryrefinementenabled, ForwardingCameraControl.onExtraCallback(1358769823, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda17
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 47;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return u5cExternalSyntheticLambda0.onExtraCallbackWithResult(jLongValue, v1Var, jLongValue2, function2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        u5cExternalSyntheticLambda0.onExtraCallbackWithResult(jLongValue, v1Var, jLongValue2, function2, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, (isQueryRefinementEnabled.IAuthTabCallback << 6) | 3120);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallbackWithResult + 39;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final v1 v1Var, long j, long j2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, long j3, @Nullable String str, @Nullable Function1<? super initSDK.onNavigationEvent, Unit> function1, @NotNull final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        long jOnNavigationEvent;
        long j4;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2OnWarmupCompleted;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        long j5;
        Function1<? super initSDK.onNavigationEvent, Unit> function12;
        long jLongValue;
        long j6;
        String str3;
        final long j7;
        final long j8;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        Function1<? super initSDK.onNavigationEvent, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(v1Var, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1589533419);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i11 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
                jOnNavigationEvent = j;
            } else {
                jOnNavigationEvent = j;
                int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent) ? 32 : 16;
                i3 |= i12;
            }
            i3 |= i12;
        } else {
            jOnNavigationEvent = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 256 : 128;
                i3 |= i13;
            } else {
                j4 = j2;
            }
            i3 |= i13;
        } else {
            j4 = j2;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function2OnWarmupCompleted = function2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2OnWarmupCompleted) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    int i15 = onExtraCallbackWithResult + 33;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 61 / 0;
                        i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 16384 : 8192;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                    }
                    i6 = i5 | i3;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        str2 = str;
                        int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 131072 : 65536;
                        i6 |= i17;
                    } else {
                        str2 = str;
                    }
                    i6 |= i17;
                } else {
                    str2 = str;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i6 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                        int i18 = onNavigationEvent + 77;
                        onExtraCallbackWithResult = i18 % 128;
                        if (i18 % 2 != 0) {
                            throw null;
                        }
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i6 |= i9;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    str3 = str2;
                    j7 = jOnNavigationEvent;
                    function22 = function2OnWarmupCompleted;
                    j8 = j3;
                    function13 = function1;
                } else {
                    int i19 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 2) != 0) {
                                i6 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            i8 = i6;
                            j5 = j3;
                        }
                        long j9 = j5;
                        function12 = function1;
                        i6 = i8;
                        jLongValue = j4;
                        j6 = j9;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1589533419, i6, -1, "im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2 (BasicTdsBottomSheetV2.kt:99)");
                        }
                        final long j10 = jOnNavigationEvent;
                        final long j11 = jLongValue;
                        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23 = function2OnWarmupCompleted;
                        long j12 = jLongValue;
                        int i20 = i6 >> 12;
                        setThreadList.onWarmupCompleted(j6, str2, function12, ForwardingCameraControl.onExtraCallback(1824109374, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i21 = 2 % 2;
                                int i22 = onNavigationEvent + 33;
                                IAuthTabCallback = i22 % 128;
                                int i23 = i22 % 2;
                                Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, j10, j11, function23, getbacktracenote, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i24 = IAuthTabCallback + 35;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i20 & 112) | (i20 & 14) | 3072 | (i20 & 896), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        str3 = str2;
                        j7 = jOnNavigationEvent;
                        j8 = j6;
                        function22 = function2OnWarmupCompleted;
                        j4 = j12;
                        function13 = function12;
                    }
                    if ((i2 & 2) != 0) {
                        int i21 = onNavigationEvent + 19;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                        jOnNavigationEvent = u7.IAuthTabCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i6 &= -113;
                        int i23 = onNavigationEvent + 101;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                    }
                    if ((i2 & 4) != 0) {
                        int i25 = onNavigationEvent + 79;
                        onExtraCallbackWithResult = i25 % 128;
                        int i26 = i25 % 2;
                        jLongValue = ((Long) u7.onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 585339600, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -585339599, new Object[]{u7.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6})).longValue();
                        i6 &= -897;
                    } else {
                        jLongValue = j4;
                    }
                    if (i14 != 0) {
                        function2OnWarmupCompleted = u5a.onWarmupCompleted.onWarmupCompleted();
                    }
                    if (i4 != 0) {
                        int i27 = onNavigationEvent + 39;
                        onExtraCallbackWithResult = i27 % 128;
                        int i28 = i27 % 2;
                        j6 = -1;
                    } else {
                        j6 = j3;
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                        str2 = (String) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 682883803, -682883790, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    }
                    if (i7 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj) {
                                    int i29 = 2 % 2;
                                    int i30 = onExtraCallbackWithResult + 3;
                                    onExtraCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    Unit unitOnExtraCallback = u5cExternalSyntheticLambda0.onExtraCallback((initSDK.onNavigationEvent) obj);
                                    int i32 = onExtraCallbackWithResult + 121;
                                    onExtraCallback = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        return unitOnExtraCallback;
                                    }
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function12 = (Function1) objOnMinimized;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        final long j102 = jOnNavigationEvent;
                        final long j112 = jLongValue;
                        final Function2 function232 = function2OnWarmupCompleted;
                        long j122 = jLongValue;
                        int i202 = i6 >> 12;
                        setThreadList.onWarmupCompleted(j6, str2, function12, ForwardingCameraControl.onExtraCallback(1824109374, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i212 = 2 % 2;
                                int i222 = onNavigationEvent + 33;
                                IAuthTabCallback = i222 % 128;
                                int i232 = i222 % 2;
                                Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, j102, j112, function232, getbacktracenote, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i242 = IAuthTabCallback + 35;
                                onNavigationEvent = i242 % 128;
                                int i252 = i242 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i202 & 112) | (i202 & 14) | 3072 | (i202 & 896), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        str3 = str2;
                        j7 = jOnNavigationEvent;
                        j8 = j6;
                        function22 = function2OnWarmupCompleted;
                        j4 = j122;
                        function13 = function12;
                    } else {
                        long j13 = jLongValue;
                        i8 = i6;
                        j5 = j6;
                        j4 = j13;
                        long j92 = j5;
                        function12 = function1;
                        i6 = i8;
                        jLongValue = j4;
                        j6 = j92;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        final long j1022 = jOnNavigationEvent;
                        final long j1122 = jLongValue;
                        final Function2 function2322 = function2OnWarmupCompleted;
                        long j1222 = jLongValue;
                        int i2022 = i6 >> 12;
                        setThreadList.onWarmupCompleted(j6, str2, function12, ForwardingCameraControl.onExtraCallback(1824109374, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i212 = 2 % 2;
                                int i222 = onNavigationEvent + 33;
                                IAuthTabCallback = i222 % 128;
                                int i232 = i222 % 2;
                                Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, j1022, j1122, function2322, getbacktracenote, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i242 = IAuthTabCallback + 35;
                                onNavigationEvent = i242 % 128;
                                int i252 = i242 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2022 & 112) | (i2022 & 14) | 3072 | (i2022 & 896), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        str3 = str2;
                        j7 = jOnNavigationEvent;
                        j8 = j6;
                        function22 = function2OnWarmupCompleted;
                        j4 = j1222;
                        function13 = function12;
                    }
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final long j14 = j4;
                    final String str4 = str3;
                    final Function1<? super initSDK.onNavigationEvent, Unit> function14 = function13;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i29 = 2 % 2;
                            int i30 = onWarmupCompleted + 63;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            v1 v1Var2 = v1Var;
                            long j15 = j7;
                            long j16 = j14;
                            Function2 function24 = function22;
                            long j17 = j8;
                            String str5 = str4;
                            Function1 function15 = function14;
                            getBacktraceNote getbacktracenote2 = getbacktracenote;
                            int i32 = i;
                            int i33 = i2;
                            int iIntValue = ((Integer) obj2).intValue();
                            Unit unit = (Unit) u5cExternalSyntheticLambda0.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var2, Long.valueOf(j15), Long.valueOf(j16), function24, Long.valueOf(j17), str5, function15, getbacktracenote2, Integer.valueOf(i32), Integer.valueOf(i33), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1276632359, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1276632357);
                            int i34 = onWarmupCompleted + 25;
                            IAuthTabCallback = i34 % 128;
                            int i35 = i34 % 2;
                            return unit;
                        }
                    });
                    return;
                }
                return;
            }
            int i29 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i29 % 128;
            int i30 = i29 % 2;
            i3 |= 24576;
            i6 = i3;
            if ((196608 & i) == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function2OnWarmupCompleted = function2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        i6 = i3;
        if ((196608 & i) == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final AppLovinAdClickListener onNavigationEvent(v1 v1Var) {
        int i = 2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(((Float) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 824688114, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -824688103)).floatValue(), null);
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return appLovinAdClickListener;
        }
        throw null;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $animatable;
        final /* synthetic */ v1 $sheetState;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(v1 v1Var, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
            this.$animatable = isqueryrefinementenabled;
        }

        public static /* synthetic */ u5b onWarmupCompleted(v1 v1Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            u5b u5bVarOnExtraCallbackWithResult = onExtraCallbackWithResult(v1Var);
            if (i3 == 0) {
                int i4 = 10 / 0;
            }
            int i5 = onExtraCallback + 27;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 76 / 0;
            }
            return u5bVarOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$sheetState, this.$animatable, access13800Var);
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static final u5b onExtraCallbackWithResult(v1 v1Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            u5b u5bVarOnNavigationEvent = v1Var.onNavigationEvent();
            int i4 = onNavigationEvent + 3;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return u5bVarOnNavigationEvent;
            }
            throw null;
        }

        /* renamed from: o.u5cExternalSyntheticLambda0$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<u5b, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $animatable;
            final /* synthetic */ Ref.ObjectRef<u5b> $state;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Ref.ObjectRef<u5b> objectRef, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$state = objectRef;
                this.$animatable = isqueryrefinementenabled;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$state, this.$animatable, access13800Var);
                anonymousClass5.L$0 = obj;
                int i2 = onNavigationEvent + 123;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass5;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((u5b) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 83 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(u5b u5bVar, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(u5bVar, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
            
                if (o.isQueryRefinementEnabled.onWarmupCompleted(r5, r6, (o.onItemClicked) null, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r13, 29, (java.lang.Object) null) == r2) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
            
                if (o.isQueryRefinementEnabled.onWarmupCompleted(r3, r4, (o.onItemClicked) null, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r13, 14, (java.lang.Object) null) == r2) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
            
                if (o.isQueryRefinementEnabled.onWarmupCompleted(r5, r6, (o.onItemClicked) null, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r13, 14, (java.lang.Object) null) == r2) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
            
                return r2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                u5b u5bVar = (u5b) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    u5b u5bVar2 = (u5b) this.$state.element;
                    if (u5bVar2 != null) {
                        int i3 = IAuthTabCallback + 37;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        u5b u5bVar3 = u5b.Hidden;
                        if (u5bVar2 != u5bVar3) {
                            if (u5bVar == u5bVar3) {
                                int i5 = onNavigationEvent + 101;
                                IAuthTabCallback = i5 % 128;
                                if (i5 % 2 != 0) {
                                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$animatable;
                                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                                    this.L$0 = u5bVar;
                                    this.L$1 = access15400.onNavigationEvent(u5bVar2);
                                    this.label = 4;
                                } else {
                                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$animatable;
                                    Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(0.0f);
                                    this.L$0 = u5bVar;
                                    this.L$1 = access15400.onNavigationEvent(u5bVar2);
                                    this.label = 2;
                                }
                            }
                        }
                    }
                    int i6 = onNavigationEvent + 57;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = this.$animatable;
                    Float fOnExtraCallbackWithResult3 = access14000.onExtraCallbackWithResult(1.0f);
                    this.L$0 = u5bVar;
                    this.L$1 = access15400.onNavigationEvent(u5bVar2);
                    this.label = 1;
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                this.$state.element = u5bVar;
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final v1 v1Var = this.$sheetState;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$BottomSheetContent$1$1$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 121;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        u5b u5bVarOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted.onWarmupCompleted(v1Var);
                        int i6 = onNavigationEvent + 85;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return u5bVarOnWarmupCompleted;
                    }
                }));
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(objectRef, this.$animatable, null);
                this.L$0 = access15400.onNavigationEvent(objectRef);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass5, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 27;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 91;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i5 = 16 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                int i6 = onNavigationEvent + 61;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 $density;
        final /* synthetic */ PreviewOrientationIncorrectQuirk $imeWindowInsets;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, v1 v1Var, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$imeWindowInsets = previewOrientationIncorrectQuirk;
            this.$density = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
            this.$sheetState = v1Var;
        }

        public static /* synthetic */ boolean onNavigationEvent(PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnWarmupCompleted = onWarmupCompleted(previewOrientationIncorrectQuirk, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnWarmupCompleted;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$imeWindowInsets, this.$density, this.$sheetState, access13800Var);
            int i2 = onNavigationEvent + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                asbinderCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asbinderCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        private static final boolean onWarmupCompleted(PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
            int i = 2 % 2;
            if (previewOrientationIncorrectQuirk.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4) > 0) {
                int i2 = onWarmupCompleted + 125;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.u5cExternalSyntheticLambda0$asBinder$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ v1 $sheetState;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(v1 v1Var, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$sheetState = v1Var;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$sheetState, access13800Var);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onExtraCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 != 0) {
                    return onExtraCallbackWithResult(zBooleanValue, access13800Var);
                }
                onExtraCallbackWithResult(zBooleanValue, access13800Var);
                throw null;
            }

            public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 21;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                this.$sheetState.onExtraCallback(z);
                Unit unit = Unit.INSTANCE;
                int i4 = onExtraCallback + 53;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                final PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk = this.$imeWindowInsets;
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = this.$density;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$BottomSheetContent$2$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 23;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk2 = previewOrientationIncorrectQuirk;
                        if (i7 == 0) {
                            return Boolean.valueOf(u5cExternalSyntheticLambda0.asBinder.onNavigationEvent(previewOrientationIncorrectQuirk2, r8lambdanm9dm2eewl4vrptnjmesfjqky4));
                        }
                        Boolean.valueOf(u5cExternalSyntheticLambda0.asBinder.onNavigationEvent(previewOrientationIncorrectQuirk2, r8lambdanm9dm2eewl4vrptnjmesfjqky4));
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$sheetState, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass3, this) == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 123;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 75 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onNavigationEvent + 55;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, 0.0f);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final removeObserverLocked IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        final rotate rotateVarIAuthTabCallback = ((AppLovinAdClickListener) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent, iOnNavigationEvent2, 1252117076, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1252117076)).IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback(rotateVarIAuthTabCallback, j, (setOrientationDegrees) obj);
                int i5 = onExtraCallback + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(rotate rotateVar, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setDescription.IAuthTabCallback(setorientationdegrees, rotateVar, j, 1.0f, (hasMoreElements) null, (seek) null, 0, 34, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setDescription.IAuthTabCallback(setorientationdegrees, rotateVar, j, 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            fliphorizontally.onNavigationEvent((AppLovinAdClickListener) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent, iOnNavigationEvent2, 1252117076, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1252117076));
            fliphorizontally.onWarmupCompleted(false);
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            fliphorizontally.onNavigationEvent((AppLovinAdClickListener) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent3, iOnNavigationEvent4, 1252117076, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1252117076));
            fliphorizontally.onWarmupCompleted(true);
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ v1 $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(v1 v1Var, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$this_with = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$this_with, access13800Var);
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$this_with;
                x1.onWarmupCompleted onwarmupcompleted = x1.onWarmupCompleted.onExtraCallback;
                this.label = 1;
                if (v1Var.IAuthTabCallback(onwarmupcompleted, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 97;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallback + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    private static final boolean onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(v1Var, null), 3, (Object) null);
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function2 function2, final v1 v1Var, final findResAndMsg findresandmsg, getBacktraceNote getbacktracenote, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1565950109, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.BottomSheetContent.<anonymous>.<anonymous> (BasicTdsBottomSheetV2.kt:209)");
            }
            if (function2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-714980388);
                DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_collapse, cameraCaptureResultEmptyCameraCaptureResult, 0);
                final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_close, cameraCaptureResultEmptyCameraCaptureResult, 0);
                DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_expand, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = getCurrentContentInsetEnd.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), true, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 2, (Object) null);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnNavigationEvent2 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda25
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 13;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Unit unit = (Unit) u5cExternalSyntheticLambda0.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, strOnExtraCallback, findresandmsg, (useAndConfigureProgramWithTexture) obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1985353743, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1985353740);
                            int i8 = onExtraCallback + 47;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, true, (Function1) objOnMinimized);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-713311131);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            getbacktracenote.invoke(meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 74 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i7 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[PHI: r1
      0x0061: PHI (r1v54 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v55 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r1
      0x0043: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v55 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0041, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final v1 v1Var, @NotNull final findResAndMsg findresandmsg, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @NotNull final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final long jLongValue;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2IAuthTabCallback;
        int i4;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        boolean z2;
        Object objOnMinimized;
        Object objOnMinimized2;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        final isQueryRefinementEnabled isqueryrefinementenabled;
        boolean z3;
        boolean zOnExtraCallback;
        Object objOnMinimized3;
        boolean zOnNavigationEvent;
        Object objOnMinimized4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(v1Var, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2093522579);
            if ((i & 15) == 0) {
                int i8 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var);
                    obj.hashCode();
                    throw null;
                }
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(v1Var, "");
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2093522579);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i10 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport04);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport04) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i11 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 50) != 0) {
                jLongValue = j;
            } else {
                jLongValue = j;
                int i12 = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jLongValue) ? 2048 : 1024;
                i3 |= i12;
            }
            i3 |= i12;
        } else {
            jLongValue = j;
        }
        int i13 = i2 & 16;
        if (i13 == 0) {
            if ((i & 24576) == 0) {
                function2IAuthTabCallback = function2;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2IAuthTabCallback)) {
                    int i14 = onExtraCallbackWithResult + 121;
                    onNavigationEvent = i14 % 128;
                    i4 = i14 % 2 == 0 ? 13203 : 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((196608 & i) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898) {
                int i15 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i15 % 128;
                z = i15 % 2 == 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                    if (i9 != 0) {
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if ((i2 & 8) != 0) {
                        jLongValue = ((Long) u7.onNavigationEvent(TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), 585339600, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), -585339599, new Object[]{u7.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2, 6})).longValue();
                        i3 &= -7169;
                    }
                    if (i13 != 0) {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        function2IAuthTabCallback = u5a.onWarmupCompleted.IAuthTabCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2093522579, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.BottomSheetContent (BasicTdsBottomSheetV2.kt:156)");
                    }
                    i5 = i3 & 14;
                    z2 = i5 != 4;
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda18
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i16 = 2 % 2;
                                int i17 = onNavigationEvent + 47;
                                IAuthTabCallback = i17 % 128;
                                int i18 = i17 % 2;
                                v1 v1Var2 = v1Var;
                                if (i18 == 0) {
                                    return u5cExternalSyntheticLambda0.IAuthTabCallback(v1Var2);
                                }
                                u5cExternalSyntheticLambda0.IAuthTabCallback(v1Var2);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        });
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
                    z3 = i5 != 4;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(isqueryrefinementenabled);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(z3 | zOnExtraCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new onWarmupCompleted(v1Var, isqueryrefinementenabled, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(v1Var, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnWarmupCompleted = ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    Unit unit = Unit.INSTANCE;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(previewOrientationIncorrectQuirkOnWarmupCompleted);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                    if (i5 != 4) {
                        int i16 = onExtraCallbackWithResult + 79;
                        onNavigationEvent = i16 % 128;
                        boolean z4 = i16 % 2 != 0;
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if ((zOnNavigationEvent2 | zOnNavigationEvent3 | z4) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new asBinder(previewOrientationIncorrectQuirkOnWarmupCompleted, r8lambdanm9dm2eewl4vrptnjmesfjqky4, v1Var, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback((QuirksExternalSyntheticBackport0) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{YuvImageOnePixelShiftQuirk.onNavigationEvent(YuvImageOnePixelShiftQuirk.IAuthTabCallback(quirksExternalSyntheticBackport03)), v1Var, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 << 3) & 112)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -56036241, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 56036245), v1Var);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized6 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda19
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj2) {
                                    int i17 = 2 % 2;
                                    int i18 = onExtraCallbackWithResult + 89;
                                    IAuthTabCallback = i18 % 128;
                                    int i19 = i18 % 2;
                                    Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback((useAndConfigureProgramWithTexture) obj2);
                                    int i20 = IAuthTabCallback + 121;
                                    onExtraCallbackWithResult = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized6, 1, (Object) null);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(isqueryrefinementenabled);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (zOnExtraCallback2 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda20
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj2) {
                                    int i17 = 2 % 2;
                                    int i18 = onExtraCallbackWithResult + 73;
                                    onNavigationEvent = i18 % 128;
                                    int i19 = i18 % 2;
                                    Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(isqueryrefinementenabled, (flipHorizontally) obj2);
                                    int i20 = onNavigationEvent + 19;
                                    onExtraCallbackWithResult = i20 % 128;
                                    int i21 = i20 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized7);
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                        boolean z5 = (((i3 & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jLongValue)) || (i3 & 3072) == 2048;
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (zOnNavigationEvent4 || z5) {
                            objOnMinimized8 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda21
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj2) {
                                    int i17 = 2 % 2;
                                    int i18 = IAuthTabCallback + 17;
                                    onNavigationEvent = i18 % 128;
                                    int i19 = i18 % 2;
                                    removeObserverLocked removeobserverlockedOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, jLongValue, (SessionProcessorCaptureCallback) obj2);
                                    int i20 = onNavigationEvent + 103;
                                    IAuthTabCallback = i20 % 128;
                                    int i21 = i20 % 2;
                                    return removeobserverlockedOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized8);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized8);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                            objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!zOnNavigationEvent || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda22
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2) {
                                        int i17 = 2 % 2;
                                        int i18 = onNavigationEvent + 123;
                                        IAuthTabCallback = i18 % 128;
                                        int i19 = i18 % 2;
                                        Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj2);
                                        int i20 = onNavigationEvent + 63;
                                        IAuthTabCallback = i20 % 128;
                                        int i21 = i20 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized4);
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback3);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                            final LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22 = function2IAuthTabCallback;
                            setPostviewFormatSelector.onNavigationEvent(lc.onNavigationEvent().onExtraCallback(setByteOrder.onNavigationEvent(jLongValue)), ForwardingCameraControl.onExtraCallback(1565950109, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda23
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i17 = 2 % 2;
                                    int i18 = onWarmupCompleted + 23;
                                    onExtraCallbackWithResult = i18 % 128;
                                    int i19 = i18 % 2;
                                    Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(function22, v1Var, findresandmsg, getbacktracenote, lowLightBoostControlExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i20 = onWarmupCompleted + 35;
                                    onExtraCallbackWithResult = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        } else {
                            int i17 = onNavigationEvent + 103;
                            onExtraCallbackWithResult = i17 % 128;
                            if (i17 % 2 != 0) {
                                onwarmupcompleted.onExtraCallback();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback22 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized8);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                            objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!zOnNavigationEvent) {
                                objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda22
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj22) {
                                        int i172 = 2 % 2;
                                        int i18 = onNavigationEvent + 123;
                                        IAuthTabCallback = i18 % 128;
                                        int i19 = i18 % 2;
                                        Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, (flipHorizontally) obj22);
                                        int i20 = onNavigationEvent + 63;
                                        IAuthTabCallback = i20 % 128;
                                        int i21 = i20 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback32 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback22, (Function1) objOnMinimized4);
                                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback32);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                final MeteringRepeatingSessionExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                final Function2 function222 = function2IAuthTabCallback;
                                setPostviewFormatSelector.onNavigationEvent(lc.onNavigationEvent().onExtraCallback(setByteOrder.onNavigationEvent(jLongValue)), ForwardingCameraControl.onExtraCallback(1565950109, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda23
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj22, Object obj3) {
                                        int i172 = 2 % 2;
                                        int i18 = onWarmupCompleted + 23;
                                        onExtraCallbackWithResult = i18 % 128;
                                        int i19 = i18 % 2;
                                        Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(function222, v1Var, findresandmsg, getbacktracenote, lowLightBoostControlExternalSyntheticLambda02, (CameraCaptureResultEmptyCameraCaptureResult) obj22, ((Integer) obj3).intValue());
                                        int i20 = onWarmupCompleted + 35;
                                        onExtraCallbackWithResult = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            }
                        }
                    }
                } else {
                    int i18 = onExtraCallbackWithResult + 9;
                    onNavigationEvent = i18 % 128;
                    if (i18 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        if ((i2 & 6) != 0) {
                            i3 &= -7169;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        if ((i2 & 8) != 0) {
                        }
                    }
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                i5 = i3 & 14;
                if (i5 != 4) {
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!z2) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda18
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i162 = 2 % 2;
                            int i172 = onNavigationEvent + 47;
                            IAuthTabCallback = i172 % 128;
                            int i182 = i172 % 2;
                            v1 v1Var2 = v1Var;
                            if (i182 == 0) {
                                return u5cExternalSyntheticLambda0.IAuthTabCallback(v1Var2);
                            }
                            u5cExternalSyntheticLambda0.IAuthTabCallback(v1Var2);
                            Object obj22 = null;
                            obj22.hashCode();
                            throw null;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    }
                    isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
                    if (i5 != 4) {
                    }
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(isqueryrefinementenabled);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(z3 | zOnExtraCallback)) {
                        objOnMinimized3 = new onWarmupCompleted(v1Var, isqueryrefinementenabled, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(v1Var, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i5);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnWarmupCompleted2 = ZslDisablerQuirk.onWarmupCompleted(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        Unit unit2 = Unit.INSTANCE;
                        boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(previewOrientationIncorrectQuirkOnWarmupCompleted2);
                        boolean zOnNavigationEvent32 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky42);
                        if (i5 != 4) {
                        }
                    }
                }
            }
            final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23 = function2IAuthTabCallback;
            final long j2 = jLongValue;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda24
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3, Object obj4) {
                        Unit unitOnWarmupCompleted;
                        int i19 = 2 % 2;
                        int i20 = onExtraCallbackWithResult + 63;
                        onWarmupCompleted = i20 % 128;
                        if (i20 % 2 != 0) {
                            unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, findresandmsg, quirksExternalSyntheticBackport02, j2, function23, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i21 = 20 / 0;
                        } else {
                            unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, findresandmsg, quirksExternalSyntheticBackport02, j2, function23, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i22 = onExtraCallbackWithResult + 51;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function2IAuthTabCallback = function2;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i3 & 1)) {
        }
        final Function2 function232 = function2IAuthTabCallback;
        final long j22 = jLongValue;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final v1 v1Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(v1Var, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(attachTimestamp.IAuthTabCallback(CaptureNoResponseQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(v1Var, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                int i4 = onWarmupCompleted + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return extensionsInfoExternalSyntheticLambda0OnWarmupCompleted;
            }
        }), new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 79;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                v1 v1Var2 = v1Var;
                flipHorizontally fliphorizontally = (flipHorizontally) obj;
                if (i4 != 0) {
                    return u5cExternalSyntheticLambda0.onExtraCallbackWithResult(v1Var2, fliphorizontally);
                }
                u5cExternalSyntheticLambda0.onExtraCallbackWithResult(v1Var2, fliphorizontally);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), v1Var, new access100(v1Var)));
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(v1 v1Var, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStubProxy(v1Var.IAuthTabCallbackStub());
            fliphorizontally.getInterfaceDescriptor(v1Var.IAuthTabCallbackStub());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStubProxy(v1Var.IAuthTabCallbackStub());
        fliphorizontally.getInterfaceDescriptor(v1Var.IAuthTabCallbackStub());
        int i3 = 56 / 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class access100 implements PointerInputEventHandler {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ v1 onExtraCallback;

        access100(v1 v1Var) {
            this.onExtraCallback = v1Var;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new AnonymousClass4(highPriorityExecutor, this.onExtraCallback, highPriorityExecutor.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f))), null), access13800Var);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onWarmupCompleted + 117;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.u5cExternalSyntheticLambda0$access100$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ float $handleSize;
            final /* synthetic */ v1 $sheetState;
            final /* synthetic */ HighPriorityExecutor $this_pointerInput;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(HighPriorityExecutor highPriorityExecutor, v1 v1Var, float f, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$this_pointerInput = highPriorityExecutor;
                this.$sheetState = v1Var;
                this.$handleSize = f;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_pointerInput, this.$sheetState, this.$handleSize, access13800Var);
                int i2 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onNavigationEvent(findresandmsg, access13800Var);
                }
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.u5cExternalSyntheticLambda0$access100$4$5, reason: invalid class name */
            public static final class AnonymousClass5 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ float $handleSize;
                final /* synthetic */ v1 $sheetState;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(v1 v1Var, float f, access13800<? super AnonymousClass5> access13800Var) {
                    super(2, access13800Var);
                    this.$sheetState = v1Var;
                    this.$handleSize = f;
                }

                public static /* synthetic */ Unit IAuthTabCallback(Ref.ObjectRef objectRef, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 41;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onWarmupCompleted(objectRef, handlerScheduledExecutorService2, setusecaseattached);
                    }
                    onWarmupCompleted(objectRef, handlerScheduledExecutorService2, setusecaseattached);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$sheetState, this.$handleSize, access13800Var);
                    anonymousClass5.L$0 = obj;
                    int i2 = onWarmupCompleted + 27;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass5;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 103;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallback = onExtraCallback((AudioExecutor1) obj, (access13800) obj2);
                    if (i3 == 0) {
                        int i4 = 24 / 0;
                    }
                    return objOnExtraCallback;
                }

                public final Object onExtraCallback(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 11;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = create(audioExecutor1, access13800Var).invokeSuspend(Unit.INSTANCE);
                    if (i3 != 0) {
                        int i4 = 26 / 0;
                    }
                    int i5 = onWarmupCompleted + 45;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static final Unit onWarmupCompleted(Ref.ObjectRef objectRef, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 1;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        handlerScheduledExecutorService2.onExtraCallback();
                        objectRef.element = createPostFailedException.Final;
                        return Unit.INSTANCE;
                    }
                    handlerScheduledExecutorService2.onExtraCallback();
                    objectRef.element = createPostFailedException.Final;
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
                
                    if (r0 != r9) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
                
                    if (r2 == r9) goto L66;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
                
                    if (r3 != r9) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0203, code lost:
                
                    return r9;
                 */
                /* JADX WARN: Path cross not found for [B:50:0x01a2, B:57:0x01be], limit reached: 71 */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d9 -> B:23:0x00b4). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01de -> B:34:0x0112). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted;
                    Object objIAuthTabCallback;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService2;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService22;
                    Ref.ObjectRef objectRef;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService23;
                    Ref.ObjectRef objectRef2;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService24;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService25;
                    final Ref.ObjectRef objectRef3;
                    int i = 2 % 2;
                    AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
                    Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    int i3 = 3;
                    if (i2 != 0) {
                        int i4 = onNavigationEvent + 55;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0 ? i2 == 1 : i2 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            objOnWarmupCompleted = obj;
                        } else {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                objectRef = (Ref.ObjectRef) this.L$3;
                                handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) this.L$2;
                                handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) this.L$1;
                                ResultKt.onNavigationEvent(obj);
                                objIAuthTabCallback = obj;
                                newHandlerExecutor newhandlerexecutor = (newHandlerExecutor) objIAuthTabCallback;
                                if (HandlerScheduledExecutorService.onNavigationEvent(newhandlerexecutor.asBinder(), HandlerScheduledExecutorService.Companion.onExtraCallbackWithResult())) {
                                    List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
                                    ArrayList arrayList = new ArrayList(listOnExtraCallbackWithResult.size());
                                    int size = listOnExtraCallbackWithResult.size();
                                    int i5 = 0;
                                    while (i5 < size) {
                                        Object obj2 = listOnExtraCallbackWithResult.get(i5);
                                        int i6 = i5;
                                        if (HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) obj2).onNavigationEvent(), handlerScheduledExecutorService2.onNavigationEvent())) {
                                            int i7 = onWarmupCompleted + 11;
                                            onNavigationEvent = i7 % 128;
                                            int i8 = i7 % 2;
                                            arrayList.add(obj2);
                                        }
                                        i5 = i6 + 1;
                                    }
                                    v1 v1Var = this.$sheetState;
                                    int size2 = arrayList.size();
                                    for (int i9 = 0; i9 < size2; i9++) {
                                        HandlerScheduledExecutorService2 handlerScheduledExecutorService26 = (HandlerScheduledExecutorService2) arrayList.get(i9);
                                        v1Var.onExtraCallback(handlerScheduledExecutorService26);
                                        handlerScheduledExecutorService26.onExtraCallback();
                                    }
                                }
                                List listOnExtraCallbackWithResult2 = newhandlerexecutor.onExtraCallbackWithResult();
                                if (listOnExtraCallbackWithResult2 instanceof Collection) {
                                    int i10 = onNavigationEvent + 39;
                                    onWarmupCompleted = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        listOnExtraCallbackWithResult2.isEmpty();
                                        throw null;
                                    }
                                    if (!listOnExtraCallbackWithResult2.isEmpty()) {
                                    }
                                    Object[] objArr = {this.$sheetState};
                                    v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -348646617, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 348646630);
                                    return Unit.INSTANCE;
                                }
                                Iterator it = listOnExtraCallbackWithResult2.iterator();
                                while (it.hasNext()) {
                                    int i11 = onWarmupCompleted + 23;
                                    onNavigationEvent = i11 % 128;
                                    int i12 = i11 % 2;
                                    if (((HandlerScheduledExecutorService2) it.next()).IAuthTabCallbackStub()) {
                                        i3 = 3;
                                        Object obj3 = objectRef.element;
                                        Intrinsics.checkNotNull(obj3);
                                        this.L$0 = audioExecutor1;
                                        this.L$1 = handlerScheduledExecutorService2;
                                        this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                                        this.L$3 = objectRef;
                                        this.label = i3;
                                        objIAuthTabCallback = audioExecutor1.IAuthTabCallback((createPostFailedException) obj3, this);
                                    }
                                }
                                Object[] objArr2 = {this.$sheetState};
                                v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -348646617, objArr2, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 348646630);
                                return Unit.INSTANCE;
                            }
                            objectRef3 = (Ref.ObjectRef) this.L$3;
                            handlerScheduledExecutorService25 = (HandlerScheduledExecutorService2) this.L$1;
                            ResultKt.onNavigationEvent(obj);
                            Object objOnExtraCallback = obj;
                            handlerScheduledExecutorService23 = (HandlerScheduledExecutorService2) objOnExtraCallback;
                            if (handlerScheduledExecutorService23 == null || handlerScheduledExecutorService23.IAuthTabCallback_Parcel()) {
                                HandlerScheduledExecutorService2 handlerScheduledExecutorService27 = handlerScheduledExecutorService25;
                                objectRef2 = objectRef3;
                                handlerScheduledExecutorService24 = handlerScheduledExecutorService27;
                                if (objectRef2.element != null) {
                                    Object[] objArr3 = {this.$sheetState, handlerScheduledExecutorService24};
                                    v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 103405104, objArr3, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -103405098);
                                    handlerScheduledExecutorService24.onExtraCallback();
                                    HandlerScheduledExecutorService2 handlerScheduledExecutorService28 = handlerScheduledExecutorService23;
                                    handlerScheduledExecutorService2 = handlerScheduledExecutorService24;
                                    objectRef = objectRef2;
                                    handlerScheduledExecutorService22 = handlerScheduledExecutorService28;
                                    Object obj32 = objectRef.element;
                                    Intrinsics.checkNotNull(obj32);
                                    this.L$0 = audioExecutor1;
                                    this.L$1 = handlerScheduledExecutorService2;
                                    this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                                    this.L$3 = objectRef;
                                    this.label = i3;
                                    objIAuthTabCallback = audioExecutor1.IAuthTabCallback((createPostFailedException) obj32, this);
                                }
                                return Unit.INSTANCE;
                            }
                            long jOnNavigationEvent = handlerScheduledExecutorService25.onNavigationEvent();
                            Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$tdsBottomSheetDraggable$3$1$1$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj4, Object obj5) {
                                    int i13 = 2 % 2;
                                    int i14 = onExtraCallback + 67;
                                    onExtraCallbackWithResult = i14 % 128;
                                    int i15 = i14 % 2;
                                    Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.access100.AnonymousClass4.AnonymousClass5.IAuthTabCallback(objectRef3, (HandlerScheduledExecutorService2) obj4, (setUseCaseAttached) obj5);
                                    int i16 = onExtraCallbackWithResult + 31;
                                    onExtraCallback = i16 % 128;
                                    int i17 = i16 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            this.L$0 = audioExecutor1;
                            this.L$1 = handlerScheduledExecutorService25;
                            this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService23);
                            this.L$3 = objectRef3;
                            this.label = 2;
                            objOnExtraCallback = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallback(audioExecutor1, jOnNavigationEvent, function2, this);
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        this.L$0 = audioExecutor1;
                        this.label = 1;
                        objOnWarmupCompleted = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor1, false, (createPostFailedException) null, this, 3, (Object) null);
                    }
                    handlerScheduledExecutorService24 = (HandlerScheduledExecutorService2) objOnWarmupCompleted;
                    objectRef2 = new Ref.ObjectRef();
                    Object[] objArr4 = {this.$sheetState};
                    if (!((Boolean) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1825017447, objArr4, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1825017433)).booleanValue() || Float.intBitsToFloat((int) handlerScheduledExecutorService24.IAuthTabCallback()) < this.$handleSize) {
                        objectRef2.element = createPostFailedException.Main;
                        handlerScheduledExecutorService23 = null;
                        if (objectRef2.element != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    handlerScheduledExecutorService23 = null;
                    handlerScheduledExecutorService25 = handlerScheduledExecutorService24;
                    objectRef3 = objectRef2;
                    long jOnNavigationEvent2 = handlerScheduledExecutorService25.onNavigationEvent();
                    Function2 function22 = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$tdsBottomSheetDraggable$3$1$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i13 = 2 % 2;
                            int i14 = onExtraCallback + 67;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitIAuthTabCallback = u5cExternalSyntheticLambda0.access100.AnonymousClass4.AnonymousClass5.IAuthTabCallback(objectRef3, (HandlerScheduledExecutorService2) obj4, (setUseCaseAttached) obj5);
                            int i16 = onExtraCallbackWithResult + 31;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    this.L$0 = audioExecutor1;
                    this.L$1 = handlerScheduledExecutorService25;
                    this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService23);
                    this.L$3 = objectRef3;
                    this.label = 2;
                    objOnExtraCallback = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallback(audioExecutor1, jOnNavigationEvent2, function22, this);
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                Object obj2 = null;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    HighPriorityExecutor highPriorityExecutor = this.$this_pointerInput;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$sheetState, this.$handleSize, null);
                    this.label = 1;
                    if (Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, anonymousClass5, this) == objOnWarmupCompleted) {
                        int i5 = onExtraCallbackWithResult + 55;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = onWarmupCompleted + 41;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    static final class onTransact extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(v1 v1Var, access13800<? super onTransact> access13800Var) {
            super(1, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$sheetState, access13800Var);
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((access13800) obj);
            int i4 = onExtraCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r1
          0x0042: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 81 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    v1 v1Var = this.$sheetState;
                    x1.IAuthTabCallback iAuthTabCallback = x1.IAuthTabCallback.onWarmupCompleted;
                    this.label = 1;
                    if (v1Var.IAuthTabCallback(iAuthTabCallback, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                        int i5 = onWarmupCompleted + 75;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onWarmupCompleted + 57;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i8 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onExtraCallbackWithResult(findResAndMsg findresandmsg, Function1<? super access13800<? super Unit>, ? extends Object> function1) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(function1, null), 3, (Object) null);
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1<access13800<? super Unit>, Object> $onDismissRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(Function1<? super access13800<? super Unit>, ? extends Object> function1, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$onDismissRequest = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$onDismissRequest, access13800Var);
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Function1<access13800<? super Unit>, Object> function1 = this.$onDismissRequest;
                this.label = 1;
                if (function1.invoke(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 83;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements PointerInputEventHandler {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ findResAndMsg onExtraCallback;
        final /* synthetic */ Function1<access13800<? super Unit>, Object> onNavigationEvent;

        IAuthTabCallbackStubProxy(findResAndMsg findresandmsg, Function1<? super access13800<? super Unit>, ? extends Object> function1) {
            this.onExtraCallback = findresandmsg;
            this.onNavigationEvent = function1;
        }

        public static /* synthetic */ Unit onExtraCallback(findResAndMsg findresandmsg, Function1 function1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, function1, setusecaseattached);
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            int i5 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitIAuthTabCallback;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            final findResAndMsg findresandmsg = this.onExtraCallback;
            final Function1<access13800<? super Unit>, Object> function1 = this.onNavigationEvent;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, (getBacktraceNote) null, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$Scrim$dismissModifier$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallback = u5cExternalSyntheticLambda0.IAuthTabCallbackStubProxy.onExtraCallback(findresandmsg, function1, (setUseCaseAttached) obj);
                    int i5 = onExtraCallbackWithResult + 5;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, access13800Var, 7, (Object) null);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                int i2 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 12 / 0;
                }
                return objOnNavigationEvent;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return unit;
        }

        private static final Unit IAuthTabCallback(findResAndMsg findresandmsg, Function1 function1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            u5cExternalSyntheticLambda0.IAuthTabCallback(findresandmsg, function1);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final boolean onNavigationEvent(findResAndMsg findresandmsg, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(findresandmsg, (Function1<? super access13800<? super Unit>, ? extends Object>) function1);
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $additionalAlpha;
        final /* synthetic */ v1 $sheetState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(v1 v1Var, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
            this.$additionalAlpha = isqueryrefinementenabled;
        }

        public static /* synthetic */ float IAuthTabCallback(v1 v1Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(v1Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fOnNavigationEvent = onNavigationEvent(v1Var);
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$sheetState, this.$additionalAlpha, access13800Var);
            asinterface.L$0 = obj;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r5.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r5.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r6);
            r2 = r5.$sheetState;
            o.ycxycx.onWarmupCompleted(o.ycxycx.IAuthTabCallback(o.ycxycx.onNavigationEvent(o.CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$Scrim$2$1$$ExternalSyntheticLambda0(r2))), new o.u5cExternalSyntheticLambda0.asInterface.AnonymousClass2(r5.$additionalAlpha, null)), r1);
            r6 = kotlin.Unit.INSTANCE;
            r1 = o.u5cExternalSyntheticLambda0.asInterface.onNavigationEvent + 81;
            o.u5cExternalSyntheticLambda0.asInterface.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                int i3 = 27 / 0;
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
            }
        }

        private static final float onNavigationEvent(v1 v1Var) {
            float fFloatValue;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {v1Var};
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            if (i3 != 0) {
                fFloatValue = ((Float) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 824688114, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -824688103)).floatValue() * v1Var.asInterface();
            } else {
                fFloatValue = ((Float) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 824688114, objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -824688103)).floatValue() / v1Var.asInterface();
            }
            return RangesKt.coerceIn(fFloatValue, 0.0f, 1.0f);
        }

        /* renamed from: o.u5cExternalSyntheticLambda0$asInterface$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $additionalAlpha;
            /* synthetic */ float F$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$additionalAlpha = isqueryrefinementenabled;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$additionalAlpha, access13800Var);
                anonymousClass2.F$0 = ((Number) obj).floatValue();
                int i2 = onExtraCallback + 49;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).floatValue(), (access13800) obj2);
                if (i3 != 0) {
                    int i4 = 76 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(float f, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2Create = create(Float.valueOf(f), access13800Var);
                if (i3 != 0) {
                    anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 95;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                float f = this.F$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallback + 15;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$additionalAlpha;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                    this.F$0 = f;
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, (onItemClicked) null, (Object) null, (Function1) null, this, 14, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallback + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }
    }

    private static final Unit onWarmupCompleted(v1 v1Var, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, long j, isQueryRefinementEnabled isqueryrefinementenabled, setOrientationDegrees setorientationdegrees) {
        float fOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        u7ExternalSyntheticLambda0<u5b> u7externalsyntheticlambda0IAuthTabCallback = v1Var.IAuthTabCallback();
        u5b u5bVar = u5b.Hidden;
        float fAbs = Math.abs(v1Var.IAuthTabCallback().onExtraCallbackWithResult(u5b.PartiallyExpanded) - u7externalsyntheticlambda0IAuthTabCallback.onExtraCallbackWithResult(u5bVar));
        float fIAuthTabCallbackDefault = v1Var.IAuthTabCallbackDefault() / fAbs;
        float fIntBitsToFloat = Float.intBitsToFloat((int) ((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue());
        if (fIntBitsToFloat > 0.0f) {
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                v1Var.onNavigationEvent();
                throw null;
            }
            if (v1Var.onNavigationEvent() == u5bVar) {
                fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
            } else {
                float f = 1.0f - (fIntBitsToFloat / fAbs);
                getsupportedhighspeedresolutions.onNavigationEvent(f);
                int i5 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 4;
                }
                fOnNavigationEvent = f;
            }
        } else {
            fOnNavigationEvent = 1.0f;
        }
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j, 0L, 0L, fIAuthTabCallbackDefault * RangesKt.coerceIn(fOnNavigationEvent, 0.0f, 1.0f) * ((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue(), (hasMoreElements) null, (seek) null, 0, 118, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean zOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function1 function1;
        int i3;
        final long jLongValue = ((Number) objArr[0]).longValue();
        final v1 v1Var = (v1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(v1Var, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1119752441);
        if ((iIntValue & 6) == 0) {
            i = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ^ true) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(v1Var) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            if ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i5 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i5 % 128;
                i3 = i5 % 2 != 0 ? 4039 : 256;
            } else {
                i3 = 128;
            }
            i |= i3;
        }
        int i6 = iIntValue2 & 8;
        if (i6 != 0) {
            i |= 3072;
        } else if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 2048 : 1024;
        }
        if ((i & 1171) != 1170) {
            z = true;
        } else {
            int i7 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            function1 = function12;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            i2 = iIntValue2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((iIntValue2 & 4) != 0) {
                    boolean z4 = (i & 112) == 32;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z4 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onTransact(v1Var, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    function12 = (Function1) objOnMinimized;
                    i &= -897;
                }
                if (i6 != 0) {
                    int i9 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                }
            } else {
                int i11 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 4) != 0) {
                    i &= -897;
                }
            }
            final Function1 function13 = function12;
            int i13 = i;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1119752441, i13, -1, "im.toss.tds.compose.component.compound.bottomsheet.Scrim (BasicTdsBottomSheetV2.kt:310)");
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
            final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_bottomsheet_close, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (v1Var.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-465538598);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(findresandmsg, function13);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallbackStubProxy);
                    int i16 = onExtraCallbackWithResult + 37;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 5 / 2;
                    }
                    objOnMinimized3 = iAuthTabCallbackStubProxy;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = SequentialExecutorWorkerRunningState.IAuthTabCallback(onextracallback, v1Var, (PointerInputEventHandler) objOnMinimized3);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback4 | zOnExtraCallback5) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda7
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onNavigationEvent + 17;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnWarmupCompleted = u5cExternalSyntheticLambda0.onWarmupCompleted(strOnExtraCallback, findresandmsg, function13, (useAndConfigureProgramWithTexture) obj2);
                            int i21 = onNavigationEvent + 79;
                            onWarmupCompleted = i21 % 128;
                            int i22 = i21 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, true, (Function1) objOnMinimized4);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-465179215);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                quirksExternalSyntheticBackport0IAuthTabCallback = QuirksExternalSyntheticBackport0.Companion;
            }
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            }
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized5;
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
            }
            final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized6;
            Unit unit = Unit.INSTANCE;
            int i18 = i13 & 112;
            boolean z5 = i18 == 32;
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z5 && !zOnExtraCallback6) {
                int i19 = onExtraCallbackWithResult + 27;
                i2 = iIntValue2;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                if (objOnMinimized7 != onwarmupcompleted.onExtraCallback()) {
                    obj = null;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, obj).onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
                z2 = i18 != 32;
                z3 = (i13 & 14) == 4;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z2 | z3 | zOnExtraCallback) {
                    int i21 = onNavigationEvent + 45;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 != 0) {
                        onwarmupcompleted.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport04;
                        Function1 function14 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 83;
                                onExtraCallbackWithResult = i23 % 128;
                                int i24 = i23 % 2;
                                v1 v1Var2 = v1Var;
                                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = getsupportedhighspeedresolutions;
                                long j = jLongValue;
                                isQueryRefinementEnabled isqueryrefinementenabled2 = isqueryrefinementenabled;
                                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) obj2;
                                if (i24 != 0) {
                                    u5cExternalSyntheticLambda0.onExtraCallback(v1Var2, getsupportedhighspeedresolutions2, j, isqueryrefinementenabled2, setorientationdegrees);
                                    throw null;
                                }
                                Unit unitOnExtraCallback = u5cExternalSyntheticLambda0.onExtraCallback(v1Var2, getsupportedhighspeedresolutions2, j, isqueryrefinementenabled2, setorientationdegrees);
                                int i25 = onWarmupCompleted + 57;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function14);
                        objOnMinimized8 = function14;
                    } else {
                        quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport04;
                    }
                    isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i22 = onNavigationEvent + 101;
                        onExtraCallbackWithResult = i22 % 128;
                        if (i22 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i23 = 59 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    function1 = function13;
                }
            } else {
                i2 = iIntValue2;
            }
            obj = null;
            objOnMinimized7 = new asInterface(v1Var, isqueryrefinementenabled, null);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, obj).onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback);
            if (i18 != 32) {
            }
            if ((i13 & 14) == 4) {
            }
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z2 | z3 | zOnExtraCallback) {
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        final int i24 = i2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2, Object obj3) {
                Unit unitIAuthTabCallback;
                int i25 = 2 % 2;
                int i26 = onWarmupCompleted + 111;
                IAuthTabCallback = i26 % 128;
                if (i26 % 2 != 0) {
                    unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback(jLongValue, v1Var, function1, quirksExternalSyntheticBackport02, iIntValue, i24, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i27 = 61 / 0;
                } else {
                    unitIAuthTabCallback = u5cExternalSyntheticLambda0.IAuthTabCallback(jLongValue, v1Var, function1, quirksExternalSyntheticBackport02, iIntValue, i24, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i28 = IAuthTabCallback + 77;
                onWarmupCompleted = i28 % 128;
                if (i28 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final v1 v1Var = (v1) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(v1Var, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1113671572, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomsheet.tdsBottomSheetV2NestedScrollConnection (BasicTdsBottomSheetV2.kt:374)");
        }
        if (((Boolean) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1825017447, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1825017433)).booleanValue()) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1232407316);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            int i2 = (iIntValue & 112) ^ 48;
            if (i2 > 32) {
                int i3 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                    throw null;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var)) {
                    boolean z = (iIntValue & 48) == 32;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda10
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i4 = 2 % 2;
                                int i5 = onNavigationEvent + 41;
                                onWarmupCompleted = i5 % 128;
                                int i6 = i5 % 2;
                                Boolean boolValueOf = Boolean.valueOf(u5cExternalSyntheticLambda0.onExtraCallback(v1Var));
                                int i7 = onNavigationEvent + 7;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                                return boolValueOf;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    Function0 function0 = (Function0) objOnMinimized;
                    if (i2 > 32) {
                        int i4 = onNavigationEvent + 11;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
                            throw null;
                        }
                        if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var)) {
                            boolean z2 = (iIntValue & 48) == 32;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (z2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new IAuthTabCallback_Parcel(v1Var);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                            }
                            Function1 function1 = (access5300) objOnMinimized2;
                            if (i2 > 32) {
                                int i5 = onExtraCallbackWithResult + 93;
                                onNavigationEvent = i5 % 128;
                                int i6 = i5 % 2;
                                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var)) {
                                    boolean z3 = (iIntValue & 48) == 32;
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (!z3) {
                                        int i7 = onExtraCallbackWithResult + 117;
                                        onNavigationEvent = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                            throw null;
                                        }
                                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized3 = new getInterfaceDescriptor(v1Var);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                                        }
                                        Function2 function2 = (access5300) objOnMinimized3;
                                        boolean z4 = (i2 > 32 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var)) || (iIntValue & 48) == 32;
                                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (!z4) {
                                            int i8 = onNavigationEvent + 89;
                                            onExtraCallbackWithResult = i8 % 128;
                                            int i9 = i8 % 2;
                                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized4 = new access000(v1Var);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                                            }
                                            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = updateSensorToBufferTransform.onExtraCallbackWithResult(onextracallback, new u5c(function0, function1, function2, (access5300) objOnMinimized4), (reverseSizeF) null, 2, (Object) null);
                                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1232122178);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = QuirksExternalSyntheticBackport0.Companion;
        }
        boolean z5 = (((iIntValue & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var)) || (iIntValue & 48) == 32;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z5 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized5 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 11;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    v1 v1Var2 = v1Var;
                    component4 component4Var = (component4) obj;
                    component7 component7Var = (component7) obj2;
                    VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) obj3;
                    if (i12 != 0) {
                        return u5cExternalSyntheticLambda0.onExtraCallback(v1Var2, component4Var, component7Var, virtualCameraCaptureResult);
                    }
                    u5cExternalSyntheticLambda0.onExtraCallback(v1Var2, component4Var, component7Var, virtualCameraCaptureResult);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (getBacktraceNote) objOnMinimized5));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    static final /* synthetic */ class IAuthTabCallback_Parcel extends FunctionReferenceImpl implements Function1<setUseCaseAttached, setUseCaseAttached> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback_Parcel(Object obj) {
            super(1, obj, v1.class, "onPreScroll", "onPreScroll-MK-Hz9U$tds_compose_release(J)J", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            setUseCaseAttached setusecaseattached = (setUseCaseAttached) obj;
            if (i2 % 2 != 0) {
                return setUseCaseAttached.onNavigationEvent(onExtraCallbackWithResult(setusecaseattached.onExtraCallback()));
            }
            setUseCaseAttached.onNavigationEvent(onExtraCallbackWithResult(setusecaseattached.onExtraCallback()));
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final long onExtraCallbackWithResult(long j) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            v1 v1Var = (v1) ((CallableReference) this).receiver;
            if (i3 == 0) {
                return v1Var.onNavigationEvent(j);
            }
            long jOnNavigationEvent = v1Var.onNavigationEvent(j);
            int i4 = 18 / 0;
            return jOnNavigationEvent;
        }
    }

    private static final boolean onWarmupCompleted(v1 v1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return v1Var.onExtraCallback();
        }
        v1Var.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class getInterfaceDescriptor extends FunctionReferenceImpl implements Function2<setUseCaseAttached, setUseCaseAttached, setUseCaseAttached> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        getInterfaceDescriptor(Object obj) {
            super(2, obj, v1.class, "onPostScroll", "onPostScroll-CPd-Jag$tds_compose_release(JJ)J", 0);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setUseCaseAttached setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(onExtraCallbackWithResult(((setUseCaseAttached) obj).onExtraCallback(), ((setUseCaseAttached) obj2).onExtraCallback()));
            int i4 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return setusecaseattachedOnNavigationEvent;
        }

        public final long onExtraCallbackWithResult(long j, long j2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jOnNavigationEvent = ((v1) ((CallableReference) this).receiver).onNavigationEvent(j, j2);
            int i4 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return jOnNavigationEvent;
        }
    }

    static final /* synthetic */ class access000 extends FunctionReferenceImpl implements Function1<RequestOptionConfig1, RequestOptionConfig1> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        access000(Object obj) {
            super(1, obj, v1.class, "onRelease", "onRelease-AH228Gc$tds_compose_release(J)J", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            RequestOptionConfig1 requestOptionConfig1 = (RequestOptionConfig1) obj;
            if (i2 % 2 == 0) {
                return RequestOptionConfig1.onExtraCallbackWithResult(onWarmupCompleted(requestOptionConfig1.onNavigationEvent()));
            }
            RequestOptionConfig1.onExtraCallbackWithResult(onWarmupCompleted(requestOptionConfig1.onNavigationEvent()));
            throw null;
        }

        public final long onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jLongValue = ((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 881506872, new Object[]{(v1) ((CallableReference) this).receiver, Long.valueOf(j)}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -881506863)).longValue();
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return jLongValue;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        final v1 v1Var = (v1) objArr[0];
        component4 component4Var = (component4) objArr[1];
        component7 component7Var = (component7) objArr[2];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), 0, VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()), 5, (Object) null);
        v1Var.onExtraCallback(jIAuthTabCallback);
        final int iIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(jIAuthTabCallback);
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -686488743, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 686488755)).longValue());
        v1Var.IAuthTabCallback(getstreamsharingchildrenOnExtraCallback.T_());
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.BasicTdsBottomSheetV2Kt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                Unit unit;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 73;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    unit = (Unit) u5cExternalSyntheticLambda0.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getstreamsharingchildrenOnExtraCallback, Integer.valueOf(iIAuthTabCallbackDefault), v1Var, (getStreamSharingChildren.onExtraCallbackWithResult) obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -572374882, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 572374887);
                    int i4 = 27 / 0;
                } else {
                    unit = (Unit) u5cExternalSyntheticLambda0.IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getstreamsharingchildrenOnExtraCallback, Integer.valueOf(iIAuthTabCallbackDefault), v1Var, (getStreamSharingChildren.onExtraCallbackWithResult) obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -572374882, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 572374887);
                }
                int i5 = onExtraCallbackWithResult + 125;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }, 4, (Object) null);
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return component8VarIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, int i, v1 v1Var, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.IAuthTabCallback();
        int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult(v1Var.asInterface());
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iOnExtraCallbackWithResult, (i - getstreamsharingchildren.T_()) - iOnExtraCallbackWithResult, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[PHI: r10
      0x002d: PHI (r10v11 o.CameraCaptureResultEmptyCameraCaptureResult) = (r10v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r10v12 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r10
      0x0022: PHI (r10v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r10v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r10v12 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(360633153);
            int i4 = 34 / 0;
            if (i != 0) {
                int i5 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(360633153);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(360633153, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.Preview (BasicTdsBottomSheetV2.kt:436)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(360633153, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.Preview (BasicTdsBottomSheetV2.kt:436)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) u5a.onExtraCallback(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{u5a.onWarmupCompleted}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1156965595, 1156965597), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new BasicTdsBottomSheetV2Kt$.ExternalSyntheticLambda15(i));
        }
        int i8 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 23 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return appLovinAdClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 IAuthTabCallback(v1 v1Var, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        int iRound = Math.round(Float.intBitsToFloat((int) (((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue() >> 32)));
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent((Math.round(Float.intBitsToFloat((int) ((Long) v1.IAuthTabCallback(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -1920793799, new Object[]{v1Var}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1920793803)).longValue())) & 4294967295L) | (iRound << 32)));
        int i4 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(v1 v1Var, String str, findResAndMsg findresandmsg, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, str, findresandmsg, useandconfigureprogramwithtexture}, iOnNavigationEvent, iOnNavigationEvent2, 1985353743, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1985353740);
    }

    public static /* synthetic */ Unit onNavigationEvent(v1 v1Var, long j, long j2, Function2 function2, long j3, String str, Function1 function1, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(j), Long.valueOf(j2), function2, Long.valueOf(j3), str, function1, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1276632359, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1276632357);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, int i, v1 v1Var, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getstreamsharingchildren, Integer.valueOf(i), v1Var, onextracallbackwithresult}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -572374882, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 572374887);
    }

    private static final Unit onExtraCallbackWithResult(v1 v1Var, long j, long j2, Function2 function2, getBacktraceNote getbacktracenote, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -808800208, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 808800209);
    }

    private static final Unit onExtraCallbackWithResult(v1 v1Var, long j, long j2, Function2 function2, long j3, String str, Function1 function1, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, Long.valueOf(j), Long.valueOf(j2), function2, Long.valueOf(j3), str, function1, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1518063812, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1518063820);
    }

    private static final AppLovinAdClickListener onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<AppLovinAdClickListener> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (AppLovinAdClickListener) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent, iOnNavigationEvent2, 1252117076, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1252117076);
    }

    private static final Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, fliphorizontally}, iOnNavigationEvent, iOnNavigationEvent2, -1599963873, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1599963884);
    }

    private static final Unit onNavigationEvent(v1 v1Var, String str, findResAndMsg findresandmsg, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, str, findresandmsg, useandconfigureprogramwithtexture}, iOnNavigationEvent, iOnNavigationEvent2, -1244676081, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1244676088);
    }

    public static final void onExtraCallback(long j, @NotNull v1 v1Var, @Nullable Function1<? super access13800<? super Unit>, ? extends Object> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Long.valueOf(j), v1Var, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 553339403, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -553339397);
    }

    private static final Unit onNavigationEvent(String str, findResAndMsg findresandmsg, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{str, findresandmsg, function1, useandconfigureprogramwithtexture}, iOnNavigationEvent, iOnNavigationEvent2, -2108710646, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 2108710655);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull v1 v1Var, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, v1Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -56036241, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 56036245);
    }

    private static final component8 onWarmupCompleted(v1 v1Var, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (component8) IAuthTabCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{v1Var, component4Var, component7Var, virtualCameraCaptureResult}, iOnNavigationEvent, iOnNavigationEvent2, 1895820105, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1895820095);
    }
}
