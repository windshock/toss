package im.toss.features.home.feature.consumption_hidden.screen.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.RVGroup;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BizPermissionManager f$1;

    public /* synthetic */ ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda3(Function1 function1, BizPermissionManager bizPermissionManager) {
        this.f$0 = function1;
        this.f$1 = bizPermissionManager;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = RVGroup.IAuthTabCallback(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
