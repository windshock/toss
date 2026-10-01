package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageNode71 implements captureStartValues<sendEventId> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<g1> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public sendEventId onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        sendEventId sendeventidOnExtraCallbackWithResult = onExtraCallbackWithResult((g1) this.onNavigationEvent.get());
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return sendeventidOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static sendEventId onExtraCallbackWithResult(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        sendEventId sendeventid = (sendEventId) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.readTypedObject(g1Var));
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return sendeventid;
    }
}
