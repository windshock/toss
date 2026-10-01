package im.toss.features.fx;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxWebViewActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 == 0) {
            return FxWebViewActivity.onExtraCallbackWithResult(th);
        }
        FxWebViewActivity.onExtraCallbackWithResult(th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
