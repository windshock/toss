package im.toss.feature.credit.ui.quiz.qna;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CreditQuizActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
