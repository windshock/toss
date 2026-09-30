package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda8 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback();
        int i5 = onWarmupCompleted + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
