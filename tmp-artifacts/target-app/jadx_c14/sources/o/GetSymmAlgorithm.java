package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetSymmAlgorithm implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsListRowV1View IAuthTabCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final RecyclerView onWarmupCompleted;

    private GetSymmAlgorithm(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull TdsListRowV1View tdsListRowV1View) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onWarmupCompleted = recyclerView;
        this.IAuthTabCallback = tdsListRowV1View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static GetSymmAlgorithm onWarmupCompleted(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent;
        int i = R.id.fixedBottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (tdsListRowV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rowFail))) != null) {
            return new GetSymmAlgorithm((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, tdsListRowV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
