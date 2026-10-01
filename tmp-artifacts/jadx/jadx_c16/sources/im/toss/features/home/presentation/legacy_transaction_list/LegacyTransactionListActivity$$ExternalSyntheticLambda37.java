package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda37 implements View.OnFocusChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            LegacyTransactionListActivity.onNavigationEvent(this.f$0, view, z);
            obj.hashCode();
            throw null;
        }
        LegacyTransactionListActivity.onNavigationEvent(this.f$0, view, z);
        int i3 = onNavigationEvent + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
