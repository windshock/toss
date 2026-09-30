package im.toss.ads_sdk.ui.v2.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getWindowAreaStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda19 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda19(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i2) {
        this.f$0 = z;
        this.f$1 = fullPage;
        this.f$2 = f;
        this.f$3 = function1;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj3 = null;
        boolean z = this.f$0;
        NativeAdsDto.Creative.FullPage fullPage = this.f$1;
        float f = this.f$2;
        Function1 function1 = this.f$3;
        int i5 = this.f$4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i4 != 0) {
            getWindowAreaStatus.IAuthTabCallback(z, fullPage, f, function1, i5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj3.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = getWindowAreaStatus.IAuthTabCallback(z, fullPage, f, function1, i5, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i6 = onNavigationEvent + 99;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj3.hashCode();
        throw null;
    }
}
