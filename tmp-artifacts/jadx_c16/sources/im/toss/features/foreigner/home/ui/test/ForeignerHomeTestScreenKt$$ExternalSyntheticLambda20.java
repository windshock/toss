package im.toss.features.foreigner.home.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.bindEngineRouter;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda20 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = setCallUrl.onNavigationEvent((bindEngineRouter) obj);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
