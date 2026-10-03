package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography6;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailPayDueBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography6 IAuthTabCallback;
    private final LinearLayout onExtraCallbackWithResult;
    public final TdsButtonV1View onWarmupCompleted;

    private RowTransactionDetailPayDueBinding(@NonNull LinearLayout linearLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Typography6 typography6) {
        this.onExtraCallbackWithResult = linearLayout;
        this.onWarmupCompleted = tdsButtonV1View;
        this.IAuthTabCallback = typography6;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static RowTransactionDetailPayDueBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_pay_due, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static RowTransactionDetailPayDueBinding onNavigationEvent(@NonNull View view) {
        Typography6 typography6OnNavigationEvent;
        int i = R.id.payDueDeleteBtn;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.payDueMessage))) != null) {
            return new RowTransactionDetailPayDueBinding((LinearLayout) view, tdsButtonV1ViewOnNavigationEvent, typography6OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
