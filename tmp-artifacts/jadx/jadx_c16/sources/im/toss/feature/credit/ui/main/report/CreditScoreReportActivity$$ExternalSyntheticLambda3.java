package im.toss.feature.credit.ui.main.report;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addPermRequstCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreReportActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditScoreReportActivity f$0;
    public final /* synthetic */ addPermRequstCallback f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CreditScoreReportActivity$$ExternalSyntheticLambda3(CreditScoreReportActivity creditScoreReportActivity, addPermRequstCallback addpermrequstcallback, String str, int i) {
        this.f$0 = creditScoreReportActivity;
        this.f$1 = addpermrequstcallback;
        this.f$2 = str;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CreditScoreReportActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = CreditScoreReportActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return unitOnNavigationEvent;
    }
}
