package im.toss.feature.credit.ui.quiz.qna;

import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizActivity creditQuizActivity = this.f$0;
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) obj;
        if (i3 == 0) {
            return CreditQuizActivity.onExtraCallback(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        CreditQuizActivity.onExtraCallback(creditQuizActivity, commonModule_setLeftEdgeTouchEnabled);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
