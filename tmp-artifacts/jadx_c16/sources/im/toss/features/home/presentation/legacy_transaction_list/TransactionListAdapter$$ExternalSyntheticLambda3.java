package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.regexpCheck;
import o.regexpCheck$asBinder;
import o.zzag;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda3 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ zzag f$0;
    public final /* synthetic */ regexpCheck.asInterface f$1;

    public /* synthetic */ TransactionListAdapter$$ExternalSyntheticLambda3(zzag zzagVar, regexpCheck.asInterface asinterface) {
        this.f$0 = zzagVar;
        this.f$1 = asinterface;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            regexpCheck.onExtraCallback(this.f$0, this.f$1, (AppNode) obj, (regexpCheck$asBinder) obj2);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = regexpCheck.onExtraCallback(this.f$0, this.f$1, (AppNode) obj, (regexpCheck$asBinder) obj2);
        int i3 = onWarmupCompleted + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
