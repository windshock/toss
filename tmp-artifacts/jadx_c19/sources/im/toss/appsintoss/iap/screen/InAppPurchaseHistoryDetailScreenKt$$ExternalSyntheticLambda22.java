package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda22 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda22(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        this.f$0 = function2;
        this.f$1 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1);
        int i5 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
