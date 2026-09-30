package im.toss.ads_sdk.ui.v2.view;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = NativeAdsThumbnailVideoV2View.asInterface(this.f$0, (MotionEvent) obj);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }
}
