package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.contextGetScreenOrientation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ contextGetScreenOrientation.onNavigationEvent f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ CashflowSelectCategoryViewModel$$ExternalSyntheticLambda3(contextGetScreenOrientation.onNavigationEvent onnavigationevent, boolean z) {
        this.f$0 = onnavigationevent;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CashflowSelectCategoryViewModel.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
