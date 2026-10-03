package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetKeyUsage implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    public final TdsTabV1View onExtraCallbackWithResult;
    public final ViewPager onNavigationEvent;
    private final LinearLayout onWarmupCompleted;

    private CERT_GetKeyUsage(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTabV1View tdsTabV1View, @NonNull Toolbar toolbar, @NonNull ViewPager viewPager) {
        this.onWarmupCompleted = linearLayout;
        this.onExtraCallback = appBarLayout;
        this.onExtraCallbackWithResult = tdsTabV1View;
        this.IAuthTabCallback = toolbar;
        this.onNavigationEvent = viewPager;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static CERT_GetKeyUsage IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CERT_GetKeyUsage onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_credit_loan_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_GetKeyUsage IAuthTabCallback(@NonNull View view) {
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        ViewPager viewPagerOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fluidTab))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (viewPagerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.viewPager))) != null) {
            return new CERT_GetKeyUsage((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, toolbarOnNavigationEvent, viewPagerOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
