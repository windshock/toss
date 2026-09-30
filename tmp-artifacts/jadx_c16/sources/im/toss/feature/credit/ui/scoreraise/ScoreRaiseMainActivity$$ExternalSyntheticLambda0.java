package im.toss.feature.credit.ui.scoreraise;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScoreRaiseMainActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ScoreRaiseMainActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ScoreRaiseMainActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = ScoreRaiseMainActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
