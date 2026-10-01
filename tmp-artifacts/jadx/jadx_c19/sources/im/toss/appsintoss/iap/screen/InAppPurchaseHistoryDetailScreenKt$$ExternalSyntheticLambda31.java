package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda31 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailViewModel f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, (String) obj);
            int i4 = 87 / 0;
        } else {
            unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult(this.f$0, (String) obj);
        }
        int i5 = onWarmupCompleted + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
