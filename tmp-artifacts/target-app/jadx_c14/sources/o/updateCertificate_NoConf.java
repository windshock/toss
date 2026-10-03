package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pnikosis.materialishprogress.ProgressWheel;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class updateCertificate_NoConf implements SearchBarKtExternalSyntheticLambda5 {
    public final ProgressWheel onExtraCallback;
    public final FrameLayout onNavigationEvent;
    private final FrameLayout onWarmupCompleted;

    private updateCertificate_NoConf(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ProgressWheel progressWheel) {
        this.onWarmupCompleted = frameLayout;
        this.onNavigationEvent = frameLayout2;
        this.onExtraCallback = progressWheel;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static updateCertificate_NoConf onExtraCallback(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.progress_wheel;
        ProgressWheel progressWheelOnNavigationEvent = SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (progressWheelOnNavigationEvent != null) {
            return new updateCertificate_NoConf(frameLayout, frameLayout, progressWheelOnNavigationEvent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
