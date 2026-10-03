package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography5;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import o.decEncryptedData;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowConsumptionTransactionFilterBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography5 IAuthTabCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final decEncryptedData onWarmupCompleted;

    private RowConsumptionTransactionFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Typography5 typography5, @NonNull decEncryptedData decencrypteddata) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = typography5;
        this.onWarmupCompleted = decencrypteddata;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static RowConsumptionTransactionFilterBinding onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_consumption_transaction_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static RowConsumptionTransactionFilterBinding onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        int i = R.id.filterTitle;
        Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography5OnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.refreshLayout))) != null) {
            return new RowConsumptionTransactionFilterBinding((ConstraintLayout) view, typography5OnNavigationEvent, decEncryptedData.onWarmupCompleted(viewOnNavigationEvent));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
