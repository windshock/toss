package im.toss.ads_sdk.ui.view;

import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda15 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;
    public final /* synthetic */ NativeAd f$1;

    public /* synthetic */ NativeAdsThumbnailVideoView$$ExternalSyntheticLambda15(NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView, NativeAd nativeAd) {
        this.f$0 = nativeAdsThumbnailVideoView;
        this.f$1 = nativeAd;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsThumbnailVideoView.onWarmupCompleted(this.f$0, this.f$1, (NativeAd) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = NativeAdsThumbnailVideoView.onWarmupCompleted(this.f$0, this.f$1, (NativeAd) obj);
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
