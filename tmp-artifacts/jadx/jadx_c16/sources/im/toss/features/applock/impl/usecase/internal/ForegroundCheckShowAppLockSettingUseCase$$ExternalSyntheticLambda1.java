package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.deserializeLongCollection;
import o.replay;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForegroundCheckShowAppLockSettingUseCase$$ExternalSyntheticLambda1 implements deserializeLongCollection {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = replay.onExtraCallbackWithResult(this.f$0, obj);
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }
}
