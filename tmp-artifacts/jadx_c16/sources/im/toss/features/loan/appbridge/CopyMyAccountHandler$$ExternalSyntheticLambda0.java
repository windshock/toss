package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.inBlackList;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CopyMyAccountHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(inBlackList.onWarmupCompleted((String) obj, (String) obj2));
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
