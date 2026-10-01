package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.contextGetScreenOrientation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ contextGetScreenOrientation.onNavigationEvent f$0;
    public final /* synthetic */ CashflowSelectCategoryViewModel f$1;

    public /* synthetic */ CashflowSelectCategoryViewModel$$ExternalSyntheticLambda7(contextGetScreenOrientation.onNavigationEvent onnavigationevent, CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel) {
        this.f$0 = onnavigationevent;
        this.f$1 = cashflowSelectCategoryViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CashflowSelectCategoryViewModel.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
