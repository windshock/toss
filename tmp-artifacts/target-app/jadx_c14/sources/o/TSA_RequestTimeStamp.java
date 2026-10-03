package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TSA_RequestTimeStamp implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    private final LinearLayout asBinder;
    public final TdsBottomCtaV1View onExtraCallback;
    public final TdsScrollView onExtraCallbackWithResult;
    public final TdsTopV2View onNavigationEvent;
    public final TdsListRowV1View onWarmupCompleted;

    private TSA_RequestTimeStamp(@NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull LinearLayout linearLayout2, @NonNull TdsScrollView tdsScrollView, @NonNull TdsListRowV1View tdsListRowV1View, @NonNull TdsTopV2View tdsTopV2View) {
        this.asBinder = linearLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.IAuthTabCallback = linearLayout2;
        this.onExtraCallbackWithResult = tdsScrollView;
        this.onWarmupCompleted = tdsListRowV1View;
        this.onNavigationEvent = tdsTopV2View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.asBinder;
    }

    public static TSA_RequestTimeStamp onExtraCallback(@NonNull View view) {
        TdsScrollView tdsScrollViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null) {
            i = R.id.container;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (tdsScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scrollView))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.subtitle))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                return new TSA_RequestTimeStamp((LinearLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, linearLayout, tdsScrollViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
