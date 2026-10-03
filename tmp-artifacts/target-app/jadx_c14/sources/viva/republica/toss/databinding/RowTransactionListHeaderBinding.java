package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.AmountTop;
import im.toss.uikit.widget.TdsTooltipV1View;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionListHeaderBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography6 IAuthTabCallback;
    public final TdsImageView IAuthTabCallbackDefault;
    public final TdsTooltipV1View IAuthTabCallbackStub;
    public final Typography7 access100;
    public final TdsRoundLayout asBinder;
    public final Typography7 asInterface;
    private final ConstraintLayout getInterfaceDescriptor;
    public final TdsImageView onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsBadgeV1View onNavigationEvent;
    public final TdsImageView onTransact;
    public final AmountTop onWarmupCompleted;

    private RowTransactionListHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AmountTop amountTop, @NonNull TdsBadgeV1View tdsBadgeV1View, @NonNull Typography6 typography6, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography7 typography7, @NonNull TdsImageView tdsImageView2, @NonNull TdsTooltipV1View tdsTooltipV1View, @NonNull TdsImageView tdsImageView3, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography7 typography72) {
        this.getInterfaceDescriptor = constraintLayout;
        this.onWarmupCompleted = amountTop;
        this.onNavigationEvent = tdsBadgeV1View;
        this.IAuthTabCallback = typography6;
        this.onExtraCallback = tdsImageView;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.asInterface = typography7;
        this.IAuthTabCallbackDefault = tdsImageView2;
        this.IAuthTabCallbackStub = tdsTooltipV1View;
        this.onTransact = tdsImageView3;
        this.asBinder = tdsRoundLayout;
        this.access100 = typography72;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.getInterfaceDescriptor;
    }

    public static RowTransactionListHeaderBinding onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static RowTransactionListHeaderBinding onExtraCallbackWithResult(@NonNull View view) {
        TdsBadgeV1View tdsBadgeV1ViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsTooltipV1View tdsTooltipV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent3;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography7 typography7OnNavigationEvent2;
        int i = R.id.headerAmountTop;
        AmountTop amountTopOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (amountTopOnNavigationEvent != null && (tdsBadgeV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerBadge))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerDescription))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerDescriptionIcon))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerDescriptionLayout))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeign))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignIcon))) != null && (tdsTooltipV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignTooltip))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerImage))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerRoundLayout))) != null && (typography7OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerValue))) != null) {
            return new RowTransactionListHeaderBinding((ConstraintLayout) view, amountTopOnNavigationEvent, tdsBadgeV1ViewOnNavigationEvent, typography6OnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent, typography7OnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsTooltipV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent3, tdsRoundLayoutOnNavigationEvent, typography7OnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
