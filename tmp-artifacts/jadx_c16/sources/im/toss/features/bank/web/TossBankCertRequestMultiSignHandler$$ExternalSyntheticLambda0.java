package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.setSubType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertRequestMultiSignHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 == 0) {
            boolValueOf = Boolean.valueOf(setSubType.onExtraCallbackWithResult(str, str2));
            int i3 = 94 / 0;
        } else {
            boolValueOf = Boolean.valueOf(setSubType.onExtraCallbackWithResult(str, str2));
        }
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
