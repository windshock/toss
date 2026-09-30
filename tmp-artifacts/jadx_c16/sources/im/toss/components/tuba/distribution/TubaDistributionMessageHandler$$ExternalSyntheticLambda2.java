package im.toss.components.tuba.distribution;

import kotlin.jvm.functions.Function1;
import o.UtilsKtExternalSyntheticLambda15;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TubaDistributionMessageHandler$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 != 0) {
            return UtilsKtExternalSyntheticLambda15.onExtraCallback(setonoutofmemeryerrorcallback, th);
        }
        UtilsKtExternalSyntheticLambda15.onExtraCallback(setonoutofmemeryerrorcallback, th);
        throw null;
    }
}
