package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda24 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = CreditTestActivity.ICustomTabsCallback(this.f$0);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
