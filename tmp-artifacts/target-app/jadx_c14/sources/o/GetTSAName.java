package o;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTSAName implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final TdsTopV1View IAuthTabCallbackDefault;
    private final ConstraintLayout asBinder;
    public final LinearLayout onExtraCallback;
    public final Typography5 onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final HorizontalScrollView onWarmupCompleted;

    private GetTSAName(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull Typography5 typography5, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull TdsTopV1View tdsTopV1View) {
        this.asBinder = constraintLayout;
        this.onExtraCallback = linearLayout;
        this.onExtraCallbackWithResult = typography5;
        this.onWarmupCompleted = horizontalScrollView;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallbackDefault = tdsTopV1View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static GetTSAName onNavigationEvent(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.card_container;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.card_name))) != null) {
            i = R.id.card_scroll_view;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (horizontalScrollView != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.selected_image))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new GetTSAName((ConstraintLayout) view, linearLayout, typography5OnNavigationEvent, horizontalScrollView, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
