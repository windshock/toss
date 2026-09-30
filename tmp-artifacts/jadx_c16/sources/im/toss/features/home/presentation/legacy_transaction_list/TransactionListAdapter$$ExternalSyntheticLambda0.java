package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.View;
import o.regexpCheck;
import o.regexpCheck$asBinder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ regexpCheck.asInterface f$0;
    public final /* synthetic */ regexpCheck$asBinder f$1;

    public /* synthetic */ TransactionListAdapter$$ExternalSyntheticLambda0(regexpCheck.asInterface asinterface, regexpCheck$asBinder regexpcheck_asbinder) {
        this.f$0 = asinterface;
        this.f$1 = regexpcheck_asbinder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        regexpCheck.onExtraCallback(this.f$0, this.f$1, view);
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
