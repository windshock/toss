package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda17 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback((String) obj, (String) obj2);
        int i5 = IAuthTabCallback + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }
}
