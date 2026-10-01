package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda36 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$0;
    public final /* synthetic */ InAppPurchaseHistoryDetailViewModel f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda36(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        this.f$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$1 = inAppPurchaseHistoryDetailViewModel;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, this.f$1, (initSDK.onNavigationEvent) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, this.f$1, (initSDK.onNavigationEvent) obj);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }
}
