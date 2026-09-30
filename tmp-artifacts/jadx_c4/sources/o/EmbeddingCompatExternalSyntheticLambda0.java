package o;

import im.toss.appsintoss.di.AppsInTossUseCaseModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingCompatExternalSyntheticLambda0 implements captureStartValues<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61OnExtraCallbackWithResult = onExtraCallbackWithResult((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) this.onWarmupCompleted.get());
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda61OnExtraCallbackWithResult;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 safeActivityEmbeddingComponentProviderExternalSyntheticLambda61 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61) createAnimator.onNavigationEvent(AppsInTossUseCaseModule.onWarmupCompleted.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43));
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda61;
        }
        throw null;
    }
}
