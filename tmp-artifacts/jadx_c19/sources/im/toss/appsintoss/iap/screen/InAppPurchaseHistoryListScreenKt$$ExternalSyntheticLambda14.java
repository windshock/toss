package im.toss.appsintoss.iap.screen;

import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda14 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0 function0 = this.f$0;
        if (i4 != 0) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(function0);
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onNavigationEvent(function0);
        throw null;
    }
}
