package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda33 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$0;
    public final /* synthetic */ InAppPurchaseHistoryDetailViewModel f$1;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda33(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel) {
        this.f$0 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$1 = inAppPurchaseHistoryDetailViewModel;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1058768223, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1058768227);
        int i4 = onNavigationEvent + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
