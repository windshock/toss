package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_SetTrustRootCACert implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final TdsSkeletonV1View onExtraCallbackWithResult;
    public final RecyclerView onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_SetTrustRootCACert(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull RecyclerView recyclerView, @NonNull TdsSkeletonV1View tdsSkeletonV1View, @NonNull Toolbar toolbar) {
        this.onExtraCallback = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onNavigationEvent = recyclerView;
        this.onExtraCallbackWithResult = tdsSkeletonV1View;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static CERT_SetTrustRootCACert onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_SetTrustRootCACert onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notification_marketing_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_SetTrustRootCACert onExtraCallback(@NonNull View view) {
        RecyclerView recyclerViewOnNavigationEvent;
        TdsSkeletonV1View tdsSkeletonV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appbarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.notification_terms_list))) != null && (tdsSkeletonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.skeletonView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_SetTrustRootCACert((ConstraintLayout) view, appBarLayoutOnNavigationEvent, recyclerViewOnNavigationEvent, tdsSkeletonV1ViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
