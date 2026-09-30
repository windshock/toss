package im.toss.features.bank.banktab;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankTabActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Ref.IntRef f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ BankTabActivity$$ExternalSyntheticLambda7(Ref.IntRef intRef, List list) {
        this.f$0 = intRef;
        this.f$1 = list;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            BankTabActivity.onExtraCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = BankTabActivity.onExtraCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
