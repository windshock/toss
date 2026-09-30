package o;

import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AFf1qSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1qSDK {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    public static final AFf1qSDK IAuthTabCallback = new AFf1qSDK();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-462691440, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                return AFf1qSDK.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            AFf1qSDK.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(619116847, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = AFf1qSDK.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1044670483, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = AFf1qSDK.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(966680212, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt$$ExternalSyntheticLambda3
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                return (Unit) AFf1qSDK.onExtraCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(num.intValue())}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -284248527, 284248527, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
            Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(num.intValue())};
            int i3 = 93 / 0;
            return (Unit) AFf1qSDK.onExtraCallback(objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -284248527, 284248527, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 1;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i4)) | i2;
        int i9 = ~i4;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = (~(i2 | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i4 | i5));
        int i13 = i4 + i5 + i3 + ((-104759182) * i6) + ((-453318476) * i);
        int i14 = i13 * i13;
        int i15 = (i4 * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i3) + (711983104 * i6) + (1180696576 * i) + (1022754816 * i14);
        int i16 = ((i4 * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * Imgproc.COLOR_YUV2BGRA_YVYU) + (i3 * (-1431886867)) + (i6 * 722567050) + (i * (-1618605404)) + (i14 * 297664512);
        return i15 + ((i16 * i16) * (-277217280)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i4 == 0) {
            return (Unit) onExtraCallback(objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 1967632035, -1967632034, iIAuthTabCallback3);
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return unitOnTransact;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = onTransact + 33;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            function2 = onExtraCallback;
            int i4 = 0 / 0;
        } else {
            function2 = onExtraCallback;
        }
        int i5 = i3 + 71;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        int i4 = i3 + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return function2;
        }
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = onTransact + 111;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 5;
            }
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 47;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-462691440, i, -1, "im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt.lambda$-462691440.<anonymous> (SecuritiesNewRow.kt:119)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"전장이 미래다...LG화학, 차량용 필름 시장 진출", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        boolean z = true;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = asBinder + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(619116847, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt.lambda$619116847.<anonymous> (SecuritiesNewRow.kt:120)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"더팩트 · 30분 전", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onTransact + 5;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i5 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 79;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 67;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asBinder + 29;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1044670483, i, -1, "im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt.lambda$1044670483.<anonymous> (SecuritiesNewRow.kt:124)");
            }
            AFf1uSDK.onExtraCallback(1.6d, "엘지화아아아아아악", null, cameraCaptureResultEmptyCameraCaptureResult, 54, 4);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = asBinder + 29;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 37;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 81;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(966680212, i, -1, "im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt.lambda$966680212.<anonymous> (SecuritiesNewRow.kt:125)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(966680212, i, -1, "im.toss.tosssecurities.uikit.compound.news.ComposableSingletons$SecuritiesNewRowKt.lambda$966680212.<anonymous> (SecuritiesNewRow.kt:125)");
            }
            AFf1uSDK.onExtraCallback(-4.7d, "엔비디아", null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 89;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onTransact + 49;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -284248527, 284248527, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1967632035, -1967632034, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }
}
