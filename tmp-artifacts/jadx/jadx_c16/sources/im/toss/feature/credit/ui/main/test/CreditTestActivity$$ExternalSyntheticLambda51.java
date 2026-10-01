package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda51 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        Unit unitOnTransact;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnTransact = CreditTestActivity.onTransact(this.f$0);
            int i3 = 16 / 0;
        } else {
            unitOnTransact = CreditTestActivity.onTransact(this.f$0);
        }
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }
}
