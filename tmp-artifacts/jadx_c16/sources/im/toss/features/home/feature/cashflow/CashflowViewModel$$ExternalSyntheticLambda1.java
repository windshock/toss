package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVLogger;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ RVLogger.onWarmupCompleted f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda1(RVLogger.onWarmupCompleted onwarmupcompleted, String str) {
        this.f$0 = onwarmupcompleted;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            CashflowViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CashflowViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
