package im.toss.ads_sdk.ui.view;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsThumbnailVideoView.onExtraCallback(this.f$0, (MotionEvent) obj);
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
