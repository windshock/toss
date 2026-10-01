package im.toss.ads_sdk.playable;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda28 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ WebView f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda28(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, WebView webView) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = webView;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, this.f$1, (String) obj);
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
