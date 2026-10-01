package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.regexpCheck;
import o.replaceWildcardChar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ regexpCheck.asInterface f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        regexpCheck.asInterface asinterface = this.f$0;
        AppNode appNode = (AppNode) obj;
        if (i3 == 0) {
            return regexpCheck.onNavigationEvent(asinterface, appNode, (replaceWildcardChar) obj2);
        }
        regexpCheck.onNavigationEvent(asinterface, appNode, (replaceWildcardChar) obj2);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
