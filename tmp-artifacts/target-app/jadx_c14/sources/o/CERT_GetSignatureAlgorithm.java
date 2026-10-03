package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetSignatureAlgorithm implements SearchBarKtExternalSyntheticLambda5 {
    public final ViewPager2 IAuthTabCallback;
    public final TdsTabV1View onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetSignatureAlgorithm(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTabV1View tdsTabV1View, @NonNull Toolbar toolbar, @NonNull ViewPager2 viewPager2) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onExtraCallback = tdsTabV1View;
        this.onWarmupCompleted = toolbar;
        this.IAuthTabCallback = viewPager2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static CERT_GetSignatureAlgorithm onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CERT_GetSignatureAlgorithm onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_haptic_showcase, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CERT_GetSignatureAlgorithm onNavigationEvent(@NonNull View view) {
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        ViewPager2 viewPager2OnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tab))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (viewPager2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_pager))) != null) {
            return new CERT_GetSignatureAlgorithm((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, toolbarOnNavigationEvent, viewPager2OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
