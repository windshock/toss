package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PKCS12_GetCertWithPFX_ENCPKCS8 implements SearchBarKtExternalSyntheticLambda5 {
    public final AnimateText IAuthTabCallback;
    public final TdsImageView onExtraCallback;
    public final AnimateText onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    private final FrameLayout onWarmupCompleted;

    private PKCS12_GetCertWithPFX_ENCPKCS8(@NonNull FrameLayout frameLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull AnimateText animateText, @NonNull TdsImageView tdsImageView, @NonNull AnimateText animateText2) {
        this.onWarmupCompleted = frameLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = animateText;
        this.onExtraCallback = tdsImageView;
        this.IAuthTabCallback = animateText2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static PKCS12_GetCertWithPFX_ENCPKCS8 onExtraCallbackWithResult(@NonNull View view) {
        AnimateText animateTextOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        AnimateText animateTextOnNavigationEvent2;
        int i = R.id.cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.description))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.imageView))) != null && (animateTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new PKCS12_GetCertWithPFX_ENCPKCS8((FrameLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, animateTextOnNavigationEvent, tdsImageViewOnNavigationEvent, animateTextOnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
