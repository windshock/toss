package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) obj);
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
        int i6 = onExtraCallback + 39;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }
}
