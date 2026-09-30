package im.toss.features.bank.jointcert.messagehandler;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils7;
import o.access2202;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertFetchHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = access2202.IAuthTabCallback((TypeUtils7) obj);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return unitIAuthTabCallback;
    }
}
