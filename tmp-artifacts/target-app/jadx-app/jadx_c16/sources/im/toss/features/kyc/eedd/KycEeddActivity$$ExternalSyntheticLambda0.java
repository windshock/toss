package im.toss.features.kyc.eedd;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.jvm.functions.Function0;
import o.isHighSpeedSupported;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ KycEeddActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        isHighSpeedSupported ishighspeedsupported = (isHighSpeedSupported) KycEeddActivity.IAuthTabCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1662200327, 1662200330, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return ishighspeedsupported;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
