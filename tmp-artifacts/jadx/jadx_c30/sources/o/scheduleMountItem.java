package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import viva.republica.toss.tosssecurities.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class scheduleMountItem implements SearchBarKtExternalSyntheticLambda5 {
    public final SubsamplingScaleImageView onExtraCallbackWithResult;
    private final FrameLayout onWarmupCompleted;

    private scheduleMountItem(@NonNull FrameLayout frameLayout, @NonNull SubsamplingScaleImageView subsamplingScaleImageView) {
        this.onWarmupCompleted = frameLayout;
        this.onExtraCallbackWithResult = subsamplingScaleImageView;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static scheduleMountItem IAuthTabCallback(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallbackWithResult(layoutInflater, null, false);
    }

    public static scheduleMountItem onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_securities_image_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static scheduleMountItem IAuthTabCallback(@NonNull View view) {
        int i = R.id.imageView;
        SubsamplingScaleImageView subsamplingScaleImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (subsamplingScaleImageViewOnNavigationEvent != null) {
            return new scheduleMountItem((FrameLayout) view, subsamplingScaleImageViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
