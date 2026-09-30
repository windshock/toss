package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCryptoKCMVPMode implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography5 IAuthTabCallback;
    public final TdsImageView asBinder;
    public final AnimateText onExtraCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private setCryptoKCMVPMode(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateText animateText, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull LinearLayout linearLayout, @NonNull Typography5 typography5, @NonNull TdsImageView tdsImageView2) {
        this.onTransact = constraintLayout;
        this.onExtraCallback = animateText;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onNavigationEvent = linearLayout;
        this.IAuthTabCallback = typography5;
        this.asBinder = tdsImageView2;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static setCryptoKCMVPMode onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login_nudge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static setCryptoKCMVPMode onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        int i = R.id.animateText;
        AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (animateTextOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null) {
            i = R.id.kakaoLoginButton;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.kakaoLoginTitle))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.kakaoLogo))) != null) {
                return new setCryptoKCMVPMode((ConstraintLayout) view, animateTextOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, linearLayout, typography5OnNavigationEvent, tdsImageViewOnNavigationEvent2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
