package im.toss.base;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda22 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = BaseActivity.IAuthTabCallback((Boolean) obj);
        if (i3 == 0) {
            Boolean.valueOf(zIAuthTabCallback);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zIAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
