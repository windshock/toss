package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetTSAPolicyOid implements SearchBarKtExternalSyntheticLambda5 {
    public final KeyboardBottomCta IAuthTabCallback;
    public final TdsTopV2View IAuthTabCallbackStub;
    private final ConstraintLayout asBinder;
    public final TdsImageView onExtraCallback;
    public final TdsTextButtonV0View onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final TextFieldLine onWarmupCompleted;

    private GetTSAPolicyOid(@NonNull ConstraintLayout constraintLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull View view, @NonNull TdsImageView tdsImageView, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull TextFieldLine textFieldLine, @NonNull TdsTopV2View tdsTopV2View) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = keyboardBottomCta;
        this.onNavigationEvent = view;
        this.onExtraCallback = tdsImageView;
        this.onExtraCallbackWithResult = tdsTextButtonV0View;
        this.onWarmupCompleted = textFieldLine;
        this.IAuthTabCallbackStub = tdsTopV2View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static GetTSAPolicyOid onWarmupCompleted(@NonNull View view) {
        View viewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (keyboardBottomCtaOnNavigationEvent != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomToggleLicenseTypeBackground))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideImageView))) != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.helpTextButton))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.serialNumber))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new GetTSAPolicyOid((ConstraintLayout) view, keyboardBottomCtaOnNavigationEvent, viewOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsTextButtonV0ViewOnNavigationEvent, textFieldLineOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
