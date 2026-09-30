package im.toss.features.home.presentation.legacy_transaction_list;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda40 implements AppBarLayout.OnOffsetChangedListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        LegacyTransactionListActivity.onExtraCallbackWithResult(this.f$0, appBarLayout, i);
        int i5 = onExtraCallback + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
