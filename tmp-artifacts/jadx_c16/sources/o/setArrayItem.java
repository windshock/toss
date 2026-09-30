package o;

import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdSettingActivityKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getViewTypeCount;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setArrayItem {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onTransact = 1;
    public static final setArrayItem onWarmupCompleted = new setArrayItem();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1295465847, false, new ComposableSingletons$MobileIdSettingActivityKt$.ExternalSyntheticLambda0());
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1909455232, false, new ComposableSingletons$MobileIdSettingActivityKt$.ExternalSyntheticLambda1());
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1414566092, false, new ComposableSingletons$MobileIdSettingActivityKt$.ExternalSyntheticLambda2());

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 71;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 5) == 4) {
            z = false;
        } else {
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1295465847, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdSettingActivityKt.lambda$1295465847.<anonymous> (MobileIdSettingActivity.kt:217)");
                int i7 = asBinder + 23;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = asBinder + 7;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1414566092, i2, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdSettingActivityKt.lambda$-1414566092.<anonymous> (MobileIdSettingActivity.kt:289)");
            }
            w3bVar.onExtraCallbackWithResult(tlsVersion.onExtraCallbackWithResult(OkHttp.onExtraCallback), getViewTypeCount.onExtraCallbackWithResult.onNavigationEvent.IAuthTabCallback.XSmall, (QuirksExternalSyntheticBackport0) null, 0L, 0L, 0, 0.0f, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i2 << 6) & 896, 4092);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 71) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
                int i5 = asBinder + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i7 = IAuthTabCallback + 53;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = asBinder + 83;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1909455232, i2, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdSettingActivityKt.lambda$1909455232.<anonymous> (MobileIdSettingActivity.kt:295)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.mobileid_impl_widget_title_1, cameraCaptureResultEmptyCameraCaptureResult, 0);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w5aVar.IAuthTabCallback(strOnExtraCallback, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.mobileid_impl_widget_title_2, cameraCaptureResultEmptyCameraCaptureResult, 0), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 24) & 234881024, 216);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
