package im.toss.features.edoc.univ;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivLoadingActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ UnivLoadingActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = UnivLoadingActivity.onExtraCallbackWithResult(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            int i3 = 22 / 0;
        } else {
            unitOnExtraCallbackWithResult = UnivLoadingActivity.onExtraCallbackWithResult(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        }
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
