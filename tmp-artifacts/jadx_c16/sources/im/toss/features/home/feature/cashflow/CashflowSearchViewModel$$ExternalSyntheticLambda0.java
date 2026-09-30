package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSearchViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CashflowSearchViewModel.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = CashflowSearchViewModel.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
