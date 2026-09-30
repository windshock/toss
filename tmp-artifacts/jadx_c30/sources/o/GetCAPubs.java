package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetCAPubs implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final RecyclerView onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private GetCAPubs(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView) {
        this.IAuthTabCallback = constraintLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onNavigationEvent = recyclerView;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static GetCAPubs onExtraCallback(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.list))) != null) {
            return new GetCAPubs((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
