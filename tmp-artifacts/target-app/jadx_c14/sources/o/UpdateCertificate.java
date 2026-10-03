package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;
import viva.republica.toss.widget.PasswordTypeDotView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UpdateCertificate implements SearchBarKtExternalSyntheticLambda5 {
    public final TextFieldLine IAuthTabCallback;
    public final TextFieldLine onExtraCallback;
    public final PasswordTypeDotView onExtraCallbackWithResult;
    private final FrameLayout onNavigationEvent;
    public final View onWarmupCompleted;

    private UpdateCertificate(@NonNull FrameLayout frameLayout, @NonNull TextFieldLine textFieldLine, @NonNull View view, @NonNull PasswordTypeDotView passwordTypeDotView, @NonNull TextFieldLine textFieldLine2) {
        this.onNavigationEvent = frameLayout;
        this.IAuthTabCallback = textFieldLine;
        this.onWarmupCompleted = view;
        this.onExtraCallbackWithResult = passwordTypeDotView;
        this.onExtraCallback = textFieldLine2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static UpdateCertificate IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_rrn_leftmost_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static UpdateCertificate onExtraCallback(@NonNull View view) {
        View viewOnNavigationEvent;
        PasswordTypeDotView passwordTypeDotViewOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        int i = R.id.birthdayInput;
        TextFieldLine textFieldLineOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (textFieldLineOnNavigationEvent2 != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.dashSeparator))) != null && (passwordTypeDotViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnRightmostText))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.rrnSeventhInput))) != null) {
            return new UpdateCertificate((FrameLayout) view, textFieldLineOnNavigationEvent2, viewOnNavigationEvent, passwordTypeDotViewOnNavigationEvent, textFieldLineOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
