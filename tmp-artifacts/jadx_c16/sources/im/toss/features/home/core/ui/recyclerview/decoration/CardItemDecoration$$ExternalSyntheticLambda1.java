package im.toss.features.home.core.ui.recyclerview.decoration;

import kotlin.jvm.functions.Function0;
import o.CustomLog;
import o.DefaultAppLoggerImpl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardItemDecoration$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DefaultAppLoggerImpl f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CustomLog customLogOnWarmupCompleted = DefaultAppLoggerImpl.onWarmupCompleted(this.f$0);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return customLogOnWarmupCompleted;
    }
}
