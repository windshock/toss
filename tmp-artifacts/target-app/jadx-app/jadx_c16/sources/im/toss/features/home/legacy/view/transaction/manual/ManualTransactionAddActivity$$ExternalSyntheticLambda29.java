package im.toss.features.home.legacy.view.transaction.manual;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda29 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity.onWarmupCompleted(this.f$0, view);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
    }
}
