package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ParcelUtils;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSearchViewModel$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CashflowSearchViewModel f$0;
    public final /* synthetic */ ParcelUtils.onWarmupCompleted f$1;

    public /* synthetic */ CashflowSearchViewModel$$ExternalSyntheticLambda4(CashflowSearchViewModel cashflowSearchViewModel, ParcelUtils.onWarmupCompleted onwarmupcompleted) {
        this.f$0 = cashflowSearchViewModel;
        this.f$1 = onwarmupcompleted;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CashflowSearchViewModel.IAuthTabCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
