package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UCPID_GenRequestInfo implements SearchBarKtExternalSyntheticLambda5 {
    public final FrameLayout onExtraCallback;
    private final ConstraintLayout onNavigationEvent;

    private UCPID_GenRequestInfo(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.onNavigationEvent = constraintLayout;
        this.onExtraCallback = frameLayout;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onNavigationEvent;
    }

    public static UCPID_GenRequestInfo IAuthTabCallback(@NonNull View view) {
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (frameLayout != null) {
            return new UCPID_GenRequestInfo((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
