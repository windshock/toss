package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MeteringRepeatingSessionExternalSyntheticLambda0 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsFullPageScreenKt$$ExternalSyntheticLambda2(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, String str) {
        this.f$0 = meteringRepeatingSessionExternalSyntheticLambda0;
        this.f$1 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
