package im.toss.compose.v1.stepper;

import kotlin.jvm.functions.Function2;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.resumeAnimation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1RightScope$$ExternalSyntheticLambda4 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ resumeAnimation f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent f$3;
    public final /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult f$4;
    public final /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ TdsStepperRowV1RightScope$$ExternalSyntheticLambda4(resumeAnimation resumeanimation, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, int i, int i2) {
        this.f$0 = resumeanimation;
        this.f$1 = str;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = onnavigationevent;
        this.f$4 = onextracallbackwithresult;
        this.f$5 = onwarmupcompleted;
        this.f$6 = i;
        this.f$7 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return resumeAnimation.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        resumeAnimation.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
