package im.toss.features.applock.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppLockTestActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            AppLockTestActivity.onExtraCallback(this.f$0, (TypeUtils2) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = AppLockTestActivity.onExtraCallback(this.f$0, (TypeUtils2) obj);
        int i3 = onNavigationEvent + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
