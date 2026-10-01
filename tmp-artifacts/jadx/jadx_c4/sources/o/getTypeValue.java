package o;

import im.toss.di.WebSocketModule;
import im.toss.state.spec.SessionState;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTypeValue implements captureStartValues<convertThreadbugsnag_android_core_release> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<SessionState> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_releaseOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return convertthreadbugsnag_android_core_releaseOnWarmupCompleted;
    }

    public convertThreadbugsnag_android_core_release onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionState = (SessionState) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return IAuthTabCallback(sessionState);
        }
        IAuthTabCallback(sessionState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static convertThreadbugsnag_android_core_release IAuthTabCallback(SessionState sessionState) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_releaseOnNavigationEvent = WebSocketModule.onWarmupCompleted.onNavigationEvent(sessionState);
        if (i3 != 0) {
            return (convertThreadbugsnag_android_core_release) createAnimator.onNavigationEvent(convertthreadbugsnag_android_core_releaseOnNavigationEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
