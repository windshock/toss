package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.uikit.widget.textView.top.TdsTopV1T03View;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PKCS12_MakePFX_ENCPKCS8 implements SearchBarKtExternalSyntheticLambda5 {
    public final TdsTopV1T03View IAuthTabCallback;
    private final ConstraintLayout onExtraCallback;
    public final TdsTopV1T03View onExtraCallbackWithResult;
    public final LottieAnimationView onNavigationEvent;

    private PKCS12_MakePFX_ENCPKCS8(@NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull TdsTopV1T03View tdsTopV1T03View, @NonNull TdsTopV1T03View tdsTopV1T03View2) {
        this.onExtraCallback = constraintLayout;
        this.onNavigationEvent = lottieAnimationView;
        this.IAuthTabCallback = tdsTopV1T03View;
        this.onExtraCallbackWithResult = tdsTopV1T03View2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onExtraCallback;
    }

    public static PKCS12_MakePFX_ENCPKCS8 onExtraCallback(@NonNull View view) {
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent;
        TdsTopV1T03View tdsTopV1T03ViewOnNavigationEvent2;
        int i = R.id.loadingImage;
        LottieAnimationView lottieAnimationViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (lottieAnimationViewOnNavigationEvent != null && (tdsTopV1T03ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top))) != null && (tdsTopV1T03ViewOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.top2))) != null) {
            return new PKCS12_MakePFX_ENCPKCS8((ConstraintLayout) view, lottieAnimationViewOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent, tdsTopV1T03ViewOnNavigationEvent2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
