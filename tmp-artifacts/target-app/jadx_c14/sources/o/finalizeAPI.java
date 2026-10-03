package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class finalizeAPI implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final TdsTopV1View IAuthTabCallbackStub;
    public final TdsTopV1View asBinder;
    public final Toolbar asInterface;
    public final LottieAnimationView onExtraCallback;
    public final LottieAnimationView onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final LinearLayout onWarmupCompleted;

    private finalizeAPI(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull LinearLayout linearLayout, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View, @NonNull TdsTopV1View tdsTopV1View2) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallback = lottieAnimationView;
        this.onExtraCallbackWithResult = lottieAnimationView2;
        this.onWarmupCompleted = linearLayout;
        this.asInterface = toolbar;
        this.IAuthTabCallbackStub = tdsTopV1View;
        this.asBinder = tdsTopV1View2;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static finalizeAPI onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static finalizeAPI onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_notification_suggest, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static finalizeAPI IAuthTabCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent2;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent2;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixedBottomCta))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottieAccountNotification))) != null && (lottieAnimationViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottieAccountRegister))) != null) {
            i = R.id.termsContainer;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null && (tdsTopV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.topAfter))) != null) {
                return new finalizeAPI((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent2, linearLayout, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
