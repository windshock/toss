package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.MaxRewardedInterstitialAdapterListener;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onNavigationEvent(this.f$0, (MaxRewardedInterstitialAdapterListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = IAuthTabCallback + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }
}
