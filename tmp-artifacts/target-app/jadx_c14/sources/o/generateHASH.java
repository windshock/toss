package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import viva.republica.toss.R;
import viva.republica.toss.send.v4.widget.TransferFdsIconView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class generateHASH implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final View IAuthTabCallbackDefault;
    public final Typography3 IAuthTabCallbackStub;
    private final View IAuthTabCallbackStubProxy;
    public final LinearLayout IAuthTabCallback_Parcel;
    public final Typography6 access000;
    public final TransferFdsIconView access100;
    public final Typography3 asBinder;
    public final Typography3 asInterface;
    public final View onExtraCallback;
    public final AnimateText onExtraCallbackWithResult;
    public final View onNavigationEvent;
    public final TdsRoundLayout onTransact;
    public final View onWarmupCompleted;

    private generateHASH(@NonNull View view, @NonNull AnimateText animateText, @NonNull TdsImageView tdsImageView, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull Typography3 typography3, @NonNull Typography3 typography32, @NonNull Typography3 typography33, @NonNull Typography6 typography6, @NonNull TransferFdsIconView transferFdsIconView, @NonNull LinearLayout linearLayout) {
        this.IAuthTabCallbackStubProxy = view;
        this.onExtraCallbackWithResult = animateText;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = view2;
        this.onNavigationEvent = view3;
        this.onWarmupCompleted = view4;
        this.IAuthTabCallbackDefault = view5;
        this.onTransact = tdsRoundLayout;
        this.asInterface = typography3;
        this.IAuthTabCallbackStub = typography32;
        this.asBinder = typography33;
        this.access000 = typography6;
        this.access100 = transferFdsIconView;
        this.IAuthTabCallback_Parcel = linearLayout;
    }

    public View getRoot() {
        return this.IAuthTabCallbackStubProxy;
    }

    public static generateHASH onExtraCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_transfer_info_row, viewGroup);
        return IAuthTabCallback(viewGroup);
    }

    public static generateHASH IAuthTabCallback(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        View viewOnNavigationEvent;
        View viewOnNavigationEvent2;
        View viewOnNavigationEvent3;
        View viewOnNavigationEvent4;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography3 typography3OnNavigationEvent;
        Typography3 typography3OnNavigationEvent2;
        Typography3 typography3OnNavigationEvent3;
        Typography6 typography6OnNavigationEvent;
        TransferFdsIconView transferFdsIconViewOnNavigationEvent;
        int i = R.id.animate_text2;
        AnimateText animateTextOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (animateTextOnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.arrow_down))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.padding_bottom))) != null && (viewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.padding_end))) != null && (viewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.padding_start))) != null && (viewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.padding_top))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.ripple_background))) != null && (typography3OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text1))) != null && (typography3OnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text1_prefix))) != null && (typography3OnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text1_suffix))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text2))) != null && (transferFdsIconViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.text2_icon))) != null) {
            i = R.id.view_text1;
            LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (linearLayout != null) {
                return new generateHASH(view, animateTextOnNavigationEvent, tdsImageViewOnNavigationEvent, viewOnNavigationEvent, viewOnNavigationEvent2, viewOnNavigationEvent3, viewOnNavigationEvent4, tdsRoundLayoutOnNavigationEvent, typography3OnNavigationEvent, typography3OnNavigationEvent2, typography3OnNavigationEvent3, typography6OnNavigationEvent, transferFdsIconViewOnNavigationEvent, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
