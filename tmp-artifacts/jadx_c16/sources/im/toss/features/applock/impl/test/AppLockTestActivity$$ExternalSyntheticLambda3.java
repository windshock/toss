package im.toss.features.applock.impl.test;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLockTestActivity.asBinder(this.f$0, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
