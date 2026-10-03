package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.webview.TossWebView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class checkCryptoState implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final TossWebView onExtraCallback;
    public final updateCertificate_NoConf onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final NestedScrollView onWarmupCompleted;

    private checkCryptoState(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TossWebView tossWebView, @NonNull updateCertificate_NoConf updatecertificate_noconf, @NonNull NestedScrollView nestedScrollView) {
        this.asBinder = constraintLayout;
        this.onNavigationEvent = linearLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onExtraCallback = tossWebView;
        this.onExtraCallbackWithResult = updatecertificate_noconf;
        this.onWarmupCompleted = nestedScrollView;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static checkCryptoState IAuthTabCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TossWebView tossWebViewOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nextStepCta))) != null && (tossWebViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.pdfWebView))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progress))) != null) {
            updateCertificate_NoConf updatecertificate_noconfOnExtraCallback = updateCertificate_NoConf.onExtraCallback(viewOnNavigationEvent);
            i = R.id.scrollView;
            NestedScrollView nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (nestedScrollViewOnNavigationEvent != null) {
                return new checkCryptoState((ConstraintLayout) view, linearLayout, tdsBottomCtaV1ViewOnNavigationEvent, tossWebViewOnNavigationEvent, updatecertificate_noconfOnExtraCallback, nestedScrollViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
