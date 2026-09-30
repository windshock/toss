package im.toss.features.alltab.feature.total_service.feature.recent_service;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RecentServiceActivity$$ExternalSyntheticLambda16 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ RecentServiceActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = RecentServiceActivity.onExtraCallback(this.f$0);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
