package im.toss.feature.credit.ui.main.report;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addPermRequstCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreReportActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ addPermRequstCallback f$0;
    public final /* synthetic */ CreditScoreReportActivity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CreditScoreReportActivity$$ExternalSyntheticLambda2(addPermRequstCallback addpermrequstcallback, CreditScoreReportActivity creditScoreReportActivity, String str) {
        this.f$0 = addpermrequstcallback;
        this.f$1 = creditScoreReportActivity;
        this.f$2 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            CreditScoreReportActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = CreditScoreReportActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj3.hashCode();
        throw null;
    }
}
