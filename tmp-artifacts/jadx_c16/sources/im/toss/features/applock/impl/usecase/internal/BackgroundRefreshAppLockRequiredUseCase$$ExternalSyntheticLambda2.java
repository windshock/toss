package im.toss.features.applock.impl.usecase.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ RemoteExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteExtension remoteExtension = this.f$0;
        Unit unit = (Unit) obj;
        if (i3 != 0) {
            return Boolean.valueOf(RemoteExtension.IAuthTabCallback(remoteExtension, unit));
        }
        Boolean.valueOf(RemoteExtension.IAuthTabCallback(remoteExtension, unit));
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
