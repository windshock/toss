package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getX509Certificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    public final TdsTopV1View onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final RecyclerView onWarmupCompleted;

    private getX509Certificate(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsTopV1View tdsTopV1View) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onWarmupCompleted = recyclerView;
        this.onNavigationEvent = constraintLayout2;
        this.onExtraCallback = tdsTopV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static getX509Certificate onNavigationEvent(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.list))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.titleMessage;
            TdsTopV1View tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsTopV1ViewOnNavigationEvent != null) {
                return new getX509Certificate(constraintLayout, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, constraintLayout, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
