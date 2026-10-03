package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UTIL_RemoveFile implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV2View IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final ScrollView onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private UTIL_RemoveFile(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ScrollView scrollView, @NonNull TdsTopV2View tdsTopV2View) {
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = linearLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = scrollView;
        this.IAuthTabCallback = tdsTopV2View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static UTIL_RemoveFile onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nextStepCta))) != null) {
            i = R.id.scrollView;
            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (scrollView != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new UTIL_RemoveFile((ConstraintLayout) view, linearLayout, tdsBottomCtaV1ViewOnNavigationEvent, scrollView, tdsTopV2ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
