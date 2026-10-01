package im.toss.features.loan.widget;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getErrCode;
import o.getHumanReadableName;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda13 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getHumanReadableName f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda13(getHumanReadableName gethumanreadablename, String str) {
        this.f$0 = gethumanreadablename;
        this.f$1 = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getErrCode.onExtraCallbackWithResult(this.f$0, this.f$1, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
