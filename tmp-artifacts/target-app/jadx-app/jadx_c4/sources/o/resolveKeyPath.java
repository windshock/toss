package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getPrivacyDestinationUri;
import o.getSwitchMinWidth;
import o.resolveKeyPath;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class resolveKeyPath {
    public static final resolveKeyPath IAuthTabCallback = new resolveKeyPath();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 37;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSwitchMinWidth getswitchminwidth, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getswitchminwidth, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        if (i4 != 0) {
            return (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 335616064, -335616064, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        }
        throw null;
    }

    private static final Unit asBinder(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        resolvekeypath.IAuthTabCallback(function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 111;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 75 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i3 | i7;
        int i9 = (~(i4 | i5)) | i3;
        int i10 = ~i4;
        int i11 = (~(i5 | i4 | i3)) | (~(i7 | i10)) | (~((~i3) | i10));
        int i12 = i4 + i3 + i6 + (1609234610 * i2) + (1307081305 * i);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i4) - 1772093440) + (1576585830 * i3) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i6) + ((-2101346304) * i2) + (23068672 * i) + ((-2103967744) * i13);
        int i15 = (i4 * 273352028) + 245730370 + (i3 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i6 * 273352337) + (i2 * (-770635566)) + (i * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        boolean z = true;
        if (i16 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 2) {
            Function2 function2 = (Function2) objArr[0];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i17 = 2 % 2;
            int i18 = onWarmupCompleted + 69;
            int i19 = i18 % 128;
            onExtraCallback = i19;
            if (i18 % 2 == 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 3) {
                int i20 = i19 + 49;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                int i22 = onWarmupCompleted + 91;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-136277851, iIntValue, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeC.<anonymous>.<anonymous> (StepperRows.kt:436)");
                }
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onExtraCallback + 53;
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        if (i16 == 3) {
            int iIntValue2 = ((Number) objArr[0]).intValue();
            int i26 = 2 % 2;
            int i27 = onExtraCallback + 39;
            onWarmupCompleted = i27 % 128;
            int i28 = i27 % 2;
            int iOnNavigationEvent = onNavigationEvent(iIntValue2);
            int i29 = onExtraCallback + 5;
            onWarmupCompleted = i29 % 128;
            int i30 = i29 % 2;
            return Integer.valueOf(iOnNavigationEvent);
        }
        if (i16 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 5) {
            return onExtraCallback(objArr);
        }
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[0];
        final Function2 function22 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i31 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-351875236, iIntValue3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeC.<anonymous>.<anonymous> (StepperRows.kt:445)");
            }
            if (getswitchminwidth != null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1300071026);
                updateAdView.onNavigationEvent(((Boolean) getswitchminwidth.access000()).booleanValue(), IAuthTabCallback.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(1309249923, true, new getBacktraceNote() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i32 = 2 % 2;
                        int i33 = IAuthTabCallback + 65;
                        onExtraCallback = i33 % 128;
                        int i34 = i33 % 2;
                        Unit unitOnNavigationEvent = resolveKeyPath.onNavigationEvent(function22, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i35 = onExtraCallback + 113;
                        IAuthTabCallback = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i36 = 67 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 384);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1300374206);
                if (function22 == null) {
                    int i32 = onExtraCallback + 7;
                    onWarmupCompleted = i32 % 128;
                    int i33 = i32 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1300374205);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1150326212);
                    function22.invoke(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i34 = onExtraCallback + 35;
                onWarmupCompleted = i34 % 128;
                int i35 = i34 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i36 = onWarmupCompleted + 75;
                onExtraCallback = i36 % 128;
                if (i36 % 2 != 0) {
                    int i37 = 5 % 4;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit onExtraCallback(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            resolvekeypath.onExtraCallback(function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            resolvekeypath.onExtraCallback(function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getswitchminwidth, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1818146388, 1818146392, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        int i5 = onWarmupCompleted + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsBinder = asBinder(resolvekeypath, function2, function22, getswitchminwidth, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 49 / 0;
        }
        int i8 = onExtraCallback + 59;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2 != 0 ? 113 : 30;
        int i6 = i4 + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 81 / 0;
        }
        int i6 = onWarmupCompleted + 31;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSwitchMinWidth getswitchminwidth, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getswitchminwidth, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {resolvekeypath, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 972453839, -972453834, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 49;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        resolveKeyPath resolvekeypath = (resolveKeyPath) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        Function2 function22 = (Function2) objArr[2];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(resolvekeypath, function2, function22, getswitchminwidth, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(resolvekeypath, function2, function22, getswitchminwidth, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = onExtraCallback + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1014958367, 1014958369, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        int i5 = onExtraCallback + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(function2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(resolvekeypath, function2, function22, getswitchminwidth, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 101;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    private resolveKeyPath() {
    }

    public final ResourceManagerInternalResourceManagerHooks onWarmupCompleted() {
        int i = 2 % 2;
        getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
        ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnNavigationEvent = ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(onQueryRefine.onExtraCallback(900, 30, getcalltoactionbutton.onExtraCallback()), new Function1() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {Integer.valueOf(((Integer) obj).intValue())};
                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                Integer numValueOf = Integer.valueOf(((Integer) resolveKeyPath.onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 828227853, -828227850, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).intValue());
                int i5 = IAuthTabCallback + 71;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return numValueOf;
            }
        }).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallback(300, 30, getcalltoactionbutton.onTransact()), 0.0f, 2, (Object) null));
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return resourceManagerInternalResourceManagerHooksOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 107;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallback + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(19702691, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeA.<anonymous>.<anonymous> (StepperRows.kt:338)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onWarmupCompleted + 65;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
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

    private static final Unit IAuthTabCallback(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1465230465, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeA.<anonymous>.<anonymous>.<anonymous> (StepperRows.kt:352)");
        }
        if (function2 == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(928189528);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-662795063);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            int i5 = onExtraCallback + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i7 = onExtraCallback + 115;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 47;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[0];
        final Function2 function2 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 3) != 2) {
            int i5 = i3 + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-195894694, iIntValue, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeA.<anonymous>.<anonymous> (StepperRows.kt:347)");
            }
            if (getswitchminwidth != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(961783476);
                updateAdView.onNavigationEvent(((Boolean) getswitchminwidth.access000()).booleanValue(), IAuthTabCallback.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(1465230465, true, new getBacktraceNote() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 17;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            resolveKeyPath.onWarmupCompleted(function2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = resolveKeyPath.onWarmupCompleted(function2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i9 = onExtraCallback + 65;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 87 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(962086656);
                if (function2 == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(962086655);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i7 = onExtraCallback + 1;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(723771714);
                    function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 109;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 42 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit2 = Unit.INSTANCE;
        int i11 = onExtraCallback + 105;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        int i4;
        int i5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fOnExtraCallbackWithResult;
        float fIAuthTabCallback;
        long jLongValue;
        int i6;
        getSwitchMinWidth<Boolean> getswitchminwidth2 = getswitchminwidth;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(7940717);
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                i6 = 2;
            } else {
                int i8 = onWarmupCompleted + 99;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                function23 = function22;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 16 : 32;
            }
            i4 = i2 & 4;
            Object obj = null;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                int i11 = onWarmupCompleted + 21;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth2);
                    obj.hashCode();
                    throw null;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth2)) {
                    i5 = 128;
                } else {
                    int i12 = onWarmupCompleted + 19;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 256;
                }
                i3 |= i5;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i10 != 0) {
                    int i14 = onExtraCallback + 105;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    function23 = null;
                }
                if (i4 != 0) {
                    getswitchminwidth2 = null;
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(7940717, i3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeA (StepperRows.kt:317)");
                }
                if (Float.isNaN(((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult())) {
                    int i16 = onExtraCallback + 103;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-958896206);
                        ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).IAuthTabCallback();
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-958896206);
                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-958894893);
                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() <= 1.4f) {
                    int i17 = onExtraCallback + 113;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 51 / 0;
                        fIAuthTabCallback = function23 == null ? (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f))) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    } else if (function23 == null) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, fIAuthTabCallback, 0.0f, 0.0f, 13, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i19 = onExtraCallback + 123;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
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
                    accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName interfaceDescriptor = appLovinPostbackService.getInterfaceDescriptor();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent(interfaceDescriptor, jIsEngagementSignalsApiAvailable, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null));
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(19702691, true, new TdsStepperRowV1CenterScope$.ExternalSyntheticLambda9(function2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    int i21 = accessgetCameraFactoryp.onNavigationEvent | 48;
                    setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i21);
                    accessisMonitoringp accessismonitoringpOnWarmupCompleted2 = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                    getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(250821642);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(250822602);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted2.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablename, jLongValue, 0L, isrepeatingenabled.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), ForwardingCameraControl.onExtraCallback(-195894694, true, new TdsStepperRowV1CenterScope$.ExternalSyntheticLambda10(getswitchminwidth2, function23), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i21);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            getSwitchMinWidth<Boolean> getswitchminwidth3 = getswitchminwidth2;
            Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24 = function23;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsStepperRowV1CenterScope$.ExternalSyntheticLambda11(this, function2, function24, getswitchminwidth3, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        function23 = function22;
        i4 = i2 & 4;
        Object obj2 = null;
        if (i4 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        getSwitchMinWidth<Boolean> getswitchminwidth32 = getswitchminwidth2;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function242 = function23;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 123;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-58287580, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeB.<anonymous>.<anonymous> (StepperRows.kt:387)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-58287580, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeB.<anonymous>.<anonymous> (StepperRows.kt:387)");
                int i6 = onExtraCallback + 11;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallback + 49;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1387240194, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeB.<anonymous>.<anonymous>.<anonymous> (StepperRows.kt:401)");
        }
        if (function2 == null) {
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1097333303);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1697965834);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onWarmupCompleted + 47;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = 75 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getSwitchMinWidth getswitchminwidth, final Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-273884965, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeB.<anonymous>.<anonymous> (StepperRows.kt:396)");
            }
            if (getswitchminwidth != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1130927251);
                updateAdView.onNavigationEvent(((Boolean) getswitchminwidth.access000()).booleanValue(), IAuthTabCallback.onWarmupCompleted(), ForwardingCameraControl.onExtraCallback(1387240194, true, new getBacktraceNote() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit unitOnExtraCallback;
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 23;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            unitOnExtraCallback = resolveKeyPath.onExtraCallback(function2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i7 = 40 / 0;
                        } else {
                            unitOnExtraCallback = resolveKeyPath.onExtraCallback(function2, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i8 = onExtraCallbackWithResult + 125;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384);
                int i5 = onExtraCallback + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1131230431);
                if (function2 == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1131230430);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1210434685);
                    function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 93;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fOnExtraCallbackWithResult;
        float fIAuthTabCallback;
        long jLongValue;
        final resolveKeyPath resolvekeypath = (resolveKeyPath) objArr[0];
        final Function2 function2 = (Function2) objArr[1];
        final Function2 function22 = (Function2) objArr[2];
        final getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-70049554);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        int i4 = iIntValue2 & 2;
        if (i4 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 32 : 16;
        }
        int i5 = iIntValue2 & 4;
        Object obj = null;
        if (i5 == 0) {
            if ((iIntValue & 384) == 0) {
                int i6 = onExtraCallback + 123;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                    obj.hashCode();
                    throw null;
                }
                i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth) ? 128 : 256) | i;
            }
            if ((i2 & 147) == 146) {
                int i7 = onWarmupCompleted + 39;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                int i9 = onWarmupCompleted + 77;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i4 != 0) {
                    function22 = null;
                }
                if (i5 != 0) {
                    getswitchminwidth = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-70049554, i2, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeB (StepperRows.kt:366)");
                }
                if (Float.isNaN(((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult())) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1401864691);
                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1401866004);
                    fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i11 = onWarmupCompleted + 31;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 65 / 0;
                    if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() <= 1.4f) {
                        if (function22 != null) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                        } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f))) {
                            int i13 = onWarmupCompleted + 1;
                            onExtraCallback = i13 % 128;
                            fIAuthTabCallback = i13 % 2 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                        } else {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, fIAuthTabCallback, 0.0f, 0.0f, 13, (Object) null);
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i14 = onWarmupCompleted + 101;
                            onExtraCallback = i14 % 128;
                            if (i14 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                int i15 = 64 / 0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            }
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
                        accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                        AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                        getHumanReadableName gethumanreadablenameAccess100 = appLovinPostbackService.access100();
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablenameAccess100, jIsEngagementSignalsApiAvailable, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null));
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-58287580, true, new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i16 = 2 % 2;
                                int i17 = IAuthTabCallback + 33;
                                onExtraCallback = i17 % 128;
                                int i18 = i17 % 2;
                                Unit unitIAuthTabCallback = resolveKeyPath.IAuthTabCallback(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i19 = onExtraCallback + 13;
                                IAuthTabCallback = i19 % 128;
                                int i20 = i19 % 2;
                                return unitIAuthTabCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        int i16 = accessgetCameraFactoryp.onNavigationEvent | 48;
                        setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16);
                        accessisMonitoringp accessismonitoringpOnWarmupCompleted2 = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                        getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            int i17 = onExtraCallback + 87;
                            onWarmupCompleted = i17 % 128;
                            if (i17 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1683384757);
                                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 103).ICustomTabsService();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1683384757);
                                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1683383797);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted2.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablename, jLongValue, 0L, isrepeatingenabled.asBinder(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), ForwardingCameraControl.onExtraCallback(-273884965, true, new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda1
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i18 = 2 % 2;
                                int i19 = onWarmupCompleted + 55;
                                onExtraCallbackWithResult = i19 % 128;
                                int i20 = i19 % 2;
                                getSwitchMinWidth getswitchminwidth2 = getswitchminwidth;
                                if (i20 != 0) {
                                    return resolveKeyPath.onNavigationEvent(getswitchminwidth2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                }
                                resolveKeyPath.onNavigationEvent(getswitchminwidth2, function22, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() <= 1.4f) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = onNavigationEvent + 87;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    resolveKeyPath resolvekeypath2 = this.f$0;
                    Function2 function23 = function2;
                    Function2 function24 = function22;
                    getSwitchMinWidth getswitchminwidth2 = getswitchminwidth;
                    int i21 = iIntValue;
                    int i22 = iIntValue2;
                    int iIntValue3 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {resolvekeypath2, function23, function24, getswitchminwidth2, Integer.valueOf(i21), Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue3)};
                    int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                    Unit unit = (Unit) resolveKeyPath.onExtraCallback(objArr2, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 171759125, -171759124, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
                    int i23 = IAuthTabCallback + 97;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    return unit;
                }
            });
            return null;
        }
        i |= 384;
        i2 = i;
        if ((i2 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit IAuthTabCallbackStub(Function2 function2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1309249923, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeC.<anonymous>.<anonymous>.<anonymous> (StepperRows.kt:450)");
        }
        if (function2 == null) {
            int i5 = onWarmupCompleted + 61;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1266477078);
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1266477078);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-236240565);
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onWarmupCompleted + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 3;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23;
        int i4;
        int i5;
        final getSwitchMinWidth<Boolean> getswitchminwidth2;
        int i6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fOnExtraCallbackWithResult;
        float fIAuthTabCallback;
        long jLongValue;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-148039825);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function23 = function22;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23)) {
                    i4 = 16;
                } else {
                    int i9 = onExtraCallback + 99;
                    onWarmupCompleted = i9 % 128;
                    i4 = i9 % 2 == 0 ? 86 : 32;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    getswitchminwidth2 = getswitchminwidth;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth2)) {
                        int i10 = onWarmupCompleted + 5;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i3 |= i6;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                    Object obj = null;
                    if (i8 != 0) {
                        function23 = null;
                    }
                    if (i5 != 0) {
                        getswitchminwidth2 = null;
                    }
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-148039825, i3, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope.TypeC (StepperRows.kt:415)");
                    }
                    if (Float.isNaN(((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult())) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-532341708);
                        fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).IAuthTabCallback();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-532340395);
                        fOnExtraCallbackWithResult = ((getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult())).onExtraCallbackWithResult();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() <= 1.4f) {
                        int i12 = onWarmupCompleted + 87;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            throw null;
                        }
                        if (function23 != null) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                        } else if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f))) {
                            int i13 = onWarmupCompleted + 37;
                            onExtraCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                                int i14 = 55 / 0;
                            } else {
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                            }
                        } else {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, fIAuthTabCallback, 0.0f, 0.0f, 13, (Object) null);
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i15 = onExtraCallback + 109;
                            onWarmupCompleted = i15 % 128;
                            if (i15 % 2 == 0) {
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                        AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                        getHumanReadableName interfaceDescriptor = appLovinPostbackService.getInterfaceDescriptor();
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                        long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent(interfaceDescriptor, jIsEngagementSignalsApiAvailable, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null));
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-136277851, true, new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i16 = 2 % 2;
                                int i17 = IAuthTabCallback + 81;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                                Unit unitOnWarmupCompleted = resolveKeyPath.onWarmupCompleted(function2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                if (i18 != 0) {
                                    int i19 = 21 / 0;
                                }
                                return unitOnWarmupCompleted;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        int i16 = accessgetCameraFactoryp.onNavigationEvent | 48;
                        setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16);
                        accessisMonitoringp accessismonitoringpOnWarmupCompleted2 = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            int i17 = onExtraCallback + 109;
                            onWarmupCompleted = i17 % 128;
                            if (i17 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(677376140);
                                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 62).ICustomTabsService();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(677376140);
                                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(677377100);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                            int i18 = onWarmupCompleted + 1;
                            onExtraCallback = i18 % 128;
                            int i19 = i18 % 2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted2.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablenameIAuthTabCallback_Parcel, jLongValue, 0L, isrepeatingenabled.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), ForwardingCameraControl.onExtraCallback(-351875236, true, new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda7
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i20 = 2 % 2;
                                int i21 = onNavigationEvent + 13;
                                IAuthTabCallback = i21 % 128;
                                if (i21 % 2 != 0) {
                                    resolveKeyPath.IAuthTabCallback(getswitchminwidth2, function23, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = resolveKeyPath.IAuthTabCallback(getswitchminwidth2, function23, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i22 = onNavigationEvent + 5;
                                IAuthTabCallback = i22 % 128;
                                int i23 = i22 % 2;
                                return unitIAuthTabCallback;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i16);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i20 = onExtraCallback + 97;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                final getSwitchMinWidth<Boolean> getswitchminwidth3 = getswitchminwidth2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24 = function23;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1CenterScope$$ExternalSyntheticLambda8
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i22 = 2 % 2;
                            int i23 = onWarmupCompleted + 3;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitOnExtraCallbackWithResult = resolveKeyPath.onExtraCallbackWithResult(this.f$0, function2, function24, getswitchminwidth3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i25 = onWarmupCompleted + 35;
                            onExtraCallback = i25 % 128;
                            if (i25 % 2 == 0) {
                                int i26 = 20 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            getswitchminwidth2 = getswitchminwidth;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            }
            final getSwitchMinWidth getswitchminwidth32 = getswitchminwidth2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function23 = function22;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        getswitchminwidth2 = getswitchminwidth;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
        }
        final getSwitchMinWidth getswitchminwidth322 = getswitchminwidth2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ int IAuthTabCallback(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return ((Integer) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 828227853, -828227850, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).intValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(resolveKeyPath resolvekeypath, Function2 function2, Function2 function22, getSwitchMinWidth getswitchminwidth, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {resolvekeypath, function2, function22, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 171759125, -171759124, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    private static final Unit onWarmupCompleted(getSwitchMinWidth getswitchminwidth, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getswitchminwidth, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1818146388, 1818146392, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    private static final Unit onTransact(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1014958367, 1014958369, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallbackStub(getSwitchMinWidth getswitchminwidth, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getswitchminwidth, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 335616064, -335616064, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final void onWarmupCompleted(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getSwitchMinWidth<Boolean> getswitchminwidth, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, function2, function22, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        onExtraCallback(objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 972453839, -972453834, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }
}
