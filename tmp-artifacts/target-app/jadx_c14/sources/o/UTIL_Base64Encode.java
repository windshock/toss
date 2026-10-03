package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.view.YoloSelectStepperView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UTIL_Base64Encode implements SearchBarKtExternalSyntheticLambda5 {
    public final YoloSelectStepperView IAuthTabCallback;
    public final TdsBottomCtaV1View onExtraCallback;
    public final TdsTopV2View onExtraCallbackWithResult;
    public final RecyclerView onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private UTIL_Base64Encode(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull TdsTopV2View tdsTopV2View, @NonNull YoloSelectStepperView yoloSelectStepperView) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = recyclerView;
        this.onExtraCallbackWithResult = tdsTopV2View;
        this.IAuthTabCallback = yoloSelectStepperView;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static UTIL_Base64Encode onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            i = R.id.yoloSelectStepper;
            YoloSelectStepperView yoloSelectStepperView = (YoloSelectStepperView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (yoloSelectStepperView != null) {
                return new UTIL_Base64Encode((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, tdsTopV2ViewOnNavigationEvent, yoloSelectStepperView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
