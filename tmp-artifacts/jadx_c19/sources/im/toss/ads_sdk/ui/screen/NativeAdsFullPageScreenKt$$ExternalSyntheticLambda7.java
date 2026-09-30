package im.toss.ads_sdk.ui.screen;

import kotlin.jvm.functions.Function1;
import o.SessionProcessorCaptureCallback;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutions;
import o.removeObserverLocked;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$1;

    public /* synthetic */ NativeAdsFullPageScreenKt$$ExternalSyntheticLambda7(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2) {
        this.f$0 = getsupportedhighspeedresolutions;
        this.f$1 = getsupportedhighspeedresolutions2;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = this.f$0;
        if (i4 == 0) {
            return WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(getsupportedhighspeedresolutions, this.f$1, (SessionProcessorCaptureCallback) obj);
        }
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(getsupportedhighspeedresolutions, this.f$1, (SessionProcessorCaptureCallback) obj);
        int i5 = 20 / 0;
        return removeobserverlockedOnExtraCallbackWithResult;
    }
}
