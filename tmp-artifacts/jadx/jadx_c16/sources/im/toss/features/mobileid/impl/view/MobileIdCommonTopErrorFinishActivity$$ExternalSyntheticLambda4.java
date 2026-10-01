package im.toss.features.mobileid.impl.view;

import im.toss.observability.instrumentation.memory.PssReader$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdCommonTopErrorFinishActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda4(MobileIdCommonTopErrorFinishActivity mobileIdCommonTopErrorFinishActivity, int i) {
        this.f$0 = mobileIdCommonTopErrorFinishActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonTopErrorFinishActivity mobileIdCommonTopErrorFinishActivity = this.f$0;
        int i4 = this.f$1;
        int iIntValue = ((Integer) obj2).intValue();
        Unit unit = (Unit) MobileIdCommonTopErrorFinishActivity.onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -254119998, new Object[]{mobileIdCommonTopErrorFinishActivity, Integer.valueOf(i4), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, 254120000, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i5 = onExtraCallbackWithResult + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
