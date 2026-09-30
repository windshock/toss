package im.toss.ads_sdk.ui.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;

    public final Object invoke() {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = NativeAdsThumbnailVideoView.onWarmupCompleted(this.f$0);
            int i3 = 27 / 0;
        } else {
            unitOnWarmupCompleted = NativeAdsThumbnailVideoView.onWarmupCompleted(this.f$0);
        }
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
