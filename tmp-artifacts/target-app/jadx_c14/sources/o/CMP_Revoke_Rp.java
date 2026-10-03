package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Revoke_Rp implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTabV1View IAuthTabCallback;
    public final Toolbar onExtraCallback;
    private final LinearLayout onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final ViewPager2 onWarmupCompleted;

    private CMP_Revoke_Rp(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTabV1View tdsTabV1View, @NonNull Toolbar toolbar, @NonNull ViewPager2 viewPager2) {
        this.onExtraCallbackWithResult = linearLayout;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = tdsTabV1View;
        this.onExtraCallback = toolbar;
        this.onWarmupCompleted = viewPager2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static CMP_Revoke_Rp onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CMP_Revoke_Rp onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_expected_bill_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CMP_Revoke_Rp onExtraCallback(@NonNull View view) {
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        ViewPager2 viewPager2OnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tabLayout))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (viewPager2OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.viewPager))) != null) {
            return new CMP_Revoke_Rp((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, toolbarOnNavigationEvent, viewPager2OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
