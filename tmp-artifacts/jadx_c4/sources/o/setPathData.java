package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.toss.ads_sdk.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.Typography;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsSquircleLayoutV1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPathData implements SearchBarKtExternalSyntheticLambda5 {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public final TdsSquircleLayoutV1 IAuthTabCallback;
    public final Typography IAuthTabCallbackDefault;
    private final View asBinder;
    public final Typography7 onExtraCallback;
    public final com.airbnb.lottie.LottieAnimationView onExtraCallbackWithResult;
    public final TdsRoundLayout onNavigationEvent;
    public final Typography5 onTransact;
    public final TdsImageView onWarmupCompleted;

    private setPathData(@NonNull View view, @NonNull Typography7 typography7, @NonNull TdsImageView tdsImageView, @NonNull TdsSquircleLayoutV1 tdsSquircleLayoutV1, @NonNull TdsRoundLayout tdsRoundLayout, @NonNull com.airbnb.lottie.LottieAnimationView lottieAnimationView, @NonNull Typography typography, @NonNull Typography5 typography5) {
        this.asBinder = view;
        this.onExtraCallback = typography7;
        this.onWarmupCompleted = tdsImageView;
        this.IAuthTabCallback = tdsSquircleLayoutV1;
        this.onNavigationEvent = tdsRoundLayout;
        this.onExtraCallbackWithResult = lottieAnimationView;
        this.IAuthTabCallbackDefault = typography;
        this.onTransact = typography5;
    }

    public View getRoot() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        View view = this.asBinder;
        int i5 = i2 + 13;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public static setPathData IAuthTabCallback(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ads_sdk_right_banner_view, viewGroup);
        setPathData setpathdataOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        int i3 = asInterface + 65;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return setpathdataOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static setPathData onExtraCallbackWithResult(@NonNull View view) {
        TdsImageView tdsImageViewOnNavigationEvent;
        TdsSquircleLayoutV1 tdsSquircleLayoutV1OnNavigationEvent;
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent;
        Typography typographyOnNavigationEvent;
        int i = 2 % 2;
        int i2 = R.id.description;
        Typography7 typography7OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
        if (typography7OnNavigationEvent != null && (tdsImageViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.image))) != null && (tdsSquircleLayoutV1OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.imageContainer))) != null && (tdsRoundLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.innerContainer))) != null) {
            int i3 = asInterface + 45;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.lottie;
            com.airbnb.lottie.LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (lottieAnimationViewOnNavigationEvent != null && (typographyOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.reviewNo))) != null) {
                int i5 = asInterface + 23;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.title;
                Typography5 typography5OnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
                if (typography5OnNavigationEvent != null) {
                    setPathData setpathdata = new setPathData(view, typography7OnNavigationEvent, tdsImageViewOnNavigationEvent, tdsSquircleLayoutV1OnNavigationEvent, tdsRoundLayoutOnNavigationEvent, lottieAnimationViewOnNavigationEvent, typographyOnNavigationEvent, typography5OnNavigationEvent);
                    int i7 = asInterface + 109;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    return setpathdata;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
