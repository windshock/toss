package im.toss.ads_sdk.ui.v2.view;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.f$0;
        MotionEvent motionEvent = (MotionEvent) obj;
        if (i3 != 0) {
            return NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View, motionEvent);
        }
        NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(nativeAdsThumbnailVideoV2View, motionEvent);
        throw null;
    }
}
