package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getBacktraceNote;
import o.y1b;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Integer f$1;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda7(String str, Integer num) {
        this.f$0 = str;
        this.f$1 = num;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallbackWithResult(this.f$0, this.f$1, (y1b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i5 = IAuthTabCallback + 105;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
