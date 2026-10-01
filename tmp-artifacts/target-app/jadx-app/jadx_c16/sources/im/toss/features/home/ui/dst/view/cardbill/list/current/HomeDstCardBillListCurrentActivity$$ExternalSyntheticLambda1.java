package im.toss.features.home.ui.dst.view.cardbill.list.current;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardBillListCurrentActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeDstCardBillListCurrentActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstCardBillListCurrentActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
