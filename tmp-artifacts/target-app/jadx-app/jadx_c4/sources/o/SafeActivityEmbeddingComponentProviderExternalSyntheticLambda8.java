package o;

import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onWarmupCompleted;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda8(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onWarmupCompleted = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull access13800<? super AppsInTossPurchaseHistoryInfo> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.onNavigationEvent(str, str3, str2, access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(str, str3, str2, access13800Var);
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return objOnNavigationEvent;
    }
}
