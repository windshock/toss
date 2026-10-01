package o;

import im.toss.securities.core.cert.data.di.TossSecCertHiltModule;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o4ExternalSyntheticLambda1 implements captureStartValues<o7> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<afErrorLogForExcManagerOnly> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        o7 o7VarOnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return o7VarOnWarmupCompleted;
    }

    public o7 onWarmupCompleted() {
        o7 o7VarOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            o7VarOnNavigationEvent = onNavigationEvent((afErrorLogForExcManagerOnly) this.onExtraCallbackWithResult.get());
            int i3 = 58 / 0;
        } else {
            o7VarOnNavigationEvent = onNavigationEvent((afErrorLogForExcManagerOnly) this.onExtraCallbackWithResult.get());
        }
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return o7VarOnNavigationEvent;
    }

    public static o7 onNavigationEvent(afErrorLogForExcManagerOnly aferrorlogforexcmanageronly) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        o7 o7VarIAuthTabCallback = TossSecCertHiltModule.onNavigationEvent.IAuthTabCallback(aferrorlogforexcmanageronly);
        if (i3 != 0) {
            return (o7) createAnimator.onNavigationEvent(o7VarIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
