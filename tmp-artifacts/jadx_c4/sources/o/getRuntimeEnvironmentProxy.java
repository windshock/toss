package o;

import im.toss.feature.credit.ui.main.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getRuntimeEnvironmentProxy;
import o.y1a;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRuntimeEnvironmentProxy {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final getRuntimeEnvironmentProxy onNavigationEvent = new getRuntimeEnvironmentProxy();
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1767930162, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.intro.ComposableSingletons$CreditIntroScreenKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = getRuntimeEnvironmentProxy.onNavigationEvent((y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });

    public static /* synthetic */ Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i4 = i2 + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return getbacktracenote;
    }

    static {
        int i = IAuthTabCallbackDefault + 49;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 17) != 16) {
            int i5 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1767930162, i, -1, "im.toss.feature.credit.ui.main.intro.ComposableSingletons$CreditIntroScreenKt.lambda$-1767930162.<anonymous> (CreditIntroScreen.kt:43)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_intro_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
