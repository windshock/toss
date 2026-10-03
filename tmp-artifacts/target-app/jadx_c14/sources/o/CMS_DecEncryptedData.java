package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import viva.republica.toss.R;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_DecEncryptedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTabV1View IAuthTabCallback;
    public final AppBarLayout onExtraCallback;
    private final LinearLayout onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;
    public final SwipeControlViewPager onWarmupCompleted;

    private CMS_DecEncryptedData(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTabV1View tdsTabV1View, @NonNull Toolbar toolbar, @NonNull SwipeControlViewPager swipeControlViewPager) {
        this.onExtraCallbackWithResult = linearLayout;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = tdsTabV1View;
        this.onNavigationEvent = toolbar;
        this.onWarmupCompleted = swipeControlViewPager;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static CMS_DecEncryptedData onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_DecEncryptedData IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tabbed_lab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMS_DecEncryptedData onExtraCallbackWithResult(@NonNull View view) {
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        SwipeControlViewPager swipeControlViewPagerOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tabLayout))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (swipeControlViewPagerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.viewPager))) != null) {
            return new CMS_DecEncryptedData((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, toolbarOnNavigationEvent, swipeControlViewPagerOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
