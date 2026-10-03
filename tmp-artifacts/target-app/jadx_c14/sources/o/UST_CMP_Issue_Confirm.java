package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.textField.TextFieldLine;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_Issue_Confirm implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsButtonV1View IAuthTabCallback;
    public final TextFieldLine onExtraCallback;
    public final TdsTopV1T03View onExtraCallbackWithResult;
    private final ConstraintLayout onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    private UST_CMP_Issue_Confirm(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull TextFieldLine textFieldLine, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull TdsTopV1T03View tdsTopV1T03View) {
        this.onNavigationEvent = constraintLayout;
        this.onWarmupCompleted = tdsImageView;
        this.onExtraCallback = textFieldLine;
        this.IAuthTabCallback = tdsButtonV1View;
        this.onExtraCallbackWithResult = tdsTopV1T03View;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static UST_CMP_Issue_Confirm IAuthTabCallback(@NonNull View view) {
        TextFieldLine textFieldLineOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        int i = R.id.cardImage;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.inputCvc))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.notHaveCardButton))) != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.title))) != null) {
            return new UST_CMP_Issue_Confirm((ConstraintLayout) view, tdsImageViewOnNavigationEvent, textFieldLineOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
