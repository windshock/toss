package o;

import im.toss.di.TossObservabilityModule;
import im.toss.state.spec.SessionState;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class overridePendingTransitionOpt implements captureStartValues<a6a> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<getTextProgressSize> onExtraCallbackWithResult;
    private final createAnimators<SessionState> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            throw null;
        }
        a6a a6aVarIAuthTabCallback = IAuthTabCallback();
        int i3 = IAuthTabCallback + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return a6aVarIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public a6a IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        a6a a6aVarOnNavigationEvent = onNavigationEvent((getTextProgressSize) this.onExtraCallbackWithResult.get(), (SessionState) this.onNavigationEvent.get());
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return a6aVarOnNavigationEvent;
    }

    public static a6a onNavigationEvent(getTextProgressSize gettextprogresssize, SessionState sessionState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        a6a a6aVar = (a6a) createAnimator.onNavigationEvent(TossObservabilityModule.onNavigationEvent.IAuthTabCallback(gettextprogresssize, sessionState));
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return a6aVar;
    }
}
