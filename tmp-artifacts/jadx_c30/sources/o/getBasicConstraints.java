package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.text.Typography2;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getBasicConstraints implements SearchBarKtExternalSyntheticLambda5 {
    public final LottieAnimationView IAuthTabCallback;
    public final Typography2 onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private getBasicConstraints(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull Typography2 typography2) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = lottieAnimationView;
        this.onExtraCallback = typography2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static getBasicConstraints onWarmupCompleted(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        Typography2 typography2OnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie_complete))) != null && (typography2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.typography2_title))) != null) {
            return new getBasicConstraints((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, typography2OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
