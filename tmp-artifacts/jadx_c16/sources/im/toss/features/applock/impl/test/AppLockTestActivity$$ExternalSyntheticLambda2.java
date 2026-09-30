package im.toss.features.applock.impl.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AppLockTestActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            AppLockTestActivity.onExtraCallback(this.f$0, (Throwable) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = AppLockTestActivity.onExtraCallback(this.f$0, (Throwable) obj);
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
