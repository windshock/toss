package o;

import android.view.View;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import viva.republica.toss.R;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_VerifySignatureValue_NoAlgorithmInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final BankListView IAuthTabCallback;
    public final ViewFlipper IAuthTabCallbackDefault;
    public final KeyboardBottomCta IAuthTabCallbackStub;
    public final TextFieldLine asBinder;
    public final NestedScrollView asInterface;
    private final ConstraintLayout getInterfaceDescriptor;
    public final TdsTopV1T03View onExtraCallback;
    public final TdsTopV1T05View onExtraCallbackWithResult;
    public final TdsTopV1T05View onNavigationEvent;
    public final NestedScrollView onTransact;
    public final TdsTopV1T03View onWarmupCompleted;

    private CRYPT_VerifySignatureValue_NoAlgorithmInfo(@NonNull ConstraintLayout constraintLayout, @NonNull TdsTopV1T05View tdsTopV1T05View, @NonNull TdsTopV1T03View tdsTopV1T03View, @NonNull BankListView bankListView, @NonNull TdsTopV1T05View tdsTopV1T05View2, @NonNull TdsTopV1T03View tdsTopV1T03View2, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TextFieldLine textFieldLine, @NonNull NestedScrollView nestedScrollView, @NonNull NestedScrollView nestedScrollView2, @NonNull ViewFlipper viewFlipper) {
        this.getInterfaceDescriptor = constraintLayout;
        this.onExtraCallbackWithResult = tdsTopV1T05View;
        this.onWarmupCompleted = tdsTopV1T03View;
        this.IAuthTabCallback = bankListView;
        this.onNavigationEvent = tdsTopV1T05View2;
        this.onExtraCallback = tdsTopV1T03View2;
        this.IAuthTabCallbackStub = keyboardBottomCta;
        this.asBinder = textFieldLine;
        this.asInterface = nestedScrollView;
        this.onTransact = nestedScrollView2;
        this.IAuthTabCallbackDefault = viewFlipper;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.getInterfaceDescriptor;
    }

    public static CRYPT_VerifySignatureValue_NoAlgorithmInfo onNavigationEvent(@NonNull View view) {
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        BankListView bankListViewOnNavigationEvent;
        TdsTopV1T05View tdsTopV1T05ViewOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent2;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        NestedScrollView nestedScrollViewOnNavigationEvent;
        NestedScrollView nestedScrollViewOnNavigationEvent2;
        int i = R.id.accountInputSubtitle;
        TdsTopV1T05View tdsTopV1T05ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsTopV1T05ViewOnNavigationEvent2 != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.accountInputTitle))) != null && (bankListViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankList))) != null && (tdsTopV1T05ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankSelectSubtitle))) != null && (tdsTopV1T03ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bankSelectTitle))) != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottomCta))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputAccountNumber))) != null && (nestedScrollViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputAccountNumberView))) != null && (nestedScrollViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.selectBankView))) != null) {
            i = R.id.viewFlipper;
            ViewFlipper viewFlipper = (ViewFlipper) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (viewFlipper != null) {
                return new CRYPT_VerifySignatureValue_NoAlgorithmInfo((ConstraintLayout) view, tdsTopV1T05ViewOnNavigationEvent2, tdsTopV1T03ViewOnNavigationEvent, bankListViewOnNavigationEvent, tdsTopV1T05ViewOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent2, keyboardBottomCtaOnNavigationEvent, textFieldLineOnNavigationEvent, nestedScrollViewOnNavigationEvent, nestedScrollViewOnNavigationEvent2, viewFlipper);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
