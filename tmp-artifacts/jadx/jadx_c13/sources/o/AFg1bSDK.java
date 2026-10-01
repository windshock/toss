package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1bSDK;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.UtilsKtExternalSyntheticLambda17;
import o.getViewTypeCount;
import o.setVisitUrl;
import o.toPreviewOnlyRange;
import o.w5a;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1bSDK {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final AFg1bSDK onNavigationEvent = new AFg1bSDK();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-976979269, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda2
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onNavigationEvent = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                AFg1bSDK.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = AFg1bSDK.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            int i3 = onNavigationEvent + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-2104912704, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = AFg1bSDK.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });
    private static setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-497586206, false, new setTaggedAddrCtrl() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda4
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.setTaggedAddrCtrl
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = AFg1bSDK.onWarmupCompleted((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<MeteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-543127616, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda5
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = AFg1bSDK.onExtraCallbackWithResult((MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(1172031253, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda6
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer numValueOf = Integer.valueOf(((Integer) obj2).intValue());
            if (i3 != 0) {
                unit = (Unit) AFg1bSDK.onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, setVisitUrl.onExtraCallbackWithResult(), -1382498488, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1382498488);
                int i4 = 6 / 0;
            } else {
                unit = (Unit) AFg1bSDK.onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, setVisitUrl.onExtraCallbackWithResult(), -1382498488, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1382498488);
            }
            int i5 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        if (i3 != 0) {
            return (Unit) onWarmupCompleted(objArr2, setVisitUrl.onExtraCallbackWithResult(), -2119434104, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 2119434105);
        }
        int i4 = 17 / 0;
        return (Unit) onWarmupCompleted(objArr2, setVisitUrl.onExtraCallbackWithResult(), -2119434104, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 2119434105);
    }

    public static /* synthetic */ Unit onExtraCallback(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 79;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            function2 = onWarmupCompleted;
            int i4 = 12 / 0;
        } else {
            function2 = onWarmupCompleted;
        }
        int i5 = i2 + 97;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 11;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsBinder = asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        int i6 = asInterface + 103;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = IAuthTabCallbackStub + 83;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i6 | i);
        int i8 = (~i2) | (~i);
        int i9 = (~i8) | i6;
        int i10 = (~(i | i2)) | (~((~i6) | i2)) | (~(i8 | i6));
        int i11 = i2 + i6 + i4 + ((-101282902) * i3) + ((-829309908) * i5);
        int i12 = i11 * i11;
        int i13 = (i2 * 1745018779) + 1790267665 + (i6 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (1745018721 * i4) + ((-1587019414) * i3) + ((-1871011668) * i5) + (i12 * 1017511936);
        int i14 = ((i2 * 42798203) - 224002048) + (42798203 * i6) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i4) + (1710751744 * i3) + ((-1643118592) * i5) + ((-1134166016) * i12) + (i13 * i13 * (-1139146752));
        if (i14 != 1) {
            return i14 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i15 = 2 % 2;
        int i16 = IAuthTabCallbackStub + 21;
        asInterface = i16 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i16 % 2 != 0 ? (iIntValue & 3) != 2 : (iIntValue & 2) != 5, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i17 = IAuthTabCallbackStub + 55;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1172031253, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$1172031253.<anonymous> (BasicTossSecTopSheet.kt:330)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            AFg1gSDK aFg1gSDKOnWarmupCompleted = AFg1fSDK.onWarmupCompleted(null, null, null, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 63);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f)), onextracallbackwithresult.onExtraCallback());
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i19 = asInterface + 93;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i21 = 2 % 2;
                        int i22 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        Unit unitOnWarmupCompleted = AFg1bSDK.onWarmupCompleted();
                        if (i23 != 0) {
                            int i24 = 28 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Show", null, null, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 1572870, 958}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            if (((Boolean) AFg1gSDK.IAuthTabCallback(2025873715, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -2025873708, new Object[]{aFg1gSDKOnWarmupCompleted}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(688278366);
                AFg1cSDK.onNavigationEvent(aFg1gSDKOnWarmupCompleted, null, null, 0L, 0L, 0.0f, null, null, null, null, onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 0, 6, 1022);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(688581081);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 59;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i3 + 7;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onTransact;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 105;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = asInterface + 83;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-976979269, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-976979269.<anonymous> (BasicTossSecTopSheet.kt:80)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-976979269, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-976979269.<anonymous> (BasicTossSecTopSheet.kt:80)");
            }
            AFg1hSDKCompanion.onNavigationEvent.IAuthTabCallback(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackStub + 13;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i5 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = asInterface + 65;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 81 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        if (i3 % 2 == 0 ? (i & 3) == 2 : (i & 4) == 5) {
            z = false;
        } else {
            int i5 = i4 + 47;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackStub + 125;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2104912704, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-2104912704.<anonymous> (BasicTossSecTopSheet.kt:126)");
                int i9 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
            }
            AFg1hSDKCompanion.onNavigationEvent.IAuthTabCallback(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 4;
            } else {
                int i5 = asInterface + 125;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i7 = asInterface + 43;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackStub + 49;
                asInterface = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-869134177, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-497586206.<anonymous>.<anonymous> (BasicTossSecTopSheet.kt:352)");
                    int i10 = 36 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-869134177, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-497586206.<anonymous>.<anonymous> (BasicTossSecTopSheet.kt:352)");
                }
            }
            w5aVar.onExtraCallbackWithResult("Item " + (i + 1), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, final int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16);
            int i7 = IAuthTabCallbackStub + 5;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i3 = i2;
        }
        if ((i3 & 145) != 144) {
            int i9 = asInterface + 7;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i11 = asInterface + 93;
            IAuthTabCallbackStub = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-497586206, i3, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-497586206.<anonymous> (BasicTossSecTopSheet.kt:352)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-869134177, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.getBacktraceNote
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 == 0) {
                        AFg1bSDK.onExtraCallback(i, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallback = AFg1bSDK.onExtraCallback(i, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i14 = onWarmupCompleted + 79;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 18 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = IAuthTabCallbackStub + 99;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, 20, (Function1) null, (Function1) null, IAuthTabCallback, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 67;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            z = (i & 27) != 85;
        } else {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 65;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543127616, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-543127616.<anonymous> (BasicTossSecTopSheet.kt:350)");
                    int i5 = 45 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543127616, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt.lambda$-543127616.<anonymous> (BasicTossSecTopSheet.kt:350)");
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$BasicTossSecTopSheetKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 1;
                        onExtraCallback = i7 % 128;
                        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) obj;
                        if (i7 % 2 == 0) {
                            return AFg1bSDK.onNavigationEvent(audioRestrictionControllerImplExternalSyntheticLambda0);
                        }
                        AFg1bSDK.onNavigationEvent(audioRestrictionControllerImplExternalSyntheticLambda0);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 805306368, 511);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asInterface + 57;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, setVisitUrl.onExtraCallbackWithResult(), -1382498488, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 1382498488);
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, setVisitUrl.onExtraCallbackWithResult(), -2119434104, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), 2119434105);
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        return (Function2) onWarmupCompleted(new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), 740896217, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -740896215);
    }
}
