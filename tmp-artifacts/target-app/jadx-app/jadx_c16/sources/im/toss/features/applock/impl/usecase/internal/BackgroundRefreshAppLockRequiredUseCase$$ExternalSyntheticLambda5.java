package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.RemoteExtension;
import o.deserializeLongCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda5 implements deserializeLongCollection {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = RemoteExtension.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }
}
