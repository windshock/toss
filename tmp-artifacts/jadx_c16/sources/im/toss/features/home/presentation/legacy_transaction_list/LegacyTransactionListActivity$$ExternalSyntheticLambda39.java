package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import o.alertWithArgs;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda39 implements SwipeRefreshLayout.onExtraCallbackWithResult {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, swipeRefreshLayout, view};
        boolean zBooleanValue = ((Boolean) LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), 171701984, alertWithArgs.onExtraCallbackWithResult(), -171701972, objArr, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult())).booleanValue();
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return zBooleanValue;
    }
}
