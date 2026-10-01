package im.toss.features.benefit.ui;

import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda32 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        String str = (String) obj;
        if (i3 == 0) {
            return getNameByOperatorName.IAuthTabCallback(getnamebyoperatorname, str);
        }
        getNameByOperatorName.IAuthTabCallback(getnamebyoperatorname, str);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
