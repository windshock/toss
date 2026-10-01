package im.toss.feature.credit.ui.kcbsurvey;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyConfirmExitActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KcbSurveyConfirmExitActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unit = (Unit) KcbSurveyConfirmExitActivity.onExtraCallbackWithResult(1149543433, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -1149543433);
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
