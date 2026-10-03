package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;
import viva.republica.toss.widget.FloatingLoadingView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_VerifySignedDataWithHash implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final Toolbar onExtraCallback;
    public final TdsResultV0View onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final TdsRecyclerView onTransact;
    public final FloatingLoadingView onWarmupCompleted;

    private CMS_VerifySignedDataWithHash(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsResultV0View tdsResultV0View, @NonNull Typography5 typography5, @NonNull FloatingLoadingView floatingLoadingView, @NonNull Toolbar toolbar, @NonNull TdsRecyclerView tdsRecyclerView) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsResultV0View;
        this.onNavigationEvent = typography5;
        this.onWarmupCompleted = floatingLoadingView;
        this.onExtraCallback = toolbar;
        this.onTransact = tdsRecyclerView;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CMS_VerifySignedDataWithHash onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CMS_VerifySignedDataWithHash onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_user_transactions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMS_VerifySignedDataWithHash onNavigationEvent(@NonNull View view) {
        TdsResultV0View tdsResultV0ViewOnNavigationEvent;
        Typography5 typography5OnNavigationEvent;
        FloatingLoadingView floatingLoadingViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsRecyclerView tdsRecyclerViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.emptyView))) != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.filterButton))) != null && (floatingLoadingViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.loadingView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsRecyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.transactionsList))) != null) {
            return new CMS_VerifySignedDataWithHash((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsResultV0ViewOnNavigationEvent, typography5OnNavigationEvent, floatingLoadingViewOnNavigationEvent, toolbarOnNavigationEvent, tdsRecyclerViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
