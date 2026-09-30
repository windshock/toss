package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda23 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda23(boolean z, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = z;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(this.f$0, this.f$1);
        int i5 = onNavigationEvent + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
