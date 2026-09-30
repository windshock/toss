package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.setValueZero;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankDecryptPayloadHandler$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(setValueZero.IAuthTabCallback((String) obj, (String) obj2));
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
