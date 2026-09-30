package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.access408;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankGetDeviceSessionTokenHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 == 0) {
            Boolean.valueOf(access408.onNavigationEvent(str, str2));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(access408.onNavigationEvent(str, str2));
        int i3 = onWarmupCompleted + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return boolValueOf;
    }
}
