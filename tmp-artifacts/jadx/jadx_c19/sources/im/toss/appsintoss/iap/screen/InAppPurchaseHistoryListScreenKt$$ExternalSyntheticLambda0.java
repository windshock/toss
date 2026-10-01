package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        onExtraCallback = i3 % 128;
        Object obj4 = null;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i3 % 2 != 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onExtraCallback(str, str2, (String) obj3);
            obj4.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onExtraCallback(str, str2, (String) obj3);
        int i4 = onExtraCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj4.hashCode();
        throw null;
    }
}
