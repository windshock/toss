package o;

import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallback;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda61(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onExtraCallback(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @NotNull String str3, @Nullable String str4, @NotNull access13800<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onExtraCallback.onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0, str3, str, str2, inAppPurchaseProductAuthorizer, str4, access13800Var);
            throw null;
        }
        Object objOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0, str3, str, str2, inAppPurchaseProductAuthorizer, str4, access13800Var);
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }
}
