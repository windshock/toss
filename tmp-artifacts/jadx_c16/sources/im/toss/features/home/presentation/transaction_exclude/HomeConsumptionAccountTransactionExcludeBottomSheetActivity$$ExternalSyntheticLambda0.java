package im.toss.features.home.presentation.transaction_exclude;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionAccountTransactionExcludeBottomSheetActivity$$ExternalSyntheticLambda0 implements DialogInterface.OnCancelListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeConsumptionAccountTransactionExcludeBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionAccountTransactionExcludeBottomSheetActivity.onExtraCallbackWithResult(this.f$0, dialogInterface);
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
