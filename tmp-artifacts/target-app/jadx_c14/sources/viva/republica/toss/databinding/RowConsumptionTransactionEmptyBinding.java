package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.TdsResultV0View;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowConsumptionTransactionEmptyBinding implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final TdsResultV0View onExtraCallback;

    private RowConsumptionTransactionEmptyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TdsResultV0View tdsResultV0View) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallback = tdsResultV0View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static RowConsumptionTransactionEmptyBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_consumption_transaction_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static RowConsumptionTransactionEmptyBinding onExtraCallback(@NonNull View view) {
        int i = R.id.emptyView;
        TdsResultV0View tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsResultV0ViewOnNavigationEvent != null) {
            return new RowConsumptionTransactionEmptyBinding((ConstraintLayout) view, tdsResultV0ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
