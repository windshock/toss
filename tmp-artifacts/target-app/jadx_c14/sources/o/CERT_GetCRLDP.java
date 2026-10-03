package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetCRLDP implements SearchBarKtExternalSyntheticLambda5 {
    public final LottieAnimationView IAuthTabCallback;
    public final TdsTopV1View IAuthTabCallbackDefault;
    private final ConstraintLayout asBinder;
    public final AppBarLayout onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final TdsListRowV1View onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetCRLDP(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.asBinder = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.IAuthTabCallback = lottieAnimationView;
        this.onNavigationEvent = tdsListRowV1View;
        this.onWarmupCompleted = toolbar;
        this.IAuthTabCallbackDefault = tdsTopV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CERT_GetCRLDP onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CERT_GetCRLDP IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_card_notification_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_GetCRLDP onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixedBottomCta))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tipRow))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_GetCRLDP((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
