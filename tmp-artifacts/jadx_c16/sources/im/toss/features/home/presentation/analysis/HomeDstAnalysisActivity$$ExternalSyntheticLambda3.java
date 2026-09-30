package im.toss.features.home.presentation.analysis;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeDstAnalysisActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = HomeDstAnalysisActivity.onWarmupCompleted(this.f$0, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            int i3 = 54 / 0;
        } else {
            unitOnWarmupCompleted = HomeDstAnalysisActivity.onWarmupCompleted(this.f$0, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
        int i4 = onNavigationEvent + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
