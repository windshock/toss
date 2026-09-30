package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TimeoutCompanionNONE1;
import o.addAnimatorListener;
import o.setSurfaceAspectRatio;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addAnimatorListener {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    public static final addAnimatorListener onWarmupCompleted = new addAnimatorListener();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1964177481, false, new Function2() { // from class: im.toss.compose.ComposableSingletons$ScaffoldKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 == 0) {
                return addAnimatorListener.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            addAnimatorListener.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1309331289, false, new Function2() { // from class: im.toss.compose.ComposableSingletons$ScaffoldKt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = addAnimatorListener.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<setSurfaceAspectRatio, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(772132474, false, new getBacktraceNote() { // from class: im.toss.compose.ComposableSingletons$ScaffoldKt$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(setSurfaceAspectRatio) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Unit unit = (Unit) addAnimatorListener.onWarmupCompleted(objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1982875461, 1982875461);
            int i4 = onExtraCallback + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return unit;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(502314695, false, new Function2() { // from class: im.toss.compose.ComposableSingletons$ScaffoldKt$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Unit unit = (Unit) addAnimatorListener.onWarmupCompleted(objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1988102775, 1988102776);
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = asInterface + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setSurfaceAspectRatio setsurfaceaspectratio = (setSurfaceAspectRatio) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(setsurfaceaspectratio, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setsurfaceaspectratio, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onTransact + 95;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i6) | i5));
        int i11 = (~(i4 | i6)) | (~(i7 | i4)) | (~i8);
        int i12 = i5 + i6 + i3 + ((-953487067) * i) + ((-1992133889) * i2);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i5) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i3) + ((-1703411712) * i) + (1961361408 * i2) + (907935744 * i13);
        int i15 = ((i5 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i3 * 272662391) + (i * 2077717299) + (i2 * 1957688713) + (i13 * 166854656);
        return i14 + ((i15 * i15) * (-213778432)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i2 + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i2 + 11;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<setSurfaceAspectRatio, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i2 + 31;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = asBinder + 61;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 99;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onTransact + 19;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onTransact + 73;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1964177481, i, -1, "im.toss.compose.ComposableSingletons$ScaffoldKt.lambda$-1964177481.<anonymous> (Scaffold.kt:33)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = asInterface + 53;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 77;
            asInterface = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = onTransact + 63;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1309331289, i, -1, "im.toss.compose.ComposableSingletons$ScaffoldKt.lambda$-1309331289.<anonymous> (Scaffold.kt:35)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asInterface + 77;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 != 0) {
                    int i8 = 54 / 0;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(setSurfaceAspectRatio setsurfaceaspectratio, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 111;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setsurfaceaspectratio, "");
            if ((i & 92) == 0) {
                int i4 = onTransact + 89;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setsurfaceaspectratio) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setsurfaceaspectratio, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i6 = asInterface + 17;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asInterface + 67;
                onTransact = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(772132474, i, -1, "im.toss.compose.ComposableSingletons$ScaffoldKt.lambda$772132474.<anonymous> (Scaffold.kt:36)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(772132474, i, -1, "im.toss.compose.ComposableSingletons$ScaffoldKt.lambda$772132474.<anonymous> (Scaffold.kt:36)");
            }
            MeteringPointFactory.onWarmupCompleted(setsurfaceaspectratio, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onTransact + 61;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 3) == 2), i & 1)) {
            int i5 = asInterface + 109;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 113;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(502314695, i, -1, "im.toss.compose.ComposableSingletons$ScaffoldKt.lambda$502314695.<anonymous> (Scaffold.kt:37)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onTransact + 15;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(setSurfaceAspectRatio setsurfaceaspectratio, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {setsurfaceaspectratio, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1982875461, 1982875461);
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(objArr, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, -1988102775, 1988102776);
    }
}
