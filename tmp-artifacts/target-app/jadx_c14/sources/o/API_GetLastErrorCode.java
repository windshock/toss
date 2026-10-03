package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class API_GetLastErrorCode implements SearchBarKtExternalSyntheticLambda5 {
    public final KeyboardBottomCta IAuthTabCallback;
    public final TdsTopV1View IAuthTabCallbackStub;
    private final ConstraintLayout asInterface;
    public final Toolbar onExtraCallback;
    public final TextFieldLine onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final ConstraintLayout onWarmupCompleted;

    private API_GetLastErrorCode(@NonNull ConstraintLayout constraintLayout, @NonNull TextFieldLine textFieldLine, @NonNull AppBarLayout appBarLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar, @NonNull TdsTopV1View tdsTopV1View) {
        this.asInterface = constraintLayout;
        this.onExtraCallbackWithResult = textFieldLine;
        this.onNavigationEvent = appBarLayout;
        this.IAuthTabCallback = keyboardBottomCta;
        this.onWarmupCompleted = constraintLayout2;
        this.onExtraCallback = toolbar;
        this.IAuthTabCallbackStub = tdsTopV1View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static API_GetLastErrorCode IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static API_GetLastErrorCode onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bank_account_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static API_GetLastErrorCode IAuthTabCallback(@NonNull View view) {
        AppBarLayout appBarLayoutOnNavigationEvent;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.accountNoInput;
        TextFieldLine textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (textFieldLineOnNavigationEvent != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayout))) != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.toolbar;
            Toolbar toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (toolbarOnNavigationEvent != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null) {
                return new API_GetLastErrorCode(constraintLayout, textFieldLineOnNavigationEvent, appBarLayoutOnNavigationEvent, keyboardBottomCtaOnNavigationEvent, constraintLayout, toolbarOnNavigationEvent, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
