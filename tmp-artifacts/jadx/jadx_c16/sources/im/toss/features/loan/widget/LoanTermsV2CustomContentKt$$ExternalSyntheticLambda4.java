package im.toss.features.loan.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getErrCode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda4 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda4(Function2 function2, Function2 function22, Function2 function23, int i) {
        this.f$0 = function2;
        this.f$1 = function22;
        this.f$2 = function23;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getErrCode.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = getErrCode.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
