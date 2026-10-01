package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda10 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(this.f$0);
            int i4 = 97 / 0;
        } else {
            unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.IAuthTabCallback(this.f$0);
        }
        int i5 = onExtraCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
