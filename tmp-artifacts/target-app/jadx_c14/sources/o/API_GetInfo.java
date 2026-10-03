package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class API_GetInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1View IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar onExtraCallback;
    public final AppBarLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private API_GetInfo(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull TdsTopV1View tdsTopV1View, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onExtraCallbackWithResult = appBarLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = tdsTopV1View;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static API_GetInfo IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static API_GetInfo IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_account_verification_telebanking_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static API_GetInfo onWarmupCompleted(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_cta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.image))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
            return new API_GetInfo((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsTopV1ViewOnNavigationEvent, toolbarOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
