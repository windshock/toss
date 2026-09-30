package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditQuizActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
        int i4 = onExtraCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
