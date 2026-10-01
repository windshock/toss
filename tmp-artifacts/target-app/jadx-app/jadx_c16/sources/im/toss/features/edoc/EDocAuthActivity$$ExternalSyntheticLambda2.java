package im.toss.features.edoc;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function0 function0 = this.f$0;
        if (i3 != 0) {
            return EDocAuthActivity.onExtraCallback(function0);
        }
        EDocAuthActivity.onExtraCallback(function0);
        throw null;
    }
}
