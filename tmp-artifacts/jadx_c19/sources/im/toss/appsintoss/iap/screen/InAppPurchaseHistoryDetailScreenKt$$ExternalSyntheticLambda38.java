package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda38 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, (initSDK.onNavigationEvent) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, (initSDK.onNavigationEvent) obj);
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
