package o;

import android.opengl.GLSurfaceView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.gl.AnimateMaskedImageView;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1ySDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    public final GLSurfaceView IAuthTabCallback;
    public final AnimateMaskedImageView onExtraCallback;
    private final ConstraintLayout onNavigationEvent;
    public final AnimateMaskedImageView onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return constraintLayoutOnExtraCallbackWithResult;
    }

    private AFk1ySDK(@NonNull ConstraintLayout constraintLayout, @NonNull GLSurfaceView gLSurfaceView, @NonNull AnimateMaskedImageView animateMaskedImageView, @NonNull AnimateMaskedImageView animateMaskedImageView2) {
        this.onNavigationEvent = constraintLayout;
        this.IAuthTabCallback = gLSurfaceView;
        this.onExtraCallback = animateMaskedImageView;
        this.onWarmupCompleted = animateMaskedImageView2;
    }

    public ConstraintLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.onNavigationEvent;
        int i5 = i2 + 17;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static AFk1ySDK IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.view_auth_background_loading, viewGroup, false);
        if (z) {
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i3 = 58 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        AFk1ySDK aFk1ySDKOnNavigationEvent = onNavigationEvent(viewInflate);
        int i4 = IAuthTabCallbackDefault + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFk1ySDKOnNavigationEvent;
    }

    public static AFk1ySDK onNavigationEvent(@NonNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.blur_toss;
            GLSurfaceView gLSurfaceView = (GLSurfaceView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
            if (gLSurfaceView != null) {
                i3 = R.id.iv_ring_1;
                AnimateMaskedImageView animateMaskedImageView = (AnimateMaskedImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                if (animateMaskedImageView != null) {
                    i3 = R.id.iv_ring_2;
                    AnimateMaskedImageView animateMaskedImageView2 = (AnimateMaskedImageView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i3);
                    if (animateMaskedImageView2 != null) {
                        AFk1ySDK aFk1ySDK = new AFk1ySDK((ConstraintLayout) view, gLSurfaceView, animateMaskedImageView, animateMaskedImageView2);
                        int i4 = IAuthTabCallbackDefault + 5;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            return aFk1ySDK;
                        }
                        throw null;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
