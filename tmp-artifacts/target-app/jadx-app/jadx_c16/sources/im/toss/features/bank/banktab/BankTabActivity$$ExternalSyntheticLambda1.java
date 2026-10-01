package im.toss.features.bank.banktab;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankTabActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Ref.IntRef f$2;

    public /* synthetic */ BankTabActivity$$ExternalSyntheticLambda1(List list, int i, Ref.IntRef intRef) {
        this.f$0 = list;
        this.f$1 = i;
        this.f$2 = intRef;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        if (i3 != 0) {
            return BankTabActivity.onWarmupCompleted(list, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitOnWarmupCompleted = BankTabActivity.onWarmupCompleted(list, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 20 / 0;
        return unitOnWarmupCompleted;
    }
}
