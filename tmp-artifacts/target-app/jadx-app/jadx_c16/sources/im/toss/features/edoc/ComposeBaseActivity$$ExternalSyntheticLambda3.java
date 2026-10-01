package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBaseActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ ComposeBaseActivity f$0;

    public final Object invoke() {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = ComposeBaseActivity.onWarmupCompleted(this.f$0);
            int i3 = 74 / 0;
        } else {
            unitOnWarmupCompleted = ComposeBaseActivity.onWarmupCompleted(this.f$0);
        }
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
