package im.toss.features.applock.impl.usecase.internal;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import o.replay;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForegroundCheckShowAppLockSettingUseCase$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ replay f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        replay replayVar = this.f$0;
        FragmentActivity fragmentActivity = (FragmentActivity) obj;
        if (i3 == 0) {
            return Boolean.valueOf(replay.onExtraCallbackWithResult(replayVar, fragmentActivity));
        }
        Boolean boolValueOf = Boolean.valueOf(replay.onExtraCallbackWithResult(replayVar, fragmentActivity));
        int i4 = 30 / 0;
        return boolValueOf;
    }
}
