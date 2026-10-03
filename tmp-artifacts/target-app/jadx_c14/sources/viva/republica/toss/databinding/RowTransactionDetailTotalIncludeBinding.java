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
public final class RowTransactionDetailTotalIncludeBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    private final LinearLayout onNavigationEvent;
    public final LinearLayout onWarmupCompleted;

    private RowTransactionDetailTotalIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.onNavigationEvent = linearLayout;
        this.onWarmupCompleted = linearLayout2;
        this.IAuthTabCallback = tdsListRowV1View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static RowTransactionDetailTotalIncludeBinding IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_total_include, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static RowTransactionDetailTotalIncludeBinding onExtraCallback(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.headerItemInclude;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsListRowV1ViewOnNavigationEvent != null) {
            return new RowTransactionDetailTotalIncludeBinding(linearLayout, linearLayout, tdsListRowV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
