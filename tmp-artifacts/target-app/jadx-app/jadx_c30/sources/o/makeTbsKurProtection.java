package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class makeTbsKurProtection implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final TdsTopV2View onExtraCallbackWithResult;
    private final FrameLayout onNavigationEvent;
    public final LinearLayout onWarmupCompleted;

    private makeTbsKurProtection(@NonNull FrameLayout frameLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout, @NonNull TdsTopV2View tdsTopV2View) {
        this.onNavigationEvent = frameLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onWarmupCompleted = linearLayout;
        this.onExtraCallbackWithResult = tdsTopV2View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static makeTbsKurProtection onExtraCallback(@NonNull View view) {
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.contents;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new makeTbsKurProtection((FrameLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, tdsTopV2ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
