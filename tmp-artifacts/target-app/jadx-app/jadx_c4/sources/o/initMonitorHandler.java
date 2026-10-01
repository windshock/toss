package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.initMonitorHandler;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class initMonitorHandler {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final initMonitorHandler IAuthTabCallback = new initMonitorHandler();
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(830856693, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.ComposableSingletons$CreditHomeScreenKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit unitOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            RowScope rowScope = (RowScope) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                unitOnNavigationEvent = initMonitorHandler.onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 32 / 0;
            } else {
                unitOnNavigationEvent = initMonitorHandler.onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1187098160, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.ComposableSingletons$CreditHomeScreenKt$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onExtraCallback = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return initMonitorHandler.onExtraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            Unit unitOnExtraCallbackWithResult = initMonitorHandler.onExtraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = 78 / 0;
            return unitOnExtraCallbackWithResult;
        }
    });

    public static /* synthetic */ Unit onExtraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = onWarmupCompleted;
            int i4 = 5 / 0;
        } else {
            getbacktracenote = onWarmupCompleted;
        }
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    static {
        int i = asBinder + 21;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 29 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(830856693, i, -1, "im.toss.feature.credit.ui.main.home.ComposableSingletons$CreditHomeScreenKt.lambda$830856693.<anonymous> (CreditHomeScreen.kt:705)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_refresh, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult()}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98294}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_refresh, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult()}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98294}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i4 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i6 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i8 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187098160, i, -1, "im.toss.feature.credit.ui.main.home.ComposableSingletons$CreditHomeScreenKt.lambda$-1187098160.<anonymous> (CreditHomeScreen.kt:704)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 3) & 112) | 6)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -99696964, 99696975, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
