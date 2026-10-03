package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.core.widget.TdsWebSmoothProgressBarV1View;
import im.toss.core.widget.TransparentAppBarLayout;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetSerial implements SearchBarKtExternalSyntheticLambda5 {
    public final TransparentAppBarLayout IAuthTabCallback;
    private final ConstraintLayout IAuthTabCallbackDefault;
    public final FrameLayout IAuthTabCallbackStub;
    public final ConstraintLayout asBinder;
    public final TdsWebSmoothProgressBarV1View asInterface;
    public final FrameLayout onExtraCallback;
    public final FrameLayout onExtraCallbackWithResult;
    public final TransparentAppBarLayout onNavigationEvent;
    public final FrameLayout onWarmupCompleted;

    private CERT_GetSerial(@NonNull ConstraintLayout constraintLayout, @NonNull TransparentAppBarLayout transparentAppBarLayout, @NonNull FrameLayout frameLayout, @NonNull TransparentAppBarLayout transparentAppBarLayout2, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, @NonNull ConstraintLayout constraintLayout2) {
        this.IAuthTabCallbackDefault = constraintLayout;
        this.onNavigationEvent = transparentAppBarLayout;
        this.onExtraCallback = frameLayout;
        this.IAuthTabCallback = transparentAppBarLayout2;
        this.onExtraCallbackWithResult = frameLayout2;
        this.onWarmupCompleted = frameLayout3;
        this.IAuthTabCallbackStub = frameLayout4;
        this.asInterface = tdsWebSmoothProgressBarV1View;
        this.asBinder = constraintLayout2;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallbackDefault;
    }

    public static CERT_GetSerial onWarmupCompleted(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CERT_GetSerial onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_lab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return onWarmupCompleted(viewInflate);
    }

    public static CERT_GetSerial onWarmupCompleted(@NonNull View view) {
        TransparentAppBarLayout transparentAppBarLayoutOnNavigationEvent;
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1ViewOnNavigationEvent;
        int i = R.id.appBarLayout;
        TransparentAppBarLayout transparentAppBarLayoutOnNavigationEvent2 = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (transparentAppBarLayoutOnNavigationEvent2 != null) {
            i = R.id.appBarLayoutContainer;
            FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
            if (frameLayout != null && (transparentAppBarLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.appBarLayoutDay))) != null) {
                i = R.id.lab_container;
                FrameLayout frameLayout2 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                if (frameLayout2 != null) {
                    i = R.id.lab_embedded_rn_container;
                    FrameLayout frameLayout3 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                    if (frameLayout3 != null) {
                        i = R.id.lab_embedded_rn_loading_container;
                        FrameLayout frameLayout4 = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
                        if (frameLayout4 != null && (tdsWebSmoothProgressBarV1ViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i = R.id.progressBar))) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new CERT_GetSerial(constraintLayout, transparentAppBarLayoutOnNavigationEvent2, frameLayout, transparentAppBarLayoutOnNavigationEvent, frameLayout2, frameLayout3, frameLayout4, tdsWebSmoothProgressBarV1ViewOnNavigationEvent, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
