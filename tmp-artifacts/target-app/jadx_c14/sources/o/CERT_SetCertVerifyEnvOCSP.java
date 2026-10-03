package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T06View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_SetCertVerifyEnvOCSP implements SearchBarKtExternalSyntheticLambda5 {
    public final ConstraintLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final Toolbar IAuthTabCallbackStub;
    public final TextFieldLine asInterface;
    public final AppBarLayout onExtraCallback;
    public final KeyboardBottomCta onExtraCallbackWithResult;
    public final LinearLayout onNavigationEvent;
    public final TdsTopV1T03View onTransact;
    public final TdsTopV1T06View onWarmupCompleted;

    private CERT_SetCertVerifyEnvOCSP(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsTopV1T06View tdsTopV1T06View, @NonNull LinearLayout linearLayout, @NonNull TextFieldLine textFieldLine, @NonNull Toolbar toolbar, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onExtraCallback = appBarLayout;
        this.onExtraCallbackWithResult = keyboardBottomCta;
        this.IAuthTabCallback = constraintLayout2;
        this.onWarmupCompleted = tdsTopV1T06View;
        this.onNavigationEvent = linearLayout;
        this.asInterface = textFieldLine;
        this.IAuthTabCallbackStub = toolbar;
        this.onTransact = tdsTopV1T03View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CERT_SetCertVerifyEnvOCSP onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static CERT_SetCertVerifyEnvOCSP onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_open_banking_input_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_SetCertVerifyEnvOCSP IAuthTabCallback(@NonNull View view) {
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.app_bar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.description;
            TdsTopV1T06View tdsTopV1T06ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsTopV1T06ViewOnNavigationEvent != null) {
                i = R.id.recommendContainer;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.textFieldEmail))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                    return new CERT_SetCertVerifyEnvOCSP(constraintLayout, appBarLayoutOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, constraintLayout, tdsTopV1T06ViewOnNavigationEvent, linearLayout, textFieldLineOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
