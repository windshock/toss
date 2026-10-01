package im.toss.ads_sdk.ui.v2.activity;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda5 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            windowInsetsCompatIAuthTabCallback = NativeAdsShortVideoV2Activity.IAuthTabCallback(this.f$0, view, windowInsetsCompat);
            int i3 = 57 / 0;
        } else {
            windowInsetsCompatIAuthTabCallback = NativeAdsShortVideoV2Activity.IAuthTabCallback(this.f$0, view, windowInsetsCompat);
        }
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompatIAuthTabCallback;
    }
}
