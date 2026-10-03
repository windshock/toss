package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_UTIL_HPPTDownloadFile implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final RecyclerView onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final SwipeRefreshLayout onWarmupCompleted;

    private UST_UTIL_HPPTDownloadFile(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallback = recyclerView;
        this.onNavigationEvent = constraintLayout2;
        this.onWarmupCompleted = swipeRefreshLayout;
        this.onExtraCallbackWithResult = toolbar;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static UST_UTIL_HPPTDownloadFile onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static UST_UTIL_HPPTDownloadFile onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_notification_bank_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static UST_UTIL_HPPTDownloadFile onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.swipeRefreshLayout;
            SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (swipeRefreshLayoutOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new UST_UTIL_HPPTDownloadFile(constraintLayout, appBarLayoutOnNavigationEvent, recyclerViewOnNavigationEvent, constraintLayout, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
