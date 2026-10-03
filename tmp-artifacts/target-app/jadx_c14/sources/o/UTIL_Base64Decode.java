package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.SubTypography5;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UTIL_Base64Decode implements SearchBarKtExternalSyntheticLambda5 {
    public final SubTypography8 IAuthTabCallback;
    public final TdsBottomCtaV1View onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsRoundLayout onNavigationEvent;
    public final SubTypography5 onWarmupCompleted;

    private UTIL_Base64Decode(@NonNull ConstraintLayout constraintLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull SubTypography5 subTypography5, @NonNull SubTypography8 subTypography8) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.onExtraCallback = tdsBottomCtaV1View;
        this.onNavigationEvent = tdsRoundLayout;
        this.onWarmupCompleted = subTypography5;
        this.IAuthTabCallback = subTypography8;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static UTIL_Base64Decode onExtraCallbackWithResult(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        SubTypography5 subTypography5OnNavigationEvent;
        SubTypography8 subTypography8OnNavigationEvent;
        int i = R.id.cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.digit))) != null && (subTypography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.digit_number))) != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new UTIL_Base64Decode((ConstraintLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, subTypography5OnNavigationEvent, subTypography8OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
