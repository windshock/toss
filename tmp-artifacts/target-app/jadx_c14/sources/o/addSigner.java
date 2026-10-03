package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class addSigner implements SearchBarKtExternalSyntheticLambda5 {
    public final FrameLayout IAuthTabCallback;
    public final TdsRoundLayout onExtraCallback;
    private final ConstraintLayout onExtraCallbackWithResult;
    public final TdsImageView onNavigationEvent;
    public final TdsImageView onWarmupCompleted;

    private addSigner(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2) {
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = frameLayout;
        this.onExtraCallback = tdsRoundLayout;
        this.onNavigationEvent = tdsImageView;
        this.onWarmupCompleted = tdsImageView2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallbackWithResult;
    }

    public static addSigner onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_card_design_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static addSigner onExtraCallback(@NonNull View view) {
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent2;
        int i = R.id.border;
        FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (frameLayout != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.box))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.card_image))) != null && (tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.check_image))) != null) {
            return new addSigner((ConstraintLayout) view, frameLayout, tdsRoundLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
