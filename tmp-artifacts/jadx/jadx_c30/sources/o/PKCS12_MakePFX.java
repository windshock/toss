package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;
import viva.republica.toss.widget.LottiePlayCountAnimationView;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PKCS12_MakePFX implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final LottiePlayCountAnimationView onExtraCallback;
    public final AnimateText onExtraCallbackWithResult;
    public final AnimateText onNavigationEvent;
    private final FrameLayout onWarmupCompleted;

    private PKCS12_MakePFX(@NonNull FrameLayout frameLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull AnimateText animateText, @NonNull LottiePlayCountAnimationView lottiePlayCountAnimationView, @NonNull AnimateText animateText2) {
        this.onWarmupCompleted = frameLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = animateText;
        this.onExtraCallback = lottiePlayCountAnimationView;
        this.onNavigationEvent = animateText2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static PKCS12_MakePFX onExtraCallback(@NonNull View view) {
        AnimateText animateTextOnNavigationEvent;
        LottiePlayCountAnimationView lottiePlayCountAnimationViewOnNavigationEvent;
        AnimateText animateTextOnNavigationEvent2;
        int i = R.id.cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.description))) != null && (lottiePlayCountAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null && (animateTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new PKCS12_MakePFX((FrameLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, animateTextOnNavigationEvent, lottiePlayCountAnimationViewOnNavigationEvent, animateTextOnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
