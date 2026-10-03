package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_DecSignedAndEnvelopedData implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final Toolbar IAuthTabCallbackStub;
    public final ConstraintLayout onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final RecyclerView onNavigationEvent;
    public final SwipeRefreshLayout onWarmupCompleted;

    private CMS_DecSignedAndEnvelopedData(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = recyclerView;
        this.onWarmupCompleted = swipeRefreshLayout;
        this.onExtraCallback = constraintLayout2;
        this.IAuthTabCallbackStub = toolbar;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CMS_DecSignedAndEnvelopedData onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMS_DecSignedAndEnvelopedData onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_toss_account_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CMS_DecSignedAndEnvelopedData onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent;
        int i = R.id.app_bar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.henemBoxCta))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recycler_view))) != null && (swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.refresh_layout))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null) {
                return new CMS_DecSignedAndEnvelopedData(constraintLayout, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, swipeRefreshLayoutOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
