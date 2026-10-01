package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.analyseNoTriggerReason;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankDecryptPayloadWithRandomIvHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(analyseNoTriggerReason.onWarmupCompleted((String) obj, (String) obj2));
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return boolValueOf;
    }
}
