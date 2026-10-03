package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_UTIL_RemoveFile implements SearchBarKtExternalSyntheticLambda5 {
    public final ConstraintLayout IAuthTabCallback;
    public final Toolbar IAuthTabCallbackStub;
    private final ConstraintLayout asBinder;
    public final SwipeRefreshLayout onExtraCallback;
    public final TdsRecyclerView onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    private UST_UTIL_RemoveFile(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsRecyclerView tdsRecyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = tdsRecyclerView;
        this.IAuthTabCallback = constraintLayout2;
        this.onExtraCallback = swipeRefreshLayout;
        this.IAuthTabCallbackStub = toolbar;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static UST_UTIL_RemoveFile onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static UST_UTIL_RemoveFile onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_notification_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static UST_UTIL_RemoveFile onWarmupCompleted(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsRecyclerView tdsRecyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixedBottomCta))) != null && (tdsRecyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.swipeRefreshLayout;
            SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (swipeRefreshLayoutOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new UST_UTIL_RemoveFile(constraintLayout, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsRecyclerViewOnNavigationEvent, constraintLayout, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
