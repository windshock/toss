package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.setGyrState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SetTossBankDepositMemoHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(setGyrState.onExtraCallbackWithResult((String) obj, (String) obj2));
        int i4 = onExtraCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
