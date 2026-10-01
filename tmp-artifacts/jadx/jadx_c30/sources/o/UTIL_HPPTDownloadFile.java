package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UTIL_HPPTDownloadFile implements SearchBarKtExternalSyntheticLambda5 {
    private final ConstraintLayout IAuthTabCallback;
    public final ComposeView onWarmupCompleted;

    private UTIL_HPPTDownloadFile(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView) {
        this.IAuthTabCallback = constraintLayout;
        this.onWarmupCompleted = composeView;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.IAuthTabCallback;
    }

    public static UTIL_HPPTDownloadFile onExtraCallback(@NonNull View view) {
        int i = R.id.compose_view;
        ComposeView composeViewOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (composeViewOnNavigationEvent != null) {
            return new UTIL_HPPTDownloadFile((ConstraintLayout) view, composeViewOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
