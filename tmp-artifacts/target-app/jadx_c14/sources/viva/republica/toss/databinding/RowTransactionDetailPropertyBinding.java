package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.compat.component.compound.post.TdsPostV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailPropertyBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsPostV2View IAuthTabCallback;
    private final LinearLayout onExtraCallback;
    public final TdsRoundLayout onExtraCallbackWithResult;
    public final TdsListRowV1View onNavigationEvent;
    public final LinearLayout onWarmupCompleted;

    private RowTransactionDetailPropertyBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsPostV2View tdsPostV2View, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.onExtraCallback = linearLayout;
        this.onWarmupCompleted = linearLayout2;
        this.onExtraCallbackWithResult = tdsRoundLayout;
        this.IAuthTabCallback = tdsPostV2View;
        this.onNavigationEvent = tdsListRowV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallback;
    }

    public static RowTransactionDetailPropertyBinding onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_property, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static RowTransactionDetailPropertyBinding onWarmupCompleted(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsPostV2View tdsPostV2ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        int i = R.id.bannerDescriptionContainer;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bannerLayout))) != null && (tdsPostV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bannerTitle))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.listRow))) != null) {
            return new RowTransactionDetailPropertyBinding((LinearLayout) view, linearLayout, tdsRoundLayoutOnNavigationEvent, tdsPostV2ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
