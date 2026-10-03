package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.widget.TransferFdsIconView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class verifyMAC implements SearchBarKtExternalSyntheticLambda5 {
    public final TransferFdsIconView IAuthTabCallback;
    public final View asInterface;
    public final TdsRoundLayout onExtraCallback;
    public final Typography6 onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    private final View onTransact;
    public final Typography6 onWarmupCompleted;

    private verifyMAC(@NonNull View view, @NonNull Typography6 typography6, @NonNull Typography6 typography62, @NonNull TdsImageView tdsImageView, @NonNull TransferFdsIconView transferFdsIconView, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull View view2) {
        this.onTransact = view;
        this.onExtraCallbackWithResult = typography6;
        this.onWarmupCompleted = typography62;
        this.onNavigationEvent = tdsImageView;
        this.IAuthTabCallback = transferFdsIconView;
        this.onExtraCallback = tdsRoundLayout;
        this.asInterface = view2;
    }

    public View getRoot() {
        return this.onTransact;
    }

    public static verifyMAC onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_transfer_confirm_bottom_row, viewGroup);
        return IAuthTabCallback(viewGroup);
    }

    public static verifyMAC IAuthTabCallback(@NonNull View view) {
        Typography6 typography6OnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TransferFdsIconView transferFdsIconViewOnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.confirm_row_left_text;
        Typography6 typography6OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (typography6OnNavigationEvent2 != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_row_right_text))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_row_right_text_arrow))) != null && (transferFdsIconViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_row_right_text_icon))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.confirm_row_ripple_background))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.space_end))) != null) {
            return new verifyMAC(view, typography6OnNavigationEvent2, typography6OnNavigationEvent, tdsImageViewOnNavigationEvent, transferFdsIconViewOnNavigationEvent, tdsRoundLayoutOnNavigationEvent, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
