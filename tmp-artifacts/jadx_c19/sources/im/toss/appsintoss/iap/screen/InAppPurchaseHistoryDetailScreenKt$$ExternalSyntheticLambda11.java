package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda11 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback((String) obj, (String) obj2);
        int i5 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
