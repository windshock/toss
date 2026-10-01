package im.toss.appsintoss.iap.screen;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda26 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda26(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        this.f$0 = function2;
        this.f$1 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function2 function2 = this.f$0;
        if (i4 == 0) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(function2, this.f$1);
        }
        int i5 = 19 / 0;
        return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(function2, this.f$1);
    }
}
