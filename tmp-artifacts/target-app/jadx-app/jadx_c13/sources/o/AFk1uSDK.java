package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.CircleView;
import im.toss.uikit.R;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFk1uSDK implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    public final ConstraintLayout IAuthTabCallback;
    public final ConstraintLayout IAuthTabCallbackDefault;
    public final CircleView IAuthTabCallbackStub;
    private final View access100;
    public final CircleView asBinder;
    public final TdsImageView asInterface;
    public final CircleView onExtraCallback;
    public final ConstraintLayout onExtraCallbackWithResult;
    public final CircleView onNavigationEvent;
    public final CircleView onTransact;
    public final TdsImageView onWarmupCompleted;

    private AFk1uSDK(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TdsImageView tdsImageView, @NonNull CircleView circleView, @NonNull CircleView circleView2, @NonNull CircleView circleView3, @NonNull CircleView circleView4, @NonNull CircleView circleView5, @NonNull TdsImageView tdsImageView2, @NonNull ConstraintLayout constraintLayout3) {
        this.access100 = view;
        this.onExtraCallbackWithResult = constraintLayout;
        this.IAuthTabCallback = constraintLayout2;
        this.onWarmupCompleted = tdsImageView;
        this.onNavigationEvent = circleView;
        this.onExtraCallback = circleView2;
        this.asBinder = circleView3;
        this.IAuthTabCallbackStub = circleView4;
        this.onTransact = circleView5;
        this.asInterface = tdsImageView2;
        this.IAuthTabCallbackDefault = constraintLayout3;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = access000 + 107;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        View view = this.access100;
        int i5 = i3 + 79;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return view;
    }

    public static AFk1uSDK IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_auth_pin_dot, viewGroup);
        AFk1uSDK aFk1uSDKOnExtraCallback = onExtraCallback(viewGroup);
        int i3 = IAuthTabCallback_Parcel + 27;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return aFk1uSDKOnExtraCallback;
    }

    public static AFk1uSDK onExtraCallback(@NonNull View view) {
        ConstraintLayout constraintLayoutOnNavigationEvent;
        CircleView circleViewOnNavigationEvent;
        CircleView circleViewOnNavigationEvent2;
        CircleView circleViewOnNavigationEvent3;
        TdsImageView tdsImageViewOnNavigationEvent;
        ConstraintLayout constraintLayoutOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = R.id.big_container;
        ConstraintLayout constraintLayoutOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (constraintLayoutOnNavigationEvent3 != null && (constraintLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.fill_container))) != null) {
            int i3 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.iv_blue_gradient;
            TdsImageView tdsImageViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (tdsImageViewOnNavigationEvent2 != null && (circleViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_dot_big))) != null) {
                int i5 = access000 + 125;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.iv_dot_big_red;
                CircleView circleViewOnNavigationEvent4 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (circleViewOnNavigationEvent4 != null) {
                    int i7 = access000 + 69;
                    IAuthTabCallback_Parcel = i7 % 128;
                    if (i7 % 2 == 0) {
                        SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, R.id.iv_dot_fill);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i2 = R.id.iv_dot_fill;
                    CircleView circleViewOnNavigationEvent5 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                    if (circleViewOnNavigationEvent5 != null && (circleViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_dot_fill_red))) != null && (circleViewOnNavigationEvent3 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_dot_small))) != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.iv_red_gradient))) != null && (constraintLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.small_container))) != null) {
                        return new AFk1uSDK(view, constraintLayoutOnNavigationEvent3, constraintLayoutOnNavigationEvent, tdsImageViewOnNavigationEvent2, circleViewOnNavigationEvent, circleViewOnNavigationEvent4, circleViewOnNavigationEvent5, circleViewOnNavigationEvent2, circleViewOnNavigationEvent3, tdsImageViewOnNavigationEvent, constraintLayoutOnNavigationEvent2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
