package o;

import im.toss.appsintoss.iap.model.AppsInTossPurchasedHistoryItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38 implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final AppsInTossPurchasedHistoryItem onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38)) {
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38) obj).onExtraCallback)) {
            return true;
        }
        int i6 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ItemUiModel(item=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda38(@NotNull AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem) {
        Intrinsics.checkNotNullParameter(appsInTossPurchasedHistoryItem, "");
        this.onExtraCallback = appsInTossPurchasedHistoryItem;
    }

    public final AppsInTossPurchasedHistoryItem onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossPurchasedHistoryItem appsInTossPurchasedHistoryItem = this.onExtraCallback;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return appsInTossPurchasedHistoryItem;
    }
}
