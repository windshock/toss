package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography5;
import viva.republica.toss.R;
import viva.republica.toss.common.securekey.SecureKeyboardView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class IssueCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography5 IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final SecureKeyboardView onExtraCallback;
    public final Typography5 onExtraCallbackWithResult;
    public final Typography5 onNavigationEvent;
    public final SubTypography8 onTransact;
    public final Typography5 onWarmupCompleted;

    private IssueCertificate(@NonNull ConstraintLayout constraintLayout, @NonNull Typography5 typography5, @NonNull Typography5 typography52, @NonNull Typography5 typography53, @NonNull Typography5 typography54, @NonNull SecureKeyboardView secureKeyboardView, @NonNull SubTypography8 subTypography8) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onNavigationEvent = typography5;
        this.onWarmupCompleted = typography52;
        this.IAuthTabCallback = typography53;
        this.onExtraCallbackWithResult = typography54;
        this.onExtraCallback = secureKeyboardView;
        this.onTransact = subTypography8;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static IssueCertificate onWarmupCompleted(@NonNull View view) {
        Typography5 typography5OnNavigationEvent;
        Typography5 typography5OnNavigationEvent2;
        Typography5 typography5OnNavigationEvent3;
        SubTypography8 subTypography8OnNavigationEvent;
        int i = R.id.number1;
        Typography5 typography5OnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography5OnNavigationEvent4 != null && (typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number2))) != null && (typography5OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number3))) != null && (typography5OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.number4))) != null) {
            i = R.id.secureKeyboard;
            SecureKeyboardView secureKeyboardView = (SecureKeyboardView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (secureKeyboardView != null && (subTypography8OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                return new IssueCertificate((ConstraintLayout) view, typography5OnNavigationEvent4, typography5OnNavigationEvent, typography5OnNavigationEvent2, typography5OnNavigationEvent3, secureKeyboardView, subTypography8OnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
