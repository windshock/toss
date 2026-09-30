package im.toss.features.kyc.eedd;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycEeddActivity f$0;

    public final Object invoke() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            unit = (Unit) KycEeddActivity.IAuthTabCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, -1403880809, 1403880811, objArr, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            int i3 = 85 / 0;
        } else {
            Object[] objArr2 = {this.f$0};
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            unit = (Unit) KycEeddActivity.IAuthTabCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2, -1403880809, 1403880811, objArr2, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        }
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
