package o;

import android.util.SparseArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted {
    private final SparseArray<SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent> IAuthTabCallback;
    private final TextContextMenuProviderKtExternalSyntheticLambda0 onNavigationEvent;

    public SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted(TextContextMenuProviderKtExternalSyntheticLambda0 textContextMenuProviderKtExternalSyntheticLambda0, SparseArray<SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent> sparseArray) {
        this.onNavigationEvent = textContextMenuProviderKtExternalSyntheticLambda0;
        SparseArray<SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent> sparseArray2 = new SparseArray<>(textContextMenuProviderKtExternalSyntheticLambda0.onExtraCallbackWithResult());
        for (int i2 = 0; i2 < textContextMenuProviderKtExternalSyntheticLambda0.onExtraCallbackWithResult(); i2++) {
            int iOnWarmupCompleted = textContextMenuProviderKtExternalSyntheticLambda0.onWarmupCompleted(i2);
            sparseArray2.append(iOnWarmupCompleted, (SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(sparseArray.get(iOnWarmupCompleted)));
        }
        this.IAuthTabCallback = sparseArray2;
    }

    public SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onWarmupCompleted(int i2) {
        return (SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.get(i2));
    }

    public boolean onNavigationEvent(int i2) {
        return this.onNavigationEvent.IAuthTabCallback(i2);
    }

    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent.onExtraCallbackWithResult();
    }

    public int onExtraCallbackWithResult(int i2) {
        return this.onNavigationEvent.onWarmupCompleted(i2);
    }
}
