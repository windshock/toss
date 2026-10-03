package o;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;
import viva.republica.toss.common.securekey.SecureKeyboardView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isRootCA implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography3 IAuthTabCallback;
    public final TextInputEditText IAuthTabCallbackDefault;
    public final TextInputLayout IAuthTabCallbackStub;
    public final LinearLayout IAuthTabCallbackStubProxy;
    public final Typography7 IAuthTabCallback_Parcel;
    public final TextInputLayout ICustomTabsCallback;
    public final HorizontalScrollView access000;
    public final TextInputEditText access100;
    public final TextInputLayout asBinder;
    public final SecureKeyboardView asInterface;
    public final TextInputEditText extraCallback;
    public final ScrollView extraCallbackWithResult;
    public final ConstraintLayout getInterfaceDescriptor;
    public final TextInputEditText onExtraCallback;
    public final TextInputLayout onExtraCallbackWithResult;
    private final ConstraintLayout onMessageChannelReady;
    public final TextInputEditText onNavigationEvent;
    public final View onTransact;
    public final TdsButtonV1View onWarmupCompleted;
    public final TdsTopV1T03View readTypedObject;
    public final LinearLayout writeTypedObject;

    private isRootCA(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull Typography3 typography3, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText2, @NonNull View view, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputLayout textInputLayout3, @NonNull SecureKeyboardView secureKeyboardView, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography7 typography7, @NonNull LinearLayout linearLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TextInputEditText textInputEditText4, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputEditText textInputEditText5, @NonNull LinearLayout linearLayout2, @NonNull ScrollView scrollView, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.onMessageChannelReady = constraintLayout;
        this.onWarmupCompleted = tdsButtonV1View;
        this.IAuthTabCallback = typography3;
        this.onNavigationEvent = textInputEditText;
        this.onExtraCallbackWithResult = textInputLayout;
        this.onExtraCallback = textInputEditText2;
        this.onTransact = view;
        this.IAuthTabCallbackStub = textInputLayout2;
        this.IAuthTabCallbackDefault = textInputEditText3;
        this.asBinder = textInputLayout3;
        this.asInterface = secureKeyboardView;
        this.getInterfaceDescriptor = constraintLayout2;
        this.IAuthTabCallback_Parcel = typography7;
        this.IAuthTabCallbackStubProxy = linearLayout;
        this.access000 = horizontalScrollView;
        this.access100 = textInputEditText4;
        this.ICustomTabsCallback = textInputLayout4;
        this.extraCallback = textInputEditText5;
        this.writeTypedObject = linearLayout2;
        this.extraCallbackWithResult = scrollView;
        this.readTypedObject = tdsTopV1T03View;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onMessageChannelReady;
    }

    public static isRootCA onWarmupCompleted(@NonNull View view) {
        Typography3 typography3OnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent;
        TextInputLayout textInputLayoutOnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent2;
        View viewOnNavigationEvent;
        TextInputLayout textInputLayoutOnNavigationEvent2;
        TextInputEditText textInputEditTextOnNavigationEvent3;
        TextInputLayout textInputLayoutOnNavigationEvent3;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography7 typography7OnNavigationEvent;
        TextInputEditText textInputEditTextOnNavigationEvent4;
        TextInputLayout textInputLayoutOnNavigationEvent4;
        TextInputEditText textInputEditTextOnNavigationEvent5;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.bottomCta;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.hyphen))) != null && (textInputEditTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputFirstName))) != null && (textInputLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputFirstNameWrapper))) != null && (textInputEditTextOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputKoreanName))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputKoreanNameClickView))) != null && (textInputLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputKoreanNameTextInput))) != null && (textInputEditTextOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputLastName))) != null && (textInputLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputLastNameWrapper))) != null) {
            i = R.id.keyboardView;
            SecureKeyboardView secureKeyboardView = (SecureKeyboardView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (secureKeyboardView != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nameGroup))) != null && (typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.nameMessage))) != null) {
                i = R.id.recommendedNameLayout;
                LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (linearLayout != null) {
                    i = R.id.recommendedNameScrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (horizontalScrollView != null && (textInputEditTextOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField1))) != null && (textInputLayoutOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField1TextInput))) != null && (textInputEditTextOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnField2))) != null) {
                        i = R.id.rrnGroup;
                        LinearLayout linearLayout2 = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.scrollView;
                            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                            if (scrollView != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                                return new isRootCA((ConstraintLayout) view, tdsButtonV1ViewOnNavigationEvent, typography3OnNavigationEvent, textInputEditTextOnNavigationEvent, textInputLayoutOnNavigationEvent, textInputEditTextOnNavigationEvent2, viewOnNavigationEvent, textInputLayoutOnNavigationEvent2, textInputEditTextOnNavigationEvent3, textInputLayoutOnNavigationEvent3, secureKeyboardView, constraintLayoutOnNavigationEvent, typography7OnNavigationEvent, linearLayout, horizontalScrollView, textInputEditTextOnNavigationEvent4, textInputLayoutOnNavigationEvent4, textInputEditTextOnNavigationEvent5, linearLayout2, scrollView, tdsTopV1T03ViewOnNavigationEvent);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
