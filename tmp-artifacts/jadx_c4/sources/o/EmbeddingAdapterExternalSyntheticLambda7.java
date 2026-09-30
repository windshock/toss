package o;

import im.toss.appsintoss.di.AppsInTossNetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingAdapterExternalSyntheticLambda7 implements captureStartValues<ActivityWindowInfoCallbackControllerExternalSyntheticLambda0> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<g1> onExtraCallback;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            throw null;
        }
        ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return activityWindowInfoCallbackControllerExternalSyntheticLambda0IAuthTabCallback;
    }

    public ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallback.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult((g1) obj, (zzad) this.onWarmupCompleted.get());
        }
        int i4 = 3 / 0;
        return onExtraCallbackWithResult((g1) obj, (zzad) this.onWarmupCompleted.get());
    }

    public static ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 onExtraCallbackWithResult(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = (ActivityWindowInfoCallbackControllerExternalSyntheticLambda0) createAnimator.onNavigationEvent(AppsInTossNetworkModule.onNavigationEvent.onWarmupCompleted(g1Var, zzadVar));
        if (i3 != 0) {
            return activityWindowInfoCallbackControllerExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
