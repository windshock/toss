package im.toss.features.applock.impl.usecase.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVServerMsgHandler;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundUpdateAppProfileUseCase$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RVServerMsgHandler f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = RVServerMsgHandler.onWarmupCompleted(this.f$0, (Unit) obj);
        if (i3 == 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        Boolean.valueOf(zOnWarmupCompleted);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
