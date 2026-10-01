package o;

import im.toss.appsintoss.di.AppsInTossUseCaseModule;
import im.toss.appsintoss.iap.usecase.RequestRefundIAPPurchasedItemUseCase;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbeddingCompatCompanionExternalSyntheticLambda0 implements captureStartValues<RequestRefundIAPPurchasedItemUseCase> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCaseOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return requestRefundIAPPurchasedItemUseCaseOnExtraCallbackWithResult;
    }

    public RequestRefundIAPPurchasedItemUseCase onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCaseOnExtraCallback = onExtraCallback((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43) this.onWarmupCompleted.get());
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return requestRefundIAPPurchasedItemUseCaseOnExtraCallback;
    }

    public static RequestRefundIAPPurchasedItemUseCase onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RequestRefundIAPPurchasedItemUseCase requestRefundIAPPurchasedItemUseCase = (RequestRefundIAPPurchasedItemUseCase) createAnimator.onNavigationEvent(AppsInTossUseCaseModule.onWarmupCompleted.onTransact(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43));
        if (i3 == 0) {
            return requestRefundIAPPurchasedItemUseCase;
        }
        throw null;
    }
}
