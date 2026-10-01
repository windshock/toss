package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = CreditQuizActivity.onExtraCallback(this.f$0, (DialogInterface) obj);
            int i3 = 18 / 0;
        } else {
            unitOnExtraCallback = CreditQuizActivity.onExtraCallback(this.f$0, (DialogInterface) obj);
        }
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
