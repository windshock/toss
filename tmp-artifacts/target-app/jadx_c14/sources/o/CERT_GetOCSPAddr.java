package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetOCSPAddr implements SearchBarKtExternalSyntheticLambda5 {
    public final SwipeRefreshLayout IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    public final RecyclerView onExtraCallbackWithResult;
    private final LinearLayout onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetOCSPAddr(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.onNavigationEvent = linearLayout;
        this.onExtraCallback = appBarLayout;
        this.onExtraCallbackWithResult = recyclerView;
        this.IAuthTabCallback = swipeRefreshLayout;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CERT_GetOCSPAddr IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CERT_GetOCSPAddr onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_deposit_wait_account_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CERT_GetOCSPAddr onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.swipeRefreshLayout))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_GetOCSPAddr((LinearLayout) view, appBarLayoutOnNavigationEvent, recyclerViewOnNavigationEvent, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
