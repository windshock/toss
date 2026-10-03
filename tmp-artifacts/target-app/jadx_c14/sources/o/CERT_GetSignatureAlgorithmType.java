package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetSignatureAlgorithmType implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final RecyclerView onExtraCallback;
    public final ScrollingPagerIndicator onExtraCallbackWithResult;
    public final TdsBottomCtaV1View onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_GetSignatureAlgorithmType(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = appBarLayout;
        this.onNavigationEvent = tdsBottomCtaV1View;
        this.onExtraCallbackWithResult = scrollingPagerIndicator;
        this.onExtraCallback = recyclerView;
        this.onWarmupCompleted = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CERT_GetSignatureAlgorithmType onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_GetSignatureAlgorithmType onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_joint_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CERT_GetSignatureAlgorithmType onWarmupCompleted(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        ScrollingPagerIndicator scrollingPagerIndicatorOnNavigationEvent;
        RecyclerView recyclerViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (scrollingPagerIndicatorOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.indicator))) != null && (recyclerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.recyclerView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new CERT_GetSignatureAlgorithmType((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, scrollingPagerIndicatorOnNavigationEvent, recyclerViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
