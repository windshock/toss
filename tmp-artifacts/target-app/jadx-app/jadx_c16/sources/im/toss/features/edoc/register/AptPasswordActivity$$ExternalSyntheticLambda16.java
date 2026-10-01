package im.toss.features.edoc.register;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda16 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            AptPasswordActivity.onWarmupCompleted(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        AptPasswordActivity.onWarmupCompleted(this.f$0, obj);
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
    }
}
