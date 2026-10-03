package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.SubTypography10;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.atom.text.Typography5;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailRelatedHeaderBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final SubTypography11 IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final SubTypography10 IAuthTabCallbackStub;
    private final ConstraintLayout asInterface;
    public final Typography5 onExtraCallback;
    public final SubTypography11 onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final View onWarmupCompleted;

    private RowTransactionDetailRelatedHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Typography5 typography5, @NonNull SubTypography11 subTypography11, @NonNull Typography5 typography52, @NonNull SubTypography11 subTypography112, @NonNull View view2, @NonNull SubTypography10 subTypography10) {
        this.asInterface = constraintLayout;
        this.onWarmupCompleted = view;
        this.onNavigationEvent = typography5;
        this.IAuthTabCallback = subTypography11;
        this.onExtraCallback = typography52;
        this.onExtraCallbackWithResult = subTypography112;
        this.IAuthTabCallbackDefault = view2;
        this.IAuthTabCallbackStub = subTypography10;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static RowTransactionDetailRelatedHeaderBinding onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_related_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static RowTransactionDetailRelatedHeaderBinding onWarmupCompleted(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        SubTypography11 subTypography11OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        SubTypography11 subTypography11OnNavigationEvent2;
        View viewOnNavigationEvent;
        SubTypography10 subTypography10OnNavigationEvent;
        int i = R.id.divider;
        View viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent2 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderAmount))) != null && (subTypography11OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderAmountTitle))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderCount))) != null && (subTypography11OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderCountTitle))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderDivider))) != null && (subTypography10OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.relatedHeaderTitle))) != null) {
            return new RowTransactionDetailRelatedHeaderBinding((ConstraintLayout) view, viewOnNavigationEvent2, typography5OnNavigationEvent, subTypography11OnNavigationEvent, typography5OnNavigationEvent2, subTypography11OnNavigationEvent2, viewOnNavigationEvent, subTypography10OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
