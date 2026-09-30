package im.toss.feature.credit.ui.quiz.qna;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizActivity creditQuizActivity = this.f$0;
        if (i3 != 0) {
            return CreditQuizActivity.onWarmupCompleted(creditQuizActivity);
        }
        CreditQuizActivity.onWarmupCompleted(creditQuizActivity);
        throw null;
    }
}
