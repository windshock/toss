package im.toss.appsintoss.iap.screen;

import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda5 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onExtraCallback = i3 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        if (i3 % 2 == 0) {
            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(str, str2, str3);
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(str, str2, str3);
        throw null;
    }
}
