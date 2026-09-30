package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (DialogInterface) obj};
        Unit unit = (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 41494280, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, -41494274);
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
