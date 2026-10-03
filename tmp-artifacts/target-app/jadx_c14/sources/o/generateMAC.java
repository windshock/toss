package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class generateMAC implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsImageView IAuthTabCallback;
    public final LottieAnimationView onExtraCallback;
    private final ConstraintLayout onWarmupCompleted;

    private generateMAC(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull LottieAnimationView lottieAnimationView) {
        this.onWarmupCompleted = constraintLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = lottieAnimationView;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static generateMAC onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_transfer_fds_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static generateMAC onNavigationEvent(@NonNull View view) {
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        int i = R.id.image;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.lottie))) != null) {
            return new generateMAC((ConstraintLayout) view, tdsImageViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
