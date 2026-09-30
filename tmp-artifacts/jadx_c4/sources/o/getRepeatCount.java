package o;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapterListener;
import o.getRepeatCount;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRepeatCount {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final getRepeatCount onNavigationEvent = new getRepeatCount();
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-541480218, false, new getBacktraceNote() { // from class: im.toss.compose.v0.ComposableSingletons$AppBarsKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                getRepeatCount.onExtraCallbackWithResult(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = getRepeatCount.onExtraCallbackWithResult(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onWarmupCompleted + 111;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(581761514, false, new getBacktraceNote() { // from class: im.toss.compose.v0.ComposableSingletons$AppBarsKt$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = getRepeatCount.onExtraCallbackWithResult((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = IAuthTabCallback;
            int i4 = 28 / 0;
        } else {
            getbacktracenote = IAuthTabCallback;
        }
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
            z = (i & 125) != 3;
        } else {
            Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-541480218, i, -1, "im.toss.compose.v0.ComposableSingletons$AppBarsKt.lambda$-541480218.<anonymous> (AppBars.kt:80)");
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallback + 71;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i7 != 0) {
                        throw null;
                    }
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = onExtraCallback + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallbackWithResult + 45;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 27;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(581761514, i, -1, "im.toss.compose.v0.ComposableSingletons$AppBarsKt.lambda$581761514.<anonymous> (AppBars.kt:82)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(581761514, i, -1, "im.toss.compose.v0.ComposableSingletons$AppBarsKt.lambda$581761514.<anonymous> (AppBars.kt:82)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
