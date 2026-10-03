package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.tab.TdsTabV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMS_GetCertCountWithSignedData implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTabV1View IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final ViewPager asBinder;
    public final AppBarLayout onExtraCallback;
    public final TdsTopV1View onExtraCallbackWithResult;
    public final ProgressBar onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CMS_GetCertCountWithSignedData(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsTabV1View tdsTabV1View, @NonNull TdsTopV1View tdsTopV1View, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar, @NonNull ViewPager viewPager) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = tdsTabV1View;
        this.onExtraCallbackWithResult = tdsTopV1View;
        this.onNavigationEvent = progressBar;
        this.onWarmupCompleted = toolbar;
        this.asBinder = viewPager;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMS_GetCertCountWithSignedData onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_GetCertCountWithSignedData IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_transfer_dutch_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallbackWithResult(viewInflate);
    }

    public static CMS_GetCertCountWithSignedData onExtraCallbackWithResult(@NonNull View view) {
        TdsTabV1View tdsTabV1ViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        ViewPager viewPagerOnNavigationEvent;
        int i = R.id.appbar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsTabV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.fluid_tab))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header_title))) != null) {
            i = R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (progressBar != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (viewPagerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.view_pager))) != null) {
                return new CMS_GetCertCountWithSignedData((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsTabV1ViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, progressBar, toolbarOnNavigationEvent, viewPagerOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
