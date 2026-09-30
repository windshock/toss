package im.toss.ads_sdk.ui.v2.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getWindowAreaStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda18 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ float f$3;

    public /* synthetic */ NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda18(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f) {
        this.f$0 = function1;
        this.f$1 = fullPage;
        this.f$2 = z;
        this.f$3 = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return getWindowAreaStatus.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        getWindowAreaStatus.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
