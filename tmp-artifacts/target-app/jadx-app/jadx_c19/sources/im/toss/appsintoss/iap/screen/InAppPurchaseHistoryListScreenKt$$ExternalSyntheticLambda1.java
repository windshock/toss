package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onExtraCallback();
        int i5 = onExtraCallback + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return unitOnExtraCallback;
    }
}
