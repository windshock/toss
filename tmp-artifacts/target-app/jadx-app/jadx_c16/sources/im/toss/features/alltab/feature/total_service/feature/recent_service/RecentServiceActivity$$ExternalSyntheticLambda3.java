package im.toss.features.alltab.feature.total_service.feature.recent_service;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RecentServiceActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ RecentServiceActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RecentServiceActivity recentServiceActivity = this.f$0;
        if (i3 == 0) {
            return RecentServiceActivity.IAuthTabCallbackDefault(recentServiceActivity);
        }
        RecentServiceActivity.IAuthTabCallbackDefault(recentServiceActivity);
        throw null;
    }
}
