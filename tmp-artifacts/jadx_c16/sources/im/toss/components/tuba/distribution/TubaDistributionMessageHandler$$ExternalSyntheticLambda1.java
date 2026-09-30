package im.toss.components.tuba.distribution;

import kotlin.jvm.functions.Function1;
import o.UtilsKtExternalSyntheticLambda15;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TubaDistributionMessageHandler$$ExternalSyntheticLambda1 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda15.onExtraCallback(this.f$0, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
