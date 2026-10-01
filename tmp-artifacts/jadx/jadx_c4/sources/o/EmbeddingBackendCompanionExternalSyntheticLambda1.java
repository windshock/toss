package o;

import im.toss.appsintoss.di.AppsInTossUseCaseModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingBackendCompanionExternalSyntheticLambda1 implements captureStartValues<SafeWindowLayoutComponentProviderExternalSyntheticLambda6> {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public SafeWindowLayoutComponentProviderExternalSyntheticLambda6 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onNavigationEvent.get();
        if (i3 != 0) {
            return onExtraCallbackWithResult((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) obj);
        }
        int i4 = 73 / 0;
        return onExtraCallbackWithResult((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) obj);
    }

    public static SafeWindowLayoutComponentProviderExternalSyntheticLambda6 onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SafeWindowLayoutComponentProviderExternalSyntheticLambda6 safeWindowLayoutComponentProviderExternalSyntheticLambda6 = (SafeWindowLayoutComponentProviderExternalSyntheticLambda6) createAnimator.onNavigationEvent(AppsInTossUseCaseModule.onWarmupCompleted.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43));
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return safeWindowLayoutComponentProviderExternalSyntheticLambda6;
    }
}
