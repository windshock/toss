package im.toss.ads_sdk.ui.view;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda0 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailAdMobView f$0;
    public final /* synthetic */ NativeAd f$1;

    public /* synthetic */ NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda0(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, NativeAd nativeAd) {
        this.f$0 = nativeAdsThumbnailAdMobView;
        this.f$1 = nativeAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsThumbnailAdMobView.onExtraCallbackWithResult(this.f$0, this.f$1);
            throw null;
        }
        NativeAdsThumbnailAdMobView.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
