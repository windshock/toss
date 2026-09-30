package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getAuthenticatorokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAuthenticatorokhttp<Scope> implements eventListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final getBacktraceNote<Scope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;

    public static /* synthetic */ Unit onExtraCallback(getAuthenticatorokhttp getauthenticatorokhttp, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getauthenticatorokhttp, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAuthenticatorokhttp(@NotNull getBacktraceNote<? super Scope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        this.onExtraCallback = getbacktracenote;
    }

    public final getBacktraceNote<Scope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBacktraceNote<Scope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.onExtraCallback;
        int i5 = i3 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return getbacktracenote;
    }

    @Override // o.eventListener
    public <T> getBacktraceNote<T, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-139063284, true, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.state.ComposableScope$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 57;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = getAuthenticatorokhttp.onExtraCallback(this.f$0, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onNavigationEvent + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(getAuthenticatorokhttp getauthenticatorokhttp, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(obj) : cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(obj) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i3 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-139063284, i, -1, "im.toss.tds.view.compat.component.state.ComposableScope.toComposable.<anonymous> (ComposableScope.kt:9)");
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1809175145);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-495828840);
                getauthenticatorokhttp.onExtraCallback.invoke(obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                int i7 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i9 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
