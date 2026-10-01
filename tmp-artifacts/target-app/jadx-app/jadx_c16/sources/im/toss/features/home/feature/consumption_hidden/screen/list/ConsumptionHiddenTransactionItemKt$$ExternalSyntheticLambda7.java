package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.RVGroup;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda7 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = RVGroup.onWarmupCompleted(this.f$0, (useAndConfigureProgramWithTexture) obj);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
