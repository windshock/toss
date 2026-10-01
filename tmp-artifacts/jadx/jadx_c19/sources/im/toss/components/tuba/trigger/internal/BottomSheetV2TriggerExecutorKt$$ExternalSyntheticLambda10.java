package im.toss.components.tuba.trigger.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.OkHttpNetworkFetcherExternalSyntheticLambda6;
import o.getBacktraceNote;
import o.u3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda10 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ BottomSheetV2TriggerExecutorKt$$ExternalSyntheticLambda10(String str, Function0 function0) {
        this.f$0 = str;
        this.f$1 = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnExtraCallback = OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallback(this.f$0, this.f$1, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = 58 / 0;
        } else {
            unitOnExtraCallback = OkHttpNetworkFetcherExternalSyntheticLambda6.onExtraCallback(this.f$0, this.f$1, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i5 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }
}
