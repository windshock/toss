package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_ChangePrikeyPassword implements SearchBarKtExternalSyntheticLambda5 {
    public final Toolbar IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final TdsTopV2View onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CERT_ChangePrikeyPassword(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull Toolbar toolbar, @NonNull TdsTopV2View tdsTopV2View) {
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.IAuthTabCallback = toolbar;
        this.onExtraCallbackWithResult = tdsTopV2View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static CERT_ChangePrikeyPassword IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_ChangePrikeyPassword onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_blocked_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CERT_ChangePrikeyPassword onExtraCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.appbar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_ChangePrikeyPassword((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
