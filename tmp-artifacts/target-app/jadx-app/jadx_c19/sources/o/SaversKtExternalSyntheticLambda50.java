package o;

import androidx.annotation.NonNull;
import java.io.File;
import o.LayoutIntrinsics_androidKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda50<DataType> implements LayoutIntrinsics_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult {
    private final SaversKtExternalSyntheticLambda24<DataType> onExtraCallbackWithResult;
    private final SaversKtExternalSyntheticLambda30 onNavigationEvent;
    private final DataType onWarmupCompleted;

    SaversKtExternalSyntheticLambda50(SaversKtExternalSyntheticLambda24<DataType> saversKtExternalSyntheticLambda24, DataType datatype, SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        this.onExtraCallbackWithResult = saversKtExternalSyntheticLambda24;
        this.onWarmupCompleted = datatype;
        this.onNavigationEvent = saversKtExternalSyntheticLambda30;
    }

    @Override // o.LayoutIntrinsics_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult
    public boolean onWarmupCompleted(@NonNull File file) {
        return this.onExtraCallbackWithResult.onExtraCallback(this.onWarmupCompleted, file, this.onNavigationEvent);
    }
}
