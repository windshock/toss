package im.toss.features.mobileid.impl.setting;

import java.util.List;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda1(MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity, List list) {
        this.f$0 = mobileIdVerifyHistoryActivity;
        this.f$1 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity = this.f$0;
        if (i3 != 0) {
            return MobileIdVerifyHistoryActivity.onWarmupCompleted(mobileIdVerifyHistoryActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        MobileIdVerifyHistoryActivity.onWarmupCompleted(mobileIdVerifyHistoryActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
