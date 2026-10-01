package im.toss.appsintoss.iap.screen;

import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailViewModel;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda37 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ InAppPurchaseHistoryDetailViewModel f$0;
    public final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Function0 f$4;

    public /* synthetic */ InAppPurchaseHistoryDetailScreenKt$$ExternalSyntheticLambda37(InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Function0 function0, Function1 function1, Function0 function02) {
        this.f$0 = inAppPurchaseHistoryDetailViewModel;
        this.f$1 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.f$2 = function0;
        this.f$3 = function1;
        this.f$4 = function02;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = this.f$0;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = this.f$1;
        if (i4 != 0) {
            Object[] objArr = {inAppPurchaseHistoryDetailViewModel, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, this.f$2, this.f$3, this.f$4, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -837590048, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, 837590059);
        }
        Object[] objArr2 = {inAppPurchaseHistoryDetailViewModel, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, this.f$2, this.f$3, this.f$4, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int i5 = 78 / 0;
        return (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -837590048, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 837590059);
    }
}
