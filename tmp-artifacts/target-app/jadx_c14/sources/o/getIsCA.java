package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIsCA implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1View IAuthTabCallback;
    public final TdsBottomCtaV1View onExtraCallback;
    public final LottieAnimationView onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private getIsCA(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsTopV1View tdsTopV1View) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = lottieAnimationView;
        this.IAuthTabCallback = tdsTopV1View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static getIsCA onNavigationEvent(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.cta_unblock_session_intro;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie_unblock_session_intro))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_text))) != null) {
            return new getIsCA((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
