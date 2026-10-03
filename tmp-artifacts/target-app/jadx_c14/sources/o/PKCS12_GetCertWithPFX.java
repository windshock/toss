package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PKCS12_GetCertWithPFX implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV2View onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private PKCS12_GetCertWithPFX(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull TdsTopV2View tdsTopV2View) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsImageView;
        this.onExtraCallback = tdsTopV2View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static PKCS12_GetCertWithPFX onExtraCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.icon))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new PKCS12_GetCertWithPFX((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
