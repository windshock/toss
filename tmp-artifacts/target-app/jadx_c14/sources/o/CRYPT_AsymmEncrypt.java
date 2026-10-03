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
public final class CRYPT_AsymmEncrypt implements SearchBarKtExternalSyntheticLambda5 {
    public final FragmentContainerView IAuthTabCallback;
    public final Toolbar onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private CRYPT_AsymmEncrypt(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull Toolbar toolbar) {
        this.onWarmupCompleted = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = fragmentContainerView;
        this.onExtraCallbackWithResult = toolbar;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static CRYPT_AsymmEncrypt onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CRYPT_AsymmEncrypt onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_session, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CRYPT_AsymmEncrypt IAuthTabCallback(@NonNull View view) {
        FragmentContainerView fragmentContainerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appbarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (fragmentContainerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nav_host_fragment))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CRYPT_AsymmEncrypt((ConstraintLayout) view, appBarLayoutOnNavigationEvent, fragmentContainerViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
