package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.deserializeLongCollection;
import o.replay;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForegroundCheckShowAppLockSettingUseCase$$ExternalSyntheticLambda3 implements deserializeLongCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = replay.onNavigationEvent(this.f$0, obj);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }
}
