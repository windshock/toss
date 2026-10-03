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
public final class CMP_IssueCertificate_NoConf implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final TdsTopV1View asInterface;
    public final ConstraintLayout onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final Toolbar onNavigationEvent;
    public final AppBarLayout onWarmupCompleted;

    private CMP_IssueCertificate_NoConf(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsImageView tdsImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = constraintLayout2;
        this.onNavigationEvent = toolbar;
        this.asInterface = tdsTopV1View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CMP_IssueCertificate_NoConf onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMP_IssueCertificate_NoConf IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pedometer_notification_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMP_IssueCertificate_NoConf onNavigationEvent(@NonNull View view) {
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideImageView))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new CMP_IssueCertificate_NoConf(constraintLayout, appBarLayoutOnNavigationEvent, tdsBottomCtaV1ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
