package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVLogger;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CashflowViewModel f$0;
    public final /* synthetic */ RVLogger.onWarmupCompleted f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda4(CashflowViewModel cashflowViewModel, RVLogger.onWarmupCompleted onwarmupcompleted, String str) {
        this.f$0 = cashflowViewModel;
        this.f$1 = onwarmupcompleted;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CashflowViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CashflowViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
