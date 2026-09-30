package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.ShakeAnalyse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetSendInfoFromTextHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(ShakeAnalyse.onWarmupCompleted(str, str2));
        }
        Boolean boolValueOf = Boolean.valueOf(ShakeAnalyse.onWarmupCompleted(str, str2));
        int i3 = 64 / 0;
        return boolValueOf;
    }
}
