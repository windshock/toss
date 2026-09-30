package im.toss.ads_sdk.ui.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda22 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ NativeAdsFullPageScreenKt$$ExternalSyntheticLambda22(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i2) {
        this.f$0 = z;
        this.f$1 = fullPage;
        this.f$2 = f;
        this.f$3 = function1;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
