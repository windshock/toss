package o;

import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SplitControllersplitInfoList1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallbackWithResult;

    public SplitControllersplitInfoList1ExternalSyntheticLambda1(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallbackWithResult = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            objOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, inAppPurchaseProductAuthorizer, access13800Var);
            int i3 = 86 / 0;
        } else {
            objOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, inAppPurchaseProductAuthorizer, access13800Var);
        }
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }
}
