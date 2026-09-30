package im.toss.base;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 != 0) {
            return BaseActivity.IAuthTabCallback(th);
        }
        BaseActivity.IAuthTabCallback(th);
        throw null;
    }
}
