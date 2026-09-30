package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetTSASerialNumber implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final TdsTopV2View onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final TdsScrollView onWarmupCompleted;

    private GetTSASerialNumber(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout, @NonNull TdsScrollView tdsScrollView, @NonNull TdsTopV2View tdsTopV2View) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = linearLayout;
        this.onWarmupCompleted = tdsScrollView;
        this.onExtraCallback = tdsTopV2View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static GetTSASerialNumber onExtraCallbackWithResult(@NonNull View view) {
        TdsScrollView tdsScrollViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scrollView))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                return new GetTSASerialNumber((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, tdsScrollViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
