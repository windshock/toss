package im.toss.appsintoss.iap.screen;

import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda42 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0 function0 = this.f$0;
        if (i4 != 0) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onWarmupCompleted(function0);
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onWarmupCompleted(function0);
        throw null;
    }
}
