package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ EDocAuthActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EDocAuthActivity eDocAuthActivity = this.f$0;
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) obj;
        if (i3 != 0) {
            return EDocAuthActivity.onWarmupCompleted(eDocAuthActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        Unit unitOnWarmupCompleted = EDocAuthActivity.onWarmupCompleted(eDocAuthActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = 79 / 0;
        return unitOnWarmupCompleted;
    }
}
