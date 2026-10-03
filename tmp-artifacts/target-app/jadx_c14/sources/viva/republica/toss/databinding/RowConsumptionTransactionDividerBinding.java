package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowConsumptionTransactionDividerBinding implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout onExtraCallback;
    public final View onNavigationEvent;

    private RowConsumptionTransactionDividerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = view;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static RowConsumptionTransactionDividerBinding onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_consumption_transaction_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static RowConsumptionTransactionDividerBinding IAuthTabCallback(@NonNull View view) {
        int i = R.id.divider;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent != null) {
            return new RowConsumptionTransactionDividerBinding((ConstraintLayout) view, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
