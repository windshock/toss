package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.RVGroup;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BizPermissionManager bizPermissionManager = this.f$0;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 == 0) {
            return RVGroup.onExtraCallback(bizPermissionManager, useandconfigureprogramwithtexture);
        }
        Unit unitOnExtraCallback = RVGroup.onExtraCallback(bizPermissionManager, useandconfigureprogramwithtexture);
        int i4 = 34 / 0;
        return unitOnExtraCallback;
    }
}
