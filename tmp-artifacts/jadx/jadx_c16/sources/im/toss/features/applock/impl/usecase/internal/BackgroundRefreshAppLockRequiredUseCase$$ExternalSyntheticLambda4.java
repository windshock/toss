package im.toss.features.applock.impl.usecase.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RemoteExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Boolean.valueOf(RemoteExtension.onNavigationEvent(this.f$0, (Unit) obj));
            obj2.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(RemoteExtension.onNavigationEvent(this.f$0, (Unit) obj));
        int i3 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }
}
