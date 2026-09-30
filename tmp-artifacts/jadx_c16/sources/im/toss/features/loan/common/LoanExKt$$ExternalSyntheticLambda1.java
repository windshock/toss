package im.toss.features.loan.common;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getLongOctalBytes;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanExKt$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ View f$0;

    public final Object invoke() {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = getLongOctalBytes.onNavigationEvent(this.f$0);
            int i3 = 84 / 0;
        } else {
            unitOnNavigationEvent = getLongOctalBytes.onNavigationEvent(this.f$0);
        }
        int i4 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
