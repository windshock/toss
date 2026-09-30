package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.regexpCheck;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ regexpCheck.asInterface f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = regexpCheck.onNavigationEvent(this.f$0);
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
