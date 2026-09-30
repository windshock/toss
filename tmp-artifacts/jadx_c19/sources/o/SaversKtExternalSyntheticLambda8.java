package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda8 {
    private final Map<SaversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?>> onNavigationEvent = new HashMap();
    private final Map<SaversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?>> onExtraCallbackWithResult = new HashMap();

    SaversKtExternalSyntheticLambda8() {
    }

    SaversKtExternalSyntheticLambda55<?> onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, boolean z) {
        return onExtraCallback(z).get(saversKtExternalSyntheticLambda26);
    }

    void onExtraCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55) {
        onExtraCallback(saversKtExternalSyntheticLambda55.asBinder()).put(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda55);
    }

    void onWarmupCompleted(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?> saversKtExternalSyntheticLambda55) {
        Map<SaversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?>> mapOnExtraCallback = onExtraCallback(saversKtExternalSyntheticLambda55.asBinder());
        if (saversKtExternalSyntheticLambda55.equals(mapOnExtraCallback.get(saversKtExternalSyntheticLambda26))) {
            mapOnExtraCallback.remove(saversKtExternalSyntheticLambda26);
        }
    }

    private Map<SaversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda55<?>> onExtraCallback(boolean z) {
        return z ? this.onExtraCallbackWithResult : this.onNavigationEvent;
    }
}
