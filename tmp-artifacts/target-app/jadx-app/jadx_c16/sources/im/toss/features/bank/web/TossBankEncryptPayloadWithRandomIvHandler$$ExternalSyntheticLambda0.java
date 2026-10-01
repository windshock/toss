package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.ShakeHelper1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankEncryptPayloadWithRandomIvHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(ShakeHelper1.onWarmupCompleted((String) obj, (String) obj2));
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
