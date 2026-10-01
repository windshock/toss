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

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RowTransferHistoryDateItemBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography6 IAuthTabCallback;
    private final LinearLayout onNavigationEvent;
    public final TdsButtonV1View onWarmupCompleted;

    private RowTransferHistoryDateItemBinding(@NonNull LinearLayout linearLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Typography6 typography6) {
        this.onNavigationEvent = linearLayout;
        this.onWarmupCompleted = tdsButtonV1View;
        this.IAuthTabCallback = typography6;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static RowTransferHistoryDateItemBinding onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transfer_history_date_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static RowTransferHistoryDateItemBinding onNavigationEvent(@NonNull View view) {
        Typography6 typography6OnNavigationEvent;
        int i = R.id.button;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new RowTransferHistoryDateItemBinding((LinearLayout) view, tdsButtonV1ViewOnNavigationEvent, typography6OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
