package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetCmpRValue implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final TdsTopV1T03View onExtraCallback;
    public final TextFieldLine onExtraCallbackWithResult;
    public final KeyboardBottomCta onNavigationEvent;
    public final TdsButtonV1View onWarmupCompleted;

    private GetCmpRValue(@NonNull ConstraintLayout constraintLayout, @NonNull TextFieldLine textFieldLine, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallbackWithResult = textFieldLine;
        this.onWarmupCompleted = tdsButtonV1View;
        this.onNavigationEvent = keyboardBottomCta;
        this.onExtraCallback = tdsTopV1T03View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static GetCmpRValue onExtraCallback(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.accountNumberInput;
        TextFieldLine textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (textFieldLineOnNavigationEvent != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.accountPasteButton))) != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleText))) != null) {
            return new GetCmpRValue((ConstraintLayout) view, textFieldLineOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
