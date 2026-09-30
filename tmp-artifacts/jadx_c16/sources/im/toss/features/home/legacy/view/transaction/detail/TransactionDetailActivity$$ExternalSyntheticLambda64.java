package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSkeleonSymbol24;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda64 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TransactionDetailActivity.IAuthTabCallback(this.f$0, (getSkeleonSymbol24) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = TransactionDetailActivity.IAuthTabCallback(this.f$0, (getSkeleonSymbol24) obj);
        int i3 = IAuthTabCallback + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
