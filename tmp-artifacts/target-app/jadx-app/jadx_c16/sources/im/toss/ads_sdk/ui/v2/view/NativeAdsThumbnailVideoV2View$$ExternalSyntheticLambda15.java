package im.toss.ads_sdk.ui.v2.view;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda15 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.f$0;
        if (i3 == 0) {
            return NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View);
        }
        NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View);
        throw null;
    }
}
