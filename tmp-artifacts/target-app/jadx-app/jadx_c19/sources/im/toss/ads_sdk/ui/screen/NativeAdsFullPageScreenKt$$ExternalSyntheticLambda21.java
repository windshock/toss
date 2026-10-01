package im.toss.ads_sdk.ui.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda21 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 f$4;

    public /* synthetic */ NativeAdsFullPageScreenKt$$ExternalSyntheticLambda21(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        this.f$0 = function1;
        this.f$1 = fullPage;
        this.f$2 = z;
        this.f$3 = f;
        this.f$4 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
