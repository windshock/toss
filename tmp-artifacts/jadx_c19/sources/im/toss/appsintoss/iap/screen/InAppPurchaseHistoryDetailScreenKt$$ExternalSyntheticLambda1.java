package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult((String) obj, (String) obj2);
        int i5 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
