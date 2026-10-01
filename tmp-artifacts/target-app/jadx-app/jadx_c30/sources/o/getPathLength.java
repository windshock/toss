package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getPathLength implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final LottieAnimationView onNavigationEvent;
    public final TdsTopV1View onWarmupCompleted;

    private getPathLength(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsTopV1View tdsTopV1View) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = lottieAnimationView;
        this.onWarmupCompleted = tdsTopV1View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static getPathLength onWarmupCompleted(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie_error))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_text))) != null) {
            return new getPathLength((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
