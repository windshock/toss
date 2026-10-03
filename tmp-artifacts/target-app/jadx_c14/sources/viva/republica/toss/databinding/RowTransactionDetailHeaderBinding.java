package viva.republica.toss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.atom.text.SubTypography13;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.widget.TdsTooltipV1View;
import o.SearchBarKtExternalSyntheticLambda4;
import o.SearchBarKtExternalSyntheticLambda5;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RowTransactionDetailHeaderBinding implements SearchBarKtExternalSyntheticLambda5 {
    public final Space IAuthTabCallback;
    public final Space IAuthTabCallbackDefault;
    public final SubTypography13 IAuthTabCallbackStub;
    public final LottieAnimationView IAuthTabCallbackStubProxy;
    public final TdsImageView IAuthTabCallback_Parcel;
    public final TdsButtonV1View ICustomTabsCallback;
    public final FrameLayout access000;
    public final TdsRoundLayout access100;
    public final TdsTooltipV1View asBinder;
    public final TdsRoundLayout asInterface;
    private final ConstraintLayout extraCallback;
    public final SubTypography11 getInterfaceDescriptor;
    public final LinearLayout onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final Typography2 onNavigationEvent;
    public final TdsImageView onTransact;
    public final Typography6 onWarmupCompleted;

    private RowTransactionDetailHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull Typography2 typography2, @NonNull Space space, @NonNull Typography6 typography6, @NonNull TdsImageView tdsImageView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Space space2, @NonNull SubTypography13 subTypography13, @NonNull TdsTooltipV1View tdsTooltipV1View, @NonNull TdsImageView tdsImageView2, @NonNull LottieAnimationView lottieAnimationView, @NonNull FrameLayout frameLayout, @NonNull TdsRoundLayout tdsRoundLayout2, @NonNull TdsImageView tdsImageView3, @NonNull SubTypography11 subTypography11, @NonNull TdsButtonV1View tdsButtonV1View) {
        this.extraCallback = constraintLayout;
        this.onExtraCallback = linearLayout;
        this.onNavigationEvent = typography2;
        this.IAuthTabCallback = space;
        this.onWarmupCompleted = typography6;
        this.onExtraCallbackWithResult = tdsImageView;
        this.asInterface = tdsRoundLayout;
        this.IAuthTabCallbackDefault = space2;
        this.IAuthTabCallbackStub = subTypography13;
        this.asBinder = tdsTooltipV1View;
        this.onTransact = tdsImageView2;
        this.IAuthTabCallbackStubProxy = lottieAnimationView;
        this.access000 = frameLayout;
        this.access100 = tdsRoundLayout2;
        this.IAuthTabCallback_Parcel = tdsImageView3;
        this.getInterfaceDescriptor = subTypography11;
        this.ICustomTabsCallback = tdsButtonV1View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.extraCallback;
    }

    public static RowTransactionDetailHeaderBinding onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.row_transaction_detail_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static RowTransactionDetailHeaderBinding onWarmupCompleted(@NonNull View view) {
        Typography2 typography2OnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        SubTypography13 subTypography13OnNavigationEvent;
        TdsTooltipV1View tdsTooltipV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent2;
        TdsImageView tdsImageViewOnNavigationEvent3;
        SubTypography11 subTypography11OnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        int i = R.id.containerDescription;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (typography2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerAmount))) != null) {
            i = R.id.headerAmountBottomSpace;
            Space space = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (space != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerDiscountReason))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignIcon))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignPaymentGroup))) != null) {
                i = R.id.headerForeignPaymentGroupRight;
                Space space2 = (Space) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (space2 != null && (subTypography13OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignPaymentTitle))) != null && (tdsTooltipV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerForeignPaymentTooltip))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerLogo))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerLogoLottie))) != null) {
                    i = R.id.headerLogoWrapper;
                    FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (frameLayout != null && (tdsRoundLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerRightBadge))) != null && (tdsImageViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerRightIcon))) != null && (subTypography11OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.headerTitle))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.unsubscribeBtn))) != null) {
                        return new RowTransactionDetailHeaderBinding((ConstraintLayout) view, linearLayout, typography2OnNavigationEvent, space, typography6OnNavigationEvent, tdsImageViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, space2, subTypography13OnNavigationEvent, tdsTooltipV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, lottieAnimationViewOnNavigationEvent, frameLayout, tdsRoundLayoutOnNavigationEvent2, tdsImageViewOnNavigationEvent3, subTypography11OnNavigationEvent, tdsButtonV1ViewOnNavigationEvent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
