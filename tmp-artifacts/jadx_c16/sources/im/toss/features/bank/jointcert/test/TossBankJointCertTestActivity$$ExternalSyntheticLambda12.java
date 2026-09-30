package im.toss.features.bank.jointcert.test;

import androidx.compose.foundation.layout.RowScope;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        RowScope rowScope = (RowScope) obj;
        if (i3 != 0) {
            return TossBankJointCertTestActivity.asInterface(tossBankJointCertTestActivity, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        TossBankJointCertTestActivity.asInterface(tossBankJointCertTestActivity, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
