package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1tSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1tSDK {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static int onTransact;
    public static final AFf1tSDK IAuthTabCallback = new AFf1tSDK();
    private static getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1567513188, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = AFf1tSDK.onWarmupCompleted((QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-751127648, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return AFf1tSDK.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            AFf1tSDK.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(416332524, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = AFf1tSDK.onExtraCallback((QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1341440823, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt$$ExternalSyntheticLambda3
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = AFf1tSDK.IAuthTabCallback((QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 56 / 0;
            }
            int i5 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 13;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i5 = i2 + 11;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onWarmupCompleted(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1084005885, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), objArr, 1084005886);
        int i5 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~((~i5) | i8 | i3);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i3);
        int i13 = (~(i5 | i7)) | (~(i7 | i6)) | i10;
        int i14 = i3 + i6 + i2 + (1787548100 * i) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i3) - 623378432) + (561581232 * i6) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i2) + ((-778043392) * i) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i3 * (-930662234)) + 656878810 + (i6 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i2 * (-930661477)) + (i * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        return i16 + ((i17 * i17) * (-1850081280)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            onTransact(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public final getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i2 + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i5 = i2 + 65;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = asInterface + 71;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            if ((i & 63) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i5 = IAuthTabCallbackDefault + 35;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i7 = IAuthTabCallbackDefault + 61;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackStub + 81;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1567513188, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$1567513188.<anonymous> (ScrollableTabRow.kt:72)");
            }
            r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean z = true;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((iIntValue & 6) == 0) {
            int i3 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i4 = IAuthTabCallbackDefault + 3;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = IAuthTabCallbackDefault + 97;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallbackStub + 3;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-751127648, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$-751127648.<anonymous> (ScrollableTabRow.kt:110)");
                    int i9 = 27 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-751127648, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$-751127648.<anonymous> (ScrollableTabRow.kt:110)");
                }
            }
            r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = IAuthTabCallbackStub + 21;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 25;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(416332524, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$416332524.<anonymous> (ScrollableTabRow.kt:136)");
                    int i6 = 32 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(416332524, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$416332524.<anonymous> (ScrollableTabRow.kt:136)");
                }
            }
            r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IAuthTabCallbackDefault + 39;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i4 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = IAuthTabCallbackStub + 67;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = IAuthTabCallbackStub + 75;
            IAuthTabCallbackDefault = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 54 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1341440823, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ComposableSingletons$ScrollableTabRowKt.lambda$1341440823.<anonymous> (ScrollableTabRow.kt:170)");
                }
                r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = IAuthTabCallbackStub + 51;
                    IAuthTabCallbackDefault = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        return (Unit) onWarmupCompleted(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1084005885, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, objArr, 1084005886);
    }

    public final getBacktraceNote<QuirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (getBacktraceNote) onWarmupCompleted(OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, 1526947607, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback, new Object[]{this}, -1526947607);
    }
}
