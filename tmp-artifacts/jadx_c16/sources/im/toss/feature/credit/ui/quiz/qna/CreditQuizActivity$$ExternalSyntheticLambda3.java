package im.toss.feature.credit.ui.quiz.qna;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj};
        Unit unit = (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 956472737, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, -956472734);
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
