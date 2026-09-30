package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.GlobalInfoRecorderUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda63 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ GlobalInfoRecorderUtils f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0);
        int i4 = IAuthTabCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
