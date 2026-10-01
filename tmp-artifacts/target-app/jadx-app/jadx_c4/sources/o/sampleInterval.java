package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import im.toss.feature.credit.ui.main.R;
import im.toss.tds.view.component.atom.image.TdsImageView;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class sampleInterval implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    public final TdsImageView IAuthTabCallback;
    public final FrameLayout IAuthTabCallbackDefault;
    private final FrameLayout asInterface;
    public final TdsImageView onExtraCallback;
    public final com.airbnb.lottie.LottieAnimationView onExtraCallbackWithResult;
    public final com.airbnb.lottie.LottieAnimationView onNavigationEvent;
    public final View onWarmupCompleted;

    public /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return frameLayoutOnExtraCallbackWithResult;
        }
        throw null;
    }

    private sampleInterval(@NonNull FrameLayout frameLayout, @NonNull TdsImageView tdsImageView, @NonNull TdsImageView tdsImageView2, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView2, @NonNull View view, @NonNull FrameLayout frameLayout2) {
        this.asInterface = frameLayout;
        this.IAuthTabCallback = tdsImageView;
        this.onExtraCallback = tdsImageView2;
        this.onExtraCallbackWithResult = lottieAnimationView;
        this.onNavigationEvent = lottieAnimationView2;
        this.onWarmupCompleted = view;
        this.IAuthTabCallbackDefault = frameLayout2;
    }

    public FrameLayout onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 67;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = this.asInterface;
        int i5 = i2 + 75;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public static sampleInterval onWarmupCompleted(@NonNull View view) {
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent;
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.background_opacity_ring;
        TdsImageView tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
        if (tdsImageViewOnNavigationEvent != null) {
            int i5 = onTransact + 121;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.background_ring;
            TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
            if (tdsImageViewOnNavigationEvent2 != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.blue_ring))) != null && (lottieAnimationViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i4 = R.id.color_ring))) != null) {
                int i7 = onTransact + 37;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.gradient_background);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i4 = R.id.gradient_background;
                View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i4);
                if (viewOnNavigationEvent != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    sampleInterval sampleinterval = new sampleInterval(frameLayout, tdsImageViewOnNavigationEvent, tdsImageViewOnNavigationEvent2, lottieAnimationViewOnNavigationEvent, lottieAnimationViewOnNavigationEvent2, viewOnNavigationEvent, frameLayout);
                    int i8 = onTransact + 71;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    return sampleinterval;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
