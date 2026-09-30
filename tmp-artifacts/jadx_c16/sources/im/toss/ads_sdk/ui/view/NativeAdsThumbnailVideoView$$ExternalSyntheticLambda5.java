package im.toss.ads_sdk.ui.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsThumbnailVideoView.onExtraCallback();
            throw null;
        }
        Unit unitOnExtraCallback = NativeAdsThumbnailVideoView.onExtraCallback();
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
