package im.toss.feature.credit.ui.quiz.qna;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CreditQuizActivity.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = CreditQuizActivity.IAuthTabCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
