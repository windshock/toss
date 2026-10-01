package o;

import androidx.compose.ui.semantics.Role;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.oExternalSyntheticLambda0;
import o.r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us IAuthTabCallback = new r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(112725215, false, new Function2() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 == 0) {
                r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return unitOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCallback();
            throw null;
        }
        Unit unitExtraCallback = extraCallback();
        int i3 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady();
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit typedObject = readTypedObject();
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityResized();
        }
        onActivityResized();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onPostMessage();
        }
        onPostMessage();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return unitOnActivityLayout;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1910263758, 1910263760, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult();
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized();
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnMinimized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return access100();
        }
        access100();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return function2;
    }

    static {
        int i = onWarmupCompleted + 123;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    private static final Unit access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit readTypedObject() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 18 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return unit;
    }

    private static final Unit onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onActivityResized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unit;
    }

    private static final Unit extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 117;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(112725215, i, -1, "im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt.lambda$112725215.<anonymous> (TdsTextButtonV1.kt:531)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    Object obj = null;
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 71;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnExtraCallbackWithResult = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onExtraCallbackWithResult();
                        if (i11 != 0) {
                            int i12 = 30 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 245758);
            oExternalSyntheticLambda0.IAuthTabCallback.onExtraCallback onextracallback = oExternalSyntheticLambda0.IAuthTabCallback.Companion;
            oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2 = onextracallback.IAuthTabCallback();
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 107;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnWarmupCompleted = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onWarmupCompleted();
                        int i12 = onExtraCallbackWithResult + 73;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallback2, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized2, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 24582, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallback.onExtraCallback();
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        Unit unit = (Unit) r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2000122392, -2000122391, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
                        int i12 = onWarmupCompleted + 121;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnExtraCallback, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized3, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 24582, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onextracallback.onNavigationEvent(onextracallback.IAuthTabCallback(), onextracallback.onExtraCallback());
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 33;
                        onWarmupCompleted = i10 % 128;
                        Object obj2 = null;
                        if (i10 % 2 != 0) {
                            r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.asInterface();
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitAsInterface = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.asInterface();
                        int i11 = onWarmupCompleted + 75;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            return unitAsInterface;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnNavigationEvent, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized4, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback3 = onextracallback.IAuthTabCallback();
            oExternalSyntheticLambda0.onNavigationEvent onnavigationevent = oExternalSyntheticLambda0.onNavigationEvent.Bottom;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 7;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        Unit unit = (Unit) r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1925308067, -1925308067, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
                        int i12 = IAuthTabCallback + 73;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("(inline) 텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallback3, 0L, onnavigationevent, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized5, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 1597446, 24576, 245678);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 85;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnExtraCallback = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onExtraCallback();
                        int i12 = onExtraCallback + 3;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                int i9 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized6, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 245758);
            oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback4 = onextracallback.IAuthTabCallback();
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized7 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitIAuthTabCallbackStub = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.IAuthTabCallbackStub();
                        if (i13 == 0) {
                            int i14 = 24 / 0;
                        }
                        return unitIAuthTabCallbackStub;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                int i11 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallback4, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized7, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 24582, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnExtraCallback2 = onextracallback.onExtraCallback();
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized8 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 75;
                        onExtraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr = new Object[0];
                        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        if (i15 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unit = (Unit) r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent(iOnNavigationEvent3, iOnNavigationEvent4, -59988535, 59988538, objArr, iOnNavigationEvent, iOnNavigationEvent2);
                        int i16 = onExtraCallback + 93;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnExtraCallback2, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized8, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 24582, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = onextracallback.onNavigationEvent(onextracallback.IAuthTabCallback(), onextracallback.onExtraCallback());
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized9 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda11
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 97;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 == 0) {
                            r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.getInterfaceDescriptor();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit interfaceDescriptor = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.getInterfaceDescriptor();
                        int i15 = onNavigationEvent + 9;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        return interfaceDescriptor;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnNavigationEvent2, 0L, (oExternalSyntheticLambda0.onNavigationEvent) null, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized9, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 24576, 245742);
            oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback5 = onextracallback.IAuthTabCallback();
            oExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = oExternalSyntheticLambda0.onNavigationEvent.Right;
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized10 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda12
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 21;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                        Unit unit = (Unit) r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -930919991, 930919995, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
                        int i16 = onNavigationEvent + 37;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 46 / 0;
                        }
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("블록 텍스트 버튼\n두 줄", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallback5, 0L, onnavigationevent2, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized10, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 1597446, 24576, 245678);
            oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback6 = onextracallback.IAuthTabCallback();
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized11 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 97;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent();
                        }
                        r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.onNavigationEvent();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("인라인 텍스트 버튼\n두 줄", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, IAuthTabCallback6, 0L, onnavigationevent, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized11, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 1597446, 24576, 245678);
            oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallbackOnNavigationEvent3 = onextracallback.onNavigationEvent(onextracallback.IAuthTabCallback(), onextracallback.onExtraCallback());
            Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized12 = new Function0() { // from class: im.toss.tds.compose.component.atom.textbutton.ComposableSingletons$TdsTextButtonV1Kt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i13 = 2 % 2;
                        int i14 = IAuthTabCallback + 105;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitIAuthTabCallback = r8lambdaDTvcCbM00GfL6vhIvhD78yZ0Us.IAuthTabCallback();
                        int i16 = onNavigationEvent + 31;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
            }
            oExternalSyntheticLambda1.IAuthTabCallback("텍스트 버튼", (QuirksExternalSyntheticBackport0) null, 0L, (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, iAuthTabCallbackOnNavigationEvent3, 0L, onnavigationevent, 0L, (getHumanReadableName) null, (createCameraCaptureCallback) null, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0<Unit>) objOnMinimized12, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 24576, 245678);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i8 | i5));
        int i10 = ~((~i5) | i3 | i4);
        int i11 = i9 | i10;
        int i12 = (~(i5 | i8 | i3)) | i10;
        int i13 = i3 | i4;
        int i14 = i3 + i4 + i6 + ((-1865910757) * i) + ((-1665280692) * i2);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-906343980)) - 215482368) + ((-906343980) * i4) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i6) + ((-1540882432) * i) + ((-912261120) * i2) + (1566179328 * i15);
        int i17 = (i3 * (-52584228)) + 761582770 + (i4 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i6 * (-52583813)) + (i * (-195242759)) + (i2 * 1657508740) + (i15 * (-834797568));
        int i18 = i16 + (i17 * i17 * 1251344384);
        if (i18 == 1) {
            int i19 = 2 % 2;
            int i20 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            Unit unitICustomTabsCallback = ICustomTabsCallback();
            int i22 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            return unitICustomTabsCallback;
        }
        if (i18 == 2) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            return onExtraCallback(objArr);
        }
        int i24 = 2 % 2;
        int i25 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i25 % 128;
        int i26 = i25 % 2;
        Unit unitWriteTypedObject = writeTypedObject();
        int i27 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i27 % 128;
        int i28 = i27 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onTransact() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2000122392, -2000122391, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -59988535, 59988538, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit asBinder() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -930919991, 930919995, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit access000() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1925308067, -1925308067, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
    }

    private static final Unit IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1910263758, 1910263760, new Object[0], iOnNavigationEvent, iOnNavigationEvent2);
    }
}
