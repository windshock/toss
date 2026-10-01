package im.toss.features.bank.web;

import java.util.concurrent.Callable;
import o.setValueZero;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankDecryptPayloadHandler$$ExternalSyntheticLambda0 implements Callable {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = setValueZero.IAuthTabCallback(this.f$0);
        int i4 = IAuthTabCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }
}
