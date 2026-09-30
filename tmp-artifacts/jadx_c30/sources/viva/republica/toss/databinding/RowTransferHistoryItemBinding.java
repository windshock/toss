package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RowTransferHistoryItemBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsCheckBoxV1View IAuthTabCallback;
    private final ConstraintLayout asInterface;
    public final Typography7 onExtraCallback;
    public final Typography7 onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final Typography5 onWarmupCompleted;

    private RowTransferHistoryItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Typography5 typography5, @NonNull TdsCheckBoxV1View tdsCheckBoxV1View, @NonNull Typography7 typography7, @NonNull Typography7 typography72, @NonNull Typography5 typography52) {
        this.asInterface = constraintLayout;
        this.onWarmupCompleted = typography5;
        this.IAuthTabCallback = tdsCheckBoxV1View;
        this.onExtraCallbackWithResult = typography7;
        this.onExtraCallback = typography72;
        this.onNavigationEvent = typography52;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static RowTransferHistoryItemBinding onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transfer_history_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static RowTransferHistoryItemBinding onExtraCallback(@NonNull View view) {
        TdsCheckBoxV1View tdsCheckBoxV1ViewOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent;
        int i = R.id.amount;
        Typography5 typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography5OnNavigationEvent2 != null && (tdsCheckBoxV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.check_box))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.date))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.receiver_bank))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.receiver_name))) != null) {
            return new RowTransferHistoryItemBinding((ConstraintLayout) view, typography5OnNavigationEvent2, tdsCheckBoxV1ViewOnNavigationEvent, typography7OnNavigationEvent, typography7OnNavigationEvent2, typography5OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
