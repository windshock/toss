package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class makeRrContent implements SearchBarKtExternalSyntheticLambda5 {
    private final TextFieldLine IAuthTabCallback;

    private makeRrContent(@NonNull TextFieldLine textFieldLine) {
        this.IAuthTabCallback = textFieldLine;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public TextFieldLine getRoot() {
        return this.IAuthTabCallback;
    }

    public static makeRrContent onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_textfield_line, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static makeRrContent onWarmupCompleted(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new makeRrContent((TextFieldLine) view);
    }
}
