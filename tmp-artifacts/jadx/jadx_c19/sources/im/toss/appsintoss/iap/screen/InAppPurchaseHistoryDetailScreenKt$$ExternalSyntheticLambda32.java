package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda32 implements setTaggedAddrCtrl {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function2 f$10;
    public final /* synthetic */ setParentLayoutDirection f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ Function2 f$4;
    public final /* synthetic */ Function2 f$5;
    public final /* synthetic */ Function1 f$6;
    public final /* synthetic */ Function2 f$7;
    public final /* synthetic */ Function0 f$8;
    public final /* synthetic */ Function2 f$9;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda32(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, boolean z, setParentLayoutDirection setparentlayoutdirection, Function2 function2, Function2 function22, Function2 function23, Function1 function1, Function2 function24, Function0 function0, Function2 function25, Function2 function26) {
        this.f$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$1 = z;
        this.f$2 = setparentlayoutdirection;
        this.f$3 = function2;
        this.f$4 = function22;
        this.f$5 = function23;
        this.f$6 = function1;
        this.f$7 = function24;
        this.f$8 = function0;
        this.f$9 = function25;
        this.f$10 = function26;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
