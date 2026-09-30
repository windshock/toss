package im.toss.features.bank.session.impl;

import kotlin.jvm.functions.Function2;
import o.access102;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankUserTokenHandler$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(access102.onNavigationEvent((String) obj, (String) obj2));
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return boolValueOf;
    }
}
