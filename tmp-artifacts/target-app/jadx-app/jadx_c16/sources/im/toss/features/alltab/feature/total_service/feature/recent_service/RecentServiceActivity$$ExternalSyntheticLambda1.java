package im.toss.features.alltab.feature.total_service.feature.recent_service;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RecentServiceActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RecentServiceActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            RecentServiceActivity.asBinder(this.f$0);
            throw null;
        }
        Unit unitAsBinder = RecentServiceActivity.asBinder(this.f$0);
        int i3 = onWarmupCompleted + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return unitAsBinder;
    }
}
