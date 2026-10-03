package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UTIL_HexStringToBin implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsBottomCtaV1View IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final Typography6 IAuthTabCallbackStub;
    public final Typography3 asBinder;
    public final SubTypography5 asInterface;
    public final TdsImageView onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final ConstraintLayout onNavigationEvent;
    public final TdsTopV2View onTransact;
    public final TdsImageView onWarmupCompleted;

    private UTIL_HexStringToBin(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull ConstraintLayout constraintLayout3, @NonNull TdsTopV2View tdsTopV2View, @NonNull Typography6 typography6, @NonNull SubTypography5 subTypography5, @NonNull Typography3 typography3) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.IAuthTabCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = constraintLayout2;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallback = tdsImageView2;
        this.onExtraCallbackWithResult = constraintLayout3;
        this.onTransact = tdsTopV2View;
        this.IAuthTabCallbackStub = typography6;
        this.asInterface = subTypography5;
        this.asBinder = typography3;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static UTIL_HexStringToBin onExtraCallbackWithResult(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        SubTypography5 subTypography5OnNavigationEvent;
        Typography3 typography3OnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.complete_container))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.iv_sign_complete))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.iv_toss_cert))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.select_container))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_expire))) != null && (subTypography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_name))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tv_sign_complete))) != null) {
            return new UTIL_HexStringToBin((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, constraintLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, constraintLayoutOnNavigationEvent2, tdsTopV2ViewOnNavigationEvent, typography6OnNavigationEvent, subTypography5OnNavigationEvent, typography3OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
