package im.toss.feature.credit.ui.quiz.qna;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizActivity creditQuizActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            return (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -2135578509, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, setDetectableSize}, 2135578509);
        }
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), -2135578509, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, setDetectableSize}, 2135578509);
        int i4 = 22 / 0;
        return unit;
    }
}
