package im.toss.ads_sdk.ui.v2.screen;

import androidx.compose.foundation.layout.RowScope;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addRearDisplayStatusListener;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda12(NativeAdsDto.Creative.FullBanner fullBanner, boolean z) {
        this.f$0 = fullBanner;
        this.f$1 = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            addRearDisplayStatusListener.onWarmupCompleted(this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnWarmupCompleted = addRearDisplayStatusListener.onWarmupCompleted(this.f$0, this.f$1, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
