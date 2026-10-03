package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetTSAGenTime implements SearchBarKtExternalSyntheticLambda5 {
    public final FrameLayout onNavigationEvent;
    private final FrameLayout onWarmupCompleted;

    private GetTSAGenTime(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.onWarmupCompleted = frameLayout;
        this.onNavigationEvent = frameLayout2;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.onWarmupCompleted;
    }

    public static GetTSAGenTime onExtraCallbackWithResult(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new GetTSAGenTime(frameLayout, frameLayout);
    }
}
