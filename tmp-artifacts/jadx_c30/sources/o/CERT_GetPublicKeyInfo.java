package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CERT_GetPublicKeyInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final SubsamplingScaleImageView IAuthTabCallback;
    private final FrameLayout onWarmupCompleted;

    private CERT_GetPublicKeyInfo(@NonNull FrameLayout frameLayout, @NonNull SubsamplingScaleImageView subsamplingScaleImageView) {
        this.onWarmupCompleted = frameLayout;
        this.IAuthTabCallback = subsamplingScaleImageView;
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static CERT_GetPublicKeyInfo onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onExtraCallback(layoutInflater, null, false);
    }

    public static CERT_GetPublicKeyInfo onExtraCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_image_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onNavigationEvent(viewInflate);
    }

    public static CERT_GetPublicKeyInfo onNavigationEvent(@NonNull View view) {
        int i = R.id.imageView;
        SubsamplingScaleImageView subsamplingScaleImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (subsamplingScaleImageViewOnNavigationEvent != null) {
            return new CERT_GetPublicKeyInfo((FrameLayout) view, subsamplingScaleImageViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
