package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import im.toss.uikit.gradient.TdsAngularGradientView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1zSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    public final TdsAngularGradientView IAuthTabCallback;
    public final LottieAnimationView IAuthTabCallbackStub;
    public final TdsImageView asBinder;
    private final View asInterface;
    public final ConstraintLayout onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final TdsButtonV1View onNavigationEvent;
    public final View onWarmupCompleted;

    private AFk1zSDK(@NonNull View view, @NonNull TdsAngularGradientView tdsAngularGradientView, @NonNull ConstraintLayout constraintLayout, @NonNull View view2, @NonNull TdsButtonV1View tdsButtonV1View, @NonNull ConstraintLayout constraintLayout2, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsImageView tdsImageView) {
        this.asInterface = view;
        this.IAuthTabCallback = tdsAngularGradientView;
        this.onExtraCallbackWithResult = constraintLayout;
        this.onWarmupCompleted = view2;
        this.onNavigationEvent = tdsButtonV1View;
        this.onExtraCallback = constraintLayout2;
        this.IAuthTabCallbackStub = lottieAnimationView;
        this.asBinder = tdsImageView;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        View view = this.asInterface;
        int i5 = i2 + 101;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public static AFk1zSDK onExtraCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_mobile_identification_card, viewGroup);
        AFk1zSDK aFk1zSDKOnNavigationEvent = onNavigationEvent(viewGroup);
        int i4 = onTransact + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aFk1zSDKOnNavigationEvent;
    }

    public static AFk1zSDK onNavigationEvent(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        View viewOnNavigationEvent;
        TdsButtonV1View tdsButtonV1ViewOnNavigationEvent;
        LottieAnimationView lottieAnimationViewOnNavigationEvent;
        TdsImageView tdsImageViewOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.angular_gradient_border;
        TdsAngularGradientView tdsAngularGradientView = (TdsAngularGradientView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (tdsAngularGradientView != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.cardContainer))) != null && (viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.dim))) != null && (tdsButtonV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.disabledButton))) != null) {
            int i3 = onTransact + 111;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.disabledView;
            ConstraintLayout constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (constraintLayoutOnNavigationEvent2 != null && (lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.lottieView))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.main_image))) != null) {
                AFk1zSDK aFk1zSDK = new AFk1zSDK(view, tdsAngularGradientView, constraintLayoutOnNavigationEvent, viewOnNavigationEvent, tdsButtonV1ViewOnNavigationEvent, constraintLayoutOnNavigationEvent2, lottieAnimationViewOnNavigationEvent, tdsImageViewOnNavigationEvent);
                int i5 = onTransact + 55;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 19 / 0;
                }
                return aFk1zSDK;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
