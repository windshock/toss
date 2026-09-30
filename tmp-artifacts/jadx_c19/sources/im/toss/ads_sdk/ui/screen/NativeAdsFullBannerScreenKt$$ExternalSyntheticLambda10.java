package im.toss.ads_sdk.ui.screen;

import androidx.compose.foundation.layout.RowScope;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda10 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda10(NativeAdsDto.Creative.FullBanner fullBanner, boolean z) {
        this.f$0 = fullBanner;
        this.f$1 = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = onWarmupCompleted + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }
}
