package im.toss.features.main.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MainActivity f$0;

    public final Object invoke() {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = MainActivity.onWarmupCompleted(this.f$0);
            int i3 = 69 / 0;
        } else {
            unitOnWarmupCompleted = MainActivity.onWarmupCompleted(this.f$0);
        }
        int i4 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
