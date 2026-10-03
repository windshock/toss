package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ui.view.YoloSelectStepperView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_API_FinishAPI implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1View IAuthTabCallback;
    public final TdsBottomCtaV1View onExtraCallback;
    public final YoloSelectStepperView onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final RecyclerView onWarmupCompleted;

    private UST_API_FinishAPI(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull TdsTopV1View tdsTopV1View, @NonNull YoloSelectStepperView yoloSelectStepperView) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onWarmupCompleted = recyclerView;
        this.IAuthTabCallback = tdsTopV1View;
        this.onExtraCallbackWithResult = yoloSelectStepperView;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static UST_API_FinishAPI onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            i = R.id.yoloSelectStepper;
            YoloSelectStepperView yoloSelectStepperView = (YoloSelectStepperView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (yoloSelectStepperView != null) {
                return new UST_API_FinishAPI((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, yoloSelectStepperView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
