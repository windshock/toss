package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda17 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditTestActivity.asInterface(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = CreditTestActivity.asInterface(this.f$0);
        int i3 = onNavigationEvent + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }
}
