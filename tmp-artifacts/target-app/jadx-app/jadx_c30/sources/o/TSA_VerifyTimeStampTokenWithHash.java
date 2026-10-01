package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TSA_VerifyTimeStampTokenWithHash implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final TdsBottomCtaV1View onExtraCallback;
    public final TdsScrollView onExtraCallbackWithResult;
    public final TdsListRowV1View onNavigationEvent;
    public final TdsTopV2View onWarmupCompleted;

    private TSA_VerifyTimeStampTokenWithHash(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout, @NonNull TdsScrollView tdsScrollView, @NonNull TdsTopV2View tdsTopV2View, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.IAuthTabCallback = linearLayout;
        this.onExtraCallbackWithResult = tdsScrollView;
        this.onWarmupCompleted = tdsTopV2View;
        this.onNavigationEvent = tdsListRowV1View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static TSA_VerifyTimeStampTokenWithHash IAuthTabCallback(@NonNull View view) {
        TdsScrollView tdsScrollViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scrollView))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_card_more))) != null) {
                return new TSA_VerifyTimeStampTokenWithHash((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, tdsScrollViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
