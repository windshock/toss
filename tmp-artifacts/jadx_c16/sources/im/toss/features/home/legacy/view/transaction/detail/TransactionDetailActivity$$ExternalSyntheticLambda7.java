package im.toss.features.home.legacy.view.transaction.detail;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSkeleonSymbol24;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;
    public final /* synthetic */ getSkeleonSymbol24 f$1;

    public /* synthetic */ TransactionDetailActivity$$ExternalSyntheticLambda7(TransactionDetailActivity transactionDetailActivity, getSkeleonSymbol24 getskeleonsymbol24) {
        this.f$0 = transactionDetailActivity;
        this.f$1 = getskeleonsymbol24;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity transactionDetailActivity = this.f$0;
        if (i3 != 0) {
            return TransactionDetailActivity.onExtraCallbackWithResult(transactionDetailActivity, this.f$1, (DialogInterface) obj);
        }
        Unit unitOnExtraCallbackWithResult = TransactionDetailActivity.onExtraCallbackWithResult(transactionDetailActivity, this.f$1, (DialogInterface) obj);
        int i4 = 73 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
