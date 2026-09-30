package im.toss.features.applock.impl.usecase.internal;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import o.replay;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForegroundCheckShowAppLockSettingUseCase$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ replay f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(replay.IAuthTabCallback(this.f$0, (FragmentActivity) obj));
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
