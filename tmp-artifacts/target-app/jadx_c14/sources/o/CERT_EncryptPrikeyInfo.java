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
public final class CERT_EncryptPrikeyInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    private final LinearLayout IAuthTabCallbackDefault;
    public final RecyclerView onExtraCallback;
    public final LinearLayout onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final SwipeRefreshLayout onWarmupCompleted;

    private CERT_EncryptPrikeyInfo(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackDefault = linearLayout;
        this.onNavigationEvent = appBarLayout;
        this.onExtraCallback = recyclerView;
        this.onExtraCallbackWithResult = linearLayout2;
        this.onWarmupCompleted = swipeRefreshLayout;
        this.IAuthTabCallback = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CERT_EncryptPrikeyInfo onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CERT_EncryptPrikeyInfo onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_card_notification_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CERT_EncryptPrikeyInfo onExtraCallbackWithResult(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appbar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.list))) != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.swiperefresh;
            SwipeRefreshLayout swipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (swipeRefreshLayoutOnNavigationEvent != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CERT_EncryptPrikeyInfo(linearLayout, appBarLayoutOnNavigationEvent, recyclerViewOnNavigationEvent, linearLayout, swipeRefreshLayoutOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
