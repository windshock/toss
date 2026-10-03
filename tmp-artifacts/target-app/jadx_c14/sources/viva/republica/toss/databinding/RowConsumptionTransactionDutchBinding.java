package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;
import viva.republica.toss.home.consumption.transaction.view.HomeTransactionDutchView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowConsumptionTransactionDutchBinding implements SearchBarKtExternalSyntheticLambda5 {
    private final HomeTransactionDutchView onNavigationEvent;
    public final HomeTransactionDutchView onWarmupCompleted;

    private RowConsumptionTransactionDutchBinding(@NonNull HomeTransactionDutchView homeTransactionDutchView, @NonNull HomeTransactionDutchView homeTransactionDutchView2) {
        this.onNavigationEvent = homeTransactionDutchView;
        this.onWarmupCompleted = homeTransactionDutchView2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public HomeTransactionDutchView getRoot() {
        return this.onNavigationEvent;
    }

    public static RowConsumptionTransactionDutchBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_consumption_transaction_dutch, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RowConsumptionTransactionDutchBinding IAuthTabCallback(@NonNull View view) {
        if (view == 0) {
            throw new NullPointerException("rootView");
        }
        HomeTransactionDutchView homeTransactionDutchView = (HomeTransactionDutchView) view;
        return new RowConsumptionTransactionDutchBinding(homeTransactionDutchView, homeTransactionDutchView);
    }
}
