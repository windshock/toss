package im.toss.feature.credit.ui.quiz.qna;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.access;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditQuizActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditQuizActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditQuizActivity creditQuizActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 != 0) {
            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
            return (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1813102142, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, dialogInterface}, -1813102135);
        }
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Unit unit = (Unit) CreditQuizActivity.onNavigationEvent(access.IAuthTabCallbackStubProxy.IAuthTabCallback(), 1813102142, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{creditQuizActivity, dialogInterface}, -1813102135);
        int i4 = 82 / 0;
        return unit;
    }
}
