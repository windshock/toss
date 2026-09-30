package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda28 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getNameByOperatorName.onExtraCallbackWithResult(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(this.f$0);
        int i3 = onNavigationEvent + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
