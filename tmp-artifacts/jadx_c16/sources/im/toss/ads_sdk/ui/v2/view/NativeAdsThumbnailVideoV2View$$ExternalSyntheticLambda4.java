package im.toss.ads_sdk.ui.v2.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsThumbnailVideoV2View.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
