package im.toss.features.edoc.wallet;

import android.view.View;
import im.toss.uikit.widget.textField.TextFieldLine;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PasswordBottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TextFieldLine f$0;
    public final /* synthetic */ PasswordBottomSheet f$1;

    public /* synthetic */ PasswordBottomSheet$$ExternalSyntheticLambda0(TextFieldLine textFieldLine, PasswordBottomSheet passwordBottomSheet) {
        this.f$0 = textFieldLine;
        this.f$1 = passwordBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TextFieldLine textFieldLine = this.f$0;
        if (i3 == 0) {
            PasswordBottomSheet.onWarmupCompleted(textFieldLine, this.f$1, view);
        } else {
            PasswordBottomSheet.onWarmupCompleted(textFieldLine, this.f$1, view);
            int i4 = 71 / 0;
        }
    }
}
