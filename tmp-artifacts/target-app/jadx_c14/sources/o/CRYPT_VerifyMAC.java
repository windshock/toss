package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import im.toss.tds.view.component.atom.text.Typography6;
import viva.republica.toss.R;
import viva.republica.toss.send.periodic.view.PeriodicTransferPicker;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CRYPT_VerifyMAC implements SearchBarKtExternalSyntheticLambda5 {
    public final Typography6 IAuthTabCallback;
    public final PeriodicTransferPicker onExtraCallback;
    private final LinearLayout onExtraCallbackWithResult;
    public final Typography6 onNavigationEvent;

    private CRYPT_VerifyMAC(@NonNull LinearLayout linearLayout, @NonNull Typography6 typography6, @NonNull PeriodicTransferPicker periodicTransferPicker, @NonNull Typography6 typography62) {
        this.onExtraCallbackWithResult = linearLayout;
        this.IAuthTabCallback = typography6;
        this.onExtraCallback = periodicTransferPicker;
        this.onNavigationEvent = typography62;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static CRYPT_VerifyMAC onNavigationEvent(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CRYPT_VerifyMAC IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_periodic_transfer_picker_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CRYPT_VerifyMAC onWarmupCompleted(@NonNull View view) {
        PeriodicTransferPicker periodicTransferPickerOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        int i = R.id.confirm;
        Typography6 typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography6OnNavigationEvent2 != null && (periodicTransferPickerOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.picker))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.reset))) != null) {
            return new CRYPT_VerifyMAC((LinearLayout) view, typography6OnNavigationEvent2, periodicTransferPickerOnNavigationEvent, typography6OnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
