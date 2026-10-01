package im.toss.features.bank.web;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.reportNoTrigger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FinishTossBankTransferSessionHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ FinishTossBankTransferSessionHandler$$ExternalSyntheticLambda0(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return reportNoTrigger.onExtraCallbackWithResult(str, this.f$1, (SetDetectableSize) obj);
        }
        reportNoTrigger.onExtraCallbackWithResult(str, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
