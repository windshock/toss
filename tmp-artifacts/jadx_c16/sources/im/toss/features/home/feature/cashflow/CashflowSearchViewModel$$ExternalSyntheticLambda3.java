package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DefaultLoggerProxyImpl;
import o.ParcelUtils;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSearchViewModel$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ParcelUtils.onWarmupCompleted f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ DefaultLoggerProxyImpl.IAuthTabCallback f$2;

    public /* synthetic */ CashflowSearchViewModel$$ExternalSyntheticLambda3(ParcelUtils.onWarmupCompleted onwarmupcompleted, String str, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        this.f$0 = onwarmupcompleted;
        this.f$1 = str;
        this.f$2 = iAuthTabCallback;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ParcelUtils.onWarmupCompleted onwarmupcompleted = this.f$0;
        if (i3 != 0) {
            return CashflowSearchViewModel.onNavigationEvent(onwarmupcompleted, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitOnNavigationEvent = CashflowSearchViewModel.onNavigationEvent(onwarmupcompleted, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 55 / 0;
        return unitOnNavigationEvent;
    }
}
