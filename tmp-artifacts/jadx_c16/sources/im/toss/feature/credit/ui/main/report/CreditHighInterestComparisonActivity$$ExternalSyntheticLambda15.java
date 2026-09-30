package im.toss.feature.credit.ui.main.report;

import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonActivity$$ExternalSyntheticLambda15 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditHighInterestComparisonActivity f$0;
    public final /* synthetic */ CreditHighInterestComparisonResponse f$1;

    public /* synthetic */ CreditHighInterestComparisonActivity$$ExternalSyntheticLambda15(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse creditHighInterestComparisonResponse) {
        this.f$0 = creditHighInterestComparisonActivity;
        this.f$1 = creditHighInterestComparisonResponse;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) CreditHighInterestComparisonActivity.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 16946347, -16946342, iOnExtraCallback);
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
