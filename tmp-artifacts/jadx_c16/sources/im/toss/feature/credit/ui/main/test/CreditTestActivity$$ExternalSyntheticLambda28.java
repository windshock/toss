package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda28 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = CreditTestActivity.ICustomTabsCallbackStub(this.f$0);
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
