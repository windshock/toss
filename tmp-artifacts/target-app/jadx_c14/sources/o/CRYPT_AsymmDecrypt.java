package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextField;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_AsymmDecrypt implements SearchBarKtExternalSyntheticLambda5 {
    public final KeyboardBottomCta IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final TextField IAuthTabCallbackStub;
    public final TextField asBinder;
    public final TextField asInterface;
    public final TdsCheckBoxV1View onExtraCallback;
    public final TdsCheckBoxV1View onExtraCallbackWithResult;
    public final TextField onNavigationEvent;
    public final TextField onTransact;
    public final TdsCheckBoxV1View onWarmupCompleted;

    private CRYPT_AsymmDecrypt(@NonNull ConstraintLayout constraintLayout, @NonNull TdsCheckBoxV1View tdsCheckBoxV1View, @NonNull TdsCheckBoxV1View tdsCheckBoxV1View2, @NonNull TdsCheckBoxV1View tdsCheckBoxV1View3, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TextField textField, @NonNull TextField textField2, @NonNull TextField textField3, @NonNull TextField textField4, @NonNull TextField textField5) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onWarmupCompleted = tdsCheckBoxV1View;
        this.onExtraCallback = tdsCheckBoxV1View2;
        this.onExtraCallbackWithResult = tdsCheckBoxV1View3;
        this.IAuthTabCallback = keyboardBottomCta;
        this.onNavigationEvent = textField;
        this.onTransact = textField2;
        this.asInterface = textField3;
        this.IAuthTabCallbackStub = textField4;
        this.asBinder = textField5;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CRYPT_AsymmDecrypt onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CRYPT_AsymmDecrypt onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_user_info_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CRYPT_AsymmDecrypt onWarmupCompleted(@NonNull View view) {
        TdsCheckBoxV1View tdsCheckBoxV1ViewOnNavigationEvent;
        TdsCheckBoxV1View tdsCheckBoxV1ViewOnNavigationEvent2;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TextField textFieldOnNavigationEvent;
        TextField textFieldOnNavigationEvent2;
        TextField textFieldOnNavigationEvent3;
        TextField textFieldOnNavigationEvent4;
        TextField textFieldOnNavigationEvent5;
        int i = R.id.cb_auto_submit;
        TdsCheckBoxV1View tdsCheckBoxV1ViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsCheckBoxV1ViewOnNavigationEvent3 != null && (tdsCheckBoxV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cb_consent_granted))) != null && (tdsCheckBoxV1ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cb_local_data_prefill))) != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.cta_confirm))) != null && (textFieldOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tf_input_page_title))) != null && (textFieldOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tf_name))) != null && (textFieldOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tf_phone_number))) != null && (textFieldOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tf_requester_code))) != null && (textFieldOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.tf_session_type))) != null) {
            return new CRYPT_AsymmDecrypt((ConstraintLayout) view, tdsCheckBoxV1ViewOnNavigationEvent3, tdsCheckBoxV1ViewOnNavigationEvent, tdsCheckBoxV1ViewOnNavigationEvent2, keyboardBottomCtaOnNavigationEvent, textFieldOnNavigationEvent, textFieldOnNavigationEvent2, textFieldOnNavigationEvent3, textFieldOnNavigationEvent4, textFieldOnNavigationEvent5);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
