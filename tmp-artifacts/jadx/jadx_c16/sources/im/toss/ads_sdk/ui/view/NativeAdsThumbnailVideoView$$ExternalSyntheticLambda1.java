package im.toss.ads_sdk.ui.view;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = this.f$0;
        if (i3 != 0) {
            return NativeAdsThumbnailVideoView.IAuthTabCallback(nativeAdsThumbnailVideoView);
        }
        NativeAdsThumbnailVideoView.IAuthTabCallback(nativeAdsThumbnailVideoView);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
