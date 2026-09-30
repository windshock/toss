package im.toss.features.home.legacy.view.transaction.detail;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda53 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            TransactionDetailActivity.onExtraCallback(this.f$0, (List) obj);
            throw null;
        }
        Unit unitOnExtraCallback = TransactionDetailActivity.onExtraCallback(this.f$0, (List) obj);
        int i3 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
