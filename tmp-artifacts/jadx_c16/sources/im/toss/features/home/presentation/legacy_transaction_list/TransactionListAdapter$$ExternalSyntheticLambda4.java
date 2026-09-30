package im.toss.features.home.presentation.legacy_transaction_list;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.regexpCheck;
import o.regexpCheck$onWarmupCompleted;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(AppNode) obj, (regexpCheck$onWarmupCompleted) obj2};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        if (i3 != 0) {
            return (Unit) regexpCheck.onExtraCallbackWithResult(iOnExtraCallback, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr, -1807339006, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback2, 1807339006);
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
