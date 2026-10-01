package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallback;

    public WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onWarmupCompleted(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, str3, access13800Var);
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }
}
