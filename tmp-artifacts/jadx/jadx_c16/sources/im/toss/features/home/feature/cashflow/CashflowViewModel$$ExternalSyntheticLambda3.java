package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DefaultLoggerProxyImpl;
import o.RVLogger;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CashflowViewModel f$0;
    public final /* synthetic */ DefaultLoggerProxyImpl.onExtraCallbackWithResult f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ RVLogger.onWarmupCompleted f$3;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda3(CashflowViewModel cashflowViewModel, DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i, RVLogger.onWarmupCompleted onwarmupcompleted) {
        this.f$0 = cashflowViewModel;
        this.f$1 = onextracallbackwithresult;
        this.f$2 = i;
        this.f$3 = onwarmupcompleted;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CashflowViewModel.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = CashflowViewModel.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
