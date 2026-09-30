package im.toss.features.home.presentation.consumption_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeConsumptionHomeActivity.onExtraCallback(((Integer) obj).intValue());
        int i4 = IAuthTabCallback + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
