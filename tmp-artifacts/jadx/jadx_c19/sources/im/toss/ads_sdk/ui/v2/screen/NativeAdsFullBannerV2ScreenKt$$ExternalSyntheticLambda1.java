package im.toss.ads_sdk.ui.v2.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addRearDisplayStatusListener;
import o.deleteProfile;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ deleteProfile f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Function2 f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda1(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i2) {
        this.f$0 = fullBanner;
        this.f$1 = z;
        this.f$2 = f;
        this.f$3 = deleteprofile;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$6 = function2;
        this.f$7 = function0;
        this.f$8 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = addRearDisplayStatusListener.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
