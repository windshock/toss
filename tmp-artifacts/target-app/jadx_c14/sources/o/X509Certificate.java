package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.list.agreements.v1.TdsAgreementRowV1T04View;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;
import viva.republica.toss.plcc.view.showcase.PlccShowcaseView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509Certificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsAgreementRowV1T04View IAuthTabCallback;
    public final PlccShowcaseView onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final TdsTopV1T03View onWarmupCompleted;

    private X509Certificate(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout, @NonNull PlccShowcaseView plccShowcaseView, @NonNull TdsTopV1T03View tdsTopV1T03View, @NonNull TdsAgreementRowV1T04View tdsAgreementRowV1T04View) {
        this.onTransact = constraintLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = linearLayout;
        this.onExtraCallback = plccShowcaseView;
        this.onWarmupCompleted = tdsTopV1T03View;
        this.IAuthTabCallback = tdsAgreementRowV1T04View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static X509Certificate IAuthTabCallback(@NonNull View view) {
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        TdsAgreementRowV1T04View tdsAgreementRowV1T04ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.colorContainer;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                i = R.id.showcaseCardView;
                PlccShowcaseView plccShowcaseView = (PlccShowcaseView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (plccShowcaseView != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (tdsAgreementRowV1T04ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.transportationRow))) != null) {
                    return new X509Certificate((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, plccShowcaseView, tdsTopV1T03ViewOnNavigationEvent, tdsAgreementRowV1T04ViewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
