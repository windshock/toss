package im.toss.features.loan.widget;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getErrCode;
import o.getHumanReadableName;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getHumanReadableName f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda12(getHumanReadableName gethumanreadablename, String str) {
        this.f$0 = gethumanreadablename;
        this.f$1 = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getErrCode.onNavigationEvent(this.f$0, this.f$1, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unitOnNavigationEvent;
    }
}
