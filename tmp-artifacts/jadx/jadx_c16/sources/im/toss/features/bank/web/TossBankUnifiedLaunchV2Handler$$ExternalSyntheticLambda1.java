package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.formatFileSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankUnifiedLaunchV2Handler$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj, Object obj2) {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(formatFileSize.IAuthTabCallback(str, str2));
            int i3 = 35 / 0;
        } else {
            boolValueOf = Boolean.valueOf(formatFileSize.IAuthTabCallback(str, str2));
        }
        int i4 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
