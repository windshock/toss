package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda41 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = CreditTestActivity.access000(this.f$0);
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess000;
        }
        throw null;
    }
}
