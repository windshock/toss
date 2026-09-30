package im.toss.feature.credit.ui.main.test;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = CreditTestActivity.onExtraCallback(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 25 / 0;
        } else {
            unitOnExtraCallback = CreditTestActivity.onExtraCallback(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
