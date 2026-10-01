package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.readFully;
import o.setIso;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ readFully f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = AssetInvestmentHomeActivity.onWarmupCompleted(this.f$0, (setIso) obj);
            int i3 = 69 / 0;
        } else {
            unitOnWarmupCompleted = AssetInvestmentHomeActivity.onWarmupCompleted(this.f$0, (setIso) obj);
        }
        int i4 = onWarmupCompleted + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
