package im.toss.ads_sdk.ui.activity;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda0 implements RenderInTransitionOverlayNodeElement {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.f$0;
        if (i3 == 0) {
            return NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, view, windowInsetsCompat);
        }
        NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, view, windowInsetsCompat);
        throw null;
    }
}
