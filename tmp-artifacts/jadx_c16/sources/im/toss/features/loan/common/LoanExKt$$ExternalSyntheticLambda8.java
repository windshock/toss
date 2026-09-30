package im.toss.features.loan.common;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getLongOctalBytes;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanExKt$$ExternalSyntheticLambda8 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ View f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = getLongOctalBytes.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
