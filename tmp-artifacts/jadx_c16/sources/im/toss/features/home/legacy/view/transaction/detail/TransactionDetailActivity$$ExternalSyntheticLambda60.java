package im.toss.features.home.legacy.view.transaction.detail;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda60 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            TransactionDetailActivity.onWarmupCompleted(this.f$0, (ArrayList) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = TransactionDetailActivity.onWarmupCompleted(this.f$0, (ArrayList) obj);
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
