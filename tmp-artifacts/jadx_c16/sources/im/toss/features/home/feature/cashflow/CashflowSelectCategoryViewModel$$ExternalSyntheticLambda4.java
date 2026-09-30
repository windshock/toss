package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.ProcessUtils;
import o.contextGetScreenOrientation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CashflowSelectCategoryViewModel f$0;
    public final /* synthetic */ ProcessUtils.IAuthTabCallback f$1;
    public final /* synthetic */ contextGetScreenOrientation.onNavigationEvent f$2;

    public /* synthetic */ CashflowSelectCategoryViewModel$$ExternalSyntheticLambda4(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, ProcessUtils.IAuthTabCallback iAuthTabCallback, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        this.f$0 = cashflowSelectCategoryViewModel;
        this.f$1 = iAuthTabCallback;
        this.f$2 = onnavigationevent;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CashflowSelectCategoryViewModel.onWarmupCompleted(this.f$0, this.f$1, this.f$2);
            throw null;
        }
        Unit unitOnWarmupCompleted = CashflowSelectCategoryViewModel.onWarmupCompleted(this.f$0, this.f$1, this.f$2);
        int i3 = onExtraCallback + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
