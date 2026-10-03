package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextFieldLine;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class updateCertificate_SendConf implements SearchBarKtExternalSyntheticLambda5 {
    public final BottomSheetHeader onExtraCallback;
    public final TextFieldLine onExtraCallbackWithResult;
    private final LinearLayout onNavigationEvent;
    public final TdsBottomCtaV1View onWarmupCompleted;

    private updateCertificate_SendConf(@NonNull LinearLayout linearLayout, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull BottomSheetHeader bottomSheetHeader, @NonNull TextFieldLine textFieldLine) {
        this.onNavigationEvent = linearLayout;
        this.onWarmupCompleted = tdsBottomCtaV1View;
        this.onExtraCallback = bottomSheetHeader;
        this.onExtraCallbackWithResult = textFieldLine;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static updateCertificate_SendConf onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static updateCertificate_SendConf onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.transfer_dialog_input_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static updateCertificate_SendConf onExtraCallback(@NonNull View view) {
        BottomSheetHeader bottomSheetHeaderOnNavigationEvent;
        TextFieldLine textFieldLineOnNavigationEvent;
        int i = R.id.bottom_cta;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (bottomSheetHeaderOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.bottom_sheet_header))) != null && (textFieldLineOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text_field))) != null) {
            return new updateCertificate_SendConf((LinearLayout) view, tdsBottomCtaV1ViewOnNavigationEvent, bottomSheetHeaderOnNavigationEvent, textFieldLineOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
