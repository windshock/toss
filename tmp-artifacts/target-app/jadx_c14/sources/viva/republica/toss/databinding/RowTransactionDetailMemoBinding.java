package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailMemoBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    private final LinearLayout onWarmupCompleted;

    private RowTransactionDetailMemoBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.onWarmupCompleted = linearLayout;
        this.onNavigationEvent = linearLayout2;
        this.onExtraCallbackWithResult = tdsListRowV1View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static RowTransactionDetailMemoBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_memo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static RowTransactionDetailMemoBinding IAuthTabCallback(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.headerItemMemo;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsListRowV1ViewOnNavigationEvent != null) {
            return new RowTransactionDetailMemoBinding(linearLayout, linearLayout, tdsListRowV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
