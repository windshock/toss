package im.toss.features.fds.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SirenBottomSheetActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SirenBottomSheetActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            SirenBottomSheetActivity.IAuthTabCallback(this.f$0);
            throw null;
        }
        Unit unitIAuthTabCallback = SirenBottomSheetActivity.IAuthTabCallback(this.f$0);
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
