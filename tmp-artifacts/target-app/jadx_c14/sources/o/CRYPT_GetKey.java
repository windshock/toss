package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextField;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_GetKey implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsButtonV1View onExtraCallback;
    public final TextField onExtraCallbackWithResult;
    public final BottomSheetHeader onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private CRYPT_GetKey(@NonNull ConstraintLayout constraintLayout, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull TextField textField) {
        this.onWarmupCompleted = constraintLayout;
        this.onExtraCallback = tdsButtonV1View;
        this.onNavigationEvent = bottomSheetHeader;
        this.onExtraCallbackWithResult = textField;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static CRYPT_GetKey onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CRYPT_GetKey onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_input_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CRYPT_GetKey onNavigationEvent(@NonNull View view) {
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        TextField textFieldOnNavigationEvent;
        int i = R.id.button;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsButtonV1ViewOnNavigationEvent != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.header))) != null && (textFieldOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.input))) != null) {
            return new CRYPT_GetKey((ConstraintLayout) view, tdsButtonV1ViewOnNavigationEvent, bottomSheetHeaderOnNavigationEvent, textFieldOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
