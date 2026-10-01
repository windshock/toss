package o;

import im.toss.securities.widget.data.di.WidgetApiModule;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaUhgE1c6WHg3q4rZf8nAlGxTt7Fk implements captureStartValues<r2ExternalSyntheticLambda0> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<accessgetStatep> onExtraCallbackWithResult;
    private final createAnimators<performOnAppAttribution> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        r2ExternalSyntheticLambda0 r2externalsyntheticlambda0OnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallback + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return r2externalsyntheticlambda0OnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public r2ExternalSyntheticLambda0 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        performOnAppAttribution performonappattribution = (performOnAppAttribution) this.onWarmupCompleted.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult(performonappattribution, (accessgetStatep) this.onExtraCallbackWithResult.get());
        }
        int i4 = 11 / 0;
        return onExtraCallbackWithResult(performonappattribution, (accessgetStatep) this.onExtraCallbackWithResult.get());
    }

    public static r2ExternalSyntheticLambda0 onExtraCallbackWithResult(performOnAppAttribution performonappattribution, accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r2ExternalSyntheticLambda0 r2externalsyntheticlambda0 = (r2ExternalSyntheticLambda0) createAnimator.onNavigationEvent(WidgetApiModule.onNavigationEvent.onWarmupCompleted(performonappattribution, accessgetstatep));
        if (i3 != 0) {
            return r2externalsyntheticlambda0;
        }
        throw null;
    }
}
