package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_VerifyEnvelopeVID implements SearchBarKtExternalSyntheticLambda5 {
    public final AnimateText IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final ComposeView asBinder;
    public final TdsTopV2View asInterface;
    public final ConstraintLayout onExtraCallback;
    public final LottieAnimationView onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final Toolbar onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CERT_VerifyEnvelopeVID(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull AnimateText animateText, @NonNull ConstraintLayout constraintLayout2, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ComposeView composeView, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = animateText;
        this.onExtraCallback = constraintLayout2;
        this.onExtraCallbackWithResult = lottieAnimationView;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.asBinder = composeView;
        this.onTransact = toolbar;
        this.asInterface = tdsTopV2View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CERT_VerifyEnvelopeVID onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CERT_VerifyEnvelopeVID onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_password_reset_guide_varient, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_VerifyEnvelopeVID IAuthTabCallback(@NonNull View view) {
        AnimateText animateTextOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        ComposeView composeViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.appbarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.autoSkipAnimateText))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.autoSkipContainer))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.autoSkipLottie))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.certComposeView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_VerifyEnvelopeVID((ConstraintLayout) view, appBarLayoutOnNavigationEvent, animateTextOnNavigationEvent, constraintLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, composeViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
