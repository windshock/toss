package im.toss.appsintoss.iap.screen;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapterListener;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda44 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MaxRewardedInterstitialAdapterListener f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, (setDividerDrawable) obj, (String) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, (setDividerDrawable) obj, (String) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
