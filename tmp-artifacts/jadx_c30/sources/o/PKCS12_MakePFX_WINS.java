package o;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import viva.republica.toss.R;
import viva.republica.toss.widget.LottiePlayCountAnimationView;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PKCS12_MakePFX_WINS implements SearchBarKtExternalSyntheticLambda5 {
    public final LottiePlayCountAnimationView IAuthTabCallback;
    private final ScrollView asInterface;
    public final LottiePlayCountAnimationView onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final AnimateText onNavigationEvent;
    public final AnimateText onWarmupCompleted;

    private PKCS12_MakePFX_WINS(@NonNull ScrollView scrollView, @NonNull AnimateText animateText, @NonNull TdsImageView tdsImageView, @NonNull LottiePlayCountAnimationView lottiePlayCountAnimationView, @NonNull LottiePlayCountAnimationView lottiePlayCountAnimationView2, @NonNull AnimateText animateText2) {
        this.asInterface = scrollView;
        this.onNavigationEvent = animateText;
        this.onExtraCallbackWithResult = tdsImageView;
        this.IAuthTabCallback = lottiePlayCountAnimationView;
        this.onExtraCallback = lottiePlayCountAnimationView2;
        this.onWarmupCompleted = animateText2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.asInterface;
    }

    public static PKCS12_MakePFX_WINS IAuthTabCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        LottiePlayCountAnimationView lottiePlayCountAnimationViewOnNavigationEvent;
        LottiePlayCountAnimationView lottiePlayCountAnimationViewOnNavigationEvent2;
        AnimateText animateTextOnNavigationEvent;
        int i = R.id.description;
        AnimateText animateTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (animateTextOnNavigationEvent2 != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null && (lottiePlayCountAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loadingLottie))) != null && (lottiePlayCountAnimationViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new PKCS12_MakePFX_WINS((ScrollView) view, animateTextOnNavigationEvent2, tdsImageViewOnNavigationEvent, lottiePlayCountAnimationViewOnNavigationEvent, lottiePlayCountAnimationViewOnNavigationEvent2, animateTextOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
