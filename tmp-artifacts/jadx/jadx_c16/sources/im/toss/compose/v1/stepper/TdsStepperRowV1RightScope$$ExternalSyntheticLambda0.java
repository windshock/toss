package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppLovinNativeAdImplExternalSyntheticLambda11;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.resumeAnimation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1RightScope$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ resumeAnimation f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent f$3;
    public final /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda11 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ TdsStepperRowV1RightScope$$ExternalSyntheticLambda0(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11, int i, int i2) {
        this.f$0 = resumeanimation;
        this.f$1 = str;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = onnavigationevent;
        this.f$4 = appLovinNativeAdImplExternalSyntheticLambda11;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = resumeAnimation.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unitOnNavigationEvent;
    }
}
