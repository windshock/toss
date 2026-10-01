package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxAppOpenAdapterListener;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryListScreenKt$$ExternalSyntheticLambda11 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda56.onWarmupCompleted(this.f$0, (MaxAppOpenAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = onWarmupCompleted + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
