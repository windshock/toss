package im.toss.features.mobileid.impl.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$0;
    public final /* synthetic */ HighSpeedResolverExternalSyntheticLambda2 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda0(MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, int i) {
        this.f$0 = mobileIdVerifyHistoryActivity;
        this.f$1 = highSpeedResolverExternalSyntheticLambda2;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = MobileIdVerifyHistoryActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 16 / 0;
        } else {
            unitOnNavigationEvent = MobileIdVerifyHistoryActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unitOnNavigationEvent;
    }
}
