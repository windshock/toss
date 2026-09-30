package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.contextGetScreenOrientation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ contextGetScreenOrientation.onNavigationEvent f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CashflowSelectCategoryViewModel.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
