package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetVersion implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final RecyclerView onNavigationEvent;
    public final TdsResultV0View onWarmupCompleted;

    private CERT_GetVersion(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsResultV0View tdsResultV0View, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onWarmupCompleted = tdsResultV0View;
        this.onNavigationEvent = recyclerView;
        this.onExtraCallbackWithResult = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static CERT_GetVersion onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetVersion onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notification_function_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CERT_GetVersion onExtraCallbackWithResult(@NonNull View view) {
        TdsResultV0View tdsResultV0ViewOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsResultV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.empty_view))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.notification_terms_list))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_GetVersion((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsResultV0ViewOnNavigationEvent, recyclerViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
