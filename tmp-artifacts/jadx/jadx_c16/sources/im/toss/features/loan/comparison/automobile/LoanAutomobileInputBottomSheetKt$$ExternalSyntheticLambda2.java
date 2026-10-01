package im.toss.features.loan.comparison.automobile;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.skipPad;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAutomobileInputBottomSheetKt$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            skipPad.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = skipPad.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
