package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isFreeze implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    public final com.airbnb.lottie.LottieAnimationView IAuthTabCallback;
    public final AnimateText onExtraCallback;
    public final FrameLayout onExtraCallbackWithResult;
    public final View onNavigationEvent;
    private final FrameLayout onTransact;
    public final TdsImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayoutIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return frameLayoutIAuthTabCallback;
    }

    private isFreeze(@NonNull FrameLayout frameLayout, @NonNull AnimateText animateText, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull TdsImageView tdsImageView, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
        this.onTransact = frameLayout;
        this.onExtraCallback = animateText;
        this.onNavigationEvent = view;
        this.onExtraCallbackWithResult = frameLayout2;
        this.onWarmupCompleted = tdsImageView;
        this.IAuthTabCallback = lottieAnimationView;
    }

    public FrameLayout IAuthTabCallback() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            frameLayout = this.onTransact;
            int i4 = 23 / 0;
        } else {
            frameLayout = this.onTransact;
        }
        int i5 = i2 + 17;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return frameLayout;
    }

    public static isFreeze onExtraCallback(@NonNull View view) {
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.animate_text;
        AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (animateTextOnNavigationEvent != null) {
            int i3 = IAuthTabCallbackDefault + 19;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.confetti_background);
                obj.hashCode();
                throw null;
            }
            i2 = R.id.confetti_background;
            View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (viewOnNavigationEvent != null) {
                int i4 = IAuthTabCallbackDefault + 97;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.image);
                    obj.hashCode();
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) view;
                i2 = R.id.image;
                TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (tdsImageViewOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.lottie_confetti))) != null) {
                    isFreeze isfreeze = new isFreeze(frameLayout, animateTextOnNavigationEvent, viewOnNavigationEvent, frameLayout, tdsImageViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent);
                    int i5 = asInterface + 57;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        return isfreeze;
                    }
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
