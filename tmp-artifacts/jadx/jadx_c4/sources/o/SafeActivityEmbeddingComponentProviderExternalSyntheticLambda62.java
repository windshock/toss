package o;

import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 onExtraCallback;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda62(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 safeActivityEmbeddingComponentProviderExternalSyntheticLambda43) {
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda43, "");
        this.onExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda43;
    }

    public final Object onWarmupCompleted(@NotNull String str, @NotNull access13800<? super AppsInTossPurchasedDetailItem> access13800Var) {
        Object objOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            objOnNavigationEvent = this.onExtraCallback.onNavigationEvent(str, access13800Var);
            int i3 = 34 / 0;
        } else {
            objOnNavigationEvent = this.onExtraCallback.onNavigationEvent(str, access13800Var);
        }
        int i4 = onWarmupCompleted + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
