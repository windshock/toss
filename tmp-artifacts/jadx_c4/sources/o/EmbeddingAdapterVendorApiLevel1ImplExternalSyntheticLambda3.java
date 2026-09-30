package o;

import im.toss.appsintoss.di.AppsInTossNetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingAdapterVendorApiLevel1ImplExternalSyntheticLambda3 implements captureStartValues<SafeWindowLayoutComponentProviderExternalSyntheticLambda5> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted();
            throw null;
        }
        SafeWindowLayoutComponentProviderExternalSyntheticLambda5 safeWindowLayoutComponentProviderExternalSyntheticLambda5OnWarmupCompleted = onWarmupCompleted();
        int i3 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda5OnWarmupCompleted;
    }

    public SafeWindowLayoutComponentProviderExternalSyntheticLambda5 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.IAuthTabCallback.get();
        if (i3 == 0) {
            return onNavigationEvent((g1) obj, (zzad) this.onExtraCallback.get());
        }
        int i4 = 35 / 0;
        return onNavigationEvent((g1) obj, (zzad) this.onExtraCallback.get());
    }

    public static SafeWindowLayoutComponentProviderExternalSyntheticLambda5 onNavigationEvent(g1 g1Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeWindowLayoutComponentProviderExternalSyntheticLambda5 safeWindowLayoutComponentProviderExternalSyntheticLambda5 = (SafeWindowLayoutComponentProviderExternalSyntheticLambda5) createAnimator.onNavigationEvent(AppsInTossNetworkModule.onNavigationEvent.IAuthTabCallback(g1Var, zzadVar));
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda5;
    }
}
