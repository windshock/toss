package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetSymmIV implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsRecyclerView IAuthTabCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsTopV1View onWarmupCompleted;

    private GetSymmIV(@NonNull ConstraintLayout constraintLayout, @NonNull TdsRecyclerView tdsRecyclerView, @NonNull TdsTopV1View tdsTopV1View) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = tdsRecyclerView;
        this.onWarmupCompleted = tdsTopV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static GetSymmIV onExtraCallback(@NonNull View view) {
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.rv_bank_list;
        TdsRecyclerView tdsRecyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsRecyclerViewOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top_bank_list))) != null) {
            return new GetSymmIV((ConstraintLayout) view, tdsRecyclerViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
