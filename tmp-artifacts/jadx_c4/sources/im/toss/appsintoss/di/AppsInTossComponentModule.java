package im.toss.appsintoss.di;

import javax.inject.Singleton;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda24;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossComponentModule {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Singleton
    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda20 onWarmupCompleted() {
        int i = 2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda24 safeActivityEmbeddingComponentProviderExternalSyntheticLambda24 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda24();
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda24;
        }
        throw null;
    }
}
