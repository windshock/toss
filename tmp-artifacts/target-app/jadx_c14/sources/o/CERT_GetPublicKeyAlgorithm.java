package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetPublicKeyAlgorithm implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final FrameLayout onExtraCallback;
    private final CoordinatorLayout onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetPublicKeyAlgorithm(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull Toolbar toolbar) {
        this.onNavigationEvent = coordinatorLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallback = frameLayout;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CERT_GetPublicKeyAlgorithm onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetPublicKeyAlgorithm onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_GetPublicKeyAlgorithm onExtraCallback(@NonNull View view) {
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null) {
            i = R.id.fragmentContainer;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CERT_GetPublicKeyAlgorithm((CoordinatorLayout) view, appBarLayoutOnNavigationEvent, frameLayout, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
