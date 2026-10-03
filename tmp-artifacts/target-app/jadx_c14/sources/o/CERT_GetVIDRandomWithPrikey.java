package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.anim.top.AnimateTop;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetVIDRandomWithPrikey implements SearchBarKtExternalSyntheticLambda5 {
    public final AnimateTop IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final TdsBottomCtaV1View onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final LottieAnimationView onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetVIDRandomWithPrikey(@NonNull ConstraintLayout constraintLayout, @NonNull AnimateTop animateTop, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = animateTop;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = lottieAnimationView;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CERT_GetVIDRandomWithPrikey onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetVIDRandomWithPrikey onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_mobile_license, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_GetVIDRandomWithPrikey onExtraCallback(@NonNull View view) {
        AppBarLayout appBarLayoutOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.animateTop;
        AnimateTop animateTopOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (animateTopOnNavigationEvent != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayout))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_GetVIDRandomWithPrikey((ConstraintLayout) view, animateTopOnNavigationEvent, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
