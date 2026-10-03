package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_VerifyCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final AppBarLayout onExtraCallback;
    public final TdsTopV1View onExtraCallbackWithResult;
    public final TdsScrollView onNavigationEvent;
    public final Toolbar onWarmupCompleted;

    private CERT_VerifyCertificate(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsScrollView tdsScrollView, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.asBinder = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsScrollView;
        this.onWarmupCompleted = toolbar;
        this.onExtraCallbackWithResult = tdsTopV1View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static CERT_VerifyCertificate onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_VerifyCertificate onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_password_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CERT_VerifyCertificate onNavigationEvent(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsScrollView tdsScrollViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.appbar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.scrollView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
            return new CERT_VerifyCertificate((ConstraintLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsScrollViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
