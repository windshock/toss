package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getErrorMSG implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final LottieAnimationView onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final AnimateText onNavigationEvent;

    private getErrorMSG(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateText animateText, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View) {
        this.IAuthTabCallback = constraintLayout;
        this.onNavigationEvent = animateText;
        this.onExtraCallback = lottieAnimationView;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static getErrorMSG onExtraCallback(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        int i = R.id.autoSkipAnimateText;
        AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (animateTextOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.autoSkipLottie))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null) {
            return new getErrorMSG((ConstraintLayout) view, animateTextOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
