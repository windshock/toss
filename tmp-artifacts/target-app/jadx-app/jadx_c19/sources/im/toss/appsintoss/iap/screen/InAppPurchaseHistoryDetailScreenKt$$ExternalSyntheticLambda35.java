package im.toss.appsintoss.iap.screen;

import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda35 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$0;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda35(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$1 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0, this.f$1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1174726365, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 1174726367);
        int i5 = onExtraCallbackWithResult + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
