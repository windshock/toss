package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.widget.TransferConfirmBottomRowView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeyGenerator implements SearchBarKtExternalSyntheticLambda5 {
    public final TransferConfirmBottomRowView IAuthTabCallback;
    private final View onExtraCallback;
    public final TdsBottomCtaV1View onExtraCallbackWithResult;
    public final TransferConfirmBottomRowView onNavigationEvent;
    public final TransferConfirmBottomRowView onWarmupCompleted;

    private KeyGenerator(@NonNull View view, @NonNull TdsBottomCtaV1View tdsBottomCtaV1View, @NonNull TransferConfirmBottomRowView transferConfirmBottomRowView, @NonNull TransferConfirmBottomRowView transferConfirmBottomRowView2, @NonNull TransferConfirmBottomRowView transferConfirmBottomRowView3) {
        this.onExtraCallback = view;
        this.onExtraCallbackWithResult = tdsBottomCtaV1View;
        this.onNavigationEvent = transferConfirmBottomRowView;
        this.IAuthTabCallback = transferConfirmBottomRowView2;
        this.onWarmupCompleted = transferConfirmBottomRowView3;
    }

    public View getRoot() {
        return this.onExtraCallback;
    }

    public static KeyGenerator onExtraCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_transfer_confirm_bottom, viewGroup);
        return onNavigationEvent(viewGroup);
    }

    public static KeyGenerator onNavigationEvent(@NonNull View view) {
        TransferConfirmBottomRowView transferConfirmBottomRowViewOnNavigationEvent;
        TransferConfirmBottomRowView transferConfirmBottomRowViewOnNavigationEvent2;
        TransferConfirmBottomRowView transferConfirmBottomRowViewOnNavigationEvent3;
        int i = R.id.bottom_cta_send;
        TdsBottomCtaV1View tdsBottomCtaV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsBottomCtaV1ViewOnNavigationEvent != null && (transferConfirmBottomRowViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.deposit_row))) != null && (transferConfirmBottomRowViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.message_row))) != null && (transferConfirmBottomRowViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.withdraw_row))) != null) {
            return new KeyGenerator(view, tdsBottomCtaV1ViewOnNavigationEvent, transferConfirmBottomRowViewOnNavigationEvent, transferConfirmBottomRowViewOnNavigationEvent2, transferConfirmBottomRowViewOnNavigationEvent3);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
