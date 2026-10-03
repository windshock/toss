package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_SignedAndEnvelopedData implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final FragmentContainerView onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private CMS_SignedAndEnvelopedData(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull Toolbar toolbar) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onNavigationEvent = fragmentContainerView;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static CMS_SignedAndEnvelopedData onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CMS_SignedAndEnvelopedData onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_unblock_session, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMS_SignedAndEnvelopedData onNavigationEvent(@NonNull View view) {
        FragmentContainerView fragmentContainerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appbarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (fragmentContainerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nav_host_fragment))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CMS_SignedAndEnvelopedData((ConstraintLayout) view, appBarLayoutOnNavigationEvent, fragmentContainerViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
