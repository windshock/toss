package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = CreditQuizActivity.asInterface(this.f$0, (DialogInterface) obj);
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return unitAsInterface;
    }
}
