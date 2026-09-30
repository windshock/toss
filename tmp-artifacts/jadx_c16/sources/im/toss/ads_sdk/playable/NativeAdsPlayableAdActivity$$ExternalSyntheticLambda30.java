package im.toss.ads_sdk.playable;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda30 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return NativeAdsPlayableAdActivity.onWarmupCompleted(view, windowInsetsCompat);
        }
        NativeAdsPlayableAdActivity.onWarmupCompleted(view, windowInsetsCompat);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
