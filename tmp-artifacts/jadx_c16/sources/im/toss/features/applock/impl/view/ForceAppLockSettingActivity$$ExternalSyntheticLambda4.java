package im.toss.features.applock.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForceAppLockSettingActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ForceAppLockSettingActivity f$0;

    public final Object invoke() {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = ForceAppLockSettingActivity.onExtraCallback(this.f$0);
            int i3 = 17 / 0;
        } else {
            unitOnExtraCallback = ForceAppLockSettingActivity.onExtraCallback(this.f$0);
        }
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
