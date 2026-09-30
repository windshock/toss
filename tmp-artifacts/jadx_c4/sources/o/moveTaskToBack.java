package o;

import android.content.Context;
import im.toss.di.TossObservabilityModule;
import im.toss.state.spec.SessionState;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class moveTaskToBack implements captureStartValues<doCreateCallbackThread> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<Context> onExtraCallback;
    private final createAnimators<a8> onExtraCallbackWithResult;
    private final createAnimators<SessionState> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        doCreateCallbackThread docreatecallbackthreadIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return docreatecallbackthreadIAuthTabCallback;
    }

    public doCreateCallbackThread IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        doCreateCallbackThread docreatecallbackthreadIAuthTabCallback = IAuthTabCallback((Context) this.onExtraCallback.get(), (SessionState) this.onWarmupCompleted.get(), (a8) this.onExtraCallbackWithResult.get());
        int i4 = IAuthTabCallback + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return docreatecallbackthreadIAuthTabCallback;
        }
        throw null;
    }

    public static doCreateCallbackThread IAuthTabCallback(Context context, SessionState sessionState, a8 a8Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        doCreateCallbackThread docreatecallbackthread = (doCreateCallbackThread) createAnimator.onNavigationEvent(TossObservabilityModule.onNavigationEvent.onExtraCallbackWithResult(context, sessionState, a8Var));
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return docreatecallbackthread;
    }
}
