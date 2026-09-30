package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.getSkeleonSymbol24;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;
    public final /* synthetic */ getSkeleonSymbol24 f$1;

    public /* synthetic */ TransactionDetailActivity$$ExternalSyntheticLambda11(TransactionDetailActivity transactionDetailActivity, getSkeleonSymbol24 getskeleonsymbol24) {
        this.f$0 = transactionDetailActivity;
        this.f$1 = getskeleonsymbol24;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = TransactionDetailActivity.onWarmupCompleted(this.f$0, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
