package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_Finalize implements SearchBarKtExternalSyntheticLambda5 {
    private final LinearLayout IAuthTabCallback;
    public final FragmentContainerView onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    private CERT_Finalize(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull Toolbar toolbar) {
        this.IAuthTabCallback = linearLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallbackWithResult = fragmentContainerView;
        this.onNavigationEvent = toolbar;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static CERT_Finalize onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CERT_Finalize onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_card_ocr_intro_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CERT_Finalize onNavigationEvent(@NonNull View view) {
        FragmentContainerView fragmentContainerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (fragmentContainerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.navHostFragment))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_Finalize((LinearLayout) view, appBarLayoutOnNavigationEvent, fragmentContainerViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
