package im.toss.features.benefit.ui;

import kotlin.jvm.functions.Function2;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda27 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(getNameByOperatorName.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue(), (String) obj2));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(getNameByOperatorName.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue(), (String) obj2));
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
        return boolValueOf;
    }
}
