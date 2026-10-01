package im.toss.feature.credit.ui.kcbsurvey;

import android.view.View;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyHistoryActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(View) obj};
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        if (i3 != 0) {
            unit = (Unit) KcbSurveyHistoryActivity.IAuthTabCallback(-1956770006, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult4, 1956770013, iOnExtraCallbackWithResult3);
            int i4 = 34 / 0;
        } else {
            unit = (Unit) KcbSurveyHistoryActivity.IAuthTabCallback(-1956770006, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult4, 1956770013, iOnExtraCallbackWithResult3);
        }
        int i5 = onExtraCallback + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
