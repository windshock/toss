package im.toss.feature.credit.ui.main.report;

import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initMiniApp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditHighInterestComparisonActivity f$0;
    public final /* synthetic */ CreditHighInterestComparisonResponse.BottomSheetInfo f$1;

    public /* synthetic */ CreditHighInterestComparisonActivity$$ExternalSyntheticLambda13(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo) {
        this.f$0 = creditHighInterestComparisonActivity;
        this.f$1 = bottomSheetInfo;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = CreditHighInterestComparisonActivity.onExtraCallback(this.f$0, this.f$1, (initMiniApp.onWarmupCompleted) obj);
            int i3 = 41 / 0;
        } else {
            unitOnExtraCallback = CreditHighInterestComparisonActivity.onExtraCallback(this.f$0, this.f$1, (initMiniApp.onWarmupCompleted) obj);
        }
        int i4 = onWarmupCompleted + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
