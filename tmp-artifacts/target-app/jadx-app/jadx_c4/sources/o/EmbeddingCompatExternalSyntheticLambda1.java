package o;

import im.toss.appsintoss.di.AppsInTossUseCaseModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingCompatExternalSyntheticLambda1 implements captureStartValues<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) this.IAuthTabCallback.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62IAuthTabCallback = IAuthTabCallback((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) this.IAuthTabCallback.get());
        int i3 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda62IAuthTabCallback;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 safeActivityEmbeddingComponentProviderExternalSyntheticLambda62 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62) createAnimator.onNavigationEvent(AppsInTossUseCaseModule.onWarmupCompleted.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43));
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda62;
        }
        throw null;
    }
}
