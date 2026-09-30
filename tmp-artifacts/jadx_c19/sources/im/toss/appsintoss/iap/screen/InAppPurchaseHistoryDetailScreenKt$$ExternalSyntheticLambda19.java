package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda19 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda19(setParentLayoutDirection setparentlayoutdirection, Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = function2;
        this.f$2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
        int i5 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
