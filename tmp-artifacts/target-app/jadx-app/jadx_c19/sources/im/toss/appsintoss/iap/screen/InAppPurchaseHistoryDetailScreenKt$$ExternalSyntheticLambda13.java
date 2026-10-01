package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda13 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback();
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitOnExtraCallback;
    }
}
