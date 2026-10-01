package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CRYPT_ECDHKeyAgreement implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final Toolbar IAuthTabCallbackDefault;
    private final LinearLayout asInterface;
    public final ProgressBar onExtraCallback;
    public final TdsTextButtonV0View onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final TdsTopV1View onTransact;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private CRYPT_ECDHKeyAgreement(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ProgressBar progressBar, @NonNull TdsImageView tdsImageView, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.asInterface = linearLayout;
        this.onNavigationEvent = appBarLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onExtraCallback = progressBar;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallbackWithResult = tdsTextButtonV0View;
        this.IAuthTabCallbackDefault = toolbar;
        this.onTransact = tdsTopV1View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.asInterface;
    }

    public static CRYPT_ECDHKeyAgreement onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.app_ca_toss_cert_qr_sign, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CRYPT_ECDHKeyAgreement IAuthTabCallback(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_cta))) != null) {
            i = R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (progressBar != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.qr_code_image))) != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.textButton))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new CRYPT_ECDHKeyAgreement((LinearLayout) view, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, progressBar, tdsImageViewOnNavigationEvent, tdsTextButtonV0ViewOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
