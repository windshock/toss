package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.webview.TossWebView;
import viva.republica.toss.R;
import viva.republica.toss.widget.TouchSlopSwipeRefreshLayout;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTSAHashValue implements SearchBarKtExternalSyntheticLambda5 {
    public final updateCertificate_NoConf IAuthTabCallback;
    public final TouchSlopSwipeRefreshLayout onExtraCallbackWithResult;
    public final TossWebView onNavigationEvent;
    private final ConstraintLayout onWarmupCompleted;

    private GetTSAHashValue(@NonNull ConstraintLayout constraintLayout, @NonNull updateCertificate_NoConf updatecertificate_noconf, @NonNull TouchSlopSwipeRefreshLayout touchSlopSwipeRefreshLayout, @NonNull TossWebView tossWebView) {
        this.onWarmupCompleted = constraintLayout;
        this.IAuthTabCallback = updatecertificate_noconf;
        this.onExtraCallbackWithResult = touchSlopSwipeRefreshLayout;
        this.onNavigationEvent = tossWebView;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static GetTSAHashValue IAuthTabCallback(@NonNull View view) {
        TossWebView tossWebViewOnNavigationEvent;
        int i = R.id.progress;
        View viewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (viewOnNavigationEvent != null) {
            updateCertificate_NoConf updatecertificate_noconfOnExtraCallback = updateCertificate_NoConf.onExtraCallback(viewOnNavigationEvent);
            int i2 = R.id.swipeRefreshLayout;
            TouchSlopSwipeRefreshLayout touchSlopSwipeRefreshLayoutOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i2);
            if (touchSlopSwipeRefreshLayoutOnNavigationEvent != null && (tossWebViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, (i2 = R.id.webview))) != null) {
                return new GetTSAHashValue((ConstraintLayout) view, updatecertificate_noconfOnExtraCallback, touchSlopSwipeRefreshLayoutOnNavigationEvent, tossWebViewOnNavigationEvent);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
