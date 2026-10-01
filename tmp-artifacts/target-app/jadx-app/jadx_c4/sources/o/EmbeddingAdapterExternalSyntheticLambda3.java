package o;

import im.toss.appsintoss.di.AppsInTossComponentModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingAdapterExternalSyntheticLambda3 implements captureStartValues<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final AppsInTossComponentModule onExtraCallback;

    public /* synthetic */ Object get() {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback = onExtraCallback();
            int i3 = 56 / 0;
        } else {
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback = onExtraCallback();
        }
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback = onExtraCallback(this.onExtraCallback);
        int i3 = onNavigationEvent + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20OnExtraCallback;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onExtraCallback(AppsInTossComponentModule appsInTossComponentModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 safeActivityEmbeddingComponentProviderExternalSyntheticLambda20 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20) createAnimator.onNavigationEvent(appsInTossComponentModule.onWarmupCompleted());
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
    }
}
