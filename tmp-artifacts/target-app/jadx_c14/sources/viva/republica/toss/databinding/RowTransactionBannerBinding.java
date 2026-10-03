package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionBannerBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsRoundLayout IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final Typography6 onExtraCallbackWithResult;
    public final Typography6 onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    private RowTransactionBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography6 typography6, @NonNull Typography6 typography62) {
        this.onExtraCallback = constraintLayout;
        this.onWarmupCompleted = tdsImageView;
        this.IAuthTabCallback = tdsRoundLayout;
        this.onExtraCallbackWithResult = typography6;
        this.onNavigationEvent = typography62;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static RowTransactionBannerBinding onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static RowTransactionBannerBinding onWarmupCompleted(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        Typography6 typography6OnNavigationEvent2;
        int i = R.id.arrow;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.roundLayout))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.value))) != null) {
            return new RowTransactionBannerBinding((ConstraintLayout) view, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, typography6OnNavigationEvent, typography6OnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
