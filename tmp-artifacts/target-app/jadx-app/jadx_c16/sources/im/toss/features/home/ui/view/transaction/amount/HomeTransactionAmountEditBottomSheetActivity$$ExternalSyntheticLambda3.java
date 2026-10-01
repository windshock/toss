package im.toss.features.home.ui.view.transaction.amount;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeTransactionAmountEditBottomSheetActivity$$ExternalSyntheticLambda3 implements DialogInterface.OnDismissListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeTransactionAmountEditBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            HomeTransactionAmountEditBottomSheetActivity.onWarmupCompleted(this.f$0, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HomeTransactionAmountEditBottomSheetActivity.onWarmupCompleted(this.f$0, dialogInterface);
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
    }
}
