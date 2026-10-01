package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.widget.SafePlayerView;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CMS_VerifySignedDataWithContent implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final TdsImageView onExtraCallbackWithResult;
    public final SafePlayerView onNavigationEvent;

    private CMS_VerifySignedDataWithContent(@NonNull ConstraintLayout constraintLayout, @NonNull TdsImageView tdsImageView, @NonNull SafePlayerView safePlayerView) {
        this.IAuthTabCallback = constraintLayout;
        this.onExtraCallbackWithResult = tdsImageView;
        this.onNavigationEvent = safePlayerView;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static CMS_VerifySignedDataWithContent onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return IAuthTabCallback(layoutInflater, null, false);
    }

    public static CMS_VerifySignedDataWithContent IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_video_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onExtraCallback(viewInflate);
    }

    public static CMS_VerifySignedDataWithContent onExtraCallback(@NonNull View view) {
        SafePlayerView safePlayerViewOnNavigationEvent;
        int i = R.id.close;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (tdsImageViewOnNavigationEvent != null && (safePlayerViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.video_view))) != null) {
            return new CMS_VerifySignedDataWithContent((ConstraintLayout) view, tdsImageViewOnNavigationEvent, safePlayerViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
