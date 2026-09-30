package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
