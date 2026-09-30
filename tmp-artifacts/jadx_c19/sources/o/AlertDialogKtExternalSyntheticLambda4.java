package o;

import androidx.annotation.Nullable;
import java.util.List;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtExternalSyntheticLambda4 implements AlertDialogKtExternalSyntheticLambda5 {
    private final List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> IAuthTabCallback;
    private final AlertDialogKtExternalSyntheticLambda5 onWarmupCompleted;

    public AlertDialogKtExternalSyntheticLambda4(AlertDialogKtExternalSyntheticLambda5 alertDialogKtExternalSyntheticLambda5, List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> list) {
        this.onWarmupCompleted = alertDialogKtExternalSyntheticLambda5;
        this.IAuthTabCallback = list;
    }

    @Override // o.AlertDialogKtExternalSyntheticLambda5
    public ComposableSingletonsScaffoldKtExternalSyntheticLambda6.onNavigationEvent<AlertDialogKtExternalSyntheticLambda7> IAuthTabCallback() {
        return new BackdropScaffoldKtExternalSyntheticLambda21(this.onWarmupCompleted.IAuthTabCallback(), this.IAuthTabCallback);
    }

    @Override // o.AlertDialogKtExternalSyntheticLambda5
    public ComposableSingletonsScaffoldKtExternalSyntheticLambda6.onNavigationEvent<AlertDialogKtExternalSyntheticLambda7> onExtraCallback(AlertDialogKtExternalSyntheticLambda6 alertDialogKtExternalSyntheticLambda6, @Nullable AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        return new BackdropScaffoldKtExternalSyntheticLambda21(this.onWarmupCompleted.onExtraCallback(alertDialogKtExternalSyntheticLambda6, alertDialogKtExternalSyntheticLambda3), this.IAuthTabCallback);
    }
}
