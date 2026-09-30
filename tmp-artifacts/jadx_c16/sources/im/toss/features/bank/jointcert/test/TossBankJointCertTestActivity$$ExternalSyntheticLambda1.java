package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = TossBankJointCertTestActivity.asBinder(this.f$0);
        int i4 = onExtraCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }
}
