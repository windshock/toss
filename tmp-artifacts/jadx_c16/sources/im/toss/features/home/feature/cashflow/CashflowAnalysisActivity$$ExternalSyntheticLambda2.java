package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAnalysisActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CashflowAnalysisActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CashflowAnalysisActivity.onNavigationEvent(this.f$0, (String) obj);
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
