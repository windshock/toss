package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback {
    public static final ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback onNavigationEvent = new ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback(true, onWarmupCompleted.NO_STABLE_IDS);
    public final onWarmupCompleted onExtraCallbackWithResult;
    public final boolean onWarmupCompleted;

    public enum onWarmupCompleted {
        NO_STABLE_IDS,
        ISOLATED_STABLE_IDS,
        SHARED_STABLE_IDS
    }

    ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback(boolean z, @NonNull onWarmupCompleted onwarmupcompleted) {
        this.onWarmupCompleted = z;
        this.onExtraCallbackWithResult = onwarmupcompleted;
    }
}
