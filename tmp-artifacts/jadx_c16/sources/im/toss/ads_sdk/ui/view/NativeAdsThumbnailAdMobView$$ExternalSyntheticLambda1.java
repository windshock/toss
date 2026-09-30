package im.toss.ads_sdk.ui.view;

import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAd f$0;
    public final /* synthetic */ NativeAdsThumbnailAdMobView f$1;

    public /* synthetic */ NativeAdsThumbnailAdMobView$$ExternalSyntheticLambda1(NativeAd nativeAd, NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView) {
        this.f$0 = nativeAd;
        this.f$1 = nativeAdsThumbnailAdMobView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsThumbnailAdMobView.onExtraCallback(this.f$0, this.f$1, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NativeAdsThumbnailAdMobView.onExtraCallback(this.f$0, this.f$1, view);
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
