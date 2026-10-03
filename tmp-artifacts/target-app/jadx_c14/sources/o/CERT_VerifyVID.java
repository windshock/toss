package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.Toolbar;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_VerifyVID implements SearchBarKtExternalSyntheticLambda5 {
    public final LottieAnimationView IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackStub;
    public final Toolbar onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final AppBarLayout onNavigationEvent;
    public final FrameLayout onWarmupCompleted;

    private CERT_VerifyVID(@NonNull ConstraintLayout constraintLayout, @NonNull AppBarLayout appBarLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull Toolbar toolbar) {
        this.IAuthTabCallbackStub = constraintLayout;
        this.onNavigationEvent = appBarLayout;
        this.onExtraCallbackWithResult = constraintLayout2;
        this.onWarmupCompleted = frameLayout;
        this.IAuthTabCallback = lottieAnimationView;
        this.onExtraCallback = toolbar;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackStub;
    }

    public static CERT_VerifyVID onExtraCallback(@NonNull LayoutInflater layoutInflater) {
        return onNavigationEvent(layoutInflater, null, false);
    }

    public static CERT_VerifyVID onNavigationEvent(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_password_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CERT_VerifyVID IAuthTabCallback(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        Toolbar toolbarOnNavigationEvent;
        int i = R.id.app_bar_layout;
        AppBarLayout appBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (appBarLayoutOnNavigationEvent != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.layout_loading_indicator))) != null) {
            i = R.id.password_setting_container;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progressLottieView))) != null && (toolbarOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.toolbar))) != null) {
                return new CERT_VerifyVID((ConstraintLayout) view, appBarLayoutOnNavigationEvent, constraintLayoutOnNavigationEvent, frameLayout, lottieAnimationViewOnNavigationEvent, toolbarOnNavigationEvent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
