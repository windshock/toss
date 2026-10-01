package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetCmpRetunrnInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final LinearLayout IAuthTabCallback;
    public final Typography6 IAuthTabCallbackDefault;
    private final ConstraintLayout asBinder;
    public final View asInterface;
    public final TdsRoundLayout onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    private GetCmpRetunrnInfo(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Typography6 typography6, @NonNull View view) {
        this.asBinder = constraintLayout;
        this.IAuthTabCallback = linearLayout;
        this.onWarmupCompleted = tdsImageView;
        this.onNavigationEvent = tdsImageView2;
        this.onExtraCallback = tdsRoundLayout;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.IAuthTabCallbackDefault = typography6;
        this.asInterface = view;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.asBinder;
    }

    public static GetCmpRetunrnInfo onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dynamic_snackbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static GetCmpRetunrnInfo onWarmupCompleted(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent;
        Typography6 typography6OnNavigationEvent;
        View viewOnNavigationEvent;
        int i = R.id.bottom_sheet;
        LinearLayout linearLayout = (LinearLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (linearLayout != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.left_image))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.right_image))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.round_container))) != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.snackbar))) != null && (typography6OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.snackbar_text))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.v_background))) != null) {
            return new GetCmpRetunrnInfo((ConstraintLayout) view, linearLayout, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, tdsRoundLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent, typography6OnNavigationEvent, viewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
