package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailCashDisclaimerBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View onExtraCallback;
    private final TdsRoundLayout onNavigationEvent;

    private RowTransactionDetailCashDisclaimerBinding(@NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.onNavigationEvent = tdsRoundLayout;
        this.onExtraCallback = tdsListRowV1View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public TdsRoundLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static RowTransactionDetailCashDisclaimerBinding onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_cash_disclaimer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static RowTransactionDetailCashDisclaimerBinding onExtraCallbackWithResult(@NonNull View view) {
        int i = R.id.listRowCashDisclaimer;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsListRowV1ViewOnNavigationEvent != null) {
            return new RowTransactionDetailCashDisclaimerBinding((TdsRoundLayout) view, tdsListRowV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
