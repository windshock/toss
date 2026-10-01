package im.toss.appsintoss.iap.usecase;

import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult;
import kotlin.jvm.internal.Intrinsics;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RequestRefundIAPPurchasedItemUseCase {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallbackWithResult;

    public RequestRefundIAPPurchasedItemUseCase(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallbackWithResult = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull access13800<? super AppsInTossRefundRequestResult> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43 = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda43.onNavigationEvent(str, str2, access13800Var);
        }
        safeActivityEmbeddingComponentProviderExternalSyntheticLambda43.onNavigationEvent(str, str2, access13800Var);
        throw null;
    }
}
