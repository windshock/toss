package im.toss.ads_sdk.ui.v2.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = NativeAdsThumbnailVideoV2View.asBinder(this.f$0);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }
}
