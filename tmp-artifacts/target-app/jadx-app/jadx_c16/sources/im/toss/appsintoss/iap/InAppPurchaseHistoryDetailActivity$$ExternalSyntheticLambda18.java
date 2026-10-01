package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda18 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ InAppPurchaseHistoryDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            InAppPurchaseHistoryDetailActivity.onWarmupCompleted(this.f$0, (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = InAppPurchaseHistoryDetailActivity.onWarmupCompleted(this.f$0, (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) obj);
        int i3 = onNavigationEvent + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
