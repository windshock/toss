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
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetBasicConstraints implements SearchBarKtExternalSyntheticLambda5 {
    public final SwipeRefreshLayout IAuthTabCallback;
    public final Toolbar IAuthTabCallbackStub;
    private final ConstraintLayout asInterface;
    public final TdsBottomCtaV1View onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final TdsResultV0View onNavigationEvent;
    public final RecyclerView onWarmupCompleted;

    private CERT_GetBasicConstraints(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsResultV0View tdsResultV0View, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.asInterface = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onNavigationEvent = tdsResultV0View;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onWarmupCompleted = recyclerView;
        this.IAuthTabCallback = swipeRefreshLayout;
        this.IAuthTabCallbackStub = toolbar;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static CERT_GetBasicConstraints IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CERT_GetBasicConstraints IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_card_notification_transaction_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_GetBasicConstraints onExtraCallback(@NonNull View view) {
        TdsResultV0View tdsResultV0ViewOnNavigationEvent;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.emptyView))) != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fixedBottomCta))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.swipeRefreshLayout))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_GetBasicConstraints((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsResultV0ViewOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, recyclerViewOnNavigationEvent, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
