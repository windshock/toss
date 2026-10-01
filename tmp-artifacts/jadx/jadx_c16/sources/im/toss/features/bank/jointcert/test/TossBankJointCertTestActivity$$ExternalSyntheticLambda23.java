package im.toss.features.bank.jointcert.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda23 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        if (i3 != 0) {
            return TossBankJointCertTestActivity.onExtraCallback(tossBankJointCertTestActivity);
        }
        TossBankJointCertTestActivity.onExtraCallback(tossBankJointCertTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
