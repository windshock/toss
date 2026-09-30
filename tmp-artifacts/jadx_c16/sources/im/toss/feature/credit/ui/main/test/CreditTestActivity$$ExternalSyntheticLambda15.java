package im.toss.feature.credit.ui.main.test;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda15 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditTestActivity.onWarmupCompleted(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
