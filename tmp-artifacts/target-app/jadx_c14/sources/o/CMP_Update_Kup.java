package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.TdsSegmentedControlV1ItemView;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import im.toss.uikit.widget.Toolbar;
import im.toss.uikit.widget.textField.TextField;
import im.toss.uikit.widget.textField.TextFieldSpinner;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMP_Update_Kup implements SearchBarKtExternalSyntheticLambda5 {
    public final AppBarLayout IAuthTabCallback;
    public final TextField IAuthTabCallbackDefault;
    public final TextInputLayout IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallbackStubProxy;
    public final ConstraintLayout IAuthTabCallback_Parcel;
    public final TextInputLayout ICustomTabsCallback;
    public final TextInputLayout access000;
    public final TextFieldSpinner access100;
    public final Typography3 asBinder;
    public final TextField asInterface;
    public final TextInputEditText extraCallback;
    public final KeyboardBottomCta extraCallbackWithResult;
    public final TextInputEditText getInterfaceDescriptor;
    public final Toolbar onActivityLayout;
    public final LinearLayout onActivityResized;
    public final TdsSegmentedControlV1ItemView onExtraCallback;
    public final TextFieldSpinner onExtraCallbackWithResult;
    public final TdsTopV1T03View onMinimized;
    public final TdsSegmentedControlV1ItemView onNavigationEvent;
    private final ConstraintLayout onPostMessage;
    public final TextInputEditText onTransact;
    public final TextFieldSpinner onWarmupCompleted;
    public final TextInputEditText readTypedObject;
    public final TdsSegmentedControlV1View writeTypedObject;

    private CMP_Update_Kup(@NonNull ConstraintLayout constraintLayout, @NonNull TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView, @NonNull TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemView2, @NonNull TextFieldSpinner textFieldSpinner, @NonNull AppBarLayout appBarLayout, @NonNull TextFieldSpinner textFieldSpinner2, @NonNull Typography3 typography3, @NonNull TextField textField, @NonNull TextField textField2, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout2, @NonNull TextFieldSpinner textFieldSpinner3, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull KeyboardBottomCta keyboardBottomCta, @NonNull TdsSegmentedControlV1View tdsSegmentedControlV1View, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText4, @NonNull LinearLayout linearLayout2, @NonNull TdsTopV1T03View tdsTopV1T03View, @NonNull Toolbar toolbar) {
        this.onPostMessage = constraintLayout;
        this.onNavigationEvent = tdsSegmentedControlV1ItemView;
        this.onExtraCallback = tdsSegmentedControlV1ItemView2;
        this.onWarmupCompleted = textFieldSpinner;
        this.IAuthTabCallback = appBarLayout;
        this.onExtraCallbackWithResult = textFieldSpinner2;
        this.asBinder = typography3;
        this.asInterface = textField;
        this.IAuthTabCallbackDefault = textField2;
        this.onTransact = textInputEditText;
        this.IAuthTabCallbackStub = textInputLayout;
        this.getInterfaceDescriptor = textInputEditText2;
        this.access000 = textInputLayout2;
        this.access100 = textFieldSpinner3;
        this.IAuthTabCallback_Parcel = constraintLayout2;
        this.IAuthTabCallbackStubProxy = linearLayout;
        this.extraCallbackWithResult = keyboardBottomCta;
        this.writeTypedObject = tdsSegmentedControlV1View;
        this.extraCallback = textInputEditText3;
        this.ICustomTabsCallback = textInputLayout3;
        this.readTypedObject = textInputEditText4;
        this.onActivityResized = linearLayout2;
        this.onMinimized = tdsTopV1T03View;
        this.onActivityLayout = toolbar;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onPostMessage;
    }

    public static CMP_Update_Kup onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CMP_Update_Kup onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_plcc_simple_issue, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CMP_Update_Kup onNavigationEvent(@NonNull View view) {
        TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemViewOnNavigationEvent;
        TextFieldSpinner textFieldSpinnerOnNavigationEvent;
        AppBarLayout appBarLayoutOnNavigationEvent;
        TextFieldSpinner textFieldSpinnerOnNavigationEvent2;
        Typography3 typography3OnNavigationEvent;
        TextField textFieldOnNavigationEvent;
        TextField textFieldOnNavigationEvent2;
        TextInputEditText textInputEditTextOnNavigationEvent;
        TextInputLayout textInputLayoutOnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent2;
        TextInputLayout textInputLayoutOnNavigationEvent2;
        TextFieldSpinner textFieldSpinnerOnNavigationEvent3;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent;
        TdsSegmentedControlV1View tdsSegmentedControlV1ViewOnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent3;
        TextInputLayout textInputLayoutOnNavigationEvent3;
        TextInputEditText textInputEditTextOnNavigationEvent4;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.addressCompany;
        TdsSegmentedControlV1ItemView tdsSegmentedControlV1ItemViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsSegmentedControlV1ItemViewOnNavigationEvent2 != null && (tdsSegmentedControlV1ItemViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.addressHouse))) != null && (textFieldSpinnerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.annualIncomeSpinner))) != null && (appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayout))) != null && (textFieldSpinnerOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.creditScoreSpinner))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.hyphen))) != null && (textFieldOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputAddress))) != null && (textFieldOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputDetailAddress))) != null && (textInputEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputFirstName))) != null && (textInputLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputFirstNameWrapper))) != null && (textInputEditTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputLastName))) != null && (textInputLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputLastNameWrapper))) != null && (textFieldSpinnerOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputPayAccount))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nameGroup))) != null) {
            i = R.id.nextStepContainer;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null && (keyboardBottomCtaOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nextStepCta))) != null && (tdsSegmentedControlV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.radioTab))) != null && (textInputEditTextOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField1))) != null && (textInputLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField1TextInput))) != null && (textInputEditTextOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField2))) != null) {
                i = R.id.rrnGroup;
                LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout2 != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleMessage))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                    return new CMP_Update_Kup((ConstraintLayout) view, tdsSegmentedControlV1ItemViewOnNavigationEvent2, tdsSegmentedControlV1ItemViewOnNavigationEvent, textFieldSpinnerOnNavigationEvent, appBarLayoutOnNavigationEvent, textFieldSpinnerOnNavigationEvent2, typography3OnNavigationEvent, textFieldOnNavigationEvent, textFieldOnNavigationEvent2, textInputEditTextOnNavigationEvent, textInputLayoutOnNavigationEvent, textInputEditTextOnNavigationEvent2, textInputLayoutOnNavigationEvent2, textFieldSpinnerOnNavigationEvent3, constraintLayoutOnNavigationEvent, linearLayout, keyboardBottomCtaOnNavigationEvent, tdsSegmentedControlV1ViewOnNavigationEvent, textInputEditTextOnNavigationEvent3, textInputLayoutOnNavigationEvent3, textInputEditTextOnNavigationEvent4, linearLayout2, tdsTopV1T03ViewOnNavigationEvent, toolbarOnNavigationEvent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
