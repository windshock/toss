package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import viva.republica.toss.R;
import viva.republica.toss.common.securekey.SecureKeyboardView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TSA_RequestTimeStampWithHash implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography5 IAuthTabCallback;
    private final ConstraintLayout asBinder;
    public final TdsTopV1View asInterface;
    public final Typography5 onExtraCallback;
    public final Typography5 onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final SecureKeyboardView onTransact;
    public final TdsTextButtonV0View onWarmupCompleted;

    private TSA_RequestTimeStampWithHash(@NonNull ConstraintLayout constraintLayout, @NonNull TdsTextButtonV0View tdsTextButtonV0View, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography5 typography53, @NonNull Typography5 typography54, @NonNull SecureKeyboardView secureKeyboardView, @NonNull TdsTopV1View tdsTopV1View) {
        this.asBinder = constraintLayout;
        this.onWarmupCompleted = tdsTextButtonV0View;
        this.onNavigationEvent = typography5;
        this.onExtraCallbackWithResult = typography52;
        this.IAuthTabCallback = typography53;
        this.onExtraCallback = typography54;
        this.onTransact = secureKeyboardView;
        this.asInterface = tdsTopV1View;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static TSA_RequestTimeStampWithHash IAuthTabCallback(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent3;
        Typography5 typography5OnNavigationEvent4;
        TdsTopV1View tdsTopV1ViewOnNavigationEvent;
        int i = R.id.bottomButton;
        TdsTextButtonV0View tdsTextButtonV0ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsTextButtonV0ViewOnNavigationEvent != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number1))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number2))) != null && (typography5OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number3))) != null && (typography5OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number4))) != null) {
            i = R.id.secureKeyboard;
            SecureKeyboardView secureKeyboardView = (SecureKeyboardView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (secureKeyboardView != null && (tdsTopV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.titleMessage))) != null) {
                return new TSA_RequestTimeStampWithHash((ConstraintLayout) view, tdsTextButtonV0ViewOnNavigationEvent, typography5OnNavigationEvent, typography5OnNavigationEvent2, typography5OnNavigationEvent3, typography5OnNavigationEvent4, secureKeyboardView, tdsTopV1ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
