package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda34 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ InAppPurchaseHistoryDetailViewModel f$0;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Function0 f$4;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda34(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, Function1 function1, Function0 function02) {
        this.f$0 = inAppPurchaseHistoryDetailViewModel;
        this.f$1 = cameraPresenceProviderExternalSyntheticLambda6;
        this.f$2 = function0;
        this.f$3 = function1;
        this.f$4 = function02;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Unit unitIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
            int i4 = 32 / 0;
        } else {
            unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        }
        int i5 = onNavigationEvent + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
