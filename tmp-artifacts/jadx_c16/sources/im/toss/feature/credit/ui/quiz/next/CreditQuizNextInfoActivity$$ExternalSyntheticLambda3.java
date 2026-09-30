package im.toss.feature.credit.ui.quiz.next;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizNextInfoActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditQuizNextInfoActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CreditQuizNextInfoActivity$$ExternalSyntheticLambda3(CreditQuizNextInfoActivity creditQuizNextInfoActivity, String str, String str2) {
        this.f$0 = creditQuizNextInfoActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CreditQuizNextInfoActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
