package im.toss.base;

import kotlin.jvm.functions.Function1;
import o.deserializeLongCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda23 implements deserializeLongCollection {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = BaseActivity.IAuthTabCallback(this.f$0, obj);
        int i4 = onWarmupCompleted + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }
}
