package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.getAppAuthorizeSetting;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda18 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback(this.f$0, (AppNode) obj, (getAppAuthorizeSetting) obj2);
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unitOnExtraCallback;
    }
}
