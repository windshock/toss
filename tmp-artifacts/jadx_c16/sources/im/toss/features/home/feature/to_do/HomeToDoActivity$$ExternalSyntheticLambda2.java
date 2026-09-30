package im.toss.features.home.feature.to_do;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeToDoActivity$$ExternalSyntheticLambda2 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = HomeToDoActivity.onWarmupCompleted(view, windowInsetsCompat);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatOnWarmupCompleted;
    }
}
