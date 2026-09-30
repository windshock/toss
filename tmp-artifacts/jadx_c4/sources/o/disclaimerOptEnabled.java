package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.disclaimerOptEnabled;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class disclaimerOptEnabled {
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private static int onTransact;
    public static final disclaimerOptEnabled onExtraCallback = new disclaimerOptEnabled();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-668868326, false, new Function2() { // from class: im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj3 = null;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 == 0) {
                disclaimerOptEnabled.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitOnWarmupCompleted = disclaimerOptEnabled.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            obj3.hashCode();
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1904734279, false, new Function2() { // from class: im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 != 0) {
                return disclaimerOptEnabled.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            disclaimerOptEnabled.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(501337076, false, new Function2() { // from class: im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt$$ExternalSyntheticLambda2
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 == 0) {
                disclaimerOptEnabled.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Unit unitOnNavigationEvent = disclaimerOptEnabled.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 39;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i2 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            function2 = onExtraCallbackWithResult;
            int i4 = 34 / 0;
        } else {
            function2 = onExtraCallbackWithResult;
        }
        int i5 = i2 + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = asInterface + 3;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asBinder + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = asBinder + 113;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-668868326, i, -1, "im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt.lambda$-668868326.<anonymous> (CreditProtectionTermsContent.kt:42)");
            }
            openStackTraceSample.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 11;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 == 0) {
                    int i8 = 60 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 27;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1904734279, i, -1, "im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt.lambda$-1904734279.<anonymous> (CreditProtectionTermsContent.kt:43)");
            }
            openStackTraceSample.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onNavigationEvent + 123;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 123;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        onNavigationEvent = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 2, i & 1)) {
            int i4 = asBinder + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asBinder + 23;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(501337076, i, -1, "im.toss.feature.credit.ui.history.list.ComposableSingletons$CreditProtectionTermsContentKt.lambda$501337076.<anonymous> (CreditProtectionTermsContent.kt:44)");
                int i7 = onNavigationEvent + 1;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
            openStackTraceSample.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = asBinder + 19;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 / 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
