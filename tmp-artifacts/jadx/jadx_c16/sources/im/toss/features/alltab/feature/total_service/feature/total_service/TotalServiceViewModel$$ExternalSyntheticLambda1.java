package im.toss.features.alltab.feature.total_service.feature.total_service;

import kotlin.jvm.functions.Function1;
import o.NavigationBarCapsuleTheme;
import o.TabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NavigationBarCapsuleTheme.onWarmupCompleted.onNavigationEvent f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TabBarModel tabBarModelOnExtraCallbackWithResult = TotalServiceViewModel.onExtraCallbackWithResult(this.f$0, (TabBarModel) obj);
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return tabBarModelOnExtraCallbackWithResult;
        }
        throw null;
    }
}
