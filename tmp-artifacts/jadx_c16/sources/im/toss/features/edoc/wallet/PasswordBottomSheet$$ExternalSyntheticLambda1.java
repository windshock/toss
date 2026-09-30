package im.toss.features.edoc.wallet;

import android.view.KeyEvent;
import android.widget.TextView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.textField.TextFieldLine;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PasswordBottomSheet$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TdsButtonV1View f$0;
    public final /* synthetic */ TextFieldLine f$1;
    public final /* synthetic */ PasswordBottomSheet f$2;

    public /* synthetic */ PasswordBottomSheet$$ExternalSyntheticLambda1(TdsButtonV1View tdsButtonV1View, TextFieldLine textFieldLine, PasswordBottomSheet passwordBottomSheet) {
        this.f$0 = tdsButtonV1View;
        this.f$1 = textFieldLine;
        this.f$2 = passwordBottomSheet;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean zIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            zIAuthTabCallback = PasswordBottomSheet.IAuthTabCallback(this.f$0, this.f$1, this.f$2, textView, i, keyEvent);
            int i4 = 27 / 0;
        } else {
            zIAuthTabCallback = PasswordBottomSheet.IAuthTabCallback(this.f$0, this.f$1, this.f$2, textView, i, keyEvent);
        }
        int i5 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
