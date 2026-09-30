package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.RVGroup;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BizPermissionManager f$1;

    public /* synthetic */ ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda5(Function1 function1, BizPermissionManager bizPermissionManager) {
        this.f$0 = function1;
        this.f$1 = bizPermissionManager;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = RVGroup.onNavigationEvent(this.f$0, this.f$1, ((Boolean) obj).booleanValue());
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
