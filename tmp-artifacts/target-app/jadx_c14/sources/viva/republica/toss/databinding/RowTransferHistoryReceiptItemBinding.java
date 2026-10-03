package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransferHistoryReceiptItemBinding implements SearchBarKtExternalSyntheticLambda5 {
    private final TdsListRowV1View onExtraCallback;
    public final TdsListRowV1View onWarmupCompleted;

    private RowTransferHistoryReceiptItemBinding(@NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsListRowV1View tdsListRowV1View2) {
        this.onExtraCallback = tdsListRowV1View;
        this.onWarmupCompleted = tdsListRowV1View2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public TdsListRowV1View getRoot() {
        return this.onExtraCallback;
    }

    public static RowTransferHistoryReceiptItemBinding onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transfer_history_receipt_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static RowTransferHistoryReceiptItemBinding onExtraCallback(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) view;
        return new RowTransferHistoryReceiptItemBinding(tdsListRowV1View, tdsListRowV1View);
    }
}
