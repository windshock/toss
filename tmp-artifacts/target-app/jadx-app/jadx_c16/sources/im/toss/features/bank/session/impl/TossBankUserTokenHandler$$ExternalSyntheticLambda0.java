package im.toss.features.bank.session.impl;

import kotlin.jvm.functions.Function1;
import o.access102;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankUserTokenHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ TossBankUserTokenHandler$$ExternalSyntheticLambda0(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return access102.onExtraCallbackWithResult(str, this.f$1, (startRunning) obj);
        }
        access102.onExtraCallbackWithResult(str, this.f$1, (startRunning) obj);
        throw null;
    }
}
