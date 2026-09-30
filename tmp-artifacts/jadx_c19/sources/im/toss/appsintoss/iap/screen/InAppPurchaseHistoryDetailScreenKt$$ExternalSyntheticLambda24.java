package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda24 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda24(Function2 function2, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function1 function1) {
        this.f$0 = function2;
        this.f$1 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$2 = function1;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
