package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.AOMPDeviceUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossIncomeGetDeviceSessionTokenHandler$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(AOMPDeviceUtils.onWarmupCompleted((String) obj, (String) obj2));
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return boolValueOf;
    }
}
