package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.KeyboardBottomCta;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UTIL_WriteFile implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTextButtonV0View IAuthTabCallback;
    public final TdsTopV2View asBinder;
    private final ConstraintLayout asInterface;
    public final View onExtraCallback;
    public final Typography3 onExtraCallbackWithResult;
    public final KeyboardBottomCta onNavigationEvent;
    public final TextInputEditText onTransact;
    public final TdsImageView onWarmupCompleted;

    private UTIL_WriteFile(@NonNull ConstraintLayout constraintLayout, @NonNull Typography3 typography3, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull View view, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull TdsImageView tdsImageView, @NonNull TextInputEditText textInputEditText, @NonNull TdsTopV2View tdsTopV2View) {
        this.asInterface = constraintLayout;
        this.onExtraCallbackWithResult = typography3;
        this.onNavigationEvent = keyboardBottomCta;
        this.onExtraCallback = view;
        this.IAuthTabCallback = tdsTextButtonV0View;
        this.onWarmupCompleted = tdsImageView;
        this.onTransact = textInputEditText;
        this.asBinder = tdsTopV2View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static UTIL_WriteFile onExtraCallback(@NonNull View view) {
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        View viewOnNavigationEvent;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent;
        TdsTopV2View tdsTopV2ViewOnNavigationEvent;
        int i = R.id.areaView;
        Typography3 typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography3OnNavigationEvent != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomToggleLicenseTypeBackground))) != null && (tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.buttonToggleLicenseType))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.guideImageView))) != null && (textInputEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input))) != null && (tdsTopV2ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new UTIL_WriteFile((ConstraintLayout) view, typography3OnNavigationEvent, keyboardBottomCtaOnNavigationEvent, viewOnNavigationEvent, tdsTextButtonV0ViewOnNavigationEvent, tdsImageViewOnNavigationEvent, textInputEditTextOnNavigationEvent, tdsTopV2ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
