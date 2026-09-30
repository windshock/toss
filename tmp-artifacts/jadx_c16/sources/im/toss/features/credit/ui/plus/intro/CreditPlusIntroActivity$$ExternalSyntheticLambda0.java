package im.toss.features.credit.ui.plus.intro;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusIntroActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CreditPlusIntroActivity.onExtraCallbackWithResult(this.f$0);
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
