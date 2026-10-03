package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T06View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_SetCACert implements SearchBarKtExternalSyntheticLambda5 {
    public final KeyboardBottomCta IAuthTabCallback;
    public final TdsTopV1T03View IAuthTabCallbackDefault;
    public final TextFieldLine IAuthTabCallbackStub;
    public final TdsButtonV1View asBinder;
    public final Toolbar asInterface;
    public final TdsButtonV1View onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsTopV1T06View onNavigationEvent;
    private final ConstraintLayout onTransact;
    public final AppBarLayout onWarmupCompleted;

    private CERT_SetCACert(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsTopV1T06View tdsTopV1T06View, @NonNull TdsButtonV1View tdsButtonV1View2, @NonNull TextFieldLine textFieldLine, @NonNull Toolbar toolbar, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.onTransact = constraintLayout;
        this.onWarmupCompleted = appBarLayout;
        this.IAuthTabCallback = keyboardBottomCta;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onExtraCallback = tdsButtonV1View;
        this.onNavigationEvent = tdsTopV1T06View;
        this.asBinder = tdsButtonV1View2;
        this.IAuthTabCallbackStub = textFieldLine;
        this.asInterface = toolbar;
        this.IAuthTabCallbackDefault = tdsTopV1T03View;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onTransact;
    }

    public static CERT_SetCACert onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_SetCACert onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_open_banking_input_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_SetCACert IAuthTabCallback(@NonNull View view) {
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TdsTopV1T06View tdsTopV1T06ViewOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.app_bar;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.copiedAccountNo;
            TdsButtonV1View tdsButtonV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (tdsButtonV1ViewOnNavigationEvent2 != null && (tdsTopV1T06ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.kakao_account_type_guide))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.noDap))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.textFieldAccountNo))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new CERT_SetCACert(constraintLayout, appBarLayoutOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, constraintLayout, tdsButtonV1ViewOnNavigationEvent2, tdsTopV1T06ViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, textFieldLineOnNavigationEvent, toolbarOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
