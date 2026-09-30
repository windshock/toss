package im.toss.features.fds.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SirenBottomSheetActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SirenBottomSheetActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = SirenBottomSheetActivity.onExtraCallbackWithResult(this.f$0);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
