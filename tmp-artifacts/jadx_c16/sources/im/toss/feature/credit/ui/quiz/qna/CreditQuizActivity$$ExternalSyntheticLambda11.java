package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, (DialogInterface) obj};
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (DialogInterface) obj};
        Unit unit = (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -57938675, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr2, 57938677);
        int i3 = onWarmupCompleted + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
