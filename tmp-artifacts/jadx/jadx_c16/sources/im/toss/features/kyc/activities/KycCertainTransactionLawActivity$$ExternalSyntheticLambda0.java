package im.toss.features.kyc.activities;

import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycCertainTransactionLawActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ KycCertainTransactionLawActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) KycCertainTransactionLawActivity.IAuthTabCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1355080743, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -1355080741, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
