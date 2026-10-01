package im.toss.appsintoss.iap.screen;

import kotlin.jvm.functions.Function1;
import o.ResourceManagerInternalAsldcInflateDelegate;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.setDividerPadding;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda43 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        setDividerPadding setdividerpadding = (setDividerPadding) obj;
        if (i3 % 2 != 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(setdividerpadding);
            obj2.hashCode();
            throw null;
        }
        ResourceManagerInternalAsldcInflateDelegate resourceManagerInternalAsldcInflateDelegateOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(setdividerpadding);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return resourceManagerInternalAsldcInflateDelegateOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
