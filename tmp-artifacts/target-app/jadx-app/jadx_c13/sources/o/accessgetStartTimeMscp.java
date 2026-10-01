package o;

import android.text.Editable;
import android.text.TextWatcher;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class accessgetStartTimeMscp implements TextWatcher {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
