package o;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UTIL_BinToHexString implements SearchBarKtExternalSyntheticLambda5 {
    public final TextFieldLine IAuthTabCallback;
    private final ConstraintLayout asInterface;
    public final TdsButtonV1View onExtraCallback;
    public final TextFieldLine onExtraCallbackWithResult;
    public final ComposeView onNavigationEvent;
    public final TdsTopV1T03View onTransact;
    public final ScrollView onWarmupCompleted;

    private UTIL_BinToHexString(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TextFieldLine textFieldLine, @NonNull ScrollView scrollView, @NonNull TextFieldLine textFieldLine2, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.asInterface = constraintLayout;
        this.onNavigationEvent = composeView;
        this.onExtraCallback = tdsButtonV1View;
        this.IAuthTabCallback = textFieldLine;
        this.onWarmupCompleted = scrollView;
        this.onExtraCallbackWithResult = textFieldLine2;
        this.onTransact = tdsTopV1T03View;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asInterface;
    }

    public static UTIL_BinToHexString onExtraCallback(@NonNull View view) {
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent2;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.composeView;
        ComposeView composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (composeViewOnNavigationEvent != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.modifyInfoButton))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.phoneNumber))) != null) {
            i = R.id.scrollView;
            ScrollView scrollView = (ScrollView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (scrollView != null && (textFieldLineOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.telecom))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
                return new UTIL_BinToHexString((ConstraintLayout) view, composeViewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, textFieldLineOnNavigationEvent, scrollView, textFieldLineOnNavigationEvent2, tdsTopV1T03ViewOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
