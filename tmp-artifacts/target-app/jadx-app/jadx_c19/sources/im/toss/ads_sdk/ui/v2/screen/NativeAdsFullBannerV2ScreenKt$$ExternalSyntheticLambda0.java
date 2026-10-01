package im.toss.ads_sdk.ui.v2.screen;

import android.content.res.Resources;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.addRearDisplayStatusListener;
import o.getBacktraceNote;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.setContentInsetsRelative;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ Resources f$11;
    public final /* synthetic */ long f$12;
    public final /* synthetic */ boolean f$13;
    public final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 f$14;
    public final /* synthetic */ long f$15;
    public final /* synthetic */ setContentInsetsRelative f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ long f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ Function0 f$9;

    public /* synthetic */ NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda0(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, long j, long j2, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j3, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j4) {
        this.f$0 = f;
        this.f$1 = f2;
        this.f$2 = setcontentinsetsrelative;
        this.f$3 = function2;
        this.f$4 = fullBanner;
        this.f$5 = j;
        this.f$6 = j2;
        this.f$7 = z;
        this.f$8 = z2;
        this.f$9 = function0;
        this.f$10 = z3;
        this.f$11 = resources;
        this.f$12 = j3;
        this.f$13 = z4;
        this.f$14 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.f$15 = j4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = addRearDisplayStatusListener.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = onNavigationEvent + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
