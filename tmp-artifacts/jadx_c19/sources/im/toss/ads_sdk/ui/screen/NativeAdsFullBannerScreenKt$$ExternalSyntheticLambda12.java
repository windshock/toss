package im.toss.ads_sdk.ui.screen;

import android.content.res.Resources;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.setContentInsetsRelative;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ long f$10;
    public final /* synthetic */ boolean f$11;
    public final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 f$12;
    public final /* synthetic */ setContentInsetsRelative f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ Resources f$9;

    public /* synthetic */ NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda12(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        this.f$0 = f;
        this.f$1 = f2;
        this.f$2 = setcontentinsetsrelative;
        this.f$3 = function2;
        this.f$4 = fullBanner;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = function0;
        this.f$8 = z3;
        this.f$9 = resources;
        this.f$10 = j;
        this.f$11 = z4;
        this.f$12 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = IAuthTabCallback + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
