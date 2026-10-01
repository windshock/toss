package im.toss.features.foreigner.home.ui.test;

import kotlin.jvm.functions.Function1;
import o.bindEngineRouter;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda19 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        bindEngineRouter bindenginerouter = (bindEngineRouter) obj;
        if (i2 % 2 != 0) {
            return setCallUrl.onWarmupCompleted(bindenginerouter);
        }
        setCallUrl.onWarmupCompleted(bindenginerouter);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
