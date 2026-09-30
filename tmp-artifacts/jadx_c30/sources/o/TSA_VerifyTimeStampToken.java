package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TSA_VerifyTimeStampToken implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final FrameLayout onExtraCallback;
    public final View onExtraCallbackWithResult;
    public final AnimateText onNavigationEvent;
    private final FrameLayout onWarmupCompleted;

    private TSA_VerifyTimeStampToken(@NonNull FrameLayout frameLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull AnimateText animateText) {
        this.onWarmupCompleted = frameLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = view;
        this.onExtraCallback = frameLayout2;
        this.onNavigationEvent = animateText;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static TSA_VerifyTimeStampToken onExtraCallbackWithResult(@NonNull View view) {
        View viewOnNavigationEvent;
        AnimateText animateTextOnNavigationEvent;
        int i = R.id.cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottieBgView))) != null) {
            i = R.id.lottieContainer;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                return new TSA_VerifyTimeStampToken((FrameLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, viewOnNavigationEvent, frameLayout, animateTextOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
