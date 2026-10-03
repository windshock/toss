package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailSpacerBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final View IAuthTabCallback;
    private final LinearLayout onExtraCallback;

    private RowTransactionDetailSpacerBinding(@NonNull LinearLayout linearLayout, @NonNull View view) {
        this.onExtraCallback = linearLayout;
        this.IAuthTabCallback = view;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallback;
    }

    public static RowTransactionDetailSpacerBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_spacer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static RowTransactionDetailSpacerBinding onWarmupCompleted(@NonNull View view) {
        int i = R.id.divider;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent != null) {
            return new RowTransactionDetailSpacerBinding((LinearLayout) view, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
