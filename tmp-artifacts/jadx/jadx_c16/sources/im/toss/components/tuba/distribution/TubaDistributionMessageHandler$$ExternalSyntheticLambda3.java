package im.toss.components.tuba.distribution;

import kotlin.jvm.functions.Function1;
import o.UtilsKtExternalSyntheticLambda15;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TubaDistributionMessageHandler$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda15.onNavigationEvent(this.f$0, obj);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
