package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SplitControllersplitInfoList1ExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 IAuthTabCallback;

    public SplitControllersplitInfoList1ExternalSyntheticLambda0(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.IAuthTabCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onNavigationEvent(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, boolean z, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = this.IAuthTabCallback.onExtraCallback(windowInfoTrackerCompanionExternalSyntheticLambda0, str, z, access13800Var);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }
}
