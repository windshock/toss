package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda24 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = NativeAdsPlayableAdActivity.getInterfaceDescriptor(this.f$0);
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
