package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TSA_GetTimeStampTokenInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    public final TdsTopV1View IAuthTabCallbackDefault;
    public final ComposeView onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final ScrollView onWarmupCompleted;

    private TSA_GetTimeStampTokenInfo(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout, @NonNull ComposeView composeView, @NonNull ConstraintLayout constraintLayout2, @NonNull ScrollView scrollView, @NonNull TdsTopV1View tdsTopV1View) {
        this.onTransact = constraintLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.IAuthTabCallback = linearLayout;
        this.onExtraCallback = composeView;
        this.onNavigationEvent = constraintLayout2;
        this.onWarmupCompleted = scrollView;
        this.IAuthTabCallbackDefault = tdsTopV1View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static TSA_GetTimeStampTokenInfo onNavigationEvent(@NonNull View view) {
        ComposeView composeViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.disclaimer))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.scrollView;
                ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (scrollView != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                    return new TSA_GetTimeStampTokenInfo(constraintLayout, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, composeViewOnNavigationEvent, constraintLayout, scrollView, tdsTopV1ViewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
