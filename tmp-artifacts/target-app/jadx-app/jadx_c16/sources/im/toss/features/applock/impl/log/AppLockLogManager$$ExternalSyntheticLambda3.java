package im.toss.features.applock.impl.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Constant;
import o.SetDetectableSize;
import o.isNotificationsEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockLogManager$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Constant f$0;
    public final /* synthetic */ isNotificationsEnabled f$1;

    public /* synthetic */ AppLockLogManager$$ExternalSyntheticLambda3(Constant constant, isNotificationsEnabled isnotificationsenabled) {
        this.f$0 = constant;
        this.f$1 = isnotificationsenabled;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = Constant.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
