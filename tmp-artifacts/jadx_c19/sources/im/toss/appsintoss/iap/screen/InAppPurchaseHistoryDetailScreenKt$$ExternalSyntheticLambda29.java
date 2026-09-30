package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda29 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda29(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        this.f$0 = function2;
        this.f$1 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(this.f$0, this.f$1);
        int i5 = onNavigationEvent + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
