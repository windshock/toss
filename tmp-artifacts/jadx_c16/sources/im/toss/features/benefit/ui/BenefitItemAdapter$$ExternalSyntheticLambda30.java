package im.toss.features.benefit.ui;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda30 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        Context context = (Context) obj;
        String str = (String) obj2;
        if (i3 != 0) {
            return getNameByOperatorName.IAuthTabCallback(getnamebyoperatorname, context, str);
        }
        getNameByOperatorName.IAuthTabCallback(getnamebyoperatorname, context, str);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
