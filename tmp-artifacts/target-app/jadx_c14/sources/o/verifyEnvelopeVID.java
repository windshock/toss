package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifyEnvelopeVID implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final TdsTopV1T03View onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private verifyEnvelopeVID(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.onWarmupCompleted = constraintLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onExtraCallback = tdsTopV1T03View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static verifyEnvelopeVID onExtraCallbackWithResult(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.top;
            TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsTopV1T03ViewOnNavigationEvent != null) {
                return new verifyEnvelopeVID(constraintLayout, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayout, tdsTopV1T03ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
