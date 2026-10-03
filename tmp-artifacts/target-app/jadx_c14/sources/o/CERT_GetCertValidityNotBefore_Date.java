package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetCertValidityNotBefore_Date implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    public final Typography5 IAuthTabCallbackDefault;
    public final LottieAnimationView IAuthTabCallbackStub;
    private final ConstraintLayout IAuthTabCallbackStubProxy;
    public final SubTypography8 asBinder;
    public final LinearLayout asInterface;
    public final TdsButtonV1View onExtraCallback;
    public final WebView onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final Typography5 onTransact;
    public final LinearLayout onWarmupCompleted;

    private CERT_GetCertValidityNotBefore_Date(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull WebView webView, @NonNull LinearLayout linearLayout, @NonNull Toolbar toolbar, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull LinearLayout linearLayout2, @NonNull Typography5 typography5, @NonNull LottieAnimationView lottieAnimationView, @NonNull Typography5 typography52, @NonNull SubTypography8 subTypography8) {
        this.IAuthTabCallbackStubProxy = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onExtraCallbackWithResult = webView;
        this.onWarmupCompleted = linearLayout;
        this.IAuthTabCallback = toolbar;
        this.onExtraCallback = tdsButtonV1View;
        this.asInterface = linearLayout2;
        this.onTransact = typography5;
        this.IAuthTabCallbackStub = lottieAnimationView;
        this.IAuthTabCallbackDefault = typography52;
        this.asBinder = subTypography8;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStubProxy;
    }

    public static CERT_GetCertValidityNotBefore_Date onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_GetCertValidityNotBefore_Date onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_credit_card_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_GetCertValidityNotBefore_Date onExtraCallback(@NonNull View view) {
        Toolbar toolbarOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        SubTypography8 subTypography8OnNavigationEvent;
        int i = R.id.activityCreditCardWebViewAppBar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null) {
            i = R.id.activityCreditCardWebViewBrowser;
            WebView webView = (WebView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (webView != null) {
                i = R.id.activityCreditCardWebViewTextContainer;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.activityCreditCardWebViewToolbar))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bannerButtonView))) != null) {
                    i = R.id.bannerContainer;
                    LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (linearLayout2 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bannerTitleView))) != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loadingLottieView))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loadingText))) != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loadingTextProvider))) != null) {
                        return new CERT_GetCertValidityNotBefore_Date((ConstraintLayout) view, appBarLayoutOnNavigationEvent, webView, linearLayout, toolbarOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, linearLayout2, typography5OnNavigationEvent, lottieAnimationViewOnNavigationEvent, typography5OnNavigationEvent2, subTypography8OnNavigationEvent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
