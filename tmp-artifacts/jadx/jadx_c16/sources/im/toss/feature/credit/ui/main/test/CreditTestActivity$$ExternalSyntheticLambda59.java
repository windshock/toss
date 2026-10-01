package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda59 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = this.f$0;
        Boolean bool = (Boolean) obj;
        if (i3 != 0) {
            return CreditTestActivity.onNavigationEvent(getsupportedhighspeedresolutionsfor, bool.booleanValue());
        }
        Unit unitOnNavigationEvent = CreditTestActivity.onNavigationEvent(getsupportedhighspeedresolutionsfor, bool.booleanValue());
        int i4 = 43 / 0;
        return unitOnNavigationEvent;
    }
}
