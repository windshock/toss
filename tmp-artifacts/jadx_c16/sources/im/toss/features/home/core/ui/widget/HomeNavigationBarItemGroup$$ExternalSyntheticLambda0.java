package im.toss.features.home.core.ui.widget;

import kotlin.jvm.functions.Function0;
import o.AppLogger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeNavigationBarItemGroup$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeNavigationBarItemGroup f$0;
    public final /* synthetic */ AppLogger f$1;

    public /* synthetic */ HomeNavigationBarItemGroup$$ExternalSyntheticLambda0(HomeNavigationBarItemGroup homeNavigationBarItemGroup, AppLogger appLogger) {
        this.f$0 = homeNavigationBarItemGroup;
        this.f$1 = appLogger;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(HomeNavigationBarItemGroup.onExtraCallback(this.f$0, this.f$1));
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
