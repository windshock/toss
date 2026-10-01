package im.toss.features.home.feature.cashflow;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.DefaultLoggerProxyImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSearchActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CashflowSearchActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) CashflowSearchActivity.IAuthTabCallback(ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this.f$0, (String) obj, (DefaultLoggerProxyImpl.IAuthTabCallback) obj2}, -1359953974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1359953975, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i3 = onWarmupCompleted + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
