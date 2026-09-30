package im.toss.features.bank.web;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.reportNoCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CloseTossBankTransferWebHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CloseTossBankTransferWebHandler$$ExternalSyntheticLambda0(int i, String str, String str2) {
        this.f$0 = i;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = reportNoCallback.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
